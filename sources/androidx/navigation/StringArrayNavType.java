package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/navigation/StringArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StringArrayNavType extends CollectionNavType<String[]> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        return SavedStateReader.k(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "string[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        String[] strArr = (String[]) obj;
        return strArr != null ? (String[]) ArraysKt.b0(strArr, new String[]{str}) : new String[]{str};
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        Intrinsics.h(value, "value");
        return new String[]{value};
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        String[] strArr = (String[]) obj;
        Intrinsics.h(key, "key");
        if (strArr != null) {
            SavedStateWriter.f(bundle, key, strArr);
        } else {
            SavedStateWriter.b(bundle, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object g() {
        return new String[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List h(Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(NavUriUtils.a(str));
        }
        return arrayList;
    }
}
