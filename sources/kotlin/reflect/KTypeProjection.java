package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class KTypeProjection {
    public static final KTypeProjection c = new KTypeProjection(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final KVariance f24271a;
    public final KType b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public static KTypeProjection a(KType type) {
            Intrinsics.h(type, "type");
            return new KTypeProjection(KVariance.d, type);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24272a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24272a = iArr;
        }
    }

    public KTypeProjection(KVariance kVariance, KType kType) {
        String str;
        this.f24271a = kVariance;
        this.b = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f24271a == kTypeProjection.f24271a && Intrinsics.c(this.b, kTypeProjection.b);
    }

    public final int hashCode() {
        KVariance kVariance = this.f24271a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.b;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.f24271a;
        int i = kVariance == null ? -1 : WhenMappings.f24272a[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        KType kType = this.b;
        if (i == 1) {
            return String.valueOf(kType);
        }
        if (i == 2) {
            return "in " + kType;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + kType;
    }
}
