class solution():
    def reverse(self,x):
        flag = False
        x_char = str(x)

        if x_char[0] == '-':
            x_char = x_char[1:]
            flag = True
        #reverse the string
        rev = x_char[::-1]
        if flag:
            rev = '-'+rev
         #overflow   
        rev = int(rev)
        if rev> 2**31 - 1 or rev <-2**31:
            rev = 0
        return rev

s = solution()
print(s.reverse(123))