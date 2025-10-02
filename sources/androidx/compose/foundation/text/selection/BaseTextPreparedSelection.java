package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f1197a;
    public final long b;
    public final TextLayoutResult c;
    public final OffsetMapping d;
    public final TextPreparedSelectionState e;
    public long f;
    public final AnnotatedString g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;", "", "", "NoCharacterFound", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.f1197a = annotatedString;
        this.b = j;
        this.c = textLayoutResult;
        this.d = offsetMapping;
        this.e = textPreparedSelectionState;
        this.f = j;
        this.g = annotatedString;
    }

    public final Integer a() {
        TextLayoutResult textLayoutResult = this.c;
        if (textLayoutResult == null) {
            return null;
        }
        MultiParagraph multiParagraph = textLayoutResult.b;
        int iE = TextRange.e(this.f);
        OffsetMapping offsetMapping = this.d;
        return Integer.valueOf(offsetMapping.a(multiParagraph.c(multiParagraph.d(offsetMapping.b(iE)), true)));
    }

    public final Integer b() {
        TextLayoutResult textLayoutResult = this.c;
        if (textLayoutResult == null) {
            return null;
        }
        int iF = TextRange.f(this.f);
        OffsetMapping offsetMapping = this.d;
        return Integer.valueOf(offsetMapping.a(textLayoutResult.g(textLayoutResult.b.d(offsetMapping.b(iF)))));
    }

    public final Integer c() {
        int length;
        TextLayoutResult textLayoutResult = this.c;
        if (textLayoutResult == null) {
            return null;
        }
        int iM = m();
        while (true) {
            AnnotatedString annotatedString = this.f1197a;
            if (iM < annotatedString.e.length()) {
                int length2 = this.g.e.length() - 1;
                if (iM <= length2) {
                    length2 = iM;
                }
                long j = textLayoutResult.j(length2);
                int i = TextRange.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iM) {
                    length = this.d.a(i2);
                    break;
                }
                iM++;
            } else {
                length = annotatedString.e.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        TextLayoutResult textLayoutResult = this.c;
        if (textLayoutResult == null) {
            return null;
        }
        int iM = m();
        while (true) {
            if (iM <= 0) {
                iA = 0;
                break;
            }
            int length = this.g.e.length() - 1;
            if (iM <= length) {
                length = iM;
            }
            long j = textLayoutResult.j(length);
            int i = TextRange.c;
            int i2 = (int) (j >> 32);
            if (i2 < iM) {
                iA = this.d.a(i2);
                break;
            }
            iM--;
        }
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        TextLayoutResult textLayoutResult = this.c;
        return (textLayoutResult != null ? textLayoutResult.h(m()) : null) != ResolvedTextDirection.e;
    }

    public final int f(TextLayoutResult textLayoutResult, int i) {
        int iM = m();
        TextPreparedSelectionState textPreparedSelectionState = this.e;
        if (textPreparedSelectionState.f1226a == null) {
            textPreparedSelectionState.f1226a = Float.valueOf(textLayoutResult.c(iM).f1752a);
        }
        MultiParagraph multiParagraph = textLayoutResult.b;
        int iD = multiParagraph.d(iM) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= multiParagraph.f) {
            return this.g.e.length();
        }
        float fB = multiParagraph.b(iD) - 1;
        Float f = textPreparedSelectionState.f1226a;
        Intrinsics.e(f);
        float fFloatValue = f.floatValue();
        if ((e() && fFloatValue >= textLayoutResult.f(iD)) || (!e() && fFloatValue <= textLayoutResult.e(iD))) {
            return multiParagraph.c(iD, true);
        }
        return this.d.a(multiParagraph.g((Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    public final void g() {
        this.e.f1226a = null;
        AnnotatedString annotatedString = this.g;
        String str = annotatedString.e;
        String str2 = annotatedString.e;
        if (str.length() > 0) {
            int iA = StringHelpersKt.a(TextRange.e(this.f), str2);
            if (iA == TextRange.e(this.f) && iA != str2.length()) {
                iA = StringHelpersKt.a(iA + 1, str2);
            }
            l(iA, iA);
        }
    }

    public final void h() {
        this.e.f1226a = null;
        AnnotatedString annotatedString = this.g;
        String str = annotatedString.e;
        String str2 = annotatedString.e;
        if (str.length() > 0) {
            int iB = StringHelpersKt.b(TextRange.f(this.f), str2);
            if (iB == TextRange.f(this.f) && iB != 0) {
                iB = StringHelpersKt.b(iB - 1, str2);
            }
            l(iB, iB);
        }
    }

    public final void i() {
        Integer numA;
        this.e.f1226a = null;
        if (this.g.e.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        l(iIntValue, iIntValue);
    }

    public final void j() {
        Integer numB;
        this.e.f1226a = null;
        if (this.g.e.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        l(iIntValue, iIntValue);
    }

    public final void k() {
        if (this.g.e.length() > 0) {
            int i = TextRange.c;
            this.f = TextRangeKt.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void l(int i, int i2) {
        this.f = TextRangeKt.a(i, i2);
    }

    public final int m() {
        long j = this.f;
        int i = TextRange.c;
        return this.d.b((int) (j & 4294967295L));
    }
}
