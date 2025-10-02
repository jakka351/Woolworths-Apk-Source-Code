package com.salesforce.marketingcloud.messages;

import com.salesforce.marketingcloud.location.LatLon;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a {
    @JvmName
    @NotNull
    public static final LatLon a(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.h(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("refreshCenter");
        Intrinsics.g(jSONObject2, "getJSONObject(...)");
        return new LatLon(jSONObject2);
    }

    @JvmName
    public static final int b(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.h(jSONObject, "<this>");
        return jSONObject.getInt("refreshRadius");
    }
}
