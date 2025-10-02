package kotlin.reflect.jvm.internal;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.JvmPropertySignature;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0013\u0014\u0015\u0016B5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "V", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "signature", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Accessor", "Getter", "Setter", "Companion", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements KProperty<V> {
    public static final Object p = new Object();
    public final KDeclarationContainerImpl j;
    public final String k;
    public final String l;
    public final Object m;
    public final Object n;
    public final ReflectProperties.LazySoftVal o;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Accessor<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, KProperty.Accessor<PropertyType> {
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final boolean A() {
            return D().A();
        }

        public abstract PropertyAccessorDescriptor C();

        public abstract KPropertyImpl D();

        @Override // kotlin.reflect.KFunction
        public final boolean isExternal() {
            return C().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isInfix() {
            return C().isInfix();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isInline() {
            return C().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isOperator() {
            return C().isOperator();
        }

        @Override // kotlin.reflect.KCallable
        public final boolean isSuspend() {
            return C().isSuspend();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* renamed from: r */
        public final KDeclarationContainerImpl getJ() {
            return D().j;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final Caller s() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Getter<V> extends Accessor<V, V> implements KProperty.Getter<V> {
        public static final /* synthetic */ KProperty[] l = {Reflection.f24268a.h(new PropertyReference1Impl(Getter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};
        public final ReflectProperties.LazySoftVal j = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$$Lambda$0
            public final KPropertyImpl.Getter d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = KPropertyImpl.Getter.l;
                KPropertyImpl.Getter getter = this.d;
                PropertyGetterDescriptorImpl getter2 = getter.D().t().getGetter();
                return getter2 == null ? DescriptorFactory.c(getter.D().t(), Annotations.Companion.f24350a) : getter2;
            }
        });
        public final Object k = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$$Lambda$1
            public final KPropertyImpl.Getter d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = KPropertyImpl.Getter.l;
                return KPropertyImplKt.a(this.d, true);
            }
        });

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final PropertyAccessorDescriptor C() {
            KProperty kProperty = l[0];
            Object objInvoke = this.j.invoke();
            Intrinsics.g(objInvoke, "getValue(...)");
            return (PropertyGetterDescriptor) objInvoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Getter) && Intrinsics.c(D(), ((Getter) obj).D());
        }

        @Override // kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getK() {
            return b.r(new StringBuilder("<get-"), D().k, '>');
        }

        public final int hashCode() {
            return D().hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final Caller q() {
            return (Caller) this.k.getD();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final CallableMemberDescriptor t() {
            KProperty kProperty = l[0];
            Object objInvoke = this.j.invoke();
            Intrinsics.g(objInvoke, "getValue(...)");
            return (PropertyGetterDescriptor) objInvoke;
        }

        public final String toString() {
            return "getter of " + D();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Setter<V> extends Accessor<V, Unit> implements KMutableProperty.Setter<V> {
        public static final /* synthetic */ KProperty[] l = {Reflection.f24268a.h(new PropertyReference1Impl(Setter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};
        public final ReflectProperties.LazySoftVal j = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$$Lambda$0
            public final KPropertyImpl.Setter d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = KPropertyImpl.Setter.l;
                KPropertyImpl.Setter setter = this.d;
                PropertySetterDescriptor propertySetterDescriptorC = setter.D().t().c();
                return propertySetterDescriptorC == null ? DescriptorFactory.d(setter.D().t(), Annotations.Companion.f24350a) : propertySetterDescriptorC;
            }
        });
        public final Object k = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$$Lambda$1
            public final KPropertyImpl.Setter d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = KPropertyImpl.Setter.l;
                return KPropertyImplKt.a(this.d, false);
            }
        });

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final PropertyAccessorDescriptor C() {
            KProperty kProperty = l[0];
            Object objInvoke = this.j.invoke();
            Intrinsics.g(objInvoke, "getValue(...)");
            return (PropertySetterDescriptor) objInvoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Setter) && Intrinsics.c(D(), ((Setter) obj).D());
        }

        @Override // kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getK() {
            return b.r(new StringBuilder("<set-"), D().k, '>');
        }

        public final int hashCode() {
            return D().hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final Caller q() {
            return (Caller) this.k.getD();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final CallableMemberDescriptor t() {
            KProperty kProperty = l[0];
            Object objInvoke = this.j.invoke();
            Intrinsics.g(objInvoke, "getValue(...)");
            return (PropertySetterDescriptor) objInvoke;
        }

        public final String toString() {
            return "setter of " + D();
        }
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.j = kDeclarationContainerImpl;
        this.k = str;
        this.l = str2;
        this.m = obj;
        this.n = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$$Lambda$0
            public final KPropertyImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class<?> enclosingClass;
                ClassId classId = RuntimeTypeMapper.f24293a;
                KPropertyImpl kPropertyImpl = this.d;
                PropertyDescriptor propertyDescriptorT = kPropertyImpl.t();
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kPropertyImpl.j;
                JvmPropertySignature jvmPropertySignatureB = RuntimeTypeMapper.b(propertyDescriptorT);
                if (!(jvmPropertySignatureB instanceof JvmPropertySignature.KotlinProperty)) {
                    if (jvmPropertySignatureB instanceof JvmPropertySignature.JavaField) {
                        return ((JvmPropertySignature.JavaField) jvmPropertySignatureB).getF24284a();
                    }
                    if ((jvmPropertySignatureB instanceof JvmPropertySignature.JavaMethodProperty) || (jvmPropertySignatureB instanceof JvmPropertySignature.MappedKotlinProperty)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureB;
                PropertyDescriptor f24286a = kotlinProperty.getF24286a();
                ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f24497a;
                JvmMemberSignature.Field fieldB = JvmProtoBufUtil.b(kotlinProperty.getB(), kotlinProperty.getD(), kotlinProperty.getE(), true);
                if (fieldB == null) {
                    return null;
                }
                if (DescriptorsJvmAbiUtil.b(f24286a) || JvmProtoBufUtil.d(kotlinProperty.getB())) {
                    enclosingClass = kDeclarationContainerImpl2.getE().getEnclosingClass();
                } else {
                    DeclarationDescriptor declarationDescriptorE = f24286a.e();
                    enclosingClass = declarationDescriptorE instanceof ClassDescriptor ? UtilKt.k((ClassDescriptor) declarationDescriptorE) : kDeclarationContainerImpl2.getE();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(fieldB.b());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            }
        });
        this.o = ReflectProperties.a(propertyDescriptor, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$$Lambda$1
            public final KPropertyImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KPropertyImpl kPropertyImpl = this.d;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kPropertyImpl.j;
                String name = kPropertyImpl.k;
                String signature = kPropertyImpl.l;
                kDeclarationContainerImpl2.getClass();
                Intrinsics.h(name, "name");
                Intrinsics.h(signature, "signature");
                MatchResult matchResultE = KDeclarationContainerImpl.d.e(signature);
                if (matchResultE != null) {
                    String str3 = (String) matchResultE.a().getF24678a().c().get(1);
                    PropertyDescriptor propertyDescriptorT = kDeclarationContainerImpl2.t(Integer.parseInt(str3));
                    if (propertyDescriptorT != null) {
                        return propertyDescriptorT;
                    }
                    StringBuilder sbU = a.u("Local property #", str3, " not found in ");
                    sbU.append(kDeclarationContainerImpl2.getE());
                    throw new KotlinReflectionInternalError(sbU.toString());
                }
                Collection collectionA = kDeclarationContainerImpl2.A(Name.e(name));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collectionA) {
                    if (Intrinsics.c(RuntimeTypeMapper.b((PropertyDescriptor) obj2).getF(), signature)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbV = a.v("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                    sbV.append(kDeclarationContainerImpl2);
                    throw new KotlinReflectionInternalError(sbV.toString());
                }
                if (arrayList.size() == 1) {
                    return (PropertyDescriptor) CollectionsKt.n0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    DescriptorVisibility visibility = ((PropertyDescriptor) next).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(next);
                }
                Collection collectionValues = MapsKt.t(linkedHashMap, new Comparator() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$1
                    public final Function2 d = KDeclarationContainerImpl$$Lambda$0.d;

                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        Regex regex = KDeclarationContainerImpl.d;
                        return ((Number) this.d.invoke(obj3, obj4)).intValue();
                    }
                }).values();
                Intrinsics.g(collectionValues, "<get-values>(...)");
                List list = (List) CollectionsKt.N(collectionValues);
                if (list.size() == 1) {
                    return (PropertyDescriptor) CollectionsKt.D(list);
                }
                String strM = CollectionsKt.M(kDeclarationContainerImpl2.A(Name.e(name)), "\n", null, null, KDeclarationContainerImpl$$Lambda$2.d, 30);
                StringBuilder sbV2 = a.v("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbV2.append(kDeclarationContainerImpl2);
                sbV2.append(':');
                sbV2.append(strM.length() == 0 ? " no members found" : "\n".concat(strM));
                throw new KotlinReflectionInternalError(sbV2.toString());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final boolean A() {
        return this.m != CallableReference.NO_RECEIVER;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final Member C() {
        if (!t().W()) {
            return null;
        }
        ClassId classId = RuntimeTypeMapper.f24293a;
        JvmPropertySignature jvmPropertySignatureB = RuntimeTypeMapper.b(t());
        if (jvmPropertySignatureB instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureB;
            if ((kotlinProperty.getC().e & 16) == 16) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = kotlinProperty.getC().j;
                int i = jvmMethodSignature.e;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.j.q(kotlinProperty.getD().getString(jvmMethodSignature.f), kotlinProperty.getD().getString(jvmMethodSignature.g));
            }
        }
        return (Field) this.n.getD();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final PropertyDescriptor t() {
        Object objInvoke = this.o.invoke();
        Intrinsics.g(objInvoke, "invoke(...)");
        return (PropertyDescriptor) objInvoke;
    }

    public abstract Getter E();

    public final boolean equals(Object obj) {
        KPropertyImpl kPropertyImplC = UtilKt.c(obj);
        return kPropertyImplC != null && Intrinsics.c(this.j, kPropertyImplC.j) && Intrinsics.c(this.k, kPropertyImplC.k) && Intrinsics.c(this.l, kPropertyImplC.l) && Intrinsics.c(this.m, kPropertyImplC.m);
    }

    @Override // kotlin.reflect.KCallable
    /* renamed from: getName, reason: from getter */
    public final String getK() {
        return this.k;
    }

    public final int hashCode() {
        return this.l.hashCode() + b.c(this.j.hashCode() * 31, 31, this.k);
    }

    @Override // kotlin.reflect.KProperty
    public final boolean isConst() {
        return t().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public final boolean isLateinit() {
        return t().B0();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final Caller q() {
        return E().q();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: r, reason: from getter */
    public final KDeclarationContainerImpl getJ() {
        return this.j;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final Caller s() {
        E().getClass();
        return null;
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f24292a;
        return ReflectionObjectRenderer.d(t());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String name, String signature, Object obj) {
        this(kDeclarationContainerImpl, name, signature, null, obj);
        Intrinsics.h(name, "name");
        Intrinsics.h(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        Intrinsics.g(strB, "asString(...)");
        this(kDeclarationContainerImpl, strB, RuntimeTypeMapper.b(descriptor).getF(), descriptor, CallableReference.NO_RECEIVER);
    }
}
