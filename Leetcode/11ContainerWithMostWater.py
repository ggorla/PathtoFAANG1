
# @return an integer
def maxArea(height):
    left=0
    right=len(height)-1
    result=0
    while left<right:
     
        result=max(result,(right-left)*min(height[left],height[right]))
        if  height[left]<height[right]:
            left+=1
            print('in hear')
        else:
            right-=1
            print("not here")
    
    return result


if __name__ == "__main__":
    lst = [1,2,3,5]
    print(maxArea(lst))