package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MappingUtilKt {
    public static final TypeConstructorSubstitution$Companion$createByConstructorsMap$1 a(ClassDescriptor from, ClassDescriptor to) {
        Intrinsics.h(from, "from");
        Intrinsics.h(to, "to");
        from.u().size();
        to.u().size();
        List listU = from.u();
        Intrinsics.g(listU, "getDeclaredTypeParameters(...)");
        List list = listU;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeParameterDescriptor) it.next()).m());
        }
        List listU2 = to.u();
        Intrinsics.g(listU2, "getDeclaredTypeParameters(...)");
        List list2 = listU2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            SimpleType simpleTypeT = ((TypeParameterDescriptor) it2.next()).t();
            Intrinsics.g(simpleTypeT, "getDefaultType(...)");
            arrayList2.add(TypeUtilsKt.a(simpleTypeT));
        }
        return new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(MapsKt.p(CollectionsKt.Q0(arrayList, arrayList2)));
    }
}
