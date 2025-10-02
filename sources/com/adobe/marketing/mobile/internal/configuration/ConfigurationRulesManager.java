package com.adobe.marketing.mobile.internal.configuration;

import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine;
import com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult;
import com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoader;
import com.adobe.marketing.mobile.launch.rulesengine.json.JSONRulesParser;
import com.adobe.marketing.mobile.rulesengine.RulesEngine;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.NamedCollection;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.util.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationRulesManager;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigurationRulesManager {

    /* renamed from: a, reason: collision with root package name */
    public final LaunchRulesEngine f13176a;
    public final RulesLoader b;
    public final NamedCollection c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationRulesManager$Companion;", "", "", "BUNDLED_RULES_FILE_NAME", "Ljava/lang/String;", "LOG_TAG", "PERSISTED_RULES_URL", "RULES_CACHE_NAME", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public ConfigurationRulesManager(LaunchRulesEngine launchRulesEngine) {
        Intrinsics.h(launchRulesEngine, "launchRulesEngine");
        RulesLoader rulesLoader = new RulesLoader();
        this.f13176a = launchRulesEngine;
        this.b = rulesLoader;
        this.c = ServiceProvider.a().d.a("AdobeMobile_ConfigState");
    }

    public final boolean a(ExtensionApi api) {
        RulesLoadResult rulesLoadResultA;
        Intrinsics.h(api, "api");
        RulesLoader rulesLoader = this.b;
        rulesLoader.getClass();
        StringUtils.a("ADBMobileConfig-rules.zip");
        InputStream inputStreamB = ServiceProvider.a().f13238a.b("ADBMobileConfig-rules.zip");
        if (inputStreamB == null) {
            Log.c();
            rulesLoadResultA = new RulesLoadResult(null, RulesLoadResult.Reason.d);
        } else {
            rulesLoadResultA = rulesLoader.a("ADBMobileConfig-rules.zip", inputStreamB, new HashMap());
        }
        RulesLoadResult.Reason reason = rulesLoadResultA.b;
        if (reason == RulesLoadResult.Reason.j) {
            Log.c();
            return b(rulesLoadResultA.f13202a, api);
        }
        reason.toString();
        Log.a();
        return false;
    }

    public final boolean b(String str, ExtensionApi extensionApi) {
        if (str == null) {
            Log.a();
            return false;
        }
        List listA = JSONRulesParser.a(str, extensionApi);
        if (listA == null) {
            Log.a();
            return false;
        }
        Log.c();
        LaunchRulesEngine launchRulesEngine = this.f13176a;
        RulesEngine rulesEngine = launchRulesEngine.b;
        synchronized (rulesEngine.f13220a) {
            rulesEngine.d = new ArrayList(listA);
        }
        Event.Builder builder = new Event.Builder(launchRulesEngine.f13198a, "com.adobe.eventType.rulesEngine", "com.adobe.eventSource.requestReset", null);
        builder.d(Collections.singletonMap(AppMeasurementSdk.ConditionalUserProperty.NAME, launchRulesEngine.f13198a));
        launchRulesEngine.c.c(builder.a());
        return true;
    }
}
