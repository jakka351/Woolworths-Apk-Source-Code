package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CircularArray<E> {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f669a;
    public int b;
    public int c;
    public int d;

    public CircularArray(int i) {
        if (!(i >= 1)) {
            RuntimeHelpersKt.a("capacity must be >= 1");
            throw null;
        }
        if (!(i <= 1073741824)) {
            RuntimeHelpersKt.a("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.d = i - 1;
        this.f669a = new Object[i];
    }
}
