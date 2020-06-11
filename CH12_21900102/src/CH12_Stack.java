
public class CH12_Stack {
	private ListNode head;
	public CH12_Stack(){
		head = null;	
	}
	public void Push(String num) {
		head = new ListNode(num, head);
	}
	
	public void showData() {
		System.out.println("============");
		System.out.println("Stack Staus");
		System.out.println("============");
		ListNode position = head;
		while(position != null) {
			System.out.println(position.data);
			System.out.println("------------");
			position = position.link;
		}
	}
	
	public void Pop() {
		if(head!=null)
			head = head.link;
	}
	
	private class ListNode {
		private String data=null;
		private ListNode link=null;
		
		private ListNode() {
			link = null;
			data = null;
		}
		
		public ListNode(String newData, ListNode linkValue) {
			data = newData;
			link = linkValue;
		}
		
		private void setData(String newData) {
			data = newData;
		}
		
		private String getData() {
			return data;
		}
		
		private void setLink(ListNode newLink) {
			link = newLink;
		}
		
		private ListNode getLink() {
			return link;
		}
	}
}
