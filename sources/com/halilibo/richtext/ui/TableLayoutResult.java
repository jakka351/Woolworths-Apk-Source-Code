package com.halilibo.richtext.ui;

import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/TableLayoutResult;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TableLayoutResult {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16297a;
    public final ArrayList b;

    public TableLayoutResult(ArrayList arrayList, ArrayList arrayList2) {
        this.f16297a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableLayoutResult)) {
            return false;
        }
        TableLayoutResult tableLayoutResult = (TableLayoutResult) obj;
        return this.f16297a.equals(tableLayoutResult.f16297a) && this.b.equals(tableLayoutResult.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16297a.hashCode() * 31);
    }

    public final String toString() {
        return "TableLayoutResult(rowOffsets=" + this.f16297a + ", columnOffsets=" + this.b + ")";
    }
}
