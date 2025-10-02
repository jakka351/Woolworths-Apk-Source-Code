package kotlin.collections;

import YU.a;
import androidx.lifecycle.d;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper$getSupportedLinks$$inlined$compareBy$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static ArrayList A(Iterable iterable, Class klass) {
        Intrinsics.h(iterable, "<this>");
        Intrinsics.h(klass, "klass");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean[] A0(Collection collection) {
        Intrinsics.h(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static ArrayList B(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static byte[] B0(List list) {
        byte[] bArr = new byte[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static Object C(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof List) {
            return D((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static double[] C0(Collection collection) {
        Intrinsics.h(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = ((Number) it.next()).doubleValue();
            i++;
        }
        return dArr;
    }

    public static Object D(List list) {
        Intrinsics.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static float[] D0(Collection collection) {
        Intrinsics.h(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static Object E(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static HashSet E0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        HashSet hashSet = new HashSet(MapsKt.h(s(iterable, 12)));
        CollectionsKt___CollectionsKt.g(iterable, hashSet);
        return hashSet;
    }

    public static Object F(List list) {
        Intrinsics.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int[] F0(Collection collection) {
        Intrinsics.h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static ArrayList G(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    public static List G0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.a(I0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.d;
        }
        if (size != 1) {
            return J0(collection);
        }
        return Q(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static IntRange H(Collection collection) {
        Intrinsics.h(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static long[] H0(Collection collection) {
        Intrinsics.h(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static int I(List list) {
        Intrinsics.h(list, "<this>");
        return list.size() - 1;
    }

    public static ArrayList I0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return J0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt___CollectionsKt.g(iterable, arrayList);
        return arrayList;
    }

    public static Object J(int i, List list) {
        Intrinsics.h(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static ArrayList J0(Collection collection) {
        Intrinsics.h(collection, "<this>");
        return new ArrayList(collection);
    }

    public static int K(Iterable iterable, Object obj) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                z0();
                throw null;
            }
            if (Intrinsics.c(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashSet K0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.g(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static /* synthetic */ void L(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.f(iterable, appendable, str, str2, str3, "...", function1);
    }

    public static Set L0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return SetsKt.i(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(collection.size()));
                CollectionsKt___CollectionsKt.g(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            CollectionsKt___CollectionsKt.g(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : SetsKt.i(linkedHashSet2.iterator().next());
            }
        }
        return EmptySet.d;
    }

    public static String M(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i & 2) != 0 ? "" : str;
        String str3 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.h(iterable, "<this>");
        Intrinsics.h(separator, "separator");
        Intrinsics.h(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.f(iterable, sb, separator, prefix, str3, "...", function1);
        return sb.toString();
    }

    public static TreeSet M0(ArrayList arrayList, SupportedLinksHelper$getSupportedLinks$$inlined$compareBy$1 supportedLinksHelper$getSupportedLinks$$inlined$compareBy$1) {
        TreeSet treeSet = new TreeSet(supportedLinksHelper$getSupportedLinks$$inlined$compareBy$1);
        CollectionsKt___CollectionsKt.g(arrayList, treeSet);
        return treeSet;
    }

    public static Object N(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof List) {
            return O((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static LinkedHashSet N0(Iterable iterable, Iterable other) {
        Intrinsics.h(iterable, "<this>");
        Intrinsics.h(other, "other");
        LinkedHashSet linkedHashSetK0 = K0(iterable);
        h(other, linkedHashSetK0);
        return linkedHashSetK0;
    }

    public static Object O(List list) {
        Intrinsics.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(I(list));
    }

    public static ArrayList O0(Iterable iterable, int i, int i2) {
        Intrinsics.h(iterable, "<this>");
        SlidingWindowKt.a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            Intrinsics.h(iterator, "iterator");
            Iterator itO = !iterator.hasNext() ? EmptyIterator.d : SequencesKt.o(new SlidingWindowKt$windowedIterator$1(i, i2, iterator, null));
            while (itO.hasNext()) {
                arrayList.add((List) itO.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static Object P(List list) {
        Intrinsics.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static IndexingIterable P0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        return new IndexingIterable(new d(iterable, 11));
    }

    public static List Q(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.g(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static ArrayList Q0(Iterable iterable, Iterable other) {
        Intrinsics.h(iterable, "<this>");
        Intrinsics.h(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(s(iterable, 10), s(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List R(Object... elements) {
        Intrinsics.h(elements, "elements");
        return elements.length > 0 ? ArraysKt.f(elements) : EmptyList.d;
    }

    public static List S(Object obj) {
        return obj != null ? Q(obj) : EmptyList.d;
    }

    public static Comparable T(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float U(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable V(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float W(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static ArrayList X(Iterable iterable, Object obj) {
        Intrinsics.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList(s(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List Y(Iterable iterable, Iterable elements) {
        Intrinsics.h(iterable, "<this>");
        Intrinsics.h(elements, "elements");
        Collection collectionU = u(elements);
        if (collectionU.isEmpty()) {
            return G0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionU.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList Z(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    public static ArrayList a0(Iterable iterable, Iterable iterable2) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return c0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        h(iterable, arrayList);
        h(iterable2, arrayList);
        return arrayList;
    }

    public static ArrayList b0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return d0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        h(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList c0(Iterable elements, Collection collection) {
        Intrinsics.h(collection, "<this>");
        Intrinsics.h(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            h(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList d0(Object obj, Collection collection) {
        Intrinsics.h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static void e0(Iterable elements, Collection collection) {
        Intrinsics.h(collection, "<this>");
        Intrinsics.h(elements, "elements");
        collection.removeAll(u(elements));
    }

    public static void f0(Iterable iterable, Function1 function1) {
        Intrinsics.h(iterable, "<this>");
        CollectionsKt__MutableCollectionsKt.c(iterable, function1, true);
    }

    public static void g0(List list, Function1 predicate) {
        int I;
        Intrinsics.h(list, "<this>");
        Intrinsics.h(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof KMappedMarker) && !(list instanceof KMutableIterable)) {
                TypeIntrinsics.g(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                CollectionsKt__MutableCollectionsKt.c(list, predicate, true);
                return;
            } catch (ClassCastException e) {
                Intrinsics.l(e, TypeIntrinsics.class.getName());
                throw e;
            }
        }
        int I2 = I(list);
        int i = 0;
        if (I2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == I2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (I = I(list))) {
            return;
        }
        while (true) {
            list.remove(I);
            if (I == i) {
                return;
            } else {
                I--;
            }
        }
    }

    public static void h(Iterable elements, Collection collection) {
        Intrinsics.h(collection, "<this>");
        Intrinsics.h(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static Object h0(List list) {
        Intrinsics.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static void i(ArrayList arrayList, Sequence elements) {
        Intrinsics.h(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    public static Object i0(List list) {
        Intrinsics.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static boolean j(Collection collection, Object[] elements) {
        Intrinsics.h(collection, "<this>");
        Intrinsics.h(elements, "elements");
        return collection.addAll(ArraysKt.f(elements));
    }

    public static Object j0(List list) {
        Intrinsics.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(I(list));
    }

    public static ArrayList k(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    public static void k0(Iterable iterable, Function1 function1) {
        CollectionsKt__MutableCollectionsKt.c(iterable, function1, false);
    }

    public static List l(List list) {
        return new ReversedListReadOnly(list);
    }

    public static List l0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return G0(iterable);
        }
        ArrayList arrayListI0 = I0(iterable);
        Collections.reverse(arrayListI0);
        return arrayListI0;
    }

    public static List m(ArrayList arrayList) {
        return new ReversedList(arrayList);
    }

    public static Object m0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof List) {
            return n0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 n(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        return new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(iterable);
    }

    public static Object n0(List list) {
        Intrinsics.h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static int o(int i, List list, Function1 function1) {
        Intrinsics.h(list, "<this>");
        CollectionsKt__CollectionsKt.b(list.size(), i);
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int iIntValue = ((Number) function1.invoke(list.get(i4))).intValue();
            if (iIntValue < 0) {
                i3 = i4 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static Object o0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static int p(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Intrinsics.h(arrayList, "<this>");
        CollectionsKt__CollectionsKt.b(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iA = ComparisonsKt.a((Comparable) arrayList.get(i3), comparable);
            if (iA < 0) {
                i2 = i3 + 1;
            } else {
                if (iA <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static Object p0(List list) {
        Intrinsics.h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static ListBuilder q(List builder) {
        Intrinsics.h(builder, "builder");
        ListBuilder listBuilder = (ListBuilder) builder;
        listBuilder.j();
        listBuilder.f = true;
        return listBuilder.e > 0 ? listBuilder : ListBuilder.g;
    }

    public static List q0(List list, IntRange indices) {
        Intrinsics.h(list, "<this>");
        Intrinsics.h(indices, "indices");
        return indices.isEmpty() ? EmptyList.d : G0(list.subList(indices.d, indices.e + 1));
    }

    public static ArrayList r(Iterable iterable, int i) {
        Intrinsics.h(iterable, "<this>");
        return O0(iterable, i, i);
    }

    public static void r0(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
    }

    public static int s(Iterable iterable, int i) {
        Intrinsics.h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static void s0(List list, Comparator comparator) {
        Intrinsics.h(list, "<this>");
        Intrinsics.h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static boolean t(Iterable iterable, Object obj) {
        Intrinsics.h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : K(iterable, obj) >= 0;
    }

    public static List t0(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayListI0 = I0(iterable);
            r0(arrayListI0);
            return arrayListI0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return G0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.h(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ArraysKt.f(array);
    }

    public static Collection u(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : G0(iterable);
    }

    public static List u0(Comparator comparator, Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        Intrinsics.h(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayListI0 = I0(iterable);
            s0(arrayListI0, comparator);
            return arrayListI0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return G0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        Intrinsics.h(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return ArraysKt.f(array);
    }

    public static ListBuilder v() {
        return new ListBuilder(10);
    }

    public static LinkedHashSet v0(Iterable iterable, Iterable other) {
        Intrinsics.h(iterable, "<this>");
        Intrinsics.h(other, "other");
        LinkedHashSet linkedHashSetK0 = K0(iterable);
        e0(other, linkedHashSetK0);
        return linkedHashSetK0;
    }

    public static List w(Iterable iterable) {
        Intrinsics.h(iterable, "<this>");
        return G0(K0(iterable));
    }

    public static List w0(Iterable iterable, int i) {
        Intrinsics.h(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.d;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return G0(iterable);
            }
            if (i == 1) {
                return Q(C(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.a(arrayList);
    }

    public static List x(Iterable iterable, int i) {
        ArrayList arrayList;
        Intrinsics.h(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return G0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return EmptyList.d;
            }
            if (size == 1) {
                return Q(N(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return CollectionsKt__CollectionsKt.a(arrayList);
    }

    public static List x0(int i, List list) {
        Intrinsics.h(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.d;
        }
        int size = list.size();
        if (i >= size) {
            return G0(list);
        }
        if (i == 1) {
            return Q(O(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List y(List list) {
        Intrinsics.h(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return w0(list2, size);
    }

    public static void y0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static ArrayList z(Collection collection, Function1 function1) {
        Intrinsics.h(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void z0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
