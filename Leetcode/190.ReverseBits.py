def reversebits(n):
    bit_str = '{0:032b}'.format(n)
    print(bit_str)
    reverse_str = bit_str[::-1]
    return int(reverse_str,2)

def reverseBits_1(n):
    reversed = 0
    for i in range(32):
        reversed = reversed << 1
        print((n >> i) & 0x1)
        reversed |= (n >> i) & 0x1
    return reversed

if __name__ =='__main__':
    print(reverseBits_1(3221225472))
