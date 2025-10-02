package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.JvmPropertySignature;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RuntimeTypeMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final ClassId f24293a = ClassId.Companion.b(new FqName("java.lang.Void"));

    public static JvmFunctionSignature.KotlinFunction a(FunctionDescriptor functionDescriptor) {
        String strA = SpecialBuiltinMembers.a(functionDescriptor);
        if (strA == null) {
            if (functionDescriptor instanceof PropertyGetterDescriptor) {
                String strB = DescriptorUtilsKt.l(functionDescriptor).getName().b();
                Intrinsics.g(strB, "asString(...)");
                strA = JvmAbi.a(strB);
            } else if (functionDescriptor instanceof PropertySetterDescriptor) {
                String strB2 = DescriptorUtilsKt.l(functionDescriptor).getName().b();
                Intrinsics.g(strB2, "asString(...)");
                strA = JvmAbi.b(strB2);
            } else {
                strA = functionDescriptor.getName().b();
                Intrinsics.g(strA, "asString(...)");
            }
        }
        return new JvmFunctionSignature.KotlinFunction(new JvmMemberSignature.Method(strA, MethodSignatureMappingKt.a(functionDescriptor, 1)));
    }

    public static JvmPropertySignature b(PropertyDescriptor possiblyOverriddenProperty) {
        Intrinsics.h(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        PropertyDescriptor propertyDescriptorH0 = ((PropertyDescriptor) DescriptorUtils.t(possiblyOverriddenProperty)).H0();
        Intrinsics.g(propertyDescriptorH0, "getOriginal(...)");
        if (propertyDescriptorH0 instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) propertyDescriptorH0;
            ProtoBuf.Property propertyP0 = deserializedPropertyDescriptor.P0();
            GeneratedMessageLite.GeneratedExtension propertySignature = JvmProtoBuf.d;
            Intrinsics.g(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a(propertyP0, propertySignature);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature.KotlinProperty(propertyDescriptorH0, propertyP0, jvmPropertySignature, deserializedPropertyDescriptor.a0(), deserializedPropertyDescriptor.A());
            }
        } else if (propertyDescriptorH0 instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) propertyDescriptorH0;
            SourceElement sourceElementG = javaPropertyDescriptor.g();
            JavaSourceElement javaSourceElement = sourceElementG instanceof JavaSourceElement ? (JavaSourceElement) sourceElementG : null;
            ReflectJavaElement reflectJavaElementB = javaSourceElement != null ? javaSourceElement.b() : null;
            if (reflectJavaElementB instanceof ReflectJavaField) {
                return new JvmPropertySignature.JavaField(((ReflectJavaField) reflectJavaElementB).K());
            }
            if (!(reflectJavaElementB instanceof ReflectJavaMethod)) {
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + propertyDescriptorH0 + " (source = " + reflectJavaElementB + ')');
            }
            Method methodK = ((ReflectJavaMethod) reflectJavaElementB).K();
            PropertySetterDescriptor propertySetterDescriptor = javaPropertyDescriptor.A;
            SourceElement sourceElementG2 = propertySetterDescriptor != null ? propertySetterDescriptor.g() : null;
            JavaSourceElement javaSourceElement2 = sourceElementG2 instanceof JavaSourceElement ? (JavaSourceElement) sourceElementG2 : null;
            ReflectJavaElement reflectJavaElementB2 = javaSourceElement2 != null ? javaSourceElement2.b() : null;
            ReflectJavaMethod reflectJavaMethod = reflectJavaElementB2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) reflectJavaElementB2 : null;
            return new JvmPropertySignature.JavaMethodProperty(methodK, reflectJavaMethod != null ? reflectJavaMethod.K() : null);
        }
        PropertyGetterDescriptorImpl getter = propertyDescriptorH0.getGetter();
        Intrinsics.e(getter);
        JvmFunctionSignature.KotlinFunction kotlinFunctionA = a(getter);
        PropertySetterDescriptor propertySetterDescriptorC = propertyDescriptorH0.c();
        return new JvmPropertySignature.MappedKotlinProperty(kotlinFunctionA, propertySetterDescriptorC != null ? a(propertySetterDescriptorC) : null);
    }

    public static JvmFunctionSignature c(FunctionDescriptor possiblySubstitutedFunction) {
        Method methodK;
        Intrinsics.h(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        FunctionDescriptor functionDescriptorH0 = ((FunctionDescriptor) DescriptorUtils.t(possiblySubstitutedFunction)).H0();
        Intrinsics.g(functionDescriptorH0, "getOriginal(...)");
        if (!(functionDescriptorH0 instanceof DeserializedCallableMemberDescriptor)) {
            if (functionDescriptorH0 instanceof JavaMethodDescriptor) {
                SourceElement sourceElementG = ((JavaMethodDescriptor) functionDescriptorH0).g();
                JavaSourceElement javaSourceElement = sourceElementG instanceof JavaSourceElement ? (JavaSourceElement) sourceElementG : null;
                ReflectJavaElement reflectJavaElementB = javaSourceElement != null ? javaSourceElement.b() : null;
                ReflectJavaMethod reflectJavaMethod = reflectJavaElementB instanceof ReflectJavaMethod ? (ReflectJavaMethod) reflectJavaElementB : null;
                if (reflectJavaMethod != null && (methodK = reflectJavaMethod.K()) != null) {
                    return new JvmFunctionSignature.JavaMethod(methodK);
                }
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + functionDescriptorH0);
            }
            if (!(functionDescriptorH0 instanceof JavaClassConstructorDescriptor)) {
                if (!DescriptorFactory.m(functionDescriptorH0) && !DescriptorFactory.n(functionDescriptorH0)) {
                    Name name = functionDescriptorH0.getName();
                    Name name2 = CloneableClassScope.e;
                    if (!Intrinsics.c(name, CloneableClassScope.Companion.a()) || !functionDescriptorH0.h().isEmpty()) {
                        throw new KotlinReflectionInternalError("Unknown origin of " + functionDescriptorH0 + " (" + functionDescriptorH0.getClass() + ')');
                    }
                }
                return a(functionDescriptorH0);
            }
            SourceElement sourceElementG2 = ((JavaClassConstructorDescriptor) functionDescriptorH0).g();
            JavaSourceElement javaSourceElement2 = sourceElementG2 instanceof JavaSourceElement ? (JavaSourceElement) sourceElementG2 : null;
            ReflectJavaElement reflectJavaElementB2 = javaSourceElement2 != null ? javaSourceElement2.b() : null;
            if (reflectJavaElementB2 instanceof ReflectJavaConstructor) {
                return new JvmFunctionSignature.JavaConstructor(((ReflectJavaConstructor) reflectJavaElementB2).K());
            }
            if (reflectJavaElementB2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) reflectJavaElementB2;
                if (reflectJavaClass.i()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.I());
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + functionDescriptorH0 + " (" + reflectJavaElementB2 + ')');
        }
        DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) functionDescriptorH0;
        MessageLite messageLiteJ = deserializedMemberDescriptor.J();
        if (messageLiteJ instanceof ProtoBuf.Function) {
            ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f24497a;
            JvmMemberSignature.Method methodC = JvmProtoBufUtil.c((ProtoBuf.Function) messageLiteJ, deserializedMemberDescriptor.a0(), deserializedMemberDescriptor.A());
            if (methodC != null) {
                return new JvmFunctionSignature.KotlinFunction(methodC);
            }
        }
        if (messageLiteJ instanceof ProtoBuf.Constructor) {
            ExtensionRegistryLite extensionRegistryLite2 = JvmProtoBufUtil.f24497a;
            JvmMemberSignature.Method methodA = JvmProtoBufUtil.a((ProtoBuf.Constructor) messageLiteJ, deserializedMemberDescriptor.a0(), deserializedMemberDescriptor.A());
            if (methodA != null) {
                DeclarationDescriptor declarationDescriptorE = possiblySubstitutedFunction.e();
                Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
                if (InlineClassesUtilsKt.b(declarationDescriptorE)) {
                    return new JvmFunctionSignature.KotlinFunction(methodA);
                }
                DeclarationDescriptor declarationDescriptorE2 = possiblySubstitutedFunction.e();
                Intrinsics.g(declarationDescriptorE2, "getContainingDeclaration(...)");
                if (!InlineClassesUtilsKt.d(declarationDescriptorE2)) {
                    return new JvmFunctionSignature.KotlinConstructor(methodA);
                }
                ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) possiblySubstitutedFunction;
                if (constructorDescriptor.k0()) {
                    if (!Intrinsics.c(methodA.d(), "constructor-impl") || !StringsKt.v(methodA.c(), ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + methodA).toString());
                    }
                } else {
                    if (!Intrinsics.c(methodA.d(), "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + methodA).toString());
                    }
                    ClassDescriptor classDescriptorI = constructorDescriptor.I();
                    Intrinsics.g(classDescriptorI, "getConstructedClass(...)");
                    String strI = ValueClassAwareCallerKt.i(classDescriptorI);
                    if (StringsKt.v(methodA.c(), ")V", false)) {
                        methodA = JvmMemberSignature.Method.b(methodA, StringsKt.N(methodA.c(), "V") + strI);
                    } else if (!StringsKt.v(methodA.c(), strI, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + methodA).toString());
                    }
                }
                return new JvmFunctionSignature.KotlinFunction(methodA);
            }
        }
        return a(functionDescriptorH0);
    }
}
