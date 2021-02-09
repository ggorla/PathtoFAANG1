package HashTable;

public class SimpleHashTable {


    private StoredEmployee[] hashTable;
    private int hashKey(String key){
        return key.length()% hashTable.length;
    }
    public SimpleHashTable(){
        hashTable = new StoredEmployee[10];
    }

    public void push (String key, Employee employee){
        int hashedKey = hashKey(key);
        if(isOccupied(hashedKey)){
            int stopIndex =hashedKey;
            if(hashedKey == hashTable.length-1){
                hashedKey = 0;
            }else
                hashedKey++;
            while(isOccupied(hashedKey)&& hashedKey!=stopIndex){
                hashedKey = (hashedKey+1)%hashTable.length;
            }

        }
        if(isOccupied(hashedKey)){
            System.out.println("Element present at the value:"+ hashTable[hashedKey]);
        }
        else{
            hashTable[hashedKey] = new StoredEmployee(key,employee);
        }
    }

    public Employee remove(String key){
        int hashedKey =findKey(key);
        if(hashedKey == -1){
            return null;
        }

        Employee employee = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;
        return employee;

    }
    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey==-1)
            return null;
        return hashTable[hashedKey].employee;
    }
    public  void printHashTable(){
        for(int i = 0; i<hashTable.length;i++){
            if(hashTable[i]==null){
                System.out.println("empty");
            }
            else
                System.out.println(hashTable[i]);
        }
    }

    public boolean isOccupied(int index){
        return hashTable[index]!=null;
    }
    public int findKey(String key){
        int hashKey = hashKey(key);
        if(hashTable[hashKey]!=null && hashTable[hashKey].key.equals(key)){
            return hashKey;
        }
        int stopIndex = hashKey;
        if(hashKey == hashTable.length-1)
            hashKey =0;
        else
            hashKey++;
        while(hashKey!= stopIndex&& hashTable[hashKey]!=null&& !hashTable[hashKey].key.equals(key)){
            hashKey = (hashKey+1)%hashTable.length;
        }
        if(hashTable[hashKey]!=null&& hashTable[hashKey].key.equals(key)){
            return hashKey;
        }
        else
            return -1;
    }
}
