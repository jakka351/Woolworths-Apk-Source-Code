package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor f24383a;

    public ReflectJavaConstructor(Constructor member) {
        Intrinsics.h(member, "member");
        this.f24383a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final Member I() {
        return this.f24383a;
    }

    public final Constructor K() {
        return this.f24383a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f24383a.getTypeParameters();
        Intrinsics.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    public final List h() {
        Constructor constructor = this.f24383a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        Intrinsics.e(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return EmptyList.d;
        }
        Class declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) ArraysKt.z(1, genericParameterTypes.length, genericParameterTypes);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                parameterAnnotations = (Annotation[][]) ArraysKt.z(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
            }
            return J(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + constructor);
    }
}
