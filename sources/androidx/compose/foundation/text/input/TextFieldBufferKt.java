package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldBufferKt {
    public static final long a(int i, int i2, int i3, long j) {
        int i4;
        int iF = TextRange.f(j);
        int iE = TextRange.e(j);
        if (iE < i) {
            return j;
        }
        if (iF <= i && i2 <= iE) {
            i4 = i3 - (i2 - i);
            if (iF == iE) {
            }
            i = iE + i4;
            return TextRangeKt.a(iF, i);
        }
        if (iF > i && iE < i2) {
            i += i3;
            iF = i;
        } else if (iF >= i2) {
            i4 = i3 - (i2 - i);
        } else if (i < iF) {
            iF = i + i3;
            i = (i3 - (i2 - i)) + iE;
        }
        return TextRangeKt.a(iF, i);
        iF += i4;
        i = iE + i4;
        return TextRangeKt.a(iF, i);
    }
}
