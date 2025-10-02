package com.swrve.sdk;

import com.salesforce.marketingcloud.storage.db.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/swrve/sdk/SwrvePushInboxMessage;", "", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwrvePushInboxMessage {
    public SwrvePushInboxMessage(JSONObject jSONObject) throws JSONException {
        jSONObject.getLong("message_id");
        jSONObject.getLong("variant_id");
        jSONObject.getLong(i.a.i);
        jSONObject.getLong("sent_date");
        Intrinsics.g(jSONObject.getJSONObject("customer_json"), "getJSONObject(...)");
        String string = jSONObject.getString("state");
        if (StringsKt.y(string, "R", true)) {
            SwrvePushInboxMessageState swrvePushInboxMessageState = SwrvePushInboxMessageState.d;
        } else {
            if (!StringsKt.y(string, "U", true)) {
                throw new IllegalArgumentException(YU.a.A("Push Inbox Message invalid state value: ", string));
            }
            SwrvePushInboxMessageState swrvePushInboxMessageState2 = SwrvePushInboxMessageState.e;
        }
    }
}
