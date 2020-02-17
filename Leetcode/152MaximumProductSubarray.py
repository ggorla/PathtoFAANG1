class solution():
    def productsubarray(self, nums):
        
        #nums_reversed = nums[::-1]
        #for i in range(1, len(nums)):
        #    nums[i] *= nums[i - 1] 
        #    nums_reversed[i] *= nums_reversed[i - 1] 
       
        #return max(nums + nums_reversed)
        
        prev_min = prev_max = global_max = nums[0]
        for num in nums[1:]:
           
            minn  = min(num,prev_max*num, prev_min*num)
            maxx = max(num,prev_max*num,prev_min*num)
            prev_min, prev_max, global_max = minn,maxx,max(global_max,maxx)
           
        return global_max

s = solution()
#list1 = [-1,-2,1,3,3]
list1 = [2,3,-2,4]
print(s.productsubarray(list1))