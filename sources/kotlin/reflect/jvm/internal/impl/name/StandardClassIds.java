package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class StandardClassIds {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f24504a;
    public static final FqName b;
    public static final FqName c;
    public static final FqName d;
    public static final FqName e;
    public static final FqName f;
    public static final FqName g;
    public static final Set h;
    public static final Set i;
    public static final ClassId j;
    public static final ClassId k;
    public static final ClassId l;
    public static final ClassId m;
    public static final ClassId n;
    public static final ClassId o;
    public static final ClassId p;
    public static final ClassId q;
    public static final ClassId r;
    public static final ClassId s;
    public static final Set t;
    public static final Set u;
    public static final Set v;
    public static final ClassId w;
    public static final ClassId x;
    public static final ClassId y;
    public static final ClassId z;

    static {
        FqName fqName = new FqName("kotlin");
        f24504a = fqName;
        FqName fqNameA = fqName.a(Name.e("reflect"));
        b = fqNameA;
        FqName fqNameA2 = fqName.a(Name.e("collections"));
        c = fqNameA2;
        fqName.a(Name.e("sequences"));
        FqName fqNameA3 = fqName.a(Name.e("ranges"));
        d = fqNameA3;
        FqName fqNameA4 = fqName.a(Name.e("jvm"));
        fqName.a(Name.e("annotations")).a(Name.e("jvm"));
        fqNameA4.a(Name.e("internal"));
        fqNameA4.a(Name.e("functions"));
        FqName fqNameA5 = fqName.a(Name.e("annotation"));
        e = fqNameA5;
        FqName fqNameA6 = fqName.a(Name.e("internal"));
        fqNameA6.a(Name.e("ir"));
        FqName fqNameA7 = fqName.a(Name.e("coroutines"));
        f = fqNameA7;
        fqNameA7.a(Name.e("intrinsics"));
        g = fqName.a(Name.e("enums"));
        fqName.a(Name.e("contracts"));
        FqName fqNameA8 = fqName.a(Name.e("concurrent")).a(Name.e("atomics"));
        fqName.a(Name.e("test"));
        fqName.a(Name.e(TextBundle.TEXT_ENTRY));
        h = ArraysKt.r0(new FqName[]{fqName, fqNameA2, fqNameA3, fqNameA5});
        i = ArraysKt.r0(new FqName[]{fqName, fqNameA2, fqNameA3, fqNameA5, fqNameA, fqNameA6, fqNameA7, fqNameA8});
        StandardClassIdsKt.a("Nothing");
        j = StandardClassIdsKt.a("Unit");
        k = StandardClassIdsKt.a("Any");
        l = StandardClassIdsKt.a("Enum");
        StandardClassIdsKt.a("Annotation");
        m = StandardClassIdsKt.a("Array");
        ClassId classIdA = StandardClassIdsKt.a("Boolean");
        ClassId classIdA2 = StandardClassIdsKt.a("Char");
        ClassId classIdA3 = StandardClassIdsKt.a("Byte");
        ClassId classIdA4 = StandardClassIdsKt.a("Short");
        ClassId classIdA5 = StandardClassIdsKt.a("Int");
        ClassId classIdA6 = StandardClassIdsKt.a("Long");
        ClassId classIdA7 = StandardClassIdsKt.a("Float");
        ClassId classIdA8 = StandardClassIdsKt.a("Double");
        n = StandardClassIdsKt.f(classIdA3);
        o = StandardClassIdsKt.f(classIdA4);
        p = StandardClassIdsKt.f(classIdA5);
        q = StandardClassIdsKt.f(classIdA6);
        StandardClassIdsKt.a("CharSequence");
        r = StandardClassIdsKt.a("String");
        StandardClassIdsKt.a("Throwable");
        StandardClassIdsKt.a("Cloneable");
        StandardClassIdsKt.e("KProperty");
        StandardClassIdsKt.e("KMutableProperty");
        StandardClassIdsKt.e("KProperty0");
        StandardClassIdsKt.e("KMutableProperty0");
        StandardClassIdsKt.e("KProperty1");
        StandardClassIdsKt.e("KMutableProperty1");
        StandardClassIdsKt.e("KProperty2");
        StandardClassIdsKt.e("KMutableProperty2");
        s = StandardClassIdsKt.e("KFunction");
        StandardClassIdsKt.e("KClass");
        StandardClassIdsKt.e("KCallable");
        StandardClassIdsKt.e("KType");
        StandardClassIdsKt.a("Comparable");
        StandardClassIdsKt.a("Number");
        StandardClassIdsKt.a("Function");
        Set setR0 = ArraysKt.r0(new ClassId[]{classIdA, classIdA2, classIdA3, classIdA4, classIdA5, classIdA6, classIdA7, classIdA8});
        t = setR0;
        u = ArraysKt.r0(new ClassId[]{classIdA3, classIdA4, classIdA5, classIdA6});
        Set set = setR0;
        int iH = MapsKt.h(CollectionsKt.s(set, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Object obj : set) {
            linkedHashMap.put(obj, StandardClassIdsKt.d(((ClassId) obj).f()));
        }
        StandardClassIdsKt.c(linkedHashMap);
        Set setR02 = ArraysKt.r0(new ClassId[]{n, o, p, q});
        v = setR02;
        Set set2 = setR02;
        int iH2 = MapsKt.h(CollectionsKt.s(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2 >= 16 ? iH2 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, StandardClassIdsKt.d(((ClassId) obj2).f()));
        }
        StandardClassIdsKt.c(linkedHashMap2);
        Set set3 = t;
        Set set4 = v;
        LinkedHashSet linkedHashSetG = SetsKt.g(set3, set4);
        ClassId classId = r;
        SetsKt.h(linkedHashSetG, classId);
        new ClassId(f, Name.e("Continuation"));
        StandardClassIdsKt.b("Iterator");
        StandardClassIdsKt.b("Iterable");
        StandardClassIdsKt.b("Collection");
        StandardClassIdsKt.b("List");
        StandardClassIdsKt.b("ListIterator");
        StandardClassIdsKt.b("Set");
        ClassId classIdB = StandardClassIdsKt.b("Map");
        StandardClassIdsKt.b("AbstractMap");
        StandardClassIdsKt.b("MutableIterator");
        StandardClassIdsKt.b("CharIterator");
        StandardClassIdsKt.b("MutableIterable");
        StandardClassIdsKt.b("MutableCollection");
        w = StandardClassIdsKt.b("MutableList");
        StandardClassIdsKt.b("MutableListIterator");
        x = StandardClassIdsKt.b("MutableSet");
        ClassId classIdB2 = StandardClassIdsKt.b("MutableMap");
        y = classIdB2;
        classIdB.d(Name.e("Entry"));
        classIdB2.d(Name.e("MutableEntry"));
        StandardClassIdsKt.a("Result");
        FqName fqName2 = d;
        new ClassId(fqName2, Name.e("IntRange"));
        new ClassId(fqName2, Name.e("LongRange"));
        new ClassId(fqName2, Name.e("CharRange"));
        FqName fqName3 = e;
        new ClassId(fqName3, Name.e("AnnotationRetention"));
        new ClassId(fqName3, Name.e("AnnotationTarget"));
        StandardClassIdsKt.a("DeprecationLevel");
        z = new ClassId(g, Name.e("EnumEntries"));
        SetsKt.h(SetsKt.h(SetsKt.h(SetsKt.h(SetsKt.g(set3, set4), classId), j), k), l);
    }
}
