class solution:
  def productexceptself(self, nums):
    length = len(nums)
    ans = [0]*length
    ans[0] = 1
    for i in range(1,length):
        ans[i] = nums[i-1]* ans[i-1]
    r = 1
    for i in reversed(range(length)):
        ans[i] = ans[i]*r
        r *= nums[i]
    return ans
s = solution()
list1 = [1,2,3,4]
print(s.productexceptself(list1))
