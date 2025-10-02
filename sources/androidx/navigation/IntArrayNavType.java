package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/IntArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IntArrayNavType extends CollectionNavType<int[]> {
    public static int[] i(String value) {
        Intrinsics.h(value, "value");
        return new int[]{((Number) NavType.b.g(value)).intValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        return SavedStateReader.g(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "integer[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        int[] iArr = (int[]) obj;
        return iArr != null ? ArraysKt.a0(iArr, i(str)) : i(str);
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return i(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.h(key, "key");
        if (iArr != null) {
            SavedStateWriter.a(bundle, key, iArr);
        } else {
            SavedStateWriter.b(bundle, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object g() {
        return new int[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List h(Object obj) {
        int[] iArr = (int[]) obj;
        if (iArr == null) {
            return EmptyList.d;
        }
        List listJ0 = ArraysKt.j0(iArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listJ0, 10));
        Iterator it = listJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
