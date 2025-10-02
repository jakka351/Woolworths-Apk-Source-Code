package kotlin.collections;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlidingWindowKt {
    public static final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException((i != i2 ? b.j(i, i2, "Both size ", " and step ", " must be greater than zero.") : a.e(i, "size ", " must be greater than zero.")).toString());
        }
    }
}
