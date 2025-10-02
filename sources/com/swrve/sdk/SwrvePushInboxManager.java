package com.swrve.sdk;

import android.content.Context;
import com.swrve.sdk.rest.IRESTClient;
import com.swrve.sdk.rest.RESTClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/swrve/sdk/SwrvePushInboxManager;", "", "Companion", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SwrvePushInboxManager {

    /* renamed from: a, reason: collision with root package name */
    public final IRESTClient f19070a;
    public List b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/swrve/sdk/SwrvePushInboxManager$Companion;", "", "", "REST_MAX_ATTEMPTS", "I", "", "STATE_UPDATE_API", "Ljava/lang/String;", "STATE_UPDATE_PARAM_DELETE", "STATE_UPDATE_PARAM_READ", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public SwrvePushInboxManager(Context context, RESTClient restClient, String apiKey, String userId, String contentUrl) {
        Intrinsics.h(context, "context");
        Intrinsics.h(restClient, "restClient");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(userId, "userId");
        Intrinsics.h(contentUrl, "contentUrl");
        this.f19070a = restClient;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.g(listSynchronizedList, "synchronizedList(...)");
        this.b = listSynchronizedList;
    }

    public final void a(JSONArray pimJsonArray) throws JSONException {
        Intrinsics.h(pimJsonArray, "pimJsonArray");
        SwrveLogger.e("SwrveSDK: Push Inbox Messages JSON array: %s", pimJsonArray);
        ArrayList arrayList = new ArrayList();
        int length = pimJsonArray.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = pimJsonArray.getJSONObject(i);
                Intrinsics.e(jSONObject);
                arrayList.add(new SwrvePushInboxMessage(jSONObject));
            } catch (Exception e) {
                SwrveLogger.c("SwrveSDK: Error parsing push inbox message JSON", e, new Object[0]);
            }
        }
        this.b = arrayList;
    }
}
