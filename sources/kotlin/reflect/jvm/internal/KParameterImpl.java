package kotlin.reflect.jvm.internal;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KParameterImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "CompoundTypeImpl", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KParameterImpl implements KParameter {
    public static final /* synthetic */ KProperty[] h;
    public final KCallableImpl d;
    public final int e;
    public final KParameter.Kind f;
    public final ReflectProperties.LazySoftVal g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl$CompoundTypeImpl;", "Ljava/lang/reflect/Type;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompoundTypeImpl implements Type {
        public final Type[] d;
        public final int e;

        public CompoundTypeImpl(Type[] types) {
            Intrinsics.h(types, "types");
            this.d = types;
            this.e = Arrays.hashCode(types);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof CompoundTypeImpl) {
                return Arrays.equals(this.d, ((CompoundTypeImpl) obj).d);
            }
            return false;
        }

        @Override // java.lang.reflect.Type
        public final String getTypeName() {
            return ArraysKt.U(this.d, ", ", "[", "]", null, 56);
        }

        /* renamed from: hashCode, reason: from getter */
        public final int getE() {
            return this.e;
        }

        public final String toString() {
            return getTypeName();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(KParameterImpl.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        h = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(KParameterImpl.class, "annotations", "getAnnotations()Ljava/util/List;", 0, reflectionFactory)};
    }

    public KParameterImpl(KCallableImpl kCallableImpl, int i, KParameter.Kind kind, Function0 function0) {
        this.d = kCallableImpl;
        this.e = i;
        this.f = kind;
        this.g = ReflectProperties.a(null, function0);
        ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KParameterImpl$$Lambda$0
            public final KParameterImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = KParameterImpl.h;
                return UtilKt.d(this.d.h());
            }
        });
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KParameterImpl)) {
            return false;
        }
        KParameterImpl kParameterImpl = (KParameterImpl) obj;
        return Intrinsics.c(this.d, kParameterImpl.d) && this.e == kParameterImpl.e;
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: f, reason: from getter */
    public final KParameter.Kind getF() {
        return this.f;
    }

    @Override // kotlin.reflect.KParameter
    public final boolean g() {
        ParameterDescriptor parameterDescriptorH = h();
        return (parameterDescriptorH instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) parameterDescriptorH).y0() != null;
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: getIndex, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // kotlin.reflect.KParameter
    public final String getName() {
        ParameterDescriptor parameterDescriptorH = h();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorH instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorH : null;
        if (valueParameterDescriptor != null && !valueParameterDescriptor.e().m0()) {
            Name name = valueParameterDescriptor.getName();
            Intrinsics.g(name, "getName(...)");
            if (!name.e) {
                return name.b();
            }
        }
        return null;
    }

    @Override // kotlin.reflect.KParameter
    public final KTypeImpl getType() {
        KotlinType type = h().getType();
        Intrinsics.g(type, "getType(...)");
        return new KTypeImpl(type, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KParameterImpl$$Lambda$1
            public final KParameterImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listQ0;
                KProperty[] kPropertyArr = KParameterImpl.h;
                KParameterImpl kParameterImpl = this.d;
                ParameterDescriptor parameterDescriptorH = kParameterImpl.h();
                int i = kParameterImpl.e;
                KCallableImpl kCallableImpl = kParameterImpl.d;
                if ((parameterDescriptorH instanceof ReceiverParameterDescriptor) && Intrinsics.c(UtilKt.g(kCallableImpl.t()), parameterDescriptorH) && kCallableImpl.t().f() == CallableMemberDescriptor.Kind.e) {
                    DeclarationDescriptor declarationDescriptorE = kCallableImpl.t().e();
                    Intrinsics.f(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsK = UtilKt.k((ClassDescriptor) declarationDescriptorE);
                    if (clsK != null) {
                        return clsK;
                    }
                    throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptorH);
                }
                Caller callerQ = kCallableImpl.q();
                if (!(callerQ instanceof ValueClassAwareCaller)) {
                    if (!(callerQ instanceof ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller)) {
                        return (Type) callerQ.getD().get(i);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) callerQ).d.get(i)).toArray(new Class[0]);
                    Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length = typeArr.length;
                    if (length != 0) {
                        return length != 1 ? new KParameterImpl.CompoundTypeImpl(typeArr) : (Type) ArraysKt.d0(typeArr);
                    }
                    throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
                }
                if (kCallableImpl.A()) {
                    ValueClassAwareCaller valueClassAwareCaller = (ValueClassAwareCaller) callerQ;
                    IntRange intRangeD = valueClassAwareCaller.d(i + 1);
                    int i2 = valueClassAwareCaller.d(0).e + 1;
                    listQ0 = CollectionsKt.q0(valueClassAwareCaller.b.getD(), new IntRange(intRangeD.d - i2, intRangeD.e - i2, 1));
                } else {
                    ValueClassAwareCaller valueClassAwareCaller2 = (ValueClassAwareCaller) callerQ;
                    listQ0 = CollectionsKt.q0(valueClassAwareCaller2.b.getD(), valueClassAwareCaller2.d(i));
                }
                Type[] typeArr2 = (Type[]) listQ0.toArray(new Type[0]);
                Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
                int length2 = typeArr3.length;
                if (length2 != 0) {
                    return length2 != 1 ? new KParameterImpl.CompoundTypeImpl(typeArr3) : (Type) ArraysKt.d0(typeArr3);
                }
                throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
            }
        });
    }

    public final ParameterDescriptor h() {
        KProperty kProperty = h[0];
        Object objInvoke = this.g.invoke();
        Intrinsics.g(objInvoke, "getValue(...)");
        return (ParameterDescriptor) objInvoke;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    @Override // kotlin.reflect.KParameter
    public final boolean k() {
        ParameterDescriptor parameterDescriptorH = h();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorH instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorH : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.a(valueParameterDescriptor);
        }
        return false;
    }

    public final String toString() {
        String strB;
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f24292a;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sb.append("parameter #" + this.e + ' ' + getName());
        }
        sb.append(" of ");
        CallableMemberDescriptor callableMemberDescriptorT = this.d.t();
        if (callableMemberDescriptorT instanceof PropertyDescriptor) {
            strB = ReflectionObjectRenderer.d((PropertyDescriptor) callableMemberDescriptorT);
        } else {
            if (!(callableMemberDescriptorT instanceof FunctionDescriptor)) {
                throw new IllegalStateException(("Illegal callable: " + callableMemberDescriptorT).toString());
            }
            strB = ReflectionObjectRenderer.b((FunctionDescriptor) callableMemberDescriptorT);
        }
        sb.append(strB);
        return sb.toString();
    }
}
