class solution:
    def duplicate(self, list1):
        if len(set(list1)) != len(list1):
            return True




s = solution()
print(s.duplicate([1,2,1,3,2,4]))