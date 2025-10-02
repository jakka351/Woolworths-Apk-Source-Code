package kotlin.reflect.jvm.internal.impl.types;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes7.dex */
public class DescriptorSubstitutor {
    public static /* synthetic */ void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = lqlqqlq.m006Dm006Dm006Dm;
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static TypeSubstitutor b(List list, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, ArrayList arrayList) {
        if (typeSubstitution == null) {
            a(1);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        TypeSubstitutor typeSubstitutorC = c(list, typeSubstitution, declarationDescriptor, arrayList, null);
        if (typeSubstitutorC != null) {
            return typeSubstitutorC;
        }
        throw new AssertionError("Substitution failed");
    }

    public static TypeSubstitutor c(List list, final TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, List list2, boolean[] zArr) {
        if (typeSubstitution == null) {
            a(6);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it.next();
            TypeParameterDescriptorImpl typeParameterDescriptorImplK0 = TypeParameterDescriptorImpl.K0(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.x(), typeParameterDescriptor.j(), typeParameterDescriptor.getName(), i, typeParameterDescriptor.d0());
            map.put(typeParameterDescriptor.m(), new TypeProjectionImpl(typeParameterDescriptorImplK0.t()));
            map2.put(typeParameterDescriptor, typeParameterDescriptorImplK0);
            list2.add(typeParameterDescriptorImplK0);
            i++;
        }
        TypeConstructorSubstitution$Companion$createByConstructorsMap$1 typeConstructorSubstitution$Companion$createByConstructorsMap$1 = new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(map);
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(typeSubstitution, typeConstructorSubstitution$Companion$createByConstructorsMap$1);
        TypeSubstitutor typeSubstitutorF2 = TypeSubstitutor.f(new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$replaceWithNonApproximating$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final Annotations d(Annotations annotations) {
                Intrinsics.h(annotations, "annotations");
                return typeSubstitution.d(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final TypeProjection e(KotlinType kotlinType) {
                return typeSubstitution.e(kotlinType);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final boolean f() {
                return typeSubstitution.f();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final KotlinType g(KotlinType topLevelType, Variance position) {
                Intrinsics.h(topLevelType, "topLevelType");
                Intrinsics.h(position, "position");
                return typeSubstitution.g(topLevelType, position);
            }
        }, typeConstructorSubstitution$Companion$createByConstructorsMap$1);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) it2.next();
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) map2.get(typeParameterDescriptor2);
            for (KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
                KotlinType kotlinTypeK = (((classifierDescriptorC instanceof TypeParameterDescriptor) && TypeUtilsKt.k((TypeParameterDescriptor) classifierDescriptorC, null, 6)) ? typeSubstitutorF : typeSubstitutorF2).k(kotlinType, Variance.h);
                if (kotlinTypeK == null) {
                    return null;
                }
                if (kotlinTypeK != kotlinType && zArr != null) {
                    zArr[0] = true;
                }
                if (typeParameterDescriptorImpl.o) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + typeParameterDescriptorImpl.M0());
                }
                if (!KotlinTypeKt.a(kotlinTypeK)) {
                    typeParameterDescriptorImpl.n.add(kotlinTypeK);
                }
            }
            if (typeParameterDescriptorImpl.o) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + typeParameterDescriptorImpl.M0());
            }
            typeParameterDescriptorImpl.o = true;
        }
        return typeSubstitutorF;
    }
}
