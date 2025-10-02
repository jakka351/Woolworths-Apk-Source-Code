package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "KotlinFunction", "KotlinConstructor", "JavaMethod", "JavaConstructor", "FakeJavaAnnotationConstructor", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class JvmFunctionSignature {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name */
        public final List f24279a;

        public FakeJavaAnnotationConstructor(Class jClass) throws SecurityException {
            Intrinsics.h(jClass, "jClass");
            Method[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.g(declaredMethods, "getDeclaredMethods(...)");
            this.f24279a = ArraysKt.f0(new JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1(), declaredMethods);
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a */
        public final String getB() {
            return CollectionsKt.M(this.f24279a, "", "<init>(", ")V", JvmFunctionSignature$FakeJavaAnnotationConstructor$$Lambda$0.d, 24);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name */
        public final Constructor f24280a;

        public JavaConstructor(Constructor constructor) {
            Intrinsics.h(constructor, "constructor");
            this.f24280a = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a */
        public final String getB() {
            Class<?>[] parameterTypes = this.f24280a.getParameterTypes();
            Intrinsics.g(parameterTypes, "getParameterTypes(...)");
            return ArraysKt.U(parameterTypes, "", "<init>(", ")V", JvmFunctionSignature$JavaConstructor$$Lambda$0.d, 24);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaMethod extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name */
        public final Method f24281a;

        public JavaMethod(Method method) {
            this.f24281a = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a */
        public final String getB() {
            return RuntimeTypeMapperKt.a(this.f24281a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KotlinConstructor extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name */
        public final JvmMemberSignature.Method f24282a;
        public final String b;

        public KotlinConstructor(JvmMemberSignature.Method method) {
            this.f24282a = method;
            this.b = method.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KotlinFunction extends JvmFunctionSignature {

        /* renamed from: a, reason: collision with root package name */
        public final JvmMemberSignature.Method f24283a;
        public final String b;

        public KotlinFunction(JvmMemberSignature.Method method) {
            this.f24283a = method;
            this.b = method.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }
    }

    /* renamed from: a */
    public abstract String getB();
}
