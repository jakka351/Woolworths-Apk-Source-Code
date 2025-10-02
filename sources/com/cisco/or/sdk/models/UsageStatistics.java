package com.cisco.or.sdk.models;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/cisco/or/sdk/models/UsageStatistics;", "", "Stats", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UsageStatistics {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14042a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/models/UsageStatistics$Stats;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Stats {
    }

    public UsageStatistics(JSONArray array) throws JSONException {
        Intrinsics.h(array, "array");
        this.f14042a = new ArrayList();
        int length = array.length();
        for (int i = 0; i < length; i++) {
            ArrayList arrayList = this.f14042a;
            JSONObject jSONObject = array.getJSONObject(i);
            Intrinsics.g(jSONObject, "array.getJSONObject(i)");
            Stats stats = new Stats();
            Intrinsics.g(jSONObject.getString("ssid"), "json.getString(\"ssid\")");
            Intrinsics.g(jSONObject.getString("device"), "json.getString(\"device\")");
            jSONObject.getInt("duration");
            Intrinsics.g(jSONObject.getString("datetime"), "json.getString(\"datetime\")");
            jSONObject.getLong("starttime");
            jSONObject.getLong("endtime");
            arrayList.add(stats);
        }
    }
}
