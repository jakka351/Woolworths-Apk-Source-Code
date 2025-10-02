package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/BoolNavType;", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BoolNavType extends NavType<Boolean> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        return Boolean.valueOf(SavedStateReader.c(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "boolean";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        boolean z;
        Intrinsics.h(value, "value");
        if (value.equals("true")) {
            z = true;
        } else {
            if (!value.equals("false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.h(key, "key");
        bundle.putBoolean(key, zBooleanValue);
    }
}
