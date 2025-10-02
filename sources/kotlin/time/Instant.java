package kotlin.time;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import io.jsonwebtoken.JwtParser;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@SinceKotlin
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\rJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
@ExperimentalTime
/* loaded from: classes7.dex */
public final class Instant implements Comparable<Instant>, Serializable {
    public static final Instant f = new Instant(-31557014167219200L, 0);
    public static final Instant g = new Instant(31556889864403199L, 999999999);
    public final long d;
    public final int e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/Instant$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public Instant(long j, int i) {
        this.d = j;
        this.e = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Clock clock = InstantJvmKt.f24682a;
        return new InstantSerialized(this.d, this.e);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant other = instant;
        Intrinsics.h(other, "other");
        long j = this.d;
        long j2 = other.d;
        int i = j < j2 ? -1 : j == j2 ? 0 : 1;
        return i != 0 ? i : Intrinsics.j(this.e, other.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.d == instant.d && this.e == instant.e;
    }

    public final int hashCode() {
        return (this.e * 51) + Long.hashCode(this.d);
    }

    public final String toString() {
        long j;
        int[] iArr;
        int i;
        StringBuilder sb = new StringBuilder();
        long j2 = this.d;
        long j3 = j2 / 86400;
        long j4 = 0;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j5 = j2 % 86400;
        int i2 = (int) (j5 + (86400 & (((j5 ^ 86400) & ((-j5) | j5)) >> 63)));
        long j6 = (j3 + 719528) - 60;
        if (j6 < 0) {
            long j7 = 146097;
            long j8 = ((j6 + 1) / j7) - 1;
            j = 0;
            j4 = 400 * j8;
            j6 += (-j8) * j7;
        } else {
            j = 0;
        }
        long j9 = 400;
        long j10 = ((j9 * j6) + 591) / 146097;
        long j11 = 365;
        long j12 = 4;
        long j13 = 100;
        long j14 = j6 - ((j10 / j9) + (((j10 / j12) + (j11 * j10)) - (j10 / j13)));
        if (j14 < j) {
            j10--;
            j14 = j6 - ((j10 / j9) + (((j10 / j12) + (j11 * j10)) - (j10 / j13)));
        }
        int i3 = (int) j14;
        int i4 = ((i3 * 5) + 2) / 153;
        int i5 = ((i4 + 2) % 12) + 1;
        int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
        int i7 = (int) (j10 + j4 + (i4 / 10));
        int i8 = i2 / 3600;
        int i9 = i2 - (i8 * 3600);
        int i10 = i9 / 60;
        int i11 = i9 - (i10 * 60);
        int i12 = this.e;
        UnboundLocalDateTime unboundLocalDateTime = new UnboundLocalDateTime(i7, i5, i6, i8, i10, i11, i12);
        int i13 = 0;
        if (Math.abs(i7) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i7 >= 0) {
                sb2.append(i7 + ModuleDescriptor.MODULE_VERSION);
                Intrinsics.g(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(i7 - ModuleDescriptor.MODULE_VERSION);
                Intrinsics.g(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i7 >= 10000) {
                sb.append('+');
            }
            sb.append(i7);
        }
        sb.append('-');
        InstantKt.a(sb, sb, i5);
        sb.append('-');
        InstantKt.a(sb, sb, i6);
        sb.append('T');
        InstantKt.a(sb, sb, i8);
        sb.append(':');
        InstantKt.a(sb, sb, i10);
        sb.append(':');
        InstantKt.a(sb, sb, i11);
        if (i12 != 0) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            while (true) {
                int i14 = i13 + 1;
                iArr = InstantKt.f24683a;
                int i15 = iArr[i14];
                i = unboundLocalDateTime.g;
                if (i % i15 != 0) {
                    break;
                }
                i13 = i14;
            }
            int i16 = i13 - (i13 % 3);
            String strValueOf = String.valueOf((i / iArr[i16]) + iArr[9 - i16]);
            Intrinsics.f(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.g(strSubstring, "substring(...)");
            sb.append(strSubstring);
        }
        sb.append(Matrix.MATRIX_TYPE_ZERO);
        return sb.toString();
    }
}
