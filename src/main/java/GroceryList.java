public class GroceryList {
    private String[] arr;

    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10]; 
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
            
        }
    }
    public void remove(String item){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == item){
                arr[i] = null;
            }
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == null){
                arr[i] = arr[i+1];
                arr[i+1] = null;
            }
        }
    }
    public String toString(){
        String h = "Grocery List: ";
        for(int i = 0; i < arr.length; i ++){
                h += arr[i];
                h += " ";
        }
        return h;
    }
}