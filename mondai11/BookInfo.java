public class BookInfo {
    private String bookname;
    private String writername;
    private int publicationyear;

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

    int booknumber = 0;
    public void setBooknumber(int booknumber) {
        this.booknumber = booknumber;
    }
    BookInfo(int booknumber){
        this.booknumber = booknumber;
    }
    
}
