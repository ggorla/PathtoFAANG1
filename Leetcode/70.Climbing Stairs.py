def climbstairs(n):
    steps = [1,1]
    for i in range(2,n+1):
        steps.append(steps[i-1]+steps[i-2])
    return steps[n]

def climbstairs_1(n):
	curr = prev = 1
	for _ in range(n-1):
		curr, prev = curr + prev, curr
	return curr


if __name__ == "__main__":
    print(climbstairs(3))