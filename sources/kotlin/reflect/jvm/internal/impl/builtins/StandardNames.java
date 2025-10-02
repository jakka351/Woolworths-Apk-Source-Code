package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes.dex */
public final class StandardNames {

    /* renamed from: a, reason: collision with root package name */
    public static final Name f24313a;
    public static final Name b;
    public static final Name c;
    public static final Name d;
    public static final Name e;
    public static final FqName f;
    public static final FqName g;
    public static final FqName h;
    public static final FqName i;
    public static final List j;
    public static final Name k;
    public static final FqName l;
    public static final FqName m;
    public static final FqName n;
    public static final FqName o;
    public static final FqName p;
    public static final FqName q;
    public static final Set r;

    @SourceDebugExtension
    public static final class FqNames {
        public static final FqName A;
        public static final FqName B;
        public static final FqName C;
        public static final FqName D;
        public static final FqName E;
        public static final FqName F;
        public static final FqName G;
        public static final FqName H;
        public static final FqName I;
        public static final FqName J;
        public static final FqName K;
        public static final FqName L;
        public static final FqName M;
        public static final FqName N;
        public static final FqName O;
        public static final FqName P;
        public static final FqNameUnsafe Q;
        public static final ClassId R;
        public static final ClassId S;
        public static final ClassId T;
        public static final ClassId U;
        public static final ClassId V;
        public static final FqName W;
        public static final FqName X;
        public static final FqName Y;
        public static final FqName Z;
        public static final FqName a0;
        public static final FqName b0;
        public static final FqName c0;
        public static final FqNameUnsafe d;
        public static final HashSet d0;
        public static final FqNameUnsafe e;
        public static final HashSet e0;
        public static final FqNameUnsafe f;
        public static final HashMap f0;
        public static final FqNameUnsafe g;
        public static final HashMap g0;
        public static final FqNameUnsafe h;
        public static final FqNameUnsafe i;
        public static final FqNameUnsafe j;
        public static final FqName k;
        public static final FqName l;
        public static final FqName m;
        public static final FqName n;
        public static final FqName o;
        public static final FqName p;
        public static final FqName q;
        public static final FqName r;
        public static final FqName s;
        public static final FqName t;
        public static final FqName u;
        public static final FqName v;
        public static final FqName w;
        public static final FqName x;
        public static final FqName y;
        public static final FqName z;

        /* renamed from: a, reason: collision with root package name */
        public static final FqNameUnsafe f24314a = d("Any").f24500a;
        public static final FqNameUnsafe b = d("Nothing").f24500a;
        public static final FqNameUnsafe c = d("Cloneable").f24500a;

        static {
            d("Suppress");
            d = d("Unit").f24500a;
            e = d("CharSequence").f24500a;
            f = d("String").f24500a;
            g = d("Array").f24500a;
            h = d("Boolean").f24500a;
            d("Char");
            d("Byte");
            d("Short");
            d("Int");
            d("Long");
            d("Float");
            d("Double");
            i = d("Number").f24500a;
            j = d("Enum").f24500a;
            d("Function");
            k = d("Throwable");
            l = d("Comparable");
            FqName fqName = StandardNames.o;
            fqName.a(Name.e("IntRange"));
            fqName.a(Name.e("LongRange"));
            m = d("Deprecated");
            d("DeprecatedSinceKotlin");
            n = d("DeprecationLevel");
            o = d("ReplaceWith");
            p = d("ExtensionFunctionType");
            q = d("ContextFunctionTypeParams");
            FqName fqNameD = d("ParameterName");
            r = fqNameD;
            ClassId.Companion.b(fqNameD);
            s = d("Annotation");
            FqName fqNameA = a("Target");
            t = fqNameA;
            ClassId.Companion.b(fqNameA);
            u = a("AnnotationTarget");
            v = a("AnnotationRetention");
            FqName fqNameA2 = a("Retention");
            w = fqNameA2;
            ClassId.Companion.b(fqNameA2);
            ClassId.Companion.b(a("Repeatable"));
            x = a("MustBeDocumented");
            y = d("UnsafeVariance");
            d("PublishedApi");
            StandardNames.p.a(Name.e("AccessibleLateinitPropertyLiteral"));
            FqName fqName2 = new FqName("kotlin.internal.PlatformDependent");
            z = fqName2;
            ClassId.Companion.b(fqName2);
            A = b("Iterator");
            B = b("Iterable");
            C = b("Collection");
            D = b("List");
            E = b("ListIterator");
            F = b("Set");
            FqName fqNameB = b("Map");
            G = fqNameB;
            H = fqNameB.a(Name.e("Entry"));
            I = b("MutableIterator");
            J = b("MutableIterable");
            K = b("MutableCollection");
            L = b("MutableList");
            M = b("MutableListIterator");
            N = b("MutableSet");
            FqName fqNameB2 = b("MutableMap");
            O = fqNameB2;
            P = fqNameB2.a(Name.e("MutableEntry"));
            Q = e("KClass");
            e("KType");
            e("KCallable");
            e("KProperty0");
            e("KProperty1");
            e("KProperty2");
            e("KMutableProperty0");
            e("KMutableProperty1");
            e("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeE = e("KProperty");
            e("KMutableProperty");
            R = ClassId.Companion.b(fqNameUnsafeE.g());
            e("KDeclarationContainer");
            e("findAssociatedObject");
            FqName fqNameD2 = d("UByte");
            FqName fqNameD3 = d("UShort");
            FqName fqNameD4 = d("UInt");
            FqName fqNameD5 = d("ULong");
            S = ClassId.Companion.b(fqNameD2);
            T = ClassId.Companion.b(fqNameD3);
            U = ClassId.Companion.b(fqNameD4);
            V = ClassId.Companion.b(fqNameD5);
            W = d("UByteArray");
            X = d("UShortArray");
            Y = d("UIntArray");
            Z = d("ULongArray");
            c("AtomicInt");
            c("AtomicLong");
            c("AtomicBoolean");
            c("AtomicReference");
            a0 = c("AtomicIntArray");
            b0 = c("AtomicLongArray");
            c0 = c("AtomicArray");
            int length = PrimitiveType.values().length;
            HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSet.add(primitiveType.d);
            }
            d0 = hashSet;
            int length2 = PrimitiveType.values().length;
            HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSet2.add(primitiveType2.e);
            }
            e0 = hashSet2;
            int length3 = PrimitiveType.values().length;
            HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                String strB = primitiveType3.d.b();
                Intrinsics.g(strB, "asString(...)");
                map.put(d(strB).f24500a, primitiveType3);
            }
            f0 = map;
            int length4 = PrimitiveType.values().length;
            HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                String strB2 = primitiveType4.e.b();
                Intrinsics.g(strB2, "asString(...)");
                map2.put(d(strB2).f24500a, primitiveType4);
            }
            g0 = map2;
        }

        public static FqName a(String str) {
            return StandardNames.m.a(Name.e(str));
        }

        public static FqName b(String str) {
            return StandardNames.n.a(Name.e(str));
        }

        public static FqName c(String str) {
            return StandardNames.q.a(Name.e(str));
        }

        public static FqName d(String str) {
            return StandardNames.l.a(Name.e(str));
        }

        public static final FqNameUnsafe e(String str) {
            return StandardNames.i.a(Name.e(str)).f24500a;
        }
    }

    static {
        Name.e("field");
        Name.e("value");
        f24313a = Name.e("values");
        b = Name.e("entries");
        c = Name.e("valueOf");
        Name.e("copy");
        Name.e("hashCode");
        Name.e("toString");
        Name.e("equals");
        Name.e("code");
        d = Name.e(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Name.e("main");
        Name.e("nextChar");
        Name.e("it");
        e = Name.e("count");
        new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        f = fqName;
        new FqName("kotlin.coroutines.jvm.internal");
        new FqName("kotlin.coroutines.intrinsics");
        g = fqName.a(Name.e("Continuation"));
        h = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        i = fqName2;
        j = CollectionsKt.R("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Name nameE = Name.e("kotlin");
        k = nameE;
        FqName fqNameA = FqName.Companion.a(nameE);
        l = fqNameA;
        FqName fqNameA2 = fqNameA.a(Name.e("annotation"));
        m = fqNameA2;
        FqName fqNameA3 = fqNameA.a(Name.e("collections"));
        n = fqNameA3;
        FqName fqNameA4 = fqNameA.a(Name.e("ranges"));
        o = fqNameA4;
        fqNameA.a(Name.e(TextBundle.TEXT_ENTRY));
        FqName fqNameA5 = fqNameA.a(Name.e("internal"));
        p = fqNameA5;
        FqName fqNameA6 = fqNameA.a(Name.e("concurrent")).a(Name.e("atomics"));
        q = fqNameA6;
        new FqName("error.NonExistentClass");
        r = ArraysKt.r0(new FqName[]{fqNameA, fqNameA3, fqNameA4, fqNameA2, fqName2, fqNameA5, fqName, fqNameA6});
    }
}
