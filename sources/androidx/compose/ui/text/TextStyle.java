package androidx.compose.ui.text;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStyle {
    public static final TextStyle d = new TextStyle(0, 0, null, null, null, 0, null, 0, 0, 0, null, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final SpanStyle f2068a;
    public final ParagraphStyle b;

    /* renamed from: c, reason: from toString */
    public final PlatformTextStyle platformStyle;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.f2068a = spanStyle;
        this.b = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public static TextStyle a(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, long j4, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, int i2) {
        long jC = (i2 & 1) != 0 ? textStyle.f2068a.f2058a.getF2150a() : j;
        long j5 = (i2 & 2) != 0 ? textStyle.f2068a.fontSize : j2;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? textStyle.f2068a.fontWeight : fontWeight;
        SpanStyle spanStyle = textStyle.f2068a;
        FontStyle fontStyle = spanStyle.fontStyle;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? spanStyle.fontFamily : fontFamily;
        String str = spanStyle.fontFeatureSettings;
        long j6 = (i2 & 128) != 0 ? spanStyle.letterSpacing : j3;
        BaselineShift baselineShift = spanStyle.baselineShift;
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        LocaleList localeList = spanStyle.localeList;
        long j7 = spanStyle.l;
        TextDecoration textDecoration = spanStyle.background;
        Shadow shadow = spanStyle.shadow;
        DrawStyle drawStyle = spanStyle.drawStyle;
        int i3 = (i2 & 32768) != 0 ? textStyle.b.f2049a : 3;
        ParagraphStyle paragraphStyle = textStyle.b;
        int i4 = paragraphStyle.b;
        long j8 = (i2 & 131072) != 0 ? paragraphStyle.c : j4;
        TextIndent textIndent = paragraphStyle.d;
        PlatformTextStyle platformTextStyle2 = (i2 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        return new TextStyle(new SpanStyle(Color.c(jC, spanStyle.f2058a.getF2150a()) ? spanStyle.f2058a : TextForegroundStyle.Companion.b(jC), j5, fontWeight2, fontStyle, fontSynthesis, fontFamily2, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformTextStyle2 != null ? platformTextStyle2.f2054a : null, drawStyle), new ParagraphStyle(i3, i4, j8, textIndent, platformTextStyle2 != null ? platformTextStyle2.b : null, (i2 & 1048576) != 0 ? paragraphStyle.f : lineHeightStyle, (i2 & 2097152) != 0 ? paragraphStyle.g : i, paragraphStyle.h, paragraphStyle.i), platformTextStyle2);
    }

    public static TextStyle e(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontFamily fontFamily, long j3, TextDecoration textDecoration, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? Color.k : j;
        long j6 = (i2 & 2) != 0 ? TextUnit.c : j2;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i2 & 8) != 0 ? null : fontStyle;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        long j7 = (i2 & 128) != 0 ? TextUnit.c : j3;
        long j8 = Color.k;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j9 = (i2 & 131072) != 0 ? TextUnit.c : j4;
        SpanStyle spanStyleA = SpanStyleKt.a(textStyle.f2068a, j5, null, Float.NaN, j6, fontWeight2, fontStyle2, null, fontFamily2, null, j7, null, null, null, j8, textDecoration2, null, null, null);
        ParagraphStyle paragraphStyleA = ParagraphStyleKt.a(textStyle.b, i3, Integer.MIN_VALUE, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        return (textStyle.f2068a == spanStyleA && textStyle.b == paragraphStyleA) ? textStyle : new TextStyle(spanStyleA, paragraphStyleA);
    }

    public final long b() {
        return this.f2068a.f2058a.getF2150a();
    }

    public final boolean c(TextStyle textStyle) {
        if (this != textStyle) {
            return Intrinsics.c(this.b, textStyle.b) && this.f2068a.b(textStyle.f2068a);
        }
        return true;
    }

    public final TextStyle d(TextStyle textStyle) {
        return (textStyle == null || textStyle.equals(d)) ? this : new TextStyle(this.f2068a.d(textStyle.f2068a), this.b.a(textStyle.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return Intrinsics.c(this.f2068a, textStyle.f2068a) && Intrinsics.c(this.b, textStyle.b) && Intrinsics.c(this.platformStyle, textStyle.platformStyle);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f2068a.hashCode() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) Color.i(b()));
        sb.append(", brush=");
        SpanStyle spanStyle = this.f2068a;
        sb.append(spanStyle.f2058a.getBrush());
        sb.append(", alpha=");
        sb.append(spanStyle.f2058a.getB());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.e(spanStyle.fontSize));
        sb.append(", fontWeight=");
        sb.append(spanStyle.fontWeight);
        sb.append(", fontStyle=");
        sb.append(spanStyle.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(spanStyle.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(spanStyle.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(spanStyle.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.e(spanStyle.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(spanStyle.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(spanStyle.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(spanStyle.localeList);
        sb.append(", background=");
        a.A(spanStyle.l, ", textDecoration=", sb);
        sb.append(spanStyle.background);
        sb.append(", shadow=");
        sb.append(spanStyle.shadow);
        sb.append(", drawStyle=");
        sb.append(spanStyle.drawStyle);
        sb.append(", textAlign=");
        ParagraphStyle paragraphStyle = this.b;
        sb.append((Object) TextAlign.a(paragraphStyle.f2049a));
        sb.append(", textDirection=");
        sb.append((Object) TextDirection.a(paragraphStyle.b));
        sb.append(", lineHeight=");
        sb.append((Object) TextUnit.e(paragraphStyle.c));
        sb.append(", textIndent=");
        sb.append(paragraphStyle.d);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", lineHeightStyle=");
        sb.append(paragraphStyle.f);
        sb.append(", lineBreak=");
        sb.append((Object) LineBreak.b(paragraphStyle.g));
        sb.append(", hyphens=");
        sb.append((Object) Hyphens.a(paragraphStyle.h));
        sb.append(", textMotion=");
        sb.append(paragraphStyle.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        PlatformParagraphStyle platformParagraphStyle = paragraphStyle.e;
        this(spanStyle, paragraphStyle, (platformSpanStyle == null && platformParagraphStyle == null) ? null : new PlatformTextStyle(platformSpanStyle, platformParagraphStyle));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontFamily fontFamily, long j3, TextDecoration textDecoration, int i, int i2, long j4, PlatformTextStyle platformTextStyle, int i3) {
        long j5 = (i3 & 1) != 0 ? Color.k : j;
        long j6 = (i3 & 2) != 0 ? TextUnit.c : j2;
        FontWeight fontWeight2 = (i3 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i3 & 8) != 0 ? null : fontStyle;
        FontFamily fontFamily2 = (i3 & 32) != 0 ? null : fontFamily;
        long j7 = (i3 & 128) != 0 ? TextUnit.c : j3;
        long j8 = Color.k;
        TextDecoration textDecoration2 = (i3 & 4096) != 0 ? null : textDecoration;
        int i4 = (32768 & i3) != 0 ? Integer.MIN_VALUE : i;
        int i5 = (65536 & i3) != 0 ? Integer.MIN_VALUE : i2;
        long j9 = (131072 & i3) != 0 ? TextUnit.c : j4;
        PlatformTextStyle platformTextStyle2 = (i3 & 524288) != 0 ? null : platformTextStyle;
        this(new SpanStyle(j5, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, j7, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, j8, textDecoration2, (Shadow) null, platformTextStyle2 != null ? platformTextStyle2.f2054a : null), new ParagraphStyle(i4, i5, j9, null, platformTextStyle2 != null ? platformTextStyle2.b : null, null, 0, Integer.MIN_VALUE, null), platformTextStyle2);
    }
}
