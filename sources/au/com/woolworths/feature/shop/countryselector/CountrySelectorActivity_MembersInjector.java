package au.com.woolworths.feature.shop.countryselector;

import au.com.woolworths.shop.auth.ShopAuthManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CountrySelectorActivity_MembersInjector implements MembersInjector<CountrySelectorActivity> {
    public static void a(CountrySelectorActivity countrySelectorActivity, ShopAuthManager shopAuthManager) {
        countrySelectorActivity.w = shopAuthManager;
    }
}
