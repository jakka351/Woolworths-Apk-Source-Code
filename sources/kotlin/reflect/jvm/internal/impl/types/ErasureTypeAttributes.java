package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

@SourceDebugExtension
/* loaded from: classes7.dex */
public class ErasureTypeAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final TypeUsage f24605a;
    public final Set b;
    public final SimpleType c;

    public ErasureTypeAttributes(TypeUsage howThisTypeIsUsed, Set set, SimpleType simpleType) {
        Intrinsics.h(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f24605a = howThisTypeIsUsed;
        this.b = set;
        this.c = simpleType;
    }

    public SimpleType a() {
        return this.c;
    }

    public TypeUsage b() {
        return this.f24605a;
    }

    public Set c() {
        return this.b;
    }

    public ErasureTypeAttributes d(TypeParameterDescriptor typeParameterDescriptor) {
        TypeUsage typeUsageB = b();
        Set setC = c();
        return new ErasureTypeAttributes(typeUsageB, setC != null ? SetsKt.h(setC, typeParameterDescriptor) : SetsKt.i(typeParameterDescriptor), a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return Intrinsics.c(erasureTypeAttributes.a(), a()) && erasureTypeAttributes.b() == b();
    }

    public int hashCode() {
        SimpleType simpleTypeA = a();
        int iHashCode = simpleTypeA != null ? simpleTypeA.hashCode() : 0;
        return b().hashCode() + (iHashCode * 31) + iHashCode;
    }
}
