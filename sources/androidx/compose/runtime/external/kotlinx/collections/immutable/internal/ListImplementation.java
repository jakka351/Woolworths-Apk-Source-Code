package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListImplementation {
    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(b.i(i, i2, "index: ", ", size: "));
        }
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b.i(i, i2, "index: ", ", size: "));
        }
    }

    public static final void c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbQ = a.q(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            sbQ.append(i3);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(b.i(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
