def insert1(intervals):
    
    intervals.sort()
    #[[1, 2], [1, 3], [2, 3], [3, 4]]
    result = []
    count =0
    for interval in intervals:

        if not result or result[-1][1]<=interval[0]:
            result.append(interval)
            print(result)
        else:
            count +=1
    
        print(count)

if __name__ == "__main__":
    intervals = [[1,2],[2,3],[3,4],[1,3]]
    newInterval = [4,10]
    #print(insert1(intervals,newInterval))
    print(insert1(intervals))