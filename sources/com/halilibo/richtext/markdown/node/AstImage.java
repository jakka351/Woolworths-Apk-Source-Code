package com.halilibo.richtext.markdown.node;

import YU.a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstImage;", "Lcom/halilibo/richtext/markdown/node/AstInlineNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstImage extends AstInlineNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final String f16255a;
    public final String b;

    public AstImage(String str, String destination) {
        Intrinsics.h(destination, "destination");
        this.f16255a = str;
        this.b = destination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AstImage)) {
            return false;
        }
        AstImage astImage = (AstImage) obj;
        return Intrinsics.c(this.f16255a, astImage.f16255a) && Intrinsics.c(this.b, astImage.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16255a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("AstImage(title=", this.f16255a, ", destination=", this.b, ")");
    }
}
