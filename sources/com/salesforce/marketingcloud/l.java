package com.salesforce.marketingcloud;

import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;

/* loaded from: classes6.dex */
public final /* synthetic */ class l implements MarketingCloudSdk.InitializationListener, MarketingCloudSdk.WhenReadyListener {
    public final /* synthetic */ ModuleReadyListener d;

    public /* synthetic */ l(ModuleReadyListener moduleReadyListener) {
        this.d = moduleReadyListener;
    }

    @Override // com.salesforce.marketingcloud.MarketingCloudSdk.InitializationListener
    public void complete(InitializationStatus initializationStatus) {
        MarketingCloudConfig.init$lambda$1(this.d, initializationStatus);
    }

    @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
    public void ready(MarketingCloudSdk marketingCloudSdk) {
        MarketingCloudConfig.init$lambda$1$lambda$0(this.d, marketingCloudSdk);
    }
}
