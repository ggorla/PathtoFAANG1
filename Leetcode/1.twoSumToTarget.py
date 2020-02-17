class solution:
    def twoSum(self,num,target):
        h = {}
        
        for i,num in enumerate(num):
            n= target-num
            if n not in h:
                h[num] = i
            else:
                return[h[n],i ]
s = solution()
a = [1,2,3,4,1,4]
b = 8
print(s.twoSum(a,b))