package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final RowMeasurePolicy f972a = new RowMeasurePolicy(Arrangement.f934a, Alignment.Companion.j);

    public static final RowMeasurePolicy a(Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Composer composer, int i) {
        if (Intrinsics.c(horizontal, Arrangement.f934a) && Intrinsics.c(vertical, Alignment.Companion.j)) {
            composer.o(-848964613);
            composer.l();
            return f972a;
        }
        composer.o(-848913742);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.n(horizontal)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.n(vertical)) || (i & 48) == 32);
        Object objG = composer.G();
        if (z || objG == Composer.Companion.f1624a) {
            objG = new RowMeasurePolicy(horizontal, vertical);
            composer.A(objG);
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) objG;
        composer.l();
        return rowMeasurePolicy;
    }
}
