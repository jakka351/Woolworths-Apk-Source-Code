package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateReaderKt;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/LongArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LongArrayNavType extends CollectionNavType<long[]> {
    public static long[] i(String value) {
        Intrinsics.h(value, "value");
        return new long[]{((Number) NavType.f.g(value)).longValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.a(str);
        throw null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "long[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return i(str);
        }
        long[] jArrI = i(str);
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(jArrI, 0, jArrCopyOf, length, 1);
        Intrinsics.e(jArrCopyOf);
        return jArrCopyOf;
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return i(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.h(key, "key");
        if (jArr != null) {
            bundle.putLongArray(key, jArr);
        } else {
            SavedStateWriter.b(bundle, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object g() {
        return new long[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List h(Object obj) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return EmptyList.d;
        }
        List listK0 = ArraysKt.k0(jArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }
}
