package kotlin.collections;

import YU.a;
import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension
/* loaded from: classes.dex */
class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {
    public static final List a(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : CollectionsKt.Q(arrayList.get(0)) : EmptyList.d;
    }

    public static final void b(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a.e(i2, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(b.j(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }
}
