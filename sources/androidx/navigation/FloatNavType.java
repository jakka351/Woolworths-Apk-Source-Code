package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/FloatNavType;", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FloatNavType extends NavType<Float> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String key) {
        Intrinsics.h(bundle, "bundle");
        Intrinsics.h(key, "key");
        return Float.valueOf(SavedStateReader.e(bundle, key));
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "float";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        Intrinsics.h(value, "value");
        return Float.valueOf(Float.parseFloat(value));
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Intrinsics.h(key, "key");
        bundle.putFloat(key, fFloatValue);
    }
}
