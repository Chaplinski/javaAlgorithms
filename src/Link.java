public class Link {

    public String bookName;
    public int millionsSold;

    public Link next;

    public Link(String bookName, int millionsSold){
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display(){
        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }

    public String ToString(){
        return bookName;
    }

    public static void main(String[] args){

        LinkList theLinkedList = new LinkList();

        theLinkedList.setFirstLink("Don Quixote", 500);
        theLinkedList.setFirstLink("A Tale of Two Cities", 200);
        theLinkedList.setFirstLink("The Lord of the Rings", 150);
        theLinkedList.setFirstLink("Harry Potter and the Sorcerer's Stone", 107);


        theLinkedList.removeFirst();
        theLinkedList.removeLink("Don Quixote");
        theLinkedList.display();


        System.out.println(theLinkedList.find("Don Quixote"));



    }

}

class LinkList {

    public Link firstLink;

    LinkList(){

        firstLink = null;

    }

    public boolean isEmpty(){

        return(firstLink == null);

    }

    public void setFirstLink(String bookName, int millionsSold){

        Link newLink = new Link(bookName, millionsSold);

        newLink.next = firstLink;

        firstLink = newLink;

    }

    public Link removeFirst(){

        Link linkReference = firstLink;

        if(!isEmpty()){

            firstLink = firstLink.next;

        } else {
            System.out.println("Empty LinkedList");
        }

        return linkReference;
    }

    public void display(){


        Link theLink = firstLink;

        while(theLink != null){

            theLink.display();

            System.out.println("Next link: " + theLink.next);

            theLink = theLink.next;

            System.out.println();

        }
    }

    public Link find(String bookName){

        Link theLink = firstLink;

        if(!isEmpty()){

            while(theLink.bookName != bookName){

                if(theLink.next == null){
                    return null;
                } else {
                    theLink = theLink.next;
                }

            }

        } else {

            System.out.println("Empty Linked List");

        }

        return theLink;

    }

    public Link removeLink(String bookName){

        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while(currentLink.bookName != bookName){

            if(currentLink.next == null){

                return null;

            } else {

                previousLink = currentLink;
                currentLink = currentLink.next;


            }

        }

        if(currentLink == firstLink){

            firstLink = firstLink.next;

        } else {

            previousLink.next = currentLink.next;


        }

        return currentLink;

    }

}



















