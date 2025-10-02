package com.halilibo.richtext.markdown.node;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstOrderedList;", "Lcom/halilibo/richtext/markdown/node/AstContainerBlockNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstOrderedList extends AstContainerBlockNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final int f16262a;
    public final char b;

    public AstOrderedList(int i, char c) {
        this.f16262a = i;
        this.b = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AstOrderedList)) {
            return false;
        }
        AstOrderedList astOrderedList = (AstOrderedList) obj;
        return this.f16262a == astOrderedList.f16262a && this.b == astOrderedList.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (Integer.hashCode(this.f16262a) * 31);
    }

    public final String toString() {
        return "AstOrderedList(startNumber=" + this.f16262a + ", delimiter=" + this.b + ")";
    }
}
