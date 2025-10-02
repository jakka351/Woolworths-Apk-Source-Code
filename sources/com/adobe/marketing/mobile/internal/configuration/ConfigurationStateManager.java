package com.adobe.marketing.mobile.internal.configuration;

import com.adobe.marketing.mobile.internal.util.JSONExtensionsKt;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.NamedCollection;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.util.StreamUtils;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationStateManager;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ConfigurationStateManager {

    /* renamed from: a, reason: collision with root package name */
    public final AppIdManager f13177a;
    public final ConfigurationDownloader b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public Object f;
    public final LinkedHashMap g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationStateManager$Companion;", "", "", "BUILD_ENVIRONMENT", "Ljava/lang/String;", "", "CONFIGURATION_TTL_MS", "J", "CONFIGURATION_URL_BASE", "CONFIG_BUNDLED_FILE_NAME", "CONFIG_MANIFEST_APPID_KEY", "DATASTORE_KEY", "ENVIRONMENT_PREFIX_DELIMITER", "LOG_TAG", "PERSISTED_APPID", "PERSISTED_OVERRIDDEN_CONFIG", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public ConfigurationStateManager(AppIdManager appIdManager) {
        Intrinsics.h(appIdManager, "appIdManager");
        ConfigurationDownloader configurationDownloader = new ConfigurationDownloader();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = EmptyMap.d;
        this.g = new LinkedHashMap();
        this.f13177a = appIdManager;
        this.b = configurationDownloader;
        NamedCollection namedCollectionA = ServiceProvider.a().d.a("AdobeMobile_ConfigState");
        Intrinsics.g(namedCollectionA, "getInstance().dataStoreS…Collection(DATASTORE_KEY)");
        String string = namedCollectionA.getString("config.overridden.map");
        LinkedHashMap linkedHashMapC = null;
        if (string != null && string.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(new JSONTokener(string));
                Log.c();
                linkedHashMapC = JSONExtensionsKt.c(jSONObject);
            } catch (JSONException e) {
                e.toString();
                Log.a();
            }
        }
        if (linkedHashMapC != null) {
            this.d.putAll(linkedHashMapC);
        }
    }

    public static LinkedHashMap b(String str) {
        Log.c();
        String strA = StreamUtils.a(ServiceProvider.a().f13238a.b(str));
        if (strA == null || strA.length() == 0) {
            Log.a();
            return null;
        }
        try {
            return JSONExtensionsKt.c(new JSONObject(new JSONTokener(strA)));
        } catch (JSONException e) {
            e.toString();
            Log.a();
            return null;
        }
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.e;
        Object obj = linkedHashMap.get("build.environment");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) ((Map.Entry) it.next()).getKey();
            if (!StringsKt.W(str2, lqlqqlq.m006D006D006Dm006Dm, false)) {
                String strI = str.length() == 0 ? str2 : YU.a.i(lqlqqlq.m006D006D006Dm006Dm, str, lqlqqlq.m006D006D006Dm006Dm, str2);
                if (linkedHashMap.get(strI) == null) {
                    strI = str2;
                }
                Object obj2 = linkedHashMap.get(strI);
                if (obj2 != null) {
                    linkedHashMap2.put(str2, obj2);
                }
            }
        }
        this.f = linkedHashMap2;
    }

    public final void c(Map map) {
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.clear();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LinkedHashMap linkedHashMap2 = this.e;
        linkedHashMap2.clear();
        linkedHashMap2.putAll(linkedHashMap);
        linkedHashMap2.putAll(this.d);
        a();
        Log.c();
    }
}
