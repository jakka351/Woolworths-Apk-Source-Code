package me.oriient.internal.infra.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001a\u0010\"\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u001a\u0010&\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013R\u001a\u0010(\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010\u0013R\u001a\u0010*\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013¨\u00060"}, d2 = {"Lme/oriient/internal/infra/rest/OriientApiImpl;", "Lme/oriient/internal/infra/rest/OriientApi;", "", "ipsDomain", "<init>", "(Ljava/lang/String;)V", "service", "buildUrlForService", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "buildSocketUrl", "address", "", "isWebsocketAddress", "(Ljava/lang/String;)Z", "extractDomain", "(Ljava/lang/String;)Ljava/lang/String;", "authUrl", "Ljava/lang/String;", "getAuthUrl", "()Ljava/lang/String;", "apiUrl", "getApiUrl", "realtimeUrl", "getRealtimeUrl", "trackingRestUrl", "getTrackingRestUrl", "calibrationNeededUrl", "getCalibrationNeededUrl", "sdkConfigUrl", "getSdkConfigUrl", "clientConfigUrl", "getClientConfigUrl", "usageLimitationUrl", "getUsageLimitationUrl", "mappingUrl", "getMappingUrl", "uploadingUrl", "getUploadingUrl", "locationReportingUrl", "getLocationReportingUrl", "engineUrl", "getEngineUrl", "eLogDestinationUrl", "getELogDestinationUrl", "plaiUrl", "getPlaiUrl", "Companion", "me/oriient/internal/infra/rest/c", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OriientApiImpl implements OriientApi {

    @NotNull
    private static final c Companion = new c();

    @NotNull
    private static final String DEFAULT_SERVER_PORT = ":443";

    @NotNull
    private static final String REST_HTTP = "https";

    @NotNull
    private static final String SERVER_SOCKET_PREFIX = "wss";

    @NotNull
    private static final String WSS_PREFIX = "wss://";

    @NotNull
    private static final String WS_PREFIX = "ws://";

    @NotNull
    private final String apiUrl;

    @NotNull
    private final String authUrl;

    @NotNull
    private final String calibrationNeededUrl;

    @NotNull
    private final String clientConfigUrl;

    @NotNull
    private final String eLogDestinationUrl;

    @NotNull
    private final String engineUrl;

    @NotNull
    private final String locationReportingUrl;

    @NotNull
    private final String mappingUrl;

    @NotNull
    private final String plaiUrl;

    @NotNull
    private final String realtimeUrl;

    @NotNull
    private final String sdkConfigUrl;

    @NotNull
    private final String trackingRestUrl;

    @NotNull
    private final String uploadingUrl;

    @NotNull
    private final String usageLimitationUrl;

    public OriientApiImpl(@NotNull String ipsDomain) {
        Intrinsics.h(ipsDomain, "ipsDomain");
        this.authUrl = buildUrlForService(ipsDomain, "auth");
        this.apiUrl = buildUrlForService(ipsDomain, "api");
        this.realtimeUrl = buildUrlForService(ipsDomain, "api");
        this.trackingRestUrl = buildUrlForService(ipsDomain, "upload-manager");
        this.calibrationNeededUrl = buildUrlForService(ipsDomain, "calibration");
        this.sdkConfigUrl = YU.a.o(new StringBuilder(), buildUrlForService(ipsDomain, "sdk"), "/sdk/config/combined");
        this.clientConfigUrl = YU.a.o(new StringBuilder(), buildUrlForService(ipsDomain, "sdk"), "/client/config");
        this.usageLimitationUrl = buildUrlForService(ipsDomain, "usage");
        this.mappingUrl = YU.a.o(new StringBuilder(), buildUrlForService(ipsDomain, "mapping"), "/api");
        this.uploadingUrl = buildUrlForService(ipsDomain, "upload-manager");
        this.locationReportingUrl = buildSocketUrl(ipsDomain, "events");
        this.engineUrl = buildUrlForService(ipsDomain, "engine");
        this.eLogDestinationUrl = YU.a.o(new StringBuilder(), buildUrlForService(ipsDomain, "sdklog"), "/api/log");
        this.plaiUrl = buildUrlForService(ipsDomain, "plai");
    }

    private final String buildSocketUrl(String ipsDomain, String service) {
        String strD0;
        String strZ;
        boolean zIsWebsocketAddress = isWebsocketAddress(ipsDomain);
        if (zIsWebsocketAddress) {
            strD0 = StringsKt.d0(ipsDomain, "://");
        } else {
            if (zIsWebsocketAddress) {
                throw new NoWhenBranchMatchedException();
            }
            strD0 = SERVER_SOCKET_PREFIX;
        }
        boolean zO = StringsKt.o(ipsDomain, ":", false);
        if (zO) {
            strZ = StringsKt.Z(ipsDomain, ":", ipsDomain);
        } else {
            if (zO) {
                throw new NoWhenBranchMatchedException();
            }
            strZ = DEFAULT_SERVER_PORT;
        }
        return strD0 + "://api." + extractDomain(ipsDomain) + ".oriient.me" + strZ + '/' + service;
    }

    private final String buildUrlForService(String ipsDomain, String service) {
        if (isWebsocketAddress(ipsDomain)) {
            ipsDomain = "ips.oriient.me";
        }
        return YU.a.i("https://api.", extractDomain(ipsDomain), ".oriient.me/", service);
    }

    private final String extractDomain(String ipsDomain) {
        boolean zF = new Regex("api\\.[a-zA-Z0-9_-]+\\.oriient\\.me.*").f(ipsDomain);
        if (zF) {
            return StringsKt.d0(StringsKt.Z(ipsDomain, ".", ipsDomain), ".");
        }
        if (zF) {
            throw new NoWhenBranchMatchedException();
        }
        String strQ = StringsKt.Q(StringsKt.d0(StringsKt.Z(ipsDomain, "://", ipsDomain), "."), "ips", "", false);
        int iHashCode = strQ.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 446914056) {
                if (iHashCode == 447454138 && strQ.equals("-uswest")) {
                    return "us-west";
                }
            } else if (strQ.equals("-useast")) {
                return "us";
            }
        } else if (strQ.equals("")) {
            return "eu";
        }
        return strQ;
    }

    private final boolean isWebsocketAddress(String address) {
        return StringsKt.W(address, WS_PREFIX, false) || StringsKt.W(address, WSS_PREFIX, false);
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getApiUrl() {
        return this.apiUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getAuthUrl() {
        return this.authUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getCalibrationNeededUrl() {
        return this.calibrationNeededUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getClientConfigUrl() {
        return this.clientConfigUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getELogDestinationUrl() {
        return this.eLogDestinationUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getEngineUrl() {
        return this.engineUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getLocationReportingUrl() {
        return this.locationReportingUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getMappingUrl() {
        return this.mappingUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getPlaiUrl() {
        return this.plaiUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getRealtimeUrl() {
        return this.realtimeUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getSdkConfigUrl() {
        return this.sdkConfigUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getTrackingRestUrl() {
        return this.trackingRestUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getUploadingUrl() {
        return this.uploadingUrl;
    }

    @Override // me.oriient.internal.infra.rest.OriientApi
    @NotNull
    public String getUsageLimitationUrl() {
        return this.usageLimitationUrl;
    }
}
