package org.commonmark.node;

import YU.a;

/* loaded from: classes8.dex */
public class Link extends Node {
    public final String g;
    public final String h;

    public Link(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.n(this);
    }

    @Override // org.commonmark.node.Node
    public final String i() {
        return a.i("destination=", this.g, ", title=", this.h);
    }
}
