# Java Collections

## Arrays (Resize)
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


General Methods
- int size();
- boolean isEmpty();
- boolean contains(Object);
- Iterator iterator();
- Object[] toArray();
- boolean add(Object);
- boolean remove(Object);
- void clear();

### ArrayList
ArrayList al=new ArrayList();
al.add("ali");
al.add(“ayse");
al.add(“veli"); 
al.add(“9765");
al.add(0,”mehmet”); //If index not specified it will use default indexing
Object dene[]=al.toArray();

al.set(); 
al.clear(); //clear all elements
al.remove(int);
al.remove(object);

### LinkedList

- Sequential 
- Duplicates are allowed
If elements are often updated better to use LinkedList than arrayList
Methods:
- Object get(int);
- Object set(int, Object);
- int indexOf(Object);
- int lastIndexOf(Object);
- void add(int, Object);
- Object remove(int);


LinkedList abc=new LinkedList();
- abc.removeFirst() ;
- abc.removeLast();
- abc.get(index i);
- abc.get(2).hashCode();

### HashSet
- Not Sequential 
- Duplicates are not allowed
- Doesnt have a get method
- get() metodu bulunmaz!!
- Iterators can be used
### LinkedHashSet
- Similar but sequential 
```
LinkedHashSet lhs=new LinkedHashSet();		
lhs.add(“apple");
lhs.add(“orange");
System.out.println (lhs);
Iterator i=lhs.iterator();
while (i.hasNext()){		
System.out.println (i.next());
} 
```




















