package AbstractionChallenge;

public class MyLinkedList implements NodeList {
	
	private ListItem root=null;

	public MyLinkedList(ListItem root) {
		super();
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		
		return this.root;
	}

	@Override
	public boolean addItem(ListItem item) {
		if(this.root == null)
		return false;
		this.root = newItem;
		return true;
	}
	ListItem currentItem = this.root;
	while(currentItem != null) {
		int comparison = (currentItem.compareTo(newItem));
	}
	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem item) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
