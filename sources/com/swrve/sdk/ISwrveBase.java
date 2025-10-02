package com.swrve.sdk;

import au.com.woolworths.marketing.SwrveInteractor$identityResponse$1;
import com.swrve.sdk.config.SwrveConfigBase;
import com.swrve.sdk.messaging.SwrveBaseCampaign;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public interface ISwrveBase<T, C extends SwrveConfigBase> {
    void E(String str, Map map);

    void F(SwrveBaseCampaign swrveBaseCampaign);

    void g(SwrveBaseCampaign swrveBaseCampaign);

    SwrveConfigBase getConfig();

    String getUserId();

    void k(SwrveResourcesListener swrveResourcesListener);

    File l();

    void m(String str, SwrveInteractor$identityResponse$1 swrveInteractor$identityResponse$1);

    void n(SwrveEmbeddedMessage swrveEmbeddedMessage, String str);

    void o(String str);

    void q(SwrveEmbeddedMessage swrveEmbeddedMessage);

    String r(SwrveEmbeddedMessage swrveEmbeddedMessage, Map map);

    void s();

    void t(Map map);

    ArrayList z();
}
