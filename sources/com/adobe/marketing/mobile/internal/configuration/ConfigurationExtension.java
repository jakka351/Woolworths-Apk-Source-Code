package com.adobe.marketing.mobile.internal.configuration;

import androidx.work.d;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.Extension;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.ExtensionEventListener;
import com.adobe.marketing.mobile.SharedStateResolver;
import com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension;
import com.adobe.marketing.mobile.internal.util.FileUtils;
import com.adobe.marketing.mobile.internal.util.JSONExtensionsKt;
import com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine;
import com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult;
import com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoader;
import com.adobe.marketing.mobile.services.HttpConnecting;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.NamedCollection;
import com.adobe.marketing.mobile.services.NetworkCallback;
import com.adobe.marketing.mobile.services.NetworkRequest;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.caching.CacheResult;
import com.adobe.marketing.mobile.util.DataReader;
import com.adobe.marketing.mobile.util.DataReaderException;
import com.adobe.marketing.mobile.util.StreamUtils;
import com.adobe.marketing.mobile.util.StringUtils;
import com.adobe.marketing.mobile.util.TimeUtils;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB9\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationExtension;", "Lcom/adobe/marketing/mobile/Extension;", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/ExtensionApi;)V", "Lcom/adobe/marketing/mobile/internal/configuration/AppIdManager;", "appIdManager", "Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesEngine;", "launchRulesEngine", "Ljava/util/concurrent/ScheduledExecutorService;", "retryWorker", "(Lcom/adobe/marketing/mobile/ExtensionApi;Lcom/adobe/marketing/mobile/internal/configuration/AppIdManager;Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesEngine;Ljava/util/concurrent/ScheduledExecutorService;)V", "Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationStateManager;", "configurationStateManager", "Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationRulesManager;", "configurationRulesManager", "(Lcom/adobe/marketing/mobile/ExtensionApi;Lcom/adobe/marketing/mobile/internal/configuration/AppIdManager;Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesEngine;Ljava/util/concurrent/ScheduledExecutorService;Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationStateManager;Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationRulesManager;)V", "Companion", "RulesSource", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigurationExtension extends Extension {
    public final AppIdManager b;
    public final ConfigurationStateManager c;
    public final ConfigurationRulesManager d;
    public final ScheduledExecutorService e;
    public int f;
    public ScheduledFuture g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationExtension$Companion;", "", "", "CONFIGURATION_REQUEST_CONTENT_CLEAR_UPDATED_CONFIG", "Ljava/lang/String;", "CONFIGURATION_REQUEST_CONTENT_IS_INTERNAL_EVENT", "CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID", "CONFIGURATION_REQUEST_CONTENT_JSON_ASSET_FILE", "CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH", "CONFIGURATION_REQUEST_CONTENT_RETRIEVE_CONFIG", "CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG", "CONFIGURATION_RESPONSE_IDENTITY_ALL_IDENTIFIERS", "", "CONFIG_DOWNLOAD_RETRY_ATTEMPT_DELAY_MS", "J", "DATASTORE_KEY", "EVENT_STATE_OWNER", "EXTENSION_FRIENDLY_NAME", "EXTENSION_NAME", "EXTENSION_VERSION", "GLOBAL_CONFIG_PRIVACY", "RULES_CONFIG_URL", "TAG", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationExtension$RulesSource;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class RulesSource {
        public static final RulesSource d;
        public static final RulesSource e;
        public static final /* synthetic */ RulesSource[] f;

        static {
            RulesSource rulesSource = new RulesSource("CACHE", 0);
            d = rulesSource;
            RulesSource rulesSource2 = new RulesSource("BUNDLED", 1);
            RulesSource rulesSource3 = new RulesSource("REMOTE", 2);
            e = rulesSource3;
            f = new RulesSource[]{rulesSource, rulesSource2, rulesSource3};
        }

        public static RulesSource valueOf(String str) {
            return (RulesSource) Enum.valueOf(RulesSource.class, str);
        }

        public static RulesSource[] values() {
            return (RulesSource[]) f.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RulesSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ConfigurationExtension(@NotNull ExtensionApi extensionApi) {
        Intrinsics.h(extensionApi, "extensionApi");
        AppIdManager appIdManager = new AppIdManager();
        LaunchRulesEngine launchRulesEngine = new LaunchRulesEngine(extensionApi);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.g(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this(extensionApi, appIdManager, launchRulesEngine, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String a() {
        return "Configuration";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String c() {
        return "com.adobe.module.configuration";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String d() {
        return "3.3.1";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.adobe.marketing.mobile.Extension
    public final void e() {
        super.e();
        ?? r0 = this.c.f;
        boolean zIsEmpty = r0.isEmpty();
        ExtensionApi extensionApi = this.f13161a;
        if (!zIsEmpty) {
            extensionApi.b(r0, null);
        }
        final int i = 0;
        extensionApi.f("com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent", new ExtensionEventListener(this) { // from class: com.adobe.marketing.mobile.internal.configuration.b
            public final /* synthetic */ ConfigurationExtension b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void a(Event event) throws NumberFormatException, IOException {
                Map mapC;
                LinkedHashMap linkedHashMapC;
                String str;
                int i2 = i;
                linkedHashMap = null;
                LinkedHashMap linkedHashMap = null;
                ConfigurationExtension configurationExtension = this.b;
                switch (i2) {
                    case 0:
                        ConfigurationStateManager configurationStateManager = configurationExtension.c;
                        ExtensionApi extensionApi2 = configurationExtension.f13161a;
                        Map map = event.e;
                        if (map != null) {
                            if (map.containsKey("config.appId")) {
                                SharedStateResolver sharedStateResolverA = extensionApi2.a(event);
                                AppIdManager appIdManager = configurationExtension.b;
                                Map map2 = event.e;
                                Object obj = map2 != null ? map2.get("config.appId") : null;
                                String str2 = obj instanceof String ? (String) obj : null;
                                if (str2 != null && !StringsKt.D(str2)) {
                                    configurationStateManager.getClass();
                                    Date date = (Date) configurationStateManager.g.get(str2);
                                    if (date == null || new Date(date.getTime() + 15000).compareTo(new Date()) < 0) {
                                        if (DataReader.e("config.isinternalevent", event.e)) {
                                            NamedCollection namedCollection = appIdManager.f13174a;
                                            String string = namedCollection != null ? namedCollection.getString("config.appID") : null;
                                            if (string != null && !StringsKt.D(string) && !str2.equals(string)) {
                                                Log.c();
                                                if (sharedStateResolverA != 0) {
                                                    sharedStateResolverA.a(configurationStateManager.f);
                                                    break;
                                                }
                                            }
                                        }
                                        extensionApi2.h();
                                        ConfigurationExtension$configureWithAppID$1 configurationExtension$configureWithAppID$1 = new ConfigurationExtension$configureWithAppID$1(configurationExtension, sharedStateResolverA, str2);
                                        if (StringsKt.D(str2)) {
                                            Log.c();
                                            break;
                                        } else {
                                            configurationStateManager.f13177a.b(str2);
                                            final String str3 = String.format("https://assets.adobedtm.com/%s.json", Arrays.copyOf(new Object[]{str2}, 1));
                                            final ConfigurationDownloader configurationDownloader = configurationStateManager.b;
                                            final ConfigurationStateManager$updateConfigWithAppId$1 configurationStateManager$updateConfigWithAppId$1 = new ConfigurationStateManager$updateConfigWithAppId$1(configurationStateManager, str2, configurationExtension$configureWithAppID$1);
                                            configurationDownloader.getClass();
                                            if (!StringUtils.a(str3)) {
                                                try {
                                                    new URL(str3);
                                                    CacheResult cacheResultA = ServiceProvider.a().f.a(MlModel.MODEL_FILE_SUFFIX, str3);
                                                    HashMap map3 = new HashMap();
                                                    if (cacheResultA != null) {
                                                        Map metadata = cacheResultA.getMetadata();
                                                        if (metadata == null || (str = (String) metadata.get("ETag")) == null) {
                                                            str = "";
                                                        }
                                                        map3.put("If-None-Match", str);
                                                        Map metadata2 = cacheResultA.getMetadata();
                                                        String str4 = metadata2 != null ? (String) metadata2.get("Last-Modified") : null;
                                                        long j = 0;
                                                        if (str4 != null) {
                                                            try {
                                                                j = Long.parseLong(str4);
                                                            } catch (NumberFormatException unused) {
                                                            }
                                                        }
                                                        TimeZone timeZone = TimeZone.getTimeZone("GMT");
                                                        Intrinsics.g(timeZone, "getTimeZone(\"GMT\")");
                                                        Locale US = Locale.US;
                                                        Intrinsics.g(US, "US");
                                                        map3.put("If-Modified-Since", TimeUtils.b(j, timeZone));
                                                    }
                                                    ServiceProvider.a().b.a(new NetworkRequest(str3, map3, 10, 10), new NetworkCallback() { // from class: com.adobe.marketing.mobile.internal.configuration.a
                                                        @Override // com.adobe.marketing.mobile.services.NetworkCallback
                                                        public final void b(HttpConnecting httpConnecting) throws NumberFormatException, IOException, ParseException {
                                                            ConfigurationDownloader this$0 = configurationDownloader;
                                                            Intrinsics.h(this$0, "this$0");
                                                            if (httpConnecting == null) {
                                                                Log.c();
                                                            } else {
                                                                int iB = httpConnecting.b();
                                                                String str5 = str3;
                                                                if (iB == 200) {
                                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                    String strA = httpConnecting.a("Last-Modified");
                                                                    TimeZone timeZone2 = TimeZone.getTimeZone("GMT");
                                                                    Intrinsics.g(timeZone2, "getTimeZone(\"GMT\")");
                                                                    Locale US2 = Locale.US;
                                                                    Intrinsics.g(US2, "US");
                                                                    Date dateC = TimeUtils.c(strA, timeZone2);
                                                                    if (dateC == null) {
                                                                        dateC = new Date(0L);
                                                                    }
                                                                    linkedHashMap2.put("Last-Modified", String.valueOf(dateC.getTime()));
                                                                    String strA2 = httpConnecting.a("ETag");
                                                                    if (strA2 == null) {
                                                                        strA2 = "";
                                                                    }
                                                                    linkedHashMap2.put("ETag", strA2);
                                                                    mapA = ConfigurationDownloader.a(str5, httpConnecting.c(), linkedHashMap2);
                                                                } else if (iB != 304) {
                                                                    httpConnecting.b();
                                                                    Log.a();
                                                                } else {
                                                                    Log.a();
                                                                    CacheResult cacheResultA2 = ServiceProvider.a().f.a(MlModel.MODEL_FILE_SUFFIX, str5);
                                                                    mapA = ConfigurationDownloader.a(str5, cacheResultA2 != null ? cacheResultA2.getData() : null, cacheResultA2 != null ? cacheResultA2.getMetadata() : null);
                                                                }
                                                            }
                                                            if (httpConnecting != null) {
                                                                httpConnecting.close();
                                                            }
                                                            ((ConfigurationStateManager$updateConfigWithAppId$1) configurationStateManager$updateConfigWithAppId$1).invoke(mapA);
                                                        }
                                                    });
                                                    break;
                                                } catch (MalformedURLException unused2) {
                                                }
                                            }
                                            configurationStateManager$updateConfigWithAppId$1.invoke(null);
                                            break;
                                        }
                                    } else if (sharedStateResolverA != 0) {
                                        sharedStateResolverA.a(configurationStateManager.f);
                                        break;
                                    }
                                } else {
                                    Log.c();
                                    appIdManager.getClass();
                                    Log.c();
                                    NamedCollection namedCollection2 = appIdManager.f13174a;
                                    if (namedCollection2 != null) {
                                        namedCollection2.remove("config.appID");
                                    }
                                    if (sharedStateResolverA != 0) {
                                        sharedStateResolverA.a(configurationStateManager.f);
                                        break;
                                    }
                                }
                            } else {
                                boolean zContainsKey = event.e.containsKey("config.assetFile");
                                ConfigurationExtension.RulesSource rulesSource = ConfigurationExtension.RulesSource.e;
                                if (zContainsKey) {
                                    SharedStateResolver sharedStateResolverA2 = extensionApi2.a(event);
                                    Map map4 = event.e;
                                    String str5 = (String) (map4 != null ? map4.get("config.assetFile") : null);
                                    if (str5 != null && !StringsKt.D(str5)) {
                                        configurationStateManager.getClass();
                                        LinkedHashMap linkedHashMapB = ConfigurationStateManager.b(str5);
                                        if (linkedHashMapB != null && !linkedHashMapB.isEmpty()) {
                                            configurationStateManager.c(linkedHashMapB);
                                            configurationExtension.h(rulesSource, sharedStateResolverA2);
                                            break;
                                        } else {
                                            Log.a();
                                            "Could not update configuration from file asset: ".concat(str5);
                                            Log.a();
                                            if (sharedStateResolverA2 != 0) {
                                                sharedStateResolverA2.a(configurationStateManager.f);
                                                break;
                                            }
                                        }
                                    } else {
                                        Log.a();
                                        if (sharedStateResolverA2 != 0) {
                                            sharedStateResolverA2.a(configurationStateManager.f);
                                            break;
                                        }
                                    }
                                } else if (event.e.containsKey("config.filePath")) {
                                    SharedStateResolver sharedStateResolverA3 = extensionApi2.a(event);
                                    Map map5 = event.e;
                                    String str6 = (String) (map5 != null ? map5.get("config.filePath") : null);
                                    if (str6 != null && !StringsKt.D(str6)) {
                                        configurationStateManager.getClass();
                                        String strB = FileUtils.b(new File(str6));
                                        if (strB == null || strB.length() == 0) {
                                            Log.a();
                                        } else {
                                            try {
                                                linkedHashMapC = JSONExtensionsKt.c(new JSONObject(new JSONTokener(strB)));
                                            } catch (JSONException unused3) {
                                                Log.d();
                                                linkedHashMapC = null;
                                            }
                                            if (linkedHashMapC == null || linkedHashMapC.isEmpty()) {
                                                Log.a();
                                            } else {
                                                linkedHashMap = linkedHashMapC;
                                            }
                                        }
                                        if (linkedHashMap == null) {
                                            Log.a();
                                            "Could not update configuration from file path: ".concat(str6);
                                            Log.a();
                                            if (sharedStateResolverA3 != 0) {
                                                sharedStateResolverA3.a(configurationStateManager.f);
                                                break;
                                            }
                                        } else {
                                            configurationStateManager.c(linkedHashMap);
                                            configurationExtension.h(rulesSource, sharedStateResolverA3);
                                            break;
                                        }
                                    } else {
                                        Log.d();
                                        if (sharedStateResolverA3 != 0) {
                                            sharedStateResolverA3.a(configurationStateManager.f);
                                            break;
                                        }
                                    }
                                } else if (event.e.containsKey("config.update")) {
                                    SharedStateResolver sharedStateResolverA4 = extensionApi2.a(event);
                                    try {
                                        mapC = DataReader.c(Object.class, event.e, "config.update");
                                    } catch (DataReaderException unused4) {
                                        mapC = null;
                                    }
                                    if (mapC == null) {
                                        mapC = null;
                                    }
                                    if (mapC == null) {
                                        Log.a();
                                        if (sharedStateResolverA4 != 0) {
                                            sharedStateResolverA4.a(configurationStateManager.f);
                                            break;
                                        }
                                    } else {
                                        LinkedHashMap linkedHashMap2 = configurationStateManager.d;
                                        LinkedHashMap linkedHashMap3 = configurationStateManager.e;
                                        Object obj2 = linkedHashMap3.get("build.environment");
                                        String str7 = obj2 instanceof String ? (String) obj2 : null;
                                        if (str7 != null) {
                                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                            for (Map.Entry entry : mapC.entrySet()) {
                                                String str8 = (String) entry.getKey();
                                                String strI = str7.length() == 0 ? str8 : YU.a.i(lqlqqlq.m006D006D006Dm006Dm, str7, lqlqqlq.m006D006D006Dm006Dm, str8);
                                                if (linkedHashMap3.get(strI) != null) {
                                                    str8 = strI;
                                                }
                                                linkedHashMap4.put(str8, entry.getValue());
                                            }
                                            mapC = linkedHashMap4;
                                        }
                                        linkedHashMap2.putAll(mapC);
                                        NamedCollection namedCollectionA = ServiceProvider.a().d.a("AdobeMobile_ConfigState");
                                        Intrinsics.g(namedCollectionA, "getInstance().dataStoreS…Collection(DATASTORE_KEY)");
                                        String string2 = new JSONObject(linkedHashMap2).toString();
                                        Intrinsics.g(string2, "JSONObject(programmaticConfiguration).toString()");
                                        namedCollectionA.setString("config.overridden.map", string2);
                                        linkedHashMap3.putAll(linkedHashMap2);
                                        configurationStateManager.a();
                                        Log.a();
                                        configurationExtension.h(rulesSource, sharedStateResolverA4);
                                        break;
                                    }
                                } else if (event.e.containsKey("config.clearUpdates")) {
                                    SharedStateResolver sharedStateResolverA5 = extensionApi2.a(event);
                                    configurationStateManager.getClass();
                                    NamedCollection namedCollectionA2 = ServiceProvider.a().d.a("AdobeMobile_ConfigState");
                                    Intrinsics.g(namedCollectionA2, "getInstance().dataStoreS…Collection(DATASTORE_KEY)");
                                    namedCollectionA2.remove("config.overridden.map");
                                    configurationStateManager.d.clear();
                                    LinkedHashMap linkedHashMap5 = configurationStateManager.e;
                                    linkedHashMap5.clear();
                                    linkedHashMap5.putAll(configurationStateManager.c);
                                    configurationStateManager.a();
                                    Log.c();
                                    configurationExtension.h(rulesSource, sharedStateResolverA5);
                                    break;
                                } else if (event.e.containsKey("config.getData")) {
                                    configurationExtension.i(configurationStateManager.f, event);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                        List list = MobileIdentitiesProvider.f13178a;
                        ExtensionApi api = configurationExtension.f13161a;
                        Intrinsics.g(api, "api");
                        linkedHashMap6.put("config.allIdentifiers", MobileIdentitiesProvider.a(event, api));
                        Event.Builder builder = new Event.Builder("Configuration Response Identity", "com.adobe.eventType.configuration", "com.adobe.eventSource.responseIdentity", null);
                        builder.d(linkedHashMap6);
                        builder.c(event);
                        api.c(builder.a());
                        break;
                }
            }
        });
        final int i2 = 1;
        extensionApi.f("com.adobe.eventType.configuration", "com.adobe.eventSource.requestIdentity", new ExtensionEventListener(this) { // from class: com.adobe.marketing.mobile.internal.configuration.b
            public final /* synthetic */ ConfigurationExtension b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
            @Override // com.adobe.marketing.mobile.ExtensionEventListener
            public final void a(Event event) throws NumberFormatException, IOException {
                Map mapC;
                LinkedHashMap linkedHashMapC;
                String str;
                int i22 = i2;
                linkedHashMap = null;
                LinkedHashMap linkedHashMap = null;
                ConfigurationExtension configurationExtension = this.b;
                switch (i22) {
                    case 0:
                        ConfigurationStateManager configurationStateManager = configurationExtension.c;
                        ExtensionApi extensionApi2 = configurationExtension.f13161a;
                        Map map = event.e;
                        if (map != null) {
                            if (map.containsKey("config.appId")) {
                                SharedStateResolver sharedStateResolverA = extensionApi2.a(event);
                                AppIdManager appIdManager = configurationExtension.b;
                                Map map2 = event.e;
                                Object obj = map2 != null ? map2.get("config.appId") : null;
                                String str2 = obj instanceof String ? (String) obj : null;
                                if (str2 != null && !StringsKt.D(str2)) {
                                    configurationStateManager.getClass();
                                    Date date = (Date) configurationStateManager.g.get(str2);
                                    if (date == null || new Date(date.getTime() + 15000).compareTo(new Date()) < 0) {
                                        if (DataReader.e("config.isinternalevent", event.e)) {
                                            NamedCollection namedCollection = appIdManager.f13174a;
                                            String string = namedCollection != null ? namedCollection.getString("config.appID") : null;
                                            if (string != null && !StringsKt.D(string) && !str2.equals(string)) {
                                                Log.c();
                                                if (sharedStateResolverA != 0) {
                                                    sharedStateResolverA.a(configurationStateManager.f);
                                                    break;
                                                }
                                            }
                                        }
                                        extensionApi2.h();
                                        ConfigurationExtension$configureWithAppID$1 configurationExtension$configureWithAppID$1 = new ConfigurationExtension$configureWithAppID$1(configurationExtension, sharedStateResolverA, str2);
                                        if (StringsKt.D(str2)) {
                                            Log.c();
                                            break;
                                        } else {
                                            configurationStateManager.f13177a.b(str2);
                                            final String str3 = String.format("https://assets.adobedtm.com/%s.json", Arrays.copyOf(new Object[]{str2}, 1));
                                            final ConfigurationDownloader configurationDownloader = configurationStateManager.b;
                                            final Function1 configurationStateManager$updateConfigWithAppId$1 = new ConfigurationStateManager$updateConfigWithAppId$1(configurationStateManager, str2, configurationExtension$configureWithAppID$1);
                                            configurationDownloader.getClass();
                                            if (!StringUtils.a(str3)) {
                                                try {
                                                    new URL(str3);
                                                    CacheResult cacheResultA = ServiceProvider.a().f.a(MlModel.MODEL_FILE_SUFFIX, str3);
                                                    HashMap map3 = new HashMap();
                                                    if (cacheResultA != null) {
                                                        Map metadata = cacheResultA.getMetadata();
                                                        if (metadata == null || (str = (String) metadata.get("ETag")) == null) {
                                                            str = "";
                                                        }
                                                        map3.put("If-None-Match", str);
                                                        Map metadata2 = cacheResultA.getMetadata();
                                                        String str4 = metadata2 != null ? (String) metadata2.get("Last-Modified") : null;
                                                        long j = 0;
                                                        if (str4 != null) {
                                                            try {
                                                                j = Long.parseLong(str4);
                                                            } catch (NumberFormatException unused) {
                                                            }
                                                        }
                                                        TimeZone timeZone = TimeZone.getTimeZone("GMT");
                                                        Intrinsics.g(timeZone, "getTimeZone(\"GMT\")");
                                                        Locale US = Locale.US;
                                                        Intrinsics.g(US, "US");
                                                        map3.put("If-Modified-Since", TimeUtils.b(j, timeZone));
                                                    }
                                                    ServiceProvider.a().b.a(new NetworkRequest(str3, map3, 10, 10), new NetworkCallback() { // from class: com.adobe.marketing.mobile.internal.configuration.a
                                                        @Override // com.adobe.marketing.mobile.services.NetworkCallback
                                                        public final void b(HttpConnecting httpConnecting) throws NumberFormatException, IOException, ParseException {
                                                            ConfigurationDownloader this$0 = configurationDownloader;
                                                            Intrinsics.h(this$0, "this$0");
                                                            if (httpConnecting == null) {
                                                                Log.c();
                                                            } else {
                                                                int iB = httpConnecting.b();
                                                                String str5 = str3;
                                                                if (iB == 200) {
                                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                    String strA = httpConnecting.a("Last-Modified");
                                                                    TimeZone timeZone2 = TimeZone.getTimeZone("GMT");
                                                                    Intrinsics.g(timeZone2, "getTimeZone(\"GMT\")");
                                                                    Locale US2 = Locale.US;
                                                                    Intrinsics.g(US2, "US");
                                                                    Date dateC = TimeUtils.c(strA, timeZone2);
                                                                    if (dateC == null) {
                                                                        dateC = new Date(0L);
                                                                    }
                                                                    linkedHashMap2.put("Last-Modified", String.valueOf(dateC.getTime()));
                                                                    String strA2 = httpConnecting.a("ETag");
                                                                    if (strA2 == null) {
                                                                        strA2 = "";
                                                                    }
                                                                    linkedHashMap2.put("ETag", strA2);
                                                                    mapA = ConfigurationDownloader.a(str5, httpConnecting.c(), linkedHashMap2);
                                                                } else if (iB != 304) {
                                                                    httpConnecting.b();
                                                                    Log.a();
                                                                } else {
                                                                    Log.a();
                                                                    CacheResult cacheResultA2 = ServiceProvider.a().f.a(MlModel.MODEL_FILE_SUFFIX, str5);
                                                                    mapA = ConfigurationDownloader.a(str5, cacheResultA2 != null ? cacheResultA2.getData() : null, cacheResultA2 != null ? cacheResultA2.getMetadata() : null);
                                                                }
                                                            }
                                                            if (httpConnecting != null) {
                                                                httpConnecting.close();
                                                            }
                                                            ((ConfigurationStateManager$updateConfigWithAppId$1) configurationStateManager$updateConfigWithAppId$1).invoke(mapA);
                                                        }
                                                    });
                                                    break;
                                                } catch (MalformedURLException unused2) {
                                                }
                                            }
                                            configurationStateManager$updateConfigWithAppId$1.invoke(null);
                                            break;
                                        }
                                    } else if (sharedStateResolverA != 0) {
                                        sharedStateResolverA.a(configurationStateManager.f);
                                        break;
                                    }
                                } else {
                                    Log.c();
                                    appIdManager.getClass();
                                    Log.c();
                                    NamedCollection namedCollection2 = appIdManager.f13174a;
                                    if (namedCollection2 != null) {
                                        namedCollection2.remove("config.appID");
                                    }
                                    if (sharedStateResolverA != 0) {
                                        sharedStateResolverA.a(configurationStateManager.f);
                                        break;
                                    }
                                }
                            } else {
                                boolean zContainsKey = event.e.containsKey("config.assetFile");
                                ConfigurationExtension.RulesSource rulesSource = ConfigurationExtension.RulesSource.e;
                                if (zContainsKey) {
                                    SharedStateResolver sharedStateResolverA2 = extensionApi2.a(event);
                                    Map map4 = event.e;
                                    String str5 = (String) (map4 != null ? map4.get("config.assetFile") : null);
                                    if (str5 != null && !StringsKt.D(str5)) {
                                        configurationStateManager.getClass();
                                        LinkedHashMap linkedHashMapB = ConfigurationStateManager.b(str5);
                                        if (linkedHashMapB != null && !linkedHashMapB.isEmpty()) {
                                            configurationStateManager.c(linkedHashMapB);
                                            configurationExtension.h(rulesSource, sharedStateResolverA2);
                                            break;
                                        } else {
                                            Log.a();
                                            "Could not update configuration from file asset: ".concat(str5);
                                            Log.a();
                                            if (sharedStateResolverA2 != 0) {
                                                sharedStateResolverA2.a(configurationStateManager.f);
                                                break;
                                            }
                                        }
                                    } else {
                                        Log.a();
                                        if (sharedStateResolverA2 != 0) {
                                            sharedStateResolverA2.a(configurationStateManager.f);
                                            break;
                                        }
                                    }
                                } else if (event.e.containsKey("config.filePath")) {
                                    SharedStateResolver sharedStateResolverA3 = extensionApi2.a(event);
                                    Map map5 = event.e;
                                    String str6 = (String) (map5 != null ? map5.get("config.filePath") : null);
                                    if (str6 != null && !StringsKt.D(str6)) {
                                        configurationStateManager.getClass();
                                        String strB = FileUtils.b(new File(str6));
                                        if (strB == null || strB.length() == 0) {
                                            Log.a();
                                        } else {
                                            try {
                                                linkedHashMapC = JSONExtensionsKt.c(new JSONObject(new JSONTokener(strB)));
                                            } catch (JSONException unused3) {
                                                Log.d();
                                                linkedHashMapC = null;
                                            }
                                            if (linkedHashMapC == null || linkedHashMapC.isEmpty()) {
                                                Log.a();
                                            } else {
                                                linkedHashMap = linkedHashMapC;
                                            }
                                        }
                                        if (linkedHashMap == null) {
                                            Log.a();
                                            "Could not update configuration from file path: ".concat(str6);
                                            Log.a();
                                            if (sharedStateResolverA3 != 0) {
                                                sharedStateResolverA3.a(configurationStateManager.f);
                                                break;
                                            }
                                        } else {
                                            configurationStateManager.c(linkedHashMap);
                                            configurationExtension.h(rulesSource, sharedStateResolverA3);
                                            break;
                                        }
                                    } else {
                                        Log.d();
                                        if (sharedStateResolverA3 != 0) {
                                            sharedStateResolverA3.a(configurationStateManager.f);
                                            break;
                                        }
                                    }
                                } else if (event.e.containsKey("config.update")) {
                                    SharedStateResolver sharedStateResolverA4 = extensionApi2.a(event);
                                    try {
                                        mapC = DataReader.c(Object.class, event.e, "config.update");
                                    } catch (DataReaderException unused4) {
                                        mapC = null;
                                    }
                                    if (mapC == null) {
                                        mapC = null;
                                    }
                                    if (mapC == null) {
                                        Log.a();
                                        if (sharedStateResolverA4 != 0) {
                                            sharedStateResolverA4.a(configurationStateManager.f);
                                            break;
                                        }
                                    } else {
                                        LinkedHashMap linkedHashMap2 = configurationStateManager.d;
                                        LinkedHashMap linkedHashMap3 = configurationStateManager.e;
                                        Object obj2 = linkedHashMap3.get("build.environment");
                                        String str7 = obj2 instanceof String ? (String) obj2 : null;
                                        if (str7 != null) {
                                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                            for (Map.Entry entry : mapC.entrySet()) {
                                                String str8 = (String) entry.getKey();
                                                String strI = str7.length() == 0 ? str8 : YU.a.i(lqlqqlq.m006D006D006Dm006Dm, str7, lqlqqlq.m006D006D006Dm006Dm, str8);
                                                if (linkedHashMap3.get(strI) != null) {
                                                    str8 = strI;
                                                }
                                                linkedHashMap4.put(str8, entry.getValue());
                                            }
                                            mapC = linkedHashMap4;
                                        }
                                        linkedHashMap2.putAll(mapC);
                                        NamedCollection namedCollectionA = ServiceProvider.a().d.a("AdobeMobile_ConfigState");
                                        Intrinsics.g(namedCollectionA, "getInstance().dataStoreS…Collection(DATASTORE_KEY)");
                                        String string2 = new JSONObject(linkedHashMap2).toString();
                                        Intrinsics.g(string2, "JSONObject(programmaticConfiguration).toString()");
                                        namedCollectionA.setString("config.overridden.map", string2);
                                        linkedHashMap3.putAll(linkedHashMap2);
                                        configurationStateManager.a();
                                        Log.a();
                                        configurationExtension.h(rulesSource, sharedStateResolverA4);
                                        break;
                                    }
                                } else if (event.e.containsKey("config.clearUpdates")) {
                                    SharedStateResolver sharedStateResolverA5 = extensionApi2.a(event);
                                    configurationStateManager.getClass();
                                    NamedCollection namedCollectionA2 = ServiceProvider.a().d.a("AdobeMobile_ConfigState");
                                    Intrinsics.g(namedCollectionA2, "getInstance().dataStoreS…Collection(DATASTORE_KEY)");
                                    namedCollectionA2.remove("config.overridden.map");
                                    configurationStateManager.d.clear();
                                    LinkedHashMap linkedHashMap5 = configurationStateManager.e;
                                    linkedHashMap5.clear();
                                    linkedHashMap5.putAll(configurationStateManager.c);
                                    configurationStateManager.a();
                                    Log.c();
                                    configurationExtension.h(rulesSource, sharedStateResolverA5);
                                    break;
                                } else if (event.e.containsKey("config.getData")) {
                                    configurationExtension.i(configurationStateManager.f, event);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                        List list = MobileIdentitiesProvider.f13178a;
                        ExtensionApi api = configurationExtension.f13161a;
                        Intrinsics.g(api, "api");
                        linkedHashMap6.put("config.allIdentifiers", MobileIdentitiesProvider.a(event, api));
                        Event.Builder builder = new Event.Builder("Configuration Response Identity", "com.adobe.eventType.configuration", "com.adobe.eventSource.responseIdentity", null);
                        builder.d(linkedHashMap6);
                        builder.c(event);
                        api.c(builder.a());
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void h(RulesSource rulesSource, SharedStateResolver sharedStateResolver) throws NumberFormatException {
        String string;
        RulesLoadResult rulesLoadResult;
        ConfigurationStateManager configurationStateManager = this.c;
        ?? r1 = configurationStateManager.f;
        if (sharedStateResolver != 0) {
            sharedStateResolver.a(r1);
        }
        i(r1, null);
        int iOrdinal = rulesSource.ordinal();
        ConfigurationRulesManager configurationRulesManager = this.d;
        ExtensionApi api = this.f13161a;
        RulesLoadResult.Reason reason = RulesLoadResult.Reason.d;
        boolean zB = false;
        if (iOrdinal == 0) {
            Intrinsics.g(api, "api");
            configurationRulesManager.getClass();
            NamedCollection namedCollection = configurationRulesManager.c;
            if (namedCollection == null || (string = namedCollection.getString("config.last.rules.url")) == null || StringsKt.D(string)) {
                Log.a();
            } else {
                RulesLoader rulesLoader = configurationRulesManager.b;
                rulesLoader.getClass();
                boolean zA = StringUtils.a(string);
                RulesLoadResult.Reason reason2 = RulesLoadResult.Reason.j;
                if (zA) {
                    rulesLoadResult = new RulesLoadResult(null, reason);
                } else {
                    CacheResult cacheResultA = ServiceProvider.a().f.a(rulesLoader.f13203a, string);
                    rulesLoadResult = cacheResultA == null ? new RulesLoadResult(null, RulesLoadResult.Reason.i) : new RulesLoadResult(StreamUtils.a(cacheResultA.getData()), reason2);
                }
                RulesLoadResult.Reason reason3 = rulesLoadResult.b;
                if (reason3 != reason2) {
                    reason3.toString();
                    Log.a();
                } else {
                    Log.c();
                    zB = configurationRulesManager.b(rulesLoadResult.f13202a, api);
                }
            }
        } else if (iOrdinal == 1) {
            Intrinsics.g(api, "api");
            zB = configurationRulesManager.a(api);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj = configurationStateManager.f.get("rules.url");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || StringsKt.D(str)) {
                Log.a();
            } else {
                Intrinsics.g(api, "api");
                configurationRulesManager.getClass();
                NamedCollection namedCollection2 = configurationRulesManager.c;
                if (namedCollection2 == null) {
                    Log.a();
                } else {
                    namedCollection2.setString("config.last.rules.url", str);
                    RulesLoader rulesLoader2 = configurationRulesManager.b;
                    d dVar = new d(str, configurationRulesManager, api);
                    String str2 = rulesLoader2.f13203a;
                    if (StringUtils.a(str)) {
                        Log.c();
                        dVar.a(new RulesLoadResult(null, reason));
                        zB = true;
                    } else {
                        try {
                            new URL(str);
                            CacheResult cacheResultA2 = ServiceProvider.a().f.a(str2, str);
                            HashMap map = new HashMap();
                            if (cacheResultA2 != null) {
                                Map metadata = cacheResultA2.getMetadata();
                                String str3 = metadata == null ? "" : (String) metadata.get("ETag");
                                map.put("If-None-Match", str3 != null ? str3 : "");
                                String str4 = metadata != null ? (String) metadata.get("Last-Modified") : null;
                                long j = 0;
                                if (str4 != null) {
                                    try {
                                        j = Long.parseLong(str4);
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                TimeZone timeZone = TimeZone.getTimeZone("GMT");
                                Locale locale = Locale.US;
                                map.put("If-Modified-Since", TimeUtils.b(j, timeZone));
                            }
                            ServiceProvider.a().b.a(new NetworkRequest(str, map, 10, 10), new com.adobe.marketing.mobile.launch.rulesengine.download.a(0, rulesLoader2, str, dVar));
                        } catch (MalformedURLException unused2) {
                        }
                        zB = true;
                    }
                }
            }
        }
        if (rulesSource != RulesSource.d || zB) {
            return;
        }
        Intrinsics.g(api, "api");
        configurationRulesManager.a(api);
    }

    public final void i(Map map, Event event) {
        Event eventA;
        Event.Builder builder = new Event.Builder("Configuration Response", "com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent", null);
        builder.d(map);
        if (event == null) {
            eventA = builder.a();
            Intrinsics.g(eventA, "{\n            builder.build()\n        }");
        } else {
            builder.c(event);
            eventA = builder.a();
            Intrinsics.g(eventA, "{\n            builder.in…rEvent).build()\n        }");
        }
        this.f13161a.c(eventA);
    }

    private ConfigurationExtension(ExtensionApi extensionApi, AppIdManager appIdManager, LaunchRulesEngine launchRulesEngine, ScheduledExecutorService scheduledExecutorService) {
        this(extensionApi, appIdManager, launchRulesEngine, scheduledExecutorService, new ConfigurationStateManager(appIdManager), new ConfigurationRulesManager(launchRulesEngine));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConfigurationExtension(@org.jetbrains.annotations.NotNull com.adobe.marketing.mobile.ExtensionApi r4, @org.jetbrains.annotations.NotNull com.adobe.marketing.mobile.internal.configuration.AppIdManager r5, @org.jetbrains.annotations.NotNull final com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine r6, @org.jetbrains.annotations.NotNull java.util.concurrent.ScheduledExecutorService r7, @org.jetbrains.annotations.NotNull com.adobe.marketing.mobile.internal.configuration.ConfigurationStateManager r8, @org.jetbrains.annotations.NotNull com.adobe.marketing.mobile.internal.configuration.ConfigurationRulesManager r9) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.<init>(com.adobe.marketing.mobile.ExtensionApi, com.adobe.marketing.mobile.internal.configuration.AppIdManager, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine, java.util.concurrent.ScheduledExecutorService, com.adobe.marketing.mobile.internal.configuration.ConfigurationStateManager, com.adobe.marketing.mobile.internal.configuration.ConfigurationRulesManager):void");
    }
}
