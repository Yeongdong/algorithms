# 알파벳 빈도수 찾기
# 26개짜리 배열을 만든 후, 알파벳을 아스키코드로 인덱스화 시켜서 알파벳 빈도수를 업데이트한다.
# 인덱스가 가장 큰 알파벳을 문자화해서 반환한다.

def find_max_occurred_alphabet(string):
    alphabet_occurrence_array = [0] * 26

    for char in string:
        if char.isalpha():
            alphabet_occurrence_array[ord(char) - ord('a')] += 1

    max_occurrence = alphabet_occurrence_array[0]
    max_alphabet_index = 0
    for index in range(len(alphabet_occurrence_array)):
        if alphabet_occurrence_array[index] > max_occurrence:
            max_occurrence = alphabet_occurrence_array[index]
            max_alphabet_index = index
    return chr(max_alphabet_index + ord('a'))


result = find_max_occurred_alphabet
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))
