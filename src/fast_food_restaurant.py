def calc_dishes(dishes):
  dishes = ''.join(sorted(map(lambda x: str(min(x, 4)), dishes)))

  if (dishes == "000"):
    return 0
  if (dishes.startswith("00")):
    return 1
  if (dishes.startswith("01")):
    return 2
  if (dishes.startswith("0") or dishes.startswith("11")):
    return 3
  if (dishes >= "122" and dishes <= "222"):
    return 4
  if (dishes >= "223" and dishes <= "244"):
    return 5
  if (dishes.startswith("3")):
    return 6
  return 7

rounds = int(input())

for i in range(rounds):
  a, b, c = map(int, input().split())
  print(calc_dishes([a, b, c]))