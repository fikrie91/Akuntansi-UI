fst x
fst (a,b) = a

snd x
snd (a,b) = b

null  x
 | x == [] = True
 | otherwise = False

and  x
 | x == [True,True] = True
 | otherwise = False

or x
 | x == [True,True] = True
 | x == [True,False] = True
 | x == [False, True] = True
 | otherwise = False
