import java.util.HashMap;
import java.util.Map;

public class Library {
    HashMap<Integer,Book> map;

    public Library() {
        this.map = new HashMap<>();
    }

    void add(Book b){
        map.put(b.id,b);
    }
    void delete(int id){
        map.remove(id);
    }
    void showBooks(){
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            Book temp=entry.getValue();
            System.out.println("book id : "+String.valueOf(temp.id));
            System.out.println("book name : "+temp.name);
            System.out.println("book author: "+ temp.author);
        }
    }
}
