package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import YU.a;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JavaToKotlinClassMap {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24321a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final ClassId e;
    public static final FqName f;
    public static final ClassId g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final List n;

    public static final class PlatformMutabilityMapping {

        /* renamed from: a, reason: collision with root package name */
        public final ClassId f24322a;
        public final ClassId b;
        public final ClassId c;

        public PlatformMutabilityMapping(ClassId classId, ClassId classId2, ClassId classId3) {
            this.f24322a = classId;
            this.b = classId2;
            this.c = classId3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.c(this.f24322a, platformMutabilityMapping.f24322a) && Intrinsics.c(this.b, platformMutabilityMapping.b) && Intrinsics.c(this.c, platformMutabilityMapping.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f24322a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f24322a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.c;
        sb.append(function.f24318a);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(function.b);
        f24321a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.c;
        sb2.append(kFunction.f24318a);
        sb2.append(JwtParser.SEPARATOR_CHAR);
        sb2.append(kFunction.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.c;
        sb3.append(suspendFunction.f24318a);
        sb3.append(JwtParser.SEPARATOR_CHAR);
        sb3.append(suspendFunction.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.c;
        sb4.append(kSuspendFunction.f24318a);
        sb4.append(JwtParser.SEPARATOR_CHAR);
        sb4.append(kSuspendFunction.b);
        d = sb4.toString();
        ClassId classIdB = ClassId.Companion.b(new FqName("kotlin.jvm.functions.FunctionN"));
        e = classIdB;
        f = classIdB.a();
        g = StandardClassIds.s;
        c(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        ClassId classIdB2 = ClassId.Companion.b(StandardNames.FqNames.B);
        FqName fqName = StandardNames.FqNames.J;
        FqName fqName2 = classIdB2.f24499a;
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(c(Iterable.class), classIdB2, new ClassId(fqName2, FqNamesUtilKt.b(fqName, fqName2), false));
        ClassId classIdB3 = ClassId.Companion.b(StandardNames.FqNames.A);
        FqName fqName3 = StandardNames.FqNames.I;
        FqName fqName4 = classIdB3.f24499a;
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(c(Iterator.class), classIdB3, new ClassId(fqName4, FqNamesUtilKt.b(fqName3, fqName4), false));
        ClassId classIdB4 = ClassId.Companion.b(StandardNames.FqNames.C);
        FqName fqName5 = StandardNames.FqNames.K;
        FqName fqName6 = classIdB4.f24499a;
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(c(Collection.class), classIdB4, new ClassId(fqName6, FqNamesUtilKt.b(fqName5, fqName6), false));
        ClassId classIdB5 = ClassId.Companion.b(StandardNames.FqNames.D);
        FqName fqName7 = StandardNames.FqNames.L;
        FqName fqName8 = classIdB5.f24499a;
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(c(List.class), classIdB5, new ClassId(fqName8, FqNamesUtilKt.b(fqName7, fqName8), false));
        ClassId classIdB6 = ClassId.Companion.b(StandardNames.FqNames.F);
        FqName fqName9 = StandardNames.FqNames.N;
        FqName fqName10 = classIdB6.f24499a;
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(c(Set.class), classIdB6, new ClassId(fqName10, FqNamesUtilKt.b(fqName9, fqName10), false));
        ClassId classIdB7 = ClassId.Companion.b(StandardNames.FqNames.E);
        FqName fqName11 = StandardNames.FqNames.M;
        FqName fqName12 = classIdB7.f24499a;
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(c(ListIterator.class), classIdB7, new ClassId(fqName12, FqNamesUtilKt.b(fqName11, fqName12), false));
        FqName fqName13 = StandardNames.FqNames.G;
        ClassId classIdB8 = ClassId.Companion.b(fqName13);
        FqName fqName14 = StandardNames.FqNames.O;
        FqName fqName15 = classIdB8.f24499a;
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(c(Map.class), classIdB8, new ClassId(fqName15, FqNamesUtilKt.b(fqName14, fqName15), false));
        ClassId classIdD = ClassId.Companion.b(fqName13).d(StandardNames.FqNames.H.f24500a.f());
        FqName fqName16 = StandardNames.FqNames.P;
        FqName fqName17 = classIdD.f24499a;
        List<PlatformMutabilityMapping> listR = CollectionsKt.R(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(c(Map.Entry.class), classIdD, new ClassId(fqName17, FqNamesUtilKt.b(fqName16, fqName17), false)));
        n = listR;
        b(Object.class, StandardNames.FqNames.f24314a);
        b(String.class, StandardNames.FqNames.f);
        b(CharSequence.class, StandardNames.FqNames.e);
        a(c(Throwable.class), ClassId.Companion.b(StandardNames.FqNames.k));
        b(Cloneable.class, StandardNames.FqNames.c);
        b(Number.class, StandardNames.FqNames.i);
        a(c(Comparable.class), ClassId.Companion.b(StandardNames.FqNames.l));
        b(Enum.class, StandardNames.FqNames.j);
        a(c(Annotation.class), ClassId.Companion.b(StandardNames.FqNames.s));
        for (PlatformMutabilityMapping platformMutabilityMapping8 : listR) {
            ClassId classId = platformMutabilityMapping8.f24322a;
            ClassId classId2 = platformMutabilityMapping8.b;
            ClassId classId3 = platformMutabilityMapping8.c;
            a(classId, classId2);
            i.put(classId3.a().f24500a, classId);
            l.put(classId3, classId2);
            m.put(classId2, classId3);
            FqName fqNameA = classId2.a();
            FqName fqNameA2 = classId3.a();
            j.put(classId3.a().f24500a, fqNameA);
            k.put(fqNameA.f24500a, fqNameA2);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            FqName fqName18 = jvmPrimitiveType.g;
            if (fqName18 == null) {
                JvmPrimitiveType.a(15);
                throw null;
            }
            ClassId classIdB9 = ClassId.Companion.b(fqName18);
            PrimitiveType primitiveTypeD = jvmPrimitiveType.d();
            Intrinsics.g(primitiveTypeD, "getPrimitiveType(...)");
            a(classIdB9, ClassId.Companion.b(StandardNames.l.a(primitiveTypeD.d)));
        }
        for (ClassId classId4 : CompanionObjectMapping.f24309a) {
            a(ClassId.Companion.b(new FqName("kotlin.jvm.internal." + classId4.f().b() + "CompanionObject")), classId4.d(SpecialNames.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            a(ClassId.Companion.b(new FqName(a.d(i2, "kotlin.jvm.functions.Function"))), new ClassId(StandardNames.l, Name.e("Function" + i2)));
            i.put(new FqName(a.n(new StringBuilder(), b, i2)).f24500a, g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.c;
            i.put(new FqName((kSuspendFunction2.f24318a + JwtParser.SEPARATOR_CHAR + kSuspendFunction2.b) + i3).f24500a, g);
        }
        FqName fqName19 = new FqName("kotlin.concurrent.atomics.AtomicInt");
        ClassId classIdC = c(AtomicInteger.class);
        HashMap map = i;
        map.put(fqName19.f24500a, classIdC);
        map.put(new FqName("kotlin.concurrent.atomics.AtomicLong").f24500a, c(AtomicLong.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicBoolean").f24500a, c(AtomicBoolean.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicReference").f24500a, c(AtomicReference.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicIntArray").f24500a, c(AtomicIntegerArray.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicLongArray").f24500a, c(AtomicLongArray.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicArray").f24500a, c(AtomicReferenceArray.class));
        map.put(StandardNames.FqNames.b.g().f24500a, c(Void.class));
    }

    public static void a(ClassId classId, ClassId classId2) {
        h.put(classId.a().f24500a, classId2);
        i.put(classId2.a().f24500a, classId);
    }

    public static void b(Class cls, FqNameUnsafe fqNameUnsafe) {
        a(c(cls), ClassId.Companion.b(fqNameUnsafe.g()));
    }

    public static ClassId c(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return c(declaringClass).d(Name.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        Intrinsics.g(canonicalName, "getCanonicalName(...)");
        return ClassId.Companion.b(new FqName(canonicalName));
    }

    public static boolean d(FqNameUnsafe fqNameUnsafe, String str) {
        Integer numI0;
        String str2 = fqNameUnsafe.f24501a;
        if (StringsKt.W(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            Intrinsics.g(strSubstring, "substring(...)");
            if (!StringsKt.X(strSubstring, '0') && (numI0 = StringsKt.i0(strSubstring)) != null && numI0.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static ClassId e(FqNameUnsafe kotlinFqName) {
        Intrinsics.h(kotlinFqName, "kotlinFqName");
        return (d(kotlinFqName, f24321a) || d(kotlinFqName, c)) ? e : (d(kotlinFqName, b) || d(kotlinFqName, d)) ? g : (ClassId) i.get(kotlinFqName);
    }
}
