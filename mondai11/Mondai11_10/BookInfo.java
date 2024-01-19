public class BookInfo {
    private String bookname;
    private String writername;
    private int publicationyear;
    private int booknumber = 0;

    BookInfo(String bookname, String writername, int publicationyear){
            this.bookname = bookname;
            this.writername = writername;
            this.publicationyear = publicationyear;
            this.booknumber = booknumber + 1;
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
    public int getbooknumber(){
        return booknumber;
    }
    
}
