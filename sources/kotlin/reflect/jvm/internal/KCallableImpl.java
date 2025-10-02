package kotlin.reflect.jvm.internal;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {
    public final ReflectProperties.LazySoftVal d = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$0
        public final KCallableImpl d;

        {
            this.d = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UtilKt.d(this.d.t());
        }
    });
    public final ReflectProperties.LazySoftVal e = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$1
        public final KCallableImpl d;

        {
            this.d = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i;
            KCallableImpl kCallableImpl = this.d;
            final CallableMemberDescriptor callableMemberDescriptorT = kCallableImpl.t();
            ArrayList arrayList = new ArrayList();
            final int i2 = 0;
            if (kCallableImpl.A()) {
                i = 0;
            } else {
                final ReceiverParameterDescriptor receiverParameterDescriptorG = UtilKt.g(callableMemberDescriptorT);
                if (receiverParameterDescriptorG != null) {
                    arrayList.add(new KParameterImpl(kCallableImpl, 0, KParameter.Kind.d, new Function0(receiverParameterDescriptorG) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$6
                        public final ReceiverParameterDescriptor d;

                        {
                            this.d = receiverParameterDescriptorG;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.d;
                        }
                    }));
                    i = 1;
                } else {
                    i = 0;
                }
                final ReceiverParameterDescriptor receiverParameterDescriptorE0 = callableMemberDescriptorT.e0();
                if (receiverParameterDescriptorE0 != null) {
                    arrayList.add(new KParameterImpl(kCallableImpl, i, KParameter.Kind.e, new Function0(receiverParameterDescriptorE0) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$7
                        public final ReceiverParameterDescriptor d;

                        {
                            this.d = receiverParameterDescriptorE0;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.d;
                        }
                    }));
                    i++;
                }
            }
            int size = callableMemberDescriptorT.h().size();
            while (i2 < size) {
                arrayList.add(new KParameterImpl(kCallableImpl, i, KParameter.Kind.f, new Function0(callableMemberDescriptorT, i2) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$8
                    public final CallableMemberDescriptor d;
                    public final int e;

                    {
                        this.d = callableMemberDescriptorT;
                        this.e = i2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object obj = this.d.h().get(this.e);
                        Intrinsics.g(obj, "get(...)");
                        return (ParameterDescriptor) obj;
                    }
                }));
                i2++;
                i++;
            }
            if (kCallableImpl.v() && (callableMemberDescriptorT instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
                CollectionsKt.s0(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$lambda$5$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ComparisonsKt.a(((KParameter) obj).getName(), ((KParameter) obj2).getName());
                    }
                });
            }
            arrayList.trimToSize();
            return arrayList;
        }
    });
    public final ReflectProperties.LazySoftVal f = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$2
        public final KCallableImpl d;

        {
            this.d = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            final KCallableImpl kCallableImpl = this.d;
            KotlinType returnType = kCallableImpl.t().getReturnType();
            Intrinsics.e(returnType);
            return new KTypeImpl(returnType, new Function0(kCallableImpl) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$9
                public final KCallableImpl d;

                {
                    this.d = kCallableImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Type[] lowerBounds;
                    KCallableImpl kCallableImpl2 = this.d;
                    Type type = null;
                    if (kCallableImpl2.isSuspend()) {
                        Object objP = CollectionsKt.P(kCallableImpl2.q().getD());
                        ParameterizedType parameterizedType = objP instanceof ParameterizedType ? (ParameterizedType) objP : null;
                        if (Intrinsics.c(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                            Intrinsics.g(actualTypeArguments, "getActualTypeArguments(...)");
                            Object objD0 = ArraysKt.d0(actualTypeArguments);
                            WildcardType wildcardType = objD0 instanceof WildcardType ? (WildcardType) objD0 : null;
                            if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                                type = (Type) ArraysKt.G(lowerBounds);
                            }
                        }
                    }
                    return type == null ? kCallableImpl2.q().getB() : type;
                }
            });
        }
    });
    public final ReflectProperties.LazySoftVal g = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$3
        public final KCallableImpl d;

        {
            this.d = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KCallableImpl kCallableImpl = this.d;
            List typeParameters = kCallableImpl.t().getTypeParameters();
            Intrinsics.g(typeParameters, "getTypeParameters(...)");
            List<TypeParameterDescriptor> list = typeParameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                Intrinsics.e(typeParameterDescriptor);
                arrayList.add(new KTypeParameterImpl(kCallableImpl, typeParameterDescriptor));
            }
            return arrayList;
        }
    });
    public final ReflectProperties.LazySoftVal h = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$4
        public final KCallableImpl d;

        {
            this.d = this;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int iU;
            KCallableImpl kCallableImpl = this.d;
            List<KParameter> parameters = kCallableImpl.getParameters();
            int size = (kCallableImpl.isSuspend() ? 1 : 0) + parameters.size();
            if (((Boolean) kCallableImpl.i.getD()).booleanValue()) {
                iU = 0;
                for (KParameter kParameter : parameters) {
                    iU += kParameter.f() == KParameter.Kind.f ? kCallableImpl.u(kParameter) : 0;
                }
            } else {
                List list = parameters;
                if ((list instanceof Collection) && list.isEmpty()) {
                    iU = 0;
                } else {
                    Iterator it = list.iterator();
                    iU = 0;
                    while (it.hasNext()) {
                        if (((KParameter) it.next()).f() == KParameter.Kind.f && (iU = iU + 1) < 0) {
                            CollectionsKt.y0();
                            throw null;
                        }
                    }
                }
            }
            int i = (iU + 31) / 32;
            Object[] objArr = new Object[size + i + 1];
            for (KParameter kParameter2 : parameters) {
                if (kParameter2.k()) {
                    KTypeImpl type = kParameter2.getType();
                    FqName fqName = UtilKt.f24294a;
                    KotlinType d = type.getD();
                    if (d == null || !InlineClassesUtilsKt.c(d)) {
                        objArr[kParameter2.getIndex()] = UtilKt.e(ReflectJvmMapping.c(kParameter2.getType()));
                    }
                }
                if (kParameter2.g()) {
                    objArr[kParameter2.getIndex()] = KCallableImpl.n(kParameter2.getType());
                }
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[size + i2] = 0;
            }
            return objArr;
        }
    });
    public final Object i = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$$Lambda$5
        public final KCallableImpl d;

        {
            this.d = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            boolean z;
            List parameters = this.d.getParameters();
            if ((parameters instanceof Collection) && parameters.isEmpty()) {
                z = false;
            } else {
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    if (UtilKt.h(((KParameter) it.next()).getType())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    });

    public static Object n(KType kType) throws NegativeArraySizeException {
        Class clsB = JvmClassMappingKt.b(KTypesJvm.b(kType));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            Intrinsics.g(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    public abstract boolean A();

    @Override // kotlin.reflect.KCallable
    public final Object call(Object... args) throws IllegalCallableAccessException {
        Intrinsics.h(args, "args");
        try {
            return q().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KCallable
    public final Object callBy(Map args) throws IllegalCallableAccessException, NegativeArraySizeException {
        boolean z;
        Object objN;
        Intrinsics.h(args, "args");
        boolean z2 = false;
        if (v()) {
            List<KParameter> parameters = getParameters();
            ArrayList arrayList = new ArrayList(CollectionsKt.s(parameters, 10));
            for (KParameter kParameter : parameters) {
                if (args.containsKey(kParameter)) {
                    objN = args.get(kParameter);
                    if (objN == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                    }
                } else if (kParameter.k()) {
                    objN = null;
                } else {
                    if (!kParameter.g()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                    }
                    objN = n(kParameter.getType());
                }
                arrayList.add(objN);
            }
            Caller callerS = s();
            if (callerS != null) {
                try {
                    return callerS.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + t());
        }
        List<KParameter> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return q().call(isSuspend() ? new Continuation[]{null} : new Continuation[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.h.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.i.getD()).booleanValue();
        int i = 0;
        for (KParameter kParameter2 : parameters2) {
            int iU = zBooleanValue ? u(kParameter2) : 1;
            if (args.containsKey(kParameter2)) {
                objArr[kParameter2.getIndex()] = args.get(kParameter2);
            } else if (kParameter2.k()) {
                if (zBooleanValue) {
                    int i2 = i + iU;
                    for (int i3 = i; i3 < i2; i3++) {
                        int i4 = (i3 / 32) + size;
                        Object obj = objArr[i4];
                        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                    }
                    z = true;
                } else {
                    z = true;
                    int i5 = (i / 32) + size;
                    Object obj2 = objArr[i5];
                    Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArr[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                }
                z2 = z;
            } else if (!kParameter2.g()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter2);
            }
            if (kParameter2.f() == KParameter.Kind.f) {
                i += iU;
            }
        }
        if (!z2) {
            try {
                Caller callerQ = q();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                Intrinsics.g(objArrCopyOf, "copyOf(...)");
                return callerQ.call(objArrCopyOf);
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        Caller callerS2 = s();
        if (callerS2 != null) {
            try {
                return callerS2.call(objArr);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + t());
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        Object objInvoke = this.d.invoke();
        Intrinsics.g(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getParameters() {
        Object objInvoke = this.e.invoke();
        Intrinsics.g(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        Object objInvoke = this.f.invoke();
        Intrinsics.g(objInvoke, "invoke(...)");
        return (KType) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getTypeParameters() {
        Object objInvoke = this.g.invoke();
        Intrinsics.g(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        DescriptorVisibility visibility = t().getVisibility();
        Intrinsics.g(visibility, "getVisibility(...)");
        FqName fqName = UtilKt.f24294a;
        if (visibility.equals(DescriptorVisibilities.e)) {
            return KVisibility.d;
        }
        if (visibility.equals(DescriptorVisibilities.c)) {
            return KVisibility.e;
        }
        if (visibility.equals(DescriptorVisibilities.d)) {
            return KVisibility.f;
        }
        if (visibility.equals(DescriptorVisibilities.f24332a) || visibility.equals(DescriptorVisibilities.b)) {
            return KVisibility.g;
        }
        return null;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isAbstract() {
        return t().k() == Modality.h;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isFinal() {
        return t().k() == Modality.e;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isOpen() {
        return t().k() == Modality.g;
    }

    public abstract Caller q();

    /* renamed from: r */
    public abstract KDeclarationContainerImpl getJ();

    public abstract Caller s();

    public abstract CallableMemberDescriptor t();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int u(KParameter kParameter) {
        if (!((Boolean) this.i.getD()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!UtilKt.h(kParameter.getType())) {
            return 1;
        }
        ArrayList arrayListE = ValueClassAwareCallerKt.e(TypeSubstitutionKt.a(kParameter.getType().getD()));
        Intrinsics.e(arrayListE);
        return arrayListE.size();
    }

    public final boolean v() {
        return Intrinsics.c(getK(), "<init>") && getJ().getE().isAnnotation();
    }
}
