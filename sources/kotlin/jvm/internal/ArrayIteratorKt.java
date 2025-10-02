package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArrayIteratorKt {
    public static final Iterator a(Object[] array) {
        Intrinsics.h(array, "array");
        return new ArrayIterator(array);
    }
}
