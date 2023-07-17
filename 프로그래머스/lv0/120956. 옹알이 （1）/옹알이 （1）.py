def solution(babbling):
    list = ["aya", "ye", "woo", "ma"]
    answer = 0
    for idx, babble in enumerate(babbling):
        for baba in list:
            if baba in babble:
                babbling[idx] = babbling[idx].replace(baba, " ")
                
    for babble in babbling:
        if len(babble.strip()) == 0:
            answer+= 1
    return answer