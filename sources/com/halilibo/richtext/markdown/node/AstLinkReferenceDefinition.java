package com.halilibo.richtext.markdown.node;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstLinkReferenceDefinition;", "Lcom/halilibo/richtext/markdown/node/AstLeafBlockNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstLinkReferenceDefinition extends AstLeafBlockNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final String f16258a;
    public final String b;
    public final String c;

    public AstLinkReferenceDefinition(String str, String str2, String str3) {
        this.f16258a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AstLinkReferenceDefinition)) {
            return false;
        }
        AstLinkReferenceDefinition astLinkReferenceDefinition = (AstLinkReferenceDefinition) obj;
        return Intrinsics.c(this.f16258a, astLinkReferenceDefinition.f16258a) && Intrinsics.c(this.b, astLinkReferenceDefinition.b) && Intrinsics.c(this.c, astLinkReferenceDefinition.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f16258a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("AstLinkReferenceDefinition(label=", this.f16258a, ", destination=", this.b, ", title="), this.c, ")");
    }
}
