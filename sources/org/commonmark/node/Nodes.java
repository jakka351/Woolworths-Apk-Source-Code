package org.commonmark.node;

import java.util.Iterator;

/* loaded from: classes8.dex */
public class Nodes {

    public static class NodeIterable implements Iterable<Node> {
        public final Node d;
        public final Node e;

        public NodeIterable(Node node, Node node2) {
            this.d = node;
            this.e = node2;
        }

        @Override // java.lang.Iterable
        public final Iterator<Node> iterator() {
            return new NodeIterator(this.d, this.e);
        }
    }

    public static class NodeIterator implements Iterator<Node> {
        public Node d;
        public final Node e;

        public NodeIterator(Node node, Node node2) {
            this.d = node;
            this.e = node2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Node node = this.d;
            return (node == null || node == this.e) ? false : true;
        }

        @Override // java.util.Iterator
        public final Node next() {
            Node node = this.d;
            this.d = node.e;
            return node;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public static Iterable a(Text text, Text text2) {
        return new NodeIterable(text.e, text2);
    }
}
