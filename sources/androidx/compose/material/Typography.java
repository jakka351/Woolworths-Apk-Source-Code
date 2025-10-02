package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/Typography;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Typography {

    /* renamed from: a, reason: collision with root package name */
    public final TextStyle f1348a;
    public final TextStyle b;
    public final TextStyle c;
    public final TextStyle d;
    public final TextStyle e;
    public final TextStyle f;
    public final TextStyle g;
    public final TextStyle h;
    public final TextStyle i;
    public final TextStyle j;
    public final TextStyle k;
    public final TextStyle l;
    public final TextStyle m;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.f1348a = textStyle;
        this.b = textStyle2;
        this.c = textStyle3;
        this.d = textStyle4;
        this.e = textStyle5;
        this.f = textStyle6;
        this.g = textStyle7;
        this.h = textStyle8;
        this.i = textStyle9;
        this.j = textStyle10;
        this.k = textStyle11;
        this.l = textStyle12;
        this.m = textStyle13;
    }

    public static Typography a(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6) {
        TextStyle textStyle7 = typography.f1348a;
        TextStyle textStyle8 = typography.b;
        TextStyle textStyle9 = typography.c;
        TextStyle textStyle10 = typography.d;
        TextStyle textStyle11 = typography.e;
        TextStyle textStyle12 = typography.g;
        TextStyle textStyle13 = typography.h;
        typography.getClass();
        return new Typography(textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle, textStyle12, textStyle13, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return Intrinsics.c(this.f1348a, typography.f1348a) && Intrinsics.c(this.b, typography.b) && Intrinsics.c(this.c, typography.c) && Intrinsics.c(this.d, typography.d) && Intrinsics.c(this.e, typography.e) && Intrinsics.c(this.f, typography.f) && Intrinsics.c(this.g, typography.g) && Intrinsics.c(this.h, typography.h) && Intrinsics.c(this.i, typography.i) && Intrinsics.c(this.j, typography.j) && Intrinsics.c(this.k, typography.k) && Intrinsics.c(this.l, typography.l) && Intrinsics.c(this.m, typography.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + a.d(a.d(a.d(a.d(a.d(a.d(a.d(a.d(a.d(a.d(a.d(this.f1348a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        return "Typography(h1=" + this.f1348a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", subtitle1=" + this.g + ", subtitle2=" + this.h + ", body1=" + this.i + ", body2=" + this.j + ", button=" + this.k + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}
