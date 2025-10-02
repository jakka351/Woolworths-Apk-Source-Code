package com.adobe.marketing.mobile.internal.configuration;

import com.adobe.marketing.mobile.internal.util.JSONExtensionsKt;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.caching.CacheEntry;
import com.adobe.marketing.mobile.services.caching.CacheExpiry;
import com.adobe.marketing.mobile.util.StreamUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationDownloader;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigurationDownloader {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationDownloader$Companion;", "", "", "CONFIG_CACHE_NAME", "Ljava/lang/String;", "", "DEFAULT_CONNECTION_TIMEOUT_SECONDS", "I", "DEFAULT_READ_TIMEOUT_SECONDS", "HTTP_HEADER_ETAG", "HTTP_HEADER_IF_MODIFIED_SINCE", "HTTP_HEADER_IF_NONE_MATCH", "HTTP_HEADER_LAST_MODIFIED", "LOG_TAG", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public static Map a(String str, InputStream inputStream, Map map) throws IOException {
        String strA = StreamUtils.a(inputStream);
        if (strA == null) {
            return null;
        }
        if (strA.length() == 0) {
            Log.a();
            return EmptyMap.d;
        }
        try {
            LinkedHashMap linkedHashMapC = JSONExtensionsKt.c(new JSONObject(new JSONTokener(strA)));
            byte[] bytes = strA.getBytes(Charsets.f24671a);
            Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
            ServiceProvider.a().f.c(MlModel.MODEL_FILE_SUFFIX, str, new CacheEntry(new ByteArrayInputStream(bytes), new CacheExpiry(null), map));
            return linkedHashMapC;
        } catch (JSONException e) {
            e.toString();
            Log.a();
            return null;
        }
    }
}
