from typing import List

def read_integers() -> List[int]:
    ui = []
    user_input = input().split(",")
    for item in user_input:
        ui.append(int(item))
    return ui

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
