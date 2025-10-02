package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    public static final long a(float f, int i, long j, boolean z) {
        int iH = ((z || i == 2 || i == 4 || i == 5) && Constraints.d(j)) ? Constraints.h(j) : Integer.MAX_VALUE;
        if (Constraints.j(j) != iH) {
            iH = RangesKt.c(TextDelegateKt.a(f), Constraints.j(j), iH);
        }
        return Constraints.Companion.b(0, iH, 0, Constraints.g(j));
    }
}
