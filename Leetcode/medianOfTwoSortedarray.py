class solution:
    def median(self, arr1,arr2):
        combined = sorted(arr1+arr2)
        if len(combined)%2==0:
            n = len(combined)//2
            return (combined[n-1]+combined[n])/2
        else:
            n =(len(combined)//2)  +1
            return combined[n-1]