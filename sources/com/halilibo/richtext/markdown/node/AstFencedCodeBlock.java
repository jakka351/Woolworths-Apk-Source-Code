package com.halilibo.richtext.markdown.node;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstFencedCodeBlock;", "Lcom/halilibo/richtext/markdown/node/AstLeafBlockNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstFencedCodeBlock extends AstLeafBlockNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final char f16250a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public AstFencedCodeBlock(char c, int i, int i2, String str, String str2) {
        this.f16250a = c;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AstFencedCodeBlock)) {
            return false;
        }
        AstFencedCodeBlock astFencedCodeBlock = (AstFencedCodeBlock) obj;
        return this.f16250a == astFencedCodeBlock.f16250a && this.b == astFencedCodeBlock.b && this.c == astFencedCodeBlock.c && Intrinsics.c(this.d, astFencedCodeBlock.d) && Intrinsics.c(this.e, astFencedCodeBlock.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(b.a(this.c, b.a(this.b, Character.hashCode(this.f16250a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AstFencedCodeBlock(fenceChar=");
        sb.append(this.f16250a);
        sb.append(", fenceLength=");
        sb.append(this.b);
        sb.append(", fenceIndent=");
        a.u(this.c, ", info=", this.d, ", literal=", sb);
        return YU.a.o(sb, this.e, ")");
    }
}
