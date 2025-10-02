package org.commonmark.node;

/* loaded from: classes8.dex */
public class StrongEmphasis extends Node implements Delimited {
    public String g;

    @Override // org.commonmark.node.Node
    public final void a(Visitor visitor) {
        visitor.C(this);
    }
}
