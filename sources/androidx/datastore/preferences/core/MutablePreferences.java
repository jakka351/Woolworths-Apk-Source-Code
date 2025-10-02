package androidx.datastore.preferences.core;

import YU.a;
import androidx.datastore.preferences.core.Preferences;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutablePreferences extends Preferences {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2587a;
    public final AtomicBoolean b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "entry", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.datastore.preferences.core.MutablePreferences$toString$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends Lambda implements Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Intrinsics.h(entry, "entry");
            Object value = entry.getValue();
            return a.p(new StringBuilder("  "), ((Preferences.Key) entry.getKey()).f2589a, " = ", value instanceof byte[] ? ArraysKt.T((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
        }
    }

    public MutablePreferences(LinkedHashMap linkedHashMap, boolean z) {
        this.f2587a = linkedHashMap;
        this.b = new AtomicBoolean(z);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f2587a.entrySet();
        int iH = MapsKt.h(CollectionsKt.s(setEntrySet, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.g(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.d, pair.e);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.g(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Object b(Preferences.Key key) {
        Intrinsics.h(key, "key");
        Object obj = this.f2587a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.g(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void c() {
        if (this.b.f2586a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void d(Preferences.Key key) {
        Intrinsics.h(key, "key");
        c();
        this.f2587a.remove(key);
    }

    public final void e(Preferences.Key key, Object obj) {
        Intrinsics.h(key, "key");
        f(key, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.preferences.core.MutablePreferences
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            androidx.datastore.preferences.core.MutablePreferences r7 = (androidx.datastore.preferences.core.MutablePreferences) r7
            java.util.LinkedHashMap r7 = r7.f2587a
            java.util.LinkedHashMap r0 = r6.f2587a
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.core.MutablePreferences.equals(java.lang.Object):boolean");
    }

    public final void f(Preferences.Key key, Object obj) {
        Intrinsics.h(key, "key");
        c();
        if (obj == null) {
            d(key);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f2587a;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.L0((Set) obj));
            Intrinsics.g(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.g(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    public final int hashCode() {
        Iterator it = this.f2587a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.M(this.f2587a.entrySet(), ",\n", "{\n", "\n}", AnonymousClass1.h, 24);
    }

    public /* synthetic */ MutablePreferences(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
