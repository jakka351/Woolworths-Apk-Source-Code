package au.com.woolworths.shop.digipay.di;

import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class DigipaySdkAppModule_ProvideDigitalPayClientFactory implements Factory<PayClient> {
    public static PayClient a(DigipaySdkAppModule digipaySdkAppModule, Configuration configuration) {
        digipaySdkAppModule.getClass();
        Intrinsics.h(configuration, "configuration");
        return new PayClient(configuration);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
