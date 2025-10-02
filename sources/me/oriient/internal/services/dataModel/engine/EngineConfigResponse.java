package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002]^BÙ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eBé\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001fJ\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'Jò\u0001\u0010K\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\t2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020\u0003HÖ\u0001J\u0010\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020SJ\t\u0010T\u001a\u00020\u0006HÖ\u0001J&\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[HÁ\u0001¢\u0006\u0002\b\\R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0018\u0010$R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u000e\u0010$R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b.\u0010*R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b/\u0010*R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b0\u0010'R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b1\u0010*R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b2\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b5\u0010'R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b6\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006_"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/EngineConfigResponse;", "", "seen1", "", "buildingIds", "", "", "customConfigs", "enableLocationReporting", "", "locationReportingIntervalSeconds", "", "locationReportingTimeoutSeconds", "locationReportingTimeoutsToFail", "isSmartCartMode", "modelFetchRetryInterval", "modelFetchRetryCount", "engineSessionFetchRetryCount", "engineSessionFetchRetryInterval", "engineSessionRefreshIntervalBeforeExpirationSeconds", "mainOrientationCalculator", "Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse;", "onDevice", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse;", "isPositioningDebuggingEnabled", "locationReportingQueueLimit", "locationReportingConnectionRetryInitialInterval", "locationReportingConnectionRetryMaxInterval", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getBuildingIds", "()Ljava/util/List;", "getCustomConfigs", "getEnableLocationReporting", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEngineSessionFetchRetryCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEngineSessionFetchRetryInterval", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEngineSessionRefreshIntervalBeforeExpirationSeconds", "getLocationReportingConnectionRetryInitialInterval", "getLocationReportingConnectionRetryMaxInterval", "getLocationReportingIntervalSeconds", "getLocationReportingQueueLimit", "getLocationReportingTimeoutSeconds", "getLocationReportingTimeoutsToFail", "getMainOrientationCalculator", "()Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse;", "getModelFetchRetryCount", "getModelFetchRetryInterval", "getOnDevice", "()Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lme/oriient/internal/services/dataModel/engine/EngineConfigResponse;", "equals", "other", "hashCode", "toEngineConfig", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "extraEngineConfig", "Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class EngineConfigResponse {

    @Nullable
    private final List<String> buildingIds;

    @Nullable
    private final List<EngineConfigResponse> customConfigs;

    @Nullable
    private final Boolean enableLocationReporting;

    @Nullable
    private final Integer engineSessionFetchRetryCount;

    @Nullable
    private final Double engineSessionFetchRetryInterval;

    @Nullable
    private final Double engineSessionRefreshIntervalBeforeExpirationSeconds;

    @Nullable
    private final Boolean isPositioningDebuggingEnabled;

    @Nullable
    private final Boolean isSmartCartMode;

    @Nullable
    private final Double locationReportingConnectionRetryInitialInterval;

    @Nullable
    private final Double locationReportingConnectionRetryMaxInterval;

    @Nullable
    private final Double locationReportingIntervalSeconds;

    @Nullable
    private final Integer locationReportingQueueLimit;

    @Nullable
    private final Double locationReportingTimeoutSeconds;

    @Nullable
    private final Integer locationReportingTimeoutsToFail;

    @Nullable
    private final MainOrientationCalculatorConfigResponse mainOrientationCalculator;

    @Nullable
    private final Integer modelFetchRetryCount;

    @Nullable
    private final Double modelFetchRetryInterval;

    @Nullable
    private final OnDeviceEngineConfigResponse onDevice;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.f24821a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/EngineConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/EngineConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<EngineConfigResponse> serializer() {
            return EngineConfigResponse$$serializer.INSTANCE;
        }
    }

    public EngineConfigResponse() {
        this((List) null, (List) null, (Boolean) null, (Double) null, (Double) null, (Integer) null, (Boolean) null, (Double) null, (Integer) null, (Integer) null, (Double) null, (Double) null, (MainOrientationCalculatorConfigResponse) null, (OnDeviceEngineConfigResponse) null, (Boolean) null, (Integer) null, (Double) null, (Double) null, 262143, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ EngineConfigResponse copy$default(EngineConfigResponse engineConfigResponse, List list, List list2, Boolean bool, Double d, Double d2, Integer num, Boolean bool2, Double d3, Integer num2, Integer num3, Double d4, Double d5, MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse, OnDeviceEngineConfigResponse onDeviceEngineConfigResponse, Boolean bool3, Integer num4, Double d6, Double d7, int i, Object obj) {
        Double d8;
        Double d9;
        List list3 = (i & 1) != 0 ? engineConfigResponse.buildingIds : list;
        List list4 = (i & 2) != 0 ? engineConfigResponse.customConfigs : list2;
        Boolean bool4 = (i & 4) != 0 ? engineConfigResponse.enableLocationReporting : bool;
        Double d10 = (i & 8) != 0 ? engineConfigResponse.locationReportingIntervalSeconds : d;
        Double d11 = (i & 16) != 0 ? engineConfigResponse.locationReportingTimeoutSeconds : d2;
        Integer num5 = (i & 32) != 0 ? engineConfigResponse.locationReportingTimeoutsToFail : num;
        Boolean bool5 = (i & 64) != 0 ? engineConfigResponse.isSmartCartMode : bool2;
        Double d12 = (i & 128) != 0 ? engineConfigResponse.modelFetchRetryInterval : d3;
        Integer num6 = (i & 256) != 0 ? engineConfigResponse.modelFetchRetryCount : num2;
        Integer num7 = (i & 512) != 0 ? engineConfigResponse.engineSessionFetchRetryCount : num3;
        Double d13 = (i & 1024) != 0 ? engineConfigResponse.engineSessionFetchRetryInterval : d4;
        Double d14 = (i & 2048) != 0 ? engineConfigResponse.engineSessionRefreshIntervalBeforeExpirationSeconds : d5;
        MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse2 = (i & 4096) != 0 ? engineConfigResponse.mainOrientationCalculator : mainOrientationCalculatorConfigResponse;
        OnDeviceEngineConfigResponse onDeviceEngineConfigResponse2 = (i & 8192) != 0 ? engineConfigResponse.onDevice : onDeviceEngineConfigResponse;
        List list5 = list3;
        Boolean bool6 = (i & 16384) != 0 ? engineConfigResponse.isPositioningDebuggingEnabled : bool3;
        Integer num8 = (i & 32768) != 0 ? engineConfigResponse.locationReportingQueueLimit : num4;
        Double d15 = (i & 65536) != 0 ? engineConfigResponse.locationReportingConnectionRetryInitialInterval : d6;
        if ((i & 131072) != 0) {
            d9 = d15;
            d8 = engineConfigResponse.locationReportingConnectionRetryMaxInterval;
        } else {
            d8 = d7;
            d9 = d15;
        }
        return engineConfigResponse.copy(list5, list4, bool4, d10, d11, num5, bool5, d12, num6, num7, d13, d14, mainOrientationCalculatorConfigResponse2, onDeviceEngineConfigResponse2, bool6, num8, d9, d8);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(EngineConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.buildingIds != null) {
            output.w(serialDesc, 0, kSerializerArr[0], self.buildingIds);
        }
        if (output.q(serialDesc, 1) || self.customConfigs != null) {
            output.w(serialDesc, 1, new ArrayListSerializer(EngineConfigResponse$$serializer.INSTANCE), self.customConfigs);
        }
        if (output.q(serialDesc, 2) || self.enableLocationReporting != null) {
            output.w(serialDesc, 2, BooleanSerializer.f24779a, self.enableLocationReporting);
        }
        if (output.q(serialDesc, 3) || self.locationReportingIntervalSeconds != null) {
            output.w(serialDesc, 3, DoubleSerializer.f24792a, self.locationReportingIntervalSeconds);
        }
        if (output.q(serialDesc, 4) || self.locationReportingTimeoutSeconds != null) {
            output.w(serialDesc, 4, DoubleSerializer.f24792a, self.locationReportingTimeoutSeconds);
        }
        if (output.q(serialDesc, 5) || self.locationReportingTimeoutsToFail != null) {
            output.w(serialDesc, 5, IntSerializer.f24800a, self.locationReportingTimeoutsToFail);
        }
        if (output.q(serialDesc, 6) || self.isSmartCartMode != null) {
            output.w(serialDesc, 6, BooleanSerializer.f24779a, self.isSmartCartMode);
        }
        if (output.q(serialDesc, 7) || self.modelFetchRetryInterval != null) {
            output.w(serialDesc, 7, DoubleSerializer.f24792a, self.modelFetchRetryInterval);
        }
        if (output.q(serialDesc, 8) || self.modelFetchRetryCount != null) {
            output.w(serialDesc, 8, IntSerializer.f24800a, self.modelFetchRetryCount);
        }
        if (output.q(serialDesc, 9) || self.engineSessionFetchRetryCount != null) {
            output.w(serialDesc, 9, IntSerializer.f24800a, self.engineSessionFetchRetryCount);
        }
        if (output.q(serialDesc, 10) || self.engineSessionFetchRetryInterval != null) {
            output.w(serialDesc, 10, DoubleSerializer.f24792a, self.engineSessionFetchRetryInterval);
        }
        if (output.q(serialDesc, 11) || self.engineSessionRefreshIntervalBeforeExpirationSeconds != null) {
            output.w(serialDesc, 11, DoubleSerializer.f24792a, self.engineSessionRefreshIntervalBeforeExpirationSeconds);
        }
        if (output.q(serialDesc, 12) || self.mainOrientationCalculator != null) {
            output.w(serialDesc, 12, MainOrientationCalculatorConfigResponse$$serializer.INSTANCE, self.mainOrientationCalculator);
        }
        if (output.q(serialDesc, 13) || self.onDevice != null) {
            output.w(serialDesc, 13, OnDeviceEngineConfigResponse$$serializer.INSTANCE, self.onDevice);
        }
        if (output.q(serialDesc, 14) || self.isPositioningDebuggingEnabled != null) {
            output.w(serialDesc, 14, BooleanSerializer.f24779a, self.isPositioningDebuggingEnabled);
        }
        if (output.q(serialDesc, 15) || self.locationReportingQueueLimit != null) {
            output.w(serialDesc, 15, IntSerializer.f24800a, self.locationReportingQueueLimit);
        }
        if (output.q(serialDesc, 16) || self.locationReportingConnectionRetryInitialInterval != null) {
            output.w(serialDesc, 16, DoubleSerializer.f24792a, self.locationReportingConnectionRetryInitialInterval);
        }
        if (!output.q(serialDesc, 17) && self.locationReportingConnectionRetryMaxInterval == null) {
            return;
        }
        output.w(serialDesc, 17, DoubleSerializer.f24792a, self.locationReportingConnectionRetryMaxInterval);
    }

    @Nullable
    public final List<String> component1() {
        return this.buildingIds;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getEngineSessionFetchRetryCount() {
        return this.engineSessionFetchRetryCount;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getEngineSessionFetchRetryInterval() {
        return this.engineSessionFetchRetryInterval;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getEngineSessionRefreshIntervalBeforeExpirationSeconds() {
        return this.engineSessionRefreshIntervalBeforeExpirationSeconds;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final MainOrientationCalculatorConfigResponse getMainOrientationCalculator() {
        return this.mainOrientationCalculator;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final OnDeviceEngineConfigResponse getOnDevice() {
        return this.onDevice;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Boolean getIsPositioningDebuggingEnabled() {
        return this.isPositioningDebuggingEnabled;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getLocationReportingQueueLimit() {
        return this.locationReportingQueueLimit;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Double getLocationReportingConnectionRetryInitialInterval() {
        return this.locationReportingConnectionRetryInitialInterval;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Double getLocationReportingConnectionRetryMaxInterval() {
        return this.locationReportingConnectionRetryMaxInterval;
    }

    @Nullable
    public final List<EngineConfigResponse> component2() {
        return this.customConfigs;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getEnableLocationReporting() {
        return this.enableLocationReporting;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getLocationReportingIntervalSeconds() {
        return this.locationReportingIntervalSeconds;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getLocationReportingTimeoutSeconds() {
        return this.locationReportingTimeoutSeconds;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getLocationReportingTimeoutsToFail() {
        return this.locationReportingTimeoutsToFail;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsSmartCartMode() {
        return this.isSmartCartMode;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getModelFetchRetryInterval() {
        return this.modelFetchRetryInterval;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getModelFetchRetryCount() {
        return this.modelFetchRetryCount;
    }

    @NotNull
    public final EngineConfigResponse copy(@Nullable List<String> buildingIds, @Nullable List<EngineConfigResponse> customConfigs, @Nullable Boolean enableLocationReporting, @Nullable Double locationReportingIntervalSeconds, @Nullable Double locationReportingTimeoutSeconds, @Nullable Integer locationReportingTimeoutsToFail, @Nullable Boolean isSmartCartMode, @Nullable Double modelFetchRetryInterval, @Nullable Integer modelFetchRetryCount, @Nullable Integer engineSessionFetchRetryCount, @Nullable Double engineSessionFetchRetryInterval, @Nullable Double engineSessionRefreshIntervalBeforeExpirationSeconds, @Nullable MainOrientationCalculatorConfigResponse mainOrientationCalculator, @Nullable OnDeviceEngineConfigResponse onDevice, @Nullable Boolean isPositioningDebuggingEnabled, @Nullable Integer locationReportingQueueLimit, @Nullable Double locationReportingConnectionRetryInitialInterval, @Nullable Double locationReportingConnectionRetryMaxInterval) {
        return new EngineConfigResponse(buildingIds, customConfigs, enableLocationReporting, locationReportingIntervalSeconds, locationReportingTimeoutSeconds, locationReportingTimeoutsToFail, isSmartCartMode, modelFetchRetryInterval, modelFetchRetryCount, engineSessionFetchRetryCount, engineSessionFetchRetryInterval, engineSessionRefreshIntervalBeforeExpirationSeconds, mainOrientationCalculator, onDevice, isPositioningDebuggingEnabled, locationReportingQueueLimit, locationReportingConnectionRetryInitialInterval, locationReportingConnectionRetryMaxInterval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineConfigResponse)) {
            return false;
        }
        EngineConfigResponse engineConfigResponse = (EngineConfigResponse) other;
        return Intrinsics.c(this.buildingIds, engineConfigResponse.buildingIds) && Intrinsics.c(this.customConfigs, engineConfigResponse.customConfigs) && Intrinsics.c(this.enableLocationReporting, engineConfigResponse.enableLocationReporting) && Intrinsics.c(this.locationReportingIntervalSeconds, engineConfigResponse.locationReportingIntervalSeconds) && Intrinsics.c(this.locationReportingTimeoutSeconds, engineConfigResponse.locationReportingTimeoutSeconds) && Intrinsics.c(this.locationReportingTimeoutsToFail, engineConfigResponse.locationReportingTimeoutsToFail) && Intrinsics.c(this.isSmartCartMode, engineConfigResponse.isSmartCartMode) && Intrinsics.c(this.modelFetchRetryInterval, engineConfigResponse.modelFetchRetryInterval) && Intrinsics.c(this.modelFetchRetryCount, engineConfigResponse.modelFetchRetryCount) && Intrinsics.c(this.engineSessionFetchRetryCount, engineConfigResponse.engineSessionFetchRetryCount) && Intrinsics.c(this.engineSessionFetchRetryInterval, engineConfigResponse.engineSessionFetchRetryInterval) && Intrinsics.c(this.engineSessionRefreshIntervalBeforeExpirationSeconds, engineConfigResponse.engineSessionRefreshIntervalBeforeExpirationSeconds) && Intrinsics.c(this.mainOrientationCalculator, engineConfigResponse.mainOrientationCalculator) && Intrinsics.c(this.onDevice, engineConfigResponse.onDevice) && Intrinsics.c(this.isPositioningDebuggingEnabled, engineConfigResponse.isPositioningDebuggingEnabled) && Intrinsics.c(this.locationReportingQueueLimit, engineConfigResponse.locationReportingQueueLimit) && Intrinsics.c(this.locationReportingConnectionRetryInitialInterval, engineConfigResponse.locationReportingConnectionRetryInitialInterval) && Intrinsics.c(this.locationReportingConnectionRetryMaxInterval, engineConfigResponse.locationReportingConnectionRetryMaxInterval);
    }

    @Nullable
    public final List<String> getBuildingIds() {
        return this.buildingIds;
    }

    @Nullable
    public final List<EngineConfigResponse> getCustomConfigs() {
        return this.customConfigs;
    }

    @Nullable
    public final Boolean getEnableLocationReporting() {
        return this.enableLocationReporting;
    }

    @Nullable
    public final Integer getEngineSessionFetchRetryCount() {
        return this.engineSessionFetchRetryCount;
    }

    @Nullable
    public final Double getEngineSessionFetchRetryInterval() {
        return this.engineSessionFetchRetryInterval;
    }

    @Nullable
    public final Double getEngineSessionRefreshIntervalBeforeExpirationSeconds() {
        return this.engineSessionRefreshIntervalBeforeExpirationSeconds;
    }

    @Nullable
    public final Double getLocationReportingConnectionRetryInitialInterval() {
        return this.locationReportingConnectionRetryInitialInterval;
    }

    @Nullable
    public final Double getLocationReportingConnectionRetryMaxInterval() {
        return this.locationReportingConnectionRetryMaxInterval;
    }

    @Nullable
    public final Double getLocationReportingIntervalSeconds() {
        return this.locationReportingIntervalSeconds;
    }

    @Nullable
    public final Integer getLocationReportingQueueLimit() {
        return this.locationReportingQueueLimit;
    }

    @Nullable
    public final Double getLocationReportingTimeoutSeconds() {
        return this.locationReportingTimeoutSeconds;
    }

    @Nullable
    public final Integer getLocationReportingTimeoutsToFail() {
        return this.locationReportingTimeoutsToFail;
    }

    @Nullable
    public final MainOrientationCalculatorConfigResponse getMainOrientationCalculator() {
        return this.mainOrientationCalculator;
    }

    @Nullable
    public final Integer getModelFetchRetryCount() {
        return this.modelFetchRetryCount;
    }

    @Nullable
    public final Double getModelFetchRetryInterval() {
        return this.modelFetchRetryInterval;
    }

    @Nullable
    public final OnDeviceEngineConfigResponse getOnDevice() {
        return this.onDevice;
    }

    public int hashCode() {
        List<String> list = this.buildingIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<EngineConfigResponse> list2 = this.customConfigs;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.enableLocationReporting;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.locationReportingIntervalSeconds;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.locationReportingTimeoutSeconds;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.locationReportingTimeoutsToFail;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.isSmartCartMode;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d3 = this.modelFetchRetryInterval;
        int iHashCode8 = (iHashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num2 = this.modelFetchRetryCount;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.engineSessionFetchRetryCount;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d4 = this.engineSessionFetchRetryInterval;
        int iHashCode11 = (iHashCode10 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.engineSessionRefreshIntervalBeforeExpirationSeconds;
        int iHashCode12 = (iHashCode11 + (d5 == null ? 0 : d5.hashCode())) * 31;
        MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse = this.mainOrientationCalculator;
        int iHashCode13 = (iHashCode12 + (mainOrientationCalculatorConfigResponse == null ? 0 : mainOrientationCalculatorConfigResponse.hashCode())) * 31;
        OnDeviceEngineConfigResponse onDeviceEngineConfigResponse = this.onDevice;
        int iHashCode14 = (iHashCode13 + (onDeviceEngineConfigResponse == null ? 0 : onDeviceEngineConfigResponse.hashCode())) * 31;
        Boolean bool3 = this.isPositioningDebuggingEnabled;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num4 = this.locationReportingQueueLimit;
        int iHashCode16 = (iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d6 = this.locationReportingConnectionRetryInitialInterval;
        int iHashCode17 = (iHashCode16 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.locationReportingConnectionRetryMaxInterval;
        return iHashCode17 + (d7 != null ? d7.hashCode() : 0);
    }

    @Nullable
    public final Boolean isPositioningDebuggingEnabled() {
        return this.isPositioningDebuggingEnabled;
    }

    @Nullable
    public final Boolean isSmartCartMode() {
        return this.isSmartCartMode;
    }

    @Nullable
    public final EngineConfig toEngineConfig(@NotNull ExtraEngineConfig extraEngineConfig) {
        Intrinsics.h(extraEngineConfig, "extraEngineConfig");
        OnDeviceEngineConfigResponse onDeviceEngineConfigResponse = this.onDevice;
        if (onDeviceEngineConfigResponse == null) {
            return null;
        }
        long millis = TimeUnit.SECONDS.toMillis(1L);
        Boolean bool = this.enableLocationReporting;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Double d = this.locationReportingIntervalSeconds;
        double dDoubleValue = d != null ? d.doubleValue() : 0.5d;
        Double d2 = this.locationReportingTimeoutSeconds;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 5.0d;
        Integer num = this.locationReportingTimeoutsToFail;
        int iIntValue = num != null ? num.intValue() : 10;
        Boolean bool2 = this.isSmartCartMode;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Integer num2 = this.modelFetchRetryCount;
        int iIntValue2 = num2 != null ? num2.intValue() : 3;
        Double d3 = this.modelFetchRetryInterval;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 1.0d;
        double mapGridUrlExpirationTimeMinutes = extraEngineConfig.getMapGridUrlExpirationTimeMinutes();
        double dDoubleValue4 = 1.0d;
        double d4 = dDoubleValue3;
        MapGridFetchingStrategy mapGridFetchingStrategy = extraEngineConfig.getMapGridFetchingStrategy();
        MapGridType mapGridType = extraEngineConfig.getMapGridType();
        Double d5 = this.engineSessionFetchRetryInterval;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 1.0d;
        Integer num3 = this.engineSessionFetchRetryCount;
        int iIntValue3 = num3 != null ? num3.intValue() : 2;
        Double d6 = this.engineSessionRefreshIntervalBeforeExpirationSeconds;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 43200.0d;
        SpecificEngineConfig specificEngineConfig$internal_publishRelease = onDeviceEngineConfigResponse.toSpecificEngineConfig$internal_publishRelease();
        MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse = this.mainOrientationCalculator;
        if (mainOrientationCalculatorConfigResponse == null) {
            mainOrientationCalculatorConfigResponse = new MainOrientationCalculatorConfigResponse((Double) null, (Double) null, (Double) null, (Integer) null, (Double) null, 31, (DefaultConstructorMarker) null);
        }
        MainOrientationCalculatorConfig config = mainOrientationCalculatorConfigResponse.toConfig();
        Boolean bool3 = this.isPositioningDebuggingEnabled;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Integer num4 = this.locationReportingQueueLimit;
        int iIntValue4 = num4 != null ? num4.intValue() : 50;
        Double d7 = this.locationReportingConnectionRetryInitialInterval;
        if (d7 != null) {
            dDoubleValue4 = d7.doubleValue();
        }
        double d8 = millis;
        long j = (long) (dDoubleValue4 * d8);
        Double d9 = this.locationReportingConnectionRetryMaxInterval;
        return new EngineConfig(zBooleanValue, dDoubleValue, dDoubleValue2, iIntValue, zBooleanValue2, d4, iIntValue2, mapGridUrlExpirationTimeMinutes, mapGridFetchingStrategy, mapGridType, iIntValue3, dDoubleValue5, dDoubleValue6, specificEngineConfig$internal_publishRelease, config, zBooleanValue3, iIntValue4, j, (long) (d8 * (d9 != null ? d9.doubleValue() : 60.0d)));
    }

    @NotNull
    public String toString() {
        return "EngineConfigResponse(buildingIds=" + this.buildingIds + ", customConfigs=" + this.customConfigs + ", enableLocationReporting=" + this.enableLocationReporting + ", locationReportingIntervalSeconds=" + this.locationReportingIntervalSeconds + ", locationReportingTimeoutSeconds=" + this.locationReportingTimeoutSeconds + ", locationReportingTimeoutsToFail=" + this.locationReportingTimeoutsToFail + ", isSmartCartMode=" + this.isSmartCartMode + ", modelFetchRetryInterval=" + this.modelFetchRetryInterval + ", modelFetchRetryCount=" + this.modelFetchRetryCount + ", engineSessionFetchRetryCount=" + this.engineSessionFetchRetryCount + ", engineSessionFetchRetryInterval=" + this.engineSessionFetchRetryInterval + ", engineSessionRefreshIntervalBeforeExpirationSeconds=" + this.engineSessionRefreshIntervalBeforeExpirationSeconds + ", mainOrientationCalculator=" + this.mainOrientationCalculator + ", onDevice=" + this.onDevice + ", isPositioningDebuggingEnabled=" + this.isPositioningDebuggingEnabled + ", locationReportingQueueLimit=" + this.locationReportingQueueLimit + ", locationReportingConnectionRetryInitialInterval=" + this.locationReportingConnectionRetryInitialInterval + ", locationReportingConnectionRetryMaxInterval=" + this.locationReportingConnectionRetryMaxInterval + ')';
    }

    @Deprecated
    public /* synthetic */ EngineConfigResponse(int i, List list, List list2, Boolean bool, Double d, Double d2, Integer num, Boolean bool2, Double d3, Integer num2, Integer num3, Double d4, Double d5, MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse, OnDeviceEngineConfigResponse onDeviceEngineConfigResponse, Boolean bool3, Integer num4, Double d6, Double d7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buildingIds = null;
        } else {
            this.buildingIds = list;
        }
        if ((i & 2) == 0) {
            this.customConfigs = null;
        } else {
            this.customConfigs = list2;
        }
        if ((i & 4) == 0) {
            this.enableLocationReporting = null;
        } else {
            this.enableLocationReporting = bool;
        }
        if ((i & 8) == 0) {
            this.locationReportingIntervalSeconds = null;
        } else {
            this.locationReportingIntervalSeconds = d;
        }
        if ((i & 16) == 0) {
            this.locationReportingTimeoutSeconds = null;
        } else {
            this.locationReportingTimeoutSeconds = d2;
        }
        if ((i & 32) == 0) {
            this.locationReportingTimeoutsToFail = null;
        } else {
            this.locationReportingTimeoutsToFail = num;
        }
        if ((i & 64) == 0) {
            this.isSmartCartMode = null;
        } else {
            this.isSmartCartMode = bool2;
        }
        if ((i & 128) == 0) {
            this.modelFetchRetryInterval = null;
        } else {
            this.modelFetchRetryInterval = d3;
        }
        if ((i & 256) == 0) {
            this.modelFetchRetryCount = null;
        } else {
            this.modelFetchRetryCount = num2;
        }
        if ((i & 512) == 0) {
            this.engineSessionFetchRetryCount = null;
        } else {
            this.engineSessionFetchRetryCount = num3;
        }
        if ((i & 1024) == 0) {
            this.engineSessionFetchRetryInterval = null;
        } else {
            this.engineSessionFetchRetryInterval = d4;
        }
        if ((i & 2048) == 0) {
            this.engineSessionRefreshIntervalBeforeExpirationSeconds = null;
        } else {
            this.engineSessionRefreshIntervalBeforeExpirationSeconds = d5;
        }
        if ((i & 4096) == 0) {
            this.mainOrientationCalculator = null;
        } else {
            this.mainOrientationCalculator = mainOrientationCalculatorConfigResponse;
        }
        if ((i & 8192) == 0) {
            this.onDevice = null;
        } else {
            this.onDevice = onDeviceEngineConfigResponse;
        }
        if ((i & 16384) == 0) {
            this.isPositioningDebuggingEnabled = null;
        } else {
            this.isPositioningDebuggingEnabled = bool3;
        }
        if ((32768 & i) == 0) {
            this.locationReportingQueueLimit = null;
        } else {
            this.locationReportingQueueLimit = num4;
        }
        if ((65536 & i) == 0) {
            this.locationReportingConnectionRetryInitialInterval = null;
        } else {
            this.locationReportingConnectionRetryInitialInterval = d6;
        }
        if ((i & 131072) == 0) {
            this.locationReportingConnectionRetryMaxInterval = null;
        } else {
            this.locationReportingConnectionRetryMaxInterval = d7;
        }
    }

    public EngineConfigResponse(@Nullable List<String> list, @Nullable List<EngineConfigResponse> list2, @Nullable Boolean bool, @Nullable Double d, @Nullable Double d2, @Nullable Integer num, @Nullable Boolean bool2, @Nullable Double d3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Double d4, @Nullable Double d5, @Nullable MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse, @Nullable OnDeviceEngineConfigResponse onDeviceEngineConfigResponse, @Nullable Boolean bool3, @Nullable Integer num4, @Nullable Double d6, @Nullable Double d7) {
        this.buildingIds = list;
        this.customConfigs = list2;
        this.enableLocationReporting = bool;
        this.locationReportingIntervalSeconds = d;
        this.locationReportingTimeoutSeconds = d2;
        this.locationReportingTimeoutsToFail = num;
        this.isSmartCartMode = bool2;
        this.modelFetchRetryInterval = d3;
        this.modelFetchRetryCount = num2;
        this.engineSessionFetchRetryCount = num3;
        this.engineSessionFetchRetryInterval = d4;
        this.engineSessionRefreshIntervalBeforeExpirationSeconds = d5;
        this.mainOrientationCalculator = mainOrientationCalculatorConfigResponse;
        this.onDevice = onDeviceEngineConfigResponse;
        this.isPositioningDebuggingEnabled = bool3;
        this.locationReportingQueueLimit = num4;
        this.locationReportingConnectionRetryInitialInterval = d6;
        this.locationReportingConnectionRetryMaxInterval = d7;
    }

    public /* synthetic */ EngineConfigResponse(List list, List list2, Boolean bool, Double d, Double d2, Integer num, Boolean bool2, Double d3, Integer num2, Integer num3, Double d4, Double d5, MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse, OnDeviceEngineConfigResponse onDeviceEngineConfigResponse, Boolean bool3, Integer num4, Double d6, Double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : d3, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : d4, (i & 2048) != 0 ? null : d5, (i & 4096) != 0 ? null : mainOrientationCalculatorConfigResponse, (i & 8192) != 0 ? null : onDeviceEngineConfigResponse, (i & 16384) != 0 ? null : bool3, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : d6, (i & 131072) != 0 ? null : d7);
    }
}
