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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/BoolArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BoolArrayNavType extends CollectionNavType<boolean[]> {
    public static boolean[] i(String value) {
        Intrinsics.h(value, "value");
        return new boolean[]{((Boolean) NavType.l.g(value)).booleanValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.a(str);
        throw null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "boolean[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return i(str);
        }
        boolean[] zArrI = i(str);
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(zArrI, 0, zArrCopyOf, length, 1);
        Intrinsics.e(zArrCopyOf);
        return zArrCopyOf;
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return i(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.h(key, "key");
        if (zArr != null) {
            bundle.putBooleanArray(key, zArr);
        } else {
            SavedStateWriter.b(bundle, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object g() {
        return new boolean[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return EmptyList.d;
        }
        List listN0 = ArraysKt.n0(zArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }
}
