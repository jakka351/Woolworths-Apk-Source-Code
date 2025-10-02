package me.oriient.ipssdk.base.remoteconfig;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\bA\n\u0002\u0010\u000e\n\u0002\bK\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010+J\u0010\u00101\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010+J\u0010\u00104\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b4\u0010/J\u0010\u00105\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b5\u00102J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010+J\u0010\u00107\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b7\u00102J\u0010\u00108\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b:\u0010/J\u0010\u0010;\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b;\u00109J\u0010\u0010<\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b<\u00102J\u0010\u0010=\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b=\u00109J\u0010\u0010>\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b>\u00102J\u0010\u0010?\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b?\u00102J\u0010\u0010@\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b@\u00109J\u0010\u0010A\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bA\u0010/J\u0010\u0010B\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bB\u00109J\u0010\u0010C\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bC\u00109J\u0010\u0010D\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bD\u00102J\u0010\u0010E\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bE\u00109J\u0010\u0010F\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bF\u00102J\u0010\u0010G\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bG\u0010/J\u0010\u0010H\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bH\u00109J\u0010\u0010I\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bI\u00102J\u0010\u0010J\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bJ\u00102J\u0010\u0010K\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bK\u0010/J\u0010\u0010L\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bL\u00109J\u0010\u0010M\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bM\u0010/J\u0010\u0010N\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bN\u0010/J\u0010\u0010O\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bO\u00109Jä\u0002\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010S\u001a\u00020RHÖ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bU\u00102J\u001a\u0010W\u001a\u00020\u00062\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010Z\u001a\u0004\b]\u0010+R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010/R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010Z\u001a\u0004\bd\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u00102R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010Z\u001a\u0004\bi\u0010+R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bj\u0010a\u001a\u0004\bk\u0010/R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bl\u0010f\u001a\u0004\bm\u00102R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010Z\u001a\u0004\bo\u0010+R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bp\u0010f\u001a\u0004\bq\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u00109R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bu\u0010a\u001a\u0004\b\u0012\u0010/R\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bv\u0010s\u001a\u0004\bw\u00109R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bx\u0010f\u001a\u0004\by\u00102R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bz\u0010s\u001a\u0004\b{\u00109R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b|\u0010f\u001a\u0004\b}\u00102R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b~\u0010f\u001a\u0004\b\u007f\u00102R\u0019\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010s\u001a\u0005\b\u0081\u0001\u00109R\u0019\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010a\u001a\u0005\b\u0083\u0001\u0010/R\u0019\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010s\u001a\u0005\b\u0085\u0001\u00109R\u0019\u0010\u001b\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010s\u001a\u0005\b\u0087\u0001\u00109R\u0019\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010f\u001a\u0005\b\u0089\u0001\u00102R\u0019\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010s\u001a\u0005\b\u008b\u0001\u00109R\u0019\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010f\u001a\u0005\b\u008d\u0001\u00102R\u0019\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010a\u001a\u0005\b\u008f\u0001\u0010/R\u0019\u0010 \u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010s\u001a\u0005\b\u0091\u0001\u00109R\u0019\u0010!\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010f\u001a\u0005\b\u0093\u0001\u00102R\u0019\u0010\"\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010f\u001a\u0005\b\u0095\u0001\u00102R\u0018\u0010#\u001a\u00020\u00068\u0006¢\u0006\r\n\u0004\bs\u0010a\u001a\u0005\b\u0096\u0001\u0010/R\u0019\u0010$\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010s\u001a\u0005\b\u0098\u0001\u00109R\u0017\u0010%\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bZ\u0010a\u001a\u0004\b%\u0010/R\u0019\u0010&\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010a\u001a\u0005\b\u009a\u0001\u0010/R\u0019\u0010'\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010s\u001a\u0005\b\u009c\u0001\u00109¨\u0006\u009d\u0001"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/MiscRealtimeConfig;", "", "", "calibrationNeededCheckIntervalMinutes", "defaultBuildingsFetchRadius", "nearbyBuildingsSearchRadiusMeters", "", "requiredCalibrationOnFailedCheck", "secondsToIndicateLimitedConnection", "", "recoveryAttemptsLimit", "recoveryAttemptIntervalSec", "allowNoBarometerPositioningInMultifloor", "startPositioningRetryCount", "startPositioningRetryIntervalSec", "dataLoadingRetryRequestCount", "", "mapDataExpirationTimeMinutes", "isMapImagesPreloadingEnabled", "engineSessionFetchRetryInterval", "engineSessionFetchRetryCount", "configFetchRetryInterval", "configFetchRetryCount", "startReportingRetryCount", "startReportingRetryInterval", "allowClearAllCaches", "dontClearUploadManagerCacheLastDays", "dontClearAllELogsLastMinutes", "eventTagsMaxRetryCount", "eventTagsRetryIntervalSeconds", "eventTagsMaxTagsPerRetry", "eventTagsCachingEnabled", "deviceDataFetchTimeoutSeconds", "maxLiveNavigationRetryAttempts", "maxProximityDataRetryAttempts", "enableAutomaticPositioningDataPreloading", "dataExpirationTimeDays", "isDebugDataManagerEnabled", "enablePeriodicCacheRefreshing", "periodicCacheRefreshingTimeHours", "<init>", "(FFFZFIFZIFIDZDIDIIDZDDIDIZDIIZDZZD)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "()D", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "(FFFZFIFZIFIDZDIDIIDZDDIDIZDIIZDZZD)Lme/oriient/ipssdk/base/remoteconfig/MiscRealtimeConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getCalibrationNeededCheckIntervalMinutes", "b", "getDefaultBuildingsFetchRadius", "c", "getNearbyBuildingsSearchRadiusMeters", "d", "Z", "getRequiredCalibrationOnFailedCheck", "e", "getSecondsToIndicateLimitedConnection", "f", "I", "getRecoveryAttemptsLimit", "g", "getRecoveryAttemptIntervalSec", "h", "getAllowNoBarometerPositioningInMultifloor", "i", "getStartPositioningRetryCount", "j", "getStartPositioningRetryIntervalSec", "k", "getDataLoadingRetryRequestCount", "l", "D", "getMapDataExpirationTimeMinutes", "m", "n", "getEngineSessionFetchRetryInterval", "o", "getEngineSessionFetchRetryCount", "p", "getConfigFetchRetryInterval", "q", "getConfigFetchRetryCount", "r", "getStartReportingRetryCount", "s", "getStartReportingRetryInterval", "t", "getAllowClearAllCaches", "u", "getDontClearUploadManagerCacheLastDays", "v", "getDontClearAllELogsLastMinutes", "w", "getEventTagsMaxRetryCount", "x", "getEventTagsRetryIntervalSeconds", "y", "getEventTagsMaxTagsPerRetry", "z", "getEventTagsCachingEnabled", "A", "getDeviceDataFetchTimeoutSeconds", "B", "getMaxLiveNavigationRetryAttempts", "C", "getMaxProximityDataRetryAttempts", "getEnableAutomaticPositioningDataPreloading", "E", "getDataExpirationTimeDays", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "getEnablePeriodicCacheRefreshing", "H", "getPeriodicCacheRefreshingTimeHours", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MiscRealtimeConfig {

    /* renamed from: A, reason: from kotlin metadata */
    private final double deviceDataFetchTimeoutSeconds;

    /* renamed from: B, reason: from kotlin metadata */
    private final int maxLiveNavigationRetryAttempts;

    /* renamed from: C, reason: from kotlin metadata */
    private final int maxProximityDataRetryAttempts;

    /* renamed from: D, reason: from kotlin metadata */
    private final boolean enableAutomaticPositioningDataPreloading;

    /* renamed from: E, reason: from kotlin metadata */
    private final double dataExpirationTimeDays;

    /* renamed from: F, reason: from kotlin metadata */
    private final boolean isDebugDataManagerEnabled;

    /* renamed from: G, reason: from kotlin metadata */
    private final boolean enablePeriodicCacheRefreshing;

    /* renamed from: H, reason: from kotlin metadata */
    private final double periodicCacheRefreshingTimeHours;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float calibrationNeededCheckIntervalMinutes;

    /* renamed from: b, reason: from kotlin metadata */
    private final float defaultBuildingsFetchRadius;

    /* renamed from: c, reason: from kotlin metadata */
    private final float nearbyBuildingsSearchRadiusMeters;

    /* renamed from: d, reason: from kotlin metadata */
    private final boolean requiredCalibrationOnFailedCheck;

    /* renamed from: e, reason: from kotlin metadata */
    private final float secondsToIndicateLimitedConnection;

    /* renamed from: f, reason: from kotlin metadata */
    private final int recoveryAttemptsLimit;

    /* renamed from: g, reason: from kotlin metadata */
    private final float recoveryAttemptIntervalSec;

    /* renamed from: h, reason: from kotlin metadata */
    private final boolean allowNoBarometerPositioningInMultifloor;

    /* renamed from: i, reason: from kotlin metadata */
    private final int startPositioningRetryCount;

    /* renamed from: j, reason: from kotlin metadata */
    private final float startPositioningRetryIntervalSec;

    /* renamed from: k, reason: from kotlin metadata */
    private final int dataLoadingRetryRequestCount;

    /* renamed from: l, reason: from kotlin metadata */
    private final double mapDataExpirationTimeMinutes;

    /* renamed from: m, reason: from kotlin metadata */
    private final boolean isMapImagesPreloadingEnabled;

    /* renamed from: n, reason: from kotlin metadata */
    private final double engineSessionFetchRetryInterval;

    /* renamed from: o, reason: from kotlin metadata */
    private final int engineSessionFetchRetryCount;

    /* renamed from: p, reason: from kotlin metadata */
    private final double configFetchRetryInterval;

    /* renamed from: q, reason: from kotlin metadata */
    private final int configFetchRetryCount;

    /* renamed from: r, reason: from kotlin metadata */
    private final int startReportingRetryCount;

    /* renamed from: s, reason: from kotlin metadata */
    private final double startReportingRetryInterval;

    /* renamed from: t, reason: from kotlin metadata */
    private final boolean allowClearAllCaches;

    /* renamed from: u, reason: from kotlin metadata */
    private final double dontClearUploadManagerCacheLastDays;

    /* renamed from: v, reason: from kotlin metadata */
    private final double dontClearAllELogsLastMinutes;

    /* renamed from: w, reason: from kotlin metadata */
    private final int eventTagsMaxRetryCount;

    /* renamed from: x, reason: from kotlin metadata */
    private final double eventTagsRetryIntervalSeconds;

    /* renamed from: y, reason: from kotlin metadata */
    private final int eventTagsMaxTagsPerRetry;

    /* renamed from: z, reason: from kotlin metadata */
    private final boolean eventTagsCachingEnabled;

    public MiscRealtimeConfig(float f, float f2, float f3, boolean z, float f4, int i, float f5, boolean z2, int i2, float f6, int i3, double d, boolean z3, double d2, int i4, double d3, int i5, int i6, double d4, boolean z4, double d5, double d6, int i7, double d7, int i8, boolean z5, double d8, int i9, int i10, boolean z6, double d9, boolean z7, boolean z8, double d10) {
        this.calibrationNeededCheckIntervalMinutes = f;
        this.defaultBuildingsFetchRadius = f2;
        this.nearbyBuildingsSearchRadiusMeters = f3;
        this.requiredCalibrationOnFailedCheck = z;
        this.secondsToIndicateLimitedConnection = f4;
        this.recoveryAttemptsLimit = i;
        this.recoveryAttemptIntervalSec = f5;
        this.allowNoBarometerPositioningInMultifloor = z2;
        this.startPositioningRetryCount = i2;
        this.startPositioningRetryIntervalSec = f6;
        this.dataLoadingRetryRequestCount = i3;
        this.mapDataExpirationTimeMinutes = d;
        this.isMapImagesPreloadingEnabled = z3;
        this.engineSessionFetchRetryInterval = d2;
        this.engineSessionFetchRetryCount = i4;
        this.configFetchRetryInterval = d3;
        this.configFetchRetryCount = i5;
        this.startReportingRetryCount = i6;
        this.startReportingRetryInterval = d4;
        this.allowClearAllCaches = z4;
        this.dontClearUploadManagerCacheLastDays = d5;
        this.dontClearAllELogsLastMinutes = d6;
        this.eventTagsMaxRetryCount = i7;
        this.eventTagsRetryIntervalSeconds = d7;
        this.eventTagsMaxTagsPerRetry = i8;
        this.eventTagsCachingEnabled = z5;
        this.deviceDataFetchTimeoutSeconds = d8;
        this.maxLiveNavigationRetryAttempts = i9;
        this.maxProximityDataRetryAttempts = i10;
        this.enableAutomaticPositioningDataPreloading = z6;
        this.dataExpirationTimeDays = d9;
        this.isDebugDataManagerEnabled = z7;
        this.enablePeriodicCacheRefreshing = z8;
        this.periodicCacheRefreshingTimeHours = d10;
    }

    public static /* synthetic */ MiscRealtimeConfig copy$default(MiscRealtimeConfig miscRealtimeConfig, float f, float f2, float f3, boolean z, float f4, int i, float f5, boolean z2, int i2, float f6, int i3, double d, boolean z3, double d2, int i4, double d3, int i5, int i6, double d4, boolean z4, double d5, double d6, int i7, double d7, int i8, boolean z5, double d8, int i9, int i10, boolean z6, double d9, boolean z7, boolean z8, double d10, int i11, int i12, Object obj) {
        double d11;
        boolean z9;
        boolean z10;
        double d12;
        int i13;
        double d13;
        int i14;
        boolean z11;
        double d14;
        int i15;
        int i16;
        boolean z12;
        double d15;
        int i17;
        boolean z13;
        double d16;
        int i18;
        double d17;
        int i19;
        double d18;
        boolean z14;
        double d19;
        float f7;
        boolean z15;
        float f8;
        int i20;
        float f9;
        boolean z16;
        int i21;
        float f10;
        int i22;
        double d20;
        float f11 = (i11 & 1) != 0 ? miscRealtimeConfig.calibrationNeededCheckIntervalMinutes : f;
        float f12 = (i11 & 2) != 0 ? miscRealtimeConfig.defaultBuildingsFetchRadius : f2;
        float f13 = (i11 & 4) != 0 ? miscRealtimeConfig.nearbyBuildingsSearchRadiusMeters : f3;
        boolean z17 = (i11 & 8) != 0 ? miscRealtimeConfig.requiredCalibrationOnFailedCheck : z;
        float f14 = (i11 & 16) != 0 ? miscRealtimeConfig.secondsToIndicateLimitedConnection : f4;
        int i23 = (i11 & 32) != 0 ? miscRealtimeConfig.recoveryAttemptsLimit : i;
        float f15 = (i11 & 64) != 0 ? miscRealtimeConfig.recoveryAttemptIntervalSec : f5;
        boolean z18 = (i11 & 128) != 0 ? miscRealtimeConfig.allowNoBarometerPositioningInMultifloor : z2;
        int i24 = (i11 & 256) != 0 ? miscRealtimeConfig.startPositioningRetryCount : i2;
        float f16 = (i11 & 512) != 0 ? miscRealtimeConfig.startPositioningRetryIntervalSec : f6;
        int i25 = (i11 & 1024) != 0 ? miscRealtimeConfig.dataLoadingRetryRequestCount : i3;
        double d21 = (i11 & 2048) != 0 ? miscRealtimeConfig.mapDataExpirationTimeMinutes : d;
        boolean z19 = (i11 & 4096) != 0 ? miscRealtimeConfig.isMapImagesPreloadingEnabled : z3;
        float f17 = f11;
        float f18 = f12;
        double d22 = (i11 & 8192) != 0 ? miscRealtimeConfig.engineSessionFetchRetryInterval : d2;
        int i26 = (i11 & 16384) != 0 ? miscRealtimeConfig.engineSessionFetchRetryCount : i4;
        double d23 = (32768 & i11) != 0 ? miscRealtimeConfig.configFetchRetryInterval : d3;
        int i27 = (i11 & 65536) != 0 ? miscRealtimeConfig.configFetchRetryCount : i5;
        double d24 = d23;
        int i28 = (i11 & 131072) != 0 ? miscRealtimeConfig.startReportingRetryCount : i6;
        double d25 = (i11 & 262144) != 0 ? miscRealtimeConfig.startReportingRetryInterval : d4;
        boolean z20 = (i11 & 524288) != 0 ? miscRealtimeConfig.allowClearAllCaches : z4;
        double d26 = (i11 & 1048576) != 0 ? miscRealtimeConfig.dontClearUploadManagerCacheLastDays : d5;
        double d27 = (i11 & 2097152) != 0 ? miscRealtimeConfig.dontClearAllELogsLastMinutes : d6;
        int i29 = (i11 & 4194304) != 0 ? miscRealtimeConfig.eventTagsMaxRetryCount : i7;
        double d28 = (i11 & 8388608) != 0 ? miscRealtimeConfig.eventTagsRetryIntervalSeconds : d7;
        int i30 = (i11 & 16777216) != 0 ? miscRealtimeConfig.eventTagsMaxTagsPerRetry : i8;
        boolean z21 = (i11 & 33554432) != 0 ? miscRealtimeConfig.eventTagsCachingEnabled : z5;
        double d29 = (i11 & 67108864) != 0 ? miscRealtimeConfig.deviceDataFetchTimeoutSeconds : d8;
        int i31 = (i11 & 134217728) != 0 ? miscRealtimeConfig.maxLiveNavigationRetryAttempts : i9;
        int i32 = (i11 & 268435456) != 0 ? miscRealtimeConfig.maxProximityDataRetryAttempts : i10;
        int i33 = i31;
        boolean z22 = (i11 & 536870912) != 0 ? miscRealtimeConfig.enableAutomaticPositioningDataPreloading : z6;
        int i34 = i32;
        double d30 = (i11 & 1073741824) != 0 ? miscRealtimeConfig.dataExpirationTimeDays : d9;
        boolean z23 = (i11 & Integer.MIN_VALUE) != 0 ? miscRealtimeConfig.isDebugDataManagerEnabled : z7;
        boolean z24 = (i12 & 1) != 0 ? miscRealtimeConfig.enablePeriodicCacheRefreshing : z8;
        if ((i12 & 2) != 0) {
            z9 = z23;
            z10 = z24;
            d11 = miscRealtimeConfig.periodicCacheRefreshingTimeHours;
            i13 = i29;
            d13 = d28;
            i14 = i30;
            z11 = z21;
            d14 = d29;
            i15 = i33;
            i16 = i34;
            z12 = z22;
            d15 = d30;
            i17 = i27;
            d16 = d22;
            i18 = i26;
            d17 = d24;
            i19 = i28;
            d18 = d25;
            z14 = z20;
            d19 = d26;
            d12 = d27;
            f7 = f13;
            z15 = z17;
            f8 = f14;
            i20 = i23;
            f9 = f15;
            z16 = z18;
            i21 = i24;
            f10 = f16;
            i22 = i25;
            d20 = d21;
            z13 = z19;
        } else {
            d11 = d10;
            z9 = z23;
            z10 = z24;
            d12 = d27;
            i13 = i29;
            d13 = d28;
            i14 = i30;
            z11 = z21;
            d14 = d29;
            i15 = i33;
            i16 = i34;
            z12 = z22;
            d15 = d30;
            i17 = i27;
            z13 = z19;
            d16 = d22;
            i18 = i26;
            d17 = d24;
            i19 = i28;
            d18 = d25;
            z14 = z20;
            d19 = d26;
            f7 = f13;
            z15 = z17;
            f8 = f14;
            i20 = i23;
            f9 = f15;
            z16 = z18;
            i21 = i24;
            f10 = f16;
            i22 = i25;
            d20 = d21;
        }
        return miscRealtimeConfig.copy(f17, f18, f7, z15, f8, i20, f9, z16, i21, f10, i22, d20, z13, d16, i18, d17, i17, i19, d18, z14, d19, d12, i13, d13, i14, z11, d14, i15, i16, z12, d15, z9, z10, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCalibrationNeededCheckIntervalMinutes() {
        return this.calibrationNeededCheckIntervalMinutes;
    }

    /* renamed from: component10, reason: from getter */
    public final float getStartPositioningRetryIntervalSec() {
        return this.startPositioningRetryIntervalSec;
    }

    /* renamed from: component11, reason: from getter */
    public final int getDataLoadingRetryRequestCount() {
        return this.dataLoadingRetryRequestCount;
    }

    /* renamed from: component12, reason: from getter */
    public final double getMapDataExpirationTimeMinutes() {
        return this.mapDataExpirationTimeMinutes;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsMapImagesPreloadingEnabled() {
        return this.isMapImagesPreloadingEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final double getEngineSessionFetchRetryInterval() {
        return this.engineSessionFetchRetryInterval;
    }

    /* renamed from: component15, reason: from getter */
    public final int getEngineSessionFetchRetryCount() {
        return this.engineSessionFetchRetryCount;
    }

    /* renamed from: component16, reason: from getter */
    public final double getConfigFetchRetryInterval() {
        return this.configFetchRetryInterval;
    }

    /* renamed from: component17, reason: from getter */
    public final int getConfigFetchRetryCount() {
        return this.configFetchRetryCount;
    }

    /* renamed from: component18, reason: from getter */
    public final int getStartReportingRetryCount() {
        return this.startReportingRetryCount;
    }

    /* renamed from: component19, reason: from getter */
    public final double getStartReportingRetryInterval() {
        return this.startReportingRetryInterval;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDefaultBuildingsFetchRadius() {
        return this.defaultBuildingsFetchRadius;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getAllowClearAllCaches() {
        return this.allowClearAllCaches;
    }

    /* renamed from: component21, reason: from getter */
    public final double getDontClearUploadManagerCacheLastDays() {
        return this.dontClearUploadManagerCacheLastDays;
    }

    /* renamed from: component22, reason: from getter */
    public final double getDontClearAllELogsLastMinutes() {
        return this.dontClearAllELogsLastMinutes;
    }

    /* renamed from: component23, reason: from getter */
    public final int getEventTagsMaxRetryCount() {
        return this.eventTagsMaxRetryCount;
    }

    /* renamed from: component24, reason: from getter */
    public final double getEventTagsRetryIntervalSeconds() {
        return this.eventTagsRetryIntervalSeconds;
    }

    /* renamed from: component25, reason: from getter */
    public final int getEventTagsMaxTagsPerRetry() {
        return this.eventTagsMaxTagsPerRetry;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getEventTagsCachingEnabled() {
        return this.eventTagsCachingEnabled;
    }

    /* renamed from: component27, reason: from getter */
    public final double getDeviceDataFetchTimeoutSeconds() {
        return this.deviceDataFetchTimeoutSeconds;
    }

    /* renamed from: component28, reason: from getter */
    public final int getMaxLiveNavigationRetryAttempts() {
        return this.maxLiveNavigationRetryAttempts;
    }

    /* renamed from: component29, reason: from getter */
    public final int getMaxProximityDataRetryAttempts() {
        return this.maxProximityDataRetryAttempts;
    }

    /* renamed from: component3, reason: from getter */
    public final float getNearbyBuildingsSearchRadiusMeters() {
        return this.nearbyBuildingsSearchRadiusMeters;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getEnableAutomaticPositioningDataPreloading() {
        return this.enableAutomaticPositioningDataPreloading;
    }

    /* renamed from: component31, reason: from getter */
    public final double getDataExpirationTimeDays() {
        return this.dataExpirationTimeDays;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsDebugDataManagerEnabled() {
        return this.isDebugDataManagerEnabled;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getEnablePeriodicCacheRefreshing() {
        return this.enablePeriodicCacheRefreshing;
    }

    /* renamed from: component34, reason: from getter */
    public final double getPeriodicCacheRefreshingTimeHours() {
        return this.periodicCacheRefreshingTimeHours;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRequiredCalibrationOnFailedCheck() {
        return this.requiredCalibrationOnFailedCheck;
    }

    /* renamed from: component5, reason: from getter */
    public final float getSecondsToIndicateLimitedConnection() {
        return this.secondsToIndicateLimitedConnection;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRecoveryAttemptsLimit() {
        return this.recoveryAttemptsLimit;
    }

    /* renamed from: component7, reason: from getter */
    public final float getRecoveryAttemptIntervalSec() {
        return this.recoveryAttemptIntervalSec;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getAllowNoBarometerPositioningInMultifloor() {
        return this.allowNoBarometerPositioningInMultifloor;
    }

    /* renamed from: component9, reason: from getter */
    public final int getStartPositioningRetryCount() {
        return this.startPositioningRetryCount;
    }

    @NotNull
    public final MiscRealtimeConfig copy(float calibrationNeededCheckIntervalMinutes, float defaultBuildingsFetchRadius, float nearbyBuildingsSearchRadiusMeters, boolean requiredCalibrationOnFailedCheck, float secondsToIndicateLimitedConnection, int recoveryAttemptsLimit, float recoveryAttemptIntervalSec, boolean allowNoBarometerPositioningInMultifloor, int startPositioningRetryCount, float startPositioningRetryIntervalSec, int dataLoadingRetryRequestCount, double mapDataExpirationTimeMinutes, boolean isMapImagesPreloadingEnabled, double engineSessionFetchRetryInterval, int engineSessionFetchRetryCount, double configFetchRetryInterval, int configFetchRetryCount, int startReportingRetryCount, double startReportingRetryInterval, boolean allowClearAllCaches, double dontClearUploadManagerCacheLastDays, double dontClearAllELogsLastMinutes, int eventTagsMaxRetryCount, double eventTagsRetryIntervalSeconds, int eventTagsMaxTagsPerRetry, boolean eventTagsCachingEnabled, double deviceDataFetchTimeoutSeconds, int maxLiveNavigationRetryAttempts, int maxProximityDataRetryAttempts, boolean enableAutomaticPositioningDataPreloading, double dataExpirationTimeDays, boolean isDebugDataManagerEnabled, boolean enablePeriodicCacheRefreshing, double periodicCacheRefreshingTimeHours) {
        return new MiscRealtimeConfig(calibrationNeededCheckIntervalMinutes, defaultBuildingsFetchRadius, nearbyBuildingsSearchRadiusMeters, requiredCalibrationOnFailedCheck, secondsToIndicateLimitedConnection, recoveryAttemptsLimit, recoveryAttemptIntervalSec, allowNoBarometerPositioningInMultifloor, startPositioningRetryCount, startPositioningRetryIntervalSec, dataLoadingRetryRequestCount, mapDataExpirationTimeMinutes, isMapImagesPreloadingEnabled, engineSessionFetchRetryInterval, engineSessionFetchRetryCount, configFetchRetryInterval, configFetchRetryCount, startReportingRetryCount, startReportingRetryInterval, allowClearAllCaches, dontClearUploadManagerCacheLastDays, dontClearAllELogsLastMinutes, eventTagsMaxRetryCount, eventTagsRetryIntervalSeconds, eventTagsMaxTagsPerRetry, eventTagsCachingEnabled, deviceDataFetchTimeoutSeconds, maxLiveNavigationRetryAttempts, maxProximityDataRetryAttempts, enableAutomaticPositioningDataPreloading, dataExpirationTimeDays, isDebugDataManagerEnabled, enablePeriodicCacheRefreshing, periodicCacheRefreshingTimeHours);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiscRealtimeConfig)) {
            return false;
        }
        MiscRealtimeConfig miscRealtimeConfig = (MiscRealtimeConfig) other;
        return Float.compare(this.calibrationNeededCheckIntervalMinutes, miscRealtimeConfig.calibrationNeededCheckIntervalMinutes) == 0 && Float.compare(this.defaultBuildingsFetchRadius, miscRealtimeConfig.defaultBuildingsFetchRadius) == 0 && Float.compare(this.nearbyBuildingsSearchRadiusMeters, miscRealtimeConfig.nearbyBuildingsSearchRadiusMeters) == 0 && this.requiredCalibrationOnFailedCheck == miscRealtimeConfig.requiredCalibrationOnFailedCheck && Float.compare(this.secondsToIndicateLimitedConnection, miscRealtimeConfig.secondsToIndicateLimitedConnection) == 0 && this.recoveryAttemptsLimit == miscRealtimeConfig.recoveryAttemptsLimit && Float.compare(this.recoveryAttemptIntervalSec, miscRealtimeConfig.recoveryAttemptIntervalSec) == 0 && this.allowNoBarometerPositioningInMultifloor == miscRealtimeConfig.allowNoBarometerPositioningInMultifloor && this.startPositioningRetryCount == miscRealtimeConfig.startPositioningRetryCount && Float.compare(this.startPositioningRetryIntervalSec, miscRealtimeConfig.startPositioningRetryIntervalSec) == 0 && this.dataLoadingRetryRequestCount == miscRealtimeConfig.dataLoadingRetryRequestCount && Double.compare(this.mapDataExpirationTimeMinutes, miscRealtimeConfig.mapDataExpirationTimeMinutes) == 0 && this.isMapImagesPreloadingEnabled == miscRealtimeConfig.isMapImagesPreloadingEnabled && Double.compare(this.engineSessionFetchRetryInterval, miscRealtimeConfig.engineSessionFetchRetryInterval) == 0 && this.engineSessionFetchRetryCount == miscRealtimeConfig.engineSessionFetchRetryCount && Double.compare(this.configFetchRetryInterval, miscRealtimeConfig.configFetchRetryInterval) == 0 && this.configFetchRetryCount == miscRealtimeConfig.configFetchRetryCount && this.startReportingRetryCount == miscRealtimeConfig.startReportingRetryCount && Double.compare(this.startReportingRetryInterval, miscRealtimeConfig.startReportingRetryInterval) == 0 && this.allowClearAllCaches == miscRealtimeConfig.allowClearAllCaches && Double.compare(this.dontClearUploadManagerCacheLastDays, miscRealtimeConfig.dontClearUploadManagerCacheLastDays) == 0 && Double.compare(this.dontClearAllELogsLastMinutes, miscRealtimeConfig.dontClearAllELogsLastMinutes) == 0 && this.eventTagsMaxRetryCount == miscRealtimeConfig.eventTagsMaxRetryCount && Double.compare(this.eventTagsRetryIntervalSeconds, miscRealtimeConfig.eventTagsRetryIntervalSeconds) == 0 && this.eventTagsMaxTagsPerRetry == miscRealtimeConfig.eventTagsMaxTagsPerRetry && this.eventTagsCachingEnabled == miscRealtimeConfig.eventTagsCachingEnabled && Double.compare(this.deviceDataFetchTimeoutSeconds, miscRealtimeConfig.deviceDataFetchTimeoutSeconds) == 0 && this.maxLiveNavigationRetryAttempts == miscRealtimeConfig.maxLiveNavigationRetryAttempts && this.maxProximityDataRetryAttempts == miscRealtimeConfig.maxProximityDataRetryAttempts && this.enableAutomaticPositioningDataPreloading == miscRealtimeConfig.enableAutomaticPositioningDataPreloading && Double.compare(this.dataExpirationTimeDays, miscRealtimeConfig.dataExpirationTimeDays) == 0 && this.isDebugDataManagerEnabled == miscRealtimeConfig.isDebugDataManagerEnabled && this.enablePeriodicCacheRefreshing == miscRealtimeConfig.enablePeriodicCacheRefreshing && Double.compare(this.periodicCacheRefreshingTimeHours, miscRealtimeConfig.periodicCacheRefreshingTimeHours) == 0;
    }

    public final boolean getAllowClearAllCaches() {
        return this.allowClearAllCaches;
    }

    public final boolean getAllowNoBarometerPositioningInMultifloor() {
        return this.allowNoBarometerPositioningInMultifloor;
    }

    public final float getCalibrationNeededCheckIntervalMinutes() {
        return this.calibrationNeededCheckIntervalMinutes;
    }

    public final int getConfigFetchRetryCount() {
        return this.configFetchRetryCount;
    }

    public final double getConfigFetchRetryInterval() {
        return this.configFetchRetryInterval;
    }

    public final double getDataExpirationTimeDays() {
        return this.dataExpirationTimeDays;
    }

    public final int getDataLoadingRetryRequestCount() {
        return this.dataLoadingRetryRequestCount;
    }

    public final float getDefaultBuildingsFetchRadius() {
        return this.defaultBuildingsFetchRadius;
    }

    public final double getDeviceDataFetchTimeoutSeconds() {
        return this.deviceDataFetchTimeoutSeconds;
    }

    public final double getDontClearAllELogsLastMinutes() {
        return this.dontClearAllELogsLastMinutes;
    }

    public final double getDontClearUploadManagerCacheLastDays() {
        return this.dontClearUploadManagerCacheLastDays;
    }

    public final boolean getEnableAutomaticPositioningDataPreloading() {
        return this.enableAutomaticPositioningDataPreloading;
    }

    public final boolean getEnablePeriodicCacheRefreshing() {
        return this.enablePeriodicCacheRefreshing;
    }

    public final int getEngineSessionFetchRetryCount() {
        return this.engineSessionFetchRetryCount;
    }

    public final double getEngineSessionFetchRetryInterval() {
        return this.engineSessionFetchRetryInterval;
    }

    public final boolean getEventTagsCachingEnabled() {
        return this.eventTagsCachingEnabled;
    }

    public final int getEventTagsMaxRetryCount() {
        return this.eventTagsMaxRetryCount;
    }

    public final int getEventTagsMaxTagsPerRetry() {
        return this.eventTagsMaxTagsPerRetry;
    }

    public final double getEventTagsRetryIntervalSeconds() {
        return this.eventTagsRetryIntervalSeconds;
    }

    public final double getMapDataExpirationTimeMinutes() {
        return this.mapDataExpirationTimeMinutes;
    }

    public final int getMaxLiveNavigationRetryAttempts() {
        return this.maxLiveNavigationRetryAttempts;
    }

    public final int getMaxProximityDataRetryAttempts() {
        return this.maxProximityDataRetryAttempts;
    }

    public final float getNearbyBuildingsSearchRadiusMeters() {
        return this.nearbyBuildingsSearchRadiusMeters;
    }

    public final double getPeriodicCacheRefreshingTimeHours() {
        return this.periodicCacheRefreshingTimeHours;
    }

    public final float getRecoveryAttemptIntervalSec() {
        return this.recoveryAttemptIntervalSec;
    }

    public final int getRecoveryAttemptsLimit() {
        return this.recoveryAttemptsLimit;
    }

    public final boolean getRequiredCalibrationOnFailedCheck() {
        return this.requiredCalibrationOnFailedCheck;
    }

    public final float getSecondsToIndicateLimitedConnection() {
        return this.secondsToIndicateLimitedConnection;
    }

    public final int getStartPositioningRetryCount() {
        return this.startPositioningRetryCount;
    }

    public final float getStartPositioningRetryIntervalSec() {
        return this.startPositioningRetryIntervalSec;
    }

    public final int getStartReportingRetryCount() {
        return this.startReportingRetryCount;
    }

    public final double getStartReportingRetryInterval() {
        return this.startReportingRetryInterval;
    }

    public int hashCode() {
        return Double.hashCode(this.periodicCacheRefreshingTimeHours) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(android.support.v4.media.session.a.a(this.dataExpirationTimeDays, androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.a(this.maxProximityDataRetryAttempts, androidx.camera.core.impl.b.a(this.maxLiveNavigationRetryAttempts, android.support.v4.media.session.a.a(this.deviceDataFetchTimeoutSeconds, androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.a(this.eventTagsMaxTagsPerRetry, android.support.v4.media.session.a.a(this.eventTagsRetryIntervalSeconds, androidx.camera.core.impl.b.a(this.eventTagsMaxRetryCount, android.support.v4.media.session.a.a(this.dontClearAllELogsLastMinutes, android.support.v4.media.session.a.a(this.dontClearUploadManagerCacheLastDays, androidx.camera.core.impl.b.e(android.support.v4.media.session.a.a(this.startReportingRetryInterval, androidx.camera.core.impl.b.a(this.startReportingRetryCount, androidx.camera.core.impl.b.a(this.configFetchRetryCount, android.support.v4.media.session.a.a(this.configFetchRetryInterval, androidx.camera.core.impl.b.a(this.engineSessionFetchRetryCount, android.support.v4.media.session.a.a(this.engineSessionFetchRetryInterval, androidx.camera.core.impl.b.e(android.support.v4.media.session.a.a(this.mapDataExpirationTimeMinutes, androidx.camera.core.impl.b.a(this.dataLoadingRetryRequestCount, android.support.v4.media.session.a.b(this.startPositioningRetryIntervalSec, androidx.camera.core.impl.b.a(this.startPositioningRetryCount, androidx.camera.core.impl.b.e(android.support.v4.media.session.a.b(this.recoveryAttemptIntervalSec, androidx.camera.core.impl.b.a(this.recoveryAttemptsLimit, android.support.v4.media.session.a.b(this.secondsToIndicateLimitedConnection, androidx.camera.core.impl.b.e(android.support.v4.media.session.a.b(this.nearbyBuildingsSearchRadiusMeters, android.support.v4.media.session.a.b(this.defaultBuildingsFetchRadius, Float.hashCode(this.calibrationNeededCheckIntervalMinutes) * 31, 31), 31), 31, this.requiredCalibrationOnFailedCheck), 31), 31), 31), 31, this.allowNoBarometerPositioningInMultifloor), 31), 31), 31), 31), 31, this.isMapImagesPreloadingEnabled), 31), 31), 31), 31), 31), 31), 31, this.allowClearAllCaches), 31), 31), 31), 31), 31), 31, this.eventTagsCachingEnabled), 31), 31), 31), 31, this.enableAutomaticPositioningDataPreloading), 31), 31, this.isDebugDataManagerEnabled), 31, this.enablePeriodicCacheRefreshing);
    }

    public final boolean isDebugDataManagerEnabled() {
        return this.isDebugDataManagerEnabled;
    }

    public final boolean isMapImagesPreloadingEnabled() {
        return this.isMapImagesPreloadingEnabled;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MiscRealtimeConfig(calibrationNeededCheckIntervalMinutes=");
        sb.append(this.calibrationNeededCheckIntervalMinutes);
        sb.append(", defaultBuildingsFetchRadius=");
        sb.append(this.defaultBuildingsFetchRadius);
        sb.append(", nearbyBuildingsSearchRadiusMeters=");
        sb.append(this.nearbyBuildingsSearchRadiusMeters);
        sb.append(", requiredCalibrationOnFailedCheck=");
        sb.append(this.requiredCalibrationOnFailedCheck);
        sb.append(", secondsToIndicateLimitedConnection=");
        sb.append(this.secondsToIndicateLimitedConnection);
        sb.append(", recoveryAttemptsLimit=");
        sb.append(this.recoveryAttemptsLimit);
        sb.append(", recoveryAttemptIntervalSec=");
        sb.append(this.recoveryAttemptIntervalSec);
        sb.append(", allowNoBarometerPositioningInMultifloor=");
        sb.append(this.allowNoBarometerPositioningInMultifloor);
        sb.append(", startPositioningRetryCount=");
        sb.append(this.startPositioningRetryCount);
        sb.append(", startPositioningRetryIntervalSec=");
        sb.append(this.startPositioningRetryIntervalSec);
        sb.append(", dataLoadingRetryRequestCount=");
        sb.append(this.dataLoadingRetryRequestCount);
        sb.append(", mapDataExpirationTimeMinutes=");
        sb.append(this.mapDataExpirationTimeMinutes);
        sb.append(", isMapImagesPreloadingEnabled=");
        sb.append(this.isMapImagesPreloadingEnabled);
        sb.append(", engineSessionFetchRetryInterval=");
        sb.append(this.engineSessionFetchRetryInterval);
        sb.append(", engineSessionFetchRetryCount=");
        sb.append(this.engineSessionFetchRetryCount);
        sb.append(", configFetchRetryInterval=");
        sb.append(this.configFetchRetryInterval);
        sb.append(", configFetchRetryCount=");
        sb.append(this.configFetchRetryCount);
        sb.append(", startReportingRetryCount=");
        sb.append(this.startReportingRetryCount);
        sb.append(", startReportingRetryInterval=");
        sb.append(this.startReportingRetryInterval);
        sb.append(", allowClearAllCaches=");
        sb.append(this.allowClearAllCaches);
        sb.append(", dontClearUploadManagerCacheLastDays=");
        sb.append(this.dontClearUploadManagerCacheLastDays);
        sb.append(", dontClearAllELogsLastMinutes=");
        sb.append(this.dontClearAllELogsLastMinutes);
        sb.append(", eventTagsMaxRetryCount=");
        sb.append(this.eventTagsMaxRetryCount);
        sb.append(", eventTagsRetryIntervalSeconds=");
        sb.append(this.eventTagsRetryIntervalSeconds);
        sb.append(", eventTagsMaxTagsPerRetry=");
        sb.append(this.eventTagsMaxTagsPerRetry);
        sb.append(", eventTagsCachingEnabled=");
        sb.append(this.eventTagsCachingEnabled);
        sb.append(", deviceDataFetchTimeoutSeconds=");
        sb.append(this.deviceDataFetchTimeoutSeconds);
        sb.append(", maxLiveNavigationRetryAttempts=");
        sb.append(this.maxLiveNavigationRetryAttempts);
        sb.append(", maxProximityDataRetryAttempts=");
        sb.append(this.maxProximityDataRetryAttempts);
        sb.append(", enableAutomaticPositioningDataPreloading=");
        sb.append(this.enableAutomaticPositioningDataPreloading);
        sb.append(", dataExpirationTimeDays=");
        sb.append(this.dataExpirationTimeDays);
        sb.append(", isDebugDataManagerEnabled=");
        sb.append(this.isDebugDataManagerEnabled);
        sb.append(", enablePeriodicCacheRefreshing=");
        sb.append(this.enablePeriodicCacheRefreshing);
        sb.append(", periodicCacheRefreshingTimeHours=");
        return androidx.camera.core.impl.b.p(sb, this.periodicCacheRefreshingTimeHours, ')');
    }
}
