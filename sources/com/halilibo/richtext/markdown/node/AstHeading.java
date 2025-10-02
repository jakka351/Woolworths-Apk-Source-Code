package com.halilibo.richtext.markdown.node;

import YU.a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstHeading;", "Lcom/halilibo/richtext/markdown/node/AstLeafBlockNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstHeading extends AstLeafBlockNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final int f16252a;

    public AstHeading(int i) {
        this.f16252a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AstHeading) && this.f16252a == ((AstHeading) obj).f16252a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16252a);
    }

    public final String toString() {
        return a.e(this.f16252a, "AstHeading(level=", ")");
    }
}
