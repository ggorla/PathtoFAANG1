class solution:
    def buysell( self, prices):
        #profit, maximum = 0, 0
        #for prev, curr in zip(prices, prices[1:]):
         #   profit += curr - prev
          #  maximum = max(profit, maximum)
           # profit = max(profit, 0)
            
        #return maximum
        
        
        #min_val = min(list1)
        #list2 = list1[list1.index(min_val):]
        #max_val = max(list2)
        #profit  = max_val-min_val
        #print(profit)

        change = [prices[i+1]-prices[i] for i in range(len(prices)-1)]
       
        max_earn = possible_earn = change[0]
        #1 1 -1 3 1
        # max_earn = possible_earn =1 
        
        for i in range(1, len(change)):
            if possible_earn>=0:
                possible_earn+=change[i]
            else:
                possible_earn=change[i]
            if max_earn <possible_earn:
                max_earn = possible_earn
           
        return max_earn

s = solution()
lst = [1,2,3,2,5,4]
print(s.buysell(lst))