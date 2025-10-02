package androidx.compose.ui.text;

import YU.a;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextAndroidCanvas;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MultiParagraph {

    /* renamed from: a, reason: collision with root package name */
    public final MultiParagraphIntrinsics f2045a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2) {
        boolean z;
        int i3;
        int iG;
        int i4;
        this.f2045a = multiParagraphIntrinsics;
        this.b = i;
        if (Constraints.j(j) != 0 || Constraints.i(j) != 0) {
            InlineClassHelperKt.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = multiParagraphIntrinsics.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) arrayList2.get(i5);
            AndroidParagraphIntrinsics androidParagraphIntrinsics = paragraphIntrinsicInfo.f2048a;
            int iH = Constraints.h(j);
            if (Constraints.c(j)) {
                i3 = i5;
                iG = Constraints.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i3 = i5;
                iG = Constraints.g(j);
            }
            AndroidParagraph androidParagraph = new AndroidParagraph(androidParagraphIntrinsics, this.b - i6, i2, ConstraintsKt.b(iH, iG, 5));
            float fD = androidParagraph.d() + f;
            TextLayout textLayout = androidParagraph.d;
            int i7 = i6 + textLayout.g;
            arrayList.add(new ParagraphInfo(androidParagraph, paragraphIntrinsicInfo.b, paragraphIntrinsicInfo.c, i6, i7, f, fD));
            if (!textLayout.d) {
                if (i7 == this.b) {
                    i4 = i3;
                    if (i4 != CollectionsKt.I(this.f2045a.e)) {
                    }
                } else {
                    i4 = i3;
                }
                i5 = i4 + 1;
                i6 = i7;
                f = fD;
            }
            z = true;
            i6 = i7;
            f = fD;
            break;
        }
        z = false;
        this.e = f;
        this.f = i6;
        this.c = z;
        this.h = arrayList;
        this.d = Constraints.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i8);
            List listG = paragraphInfo.f2047a.g();
            ArrayList arrayList4 = new ArrayList(listG.size());
            int size3 = listG.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listG.get(i9);
                arrayList4.add(rect != null ? paragraphInfo.a(rect) : null);
            }
            CollectionsKt.h(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.f2045a.b.size()) {
            int size4 = this.f2045a.b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.c0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public static void i(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        canvas.save();
        ArrayList arrayList = multiParagraph.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i);
            paragraphInfo.f2047a.k(canvas, j, shadow, textDecoration, drawStyle);
            canvas.c(BitmapDescriptorFactory.HUE_RED, paragraphInfo.f2047a.d());
        }
        canvas.m();
    }

    public final void a(final float[] fArr, final long j) {
        j(TextRange.f(j));
        k(TextRange.e(j));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.d = 0;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        MultiParagraphKt.d(this.h, j, new Function1<ParagraphInfo, Unit>() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
                int i = paragraphInfo.b;
                AndroidParagraph androidParagraph = paragraphInfo.f2047a;
                int iE = paragraphInfo.c;
                long j2 = j;
                int iF = i > TextRange.f(j2) ? paragraphInfo.b : TextRange.f(j2);
                if (iE >= TextRange.e(j2)) {
                    iE = TextRange.e(j2);
                }
                long jA = TextRangeKt.a(paragraphInfo.d(iF), paragraphInfo.d(iE));
                Ref.IntRef intRef2 = intRef;
                int i2 = intRef2.d;
                TextLayout textLayout = androidParagraph.d;
                int iF2 = TextRange.f(jA);
                int iE2 = TextRange.e(jA);
                float[] fArr2 = fArr;
                textLayout.a(iF2, iE2, fArr2, i2);
                int iD = (TextRange.d(jA) * 4) + intRef2.d;
                int i3 = intRef2.d;
                while (true) {
                    Ref.FloatRef floatRef2 = floatRef;
                    if (i3 >= iD) {
                        intRef2.d = iD;
                        floatRef2.d = androidParagraph.d() + floatRef2.d;
                        return Unit.f24250a;
                    }
                    int i4 = i3 + 1;
                    float f = fArr2[i4];
                    float f2 = floatRef2.d;
                    fArr2[i4] = f + f2;
                    int i5 = i3 + 3;
                    fArr2[i5] = fArr2[i5] + f2;
                    i3 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        return androidParagraph.d.f(i - paragraphInfo.d) + paragraphInfo.f;
    }

    public final int c(int i, boolean z) {
        int iG;
        l(i);
        ArrayList arrayList = this.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        int i2 = i - paragraphInfo.d;
        TextLayout textLayout = androidParagraph.d;
        if (z) {
            Layout layout = textLayout.f;
            TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.f2079a;
            if (layout.getEllipsisCount(i2) <= 0 || textLayout.b != TextUtils.TruncateAt.END) {
                iG = textLayout.d().d(i2);
            } else {
                iG = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iG = textLayout.g(i2);
        }
        return iG + paragraphInfo.b;
    }

    public final int d(int i) {
        int length = this.f2045a.f2046a.e.length();
        ArrayList arrayList = this.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i >= length ? CollectionsKt.I(arrayList) : i < 0 ? 0 : MultiParagraphKt.a(i, arrayList));
        return paragraphInfo.f2047a.d.f.getLineForOffset(paragraphInfo.d(i)) + paragraphInfo.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.c(arrayList, f));
        int i = paragraphInfo.c - paragraphInfo.b;
        int i2 = paragraphInfo.d;
        if (i == 0) {
            return i2;
        }
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        float f2 = f - paragraphInfo.f;
        TextLayout textLayout = androidParagraph.d;
        return textLayout.f.getLineForVertical(((int) f2) - textLayout.h) + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        return androidParagraph.d.h(i - paragraphInfo.d) + paragraphInfo.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.c(arrayList, fIntBitsToFloat));
        int i2 = paragraphInfo.c;
        int i3 = paragraphInfo.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        AndroidParagraph androidParagraph = paragraphInfo.f2047a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - paragraphInfo.f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        TextLayout textLayout = androidParagraph.d;
        int lineForVertical = textLayout.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - textLayout.h);
        return textLayout.f.getOffsetForHorizontal(lineForVertical, (textLayout.c(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        long jB;
        long j;
        float f = rect.b;
        ArrayList arrayList = this.h;
        int iC = MultiParagraphKt.c(arrayList, f);
        float f2 = ((ParagraphInfo) arrayList.get(iC)).g;
        float f3 = rect.d;
        if (f2 >= f3 || iC == CollectionsKt.I(arrayList)) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(iC);
            return paragraphInfo.b(paragraphInfo.f2047a.h(paragraphInfo.c(rect), i, textInclusionStrategy), true);
        }
        int iC2 = MultiParagraphKt.c(arrayList, f3);
        long jB2 = TextRange.b;
        while (true) {
            jB = TextRange.b;
            if (!TextRange.b(jB2, jB) || iC > iC2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = (ParagraphInfo) arrayList.get(iC);
            jB2 = paragraphInfo2.b(paragraphInfo2.f2047a.h(paragraphInfo2.c(rect), i, textInclusionStrategy), true);
            iC++;
        }
        if (TextRange.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = TextRange.b;
            if (!TextRange.b(jB, j) || iC > iC2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = (ParagraphInfo) arrayList.get(iC2);
            jB = paragraphInfo3.b(paragraphInfo3.f2047a.h(paragraphInfo3.c(rect), i, textInclusionStrategy), true);
            iC2--;
        }
        return TextRange.b(jB, j) ? jB2 : TextRangeKt.a((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void j(int i) {
        boolean z = false;
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f2045a;
        if (i >= 0 && i < multiParagraphIntrinsics.f2046a.e.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbR = a.r(i, "offset(", ") is out of bounds [0, ");
        sbR.append(multiParagraphIntrinsics.f2046a.e.length());
        sbR.append(')');
        InlineClassHelperKt.a(sbR.toString());
    }

    public final void k(int i) {
        boolean z = false;
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f2045a;
        if (i >= 0 && i <= multiParagraphIntrinsics.f2046a.e.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbR = a.r(i, "offset(", ") is out of bounds [0, ");
        sbR.append(multiParagraphIntrinsics.f2046a.e.length());
        sbR.append(']');
        InlineClassHelperKt.a(sbR.toString());
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        InlineClassHelperKt.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
