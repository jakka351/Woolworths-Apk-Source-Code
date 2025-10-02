package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes7.dex */
class KClasses$$Lambda$1 implements DFS.Neighbors {
    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        KType kType = (KType) obj;
        KClassifier d = kType.getD();
        KClass kClass = d instanceof KClass ? (KClass) d : null;
        if (kClass == null) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + kType);
        }
        List listA = kClass.a();
        if (kType.getE().isEmpty()) {
            return listA;
        }
        TypeSubstitutor typeSubstitutorD = TypeSubstitutor.d(((KTypeImpl) kType).d);
        List<KType> list = listA;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (KType kType2 : list) {
            Intrinsics.f(kType2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            KotlinType kotlinTypeK = typeSubstitutorD.k(((KTypeImpl) kType2).d, Variance.f);
            if (kotlinTypeK == null) {
                throw new KotlinReflectionInternalError("Type substitution failed: " + kType2 + " (" + kType + ')');
            }
            arrayList.add(new KTypeImpl(kotlinTypeK, null));
        }
        return arrayList;
    }
}
