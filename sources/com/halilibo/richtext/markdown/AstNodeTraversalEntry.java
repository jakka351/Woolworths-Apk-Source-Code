package com.halilibo.richtext.markdown;

import com.halilibo.richtext.markdown.node.AstNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/AstNodeTraversalEntry;", "", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class AstNodeTraversalEntry {

    /* renamed from: a, reason: collision with root package name */
    public final AstNode f16243a;
    public final boolean b;
    public final Integer c;

    public AstNodeTraversalEntry(AstNode astNode, boolean z, Integer num) {
        Intrinsics.h(astNode, "astNode");
        this.f16243a = astNode;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AstNodeTraversalEntry)) {
            return false;
        }
        AstNodeTraversalEntry astNodeTraversalEntry = (AstNodeTraversalEntry) obj;
        return Intrinsics.c(this.f16243a, astNodeTraversalEntry.f16243a) && this.b == astNodeTraversalEntry.b && Intrinsics.c(this.c, astNodeTraversalEntry.c);
    }

    public final int hashCode() {
        int iE = androidx.camera.core.impl.b.e(this.f16243a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AstNodeTraversalEntry(astNode=");
        sb.append(this.f16243a);
        sb.append(", isVisited=");
        sb.append(this.b);
        sb.append(", formatIndex=");
        return au.com.woolworths.android.onesite.a.p(sb, this.c, ")");
    }
}
