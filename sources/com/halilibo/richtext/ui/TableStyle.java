package com.halilibo.richtext.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/TableStyle;", "", "Companion", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TableStyle {
    public static final TableStyle e = new TableStyle(null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final TextStyle f16299a;
    public final TextUnit b;
    public final Color c;
    public final Float d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/TableStyle$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public TableStyle(TextStyle textStyle, TextUnit textUnit, Color color, Float f) {
        this.f16299a = textStyle;
        this.b = textUnit;
        this.c = color;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableStyle)) {
            return false;
        }
        TableStyle tableStyle = (TableStyle) obj;
        return Intrinsics.c(this.f16299a, tableStyle.f16299a) && Intrinsics.c(this.b, tableStyle.b) && Intrinsics.c(this.c, tableStyle.c) && Intrinsics.c(this.d, tableStyle.d);
    }

    public final int hashCode() {
        TextStyle textStyle = this.f16299a;
        int iHashCode = (textStyle == null ? 0 : textStyle.hashCode()) * 31;
        TextUnit textUnit = this.b;
        int iHashCode2 = (iHashCode + (textUnit == null ? 0 : Long.hashCode(textUnit.f2204a))) * 31;
        Color color = this.c;
        int iHashCode3 = (iHashCode2 + (color == null ? 0 : Long.hashCode(color.f1766a))) * 31;
        Float f = this.d;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "TableStyle(headerTextStyle=" + this.f16299a + ", cellPadding=" + this.b + ", borderColor=" + this.c + ", borderStrokeWidth=" + this.d + ")";
    }
}
