package androidx.compose.ui.text;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStyleKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final TextStyle a(TextStyle textStyle, TextStyle textStyle2, float f) {
        PlatformSpanStyle platformSpanStyle;
        PlatformParagraphStyle platformParagraphStyle;
        SpanStyle spanStyle = textStyle.f2068a;
        SpanStyle spanStyle2 = textStyle2.f2068a;
        TextForegroundStyle textForegroundStyle = SpanStyleKt.d;
        TextForegroundStyle textForegroundStyleB = TextDrawStyleKt.b(spanStyle.f2058a, spanStyle2.f2058a, f);
        FontFamily fontFamily = (FontFamily) SpanStyleKt.b(f, spanStyle.fontFamily, spanStyle2.fontFamily);
        long jC = SpanStyleKt.c(spanStyle.fontSize, f, spanStyle2.fontSize);
        FontWeight fontWeight = spanStyle.fontWeight;
        if (fontWeight == null) {
            fontWeight = FontWeight.j;
        }
        FontWeight fontWeight2 = spanStyle2.fontWeight;
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.j;
        }
        FontWeight fontWeightA = FontWeightKt.a(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) SpanStyleKt.b(f, spanStyle.fontStyle, spanStyle2.fontStyle);
        FontSynthesis fontSynthesis = (FontSynthesis) SpanStyleKt.b(f, spanStyle.fontSynthesis, spanStyle2.fontSynthesis);
        String str = (String) SpanStyleKt.b(f, spanStyle.fontFeatureSettings, spanStyle2.fontFeatureSettings);
        long jC2 = SpanStyleKt.c(spanStyle.letterSpacing, f, spanStyle2.letterSpacing);
        BaselineShift baselineShift = spanStyle.baselineShift;
        float f2 = baselineShift != null ? baselineShift.f2148a : BitmapDescriptorFactory.HUE_RED;
        BaselineShift baselineShift2 = spanStyle2.baselineShift;
        float fA = BaselineShiftKt.a(f2, baselineShift2 != null ? baselineShift2.f2148a : BitmapDescriptorFactory.HUE_RED, f);
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        TextGeometricTransform textGeometricTransform2 = TextGeometricTransform.c;
        if (textGeometricTransform == null) {
            textGeometricTransform = textGeometricTransform2;
        }
        TextGeometricTransform textGeometricTransform3 = spanStyle2.textGeometricTransform;
        if (textGeometricTransform3 == null) {
            textGeometricTransform3 = textGeometricTransform2;
        }
        TextGeometricTransform textGeometricTransformA = TextGeometricTransformKt.a(textGeometricTransform, textGeometricTransform3, f);
        LocaleList localeList = (LocaleList) SpanStyleKt.b(f, spanStyle.localeList, spanStyle2.localeList);
        long jH = ColorKt.h(spanStyle.l, f, spanStyle2.l);
        TextDecoration textDecoration = (TextDecoration) SpanStyleKt.b(f, spanStyle.background, spanStyle2.background);
        Shadow shadow = spanStyle.shadow;
        if (shadow == null) {
            shadow = new Shadow();
        }
        Shadow shadow2 = spanStyle2.shadow;
        if (shadow2 == null) {
            shadow2 = new Shadow();
        }
        Shadow shadowA = ShadowKt.a(shadow, shadow2, f);
        PlatformSpanStyle platformSpanStyle2 = spanStyle.platformStyle;
        PlatformSpanStyle platformSpanStyle3 = spanStyle2.platformStyle;
        if (platformSpanStyle2 == null && platformSpanStyle3 == null) {
            platformSpanStyle = null;
        } else {
            if (platformSpanStyle2 == null) {
                platformSpanStyle2 = PlatformSpanStyle.f2053a;
            }
            platformSpanStyle = platformSpanStyle2;
        }
        SpanStyle spanStyle3 = new SpanStyle(textForegroundStyleB, jC, fontWeightA, fontStyle, fontSynthesis, fontFamily, str, jC2, new BaselineShift(fA), textGeometricTransformA, localeList, jH, textDecoration, shadowA, platformSpanStyle, (DrawStyle) SpanStyleKt.b(f, spanStyle.drawStyle, spanStyle2.drawStyle));
        ParagraphStyle paragraphStyle = textStyle.b;
        ParagraphStyle paragraphStyle2 = textStyle2.b;
        int i = ParagraphStyleKt.b;
        int i2 = ((TextAlign) SpanStyleKt.b(f, new TextAlign(paragraphStyle.f2049a), new TextAlign(paragraphStyle2.f2049a))).f2156a;
        int i3 = ((TextDirection) SpanStyleKt.b(f, new TextDirection(paragraphStyle.b), new TextDirection(paragraphStyle2.b))).f2158a;
        long jC3 = SpanStyleKt.c(paragraphStyle.c, f, paragraphStyle2.c);
        TextIndent textIndent = paragraphStyle.d;
        if (textIndent == null) {
            textIndent = TextIndent.c;
        }
        TextIndent textIndent2 = paragraphStyle2.d;
        if (textIndent2 == null) {
            textIndent2 = TextIndent.c;
        }
        TextIndent textIndentA = TextIndentKt.a(textIndent, textIndent2, f);
        PlatformParagraphStyle platformParagraphStyle2 = paragraphStyle.e;
        PlatformParagraphStyle platformParagraphStyle3 = paragraphStyle2.e;
        if (platformParagraphStyle2 == null && platformParagraphStyle3 == null) {
            platformParagraphStyle = null;
        } else {
            PlatformParagraphStyle platformParagraphStyle4 = PlatformParagraphStyle.b;
            if (platformParagraphStyle2 == null) {
                platformParagraphStyle2 = platformParagraphStyle4;
            }
            boolean z = platformParagraphStyle2.f2052a;
            if (platformParagraphStyle3 == null) {
                platformParagraphStyle3 = platformParagraphStyle4;
            }
            boolean z2 = platformParagraphStyle3.f2052a;
            if (z != z2) {
                ((EmojiSupportMatch) SpanStyleKt.b(f, new EmojiSupportMatch(), new EmojiSupportMatch())).getClass();
                platformParagraphStyle2 = new PlatformParagraphStyle(((Boolean) SpanStyleKt.b(f, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue(), 0);
            }
            platformParagraphStyle = platformParagraphStyle2;
        }
        return new TextStyle(spanStyle3, new ParagraphStyle(i2, i3, jC3, textIndentA, platformParagraphStyle, (LineHeightStyle) SpanStyleKt.b(f, paragraphStyle.f, paragraphStyle2.f), ((LineBreak) SpanStyleKt.b(f, new LineBreak(paragraphStyle.g), new LineBreak(paragraphStyle2.g))).f2152a, ((Hyphens) SpanStyleKt.b(f, new Hyphens(paragraphStyle.h), new Hyphens(paragraphStyle2.h))).f2151a, (TextMotion) SpanStyleKt.b(f, paragraphStyle.i, paragraphStyle2.i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.text.TextStyle b(androidx.compose.ui.text.TextStyle r31, androidx.compose.ui.unit.LayoutDirection r32) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyleKt.b(androidx.compose.ui.text.TextStyle, androidx.compose.ui.unit.LayoutDirection):androidx.compose.ui.text.TextStyle");
    }
}
