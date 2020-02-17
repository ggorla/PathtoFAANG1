class solution:
    def maximim(self,nums):
        #nums = [-2,1,3,4]
        for i in range(1,len(nums)):
            if nums[i-1]>0:     
                           
                nums[i] += nums[i-1]
                print(nums[i]) 
        
        #[-2, 1, -4, 8]
        return max(nums) 

s = solution()
lst = [-2,-1,5,-1,4]
print(s.maximim(lst))