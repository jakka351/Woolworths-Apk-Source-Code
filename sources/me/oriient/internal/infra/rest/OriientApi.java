package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0012\u0010\u001e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005¨\u0006 "}, d2 = {"Lme/oriient/internal/infra/rest/OriientApi;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "apiUrl", "", "getApiUrl", "()Ljava/lang/String;", "authUrl", "getAuthUrl", "calibrationNeededUrl", "getCalibrationNeededUrl", "clientConfigUrl", "getClientConfigUrl", "eLogDestinationUrl", "getELogDestinationUrl", "engineUrl", "getEngineUrl", "locationReportingUrl", "getLocationReportingUrl", "mappingUrl", "getMappingUrl", "plaiUrl", "getPlaiUrl", "realtimeUrl", "getRealtimeUrl", "sdkConfigUrl", "getSdkConfigUrl", "trackingRestUrl", "getTrackingRestUrl", "uploadingUrl", "getUploadingUrl", "usageLimitationUrl", "getUsageLimitationUrl", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OriientApi extends DiProvidable {
    @NotNull
    String getApiUrl();

    @NotNull
    String getAuthUrl();

    @NotNull
    String getCalibrationNeededUrl();

    @NotNull
    String getClientConfigUrl();

    @NotNull
    String getELogDestinationUrl();

    @NotNull
    String getEngineUrl();

    @NotNull
    String getLocationReportingUrl();

    @NotNull
    String getMappingUrl();

    @NotNull
    String getPlaiUrl();

    @NotNull
    String getRealtimeUrl();

    @NotNull
    String getSdkConfigUrl();

    @NotNull
    String getTrackingRestUrl();

    @NotNull
    String getUploadingUrl();

    @NotNull
    String getUsageLimitationUrl();
}
