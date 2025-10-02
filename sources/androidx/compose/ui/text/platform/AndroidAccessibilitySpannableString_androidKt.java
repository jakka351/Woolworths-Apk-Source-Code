package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.extensions.LocaleListHelperMethods;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static final SpannableString a(AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver, URLSpanCache uRLSpanCache) {
        ArrayList arrayList;
        String str = annotatedString.e;
        List list = annotatedString.d;
        SpannableString spannableString = new SpannableString(str);
        ArrayList arrayList2 = annotatedString.f;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                AnnotatedString.Range range = (AnnotatedString.Range) arrayList2.get(i);
                SpanStyle spanStyle = (SpanStyle) range.f2032a;
                int i2 = range.b;
                int i3 = range.c;
                int i4 = size;
                SpanStyle spanStyleA = SpanStyle.a(spanStyle, 0L, 65503);
                FontFamily fontFamily = spanStyleA.fontFamily;
                TextForegroundStyle textForegroundStyle = spanStyleA.f2058a;
                TextGeometricTransform textGeometricTransform = spanStyleA.textGeometricTransform;
                TextDecoration textDecoration = spanStyleA.background;
                FontStyle fontStyle = spanStyleA.fontStyle;
                SpannableExtensions_androidKt.c(spannableString, textForegroundStyle.getF2150a(), i2, i3);
                SpannableExtensions_androidKt.d(spannableString, spanStyleA.fontSize, density, i2, i3);
                FontWeight fontWeight = spanStyleA.fontWeight;
                if (fontWeight != null || fontStyle != null) {
                    if (fontWeight == null) {
                        fontWeight = FontWeight.j;
                    }
                    spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.b(fontStyle != null ? fontStyle.f2098a : 0, fontWeight)), i2, i3, 33);
                }
                if (fontFamily != null) {
                    if (fontFamily instanceof GenericFontFamily) {
                        spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) fontFamily).i), i2, i3, 33);
                    } else {
                        FontSynthesis fontSynthesis = spanStyleA.fontSynthesis;
                        Object d = resolver.a(fontFamily, FontWeight.j, 0, fontSynthesis != null ? fontSynthesis.f2099a : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH).getD();
                        Intrinsics.f(d, "null cannot be cast to non-null type android.graphics.Typeface");
                        spannableString.setSpan(Api28Impl.a((Typeface) d), i2, i3, 33);
                    }
                }
                if (textDecoration != null) {
                    if (textDecoration.a(TextDecoration.c)) {
                        spannableString.setSpan(new UnderlineSpan(), i2, i3, 33);
                    }
                    if (textDecoration.a(TextDecoration.d)) {
                        spannableString.setSpan(new StrikethroughSpan(), i2, i3, 33);
                    }
                }
                if (textGeometricTransform != null) {
                    spannableString.setSpan(new ScaleXSpan(textGeometricTransform.f2160a), i2, i3, 33);
                }
                LocaleList localeList = spanStyleA.localeList;
                if (localeList != null) {
                    spannableString.setSpan(LocaleListHelperMethods.a(localeList), i2, i3, 33);
                }
                long j = spanStyleA.l;
                if (j != 16) {
                    spannableString.setSpan(new BackgroundColorSpan(ColorKt.j(j)), i2, i3, 33);
                }
                i++;
                size = i4;
            }
        }
        int length = str.length();
        Collection arrayList3 = EmptyList.d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                Object obj = list.get(i5);
                AnnotatedString.Range range2 = (AnnotatedString.Range) obj;
                if ((range2.f2032a instanceof TtsAnnotation) && AnnotatedStringKt.b(0, length, range2.b, range2.c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = arrayList3;
        }
        int size3 = arrayList.size();
        for (int i6 = 0; i6 < size3; i6++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i6);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.a((TtsAnnotation) range3.f2032a), range3.b, range3.c, 33);
        }
        int length2 = str.length();
        if (list != null) {
            arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            for (int i7 = 0; i7 < size4; i7++) {
                Object obj2 = list.get(i7);
                AnnotatedString.Range range4 = (AnnotatedString.Range) obj2;
                if ((range4.f2032a instanceof UrlAnnotation) && AnnotatedStringKt.b(0, length2, range4.b, range4.c)) {
                    arrayList3.add(obj2);
                }
            }
        }
        int size5 = arrayList3.size();
        for (int i8 = 0; i8 < size5; i8++) {
            AnnotatedString.Range range5 = (AnnotatedString.Range) arrayList3.get(i8);
            UrlAnnotation urlAnnotation = (UrlAnnotation) range5.f2032a;
            int i9 = range5.b;
            int i10 = range5.c;
            WeakHashMap weakHashMap = uRLSpanCache.f2147a;
            Object uRLSpan = weakHashMap.get(urlAnnotation);
            if (uRLSpan == null) {
                uRLSpan = new URLSpan(urlAnnotation.getF2069a());
                weakHashMap.put(urlAnnotation, uRLSpan);
            }
            spannableString.setSpan((URLSpan) uRLSpan, i9, i10, 33);
        }
        List listA = annotatedString.a(str.length());
        int size6 = listA.size();
        for (int i11 = 0; i11 < size6; i11++) {
            AnnotatedString.Range range6 = (AnnotatedString.Range) listA.get(i11);
            int i12 = range6.b;
            Object obj3 = range6.f2032a;
            int i13 = range6.c;
            if (i12 != i13) {
                LinkAnnotation linkAnnotation = (LinkAnnotation) obj3;
                if ((linkAnnotation instanceof LinkAnnotation.Url) && linkAnnotation.getC() == null) {
                    Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    LinkAnnotation.Url url = (LinkAnnotation.Url) obj3;
                    AnnotatedString.Range range7 = new AnnotatedString.Range(i12, i13, url);
                    WeakHashMap weakHashMap2 = uRLSpanCache.b;
                    Object uRLSpan2 = weakHashMap2.get(range7);
                    if (uRLSpan2 == null) {
                        uRLSpan2 = new URLSpan(url.getF2044a());
                        weakHashMap2.put(range7, uRLSpan2);
                    }
                    spannableString.setSpan((URLSpan) uRLSpan2, i12, i13, 33);
                } else {
                    WeakHashMap weakHashMap3 = uRLSpanCache.c;
                    Object composeClickableSpan = weakHashMap3.get(range6);
                    if (composeClickableSpan == null) {
                        composeClickableSpan = new ComposeClickableSpan(linkAnnotation);
                        weakHashMap3.put(range6, composeClickableSpan);
                    }
                    spannableString.setSpan((ClickableSpan) composeClickableSpan, i12, i13, 33);
                }
            }
        }
        return spannableString;
    }
}
