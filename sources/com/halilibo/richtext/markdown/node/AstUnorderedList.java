package com.halilibo.richtext.markdown.node;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstUnorderedList;", "Lcom/halilibo/richtext/markdown/node/AstContainerBlockNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstUnorderedList extends AstContainerBlockNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final char f16274a;

    public AstUnorderedList(char c) {
        this.f16274a = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AstUnorderedList) && this.f16274a == ((AstUnorderedList) obj).f16274a;
    }

    public final int hashCode() {
        return Character.hashCode(this.f16274a);
    }

    public final String toString() {
        return "AstUnorderedList(bulletMarker=" + this.f16274a + ")";
    }
}
