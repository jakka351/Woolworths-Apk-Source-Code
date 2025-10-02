package com.cisco.or.sdk.models;

import com.salesforce.marketingcloud.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocationDetailsKt {
    public static final LocationDetails a(JSONObject jsonObject) throws JSONException {
        String currentLocation;
        String type;
        String path;
        long j;
        String customerName;
        JSONObject mapInfo;
        String nearestAPs = "";
        Intrinsics.h(jsonObject, "jsonObject");
        try {
            currentLocation = jsonObject.getString("currentLocation");
        } catch (Exception unused) {
            currentLocation = "";
        }
        try {
            type = jsonObject.getString("type");
        } catch (Exception unused2) {
            type = "";
        }
        try {
            path = jsonObject.getString(a.j);
        } catch (Exception unused3) {
            path = "";
        }
        long j2 = 0;
        try {
            j = jsonObject.getLong("x");
        } catch (Exception unused4) {
            j = 0;
        }
        try {
            j2 = jsonObject.getLong("y");
        } catch (Exception unused5) {
        }
        long j3 = j2;
        try {
            customerName = jsonObject.getString("customerName");
        } catch (Exception unused6) {
            customerName = "";
        }
        try {
            mapInfo = jsonObject.getJSONObject("mapInfo");
        } catch (Exception unused7) {
            mapInfo = new JSONObject();
        }
        try {
            nearestAPs = jsonObject.getString("nearestAPs");
        } catch (Exception unused8) {
        }
        Intrinsics.g(currentLocation, "currentLocation");
        Intrinsics.g(type, "type");
        Intrinsics.g(path, "path");
        Intrinsics.g(customerName, "customerName");
        Intrinsics.g(mapInfo, "mapInfo");
        Intrinsics.g(nearestAPs, "nearestAPs");
        return new LocationDetails(currentLocation, type, path, j, j3, customerName, mapInfo, nearestAPs);
    }
}
