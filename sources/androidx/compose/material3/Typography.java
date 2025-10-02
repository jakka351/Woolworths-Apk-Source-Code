package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Typography;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Typography {

    /* renamed from: a, reason: collision with root package name */
    public final TextStyle f1529a;
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
    public final TextStyle n;
    public final TextStyle o;

    public Typography() {
        TextStyle textStyle = TypographyTokens.d;
        TextStyle textStyle2 = TypographyTokens.e;
        TextStyle textStyle3 = TypographyTokens.f;
        TextStyle textStyle4 = TypographyTokens.g;
        TextStyle textStyle5 = TypographyTokens.h;
        TextStyle textStyle6 = TypographyTokens.i;
        TextStyle textStyle7 = TypographyTokens.m;
        TextStyle textStyle8 = TypographyTokens.n;
        TextStyle textStyle9 = TypographyTokens.o;
        TextStyle textStyle10 = TypographyTokens.f1615a;
        TextStyle textStyle11 = TypographyTokens.b;
        TextStyle textStyle12 = TypographyTokens.c;
        TextStyle textStyle13 = TypographyTokens.j;
        TextStyle textStyle14 = TypographyTokens.k;
        TextStyle textStyle15 = TypographyTokens.l;
        this.f1529a = textStyle;
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
        this.n = textStyle14;
        this.o = textStyle15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return Intrinsics.c(this.f1529a, typography.f1529a) && Intrinsics.c(this.b, typography.b) && Intrinsics.c(this.c, typography.c) && Intrinsics.c(this.d, typography.d) && Intrinsics.c(this.e, typography.e) && Intrinsics.c(this.f, typography.f) && Intrinsics.c(this.g, typography.g) && Intrinsics.c(this.h, typography.h) && Intrinsics.c(this.i, typography.i) && Intrinsics.c(this.j, typography.j) && Intrinsics.c(this.k, typography.k) && Intrinsics.c(this.l, typography.l) && Intrinsics.c(this.m, typography.m) && Intrinsics.c(this.n, typography.n) && Intrinsics.c(this.o, typography.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(android.support.v4.media.session.a.d(this.f1529a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f1529a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }
}
