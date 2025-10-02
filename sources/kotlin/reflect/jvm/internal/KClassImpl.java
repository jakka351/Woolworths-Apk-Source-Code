package kotlin.reflect.jvm.internal;

import androidx.camera.core.impl.b;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.ads.RequestConfiguration;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001\u0015R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Data", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl, KTypeParameterOwnerImpl {
    public static final /* synthetic */ int g = 0;
    public final Class e;
    public final Object f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class Data extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ KProperty[] p;
        public final ReflectProperties.LazySoftVal c;
        public final ReflectProperties.LazySoftVal d;
        public final ReflectProperties.LazySoftVal e;
        public final ReflectProperties.LazySoftVal f;
        public final Object g;
        public final ReflectProperties.LazySoftVal h;
        public final ReflectProperties.LazySoftVal i;
        public final ReflectProperties.LazySoftVal j;
        public final ReflectProperties.LazySoftVal k;
        public final ReflectProperties.LazySoftVal l;
        public final ReflectProperties.LazySoftVal m;
        public final ReflectProperties.LazySoftVal n;
        public final ReflectProperties.LazySoftVal o;

        static {
            PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Data.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            p = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(Data.class, "annotations", "getAnnotations()Ljava/util/List;", 0, reflectionFactory), c.t(Data.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0, reflectionFactory), c.t(Data.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0, reflectionFactory), c.t(Data.class, "constructors", "getConstructors()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0, reflectionFactory), c.t(Data.class, "supertypes", "getSupertypes()Ljava/util/List;", 0, reflectionFactory), c.t(Data.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0, reflectionFactory), c.t(Data.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0, reflectionFactory), c.t(Data.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0, reflectionFactory)};
        }

        public Data(final KClassImpl kClassImpl) {
            super(kClassImpl);
            this.c = ReflectProperties.a(null, new Function0(kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$0
                public final KClassImpl d;

                {
                    this.d = kClassImpl;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    int i = KClassImpl.g;
                    KClassImpl kClassImpl2 = this.d;
                    ClassId classIdI = kClassImpl2.I();
                    Class cls = kClassImpl2.e;
                    ReflectProperties.LazySoftVal lazySoftVal = ((KClassImpl.Data) kClassImpl2.f.getD()).f24289a;
                    KProperty kProperty = KDeclarationContainerImpl.Data.b[0];
                    Object objInvoke = lazySoftVal.invoke();
                    Intrinsics.g(objInvoke, "getValue(...)");
                    RuntimeModuleData runtimeModuleData = (RuntimeModuleData) objInvoke;
                    DeserializationComponents deserializationComponents = runtimeModuleData.f24369a;
                    ClassDescriptor classDescriptorB = (classIdI.c && cls.isAnnotationPresent(Metadata.class)) ? deserializationComponents.b(classIdI) : FindClassInModuleKt.a(deserializationComponents.b, classIdI);
                    if (classDescriptorB != null) {
                        return classDescriptorB;
                    }
                    if (cls.isSynthetic()) {
                        return KClassImpl.H(classIdI, runtimeModuleData);
                    }
                    ReflectKotlinClass reflectKotlinClassA = ReflectKotlinClass.Factory.a(cls);
                    KotlinClassHeader.Kind kind = reflectKotlinClassA != null ? reflectKotlinClassA.b.f24478a : null;
                    switch (kind == null ? -1 : KClassImpl.WhenMappings.f24288a[kind.ordinal()]) {
                        case -1:
                        case 6:
                            throw new KotlinReflectionInternalError("Unresolved class: " + cls + " (kind = " + kind + ')');
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            return KClassImpl.H(classIdI, runtimeModuleData);
                        case 5:
                            throw new KotlinReflectionInternalError("Unknown class: " + cls + " (kind = " + kind + ')');
                    }
                }
            });
            ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$1
                public final KClassImpl.Data d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    return UtilKt.d(this.d.a());
                }
            });
            this.d = ReflectProperties.a(null, new Function0(this, kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$2
                public final KClassImpl d;

                {
                    this.d = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl kClassImpl2 = this.d;
                    Class cls = kClassImpl2.e;
                    if (cls.isAnonymousClass()) {
                        return null;
                    }
                    ClassId classIdI = kClassImpl2.I();
                    if (!classIdI.c) {
                        String strB = classIdI.f().b();
                        Intrinsics.g(strB, "asString(...)");
                        return strB;
                    }
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        return StringsKt.Z(simpleName, enclosingMethod.getName() + '$', simpleName);
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        return StringsKt.Y('$', simpleName, simpleName);
                    }
                    return StringsKt.Z(simpleName, enclosingConstructor.getName() + '$', simpleName);
                }
            });
            this.e = ReflectProperties.a(null, new Function0(kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$3
                public final KClassImpl d;

                {
                    this.d = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl kClassImpl2 = this.d;
                    if (kClassImpl2.e.isAnonymousClass()) {
                        return null;
                    }
                    ClassId classIdI = kClassImpl2.I();
                    if (classIdI.c) {
                        return null;
                    }
                    return classIdI.a().f24500a.f24501a;
                }
            });
            this.f = ReflectProperties.a(null, new Function0(kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$4
                public final KClassImpl d;

                {
                    this.d = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl kClassImpl2 = this.d;
                    Collection collectionR = kClassImpl2.r();
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(collectionR, 10));
                    Iterator it = collectionR.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new KFunctionImpl(kClassImpl2, (ConstructorDescriptor) it.next()));
                    }
                    return arrayList;
                }
            });
            ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$5
                public final KClassImpl.Data d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    Collection collectionA = ResolutionScope.DefaultImpls.a(this.d.a().G(), null, 3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionA) {
                        if (!DescriptorUtils.m((DeclarationDescriptor) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) it.next();
                        ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
                        Class clsK = classDescriptor != null ? UtilKt.k(classDescriptor) : null;
                        KClassImpl kClassImpl2 = clsK != null ? new KClassImpl(clsK) : null;
                        if (kClassImpl2 != null) {
                            arrayList2.add(kClassImpl2);
                        }
                    }
                    return arrayList2;
                }
            });
            this.g = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this, kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$6
                public final KClassImpl.Data d;
                public final KClassImpl e;

                {
                    this.d = this;
                    this.e = kClassImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
                @Override // kotlin.jvm.functions.Function0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
                    /*
                        r5 = this;
                        kotlin.reflect.jvm.internal.KClassImpl r0 = r5.e
                        java.lang.Class r0 = r0.e
                        kotlin.reflect.KProperty[] r1 = kotlin.reflect.jvm.internal.KClassImpl.Data.p
                        kotlin.reflect.jvm.internal.KClassImpl$Data r1 = r5.d
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = r1.a()
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r1.f()
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.i
                        r4 = 0
                        if (r2 == r3) goto L16
                        return r4
                    L16:
                        boolean r2 = r1.j0()
                        if (r2 == 0) goto L35
                        java.util.LinkedHashSet r2 = kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.f24309a
                        boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt.a(r1)
                        if (r2 != 0) goto L35
                        java.lang.Class r0 = r0.getEnclosingClass()
                        kotlin.reflect.jvm.internal.impl.name.Name r1 = r1.getName()
                        java.lang.String r1 = r1.b()
                        java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
                        goto L3b
                    L35:
                        java.lang.String r1 = "INSTANCE"
                        java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
                    L3b:
                        java.lang.Object r0 = r0.get(r4)
                        java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl"
                        kotlin.jvm.internal.Intrinsics.f(r0, r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$6.invoke():java.lang.Object");
                }
            });
            ReflectProperties.a(null, new Function0(this, kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$7
                public final KClassImpl.Data d;
                public final KClassImpl e;

                {
                    this.d = this;
                    this.e = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    List listU = this.d.a().u();
                    Intrinsics.g(listU, "getDeclaredTypeParameters(...)");
                    List<TypeParameterDescriptor> list = listU;
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        Intrinsics.e(typeParameterDescriptor);
                        arrayList.add(new KTypeParameterImpl(this.e, typeParameterDescriptor));
                    }
                    return arrayList;
                }
            });
            this.h = ReflectProperties.a(null, new Function0(this, kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$8
                public final KClassImpl.Data d;
                public final KClassImpl e;

                {
                    this.d = this;
                    this.e = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl.Data data = this.d;
                    Collection<KotlinType> collectionA = data.a().m().a();
                    Intrinsics.g(collectionA, "getSupertypes(...)");
                    ArrayList arrayList = new ArrayList(collectionA.size());
                    for (KotlinType kotlinType : collectionA) {
                        Intrinsics.e(kotlinType);
                        arrayList.add(new KTypeImpl(kotlinType, new Function0(kotlinType, data, this.e) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$18
                            public final KotlinType d;
                            public final KClassImpl.Data e;
                            public final KClassImpl f;

                            {
                                this.d = kotlinType;
                                this.e = data;
                                this.f = kClassImpl;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                KProperty[] kPropertyArr2 = KClassImpl.Data.p;
                                ClassifierDescriptor classifierDescriptorC = this.d.J0().c();
                                if (!(classifierDescriptorC instanceof ClassDescriptor)) {
                                    throw new KotlinReflectionInternalError("Supertype not a class: " + classifierDescriptorC);
                                }
                                Class clsK = UtilKt.k((ClassDescriptor) classifierDescriptorC);
                                KClassImpl.Data data2 = this.e;
                                if (clsK == null) {
                                    throw new KotlinReflectionInternalError("Unsupported superclass of " + data2 + ": " + classifierDescriptorC);
                                }
                                Class cls = this.f.e;
                                if (Intrinsics.c(cls.getSuperclass(), clsK)) {
                                    Type genericSuperclass = cls.getGenericSuperclass();
                                    Intrinsics.e(genericSuperclass);
                                    return genericSuperclass;
                                }
                                Class<?>[] interfaces = cls.getInterfaces();
                                Intrinsics.g(interfaces, "getInterfaces(...)");
                                int iQ = ArraysKt.Q(interfaces, clsK);
                                if (iQ >= 0) {
                                    Type type = cls.getGenericInterfaces()[iQ];
                                    Intrinsics.e(type);
                                    return type;
                                }
                                throw new KotlinReflectionInternalError("No superclass of " + data2 + " in Java reflection for " + classifierDescriptorC);
                            }
                        }));
                    }
                    ClassDescriptor classDescriptorA = data.a();
                    Name name = KotlinBuiltIns.f;
                    if (!KotlinBuiltIns.b(classDescriptorA, StandardNames.FqNames.f24314a) && !KotlinBuiltIns.b(classDescriptorA, StandardNames.FqNames.b)) {
                        if (arrayList.isEmpty()) {
                            SimpleType simpleTypeE = DescriptorUtilsKt.e(data.a()).e();
                            Intrinsics.g(simpleTypeE, "getAnyType(...)");
                            arrayList.add(new KTypeImpl(simpleTypeE, KClassImpl$Data$$Lambda$19.d));
                        } else {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ClassKind classKindF = DescriptorUtils.c(((KTypeImpl) it.next()).getD()).f();
                                Intrinsics.g(classKindF, "getKind(...)");
                                if (classKindF != ClassKind.e && classKindF != ClassKind.h) {
                                    break;
                                }
                            }
                            SimpleType simpleTypeE2 = DescriptorUtilsKt.e(data.a()).e();
                            Intrinsics.g(simpleTypeE2, "getAnyType(...)");
                            arrayList.add(new KTypeImpl(simpleTypeE2, KClassImpl$Data$$Lambda$19.d));
                        }
                    }
                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.b(arrayList);
                }
            });
            this.i = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$9
                public final KClassImpl.Data d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    Collection<ClassDescriptor> collectionO = this.d.a().o();
                    Intrinsics.g(collectionO, "getSealedSubclasses(...)");
                    ArrayList arrayList = new ArrayList();
                    for (ClassDescriptor classDescriptor : collectionO) {
                        Intrinsics.f(classDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class clsK = UtilKt.k(classDescriptor);
                        KClassImpl kClassImpl2 = clsK != null ? new KClassImpl(clsK) : null;
                        if (kClassImpl2 != null) {
                            arrayList.add(kClassImpl2);
                        }
                    }
                    return arrayList;
                }
            });
            this.j = ReflectProperties.a(null, new Function0(kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$10
                public final KClassImpl d;

                {
                    this.d = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl kClassImpl2 = this.d;
                    return kClassImpl2.u(kClassImpl2.getDescriptor().t().s(), KDeclarationContainerImpl.MemberBelonginess.d);
                }
            });
            this.k = ReflectProperties.a(null, new Function0(kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$11
                public final KClassImpl d;

                {
                    this.d = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl kClassImpl2 = this.d;
                    MemberScope memberScopeQ0 = kClassImpl2.getDescriptor().q0();
                    Intrinsics.g(memberScopeQ0, "getStaticScope(...)");
                    return kClassImpl2.u(memberScopeQ0, KDeclarationContainerImpl.MemberBelonginess.d);
                }
            });
            this.l = ReflectProperties.a(null, new Function0(kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$12
                public final KClassImpl d;

                {
                    this.d = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl kClassImpl2 = this.d;
                    return kClassImpl2.u(kClassImpl2.getDescriptor().t().s(), KDeclarationContainerImpl.MemberBelonginess.e);
                }
            });
            this.m = ReflectProperties.a(null, new Function0(kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$13
                public final KClassImpl d;

                {
                    this.d = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl kClassImpl2 = this.d;
                    MemberScope memberScopeQ0 = kClassImpl2.getDescriptor().q0();
                    Intrinsics.g(memberScopeQ0, "getStaticScope(...)");
                    return kClassImpl2.u(memberScopeQ0, KDeclarationContainerImpl.MemberBelonginess.e);
                }
            });
            this.n = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$14
                public final KClassImpl.Data d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl.Data data = this.d;
                    ReflectProperties.LazySoftVal lazySoftVal = data.j;
                    KProperty[] kPropertyArr2 = KClassImpl.Data.p;
                    KProperty kProperty = kPropertyArr2[9];
                    Object objInvoke = lazySoftVal.invoke();
                    Intrinsics.g(objInvoke, "getValue(...)");
                    ReflectProperties.LazySoftVal lazySoftVal2 = data.l;
                    KProperty kProperty2 = kPropertyArr2[11];
                    Object objInvoke2 = lazySoftVal2.invoke();
                    Intrinsics.g(objInvoke2, "getValue(...)");
                    return CollectionsKt.c0((Collection) objInvoke2, (Collection) objInvoke);
                }
            });
            this.o = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$15
                public final KClassImpl.Data d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl.Data data = this.d;
                    ReflectProperties.LazySoftVal lazySoftVal = data.k;
                    KProperty[] kPropertyArr2 = KClassImpl.Data.p;
                    KProperty kProperty = kPropertyArr2[10];
                    Object objInvoke = lazySoftVal.invoke();
                    Intrinsics.g(objInvoke, "getValue(...)");
                    ReflectProperties.LazySoftVal lazySoftVal2 = data.m;
                    KProperty kProperty2 = kPropertyArr2[12];
                    Object objInvoke2 = lazySoftVal2.invoke();
                    Intrinsics.g(objInvoke2, "getValue(...)");
                    return CollectionsKt.c0((Collection) objInvoke2, (Collection) objInvoke);
                }
            });
            ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$16
                public final KClassImpl.Data d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KClassImpl.Data data = this.d;
                    ReflectProperties.LazySoftVal lazySoftVal = data.j;
                    KProperty[] kPropertyArr2 = KClassImpl.Data.p;
                    KProperty kProperty = kPropertyArr2[9];
                    Object objInvoke = lazySoftVal.invoke();
                    Intrinsics.g(objInvoke, "getValue(...)");
                    ReflectProperties.LazySoftVal lazySoftVal2 = data.k;
                    KProperty kProperty2 = kPropertyArr2[10];
                    Object objInvoke2 = lazySoftVal2.invoke();
                    Intrinsics.g(objInvoke2, "getValue(...)");
                    return CollectionsKt.c0((Collection) objInvoke2, (Collection) objInvoke);
                }
            });
            ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$17
                public final KClassImpl.Data d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl.Data data = this.d;
                    ReflectProperties.LazySoftVal lazySoftVal = data.n;
                    KProperty[] kPropertyArr = KClassImpl.Data.p;
                    KProperty kProperty = kPropertyArr[13];
                    Object objInvoke = lazySoftVal.invoke();
                    Intrinsics.g(objInvoke, "getValue(...)");
                    ReflectProperties.LazySoftVal lazySoftVal2 = data.o;
                    KProperty kProperty2 = kPropertyArr[14];
                    Object objInvoke2 = lazySoftVal2.invoke();
                    Intrinsics.g(objInvoke2, "getValue(...)");
                    return CollectionsKt.c0((Collection) objInvoke2, (Collection) objInvoke);
                }
            });
        }

        public final ClassDescriptor a() {
            KProperty kProperty = p[0];
            Object objInvoke = this.c.invoke();
            Intrinsics.g(objInvoke, "getValue(...)");
            return (ClassDescriptor) objInvoke;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24288a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                KotlinClassHeader.Kind.Companion companion = KotlinClassHeader.Kind.e;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KotlinClassHeader.Kind.Companion companion2 = KotlinClassHeader.Kind.e;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KotlinClassHeader.Kind.Companion companion3 = KotlinClassHeader.Kind.e;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KotlinClassHeader.Kind.Companion companion4 = KotlinClassHeader.Kind.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KotlinClassHeader.Kind.Companion companion5 = KotlinClassHeader.Kind.e;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KotlinClassHeader.Kind.Companion companion6 = KotlinClassHeader.Kind.e;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f24288a = iArr;
        }
    }

    public KClassImpl(Class jClass) {
        Intrinsics.h(jClass, "jClass");
        this.e = jClass;
        this.f = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$$Lambda$0
            public final KClassImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = KClassImpl.g;
                return new KClassImpl.Data(this.d);
            }
        });
    }

    public static ClassDescriptorImpl H(ClassId classId, RuntimeModuleData runtimeModuleData) {
        DeserializationComponents deserializationComponents = runtimeModuleData.f24369a;
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(deserializationComponents.b, classId.f24499a);
        Name nameF = classId.f();
        Modality modality = Modality.e;
        ClassKind classKind = ClassKind.d;
        List listQ = CollectionsKt.Q(deserializationComponents.b.p().k("Any").t());
        final LockBasedStorageManager lockBasedStorageManager = deserializationComponents.f24570a;
        final ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(emptyPackageFragmentDescriptor, nameF, modality, classKind, listQ, lockBasedStorageManager);
        classDescriptorImpl.I0(new GivenFunctionsMemberScope(classDescriptorImpl, lockBasedStorageManager) { // from class: kotlin.reflect.jvm.internal.KClassImpl$createSyntheticClass$1$1
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
            public final List h() {
                return EmptyList.d;
            }
        }, EmptySet.d, null);
        return classDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection A(Name name) {
        MemberScope memberScopeS = getDescriptor().t().s();
        NoLookupLocation noLookupLocation = NoLookupLocation.e;
        Collection collectionB = memberScopeS.b(name, noLookupLocation);
        MemberScope memberScopeQ0 = getDescriptor().q0();
        Intrinsics.g(memberScopeQ0, "getStaticScope(...)");
        return CollectionsKt.c0(memberScopeQ0.b(name, noLookupLocation), collectionB);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final String B() {
        ReflectProperties.LazySoftVal lazySoftVal = ((Data) this.f.getD()).d;
        KProperty kProperty = Data.p[2];
        return (String) lazySoftVal.invoke();
    }

    public final ClassId I() {
        PrimitiveType primitiveTypeD;
        ClassId classId = RuntimeTypeMapper.f24293a;
        Class klass = this.e;
        Intrinsics.h(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.g(componentType, "getComponentType(...)");
            primitiveTypeD = componentType.isPrimitive() ? JvmPrimitiveType.b(componentType.getSimpleName()).d() : null;
            return primitiveTypeD != null ? new ClassId(StandardNames.l, primitiveTypeD.e) : ClassId.Companion.b(StandardNames.FqNames.g.g());
        }
        if (klass.equals(Void.TYPE)) {
            return RuntimeTypeMapper.f24293a;
        }
        primitiveTypeD = klass.isPrimitive() ? JvmPrimitiveType.b(klass.getSimpleName()).d() : null;
        if (primitiveTypeD != null) {
            return new ClassId(StandardNames.l, primitiveTypeD.d);
        }
        ClassId classIdA = ReflectClassUtilKt.a(klass);
        if (!classIdA.c) {
            String str = JavaToKotlinClassMap.f24321a;
            FqName fqName = classIdA.a();
            Intrinsics.h(fqName, "fqName");
            ClassId classId2 = (ClassId) JavaToKotlinClassMap.h.get(fqName.f24500a);
            if (classId2 != null) {
                return classId2;
            }
        }
        return classIdA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final ClassDescriptor getDescriptor() {
        return ((Data) this.f.getD()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final List a() {
        ReflectProperties.LazySoftVal lazySoftVal = ((Data) this.f.getD()).h;
        KProperty kProperty = Data.p[7];
        Object objInvoke = lazySoftVal.invoke();
        Intrinsics.g(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KClassImpl) && JvmClassMappingKt.c(this).equals(JvmClassMappingKt.c((KClass) obj));
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* renamed from: h, reason: from getter */
    public final Class getE() {
        return this.e;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return JvmClassMappingKt.c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final boolean i() {
        return getDescriptor().i();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        return getDescriptor().k() == Modality.h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final List o() {
        ReflectProperties.LazySoftVal lazySoftVal = ((Data) this.f.getD()).i;
        KProperty kProperty = Data.p[8];
        Object objInvoke = lazySoftVal.invoke();
        Intrinsics.g(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KClass
    public final boolean p() {
        return getDescriptor().k() == Modality.f;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection r() {
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor.f() == ClassKind.e || descriptor.f() == ClassKind.i) {
            return EmptyList.d;
        }
        Collection collectionN = descriptor.n();
        Intrinsics.g(collectionN, "getConstructors(...)");
        return collectionN;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection s(Name name) {
        MemberScope memberScopeS = getDescriptor().t().s();
        NoLookupLocation noLookupLocation = NoLookupLocation.e;
        Collection collectionE = memberScopeS.e(name, noLookupLocation);
        MemberScope memberScopeQ0 = getDescriptor().q0();
        Intrinsics.g(memberScopeQ0, "getStaticScope(...)");
        return CollectionsKt.c0(memberScopeQ0.e(name, noLookupLocation), collectionE);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final PropertyDescriptor t(int i) {
        Class<?> declaringClass;
        Class cls = this.e;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((KClassImpl) JvmClassMappingKt.e(declaringClass)).t(i);
        }
        ClassDescriptor descriptor = getDescriptor();
        DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) descriptor : null;
        if (deserializedClassDescriptor != null) {
            ProtoBuf.Class r1 = deserializedClassDescriptor.h;
            GeneratedMessageLite.GeneratedExtension classLocalVariable = JvmProtoBuf.j;
            Intrinsics.g(classLocalVariable, "classLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.b(r1, classLocalVariable, i);
            if (property != null) {
                DeserializationContext deserializationContext = deserializedClassDescriptor.o;
                return (PropertyDescriptor) UtilKt.f(this.e, property, deserializationContext.b, deserializationContext.d, deserializedClassDescriptor.i, KClassImpl$getLocalProperty$2$1$1.d);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        ClassId classIdI = I();
        FqName fqName = classIdI.f24499a;
        String strR = fqName.f24500a.c() ? "" : b.r(new StringBuilder(), fqName.f24500a.f24501a, JwtParser.SEPARATOR_CHAR);
        sb.append(strR + StringsKt.R(classIdI.b.f24500a.f24501a, JwtParser.SEPARATOR_CHAR, '$'));
        return sb.toString();
    }

    @Override // kotlin.reflect.KClass
    public final boolean w() {
        return getDescriptor().w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final String x() {
        ReflectProperties.LazySoftVal lazySoftVal = ((Data) this.f.getD()).e;
        KProperty kProperty = Data.p[3];
        return (String) lazySoftVal.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final Object y() {
        return ((Data) this.f.getD()).g.getD();
    }

    @Override // kotlin.reflect.KClass
    public final boolean z(Object obj) {
        List list = ReflectClassUtilKt.f24377a;
        Class cls = this.e;
        Intrinsics.h(cls, "<this>");
        Integer num = (Integer) ReflectClassUtilKt.d.get(cls);
        if (num != null) {
            return TypeIntrinsics.e(num.intValue(), obj);
        }
        Class cls2 = (Class) ReflectClassUtilKt.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }
}
