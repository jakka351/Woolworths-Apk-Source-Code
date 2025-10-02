package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import androidx.navigation.NavUriUtils;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/serialization/InternalNavType$StringNonNullableType$1", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InternalNavType$StringNonNullableType$1 extends NavType<String> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) ? "null" : SavedStateReader.j(bundle, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "string_non_nullable";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        Intrinsics.h(value, "value");
        return value;
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        String value = (String) obj;
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        SavedStateWriter.e(bundle, key, value);
    }

    @Override // androidx.navigation.NavType
    public final String f(Object obj) {
        String value = (String) obj;
        Intrinsics.h(value, "value");
        return NavUriUtils.a(value);
    }
}
