package com.halilibo.richtext.markdown.node;

import YU.a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstLink;", "Lcom/halilibo/richtext/markdown/node/AstInlineNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstLink extends AstInlineNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final String f16257a;
    public final String b;

    public AstLink(String destination, String str) {
        Intrinsics.h(destination, "destination");
        this.f16257a = destination;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AstLink)) {
            return false;
        }
        AstLink astLink = (AstLink) obj;
        return Intrinsics.c(this.f16257a, astLink.f16257a) && Intrinsics.c(this.b, astLink.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16257a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("AstLink(destination=", this.f16257a, ", title=", this.b, ")");
    }
}
