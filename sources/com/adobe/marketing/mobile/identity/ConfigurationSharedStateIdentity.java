package com.adobe.marketing.mobile.identity;

import com.adobe.marketing.mobile.MobilePrivacyStatus;
import com.adobe.marketing.mobile.util.DataReader;
import com.adobe.marketing.mobile.util.StringUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class ConfigurationSharedStateIdentity {

    /* renamed from: a, reason: collision with root package name */
    public final String f13166a;
    public final MobilePrivacyStatus b;
    public final String c;

    public ConfigurationSharedStateIdentity(Map map) {
        this.f13166a = DataReader.f("experienceCloud.org", null, map);
        String strF = DataReader.f("experienceCloud.server", "dpm.demdex.net", map);
        this.c = StringUtils.a(strF) ? "dpm.demdex.net" : strF;
        this.b = MobilePrivacyStatus.a(DataReader.f("global.privacy", "optunknown", map));
    }
}
