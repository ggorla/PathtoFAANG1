def insert1(intervals, newinterval):
    
    
    result=[]
    for interval in intervals:
        if not result or result[-1][1]<interval[0]:
            result.append(interval)
        else:
            result[-1][1] = max(result[-1][1],interval[1])
    return result


if __name__ == "__main__":
    intervals = [[1,4],[4,5]]
    newInterval = [4,10]
    #print(insert1(intervals,newInterval))
    print(insert1(intervals,newInterval))