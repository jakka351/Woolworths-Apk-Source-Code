package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class EditingBuffer {

    /* renamed from: a, reason: collision with root package name */
    public final PartialGapBuffer f2113a;
    public int b;
    public int c;
    public int d;
    public int e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "", "NOWHERE", "I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public EditingBuffer(AnnotatedString annotatedString, long j) {
        String str = annotatedString.e;
        PartialGapBuffer partialGapBuffer = new PartialGapBuffer();
        partialGapBuffer.f2122a = str;
        partialGapBuffer.c = -1;
        partialGapBuffer.d = -1;
        this.f2113a = partialGapBuffer;
        this.b = TextRange.f(j);
        this.c = TextRange.e(j);
        this.d = -1;
        this.e = -1;
        int iF = TextRange.f(j);
        int iE = TextRange.e(j);
        if (iF < 0 || iF > str.length()) {
            StringBuilder sbR = YU.a.r(iF, "start (", ") offset is outside of text region ");
            sbR.append(str.length());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (iE < 0 || iE > str.length()) {
            StringBuilder sbR2 = YU.a.r(iE, "end (", ") offset is outside of text region ");
            sbR2.append(str.length());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (iF > iE) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.i(iF, iE, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i, int i2) {
        long jA = TextRangeKt.a(i, i2);
        this.f2113a.b(i, i2, "");
        long jA2 = EditingBufferKt.a(TextRangeKt.a(this.b, this.c), jA);
        j(TextRange.f(jA2));
        i(TextRange.e(jA2));
        if (e()) {
            long jA3 = EditingBufferKt.a(TextRangeKt.a(this.d, this.e), jA);
            if (TextRange.c(jA3)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = TextRange.f(jA3);
                this.e = TextRange.e(jA3);
            }
        }
    }

    public final char b(int i) {
        PartialGapBuffer partialGapBuffer = this.f2113a;
        GapBuffer gapBuffer = partialGapBuffer.b;
        if (gapBuffer != null && i >= partialGapBuffer.c) {
            int iA = gapBuffer.f2114a - gapBuffer.a();
            int i2 = partialGapBuffer.c;
            if (i >= iA + i2) {
                return partialGapBuffer.f2122a.charAt(i - ((iA - partialGapBuffer.d) + i2));
            }
            int i3 = i - i2;
            int i4 = gapBuffer.c;
            return i3 < i4 ? gapBuffer.b[i3] : gapBuffer.b[(i3 - i4) + gapBuffer.d];
        }
        return partialGapBuffer.f2122a.charAt(i);
    }

    public final TextRange c() {
        if (e()) {
            return new TextRange(TextRangeKt.a(this.d, this.e));
        }
        return null;
    }

    public final int d() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final boolean e() {
        return this.d != -1;
    }

    public final void f(int i, int i2, String str) {
        PartialGapBuffer partialGapBuffer = this.f2113a;
        if (i < 0 || i > partialGapBuffer.a()) {
            StringBuilder sbR = YU.a.r(i, "start (", ") offset is outside of text region ");
            sbR.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 < 0 || i2 > partialGapBuffer.a()) {
            StringBuilder sbR2 = YU.a.r(i2, "end (", ") offset is outside of text region ");
            sbR2.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.i(i, i2, "Do not set reversed range: ", " > "));
        }
        partialGapBuffer.b(i, i2, str);
        j(str.length() + i);
        i(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void g(int i, int i2) {
        PartialGapBuffer partialGapBuffer = this.f2113a;
        if (i < 0 || i > partialGapBuffer.a()) {
            StringBuilder sbR = YU.a.r(i, "start (", ") offset is outside of text region ");
            sbR.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 < 0 || i2 > partialGapBuffer.a()) {
            StringBuilder sbR2 = YU.a.r(i2, "end (", ") offset is outside of text region ");
            sbR2.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.i(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        this.d = i;
        this.e = i2;
    }

    public final void h(int i, int i2) {
        PartialGapBuffer partialGapBuffer = this.f2113a;
        if (i < 0 || i > partialGapBuffer.a()) {
            StringBuilder sbR = YU.a.r(i, "start (", ") offset is outside of text region ");
            sbR.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 < 0 || i2 > partialGapBuffer.a()) {
            StringBuilder sbR2 = YU.a.r(i2, "end (", ") offset is outside of text region ");
            sbR2.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(sbR2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.i(i, i2, "Do not set reversed range: ", " > "));
        }
        j(i);
        i(i2);
    }

    public final void i(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void j(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.f2113a.toString();
    }
}
