package com.halilibo.richtext.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/ListStyle;", "", "Companion", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ListStyle {
    public static final ListStyle f = new ListStyle(null, null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final TextUnit f16286a;
    public final TextUnit b;
    public final TextUnit c;
    public final Function1 d;
    public final Function1 e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/ListStyle$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ListStyle(TextUnit textUnit, TextUnit textUnit2, TextUnit textUnit3, Function1 function1, Function1 function12) {
        this.f16286a = textUnit;
        this.b = textUnit2;
        this.c = textUnit3;
        this.d = function1;
        this.e = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListStyle)) {
            return false;
        }
        ListStyle listStyle = (ListStyle) obj;
        return Intrinsics.c(this.f16286a, listStyle.f16286a) && Intrinsics.c(this.b, listStyle.b) && Intrinsics.c(this.c, listStyle.c) && Intrinsics.c(this.d, listStyle.d) && Intrinsics.c(this.e, listStyle.e);
    }

    public final int hashCode() {
        TextUnit textUnit = this.f16286a;
        int iHashCode = (textUnit == null ? 0 : Long.hashCode(textUnit.f2204a)) * 31;
        TextUnit textUnit2 = this.b;
        int iHashCode2 = (iHashCode + (textUnit2 == null ? 0 : Long.hashCode(textUnit2.f2204a))) * 31;
        TextUnit textUnit3 = this.c;
        int iHashCode3 = (iHashCode2 + (textUnit3 == null ? 0 : Long.hashCode(textUnit3.f2204a))) * 31;
        Function1 function1 = this.d;
        int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.e;
        return iHashCode4 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        return "ListStyle(markerIndent=" + this.f16286a + ", contentsIndent=" + this.b + ", itemSpacing=" + this.c + ", orderedMarkers=" + this.d + ", unorderedMarkers=" + this.e + ")";
    }
}
