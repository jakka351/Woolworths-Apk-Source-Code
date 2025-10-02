package androidx.compose.ui.text;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpanStyle implements AnnotatedString.Annotation {

    /* renamed from: a, reason: collision with root package name */
    public final TextForegroundStyle f2058a;

    /* renamed from: b, reason: from toString */
    public final long fontSize;

    /* renamed from: c, reason: from toString */
    public final FontWeight fontWeight;

    /* renamed from: d, reason: from toString */
    public final FontStyle fontStyle;

    /* renamed from: e, reason: from toString */
    public final FontSynthesis fontSynthesis;

    /* renamed from: f, reason: from toString */
    public final FontFamily fontFamily;

    /* renamed from: g, reason: from toString */
    public final String fontFeatureSettings;

    /* renamed from: h, reason: from toString */
    public final long letterSpacing;

    /* renamed from: i, reason: from toString */
    public final BaselineShift baselineShift;

    /* renamed from: j, reason: from toString */
    public final TextGeometricTransform textGeometricTransform;

    /* renamed from: k, reason: from toString */
    public final LocaleList localeList;
    public final long l;

    /* renamed from: m, reason: from toString */
    public final TextDecoration background;

    /* renamed from: n, reason: from toString */
    public final Shadow shadow;

    /* renamed from: o, reason: from toString */
    public final PlatformSpanStyle platformStyle;

    /* renamed from: p, reason: from toString */
    public final DrawStyle drawStyle;

    public SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.f2058a = textForegroundStyle;
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.l = j3;
        this.background = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public static SpanStyle a(SpanStyle spanStyle, long j, int i) {
        long jC = (i & 1) != 0 ? spanStyle.f2058a.getF2150a() : j;
        long j2 = spanStyle.fontSize;
        FontWeight fontWeight = spanStyle.fontWeight;
        FontStyle fontStyle = spanStyle.fontStyle;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        FontFamily fontFamily = (i & 32) != 0 ? spanStyle.fontFamily : null;
        String str = spanStyle.fontFeatureSettings;
        long j3 = spanStyle.letterSpacing;
        BaselineShift baselineShift = spanStyle.baselineShift;
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        LocaleList localeList = spanStyle.localeList;
        long j4 = spanStyle.l;
        TextDecoration textDecoration = spanStyle.background;
        Shadow shadow = spanStyle.shadow;
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        DrawStyle drawStyle = spanStyle.drawStyle;
        TextForegroundStyle textForegroundStyleB = spanStyle.f2058a;
        if (!Color.c(jC, textForegroundStyleB.getF2150a())) {
            textForegroundStyleB = TextForegroundStyle.Companion.b(jC);
        }
        return new SpanStyle(textForegroundStyleB, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public final boolean b(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.a(this.fontSize, spanStyle.fontSize) && Intrinsics.c(this.fontWeight, spanStyle.fontWeight) && Intrinsics.c(this.fontStyle, spanStyle.fontStyle) && Intrinsics.c(this.fontSynthesis, spanStyle.fontSynthesis) && Intrinsics.c(this.fontFamily, spanStyle.fontFamily) && Intrinsics.c(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.a(this.letterSpacing, spanStyle.letterSpacing) && Intrinsics.c(this.baselineShift, spanStyle.baselineShift) && Intrinsics.c(this.textGeometricTransform, spanStyle.textGeometricTransform) && Intrinsics.c(this.localeList, spanStyle.localeList) && Color.c(this.l, spanStyle.l) && Intrinsics.c(this.platformStyle, spanStyle.platformStyle);
    }

    public final boolean c(SpanStyle spanStyle) {
        return Intrinsics.c(this.f2058a, spanStyle.f2058a) && Intrinsics.c(this.background, spanStyle.background) && Intrinsics.c(this.shadow, spanStyle.shadow) && Intrinsics.c(this.drawStyle, spanStyle.drawStyle);
    }

    public final SpanStyle d(SpanStyle spanStyle) {
        if (spanStyle == null) {
            return this;
        }
        TextForegroundStyle textForegroundStyle = spanStyle.f2058a;
        return SpanStyleKt.a(this, textForegroundStyle.getF2150a(), textForegroundStyle.getBrush(), textForegroundStyle.getB(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.l, spanStyle.background, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return b(spanStyle) && c(spanStyle);
    }

    public final int hashCode() {
        TextForegroundStyle textForegroundStyle = this.f2058a;
        long jC = textForegroundStyle.getF2150a();
        int i = Color.l;
        int iHashCode = Long.hashCode(jC) * 31;
        Brush brush = textForegroundStyle.getBrush();
        int iHashCode2 = (Float.hashCode(textForegroundStyle.getB()) + ((iHashCode + (brush != null ? brush.hashCode() : 0)) * 31)) * 31;
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        int iB = b.b(iHashCode2, 31, this.fontSize);
        FontWeight fontWeight = this.fontWeight;
        int i2 = (iB + (fontWeight != null ? fontWeight.d : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iHashCode3 = (i2 + (fontStyle != null ? Integer.hashCode(fontStyle.f2098a) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iHashCode4 = (iHashCode3 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.f2099a) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode5 = (iHashCode4 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iB2 = b.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.letterSpacing);
        BaselineShift baselineShift = this.baselineShift;
        int iHashCode6 = (iB2 + (baselineShift != null ? Float.hashCode(baselineShift.f2148a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode7 = (iHashCode6 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iB3 = b.b((iHashCode7 + (localeList != null ? localeList.d.hashCode() : 0)) * 31, 31, this.l);
        TextDecoration textDecoration = this.background;
        int i3 = (iB3 + (textDecoration != null ? textDecoration.f2157a : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode8 = (i3 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int iHashCode9 = (iHashCode8 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.drawStyle;
        return iHashCode9 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        TextForegroundStyle textForegroundStyle = this.f2058a;
        sb.append((Object) Color.i(textForegroundStyle.getF2150a()));
        sb.append(", brush=");
        sb.append(textForegroundStyle.getBrush());
        sb.append(", alpha=");
        sb.append(textForegroundStyle.getB());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.e(this.fontSize));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        sb.append(this.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(this.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(this.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.e(this.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(this.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(this.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(this.localeList);
        sb.append(", background=");
        a.A(this.l, ", textDecoration=", sb);
        sb.append(this.background);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", drawStyle=");
        sb.append(this.drawStyle);
        sb.append(')');
        return sb.toString();
    }

    public SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, int i) {
        this((i & 1) != 0 ? Color.k : j, (i & 2) != 0 ? TextUnit.c : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.c : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.k : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (PlatformSpanStyle) null);
    }

    public SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.b(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, null);
    }
}
