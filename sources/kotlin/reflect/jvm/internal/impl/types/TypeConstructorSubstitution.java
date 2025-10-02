package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes7.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {
    public static final Companion b = new Companion();

    @SourceDebugExtension
    public static final class Companion {
        public static TypeConstructorSubstitution$Companion$createByConstructorsMap$1 b(Companion companion, Map map) {
            return new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(map);
        }

        public final TypeSubstitution a(TypeConstructor typeConstructor, List arguments) {
            Intrinsics.h(typeConstructor, "typeConstructor");
            Intrinsics.h(arguments, "arguments");
            List parameters = typeConstructor.getParameters();
            Intrinsics.g(parameters, "getParameters(...)");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.P(parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.E()) {
                return new IndexedParametersSubstitution((TypeParameterDescriptor[]) parameters.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) arguments.toArray(new TypeProjection[0]), false);
            }
            List parameters2 = typeConstructor.getParameters();
            Intrinsics.g(parameters2, "getParameters(...)");
            List list = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).m());
            }
            return new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(MapsKt.p(CollectionsKt.Q0(arrayList, arguments)));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection e(KotlinType kotlinType) {
        return h(kotlinType.J0());
    }

    public abstract TypeProjection h(TypeConstructor typeConstructor);
}
