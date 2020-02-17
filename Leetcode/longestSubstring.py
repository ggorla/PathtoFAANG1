class Solution:
    def lenghofstring(self,s):
        d = ""
        f = ""
        
        for i in range(len(s)):
            #abcabsda
            # 1 pass        2 pass          3 pass      4 pass      5 pass
            # s[i] = a      s[i] = b        s[i] = c    s[i] = a    s[i] = b
            # f  = 0        f = a           f = ab      f = abc     f = bca


            #else  len(d) <len(f)   0<3
            # so d = abc
            # f.index(s[i]) = f.index(a) = 0+1
            # f = bc + a 
            #
            if s[i] not in f:
                f += s[i]
               
            else:
                print("f:")
                
                if len(d) < len(f):
                    d = f
                    print("test 11111")
                f = f[f.index(s[i])+1::] + s[i] 
                print(f)
              
        return max(len(d), len(f))


s = Solution()
print(s.lenghofstring("abcabsba"))