# 영어로 되어 있는 문자열이 있을 때, 이 문자열에서 반복되지 않는 첫번째 문자를 반환하시오. 만약 그런 문자가 없다면 _ 를 반환하시오.
# 1. 알파벳 빈도 수를 찾는다.
# 2. 빈도 수가 1인 알파벳 중에서 string에서 어떤 게 먼저 나왔는지 찾아본다.

input = "abadabac"


def find_not_repeating_first_character(string):
    alphabet_occurrence_array = [0] * 26

    for char in string:
        if char.isalpha():
            alphabet_occurrence_array[ord(char) - ord('a')] += 1

    not_repeating_character_array = []
    for index in range(len(alphabet_occurrence_array)):
        if alphabet_occurrence_array[index] == 1:
            not_repeating_character_array.append(chr(index + ord('a')))
    for char in string:
        if char in not_repeating_character_array:
            return char

    return '-'


result = find_not_repeating_first_character
print("정답 = d 현재 풀이 값 =", result("abadabac"))
print("정답 = c 현재 풀이 값 =", result("aabbcddd"))
print("정답 = _ 현재 풀이 값 =", result("aaaaaaaa"))
