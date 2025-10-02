package com.halilibo.richtext.markdown.node;

import YU.a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstStrikethrough;", "Lcom/halilibo/richtext/markdown/node/AstInlineNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstStrikethrough extends AstInlineNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final String f16265a;

    public AstStrikethrough(String str) {
        this.f16265a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AstStrikethrough) && Intrinsics.c(this.f16265a, ((AstStrikethrough) obj).f16265a);
    }

    public final int hashCode() {
        return this.f16265a.hashCode();
    }

    public final String toString() {
        return a.h("AstStrikethrough(delimiter=", this.f16265a, ")");
    }
}
