package sandbox;

import java.util.Objects;

public class Node {
	
	private String data;
	
	private Node node;
	
	public Node(final String dataValue) {
		node = null;
		data = dataValue;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(final String data) {
		this.data = data;
	}
	
	public Node getNode() {
		return node;
	}
	
	public void setNode(final Node node) {
		this.node = node;
	}
	
	@Override
	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof Node)) {
			return false;
		}
		
		return Objects.equals(data, node.data) &&
				Objects.equals(node, node.node);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data, node);
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", node=" + node + "]";
	}
}