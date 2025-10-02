package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public class CharProgression implements Iterable<Character>, KMappedMarker {
    public final char d;
    public final char e;
    public final int f = 1;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public CharProgression(char c, char c2) {
        this.d = c;
        this.e = (char) ProgressionUtilKt.a(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharProgression)) {
            return false;
        }
        if (isEmpty() && ((CharProgression) obj).isEmpty()) {
            return true;
        }
        CharProgression charProgression = (CharProgression) obj;
        return this.d == charProgression.d && this.e == charProgression.e && this.f == charProgression.f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.d * 31) + this.e) * 31) + this.f;
    }

    public boolean isEmpty() {
        int i = this.f;
        char c = this.e;
        char c2 = this.d;
        return i > 0 ? Intrinsics.j(c2, c) > 0 : Intrinsics.j(c2, c) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new CharProgressionIterator(this.d, this.e, this.f);
    }

    public String toString() {
        StringBuilder sb;
        char c = this.e;
        char c2 = this.d;
        int i = this.f;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(c2);
            sb.append("..");
            sb.append(c);
            sb.append(" step ");
            sb.append(i);
        } else {
            sb = new StringBuilder();
            sb.append(c2);
            sb.append(" downTo ");
            sb.append(c);
            sb.append(" step ");
            sb.append(-i);
        }
        return sb.toString();
    }
}
