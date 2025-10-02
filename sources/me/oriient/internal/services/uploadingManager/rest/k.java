package me.oriient.internal.services.uploadingManager.rest;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.JsonableNumber;
import me.oriient.internal.infra.serializerJson.JsonableString;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25655a;

    public k(DataUploaderItem item, String sdkType, TimeProvider timeProvider, OsData osData, BuildData buildData) {
        Intrinsics.h(item, "item");
        Intrinsics.h(sdkType, "sdkType");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(osData, "osData");
        Intrinsics.h(buildData, "buildData");
        HashMap map = new HashMap();
        map.put("apiKeyId", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(item.getMetadata().getApiKey())));
        map.put("sessionId", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(item.getSessionId())));
        map.put("sessionStartTimeMilliUtc", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(item.getMetadata().getSessionStartTimeMillis())));
        map.put("sessionEndTimeMilliUtc", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(item.getStopTimeMillis())));
        map.put("sessionDurationMilli", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(Math.abs(item.getStopTimeMillis() - item.getMetadata().getSessionStartTimeMillis()))));
        map.put(item.getDataType().getFormatVersionTypeKey(), JsonHelpersKt.toJsonableNumber(item.getMetadata().getDataFormatVersion()));
        String str = item.getDataType().getStrValue() + "Compression";
        String compression = item.getCompression();
        map.put(str, JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(compression == null ? DevicePublicKeyStringDef.NONE : compression)));
        map.put("clientTimeMilli", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(timeProvider.getCurrentTimeMillis())));
        map.put("osVersion", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(osData.getOsVersion())));
        map.put(lllqqql.cc006300630063cc, JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(buildData.getVersionName())));
        map.put("appVersionName", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(buildData.getAppVersionName())));
        map.put("appVersionCode", JsonHelpersKt.toJsonableNumber(buildData.getAppVersionCode()));
        map.put("osType", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(osData.getOsType())));
        map.put("network", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(osData.getConnectionType())));
        map.put("chunkNum", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(item.getMetadata().getIndexInSession())));
        map.put("sdkType", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(sdkType)));
        map.put("type", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(item.getMetadata().getSessionType().getValue())));
        map.put("appBundleId", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(buildData.getBundleId())));
        map.put("deviceManufacturer", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(osData.getManufacturer())));
        Map clientMetadata = item.getClientMetadata();
        map.putAll(clientMetadata == null ? EmptyMap.d : clientMetadata);
        this.f25655a = map;
    }

    public final String toString() {
        return "StartChunkRequestBody(map=" + this.f25655a + ')';
    }
}
