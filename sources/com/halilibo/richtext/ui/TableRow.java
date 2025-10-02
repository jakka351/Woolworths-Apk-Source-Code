package com.halilibo.richtext.ui;

import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/TableRow;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class TableRow {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16298a;

    public TableRow(List list) {
        this.f16298a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TableRow) && this.f16298a.equals(((TableRow) obj).f16298a);
    }

    public final int hashCode() {
        return this.f16298a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.b.n(this.f16298a, "TableRow(cells=", ")");
    }
}
