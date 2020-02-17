def counbits(num):
    dp = [0]
    for i in range(1, num + 1):
        
        if i % 2 == 1:

            dp.append(dp[i - 1] + 1)
        else:
            dp.append(dp[i // 2])
    return dp

if __name__ == "__main__":
    print(counbits(6))