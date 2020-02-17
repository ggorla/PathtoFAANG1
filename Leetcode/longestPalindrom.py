class solution:
    def longestPalindrome(self, s):
        largestPalindrome = ""
        for i in range(len(s)):
            palindromeOdd = self.largestPalindromeAtIndex(s, i, i)
            print("2nd condtions")
            palindromeEven = self.largestPalindromeAtIndex(s, i, i + 1)
            largerPalindrome = palindromeOdd if len(palindromeOdd) > len(palindromeEven) else palindromeEven
            largestPalindrome = largestPalindrome if len(largestPalindrome) >= len(largerPalindrome) else largerPalindrome
            #print ("")
            #print ("odd:"+palindromeOdd)
            #print ("even:"+palindromeEven)
            #print (largerPalindrome)
            #print (largestPalindrome)

            print ("")
        return largestPalindrome

    def largestPalindromeAtIndex(self, s, left, right):
        leftIndex = 0
        rightIndex = 0
        while left >= 0 and right < len(s):
            if s[left] == s[right]:
                leftIndex = left                    #1 pass left =0
                rightIndex = right                  #1 pass right =0
                print("in if condition")
                print(s[left])
            else:
                
                
                break
            left -= 1                               
            right += 1
        print(left)
        print(right)
        return s[leftIndex:rightIndex+1]

s = solution()
print(s.longestPalindrome("google"))
