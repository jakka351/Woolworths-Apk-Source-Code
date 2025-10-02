package androidx.compose.ui.text;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CacheTextLayoutInput {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutInput f2039a;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.f2039a = textLayoutInput;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.f2039a;
        AnnotatedString annotatedString = textLayoutInput.f2063a;
        TextLayoutInput textLayoutInput2 = ((CacheTextLayoutInput) obj).f2039a;
        return Intrinsics.c(annotatedString, textLayoutInput2.f2063a) && textLayoutInput.b.c(textLayoutInput2.b) && Intrinsics.c(textLayoutInput.c, textLayoutInput2.c) && textLayoutInput.d == textLayoutInput2.d && textLayoutInput.e == textLayoutInput2.e && textLayoutInput.f == textLayoutInput2.f && Intrinsics.c(textLayoutInput.g, textLayoutInput2.g) && textLayoutInput.h == textLayoutInput2.h && textLayoutInput.i == textLayoutInput2.i && Constraints.b(textLayoutInput.j, textLayoutInput2.j);
    }

    public final int hashCode() {
        TextLayoutInput textLayoutInput = this.f2039a;
        int iHashCode = textLayoutInput.f2063a.hashCode() * 31;
        TextStyle textStyle = textLayoutInput.b;
        SpanStyle spanStyle = textStyle.f2068a;
        long j = spanStyle.fontSize;
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        FontWeight fontWeight = spanStyle.fontWeight;
        int i = (iHashCode2 + (fontWeight != null ? fontWeight.d : 0)) * 31;
        FontStyle fontStyle = spanStyle.fontStyle;
        int iHashCode3 = (i + (fontStyle != null ? Integer.hashCode(fontStyle.f2098a) : 0)) * 31;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        int iHashCode4 = (iHashCode3 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.f2099a) : 0)) * 31;
        FontFamily fontFamily = spanStyle.fontFamily;
        int iHashCode5 = (iHashCode4 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = spanStyle.fontFeatureSettings;
        int iB = b.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, spanStyle.letterSpacing);
        BaselineShift baselineShift = spanStyle.baselineShift;
        int iHashCode6 = (iB + (baselineShift != null ? Float.hashCode(baselineShift.f2148a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        int iHashCode7 = (iHashCode6 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = spanStyle.localeList;
        int iHashCode8 = (iHashCode7 + (localeList != null ? localeList.d.hashCode() : 0)) * 31;
        long j2 = spanStyle.l;
        int i2 = Color.l;
        int iB2 = b.b(iHashCode8, 31, j2);
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        int iHashCode9 = (textStyle.b.hashCode() + ((iB2 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31)) * 31;
        PlatformTextStyle platformTextStyle = textStyle.platformStyle;
        return Long.hashCode(textLayoutInput.j) + ((textLayoutInput.i.hashCode() + ((textLayoutInput.h.hashCode() + ((textLayoutInput.g.hashCode() + b.a(textLayoutInput.f, b.e((b.d((iHashCode9 + (platformTextStyle != null ? platformTextStyle.hashCode() : 0) + iHashCode) * 31, 31, textLayoutInput.c) + textLayoutInput.d) * 31, 31, textLayoutInput.e), 31)) * 31)) * 31)) * 31);
    }
}
