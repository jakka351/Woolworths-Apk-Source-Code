package au.com.woolworths.rewards.base;

import android.app.Application;
import android.content.pm.PackageManager;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/ShopAppInstallationInteractor;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopAppInstallationInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final Application f9353a;

    public ShopAppInstallationInteractor(Application application) {
        this.f9353a = application;
    }

    public final boolean a() throws PackageManager.NameNotFoundException {
        Application application = this.f9353a;
        try {
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            Intrinsics.e(packageName);
            packageManager.getApplicationInfo(StringsKt.v(packageName, "debug", false) ? "com.woolworths.debug" : "com.woolworths", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
