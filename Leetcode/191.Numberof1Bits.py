import collections

def hammingWeight(n):
    s = str(n)
    dic = collections.Counter(s)
    return dic['1']

    

if __name__ == "__main__":
    str1 = '00000000000000000000000000001011'
    print(hammingWeight(str1))