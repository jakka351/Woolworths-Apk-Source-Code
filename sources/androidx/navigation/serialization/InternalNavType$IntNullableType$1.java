package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/serialization/InternalNavType$IntNullableType$1", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InternalNavType$IntNullableType$1 extends NavType<Integer> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        return Integer.valueOf(SavedStateReader.f(bundle, str));
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "integer_nullable";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        Intrinsics.h(value, "value");
        if (value.equals("null")) {
            return null;
        }
        return (Integer) NavType.b.g(value);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        Integer num = (Integer) obj;
        Intrinsics.h(key, "key");
        if (num == null) {
            SavedStateWriter.b(bundle, key);
        } else {
            NavType.b.e(bundle, key, num);
        }
    }
}
