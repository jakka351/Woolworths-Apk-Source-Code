package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependenciesImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public abstract class KotlinBuiltIns {
    public static final Name f = Name.l("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    public ModuleDescriptorImpl f24310a;
    public final NotNullLazyValue b;
    public final NotNullLazyValue c;
    public final MemoizedFunctionToNotNull d;
    public final LockBasedStorageManager e;

    /* loaded from: classes7.dex */
    public static class Primitives {

        /* renamed from: a, reason: collision with root package name */
        public final EnumMap f24311a;
        public final HashMap b;

        public Primitives(EnumMap enumMap, HashMap map, HashMap map2) {
            this.f24311a = enumMap;
            this.b = map2;
        }
    }

    public KotlinBuiltIns(LockBasedStorageManager lockBasedStorageManager) {
        this.e = lockBasedStorageManager;
        this.c = lockBasedStorageManager.d(new Function0<Collection<PackageViewDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
                return Arrays.asList(kotlinBuiltIns.l().L(StandardNames.l), kotlinBuiltIns.l().L(StandardNames.n), kotlinBuiltIns.l().L(StandardNames.o), kotlinBuiltIns.l().L(StandardNames.m));
            }
        });
        this.b = lockBasedStorageManager.d(new Function0<Primitives>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    String strB = primitiveType.d.b();
                    if (strB == null) {
                        KotlinBuiltIns.a(47);
                        throw null;
                    }
                    Name name = KotlinBuiltIns.f;
                    KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
                    SimpleType simpleTypeT = kotlinBuiltIns.k(strB).t();
                    if (simpleTypeT == null) {
                        KotlinBuiltIns.a(48);
                        throw null;
                    }
                    String strB2 = primitiveType.e.b();
                    if (strB2 == null) {
                        KotlinBuiltIns.a(47);
                        throw null;
                    }
                    SimpleType simpleTypeT2 = kotlinBuiltIns.k(strB2).t();
                    if (simpleTypeT2 == null) {
                        KotlinBuiltIns.a(48);
                        throw null;
                    }
                    enumMap.put((EnumMap) primitiveType, (PrimitiveType) simpleTypeT2);
                    map.put(simpleTypeT, simpleTypeT2);
                    map2.put(simpleTypeT2, simpleTypeT);
                }
                return new Primitives(enumMap, map, map2);
            }
        });
        this.d = lockBasedStorageManager.g(new Function1<Name, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                ModuleDescriptorImpl moduleDescriptorImplL = KotlinBuiltIns.this.l();
                FqName fqName = StandardNames.l;
                MemberScope memberScopeS = moduleDescriptorImplL.L(fqName).s();
                if (memberScopeS == null) {
                    KotlinBuiltIns.a(11);
                    throw null;
                }
                ClassifierDescriptor classifierDescriptorF = ((AbstractScopeAdapter) memberScopeS).f(name, NoLookupLocation.d);
                if (classifierDescriptorF == null) {
                    throw new AssertionError("Built-in class " + fqName.a(name) + " is not found");
                }
                if (classifierDescriptorF instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorF;
                }
                throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorF);
            }
        });
    }

    public static boolean A(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return DescriptorUtils.i(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(97);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return J(kotlinType.J0(), fqNameUnsafe);
        }
        a(98);
        throw null;
    }

    public static boolean C(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe != null) {
            return B(kotlinType, fqNameUnsafe) && !kotlinType.K0();
        }
        a(135);
        throw null;
    }

    public static boolean D(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor.a().getAnnotations().m2(StandardNames.FqNames.m)) {
            return true;
        }
        if (!(functionDescriptor instanceof PropertyDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) functionDescriptor;
        boolean zC = propertyDescriptor.C();
        PropertyGetterDescriptorImpl getter = propertyDescriptor.getGetter();
        PropertySetterDescriptor propertySetterDescriptorC = propertyDescriptor.c();
        if (getter == null || !D(getter)) {
            return false;
        }
        if (zC) {
            return propertySetterDescriptorC != null && D(propertySetterDescriptorC);
        }
        return true;
    }

    public static boolean E(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe != null) {
            return !kotlinType.K0() && B(kotlinType, fqNameUnsafe);
        }
        a(106);
        throw null;
    }

    public static boolean F(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(136);
            throw null;
        }
        if (kotlinType != null) {
            return B(kotlinType, StandardNames.FqNames.b) && !TypeUtils.f(kotlinType);
        }
        a(138);
        throw null;
    }

    public static boolean G(KotlinType kotlinType) {
        if (kotlinType != null) {
            ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
            return (classifierDescriptorC == null || s(classifierDescriptorC) == null) ? false : true;
        }
        a(91);
        throw null;
    }

    public static boolean H(KotlinType kotlinType) {
        if (kotlinType.K0()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        return (classifierDescriptorC instanceof ClassDescriptor) && u((ClassDescriptor) classifierDescriptorC) != null;
    }

    public static boolean I(KotlinType kotlinType) {
        return E(kotlinType, StandardNames.FqNames.f);
    }

    public static boolean J(TypeConstructor typeConstructor, FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            a(101);
            throw null;
        }
        if (fqNameUnsafe != null) {
            ClassifierDescriptor classifierDescriptorC = typeConstructor.c();
            return (classifierDescriptorC instanceof ClassDescriptor) && b((ClassDescriptor) classifierDescriptorC, fqNameUnsafe);
        }
        a(102);
        throw null;
    }

    public static boolean K(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            a(10);
            throw null;
        }
        for (ClassifierDescriptor classifierDescriptorE = classifierDescriptor; classifierDescriptorE != null; classifierDescriptorE = classifierDescriptorE.e()) {
            if (classifierDescriptorE instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) classifierDescriptorE).d().c(StandardNames.k);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r23) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.a(int):void");
    }

    public static boolean b(ClassDescriptor classDescriptor, FqNameUnsafe fqNameUnsafe) {
        if (classDescriptor == null) {
            a(103);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return classDescriptor.getName().equals(fqNameUnsafe.f()) && fqNameUnsafe.equals(DescriptorUtils.g(classDescriptor));
        }
        a(104);
        throw null;
    }

    public static PrimitiveType s(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            a(77);
            throw null;
        }
        if (StandardNames.FqNames.e0.contains(classifierDescriptor.getName())) {
            return (PrimitiveType) StandardNames.FqNames.g0.get(DescriptorUtils.g(classifierDescriptor));
        }
        return null;
    }

    public static PrimitiveType u(ClassDescriptor classDescriptor) {
        if (StandardNames.FqNames.d0.contains(classDescriptor.getName())) {
            return (PrimitiveType) StandardNames.FqNames.f0.get(DescriptorUtils.g(classDescriptor));
        }
        return null;
    }

    public static boolean y(KotlinType kotlinType) {
        if (kotlinType != null) {
            return B(kotlinType, StandardNames.FqNames.f24314a);
        }
        a(139);
        throw null;
    }

    public static boolean z(KotlinType kotlinType) {
        if (kotlinType != null) {
            return B(kotlinType, StandardNames.FqNames.g);
        }
        a(88);
        throw null;
    }

    public final void L(final ModuleDescriptorImpl moduleDescriptorImpl) {
        this.e.h(new Function0<Void>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
                ModuleDescriptorImpl moduleDescriptorImpl2 = kotlinBuiltIns.f24310a;
                ModuleDescriptorImpl moduleDescriptorImpl3 = moduleDescriptorImpl;
                if (moduleDescriptorImpl2 == null) {
                    kotlinBuiltIns.f24310a = moduleDescriptorImpl3;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + kotlinBuiltIns.f24310a + " (attempting to reset to " + moduleDescriptorImpl3 + ")");
            }
        });
    }

    public final void c(boolean z) {
        Name moduleName = f;
        Intrinsics.h(moduleName, "moduleName");
        LockBasedStorageManager lockBasedStorageManager = this.e;
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(moduleName, lockBasedStorageManager, this, 48);
        this.f24310a = moduleDescriptorImpl;
        BuiltInsLoader.f24307a.getClass();
        moduleDescriptorImpl.k = BuiltInsLoader.Companion.a().a(lockBasedStorageManager, this.f24310a, m(), q(), d(), z);
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f24310a;
        moduleDescriptorImpl2.getClass();
        moduleDescriptorImpl2.j = new ModuleDependenciesImpl(ArraysKt.l0(new ModuleDescriptorImpl[]{moduleDescriptorImpl2}));
    }

    public AdditionalClassPartsProvider d() {
        return AdditionalClassPartsProvider.None.f24352a;
    }

    public final SimpleType e() {
        SimpleType simpleTypeT = k("Any").t();
        if (simpleTypeT != null) {
            return simpleTypeT;
        }
        a(51);
        throw null;
    }

    public final KotlinType f(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(68);
            throw null;
        }
        KotlinType kotlinTypeG = g(kotlinType);
        if (kotlinTypeG != null) {
            return kotlinTypeG;
        }
        throw new IllegalStateException("not array: " + kotlinType);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType g(kotlin.reflect.jvm.internal.impl.types.KotlinType r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L87
            boolean r1 = z(r5)
            r2 = 0
            if (r1 == 0) goto L26
            java.util.List r1 = r5.H0()
            int r1 = r1.size()
            r3 = 1
            if (r1 == r3) goto L17
            goto L86
        L17:
            java.util.List r5 = r5.H0()
            java.lang.Object r5 = r5.get(r2)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r5 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r5
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r5.getType()
            return r5
        L26:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r5 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.h(r5, r2)
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r1 = r4.b
            java.lang.Object r1 = r1.invoke()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$Primitives r1 = (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives) r1
            java.util.HashMap r1 = r1.b
            java.lang.Object r1 = r1.get(r5)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
            if (r1 == 0) goto L3d
            return r1
        L3d:
            int r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.f24530a
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r1 = r5.J0()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r1 = r1.c()
            if (r1 != 0) goto L4b
            r1 = r0
            goto L4f
        L4b:
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.e(r1)
        L4f:
            if (r1 == 0) goto L86
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r5.J0()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r5 = r5.c()
            if (r5 != 0) goto L5d
        L5b:
            r5 = r0
            goto L83
        L5d:
            java.util.Set r2 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.f24316a
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r5.getName()
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.b(r2)
            if (r2 != 0) goto L6a
            goto L5b
        L6a:
            kotlin.reflect.jvm.internal.impl.name.ClassId r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r5)
            if (r5 != 0) goto L71
            goto L5b
        L71:
            kotlin.reflect.jvm.internal.impl.name.ClassId r5 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.a(r5)
            if (r5 != 0) goto L78
            goto L5b
        L78:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r5 = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.a(r1, r5)
            if (r5 != 0) goto L7f
            goto L5b
        L7f:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r5.t()
        L83:
            if (r5 == 0) goto L86
            return r5
        L86:
            return r0
        L87:
            r5 = 70
            a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.g(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }

    public final SimpleType h(UnwrappedType unwrappedType) {
        Variance variance = Variance.f;
        if (unwrappedType != null) {
            return i(variance, unwrappedType, Annotations.Companion.f24350a);
        }
        a(83);
        throw null;
    }

    public final SimpleType i(Variance variance, KotlinType kotlinType, Annotations annotations) {
        if (kotlinType != null) {
            return KotlinTypeFactory.c(TypeAttributesKt.b(annotations), k("Array"), Collections.singletonList(new TypeProjectionImpl(kotlinType, variance)));
        }
        a(79);
        throw null;
    }

    public final ClassDescriptor j(FqName fqName) {
        if (fqName == null) {
            a(12);
            throw null;
        }
        ModuleDescriptorImpl moduleDescriptorImplL = l();
        NoLookupLocation noLookupLocation = NoLookupLocation.d;
        ClassDescriptor classDescriptorB = DescriptorUtilKt.b(moduleDescriptorImplL, fqName);
        if (classDescriptorB != null) {
            return classDescriptorB;
        }
        a(13);
        throw null;
    }

    public final ClassDescriptor k(String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) this.d.invoke(Name.e(str));
        if (classDescriptor != null) {
            return classDescriptor;
        }
        a(15);
        throw null;
    }

    public final ModuleDescriptorImpl l() {
        this.f24310a.getClass();
        ModuleDescriptorImpl moduleDescriptorImpl = this.f24310a;
        if (moduleDescriptorImpl != null) {
            return moduleDescriptorImpl;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.e, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final SimpleType n() {
        SimpleType simpleTypeP = p();
        if (simpleTypeP != null) {
            return simpleTypeP;
        }
        a(53);
        throw null;
    }

    public final SimpleType o() {
        SimpleType simpleTypeT = k("Nothing").t();
        if (simpleTypeT != null) {
            return simpleTypeT;
        }
        a(49);
        throw null;
    }

    public final SimpleType p() {
        SimpleType simpleTypeQ0 = e().N0(true);
        if (simpleTypeQ0 != null) {
            return simpleTypeQ0;
        }
        a(52);
        throw null;
    }

    public PlatformDependentDeclarationFilter q() {
        return PlatformDependentDeclarationFilter.NoPlatformDependent.f24354a;
    }

    public final SimpleType r(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(73);
            throw null;
        }
        SimpleType simpleType = (SimpleType) ((Primitives) this.b.invoke()).f24311a.get(primitiveType);
        if (simpleType != null) {
            return simpleType;
        }
        a(74);
        throw null;
    }

    public final SimpleType t(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(54);
            throw null;
        }
        if (primitiveType == null) {
            a(16);
            throw null;
        }
        SimpleType simpleTypeT = k(primitiveType.d.b()).t();
        if (simpleTypeT != null) {
            return simpleTypeT;
        }
        a(55);
        throw null;
    }

    public final SimpleType v() {
        SimpleType simpleTypeT = k("String").t();
        if (simpleTypeT != null) {
            return simpleTypeT;
        }
        a(66);
        throw null;
    }

    public final ClassDescriptor w(int i) {
        return j(StandardNames.f.a(Name.e(FunctionTypeKind.SuspendFunction.c.b + i)));
    }

    public final SimpleType x() {
        SimpleType simpleTypeT = k("Unit").t();
        if (simpleTypeT != null) {
            return simpleTypeT;
        }
        a(65);
        throw null;
    }
}
