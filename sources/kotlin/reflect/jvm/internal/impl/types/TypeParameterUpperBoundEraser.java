package kotlin.reflect.jvm.internal.impl.types;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class TypeParameterUpperBoundEraser {

    /* renamed from: a, reason: collision with root package name */
    public final RawProjectionComputer f24615a;
    public final Lazy b;
    public final MemoizedFunctionToNotNull c;

    @SourceDebugExtension
    public static final class Companion {
    }

    /* loaded from: classes7.dex */
    public static final class DataToEraseUpperBound {

        /* renamed from: a, reason: collision with root package name */
        public final TypeParameterDescriptor f24616a;
        public final ErasureTypeAttributes b;

        public DataToEraseUpperBound(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
            Intrinsics.h(typeParameter, "typeParameter");
            Intrinsics.h(typeAttr, "typeAttr");
            this.f24616a = typeParameter;
            this.b = typeAttr;
        }

        public final ErasureTypeAttributes a() {
            return this.b;
        }

        public final TypeParameterDescriptor b() {
            return this.f24616a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DataToEraseUpperBound)) {
                return false;
            }
            DataToEraseUpperBound dataToEraseUpperBound = (DataToEraseUpperBound) obj;
            return Intrinsics.c(dataToEraseUpperBound.f24616a, this.f24616a) && Intrinsics.c(dataToEraseUpperBound.b, this.b);
        }

        public final int hashCode() {
            int iHashCode = this.f24616a.hashCode();
            return this.b.hashCode() + (iHashCode * 31) + iHashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f24616a + ", typeAttr=" + this.b + ')';
        }
    }

    public TypeParameterUpperBoundEraser(RawProjectionComputer rawProjectionComputer) {
        this.f24615a = rawProjectionComputer;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.b = LazyKt.b(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$$Lambda$0
            public final TypeParameterUpperBoundEraser d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ErrorUtils.c(ErrorTypeKind.B, this.d.toString());
            }
        });
        this.c = lockBasedStorageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$$Lambda$1
            public final TypeParameterUpperBoundEraser d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TypeParameterUpperBoundEraser.DataToEraseUpperBound dataToEraseUpperBound = (TypeParameterUpperBoundEraser.DataToEraseUpperBound) obj;
                TypeParameterDescriptor typeParameterDescriptorB = dataToEraseUpperBound.b();
                ErasureTypeAttributes erasureTypeAttributesA = dataToEraseUpperBound.a();
                Set setC = erasureTypeAttributesA.c();
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.d;
                if (setC != null && setC.contains(typeParameterDescriptorB.H0())) {
                    return typeParameterUpperBoundEraser.a(erasureTypeAttributesA);
                }
                SimpleType simpleTypeT = typeParameterDescriptorB.t();
                Intrinsics.g(simpleTypeT, "getDefaultType(...)");
                LinkedHashSet<TypeParameterDescriptor> linkedHashSetF = TypeUtilsKt.f(simpleTypeT, setC);
                int iH = MapsKt.h(CollectionsKt.s(linkedHashSetF, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                for (TypeParameterDescriptor typeParameterDescriptor : linkedHashSetF) {
                    linkedHashMap.put(typeParameterDescriptor.m(), (setC == null || !setC.contains(typeParameterDescriptor)) ? typeParameterUpperBoundEraser.f24615a.a(typeParameterDescriptor, erasureTypeAttributesA, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.b(typeParameterDescriptor, erasureTypeAttributesA.d(typeParameterDescriptorB))) : TypeUtils.l(typeParameterDescriptor, erasureTypeAttributesA));
                }
                TypeSubstitutor typeSubstitutorE = TypeSubstitutor.e(TypeConstructorSubstitution.Companion.b(TypeConstructorSubstitution.b, linkedHashMap));
                List upperBounds = typeParameterDescriptorB.getUpperBounds();
                Intrinsics.g(upperBounds, "getUpperBounds(...)");
                SetBuilder setBuilderC = typeParameterUpperBoundEraser.c(typeSubstitutorE, upperBounds, erasureTypeAttributesA);
                if (setBuilderC.d.isEmpty()) {
                    return typeParameterUpperBoundEraser.a(erasureTypeAttributesA);
                }
                if (setBuilderC.d.l == 1) {
                    return (KotlinType) CollectionsKt.m0(setBuilderC);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            }
        });
    }

    public final UnwrappedType a(ErasureTypeAttributes erasureTypeAttributes) {
        UnwrappedType unwrappedTypeP;
        SimpleType simpleTypeA = erasureTypeAttributes.a();
        return (simpleTypeA == null || (unwrappedTypeP = TypeUtilsKt.p(simpleTypeA)) == null) ? (ErrorType) this.b.getD() : unwrappedTypeP;
    }

    public final KotlinType b(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        Intrinsics.h(typeParameter, "typeParameter");
        Intrinsics.h(typeAttr, "typeAttr");
        Object objInvoke = this.c.invoke(new DataToEraseUpperBound(typeParameter, typeAttr));
        Intrinsics.g(objInvoke, "invoke(...)");
        return (KotlinType) objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.collections.builders.SetBuilder c(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r17, java.util.List r18, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes r19) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.c(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor, java.util.List, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes):kotlin.collections.builders.SetBuilder");
    }
}
