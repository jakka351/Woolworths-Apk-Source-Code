package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CapturedTypeConstructorKt {
    public static final TypeProjection a(final TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.b() == Variance.f) {
            return typeProjection;
        }
        if (typeParameterDescriptor.j() != typeProjection.b()) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = new CapturedTypeConstructorImpl(typeProjection);
            TypeAttributes.e.getClass();
            return new TypeProjectionImpl(new CapturedType(typeProjection, capturedTypeConstructorImpl, false, TypeAttributes.f));
        }
        if (!typeProjection.a()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager NO_LOCKS = LockBasedStorageManager.e;
        Intrinsics.g(NO_LOCKS, "NO_LOCKS");
        return new TypeProjectionImpl(new LazyWrappedType(NO_LOCKS, new Function0(typeProjection) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$$Lambda$0
            public final TypeProjection d;

            {
                this.d = typeProjection;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KotlinType type = this.d.getType();
                Intrinsics.g(type, "getType(...)");
                return type;
            }
        }));
    }

    public static TypeSubstitution b(TypeSubstitution typeSubstitution) {
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2(typeSubstitution);
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] typeParameterDescriptorArr = indexedParametersSubstitution.b;
        ArrayList arrayListT0 = ArraysKt.t0(indexedParametersSubstitution.c, typeParameterDescriptorArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListT0, 10));
        Iterator it = arrayListT0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(a((TypeProjection) pair.d, (TypeParameterDescriptor) pair.e));
        }
        return new IndexedParametersSubstitution(typeParameterDescriptorArr, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), true);
    }
}
