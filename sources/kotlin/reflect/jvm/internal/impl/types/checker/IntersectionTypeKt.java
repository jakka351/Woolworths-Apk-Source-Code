package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class IntersectionTypeKt {
    public static final UnwrappedType a(ArrayList arrayList) {
        SimpleType simpleType;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (UnwrappedType) CollectionsKt.m0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            UnwrappedType unwrappedType = (UnwrappedType) it.next();
            z = z || KotlinTypeKt.a(unwrappedType);
            if (unwrappedType instanceof SimpleType) {
                simpleType = (SimpleType) unwrappedType;
            } else {
                if (!(unwrappedType instanceof FlexibleType)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (DynamicTypesKt.a(unwrappedType)) {
                    return unwrappedType;
                }
                simpleType = ((FlexibleType) unwrappedType).e;
                z2 = true;
            }
            arrayList2.add(simpleType);
        }
        if (z) {
            return ErrorUtils.c(ErrorTypeKind.A, arrayList.toString());
        }
        TypeIntersector typeIntersector = TypeIntersector.f24631a;
        if (!z2) {
            return typeIntersector.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(FlexibleTypesKt.d((UnwrappedType) it2.next()));
        }
        return KotlinTypeFactory.a(typeIntersector.b(arrayList2), typeIntersector.b(arrayList3));
    }
}
