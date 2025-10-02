package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import YU.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

@SourceDebugExtension
/* loaded from: classes.dex */
public class JvmNameResolverBase implements NameResolver {
    public static final List d;

    /* renamed from: a, reason: collision with root package name */
    public final String[] f24496a;
    public final Set b;
    public final ArrayList c;

    public static final class Companion {
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        String strM = CollectionsKt.M(CollectionsKt.R('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listR = CollectionsKt.R(a.g(strM, "/Any"), a.g(strM, "/Nothing"), a.g(strM, "/Unit"), a.g(strM, "/Throwable"), a.g(strM, "/Number"), a.g(strM, "/Byte"), a.g(strM, "/Double"), a.g(strM, "/Float"), a.g(strM, "/Int"), a.g(strM, "/Long"), a.g(strM, "/Short"), a.g(strM, "/Boolean"), a.g(strM, "/Char"), a.g(strM, "/CharSequence"), a.g(strM, "/String"), a.g(strM, "/Comparable"), a.g(strM, "/Enum"), a.g(strM, "/Array"), a.g(strM, "/ByteArray"), a.g(strM, "/DoubleArray"), a.g(strM, "/FloatArray"), a.g(strM, "/IntArray"), a.g(strM, "/LongArray"), a.g(strM, "/ShortArray"), a.g(strM, "/BooleanArray"), a.g(strM, "/CharArray"), a.g(strM, "/Cloneable"), a.g(strM, "/Annotation"), a.g(strM, "/collections/Iterable"), a.g(strM, "/collections/MutableIterable"), a.g(strM, "/collections/Collection"), a.g(strM, "/collections/MutableCollection"), a.g(strM, "/collections/List"), a.g(strM, "/collections/MutableList"), a.g(strM, "/collections/Set"), a.g(strM, "/collections/MutableSet"), a.g(strM, "/collections/Map"), a.g(strM, "/collections/MutableMap"), a.g(strM, "/collections/Map.Entry"), a.g(strM, "/collections/MutableMap.MutableEntry"), a.g(strM, "/collections/Iterator"), a.g(strM, "/collections/MutableIterator"), a.g(strM, "/collections/ListIterator"), a.g(strM, "/collections/MutableListIterator"));
        d = listR;
        IndexingIterable indexingIterableP0 = CollectionsKt.P0(listR);
        int iH = MapsKt.h(CollectionsKt.s(indexingIterableP0, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator it = indexingIterableP0.iterator();
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.d.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
            linkedHashMap.put((String) indexedValue.b, Integer.valueOf(indexedValue.f24254a));
        }
    }

    public JvmNameResolverBase(String[] strings, Set set, ArrayList arrayList) {
        Intrinsics.h(strings, "strings");
        this.f24496a = strings;
        this.b = set;
        this.c = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final String a(int i) {
        return getString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getString(int r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.c
            java.lang.Object r0 = r0.get(r10)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r0
            int r1 = r0.e
            r2 = r1 & 4
            r3 = 2
            r4 = 4
            if (r2 != r4) goto L29
            java.lang.Object r10 = r0.h
            boolean r1 = r10 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r10 = (java.lang.String) r10
            goto L46
        L19:
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString r10 = (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) r10
            java.lang.String r1 = r10.u()
            boolean r10 = r10.l()
            if (r10 == 0) goto L27
            r0.h = r1
        L27:
            r10 = r1
            goto L46
        L29:
            r1 = r1 & r3
            if (r1 != r3) goto L42
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.d
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            int r4 = r0.g
            if (r4 < 0) goto L42
            if (r4 >= r2) goto L42
            java.lang.Object r10 = r1.get(r4)
            java.lang.String r10 = (java.lang.String) r10
            goto L46
        L42:
            java.lang.String[] r1 = r9.f24496a
            r10 = r1[r10]
        L46:
            java.util.List r1 = r0.j
            int r1 = r1.size()
            java.lang.String r2 = "substring(...)"
            r4 = 0
            r5 = 1
            if (r1 < r3) goto L8c
            java.util.List r1 = r0.j
            kotlin.jvm.internal.Intrinsics.e(r1)
            java.lang.Object r6 = r1.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r7 = r6.intValue()
            if (r7 < 0) goto L8c
            int r7 = r6.intValue()
            int r8 = r1.intValue()
            if (r7 > r8) goto L8c
            int r7 = r1.intValue()
            int r8 = r10.length()
            if (r7 > r8) goto L8c
            int r6 = r6.intValue()
            int r1 = r1.intValue()
            java.lang.String r10 = r10.substring(r6, r1)
            kotlin.jvm.internal.Intrinsics.g(r10, r2)
        L8c:
            java.util.List r1 = r0.l
            int r1 = r1.size()
            if (r1 < r3) goto Lb6
            java.util.List r1 = r0.l
            kotlin.jvm.internal.Intrinsics.e(r1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.Intrinsics.e(r10)
            int r4 = r4.intValue()
            char r4 = (char) r4
            int r1 = r1.intValue()
            char r1 = (char) r1
            java.lang.String r10 = kotlin.text.StringsKt.R(r10, r4, r1)
        Lb6:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation r0 = r0.i
            if (r0 != 0) goto Lbc
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.NONE
        Lbc:
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lee
            r1 = 46
            r4 = 36
            if (r0 == r5) goto Le7
            if (r0 != r3) goto Le1
            int r0 = r10.length()
            if (r0 < r3) goto Ldc
            int r0 = r10.length()
            int r0 = r0 - r5
            java.lang.String r10 = r10.substring(r5, r0)
            kotlin.jvm.internal.Intrinsics.g(r10, r2)
        Ldc:
            java.lang.String r10 = kotlin.text.StringsKt.R(r10, r4, r1)
            goto Lee
        Le1:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        Le7:
            kotlin.jvm.internal.Intrinsics.e(r10)
            java.lang.String r10 = kotlin.text.StringsKt.R(r10, r4, r1)
        Lee:
            kotlin.jvm.internal.Intrinsics.e(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.getString(int):java.lang.String");
    }
}
