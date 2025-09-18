def calculate_worth(word):
    return sum(ord(ch) - ord('a') + 1 for ch in word)


def dfs(index, mask, cost, worth, strings, costs, worths, conflicts, budget, memo):
    if cost > budget:
        return float('-inf')
    if index == len(strings):
        return worth

    key = (index, mask, cost)
    if key in memo:
        return memo[key]

    # Option 1: skip this string
    best = dfs(index + 1, mask, cost, worth, strings, costs, worths, conflicts, budget, memo)

    # Option 2: take this string (if no conflict with already chosen ones)
    ok = True
    for j in range(len(strings)):
        if (mask & (1 << j)) and ((index, j) in conflicts or (j, index) in conflicts):
            ok = False
            break
    if ok:
        best = max(best, dfs(index + 1, mask | (1 << index),
                             cost + costs[index],
                             worth + worths[index],
                             strings, costs, worths, conflicts, budget, memo))

    memo[key] = best
    return best


def main():
    n, m = map(int, input().split())
    strings = input().split()
    costs = list(map(int, input().split()))

    conflicts = set()
    for _ in range(m):
        a, b = input().split()
        ai, bi = strings.index(a), strings.index(b)
        conflicts.add((ai, bi))
        conflicts.add((bi, ai))

    budget = int(input())
    worths = [calculate_worth(s) for s in strings]

    memo = {}
    ans = dfs(0, 0, 0, 0, strings, costs, worths, conflicts, budget, memo)
    print(ans)


if __name__ == "__main__":
    main()
