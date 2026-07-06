def remove_fourth_character(word: str) -> str:
    new_word = ""
    for i in range(len(word)):
        if (i != 3):
            new_word += word[i]
    return new_word



# do not modify below this line
print(remove_fourth_character("NeetCode"))
print(remove_fourth_character("Hello"))
