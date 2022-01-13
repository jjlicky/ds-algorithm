def solution(lottos, win_nums):
    rank = [6,6,5,4,3,2,1]
    zero = 0
    cnt = 0
    
    for i in lottos:
        if i==0:
            zero+=1
            continue
        for j in win_nums:
            if j==i:
                cnt+=1
                break
    
    answer = [rank[cnt+zero],rank[cnt]]
    return answer
