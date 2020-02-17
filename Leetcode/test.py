class solution:
    def longeststring(str):
        d = []
        f = []
        for i in range(len(str)):
            if s[i] not in f:
                f+=s[i]
            else:
                if len(d)<len(f):
                    d = f

                f = f[f.index(s[i])+1::]+s[i]

        ret



s = solution()
s.longeststring("abcabsba")