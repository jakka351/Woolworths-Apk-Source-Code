package androidx.compose.foundation.text.input;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "ChangeList", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldBuffer implements Appendable {
    public final OffsetMappingCalculator d;
    public final PartialGapBuffer e;
    public ChangeTracker f;
    public long g;
    public TextRange h;
    public MutableVector i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ChangeList {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldBuffer(final TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i) {
        MutableVector mutableVector = null;
        changeTracker = (i & 2) != 0 ? null : changeTracker;
        this.d = (i & 8) != 0 ? null : offsetMappingCalculator;
        PartialGapBuffer partialGapBuffer = new PartialGapBuffer();
        partialGapBuffer.d = textFieldCharSequence;
        partialGapBuffer.f = -1;
        partialGapBuffer.g = -1;
        this.e = partialGapBuffer;
        this.f = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        long j = textFieldCharSequence.f;
        List list = textFieldCharSequence.d;
        this.g = j;
        this.h = textFieldCharSequence.g;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            int size = list.size();
            Function1<Integer, AnnotatedString.Range<AnnotatedString.Annotation>> function1 = new Function1<Integer, AnnotatedString.Range<AnnotatedString.Annotation>>() { // from class: androidx.compose.foundation.text.input.TextFieldBuffer$composingAnnotations$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return (AnnotatedString.Range) textFieldCharSequence.d.get(((Number) obj).intValue());
                }
            };
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i2 = 0; i2 < size; i2++) {
                rangeArr[i2] = function1.invoke(Integer.valueOf(i2));
            }
            mutableVector = new MutableVector(rangeArr, size);
        }
        this.i = mutableVector;
    }

    public final void a(int i, int i2, int i3) {
        ChangeTracker changeTracker = this.f;
        if (changeTracker == null) {
            changeTracker = new ChangeTracker(null);
            this.f = changeTracker;
        }
        changeTracker.b(i, i2, i3);
        OffsetMappingCalculator offsetMappingCalculator = this.d;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.getClass();
            if (!(i3 >= 0)) {
                InlineClassHelperKt.a("Expected newLen to be ≥ 0, was " + i3);
            }
            int iMin = Math.min(i, i2);
            int iMax = Math.max(iMin, i2) - iMin;
            if (iMax >= 2 || iMax != i3) {
                int i4 = offsetMappingCalculator.b + 1;
                int[] iArr = offsetMappingCalculator.f1167a;
                if (i4 > iArr.length / 3) {
                    int[] iArrCopyOf = Arrays.copyOf(offsetMappingCalculator.f1167a, Math.max(i4 * 2, (iArr.length / 3) * 2) * 3);
                    Intrinsics.g(iArrCopyOf, "copyOf(...)");
                    offsetMappingCalculator.f1167a = iArrCopyOf;
                }
                int[] iArr2 = offsetMappingCalculator.f1167a;
                int i5 = offsetMappingCalculator.b * 3;
                iArr2[i5] = iMin;
                iArr2[i5 + 1] = iMax;
                iArr2[i5 + 2] = i3;
                offsetMappingCalculator.b = i4;
            }
        }
        this.g = TextFieldBufferKt.a(i, i2, i3, this.g);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        PartialGapBuffer partialGapBuffer = this.e;
        a(partialGapBuffer.length(), partialGapBuffer.length(), 1);
        int length = partialGapBuffer.length();
        int length2 = partialGapBuffer.length();
        String strValueOf = String.valueOf(c);
        partialGapBuffer.a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    public final void b(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!(i <= i2)) {
            InlineClassHelperKt.a("Expected start=" + i + " <= end=" + i2);
        }
        if (!(i3 <= i4)) {
            InlineClassHelperKt.a("Expected textStart=" + i3 + " <= textEnd=" + i4);
        }
        a(i, i2, i4 - i3);
        this.e.a(i, i2, charSequence, i3, i4);
        d(null);
    }

    public final void c(int i, int i2, List list) {
        PartialGapBuffer partialGapBuffer = this.e;
        if (i < 0 || i > partialGapBuffer.length()) {
            StringBuilder sbR = a.r(i, "start (", ") offset is outside of text region ");
            sbR.append(partialGapBuffer.length());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 < 0 || i2 > partialGapBuffer.length()) {
            StringBuilder sbR2 = a.r(i2, "end (", ") offset is outside of text region ");
            sbR2.append(partialGapBuffer.length());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(b.i(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        d(new TextRange(TextRangeKt.a(i, i2)));
        MutableVector mutableVector = this.i;
        if (mutableVector != null) {
            mutableVector.h();
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.i == null) {
            this.i = new MutableVector(new AnnotatedString.Range[16], 0);
        }
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
            MutableVector mutableVector2 = this.i;
            if (mutableVector2 != null) {
                mutableVector2.c(AnnotatedString.Range.a(range, null, range.b + i, range.c + i, 9));
            }
        }
    }

    public final void d(TextRange textRange) {
        if (textRange != null && !TextRange.c(textRange.f2067a)) {
            this.h = textRange;
            return;
        }
        this.h = null;
        MutableVector mutableVector = this.i;
        if (mutableVector != null) {
            mutableVector.h();
        }
    }

    public final void e(long j) {
        long jA = TextRangeKt.a(0, this.e.length());
        if (!TextRange.a(jA, j)) {
            InlineClassHelperKt.a("Expected " + ((Object) TextRange.h(j)) + " to be in " + ((Object) TextRange.h(jA)));
        }
        this.g = j;
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            PartialGapBuffer partialGapBuffer = this.e;
            a(partialGapBuffer.length(), partialGapBuffer.length(), charSequence.length());
            partialGapBuffer.a(partialGapBuffer.length(), partialGapBuffer.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            PartialGapBuffer partialGapBuffer = this.e;
            a(partialGapBuffer.length(), partialGapBuffer.length(), i2 - i);
            int length = partialGapBuffer.length();
            int length2 = partialGapBuffer.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            partialGapBuffer.a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
