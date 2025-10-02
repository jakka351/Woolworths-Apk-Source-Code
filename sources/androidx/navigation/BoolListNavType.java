package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateReaderKt;
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

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/navigation/BoolListNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BoolListNavType extends CollectionNavType<List<? extends Boolean>> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return ArraysKt.n0(booleanArray);
        }
        SavedStateReaderKt.a(str);
        throw null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "List<Boolean>";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        BoolNavType boolNavType = NavType.l;
        if (list == null) {
            return CollectionsKt.Q(boolNavType.g(str));
        }
        return CollectionsKt.c0(CollectionsKt.Q(boolNavType.g(str)), list);
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        Intrinsics.h(value, "value");
        return CollectionsKt.Q(NavType.l.g(value));
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        List list = (List) obj;
        Intrinsics.h(key, "key");
        if (list != null) {
            bundle.putBooleanArray(key, CollectionsKt.A0(list));
        } else {
            SavedStateWriter.b(bundle, key);
        }
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
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }
}
