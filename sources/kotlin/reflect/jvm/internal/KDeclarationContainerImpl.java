package kotlin.reflect.jvm.internal;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Data", "MemberBelonginess", "FunctionJvmDescriptor", "Companion", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {
    public static final Regex d = new Regex("<v#(\\d+)>");

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public abstract class Data {
        public static final /* synthetic */ KProperty[] b = {Reflection.f24268a.h(new PropertyReference1Impl(Data.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* renamed from: a, reason: collision with root package name */
        public final ReflectProperties.LazySoftVal f24289a;

        public Data(final KDeclarationContainerImpl kDeclarationContainerImpl) {
            this.f24289a = ReflectProperties.a(null, new Function0(kDeclarationContainerImpl) { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$$Lambda$0
                public final KDeclarationContainerImpl d;

                {
                    this.d = kDeclarationContainerImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KDeclarationContainerImpl.Data.b;
                    return ModuleByClassLoaderKt.a(this.d.getD());
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class FunctionJvmDescriptor {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24290a;
        public final Class b;

        public FunctionJvmDescriptor(ArrayList arrayList, Class cls) {
            this.f24290a = arrayList;
            this.b = cls;
        }

        public final List a() {
            return this.f24290a;
        }

        /* renamed from: b, reason: from getter */
        public final Class getB() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class MemberBelonginess {
        public static final MemberBelonginess d;
        public static final MemberBelonginess e;
        public static final /* synthetic */ MemberBelonginess[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            MemberBelonginess memberBelonginess = new MemberBelonginess("DECLARED", 0);
            d = memberBelonginess;
            MemberBelonginess memberBelonginess2 = new MemberBelonginess("INHERITED", 1);
            e = memberBelonginess2;
            MemberBelonginess[] memberBelonginessArr = {memberBelonginess, memberBelonginess2};
            f = memberBelonginessArr;
            g = EnumEntriesKt.a(memberBelonginessArr);
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) f.clone();
        }

        public final boolean a(CallableMemberDescriptor callableMemberDescriptor) {
            CallableMemberDescriptor.Kind kindF = callableMemberDescriptor.f();
            kindF.getClass();
            return (kindF != CallableMemberDescriptor.Kind.e) == (this == d);
        }
    }

    public static Method C(Class cls, String str, Class[] clsArr, Class cls2, boolean z) throws NoSuchMethodException, SecurityException {
        Class clsA;
        Method methodC;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodG = G(cls, str, clsArr, cls2);
        if (methodG != null) {
            return methodG;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodC = C(superclass, str, clsArr, cls2, z)) != null) {
            return methodC;
        }
        Iterator itA = ArrayIteratorKt.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls3 = (Class) itA.next();
            Intrinsics.e(cls3);
            Method methodC2 = C(cls3, str, clsArr, cls2, z);
            if (methodC2 != null) {
                return methodC2;
            }
            if (z && (clsA = ReflectJavaClassFinderKt.a(ReflectClassUtilKt.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodG2 = G(clsA, str, clsArr, cls2);
                if (methodG2 != null) {
                    return methodG2;
                }
            }
        }
        return null;
    }

    public static Constructor F(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method G(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.c(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.g(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.c(method.getName(), str) && Intrinsics.c(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void m(ArrayList arrayList, List list, boolean z) {
        Class cls;
        cls = DefaultConstructorMarker.class;
        if (Intrinsics.c(CollectionsKt.P(list), cls)) {
            list = list.subList(0, list.size() - 1);
        }
        arrayList.addAll(list);
        int size = (list.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.g(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    public abstract Collection A(Name name);

    public final FunctionJvmDescriptor D(String str, boolean z) {
        int iB;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (StringsKt.p("VZCBSIFJD", cCharAt)) {
                iB = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iB = StringsKt.B(str, ';', i, 4) + 1;
            }
            arrayList.add(E(i, iB, str));
            i = iB;
        }
        return new FunctionJvmDescriptor(arrayList, z ? E(i + 1, str.length(), str) : null);
    }

    public final Class E(int i, int i2, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = ReflectClassUtilKt.d(getD());
            String strSubstring = str.substring(i + 1, i2 - 1);
            Intrinsics.g(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderD.loadClass(StringsKt.R(strSubstring, '/', JwtParser.SEPARATOR_CHAR));
            Intrinsics.g(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.g(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsE = E(i + 1, i2, str);
            FqName fqName = UtilKt.f24294a;
            Intrinsics.h(clsE, "<this>");
            return Array.newInstance((Class<?>) clsE, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    public final Method n(String name, String desc, boolean z) {
        Intrinsics.h(name, "name");
        Intrinsics.h(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getD());
        }
        FunctionJvmDescriptor functionJvmDescriptorD = D(desc, true);
        m(arrayList, functionJvmDescriptorD.a(), false);
        Class clsV = v();
        String strConcat = name.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class b = functionJvmDescriptorD.getB();
        Intrinsics.e(b);
        return C(clsV, strConcat, clsArr, b, z);
    }

    public final Method q(String name, String desc) throws NoSuchMethodException, SecurityException {
        Method methodC;
        Intrinsics.h(name, "name");
        Intrinsics.h(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        FunctionJvmDescriptor functionJvmDescriptorD = D(desc, true);
        Class[] clsArr = (Class[]) functionJvmDescriptorD.a().toArray(new Class[0]);
        Class b = functionJvmDescriptorD.getB();
        Intrinsics.e(b);
        Method methodC2 = C(v(), name, clsArr, b, false);
        if (methodC2 != null) {
            return methodC2;
        }
        if (!v().isInterface() || (methodC = C(Object.class, name, clsArr, b, false)) == null) {
            return null;
        }
        return methodC;
    }

    public abstract Collection r();

    public abstract Collection s(Name name);

    public abstract PropertyDescriptor t(int i);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection u(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.h(r8, r0)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1 r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.a(r8, r2, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1b:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L49
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r6 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.h
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r6)
            if (r5 != 0) goto L49
            boolean r4 = r9.a(r4)
            if (r4 == 0) goto L49
            kotlin.Unit r4 = kotlin.Unit.f24250a
            java.lang.Object r3 = r3.V(r0, r4)
            kotlin.reflect.jvm.internal.KCallableImpl r3 = (kotlin.reflect.jvm.internal.KCallableImpl) r3
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r3 == 0) goto L1b
            r1.add(r3)
            goto L1b
        L50:
            java.util.List r8 = kotlin.collections.CollectionsKt.G0(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.u(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    public Class v() {
        Class d2 = getD();
        List list = ReflectClassUtilKt.f24377a;
        Intrinsics.h(d2, "<this>");
        Class cls = (Class) ReflectClassUtilKt.c.get(d2);
        return cls == null ? getD() : cls;
    }
}
