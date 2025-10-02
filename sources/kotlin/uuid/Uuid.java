package kotlin.uuid;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;
import kotlin.text.StringsKt;

@SinceKotlin
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\rJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalUuidApi
/* loaded from: classes7.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final Uuid f = new Uuid(0, 0);
    public final long d;
    public final long e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/uuid/Uuid$Companion;", "", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public static Uuid a(long j, long j2) {
            return (j == 0 && j2 == 0) ? Uuid.f : new Uuid(j, j2);
        }

        public static Uuid b(String uuidString) {
            String strConcat;
            Intrinsics.h(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return a(HexExtensionsKt.b(0, 16, uuidString), HexExtensionsKt.b(16, 32, uuidString));
            }
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    Intrinsics.g(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(uuidString.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB = HexExtensionsKt.b(0, 8, uuidString);
            UuidKt__UuidKt.b(8, uuidString);
            long jB2 = HexExtensionsKt.b(9, 13, uuidString);
            UuidKt__UuidKt.b(13, uuidString);
            long jB3 = HexExtensionsKt.b(14, 18, uuidString);
            UuidKt__UuidKt.b(18, uuidString);
            long jB4 = HexExtensionsKt.b(19, 23, uuidString);
            UuidKt__UuidKt.b(23, uuidString);
            return a((jB2 << 16) | (jB << 32) | jB3, (jB4 << 48) | HexExtensionsKt.b(24, 36, uuidString));
        }
    }

    public Uuid(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new UuidSerialized(this.d, this.e);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Uuid uuid) {
        Uuid other = uuid;
        Intrinsics.h(other, "other");
        long j = other.d;
        long j2 = this.d;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.e, other.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.d == uuid.d && this.e == uuid.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.d ^ this.e);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        UuidKt__UuidJVMKt.a(this.d, bArr, 0, 0, 4);
        bArr[8] = 45;
        UuidKt__UuidJVMKt.a(this.d, bArr, 9, 4, 6);
        bArr[13] = 45;
        UuidKt__UuidJVMKt.a(this.d, bArr, 14, 6, 8);
        bArr[18] = 45;
        UuidKt__UuidJVMKt.a(this.e, bArr, 19, 0, 2);
        bArr[23] = 45;
        UuidKt__UuidJVMKt.a(this.e, bArr, 24, 2, 8);
        return StringsKt.r(bArr);
    }
}
