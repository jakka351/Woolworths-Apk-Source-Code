package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/KTypeWrapper;", "Lkotlin/reflect/KType;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class KTypeWrapper implements KType {
    public final KType d;

    public KTypeWrapper(KType origin) {
        Intrinsics.h(origin, "origin");
        this.d = origin;
    }

    @Override // kotlin.reflect.KType
    public final List b() {
        return this.d.b();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier e() {
        return this.d.e();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KTypeWrapper kTypeWrapper = obj instanceof KTypeWrapper ? (KTypeWrapper) obj : null;
        KType kType = kTypeWrapper != null ? kTypeWrapper.d : null;
        KType kType2 = this.d;
        if (!Intrinsics.c(kType2, kType)) {
            return false;
        }
        KClassifier kClassifierE = kType2.e();
        if (kClassifierE instanceof KClass) {
            KType kType3 = obj instanceof KType ? (KType) obj : null;
            KClassifier kClassifierE2 = kType3 != null ? kType3.e() : null;
            if (kClassifierE2 != null && (kClassifierE2 instanceof KClass)) {
                return JvmClassMappingKt.b((KClass) kClassifierE).equals(JvmClassMappingKt.b((KClass) kClassifierE2));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // kotlin.reflect.KType
    public final boolean l() {
        return this.d.l();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.d;
    }
}
