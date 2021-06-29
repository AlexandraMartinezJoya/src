package Chapter6;

import acm.util.RandomGenerator;

public class LibraryRecord {

    private Book record;

    private int libraryOfCongressCatalogNumber;

    /**
     * Instance variables
     */
    private RandomGenerator rgen = RandomGenerator.getInstance();

        public LibraryRecord(){
            this.record = new Book();
            this.libraryOfCongressCatalogNumber = generateRecordNumber();
        }

        public LibraryRecord(Book book, int recordNumber){
            this.libraryOfCongressCatalogNumber = recordNumber;
            this.record = book;
        }

        private int generateRecordNumber(){
            int recordNumber = rgen.nextInt(1, 1000000);
            return recordNumber;
        }

        public Book getBook(){
            return this.record;
        }

        public void setBook(Book book){
            this.record = book;
        }

        public String toString() {
            return "" + this.libraryOfCongressCatalogNumber + " : " + record.toString();
        }
}
