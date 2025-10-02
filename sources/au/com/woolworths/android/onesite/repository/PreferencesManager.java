package au.com.woolworths.android.onesite.repository;

import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.android.onesite.repository.LaunchManager;

@Deprecated
/* loaded from: classes.dex */
public interface PreferencesManager {
    String a();

    void b(String str);

    boolean c();

    StoreLocatorResult.Store d();

    void e(StoreLocatorResult.Store store);

    boolean f();

    LaunchManager.LaunchState g();

    void h();

    void i(LaunchManager.LaunchState launchState);

    String j();
}
