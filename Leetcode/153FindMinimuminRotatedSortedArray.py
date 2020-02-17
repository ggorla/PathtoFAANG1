import timeit
class solution():
    def findMin(self,nums):
        n = len(nums)
        if n == 0:
            return None
        if n == 1:
            
            return nums[-1]
        mid = n // 2
        if nums[0] < nums[mid]:
            if nums[-1] >= nums[mid]:
                return self.findMin(nums[:mid])
            return self.findMin(nums[mid + 1:])
        
        else:
            if nums[mid - 1] > nums[mid]:
                return nums[mid]
            print(nums[mid])
            return self.findMin(nums[:mid])

if __name__ == "__main__":
    print(solution().findMin([3, 4, 0,  1,2,3]))