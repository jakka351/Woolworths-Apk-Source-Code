package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    public static final /* synthetic */ KProperty[] h;

    /* renamed from: a, reason: collision with root package name */
    public final ModuleDescriptorImpl f24325a;
    public final NotNullLazyValue b;
    public final SimpleType c;
    public final NotNullLazyValue d;
    public final CacheWithNotNullValues e;
    public final NotNullLazyValue f;
    public final MemoizedFunctionToNotNull g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public static final class JDKMemberStatus {
        public static final JDKMemberStatus d;
        public static final JDKMemberStatus e;
        public static final JDKMemberStatus f;
        public static final JDKMemberStatus g;
        public static final JDKMemberStatus h;
        public static final /* synthetic */ JDKMemberStatus[] i;
        public static final /* synthetic */ EnumEntries j;

        static {
            JDKMemberStatus jDKMemberStatus = new JDKMemberStatus("HIDDEN", 0);
            d = jDKMemberStatus;
            JDKMemberStatus jDKMemberStatus2 = new JDKMemberStatus("VISIBLE", 1);
            e = jDKMemberStatus2;
            JDKMemberStatus jDKMemberStatus3 = new JDKMemberStatus("DEPRECATED_LIST_METHODS", 2);
            f = jDKMemberStatus3;
            JDKMemberStatus jDKMemberStatus4 = new JDKMemberStatus("NOT_CONSIDERED", 3);
            g = jDKMemberStatus4;
            JDKMemberStatus jDKMemberStatus5 = new JDKMemberStatus("DROP", 4);
            h = jDKMemberStatus5;
            JDKMemberStatus[] jDKMemberStatusArr = {jDKMemberStatus, jDKMemberStatus2, jDKMemberStatus3, jDKMemberStatus4, jDKMemberStatus5};
            i = jDKMemberStatusArr;
            j = EnumEntriesKt.a(jDKMemberStatusArr);
        }

        public static JDKMemberStatus valueOf(String str) {
            return (JDKMemberStatus) Enum.valueOf(JDKMemberStatus.class, str);
        }

        public static JDKMemberStatus[] values() {
            return (JDKMemberStatus[]) i.clone();
        }
    }

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JDKMemberStatus jDKMemberStatus = JDKMemberStatus.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JDKMemberStatus jDKMemberStatus2 = JDKMemberStatus.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                JDKMemberStatus jDKMemberStatus3 = JDKMemberStatus.d;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                JDKMemberStatus jDKMemberStatus4 = JDKMemberStatus.d;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        h = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, reflectionFactory), c.t(JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, reflectionFactory)};
    }

    public JvmBuiltInsCustomizer(ModuleDescriptorImpl moduleDescriptorImpl, final LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
        this.f24325a = moduleDescriptorImpl;
        this.b = lockBasedStorageManager.d(function0);
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1(moduleDescriptorImpl, new FqName("java.io")), Name.e("Serializable"), Modality.h, ClassKind.e, CollectionsKt.Q(new LazyWrappedType(lockBasedStorageManager, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$3
            public final JvmBuiltInsCustomizer d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SimpleType simpleTypeE = this.d.f24325a.g.e();
                Intrinsics.g(simpleTypeE, "getAnyType(...)");
                return simpleTypeE;
            }
        })), lockBasedStorageManager);
        classDescriptorImpl.I0(MemberScope.Empty.b, EmptySet.d, null);
        SimpleType simpleTypeT = classDescriptorImpl.t();
        Intrinsics.g(simpleTypeT, "getDefaultType(...)");
        this.c = simpleTypeT;
        this.d = lockBasedStorageManager.d(new Function0(this, lockBasedStorageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$0
            public final JvmBuiltInsCustomizer d;
            public final LockBasedStorageManager e;

            {
                this.d = this;
                this.e = lockBasedStorageManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = JvmBuiltInsCustomizer.h;
                JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.d;
                ModuleDescriptor moduleDescriptorA = jvmBuiltInsCustomizer.g().a();
                JvmBuiltInClassDescriptorFactory.d.getClass();
                return FindClassInModuleKt.c(moduleDescriptorA, JvmBuiltInClassDescriptorFactory.h, new NotFoundClasses(this.e, jvmBuiltInsCustomizer.g().a())).t();
            }
        });
        this.e = lockBasedStorageManager.c();
        this.f = lockBasedStorageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$1
            public final JvmBuiltInsCustomizer d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Annotations.Companion.a(CollectionsKt.Q(AnnotationUtilKt.a(this.d.f24325a.g, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING")));
            }
        });
        this.g = lockBasedStorageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$2
            public final JvmBuiltInsCustomizer d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair = (Pair) obj;
                KProperty[] kPropertyArr = JvmBuiltInsCustomizer.h;
                Intrinsics.h(pair, "<destruct>");
                String str = (String) pair.d;
                String str2 = (String) pair.e;
                return Annotations.Companion.a(CollectionsKt.Q(AnnotationUtilKt.a(this.d.f24325a.g, a.j("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN")));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public final boolean a(ClassDescriptor classDescriptor, DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
        Intrinsics.h(classDescriptor, "classDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorF = f(classDescriptor);
        if (lazyJavaClassDescriptorF == null || !deserializedSimpleFunctionDescriptor.getAnnotations().m2(PlatformDependentDeclarationFilterKt.a())) {
            return true;
        }
        g().getClass();
        String strA = MethodSignatureMappingKt.a(deserializedSimpleFunctionDescriptor, 3);
        LazyJavaClassMemberScope lazyJavaClassMemberScopeK0 = lazyJavaClassDescriptorF.K0();
        Name name = deserializedSimpleFunctionDescriptor.getName();
        Intrinsics.g(name, "getName(...)");
        Collection collectionE = lazyJavaClassMemberScopeK0.e(name, NoLookupLocation.d);
        if ((collectionE instanceof Collection) && collectionE.isEmpty()) {
            return false;
        }
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(MethodSignatureMappingKt.a((SimpleFunctionDescriptor) it.next(), 3), strA)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final Collection b(ClassDescriptor classDescriptor) {
        if (classDescriptor.f() == ClassKind.d) {
            g().getClass();
            LazyJavaClassDescriptor lazyJavaClassDescriptorF = f(classDescriptor);
            if (lazyJavaClassDescriptorF != null) {
                FqName fqNameG = DescriptorUtilsKt.g(lazyJavaClassDescriptorF);
                KotlinBuiltIns kotlinBuiltIns = FallbackBuiltIns.g;
                ClassDescriptor classDescriptorB = JavaToKotlinClassMapper.b(fqNameG, FallbackBuiltIns.Companion.a());
                if (classDescriptorB != null) {
                    TypeSubstitutor typeSubstitutorC = MappingUtilKt.a(classDescriptorB, lazyJavaClassDescriptorF).c();
                    List listN = lazyJavaClassDescriptorF.n();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listN) {
                        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
                        if (classConstructorDescriptor.getVisibility().a().b) {
                            Collection collectionN = classDescriptorB.n();
                            Intrinsics.g(collectionN, "getConstructors(...)");
                            Collection<ClassConstructorDescriptor> collection = collectionN;
                            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                for (ClassConstructorDescriptor classConstructorDescriptor2 : collection) {
                                    Intrinsics.e(classConstructorDescriptor2);
                                    if (OverridingUtil.j(classConstructorDescriptor2, classConstructorDescriptor.b(typeSubstitutorC)) == OverridingUtil.OverrideCompatibilityInfo.Result.d) {
                                        break;
                                    }
                                }
                            }
                            if (classConstructorDescriptor.h().size() == 1) {
                                List listH = classConstructorDescriptor.h();
                                Intrinsics.g(listH, "getValueParameters(...)");
                                ClassifierDescriptor classifierDescriptorC = ((ValueParameterDescriptor) CollectionsKt.n0(listH)).getType().J0().c();
                                if (Intrinsics.c(classifierDescriptorC != null ? DescriptorUtilsKt.h(classifierDescriptorC) : null, DescriptorUtilsKt.h(classDescriptor))) {
                                }
                            }
                            if (!KotlinBuiltIns.D(classConstructorDescriptor)) {
                                LinkedHashSet linkedHashSet = JvmBuiltInsSignatures.f24330a;
                                if (!JvmBuiltInsSignatures.a().contains(MethodSignatureBuildingUtilsKt.a(lazyJavaClassDescriptorF, MethodSignatureMappingKt.a(classConstructorDescriptor, 3)))) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ClassConstructorDescriptor classConstructorDescriptor3 = (ClassConstructorDescriptor) it.next();
                        FunctionDescriptor.CopyBuilder copyBuilderS = classConstructorDescriptor3.S();
                        copyBuilderS.p(classDescriptor);
                        copyBuilderS.g(classDescriptor.t());
                        copyBuilderS.f();
                        copyBuilderS.b(typeSubstitutorC.g());
                        LinkedHashSet linkedHashSet2 = JvmBuiltInsSignatures.f24330a;
                        if (!JvmBuiltInsSignatures.c().contains(MethodSignatureBuildingUtilsKt.a(lazyJavaClassDescriptorF, MethodSignatureMappingKt.a(classConstructorDescriptor3, 3)))) {
                            copyBuilderS.i((Annotations) StorageKt.a(this.f, h[2]));
                        }
                        FunctionDescriptor functionDescriptorBuild = copyBuilderS.build();
                        Intrinsics.f(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                        arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
                    }
                    return arrayList2;
                }
            }
        }
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final Collection c(ClassDescriptor classDescriptor) {
        FqNameUnsafe fqNameUnsafeH = DescriptorUtilsKt.h(classDescriptor);
        LinkedHashSet linkedHashSet = JvmBuiltInsSignatures.f24330a;
        boolean zD = JvmBuiltInsSignatures.d(fqNameUnsafeH);
        SimpleType simpleType = this.c;
        return zD ? CollectionsKt.R((SimpleType) StorageKt.a(this.d, h[1]), simpleType) : JvmBuiltInsSignatures.e(fqNameUnsafeH) ? CollectionsKt.Q(simpleType) : EmptyList.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218 A[EDGE_INSN: B:127:0x0218->B:76:0x0218 BREAK  A[LOOP:3: B:72:0x01f9->B:77:0x021a]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0258  */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection d(final kotlin.reflect.jvm.internal.impl.name.Name r17, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r18) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.d(kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final Collection e(ClassDescriptor classDescriptor) {
        Set setA;
        Intrinsics.h(classDescriptor, "classDescriptor");
        g().getClass();
        LazyJavaClassDescriptor lazyJavaClassDescriptorF = f(classDescriptor);
        if (lazyJavaClassDescriptorF == null || (setA = lazyJavaClassDescriptorF.K0().a()) == null) {
            setA = EmptySet.d;
        }
        return setA;
    }

    public final LazyJavaClassDescriptor f(ClassDescriptor classDescriptor) {
        FqName fqNameA;
        if (classDescriptor == null) {
            KotlinBuiltIns.a(108);
            throw null;
        }
        Name name = KotlinBuiltIns.f;
        if (!KotlinBuiltIns.b(classDescriptor, StandardNames.FqNames.f24314a) && KotlinBuiltIns.K(classDescriptor)) {
            FqNameUnsafe fqNameUnsafeH = DescriptorUtilsKt.h(classDescriptor);
            if (fqNameUnsafeH.d()) {
                String str = JavaToKotlinClassMap.f24321a;
                ClassId classIdE = JavaToKotlinClassMap.e(fqNameUnsafeH);
                if (classIdE != null && (fqNameA = classIdE.a()) != null) {
                    ModuleDescriptor moduleDescriptorA = g().a();
                    NoLookupLocation noLookupLocation = NoLookupLocation.d;
                    ClassDescriptor classDescriptorB = DescriptorUtilKt.b(moduleDescriptorA, fqNameA);
                    if (classDescriptorB instanceof LazyJavaClassDescriptor) {
                        return (LazyJavaClassDescriptor) classDescriptorB;
                    }
                }
            }
        }
        return null;
    }

    public final JvmBuiltIns.Settings g() {
        return (JvmBuiltIns.Settings) StorageKt.a(this.b, h[0]);
    }
}
