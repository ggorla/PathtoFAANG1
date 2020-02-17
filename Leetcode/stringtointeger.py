class Solution:
    # @return an integer
   
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        INT_MAX =  2147483647
        INT_MIN = -2147483648
        result = 0
        
        if not str:
            return result
        
        i = 0
        while i < len(str) and str[i] == " ": # remove empty spaces
            i += 1
       
        sign = 1
        if str[i] == "+":
            i += 1
        elif str[i] == "-":
            sign = -1
            i += 1
       
        while i < len(str) and str[i] >= '0' and str[i] <= '9':
            print(ord('0'))# overflow 
            if result > (INT_MAX - (ord(str[i]) - ord('0'))) / 10: 
                #0> 2147483648 - 49-48/10
                print(' in here ')
                return INT_MAX if sign > 0 else INT_MIN
           
            result = result * 10 + ord(str[i]) - ord('0')
            # 0*10 +49-48
            print(result)
            i += 1
        
        return sign * result


s = Solution()
print(s.myAtoi('2321321321312312312 '))