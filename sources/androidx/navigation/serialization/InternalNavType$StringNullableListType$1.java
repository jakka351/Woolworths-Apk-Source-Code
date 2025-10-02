package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.navigation.NavUriUtils;
import androidx.navigation.StringNavType;
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

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"androidx/navigation/serialization/InternalNavType$StringNullableListType$1", "Landroidx/navigation/CollectionNavType;", "", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InternalNavType$StringNullableListType$1 extends CollectionNavType<List<? extends String>> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        List listL0 = ArraysKt.l0(SavedStateReader.k(bundle, str));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add((String) NavType.o.g((String) it.next()));
        }
        return arrayList;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "List<String?>";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        StringNavType stringNavType = NavType.o;
        if (list == null) {
            return CollectionsKt.Q(stringNavType.g(str));
        }
        return CollectionsKt.c0(CollectionsKt.Q(stringNavType.g(str)), list);
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        Intrinsics.h(value, "value");
        return CollectionsKt.Q(NavType.o.g(value));
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        List list = (List) obj;
        Intrinsics.h(key, "key");
        if (list == null) {
            SavedStateWriter.b(bundle, key);
            return;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (String str : list2) {
            if (str == null) {
                str = "null";
            }
            arrayList.add(str);
        }
        SavedStateWriter.f(bundle, key, (String[]) arrayList.toArray(new String[0]));
    }

    @Override // androidx.navigation.CollectionNavType
    public final /* bridge */ /* synthetic */ Object g() {
        return EmptyList.d;
    }

    @Override // androidx.navigation.CollectionNavType
    public final List h(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return EmptyList.d;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (String str : list2) {
            arrayList.add(str != null ? NavUriUtils.a(str) : "null");
        }
        return arrayList;
    }
}
