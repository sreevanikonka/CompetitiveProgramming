from operator import itemgetter
e=[(0,1),(3,5),(4,8),(10,12),(9,10)]
if len(e)<=1:
	print(e)
e=sorted(e,key=itemgetter(0))
a=[e[0]]
for (start,end) in e:
	(start1,end1)=a[-1]
	if start<=end1:
		if end1<=end:
			end1=end
		a[-1]=(start1,end1)
	else:
		a.append((start,end))
print(a);
