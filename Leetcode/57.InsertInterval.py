def insert1(intervals,newIntervals):
    intervals.append(newIntervals)
    intervals.sort()
    result =[]
    for interval in intervals:
        #[[1, 2], [3, 5], [4, 10], [6, 7], [8, 10], [12, 16]]
        print(interval[0])
        if not result or result[-1][1] < interval[0]:
            result.append(interval)         
        else:
            #set result last element to last visited with 2nd element hightest
            print(result)
            result[-1][1] = max(result[-1][1],interval[1])
            
    return result




if __name__ == "__main__":
    intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]]
    newInterval = [4,10]
    #print(insert1(intervals,newInterval))
    print(insert1(intervals,newInterval))