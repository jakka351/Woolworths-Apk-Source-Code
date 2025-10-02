package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import androidx.os.SavedStateReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/serialization/InternalNavType$DoubleType$1", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InternalNavType$DoubleType$1 extends NavType<Double> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String key) {
        Intrinsics.h(bundle, "bundle");
        Intrinsics.h(key, "key");
        return Double.valueOf(SavedStateReader.d(bundle, key));
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "double";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        Intrinsics.h(value, "value");
        return Double.valueOf(Double.parseDouble(value));
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        Intrinsics.h(key, "key");
        bundle.putDouble(key, dDoubleValue);
    }
}
