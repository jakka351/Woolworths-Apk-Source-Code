package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.hpke.HPKE;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/UShort;", "", "Companion", "data", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
/* loaded from: classes7.dex */
public final class UShort implements Comparable<UShort> {
    public final short d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/UShort$Companion;", "", "Lkotlin/UShort;", "MIN_VALUE", "S", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.j(this.d & HPKE.aead_EXPORT_ONLY, uShort.d & HPKE.aead_EXPORT_ONLY);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UShort) {
            return this.d == ((UShort) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.d);
    }

    public final String toString() {
        return String.valueOf(this.d & HPKE.aead_EXPORT_ONLY);
    }
}
