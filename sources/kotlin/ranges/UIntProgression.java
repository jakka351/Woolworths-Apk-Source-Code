package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public class UIntProgression implements Iterable<UInt>, KMappedMarker {
    public final int d;
    public final int e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public UIntProgression() {
        int i = 0;
        if (Integer.compareUnsigned(-1, 0) < 0) {
            int iRemainderUnsigned = Integer.remainderUnsigned(0, 1);
            int iRemainderUnsigned2 = Integer.remainderUnsigned(-1, 1);
            int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
            int i2 = iRemainderUnsigned - iRemainderUnsigned2;
            i = 0 - (iCompareUnsigned < 0 ? i2 + 1 : i2);
        }
        this.d = i;
        this.e = 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UIntProgression)) {
            return false;
        }
        if (isEmpty() && ((UIntProgression) obj).isEmpty()) {
            return true;
        }
        UIntProgression uIntProgression = (UIntProgression) obj;
        return this.d == uIntProgression.d && this.e == uIntProgression.e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((-31) + this.d) * 31) + this.e;
    }

    public boolean isEmpty() {
        int i = this.e;
        int i2 = this.d;
        return i > 0 ? Integer.compareUnsigned(-1, i2) > 0 : Integer.compareUnsigned(-1, i2) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.d, this.e);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.d;
        int i2 = this.e;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.a(-1));
            sb.append("..");
            sb.append((Object) UInt.a(i));
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.a(-1));
            sb.append(" downTo ");
            sb.append((Object) UInt.a(i));
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
