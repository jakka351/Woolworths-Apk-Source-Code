package org.commonmark.node;

import YU.a;

/* loaded from: classes8.dex */
public class Text extends Node {
    public String g;

    public Text(String str) {
        this.g = str;
    }

    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.w(this);
    }

    @Override // org.commonmark.node.Node
    public final String i() {
        return a.A("literal=", this.g);
    }
}
