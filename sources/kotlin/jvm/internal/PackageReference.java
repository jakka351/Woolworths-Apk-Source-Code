package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;

@SinceKotlin
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PackageReference implements ClassBasedDeclarationContainer {
    public final Class d;

    public PackageReference(Class jClass) {
        Intrinsics.h(jClass, "jClass");
        this.d = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PackageReference) {
            return Intrinsics.c(this.d, ((PackageReference) obj).d);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* renamed from: h, reason: from getter */
    public final Class getD() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d + " (Kotlin reflection is not available)";
    }
}
