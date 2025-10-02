package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements ModuleReadyListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ CountDownLatch e;
    public final /* synthetic */ Config f;

    public /* synthetic */ a(CountDownLatch countDownLatch, Config config, int i) {
        this.d = i;
        this.e = countDownLatch;
        this.f = config;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener
    public final void ready(ModuleInterface moduleInterface) {
        switch (this.d) {
            case 0:
                SFMCSdk$Companion$configure$1$3$2$3.m260invoke$lambda1(this.e, this.f, moduleInterface);
                break;
            default:
                SFMCSdk$Companion$configure$1$3$2$4.m262invoke$lambda1(this.e, this.f, moduleInterface);
                break;
        }
    }
}
