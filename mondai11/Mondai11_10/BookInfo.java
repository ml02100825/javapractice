public class BookInfo {
    private String bookname;
    private String writername;
    private int publicationyear;
    private static int booknumber = 0;
    

    BookInfo(String bookname, String writername, int publicationyear){
            this.bookname = bookname;
            this.writername = writername;
            this.publicationyear = publicationyear;
    }
    public String getbookname(){
        return bookname;
    }
    public String getwritername(){
        return writername;
    }
    public int getpublicationyear(){
        return publicationyear;
    }
    public int setbooknumber(){
        return this.booknumber = booknumber + 1;
    }
    public int getbooknumber(){
        return booknumber;
    }
    
}
