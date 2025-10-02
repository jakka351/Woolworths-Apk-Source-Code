package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BuiltinSpecialProperties {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24394a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.j;
        Pair pair = new Pair(fqNameUnsafe.a(Name.e(AppMeasurementSdk.ConditionalUserProperty.NAME)).g(), StandardNames.d);
        Pair pair2 = new Pair(fqNameUnsafe.a(Name.e("ordinal")).g(), Name.e("ordinal"));
        Pair pair3 = new Pair(BuiltinSpecialPropertiesKt.a("size", StandardNames.FqNames.C), Name.e("size"));
        FqName fqName = StandardNames.FqNames.G;
        Map mapJ = MapsKt.j(pair, pair2, pair3, new Pair(BuiltinSpecialPropertiesKt.a("size", fqName), Name.e("size")), new Pair(StandardNames.FqNames.e.a(Name.e("length")).g(), Name.e("length")), new Pair(BuiltinSpecialPropertiesKt.a(i.a.n, fqName), Name.e("keySet")), new Pair(BuiltinSpecialPropertiesKt.a("values", fqName), Name.e("values")), new Pair(BuiltinSpecialPropertiesKt.a("entries", fqName), Name.e("entrySet")), new Pair(BuiltinSpecialPropertiesKt.a("size", StandardNames.FqNames.a0), Name.e("length")), new Pair(BuiltinSpecialPropertiesKt.a("size", StandardNames.FqNames.b0), Name.e("length")), new Pair(BuiltinSpecialPropertiesKt.a("size", StandardNames.FqNames.c0), Name.e("length")));
        f24394a = mapJ;
        Set<Map.Entry> setEntrySet = mapJ.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((FqName) entry.getKey()).f24500a.f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair4 = (Pair) it.next();
            Name name = (Name) pair4.e;
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair4.d);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.w((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        ?? r0 = f24394a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            String str = JavaToKotlinClassMap.f24321a;
            ClassId classIdE = JavaToKotlinClassMap.e(((FqName) entry3.getKey()).b().f24500a);
            Intrinsics.e(classIdE);
            linkedHashSet.add(classIdE.a().a((Name) entry3.getValue()));
        }
        Set setKeySet = f24394a.keySet();
        c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FqName) it2.next()).f24500a.f());
        }
        d = CollectionsKt.L0(arrayList3);
    }
}
