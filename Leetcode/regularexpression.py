class solution:
    def ismatch(self,text, pattern):
        if not pattern:
            return not text
        first_match = bool(text) and pattern[0] in {text[0],'.'}
        print(text[0])
        if len(pattern)>=2 and pattern[1] =='*':
            return (self.ismatch(text,pattern[2:]) or first_match and self.ismatch(text[1:], pattern))
        else:
            return first_match and self.ismatch(text[1:],pattern[1:])
        

s = solution()
print(s.ismatch('acbb','acb*'))