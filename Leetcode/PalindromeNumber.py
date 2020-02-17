import math
class solution:
    def isPalindrome(self, x):
        if x < 0 :
            return False
        rtype = True
        original = x
        reverse = 0
        if x == 0:
            return rtype
        
        digits = math.floor(math.log(x, 10))
        
        while x > 0:
            print(divmod(x, 10))
            x, remainder = divmod(x, 10)
            reverse += remainder*pow(10,digits)
            #print(pow(10,digits))
            digits -= 1
        if reverse != original:
            rtype = False
        return rtype

s = solution()
print(s.isPalindrome(1231) )