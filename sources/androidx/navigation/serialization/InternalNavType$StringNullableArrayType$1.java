package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.navigation.NavUriUtils;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"androidx/navigation/serialization/InternalNavType$StringNullableArrayType$1", "Landroidx/navigation/CollectionNavType;", "", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InternalNavType$StringNullableArrayType$1 extends CollectionNavType<String[]> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        String[] strArrK = SavedStateReader.k(bundle, str);
        ArrayList arrayList = new ArrayList(strArrK.length);
        for (String str2 : strArrK) {
            arrayList.add((String) NavType.o.g(str2));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "string_nullable[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        String[] strArr = (String[]) obj;
        return strArr != null ? (String[]) ArraysKt.b0(strArr, g(str)) : g(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        String[] strArr = (String[]) obj;
        Intrinsics.h(key, "key");
        if (strArr == null) {
            SavedStateWriter.b(bundle, key);
            return;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (str == null) {
                str = "null";
            }
            arrayList.add(str);
        }
        SavedStateWriter.f(bundle, key, (String[]) arrayList.toArray(new String[0]));
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
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            arrayList.add(str != null ? NavUriUtils.a(str) : "null");
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.navigation.NavType
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String[] g(String value) {
        Intrinsics.h(value, "value");
        return new String[]{NavType.o.g(value)};
    }
}
