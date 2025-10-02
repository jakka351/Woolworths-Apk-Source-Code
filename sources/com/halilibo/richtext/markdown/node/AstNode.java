package com.halilibo.richtext.markdown.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstNode;", "", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AstNode {

    /* renamed from: a, reason: collision with root package name */
    public final AstNodeType f16260a;
    public final AstNodeLinks b;

    public AstNode(AstNodeType astNodeType, AstNodeLinks astNodeLinks) {
        this.f16260a = astNodeType;
        this.b = astNodeLinks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AstNode)) {
            return false;
        }
        AstNode astNode = (AstNode) obj;
        return Intrinsics.c(this.f16260a, astNode.f16260a) && Intrinsics.c(this.b, astNode.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16260a.hashCode() * 31);
    }
}
