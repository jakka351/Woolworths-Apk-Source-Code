package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import com.salesforce.marketingcloud.messages.iam.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/serialization/UNKNOWN;", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UNKNOWN extends NavType<String> {
    public static final UNKNOWN r = new UNKNOWN(false);

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String key) {
        Intrinsics.h(bundle, "bundle");
        Intrinsics.h(key, "key");
        return null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return j.h;
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) {
        Intrinsics.h(value, "value");
        return "null";
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        String value = (String) obj;
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
    }
}
