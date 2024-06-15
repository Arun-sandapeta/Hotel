package hotelMatrix;

import java.util.List;

public class Node {

    public String type;

    public List<Node> nodes;

    @Override
    public String toString() {
        return "Node{" +
                "type='" + type + '\'' +
                ", nodes=" + nodes +
                '}';
    }
}
