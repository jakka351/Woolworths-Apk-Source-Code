package androidx.collection;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/IntIntPair;", "", "packedValue", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IntIntPair {

    /* renamed from: a, reason: collision with root package name */
    public final long f675a;

    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntIntPair) {
            return this.f675a == ((IntIntPair) obj).f675a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f675a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.f675a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return a.l(sb, (int) (j & 4294967295L), ')');
    }
}
