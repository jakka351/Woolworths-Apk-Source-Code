package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    public static final long a(long j, long j2) {
        int iD;
        int iF = TextRange.f(j);
        int iE = TextRange.e(j);
        if ((TextRange.f(j2) < TextRange.e(j)) && (TextRange.f(j) < TextRange.e(j2))) {
            if (TextRange.a(j2, j)) {
                iF = TextRange.f(j2);
                iE = iF;
            } else {
                if (TextRange.a(j, j2)) {
                    iD = TextRange.d(j2);
                } else {
                    int iF2 = TextRange.f(j2);
                    if (iF >= TextRange.e(j2) || iF2 > iF) {
                        iE = TextRange.f(j2);
                    } else {
                        iF = TextRange.f(j2);
                        iD = TextRange.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > TextRange.f(j2)) {
            iF -= TextRange.d(j2);
            iD = TextRange.d(j2);
            iE -= iD;
        }
        return TextRangeKt.a(iF, iE);
    }
}
