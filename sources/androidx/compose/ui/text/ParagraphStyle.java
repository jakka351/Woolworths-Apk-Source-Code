package androidx.compose.ui.text;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ParagraphStyle implements AnnotatedString.Annotation {

    /* renamed from: a, reason: collision with root package name */
    public final int f2049a;
    public final int b;
    public final long c;
    public final TextIndent d;
    public final PlatformParagraphStyle e;
    public final LineHeightStyle f;
    public final int g;
    public final int h;
    public final TextMotion i;

    public ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this.f2049a = i;
        this.b = i2;
        this.c = j;
        this.d = textIndent;
        this.e = platformParagraphStyle;
        this.f = lineHeightStyle;
        this.g = i3;
        this.h = i4;
        this.i = textMotion;
        if (TextUnit.a(j, TextUnit.c) || TextUnit.c(j) >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        InlineClassHelperKt.c("lineHeight can't be negative (" + TextUnit.c(j) + ')');
    }

    public final ParagraphStyle a(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.a(this, paragraphStyle.f2049a, paragraphStyle.b, paragraphStyle.c, paragraphStyle.d, paragraphStyle.e, paragraphStyle.f, paragraphStyle.g, paragraphStyle.h, paragraphStyle.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        if (this.f2049a == paragraphStyle.f2049a && this.b == paragraphStyle.b && TextUnit.a(this.c, paragraphStyle.c) && Intrinsics.c(this.d, paragraphStyle.d) && Intrinsics.c(this.e, paragraphStyle.e) && Intrinsics.c(this.f, paragraphStyle.f)) {
            return this.g == paragraphStyle.g && this.h == paragraphStyle.h && Intrinsics.c(this.i, paragraphStyle.i);
        }
        return false;
    }

    public final int hashCode() {
        int iA = b.a(this.b, Integer.hashCode(this.f2049a) * 31, 31);
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        int iB = b.b(iA, 31, this.c);
        TextIndent textIndent = this.d;
        int iHashCode = (iB + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.e;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.f;
        int iA2 = b.a(this.h, b.a(this.g, (iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31, 31), 31);
        TextMotion textMotion = this.i;
        return iA2 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.a(this.f2049a)) + ", textDirection=" + ((Object) TextDirection.a(this.b)) + ", lineHeight=" + ((Object) TextUnit.e(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) LineBreak.b(this.g)) + ", hyphens=" + ((Object) Hyphens.a(this.h)) + ", textMotion=" + this.i + ')';
    }

    public ParagraphStyle(int i, TextIndent textIndent, int i2) {
        this((i2 & 1) != 0 ? Integer.MIN_VALUE : i, Integer.MIN_VALUE, TextUnit.c, (i2 & 8) != 0 ? null : textIndent, null, null, 0, Integer.MIN_VALUE, null);
    }
}
