## Java Collections

Arrays (Resize)
```
int dizi[];
dizi=new int[5];
for (int i = 0; i<5; i++) {
	dizi[i]=i;
}

int yenidizi[]=new int[10];
for (int i2 = 5; i2<10; i2++) {
System.arraycopy(dizi,0,yenidizi,0,5);
yenidizi[i2]=i2;
}	

int  boy=yenidizi.length;
for (int say = 5; say<boy; say++) {
System.out.println (yenidizi[say]);
```
