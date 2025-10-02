package com.halilibo.richtext.markdown.node;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/markdown/node/AstTableCell;", "Lcom/halilibo/richtext/markdown/node/AstContainerBlockNodeType;", "richtext-markdown_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AstTableCell extends AstContainerBlockNodeType {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16268a;
    public final AstTableCellAlignment b;

    public AstTableCell(boolean z, AstTableCellAlignment astTableCellAlignment) {
        this.f16268a = z;
        this.b = astTableCellAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AstTableCell)) {
            return false;
        }
        AstTableCell astTableCell = (AstTableCell) obj;
        return this.f16268a == astTableCell.f16268a && this.b == astTableCell.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f16268a) * 31);
    }

    public final String toString() {
        return "AstTableCell(header=" + this.f16268a + ", alignment=" + this.b + ")";
    }
}
