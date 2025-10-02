package androidx.compose.ui.text;

import YU.a;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextLayoutResult {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutInput f2064a;
    public final MultiParagraph b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j) {
        this.f2064a = textLayoutInput;
        this.b = multiParagraph;
        this.c = j;
        ArrayList arrayList = multiParagraph.h;
        boolean zIsEmpty = arrayList.isEmpty();
        float f = BitmapDescriptorFactory.HUE_RED;
        this.d = zIsEmpty ? 0.0f : ((ParagraphInfo) arrayList.get(0)).f2047a.c();
        if (!arrayList.isEmpty()) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.O(arrayList);
            f = paragraphInfo.f2047a.f() + paragraphInfo.f;
        }
        this.e = f;
        this.f = multiParagraph.g;
    }

    public final ResolvedTextDirection a(int i) {
        MultiParagraph multiParagraph = this.b;
        ArrayList arrayList = multiParagraph.h;
        multiParagraph.k(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == multiParagraph.f2045a.f2046a.e.length() ? CollectionsKt.I(arrayList) : MultiParagraphKt.a(i, arrayList));
        return paragraphInfo.f2047a.b(paragraphInfo.d(i));
    }

    public final Rect b(int i) {
        float fJ;
        float fJ2;
        float fI;
        float fI2;
        MultiParagraph multiParagraph = this.b;
        multiParagraph.j(i);
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        int iD = paragraphInfo.d(i);
        CharSequence charSequence = androidParagraph.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbR = a.r(iD, "offset(", ") is out of bounds [0,");
            sbR.append(charSequence.length());
            sbR.append(')');
            InlineClassHelperKt.a(sbR.toString());
        }
        TextLayout textLayout = androidParagraph.d;
        Layout layout = textLayout.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fH = textLayout.h(lineForOffset);
        float f = textLayout.f(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fI = textLayout.j(iD, false);
                fI2 = textLayout.j(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fI = textLayout.i(iD, false);
                fI2 = textLayout.i(iD + 1, true);
            } else {
                fJ = textLayout.j(iD, false);
                fJ2 = textLayout.j(iD + 1, true);
            }
            float f2 = fI;
            fJ = fI2;
            fJ2 = f2;
        } else {
            fJ = textLayout.i(iD, false);
            fJ2 = textLayout.i(iD + 1, true);
        }
        RectF rectF = new RectF(fJ, fH, fJ2, f);
        return paragraphInfo.a(new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final Rect c(int i) {
        MultiParagraph multiParagraph = this.b;
        ArrayList arrayList = multiParagraph.h;
        multiParagraph.k(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == multiParagraph.f2045a.f2046a.e.length() ? CollectionsKt.I(arrayList) : MultiParagraphKt.a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        int iD = paragraphInfo.d(i);
        CharSequence charSequence = androidParagraph.e;
        TextLayout textLayout = androidParagraph.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbR = a.r(iD, "offset(", ") is out of bounds [0,");
            sbR.append(charSequence.length());
            sbR.append(']');
            InlineClassHelperKt.a(sbR.toString());
        }
        float fI = textLayout.i(iD, false);
        int lineForOffset = textLayout.f.getLineForOffset(iD);
        return paragraphInfo.a(new Rect(fI, textLayout.h(lineForOffset), fI, textLayout.f(lineForOffset)));
    }

    public final boolean d() {
        MultiParagraph multiParagraph = this.b;
        return multiParagraph.c || ((float) ((int) (this.c & 4294967295L))) < multiParagraph.e;
    }

    public final float e(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.l(i);
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        int i2 = i - paragraphInfo.d;
        TextLayout textLayout = androidParagraph.d;
        return textLayout.f.getLineLeft(i2) + (i2 == textLayout.g + (-1) ? textLayout.j : BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return this.f2064a.equals(textLayoutResult.f2064a) && this.b.equals(textLayoutResult.b) && IntSize.b(this.c, textLayoutResult.c) && this.d == textLayoutResult.d && this.e == textLayoutResult.e && Intrinsics.c(this.f, textLayoutResult.f);
    }

    public final float f(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.l(i);
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        int i2 = i - paragraphInfo.d;
        TextLayout textLayout = androidParagraph.d;
        return textLayout.f.getLineRight(i2) + (i2 == textLayout.g + (-1) ? textLayout.k : BitmapDescriptorFactory.HUE_RED);
    }

    public final int g(int i) {
        MultiParagraph multiParagraph = this.b;
        multiParagraph.l(i);
        ArrayList arrayList = multiParagraph.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        return androidParagraph.d.f.getLineStart(i - paragraphInfo.d) + paragraphInfo.b;
    }

    public final ResolvedTextDirection h(int i) {
        MultiParagraph multiParagraph = this.b;
        ArrayList arrayList = multiParagraph.h;
        multiParagraph.k(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == multiParagraph.f2045a.f2046a.e.length() ? CollectionsKt.I(arrayList) : MultiParagraphKt.a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        int iD = paragraphInfo.d(i);
        TextLayout textLayout = androidParagraph.d;
        return textLayout.f.getParagraphDirection(textLayout.f.getLineForOffset(iD)) == 1 ? ResolvedTextDirection.d : ResolvedTextDirection.e;
    }

    public final int hashCode() {
        return this.f.hashCode() + android.support.v4.media.session.a.b(this.e, android.support.v4.media.session.a.b(this.d, b.b((this.b.hashCode() + (this.f2064a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final AndroidPath i(final int i, final int i2) {
        MultiParagraph multiParagraph = this.b;
        MultiParagraphIntrinsics multiParagraphIntrinsics = multiParagraph.f2045a;
        if (i < 0 || i > i2 || i2 > multiParagraphIntrinsics.f2046a.e.length()) {
            StringBuilder sbQ = a.q(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbQ.append(multiParagraphIntrinsics.f2046a.e.length());
            sbQ.append("), or start > end!");
            InlineClassHelperKt.a(sbQ.toString());
        }
        if (i == i2) {
            return AndroidPath_androidKt.a();
        }
        final AndroidPath androidPathA = AndroidPath_androidKt.a();
        MultiParagraphKt.d(multiParagraph.h, TextRangeKt.a(i, i2), new Function1<ParagraphInfo, Unit>() { // from class: androidx.compose.ui.text.MultiParagraph$getPathForRange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
                AndroidParagraph androidParagraph = paragraphInfo.f2047a;
                int iD = paragraphInfo.d(i);
                int iD2 = paragraphInfo.d(i2);
                CharSequence charSequence = androidParagraph.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbQ2 = a.q(iD, iD2, "start(", ") or end(", ") is out of range [0..");
                    sbQ2.append(charSequence.length());
                    sbQ2.append("], or start > end!");
                    InlineClassHelperKt.a(sbQ2.toString());
                }
                Path path = new Path();
                TextLayout textLayout = androidParagraph.d;
                textLayout.f.getSelectionPath(iD, iD2, path);
                int i3 = textLayout.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(BitmapDescriptorFactory.HUE_RED, i3);
                }
                AndroidPath androidPath = new AndroidPath(path);
                float f = paragraphInfo.f;
                androidPath.g((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                int i4 = (int) 0;
                androidPathA.f1761a.addPath(path, Float.intBitsToFloat(i4), Float.intBitsToFloat(i4));
                return Unit.f24250a;
            }
        });
        return androidPathA;
    }

    public final long j(int i) {
        MultiParagraph multiParagraph = this.b;
        ArrayList arrayList = multiParagraph.h;
        multiParagraph.k(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == multiParagraph.f2045a.f2046a.e.length() ? CollectionsKt.I(arrayList) : MultiParagraphKt.a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        int iD = paragraphInfo.d(i);
        WordIterator wordIteratorK = androidParagraph.d.k();
        return paragraphInfo.b(TextRangeKt.a(WordBoundary_androidKt.b(wordIteratorK, iD), WordBoundary_androidKt.a(wordIteratorK, iD)), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f2064a + ", multiParagraph=" + this.b + ", size=" + ((Object) IntSize.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
