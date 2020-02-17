#1,2,3,......12
# k = 12
# so now retun squer root for 12 which is >3 which is 9 and <4 which is 16

k =99
def integoer_square_root(K):
    low = 0
    high  = k

    while low <= high:
        mid = (low+high)//2
        mid_squared = mid*mid
        
        if mid_squared<=k:
            low = mid+1
        else:
            high= mid-1 
    return low -1

print(integoer_square_root(k))