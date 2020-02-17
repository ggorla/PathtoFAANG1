def getsum(a,b):
    carry = 0
    mask = 0xffffffff
    
    while b & mask != 0:
        
        carry = (a & b) << 1
        a = a ^ b       
        b = carry       
        print("a"+str(carry))
        # 2 0010
        # 3 0011
        # a& b = 0011
        # a ^b = 0010
        # a & b <<1 = 0110 is 5
    # for overflow condition like
    # -1
    #  1
    return a&mask if b > mask else a
	

if __name__ == "__main__":
    a = 2
    b = 3
    print(getsum(a,b))