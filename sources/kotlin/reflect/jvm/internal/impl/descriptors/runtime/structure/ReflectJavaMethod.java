package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaMethod extends ReflectJavaMember implements JavaMethod {

    /* renamed from: a, reason: collision with root package name */
    public final Method f24385a;

    public ReflectJavaMethod(Method member) {
        Intrinsics.h(member, "member");
        this.f24385a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final ReflectJavaType B() {
        Type genericReturnType = this.f24385a.getGenericReturnType();
        Intrinsics.g(genericReturnType, "getGenericReturnType(...)");
        return ReflectJavaType.Factory.a(genericReturnType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final boolean G() {
        Object defaultValue = this.f24385a.getDefaultValue();
        return (defaultValue != null ? ReflectJavaAnnotationArgument.Factory.a(defaultValue, null) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final Member I() {
        return this.f24385a;
    }

    public final Method K() {
        return this.f24385a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f24385a.getTypeParameters();
        Intrinsics.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final List h() {
        Method method = this.f24385a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.g(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Intrinsics.g(parameterAnnotations, "getParameterAnnotations(...)");
        return J(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }
}
