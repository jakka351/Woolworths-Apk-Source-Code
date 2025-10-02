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
public final class ColumnKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ColumnMeasurePolicy f946a = new ColumnMeasurePolicy(Arrangement.c, Alignment.Companion.m);

    public static final ColumnMeasurePolicy a(Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Composer composer, int i) {
        if (Intrinsics.c(vertical, Arrangement.c) && Intrinsics.c(horizontal, Alignment.Companion.m)) {
            composer.o(346089448);
            composer.l();
            return f946a;
        }
        composer.o(346143295);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.n(vertical)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.n(horizontal)) || (i & 48) == 32);
        Object objG = composer.G();
        if (z || objG == Composer.Companion.f1624a) {
            objG = new ColumnMeasurePolicy(vertical, horizontal);
            composer.A(objG);
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) objG;
        composer.l();
        return columnMeasurePolicy;
    }
}
