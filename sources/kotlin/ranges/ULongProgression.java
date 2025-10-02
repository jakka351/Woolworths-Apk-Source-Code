package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
    public final long d;
    public final long e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public ULongProgression() {
        long j = 0;
        if (Long.compareUnsigned(-1L, 0L) < 0) {
            long jRemainderUnsigned = Long.remainderUnsigned(0L, 1L);
            long jRemainderUnsigned2 = Long.remainderUnsigned(-1L, 1L);
            int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
            long j2 = jRemainderUnsigned - jRemainderUnsigned2;
            j = 0 - (iCompareUnsigned < 0 ? j2 + 1 : j2);
        }
        this.d = j;
        this.e = 1L;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ULongProgression)) {
            return false;
        }
        if (isEmpty() && ((ULongProgression) obj).isEmpty()) {
            return true;
        }
        ULongProgression uLongProgression = (ULongProgression) obj;
        return this.d == uLongProgression.d && this.e == uLongProgression.e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.d;
        int i = ((((int) (-4294967296L)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.e;
        long j2 = this.d;
        return j > 0 ? Long.compareUnsigned(-1L, j2) > 0 : Long.compareUnsigned(-1L, j2) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.d, this.e);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.e;
        long j2 = this.d;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append((Object) UnsignedKt.c(10, -1L));
            sb.append("..");
            sb.append((Object) UnsignedKt.c(10, j2));
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append((Object) UnsignedKt.c(10, -1L));
            sb.append(" downTo ");
            sb.append((Object) UnsignedKt.c(10, j2));
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
