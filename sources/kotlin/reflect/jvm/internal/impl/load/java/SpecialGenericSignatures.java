package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public class SpecialGenericSignatures {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f24412a;
    public static final ArrayList b;
    public static final Object c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final Companion.NameAndSignature g;
    public static final Object h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    public static final class Companion {

        public static final class NameAndSignature {

            /* renamed from: a, reason: collision with root package name */
            public final String f24413a;
            public final Name b;
            public final String c;
            public final String d;
            public final String e;

            public NameAndSignature(String classInternalName, Name name, String str, String str2) {
                Intrinsics.h(classInternalName, "classInternalName");
                this.f24413a = classInternalName;
                this.b = name;
                this.c = str;
                this.d = str2;
                this.e = SignatureBuildingComponents.f(classInternalName, name + '(' + str + ')' + str2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.c(this.f24413a, nameAndSignature.f24413a) && Intrinsics.c(this.b, nameAndSignature.b) && Intrinsics.c(this.c, nameAndSignature.c) && Intrinsics.c(this.d, nameAndSignature.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + b.c((this.b.hashCode() + (this.f24413a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
                sb.append(this.f24413a);
                sb.append(", name=");
                sb.append(this.b);
                sb.append(", parameters=");
                sb.append(this.c);
                sb.append(", returnType=");
                return b.r(sb, this.d, ')');
            }
        }

        public static final NameAndSignature a(String str, String str2, String str3, String str4) {
            ArrayList arrayList = SpecialGenericSignatures.f24412a;
            return new NameAndSignature(str, Name.e(str2), str3, str4);
        }

        public static boolean b(Name name) {
            Intrinsics.h(name, "<this>");
            return SpecialGenericSignatures.j.contains(name);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SpecialSignatureInfo {
        public static final SpecialSignatureInfo d;
        public static final SpecialSignatureInfo e;
        public static final SpecialSignatureInfo f;
        public static final /* synthetic */ SpecialSignatureInfo[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            SpecialSignatureInfo specialSignatureInfo = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0);
            d = specialSignatureInfo;
            SpecialSignatureInfo specialSignatureInfo2 = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1);
            e = specialSignatureInfo2;
            SpecialSignatureInfo specialSignatureInfo3 = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2);
            f = specialSignatureInfo3;
            SpecialSignatureInfo[] specialSignatureInfoArr = {specialSignatureInfo, specialSignatureInfo2, specialSignatureInfo3};
            g = specialSignatureInfoArr;
            h = EnumEntriesKt.a(specialSignatureInfoArr);
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {
        public static final TypeSafeBarrierDescription e;
        public static final TypeSafeBarrierDescription f;
        public static final TypeSafeBarrierDescription g;
        public static final TypeSafeBarrierDescription h;
        public static final /* synthetic */ TypeSafeBarrierDescription[] i;
        public static final /* synthetic */ EnumEntries j;
        public final Object d;

        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
        }

        static {
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            e = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            f = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            g = typeSafeBarrierDescription3;
            MAP_GET_OR_DEFAULT map_get_or_default = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3, null);
            h = map_get_or_default;
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr = {typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
            i = typeSafeBarrierDescriptionArr;
            j = EnumEntriesKt.a(typeSafeBarrierDescriptionArr);
        }

        public TypeSafeBarrierDescription(String str, int i2, Object obj) {
            this.d = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) i.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setR0 = ArraysKt.r0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt.s(setR0, 10));
        for (String str : setR0) {
            String strC = JvmPrimitiveType.BOOLEAN.c();
            Intrinsics.g(strC, "getDesc(...)");
            arrayList.add(Companion.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        f24412a = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = f24412a;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).b.b());
        }
        String strConcat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String strC2 = jvmPrimitiveType.c();
        Intrinsics.g(strC2, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureA = Companion.a(strConcat, "contains", "Ljava/lang/Object;", strC2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.g;
        Pair pair = new Pair(nameAndSignatureA, typeSafeBarrierDescription);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = jvmPrimitiveType.c();
        Intrinsics.g(strC3, "getDesc(...)");
        Pair pair2 = new Pair(Companion.a(strConcat2, "remove", "Ljava/lang/Object;", strC3), typeSafeBarrierDescription);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = jvmPrimitiveType.c();
        Intrinsics.g(strC4, "getDesc(...)");
        Pair pair3 = new Pair(Companion.a(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), typeSafeBarrierDescription);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = jvmPrimitiveType.c();
        Intrinsics.g(strC5, "getDesc(...)");
        Pair pair4 = new Pair(Companion.a(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), typeSafeBarrierDescription);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = jvmPrimitiveType.c();
        Intrinsics.g(strC6, "getDesc(...)");
        Pair pair5 = new Pair(Companion.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), typeSafeBarrierDescription);
        Pair pair6 = new Pair(Companion.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.h);
        Companion.NameAndSignature nameAndSignatureA2 = Companion.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.e;
        Pair pair7 = new Pair(nameAndSignatureA2, typeSafeBarrierDescription2);
        Pair pair8 = new Pair(Companion.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strConcat6 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String strC7 = jvmPrimitiveType2.c();
        Intrinsics.g(strC7, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureA3 = Companion.a(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.f;
        Pair pair9 = new Pair(nameAndSignatureA3, typeSafeBarrierDescription3);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = jvmPrimitiveType2.c();
        Intrinsics.g(strC8, "getDesc(...)");
        Map mapJ = MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(Companion.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), typeSafeBarrierDescription3));
        c = mapJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(mapJ.size()));
        for (Map.Entry entry : mapJ.entrySet()) {
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetG = SetsKt.g(c.keySet(), f24412a);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(linkedHashSetG, 10));
        Iterator it3 = linkedHashSetG.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it3.next()).b);
        }
        e = CollectionsKt.L0(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(linkedHashSetG, 10));
        Iterator it4 = linkedHashSetG.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it4.next()).e);
        }
        f = CollectionsKt.L0(arrayList6);
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String strC9 = jvmPrimitiveType3.c();
        Intrinsics.g(strC9, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureA4 = Companion.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        g = nameAndSignatureA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = JvmPrimitiveType.BYTE.c();
        Intrinsics.g(strC10, "getDesc(...)");
        Pair pair10 = new Pair(Companion.a(strConcat8, "toByte", "", strC10), Name.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = JvmPrimitiveType.SHORT.c();
        Intrinsics.g(strC11, "getDesc(...)");
        Pair pair11 = new Pair(Companion.a(strConcat9, "toShort", "", strC11), Name.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = jvmPrimitiveType3.c();
        Intrinsics.g(strC12, "getDesc(...)");
        Pair pair12 = new Pair(Companion.a(strConcat10, "toInt", "", strC12), Name.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = JvmPrimitiveType.LONG.c();
        Intrinsics.g(strC13, "getDesc(...)");
        Pair pair13 = new Pair(Companion.a(strConcat11, "toLong", "", strC13), Name.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = JvmPrimitiveType.FLOAT.c();
        Intrinsics.g(strC14, "getDesc(...)");
        Pair pair14 = new Pair(Companion.a(strConcat12, "toFloat", "", strC14), Name.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = JvmPrimitiveType.DOUBLE.c();
        Intrinsics.g(strC15, "getDesc(...)");
        Pair pair15 = new Pair(Companion.a(strConcat13, "toDouble", "", strC15), Name.e("doubleValue"));
        Pair pair16 = new Pair(nameAndSignatureA4, Name.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = jvmPrimitiveType3.c();
        Intrinsics.g(strC16, "getDesc(...)");
        String strC17 = JvmPrimitiveType.CHAR.c();
        Intrinsics.g(strC17, "getDesc(...)");
        Map mapJ2 = MapsKt.j(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(Companion.a(strConcat14, "get", strC16, strC17), Name.e("charAt")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), Name.e("get")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), Name.e("set")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), Name.e("getAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), Name.e("getAndAdd")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), Name.e("addAndGet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), Name.e("get")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), Name.e("set")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), Name.e("getAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), Name.e("getAndAdd")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), Name.e("addAndGet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), Name.e("get")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), Name.e("set")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), Name.e("getAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), Name.e("get")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), Name.e("set")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), Name.e("getAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), Name.e("get")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), Name.e("set")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), Name.e("getAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), Name.e("compareAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), Name.e("getAndAdd")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), Name.e("addAndGet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), Name.e("get")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), Name.e("set")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), Name.e("getAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), Name.e("compareAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), Name.e("getAndAdd")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), Name.e("addAndGet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), Name.e("get")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), Name.e("set")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), Name.e("getAndSet")), new Pair(Companion.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), Name.e("compareAndSet")));
        h = mapJ2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(mapJ2.size()));
        for (Map.Entry entry2 : mapJ2.entrySet()) {
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        ?? r0 = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            Companion.NameAndSignature nameAndSignature = (Companion.NameAndSignature) entry3.getKey();
            Name name = (Name) entry3.getValue();
            String classInternalName = nameAndSignature.f24413a;
            String str2 = nameAndSignature.c;
            String str3 = nameAndSignature.d;
            Intrinsics.h(classInternalName, "classInternalName");
            Intrinsics.h(name, "name");
            linkedHashSet.add(new Companion.NameAndSignature(classInternalName, name, str2, str3).e);
        }
        Set setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it5.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.s(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).b, entry4.getValue()));
        }
        int iH = MapsKt.h(CollectionsKt.s(arrayList7, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH);
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            Pair pair17 = (Pair) it6.next();
            linkedHashMap3.put((Name) pair17.e, (Name) pair17.d);
        }
        k = linkedHashMap3;
    }
}
