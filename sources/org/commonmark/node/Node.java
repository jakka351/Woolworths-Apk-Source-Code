package org.commonmark.node;

import androidx.constraintlayout.core.state.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class Node {

    /* renamed from: a, reason: collision with root package name */
    public Node f26855a = null;
    public Node b = null;
    public Node c = null;
    public Node d = null;
    public Node e = null;
    public ArrayList f = null;

    public abstract void a(Visitor visitor);

    public final void b(SourceSpan sourceSpan) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(sourceSpan);
    }

    public final void c(Node node) {
        node.j();
        node.g(this);
        Node node2 = this.c;
        if (node2 == null) {
            this.b = node;
            this.c = node;
        } else {
            node2.e = node;
            node.d = node2;
            this.c = node;
        }
    }

    public Node d() {
        return this.f26855a;
    }

    public final List e() {
        ArrayList arrayList = this.f;
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final void f(Node node) {
        node.j();
        Node node2 = this.e;
        node.e = node2;
        if (node2 != null) {
            node2.d = node;
        }
        node.d = this;
        this.e = node;
        Node node3 = this.f26855a;
        node.f26855a = node3;
        if (node.e == null) {
            node3.c = node;
        }
    }

    public void g(Node node) {
        this.f26855a = node;
    }

    public final void h(List list) {
        if (list.isEmpty()) {
            this.f = null;
        } else {
            this.f = new ArrayList(list);
        }
    }

    public String i() {
        return "";
    }

    public final void j() {
        Node node = this.d;
        if (node != null) {
            node.e = this.e;
        } else {
            Node node2 = this.f26855a;
            if (node2 != null) {
                node2.b = this.e;
            }
        }
        Node node3 = this.e;
        if (node3 != null) {
            node3.d = node;
        } else {
            Node node4 = this.f26855a;
            if (node4 != null) {
                node4.c = node;
            }
        }
        this.f26855a = null;
        this.e = null;
        this.d = null;
    }

    public final String toString() {
        return a.i(getClass().getSimpleName(), "{", i(), "}");
    }
}
