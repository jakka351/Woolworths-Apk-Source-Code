package com.salesforce.marketingcloud.messages.inbox;

import com.salesforce.marketingcloud.internal.m;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class b {
    @Nullable
    public static final InboxMessage.Media a(@NotNull JSONObject jSONObject) {
        Intrinsics.h(jSONObject, "<this>");
        String strOptString = jSONObject.optString("androidUrl");
        Intrinsics.g(strOptString, "optString(...)");
        String strB = m.b(strOptString);
        String strI = com.google.android.gms.common.api.internal.a.i(jSONObject, "alt", "optString(...)");
        if (strB == null && strI == null) {
            return null;
        }
        if (strB == null) {
            strB = "";
        }
        return new InboxMessage.Media(strB, strI);
    }

    @NotNull
    public static final JSONObject a(@NotNull InboxMessage.Media media) throws JSONException {
        Intrinsics.h(media, "<this>");
        JSONObject jSONObject = new JSONObject();
        if (media.getUrl() != null) {
            jSONObject.put("androidUrl", media.getUrl());
        }
        if (media.getAltText() != null) {
            jSONObject.put("alt", media.getAltText());
        }
        return jSONObject;
    }
}
