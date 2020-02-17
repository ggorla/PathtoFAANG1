def coinChange(coins, amount):
    if not amount:return 0

    min_coins = [0]+[float('inf')]*amount
    
    for c in coins:
    
        for i in range(c,amount+1):
            #print(range(c,amount+1))
            print(min_coins)
            min_coins[i] = min(min_coins[i], min_coins[i-c]+1)
            #print(min_coins)
    return min_coins[-1] if min_coins[-1] != float('inf') else -1

def coinChange_1(coins,amount):
    dp = [0]*(amount+1)
    print(dp)
    for i in range(1,amount+1):
        print(i)
        if i in coins:
            dp[i] = 1
            continue
        print(dp)
        min_coins =  float('inf')
        for coin in coins:
            if i-coin>0:
                min_coins = min(dp[i-coin],min_coins)
            dp[i] = min_coins+1
    print(dp)
    if dp[-1] == float('inf'):
        return -1
    return dp[-1]
    



arra = [1,1,4]
print(coinChange(arra,4))