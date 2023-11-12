public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                //newItem is greater than current item , move to right if possible
                // If the item to be added is greater than the current item, move onto the next item and compare
                //  again (if there is no next item then that is where the new item belongs).
                // Care will be needed when inserting before the first item in the list (as it will not have a previous item).
                if (currentItem.next() != null) {
                    //item to be added is grater than the current item, move onto the next item
                    currentItem = currentItem.next();
                } else {
                    //there is no next item in the list, we are at the end of the list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //  If the item to be added is less than the current item in the list, add the item before the
                // current item (i.e., make the previous item's "next" refer to the new item, and the new item's
                // "next" refer to the current item).
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    //we are at the start of the list , no previous item present.
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;

                }
                return true;
            } else {
                // comparison == 0
                //newItem equal to the item already present, no need to add
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (this.root == null) {
            System.out.println("List is empty");
            return false;
        }
        if (item != null) { //item to removeed is not equal to null
            System.out.println("Now deleting " + item.getValue() + " from the list");
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //The current item and the item to be removed are the same.
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();//item to be removed is greater than current item.
                //so we have to move further in the list to find the item to be removed
            } else {
                //comparison > 0 , i.e current item is greater than item to be removed
                //but we have already checked all the possibilities in the previous if n else if statements
                // that means the item to be removed is not present in the list
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem item) {

    }
}