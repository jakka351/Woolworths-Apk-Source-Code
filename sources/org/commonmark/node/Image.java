package org.commonmark.node;

import YU.a;

/* loaded from: classes8.dex */
public class Image extends Node {
    public String g;
    public String h;

    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.y(this);
    }

    @Override // org.commonmark.node.Node
    public final String i() {
        return a.i("destination=", this.g, ", title=", this.h);
    }
}
