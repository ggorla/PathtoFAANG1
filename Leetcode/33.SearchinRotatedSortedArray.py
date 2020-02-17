
# def search(nums, target):
#     if not nums:
#         return -1
#     m, left, right = True, 0, len(nums) - 1
#     while m:
#         m = left + (right-left) // 2
#         if target == nums[m]:
#             return m
#         elif right - left < 3:
#             if nums[left] == target:
#                 return left
#             elif nums[right] == target:
#                 return right
#             else:
#                 return -1
#         if nums[m] > nums[left]:
#             if nums[left] <= target < nums[m]:
#                 right = m
#             else:
#                 left = m
#         else:
#             if nums[m] < target <= nums[right]:
#                 left = m
#             else:
#                 right = m

def search( nums, target):
	if not nums:
		return -1
	left, right = 0, len(nums)-1
	while left < right:
		mid = (left + right) // 2
		print(mid)
		if nums[mid] == target:
			return mid
		if nums[left] <= nums[mid]:
			if nums[left] <= target < nums[mid]:
				right = mid - 1
			else:
				left = mid + 1
		else:
			if nums[mid] < target <= nums[right]:
				left = mid + 1
			else:
				right = mid - 1
	if target == nums[left]:
		return left
	return -1

if __name__ == "__main__":
    lst =[0,1,4,5,6,7,8,9]
    tgt = 1
    print(search(lst,tgt))