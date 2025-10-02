package kotlin.collections;

import androidx.camera.core.impl.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes.dex */
class ArraysKt__ArraysJVMKt {
    public static final void a(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(b.j(i, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }
}
