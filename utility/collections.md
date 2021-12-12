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
### TreeSet
- Adds alphabetically
- Faster access
tailSet(object); output= [apple,orange]


### Iterator
- Like loops similar to enumerations
- Methods are more advanced
- Has remove method
Methods
- boolean hasNext()
- Object next()
- void remove()

### ListIterator
Can move on both sides and at the same time can update
- hasPrevious(), previous()
- nextIndex(), previousIndex()
- set(Object), add(Object)

### HashTable
Enumaration and iterator can be used
- containsKey();
- containsValue();
Hashtable hashtable=new Hashtable();
hashtable.put(key,object value)
### HashMap
Similar to HashTable allow null values
### TreeMap
- Sequential



### Sorting&Shuffle
```
ArrayList sayi=new ArrayList();
for (int i = 1; i<50; i++) {
sayi.add(new Integer(i));
}
Collections.shuffle(sayi);
List sayi3=sayi.subList(0,6);
Collections.sort(sayi3);
System.out.println (sayi3);
```
### BinarySearch
```
ArrayList arraylist=new ArrayList();
arraylist.add("elma");
arraylist.add("limon");
int value=Collections.binarySearch(arraylist,"limon");
System.out.println (value);
```
### Collections.copy(dest,src)
```
LinkedList src=new LinkedList();
ArrayList dest=new ArrayList();
Collections.copy(dest,src)

```

### Arrays.asList()
```
Object myarray[]=new Object[2];
myarray[0]="hello";
myarray[1]="java";
List list = new LinkedList(Arrays.asList(myarray));
 list.add("python");    
 System.out.println (list); 

```

### Collections.unmodifiableList();
Readonly
```
List list=new LinkedList();
list.add("apple");
list.add("orange");
list = Collections.unmodifiableList(list);
list.add("sample"); //Error!
```
### intersection&Union
List list=new LinkedList();
List list2=new LinkedList();
***For intersection 
list.retainAll(list2);	
***For union 
list.addAll(list2);


### Comparator()
```
Object one="banana";
Object two="cherry";
List list=new LinkedList();
list.add(one);
list.add("two");

Collections.sort(list,new Comparator(){
public int compare(Object one, Object two) {
	if(one.equals(two)){
	System.out.println ("same!");
	}
	return 1;
	}});
	}
}

```











































