# Q 1. 입력으로 소문자의 알파벳 순으로 정렬된 문자열이 입력됩니다.
# 2. 각 알파벳은 중복이 가능합니다.
# 3. 중간에 없는 알파벳이 있을 수도 있습니다.
#
# 입,출력 예시와 같이 입력 문자열에 나타나는 각 알파벳의 종류,갯수를 요약하여 나타내시오.
# ================
# 1. 각 알파벳의 갯수를 담는 배열을 만들어 각 알파벳의 갯수를 담는다.
# 2. 0보다 큰 배열을 정답 배열에 넣는다.
# 3. '/'를 join하여 정답을 완성시킨다.

def summarize_string_my_solution(input_str):
    character_array = [0] * 26

    for i in input_str:
        character_array[ord(i) - 97] += 1

    result = []
    for i in range(len(character_array)):
        if character_array[i] > 0:
            result.append(chr(i + 97) + str(character_array[i]))

    return '/'.join(result)


input_str = "acccdeee"

print(summarize_string_my_solution(input_str))


def summarize_string(target_string):
    # 이 부분을 채워보세요!
    n = len(target_string)
    count = 0
    result_str = ''

    for i in range(n - 1):
        if target_string[i] == target_string[i + 1]:
            count += 1
        else:
            result_str += target_string[i] + str(count + 1) + '/'
            count = 0

    result_str += target_string[n - 1] + str(count + 1)

    return result_str


input_str = "acccdeee"

print(summarize_string(input_str))
