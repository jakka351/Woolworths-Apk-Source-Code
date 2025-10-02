package com.halilibo.richtext.markdown.node;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstNodeLinks;", "", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AstNodeLinks {

    /* renamed from: a, reason: collision with root package name */
    public AstNode f16261a;
    public AstNode b;
    public AstNode c;
    public AstNode d;
    public AstNode e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AstNodeLinks)) {
            return false;
        }
        AstNodeLinks astNodeLinks = (AstNodeLinks) obj;
        return this.f16261a == astNodeLinks.f16261a && this.b == astNodeLinks.b && this.c == astNodeLinks.c && this.d == astNodeLinks.d && this.e == astNodeLinks.e;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            obj = obj;
        }
        int iHashCode = obj.hashCode() * 11;
        Object obj2 = this.e;
        return ((obj2 != null ? obj2 : 0).hashCode() * 7) + iHashCode;
    }
}
