package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelper;
import au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelperImpl;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class LegacyDigipayModule_ProvideDigitalPaySdkHelper$ShopApp_releaseFactory implements Factory<DigitalPaySdkHelper> {
    public static DigitalPaySdkHelperImpl a(LegacyDigipayModule legacyDigipayModule, SchedulersProvider schedulersProvider, ShopAppTokenAuthenticator authenticator, PayClient payClient) {
        legacyDigipayModule.getClass();
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(authenticator, "authenticator");
        Intrinsics.h(payClient, "payClient");
        return new DigitalPaySdkHelperImpl(schedulersProvider, authenticator, payClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
