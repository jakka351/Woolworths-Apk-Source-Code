package kotlin.reflect.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerKt;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "signature", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {
    public static final /* synthetic */ KProperty[] p = {Reflection.f24268a.h(new PropertyReference1Impl(KFunctionImpl.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};
    public final KDeclarationContainerImpl j;
    public final String k;
    public final Object l;
    public final ReflectProperties.LazySoftVal m;
    public final Object n;
    public final Object o;

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, final String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.j = kDeclarationContainerImpl;
        this.k = str2;
        this.l = obj;
        this.m = ReflectProperties.a(functionDescriptor, new Function0(this, str) { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$0
            public final KFunctionImpl d;
            public final String e;

            {
                this.d = this;
                this.e = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instructions count: 322
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$0.invoke():java.lang.Object");
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        this.n = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$1
            public final KFunctionImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws NoSuchMethodException, SecurityException {
                Object objQ;
                CallerImpl callerImplD;
                CallerImpl boundJvmStaticInObject;
                KProperty[] kPropertyArr = KFunctionImpl.p;
                ClassId classId = RuntimeTypeMapper.f24293a;
                KFunctionImpl kFunctionImpl = this.d;
                FunctionDescriptor functionDescriptorT = kFunctionImpl.t();
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.j;
                JvmFunctionSignature jvmFunctionSignatureC = RuntimeTypeMapper.c(functionDescriptorT);
                if (jvmFunctionSignatureC instanceof JvmFunctionSignature.KotlinConstructor) {
                    if (kFunctionImpl.v()) {
                        Class e = kDeclarationContainerImpl2.getE();
                        List parameters = kFunctionImpl.getParameters();
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((KParameter) it.next()).getName();
                            Intrinsics.e(name);
                            arrayList.add(name);
                        }
                        AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.e;
                        AnnotationConstructorCaller.Origin origin = AnnotationConstructorCaller.Origin.d;
                        return new AnnotationConstructorCaller(e, arrayList, callMode);
                    }
                    String desc = ((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureC).f24282a.b;
                    kDeclarationContainerImpl2.getClass();
                    Intrinsics.h(desc, "desc");
                    objQ = KDeclarationContainerImpl.F(kDeclarationContainerImpl2.getE(), kDeclarationContainerImpl2.D(desc, false).f24290a);
                } else if (jvmFunctionSignatureC instanceof JvmFunctionSignature.KotlinFunction) {
                    FunctionDescriptor functionDescriptorT2 = kFunctionImpl.t();
                    DeclarationDescriptor declarationDescriptorE = functionDescriptorT2.e();
                    Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.d(declarationDescriptorE) && (functionDescriptorT2 instanceof ConstructorDescriptor) && ((ConstructorDescriptor) functionDescriptorT2).k0()) {
                        FunctionDescriptor functionDescriptorT3 = kFunctionImpl.t();
                        String str3 = ((JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureC).f24283a.b;
                        List listH = kFunctionImpl.t().h();
                        Intrinsics.g(listH, "getValueParameters(...)");
                        return new ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller(functionDescriptorT3, kDeclarationContainerImpl2, str3, listH);
                    }
                    JvmMemberSignature.Method method = ((JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureC).f24283a;
                    objQ = kDeclarationContainerImpl2.q(method.f24495a, method.b);
                } else if (jvmFunctionSignatureC instanceof JvmFunctionSignature.JavaMethod) {
                    objQ = ((JvmFunctionSignature.JavaMethod) jvmFunctionSignatureC).f24281a;
                } else {
                    if (!(jvmFunctionSignatureC instanceof JvmFunctionSignature.JavaConstructor)) {
                        if (!(jvmFunctionSignatureC instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List list = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureC).f24279a;
                        Class e2 = kDeclarationContainerImpl2.getE();
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new AnnotationConstructorCaller(e2, arrayList2, AnnotationConstructorCaller.CallMode.e, AnnotationConstructorCaller.Origin.d, list);
                    }
                    objQ = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureC).f24280a;
                    Intrinsics.f(objQ, "null cannot be cast to non-null type java.lang.reflect.Member");
                }
                if (objQ instanceof Constructor) {
                    callerImplD = kFunctionImpl.C((Constructor) objQ, kFunctionImpl.t(), false);
                } else {
                    if (!(objQ instanceof Method)) {
                        throw new KotlinReflectionInternalError("Could not compute caller for function: " + kFunctionImpl.t() + " (member = " + objQ + ')');
                    }
                    Method method2 = (Method) objQ;
                    if (!Modifier.isStatic(method2.getModifiers())) {
                        boundJvmStaticInObject = kFunctionImpl.A() ? new CallerImpl.Method.BoundInstance(method2, ValueClassAwareCallerKt.a(kFunctionImpl.l, kFunctionImpl.t())) : new CallerImpl.Method.Instance(method2);
                    } else if (kFunctionImpl.t().getAnnotations().H(UtilKt.f24294a) != null) {
                        boundJvmStaticInObject = kFunctionImpl.A() ? new CallerImpl.Method.BoundJvmStaticInObject(4, method2, false) : new CallerImpl.Method.JvmStaticInObject(4, method2, true);
                    } else {
                        callerImplD = kFunctionImpl.D(method2, false);
                    }
                    callerImplD = boundJvmStaticInObject;
                }
                return ValueClassAwareCallerKt.b(callerImplD, kFunctionImpl.t(), false);
            }
        });
        this.o = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$2
            public final KFunctionImpl d;

            {
                this.d = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[EDGE_INSN: B:99:0x00f9->B:46:0x00f9 BREAK  A[LOOP:2: B:19:0x0077->B:100:?]] */
            /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instructions count: 574
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$2.invoke():java.lang.Object");
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final boolean A() {
        return this.l != CallableReference.NO_RECEIVER;
    }

    public final CallerImpl C(Constructor constructor, FunctionDescriptor functionDescriptor, boolean z) {
        Object obj = this.l;
        Class<?> cls = null;
        if (!z) {
            ClassConstructorDescriptor classConstructorDescriptor = functionDescriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) functionDescriptor : null;
            if (classConstructorDescriptor != null && !DescriptorVisibilities.e(classConstructorDescriptor.getVisibility())) {
                ClassDescriptor classDescriptorI = classConstructorDescriptor.I();
                Intrinsics.g(classDescriptorI, "getConstructedClass(...)");
                if (!InlineClassesUtilsKt.f(classDescriptorI) && !DescriptorUtils.q(classConstructorDescriptor.I())) {
                    List listH = classConstructorDescriptor.h();
                    Intrinsics.g(listH, "getValueParameters(...)");
                    List list = listH;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
                            Intrinsics.g(type, "getType(...)");
                            if (InlineClassManglingRulesKt.a(type)) {
                                if (A()) {
                                    return new CallerImpl.AccessorForHiddenBoundConstructor(constructor, ValueClassAwareCallerKt.a(obj, t()));
                                }
                                Class declaringClass = constructor.getDeclaringClass();
                                Intrinsics.g(declaringClass, "getDeclaringClass(...)");
                                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                Intrinsics.g(genericParameterTypes, "getGenericParameterTypes(...)");
                                return new CallerImpl.AccessorForHiddenConstructor(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt.z(0, genericParameterTypes.length - 1, genericParameterTypes)));
                            }
                        }
                    }
                }
            }
        }
        if (A()) {
            return new CallerImpl.BoundConstructor(constructor, ValueClassAwareCallerKt.a(obj, t()));
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        Intrinsics.g(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        Intrinsics.g(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new CallerImpl.Constructor(constructor, declaringClass2, cls, genericParameterTypes2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.calls.CallerImpl.Method D(java.lang.reflect.Method r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.A()
            if (r0 == 0) goto L45
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundStatic r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundStatic
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = r5.t()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = r1.c0()
            java.lang.Object r2 = r5.l
            if (r1 == 0) goto L39
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            if (r1 == 0) goto L39
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.c(r1)
            r3 = 1
            if (r1 != r3) goto L39
            java.lang.Class[] r1 = r6.getParameterTypes()
            java.lang.String r4 = "getParameterTypes(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r4)
            java.lang.Object r1 = kotlin.collections.ArraysKt.H(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L39
            boolean r1 = r1.isInterface()
            if (r1 != r3) goto L39
            goto L41
        L39:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = r5.t()
            java.lang.Object r2 = kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.a(r2, r1)
        L41:
            r0.<init>(r6, r7, r2)
            return r0
        L45:
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Static r7 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Static
            r0 = 0
            r1 = 6
            r7.<init>(r1, r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl.D(java.lang.reflect.Method, boolean):kotlin.reflect.jvm.internal.calls.CallerImpl$Method");
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final FunctionDescriptor t() {
        KProperty kProperty = p[0];
        Object objInvoke = this.m.invoke();
        Intrinsics.g(objInvoke, "getValue(...)");
        return (FunctionDescriptor) objInvoke;
    }

    public final boolean equals(Object obj) {
        KFunctionImpl kFunctionImplB = UtilKt.b(obj);
        return kFunctionImplB != null && Intrinsics.c(this.j, kFunctionImplB.j) && getK().equals(kFunctionImplB.getK()) && Intrinsics.c(this.k, kFunctionImplB.k) && Intrinsics.c(this.l, kFunctionImplB.l);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: getArity */
    public final int getP() {
        return CallerKt.a(q());
    }

    @Override // kotlin.reflect.KCallable
    /* renamed from: getName */
    public final String getK() {
        String strB = t().getName().b();
        Intrinsics.g(strB, "asString(...)");
        return strB;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((getK().hashCode() + (this.j.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return t().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return t().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return t().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return t().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return t().isSuspend();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final Caller q() {
        return (Caller) this.n.getD();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: r, reason: from getter */
    public final KDeclarationContainerImpl getJ() {
        return this.j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final Caller s() {
        return (Caller) this.o.getD();
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f24292a;
        return ReflectionObjectRenderer.b(t());
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String name, String signature, Object obj) {
        this(kDeclarationContainerImpl, name, signature, null, obj);
        Intrinsics.h(name, "name");
        Intrinsics.h(signature, "signature");
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, FunctionDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        Intrinsics.g(strB, "asString(...)");
        this(kDeclarationContainerImpl, strB, RuntimeTypeMapper.c(descriptor).getB(), descriptor, CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.jvm.functions.Function9
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // kotlin.jvm.functions.Function10
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.jvm.functions.Function12
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // kotlin.jvm.functions.Function13
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // kotlin.jvm.functions.Function14
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }
}
