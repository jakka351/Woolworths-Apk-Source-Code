package me.oriient.internal.services.dataModel.sensors;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002VWBÃ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aBÑ\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001bJ\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#JÚ\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0006\u0010J\u001a\u00020KJ\t\u0010L\u001a\u00020MHÖ\u0001J&\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020THÁ\u0001¢\u0006\u0002\bUR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b%\u0010\u001dR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b&\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b'\u0010\u001dR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b(\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b)\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b,\u0010 R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b-\u0010\u001dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b.\u0010\u001dR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b/\u0010#R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b0\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b1\u0010#R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b2\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b3\u0010#¨\u0006X"}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorsManagerConfigResponse;", "", "seen1", "", "sensorSamplingRateHz", "", "sensorsDataBufferSize", "sensorsDataRelevanceLimitSec", "sensorsDataRelevanceLimitPressureSec", "useNewSensorManager", "", "monitorFreezes", "validateSamples", "stopSessionOnSensorError", "stopSessionIfSensorDataOutdated", "foregroundServiceMonitoringIntervalSec", "monitoringIntervalSec", "recoveryWaitingDurationSec", "restartWaitingDurationSec", "maxSessionLengthMin", "sensorIssuesELogIntervalSec", "sensorsConfig", "Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse;", "shouldNeverStopPressure", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse;Ljava/lang/Boolean;)V", "getForegroundServiceMonitoringIntervalSec", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxSessionLengthMin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMonitorFreezes", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMonitoringIntervalSec", "getRecoveryWaitingDurationSec", "getRestartWaitingDurationSec", "getSensorIssuesELogIntervalSec", "getSensorSamplingRateHz", "getSensorsConfig", "()Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse;", "getSensorsDataBufferSize", "getSensorsDataRelevanceLimitPressureSec", "getSensorsDataRelevanceLimitSec", "getShouldNeverStopPressure", "getStopSessionIfSensorDataOutdated", "getStopSessionOnSensorError", "getUseNewSensorManager", "getValidateSamples", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse;Ljava/lang/Boolean;)Lme/oriient/internal/services/dataModel/sensors/SensorsManagerConfigResponse;", "equals", "other", "hashCode", "toSensorsManagerConfig", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SensorsManagerConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Double foregroundServiceMonitoringIntervalSec;

    @Nullable
    private final Integer maxSessionLengthMin;

    @Nullable
    private final Boolean monitorFreezes;

    @Nullable
    private final Double monitoringIntervalSec;

    @Nullable
    private final Double recoveryWaitingDurationSec;

    @Nullable
    private final Double restartWaitingDurationSec;

    @Nullable
    private final Double sensorIssuesELogIntervalSec;

    @Nullable
    private final Double sensorSamplingRateHz;

    @Nullable
    private final SensorsConfigResponse sensorsConfig;

    @Nullable
    private final Integer sensorsDataBufferSize;

    @Nullable
    private final Double sensorsDataRelevanceLimitPressureSec;

    @Nullable
    private final Double sensorsDataRelevanceLimitSec;

    @Nullable
    private final Boolean shouldNeverStopPressure;

    @Nullable
    private final Boolean stopSessionIfSensorDataOutdated;

    @Nullable
    private final Boolean stopSessionOnSensorError;

    @Nullable
    private final Boolean useNewSensorManager;

    @Nullable
    private final Boolean validateSamples;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorsManagerConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/sensors/SensorsManagerConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SensorsManagerConfigResponse> serializer() {
            return SensorsManagerConfigResponse$$serializer.INSTANCE;
        }
    }

    public SensorsManagerConfigResponse() {
        this((Double) null, (Integer) null, (Double) null, (Double) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, (Double) null, (SensorsConfigResponse) null, (Boolean) null, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SensorsManagerConfigResponse copy$default(SensorsManagerConfigResponse sensorsManagerConfigResponse, Double d, Integer num, Double d2, Double d3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Double d4, Double d5, Double d6, Double d7, Integer num2, Double d8, SensorsConfigResponse sensorsConfigResponse, Boolean bool6, int i, Object obj) {
        Boolean bool7;
        SensorsConfigResponse sensorsConfigResponse2;
        Double d9;
        SensorsManagerConfigResponse sensorsManagerConfigResponse2;
        Double d10;
        Integer num3;
        Double d11;
        Double d12;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Double d13;
        Double d14;
        Double d15;
        Double d16;
        Integer num4;
        Double d17 = (i & 1) != 0 ? sensorsManagerConfigResponse.sensorSamplingRateHz : d;
        Integer num5 = (i & 2) != 0 ? sensorsManagerConfigResponse.sensorsDataBufferSize : num;
        Double d18 = (i & 4) != 0 ? sensorsManagerConfigResponse.sensorsDataRelevanceLimitSec : d2;
        Double d19 = (i & 8) != 0 ? sensorsManagerConfigResponse.sensorsDataRelevanceLimitPressureSec : d3;
        Boolean bool13 = (i & 16) != 0 ? sensorsManagerConfigResponse.useNewSensorManager : bool;
        Boolean bool14 = (i & 32) != 0 ? sensorsManagerConfigResponse.monitorFreezes : bool2;
        Boolean bool15 = (i & 64) != 0 ? sensorsManagerConfigResponse.validateSamples : bool3;
        Boolean bool16 = (i & 128) != 0 ? sensorsManagerConfigResponse.stopSessionOnSensorError : bool4;
        Boolean bool17 = (i & 256) != 0 ? sensorsManagerConfigResponse.stopSessionIfSensorDataOutdated : bool5;
        Double d20 = (i & 512) != 0 ? sensorsManagerConfigResponse.foregroundServiceMonitoringIntervalSec : d4;
        Double d21 = (i & 1024) != 0 ? sensorsManagerConfigResponse.monitoringIntervalSec : d5;
        Double d22 = (i & 2048) != 0 ? sensorsManagerConfigResponse.recoveryWaitingDurationSec : d6;
        Double d23 = (i & 4096) != 0 ? sensorsManagerConfigResponse.restartWaitingDurationSec : d7;
        Integer num6 = (i & 8192) != 0 ? sensorsManagerConfigResponse.maxSessionLengthMin : num2;
        Double d24 = d17;
        Double d25 = (i & 16384) != 0 ? sensorsManagerConfigResponse.sensorIssuesELogIntervalSec : d8;
        SensorsConfigResponse sensorsConfigResponse3 = (i & 32768) != 0 ? sensorsManagerConfigResponse.sensorsConfig : sensorsConfigResponse;
        if ((i & 65536) != 0) {
            sensorsConfigResponse2 = sensorsConfigResponse3;
            bool7 = sensorsManagerConfigResponse.shouldNeverStopPressure;
            d10 = d25;
            num3 = num5;
            d11 = d18;
            d12 = d19;
            bool8 = bool13;
            bool9 = bool14;
            bool10 = bool15;
            bool11 = bool16;
            bool12 = bool17;
            d13 = d20;
            d14 = d21;
            d15 = d22;
            d16 = d23;
            num4 = num6;
            d9 = d24;
            sensorsManagerConfigResponse2 = sensorsManagerConfigResponse;
        } else {
            bool7 = bool6;
            sensorsConfigResponse2 = sensorsConfigResponse3;
            d9 = d24;
            sensorsManagerConfigResponse2 = sensorsManagerConfigResponse;
            d10 = d25;
            num3 = num5;
            d11 = d18;
            d12 = d19;
            bool8 = bool13;
            bool9 = bool14;
            bool10 = bool15;
            bool11 = bool16;
            bool12 = bool17;
            d13 = d20;
            d14 = d21;
            d15 = d22;
            d16 = d23;
            num4 = num6;
        }
        return sensorsManagerConfigResponse2.copy(d9, num3, d11, d12, bool8, bool9, bool10, bool11, bool12, d13, d14, d15, d16, num4, d10, sensorsConfigResponse2, bool7);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SensorsManagerConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.sensorSamplingRateHz != null) {
            output.w(serialDesc, 0, DoubleSerializer.f24792a, self.sensorSamplingRateHz);
        }
        if (output.q(serialDesc, 1) || self.sensorsDataBufferSize != null) {
            output.w(serialDesc, 1, IntSerializer.f24800a, self.sensorsDataBufferSize);
        }
        if (output.q(serialDesc, 2) || self.sensorsDataRelevanceLimitSec != null) {
            output.w(serialDesc, 2, DoubleSerializer.f24792a, self.sensorsDataRelevanceLimitSec);
        }
        if (output.q(serialDesc, 3) || self.sensorsDataRelevanceLimitPressureSec != null) {
            output.w(serialDesc, 3, DoubleSerializer.f24792a, self.sensorsDataRelevanceLimitPressureSec);
        }
        if (output.q(serialDesc, 4) || self.useNewSensorManager != null) {
            output.w(serialDesc, 4, BooleanSerializer.f24779a, self.useNewSensorManager);
        }
        if (output.q(serialDesc, 5) || self.monitorFreezes != null) {
            output.w(serialDesc, 5, BooleanSerializer.f24779a, self.monitorFreezes);
        }
        if (output.q(serialDesc, 6) || self.validateSamples != null) {
            output.w(serialDesc, 6, BooleanSerializer.f24779a, self.validateSamples);
        }
        if (output.q(serialDesc, 7) || self.stopSessionOnSensorError != null) {
            output.w(serialDesc, 7, BooleanSerializer.f24779a, self.stopSessionOnSensorError);
        }
        if (output.q(serialDesc, 8) || self.stopSessionIfSensorDataOutdated != null) {
            output.w(serialDesc, 8, BooleanSerializer.f24779a, self.stopSessionIfSensorDataOutdated);
        }
        if (output.q(serialDesc, 9) || self.foregroundServiceMonitoringIntervalSec != null) {
            output.w(serialDesc, 9, DoubleSerializer.f24792a, self.foregroundServiceMonitoringIntervalSec);
        }
        if (output.q(serialDesc, 10) || self.monitoringIntervalSec != null) {
            output.w(serialDesc, 10, DoubleSerializer.f24792a, self.monitoringIntervalSec);
        }
        if (output.q(serialDesc, 11) || self.recoveryWaitingDurationSec != null) {
            output.w(serialDesc, 11, DoubleSerializer.f24792a, self.recoveryWaitingDurationSec);
        }
        if (output.q(serialDesc, 12) || self.restartWaitingDurationSec != null) {
            output.w(serialDesc, 12, DoubleSerializer.f24792a, self.restartWaitingDurationSec);
        }
        if (output.q(serialDesc, 13) || self.maxSessionLengthMin != null) {
            output.w(serialDesc, 13, IntSerializer.f24800a, self.maxSessionLengthMin);
        }
        if (output.q(serialDesc, 14) || self.sensorIssuesELogIntervalSec != null) {
            output.w(serialDesc, 14, DoubleSerializer.f24792a, self.sensorIssuesELogIntervalSec);
        }
        if (output.q(serialDesc, 15) || self.sensorsConfig != null) {
            output.w(serialDesc, 15, SensorsConfigResponse$$serializer.INSTANCE, self.sensorsConfig);
        }
        if (!output.q(serialDesc, 16) && self.shouldNeverStopPressure == null) {
            return;
        }
        output.w(serialDesc, 16, BooleanSerializer.f24779a, self.shouldNeverStopPressure);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getSensorSamplingRateHz() {
        return this.sensorSamplingRateHz;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getForegroundServiceMonitoringIntervalSec() {
        return this.foregroundServiceMonitoringIntervalSec;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getMonitoringIntervalSec() {
        return this.monitoringIntervalSec;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getRecoveryWaitingDurationSec() {
        return this.recoveryWaitingDurationSec;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getRestartWaitingDurationSec() {
        return this.restartWaitingDurationSec;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getMaxSessionLengthMin() {
        return this.maxSessionLengthMin;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getSensorIssuesELogIntervalSec() {
        return this.sensorIssuesELogIntervalSec;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final SensorsConfigResponse getSensorsConfig() {
        return this.sensorsConfig;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Boolean getShouldNeverStopPressure() {
        return this.shouldNeverStopPressure;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getSensorsDataBufferSize() {
        return this.sensorsDataBufferSize;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getSensorsDataRelevanceLimitSec() {
        return this.sensorsDataRelevanceLimitSec;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getSensorsDataRelevanceLimitPressureSec() {
        return this.sensorsDataRelevanceLimitPressureSec;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getUseNewSensorManager() {
        return this.useNewSensorManager;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getMonitorFreezes() {
        return this.monitorFreezes;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getValidateSamples() {
        return this.validateSamples;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getStopSessionOnSensorError() {
        return this.stopSessionOnSensorError;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getStopSessionIfSensorDataOutdated() {
        return this.stopSessionIfSensorDataOutdated;
    }

    @NotNull
    public final SensorsManagerConfigResponse copy(@Nullable Double sensorSamplingRateHz, @Nullable Integer sensorsDataBufferSize, @Nullable Double sensorsDataRelevanceLimitSec, @Nullable Double sensorsDataRelevanceLimitPressureSec, @Nullable Boolean useNewSensorManager, @Nullable Boolean monitorFreezes, @Nullable Boolean validateSamples, @Nullable Boolean stopSessionOnSensorError, @Nullable Boolean stopSessionIfSensorDataOutdated, @Nullable Double foregroundServiceMonitoringIntervalSec, @Nullable Double monitoringIntervalSec, @Nullable Double recoveryWaitingDurationSec, @Nullable Double restartWaitingDurationSec, @Nullable Integer maxSessionLengthMin, @Nullable Double sensorIssuesELogIntervalSec, @Nullable SensorsConfigResponse sensorsConfig, @Nullable Boolean shouldNeverStopPressure) {
        return new SensorsManagerConfigResponse(sensorSamplingRateHz, sensorsDataBufferSize, sensorsDataRelevanceLimitSec, sensorsDataRelevanceLimitPressureSec, useNewSensorManager, monitorFreezes, validateSamples, stopSessionOnSensorError, stopSessionIfSensorDataOutdated, foregroundServiceMonitoringIntervalSec, monitoringIntervalSec, recoveryWaitingDurationSec, restartWaitingDurationSec, maxSessionLengthMin, sensorIssuesELogIntervalSec, sensorsConfig, shouldNeverStopPressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorsManagerConfigResponse)) {
            return false;
        }
        SensorsManagerConfigResponse sensorsManagerConfigResponse = (SensorsManagerConfigResponse) other;
        return Intrinsics.c(this.sensorSamplingRateHz, sensorsManagerConfigResponse.sensorSamplingRateHz) && Intrinsics.c(this.sensorsDataBufferSize, sensorsManagerConfigResponse.sensorsDataBufferSize) && Intrinsics.c(this.sensorsDataRelevanceLimitSec, sensorsManagerConfigResponse.sensorsDataRelevanceLimitSec) && Intrinsics.c(this.sensorsDataRelevanceLimitPressureSec, sensorsManagerConfigResponse.sensorsDataRelevanceLimitPressureSec) && Intrinsics.c(this.useNewSensorManager, sensorsManagerConfigResponse.useNewSensorManager) && Intrinsics.c(this.monitorFreezes, sensorsManagerConfigResponse.monitorFreezes) && Intrinsics.c(this.validateSamples, sensorsManagerConfigResponse.validateSamples) && Intrinsics.c(this.stopSessionOnSensorError, sensorsManagerConfigResponse.stopSessionOnSensorError) && Intrinsics.c(this.stopSessionIfSensorDataOutdated, sensorsManagerConfigResponse.stopSessionIfSensorDataOutdated) && Intrinsics.c(this.foregroundServiceMonitoringIntervalSec, sensorsManagerConfigResponse.foregroundServiceMonitoringIntervalSec) && Intrinsics.c(this.monitoringIntervalSec, sensorsManagerConfigResponse.monitoringIntervalSec) && Intrinsics.c(this.recoveryWaitingDurationSec, sensorsManagerConfigResponse.recoveryWaitingDurationSec) && Intrinsics.c(this.restartWaitingDurationSec, sensorsManagerConfigResponse.restartWaitingDurationSec) && Intrinsics.c(this.maxSessionLengthMin, sensorsManagerConfigResponse.maxSessionLengthMin) && Intrinsics.c(this.sensorIssuesELogIntervalSec, sensorsManagerConfigResponse.sensorIssuesELogIntervalSec) && Intrinsics.c(this.sensorsConfig, sensorsManagerConfigResponse.sensorsConfig) && Intrinsics.c(this.shouldNeverStopPressure, sensorsManagerConfigResponse.shouldNeverStopPressure);
    }

    @Nullable
    public final Double getForegroundServiceMonitoringIntervalSec() {
        return this.foregroundServiceMonitoringIntervalSec;
    }

    @Nullable
    public final Integer getMaxSessionLengthMin() {
        return this.maxSessionLengthMin;
    }

    @Nullable
    public final Boolean getMonitorFreezes() {
        return this.monitorFreezes;
    }

    @Nullable
    public final Double getMonitoringIntervalSec() {
        return this.monitoringIntervalSec;
    }

    @Nullable
    public final Double getRecoveryWaitingDurationSec() {
        return this.recoveryWaitingDurationSec;
    }

    @Nullable
    public final Double getRestartWaitingDurationSec() {
        return this.restartWaitingDurationSec;
    }

    @Nullable
    public final Double getSensorIssuesELogIntervalSec() {
        return this.sensorIssuesELogIntervalSec;
    }

    @Nullable
    public final Double getSensorSamplingRateHz() {
        return this.sensorSamplingRateHz;
    }

    @Nullable
    public final SensorsConfigResponse getSensorsConfig() {
        return this.sensorsConfig;
    }

    @Nullable
    public final Integer getSensorsDataBufferSize() {
        return this.sensorsDataBufferSize;
    }

    @Nullable
    public final Double getSensorsDataRelevanceLimitPressureSec() {
        return this.sensorsDataRelevanceLimitPressureSec;
    }

    @Nullable
    public final Double getSensorsDataRelevanceLimitSec() {
        return this.sensorsDataRelevanceLimitSec;
    }

    @Nullable
    public final Boolean getShouldNeverStopPressure() {
        return this.shouldNeverStopPressure;
    }

    @Nullable
    public final Boolean getStopSessionIfSensorDataOutdated() {
        return this.stopSessionIfSensorDataOutdated;
    }

    @Nullable
    public final Boolean getStopSessionOnSensorError() {
        return this.stopSessionOnSensorError;
    }

    @Nullable
    public final Boolean getUseNewSensorManager() {
        return this.useNewSensorManager;
    }

    @Nullable
    public final Boolean getValidateSamples() {
        return this.validateSamples;
    }

    public int hashCode() {
        Double d = this.sensorSamplingRateHz;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Integer num = this.sensorsDataBufferSize;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.sensorsDataRelevanceLimitSec;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.sensorsDataRelevanceLimitPressureSec;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.useNewSensorManager;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.monitorFreezes;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.validateSamples;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.stopSessionOnSensorError;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.stopSessionIfSensorDataOutdated;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Double d4 = this.foregroundServiceMonitoringIntervalSec;
        int iHashCode10 = (iHashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.monitoringIntervalSec;
        int iHashCode11 = (iHashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.recoveryWaitingDurationSec;
        int iHashCode12 = (iHashCode11 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.restartWaitingDurationSec;
        int iHashCode13 = (iHashCode12 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num2 = this.maxSessionLengthMin;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d8 = this.sensorIssuesELogIntervalSec;
        int iHashCode15 = (iHashCode14 + (d8 == null ? 0 : d8.hashCode())) * 31;
        SensorsConfigResponse sensorsConfigResponse = this.sensorsConfig;
        int iHashCode16 = (iHashCode15 + (sensorsConfigResponse == null ? 0 : sensorsConfigResponse.hashCode())) * 31;
        Boolean bool6 = this.shouldNeverStopPressure;
        return iHashCode16 + (bool6 != null ? bool6.hashCode() : 0);
    }

    @NotNull
    public final SensorManagerConfig toSensorsManagerConfig() {
        Double d = this.sensorSamplingRateHz;
        double dDoubleValue = d != null ? d.doubleValue() : 100.0d;
        Integer num = this.sensorsDataBufferSize;
        int iIntValue = num != null ? num.intValue() : 2000;
        Double d2 = this.sensorsDataRelevanceLimitSec;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.1d;
        Double d3 = this.sensorsDataRelevanceLimitPressureSec;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 10.0d;
        Boolean bool = this.useNewSensorManager;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.validateSamples;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Boolean bool3 = this.monitorFreezes;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        Boolean bool4 = this.stopSessionOnSensorError;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : true;
        Boolean bool5 = this.stopSessionIfSensorDataOutdated;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : true;
        Integer num2 = this.maxSessionLengthMin;
        int iIntValue2 = num2 != null ? num2.intValue() : 1440;
        Double d4 = this.foregroundServiceMonitoringIntervalSec;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 30.0d;
        Double d5 = this.monitoringIntervalSec;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 0.1d;
        Double d6 = this.recoveryWaitingDurationSec;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 3.0d;
        Double d7 = this.restartWaitingDurationSec;
        double dDoubleValue7 = d7 != null ? d7.doubleValue() : 5.0d;
        Double d8 = this.sensorIssuesELogIntervalSec;
        double dDoubleValue8 = d8 != null ? d8.doubleValue() : 5.0d;
        SensorsConfigResponse sensorsConfigResponse = this.sensorsConfig;
        if (sensorsConfigResponse == null) {
            sensorsConfigResponse = new SensorsConfigResponse((SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, (SensorConfigResponse) null, 127, (DefaultConstructorMarker) null);
        }
        SensorsConfig sensorsConfig = sensorsConfigResponse.toSensorsConfig();
        Boolean bool6 = this.shouldNeverStopPressure;
        return new SensorManagerConfig(dDoubleValue, iIntValue, dDoubleValue2, dDoubleValue3, zBooleanValue, zBooleanValue3, zBooleanValue2, zBooleanValue4, zBooleanValue5, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, iIntValue2, dDoubleValue8, sensorsConfig, bool6 != null ? bool6.booleanValue() : false);
    }

    @NotNull
    public String toString() {
        return "SensorsManagerConfigResponse(sensorSamplingRateHz=" + this.sensorSamplingRateHz + ", sensorsDataBufferSize=" + this.sensorsDataBufferSize + ", sensorsDataRelevanceLimitSec=" + this.sensorsDataRelevanceLimitSec + ", sensorsDataRelevanceLimitPressureSec=" + this.sensorsDataRelevanceLimitPressureSec + ", useNewSensorManager=" + this.useNewSensorManager + ", monitorFreezes=" + this.monitorFreezes + ", validateSamples=" + this.validateSamples + ", stopSessionOnSensorError=" + this.stopSessionOnSensorError + ", stopSessionIfSensorDataOutdated=" + this.stopSessionIfSensorDataOutdated + ", foregroundServiceMonitoringIntervalSec=" + this.foregroundServiceMonitoringIntervalSec + ", monitoringIntervalSec=" + this.monitoringIntervalSec + ", recoveryWaitingDurationSec=" + this.recoveryWaitingDurationSec + ", restartWaitingDurationSec=" + this.restartWaitingDurationSec + ", maxSessionLengthMin=" + this.maxSessionLengthMin + ", sensorIssuesELogIntervalSec=" + this.sensorIssuesELogIntervalSec + ", sensorsConfig=" + this.sensorsConfig + ", shouldNeverStopPressure=" + this.shouldNeverStopPressure + ')';
    }

    @Deprecated
    public /* synthetic */ SensorsManagerConfigResponse(int i, Double d, Integer num, Double d2, Double d3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Double d4, Double d5, Double d6, Double d7, Integer num2, Double d8, SensorsConfigResponse sensorsConfigResponse, Boolean bool6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sensorSamplingRateHz = null;
        } else {
            this.sensorSamplingRateHz = d;
        }
        if ((i & 2) == 0) {
            this.sensorsDataBufferSize = null;
        } else {
            this.sensorsDataBufferSize = num;
        }
        if ((i & 4) == 0) {
            this.sensorsDataRelevanceLimitSec = null;
        } else {
            this.sensorsDataRelevanceLimitSec = d2;
        }
        if ((i & 8) == 0) {
            this.sensorsDataRelevanceLimitPressureSec = null;
        } else {
            this.sensorsDataRelevanceLimitPressureSec = d3;
        }
        if ((i & 16) == 0) {
            this.useNewSensorManager = null;
        } else {
            this.useNewSensorManager = bool;
        }
        if ((i & 32) == 0) {
            this.monitorFreezes = null;
        } else {
            this.monitorFreezes = bool2;
        }
        if ((i & 64) == 0) {
            this.validateSamples = null;
        } else {
            this.validateSamples = bool3;
        }
        if ((i & 128) == 0) {
            this.stopSessionOnSensorError = null;
        } else {
            this.stopSessionOnSensorError = bool4;
        }
        if ((i & 256) == 0) {
            this.stopSessionIfSensorDataOutdated = null;
        } else {
            this.stopSessionIfSensorDataOutdated = bool5;
        }
        if ((i & 512) == 0) {
            this.foregroundServiceMonitoringIntervalSec = null;
        } else {
            this.foregroundServiceMonitoringIntervalSec = d4;
        }
        if ((i & 1024) == 0) {
            this.monitoringIntervalSec = null;
        } else {
            this.monitoringIntervalSec = d5;
        }
        if ((i & 2048) == 0) {
            this.recoveryWaitingDurationSec = null;
        } else {
            this.recoveryWaitingDurationSec = d6;
        }
        if ((i & 4096) == 0) {
            this.restartWaitingDurationSec = null;
        } else {
            this.restartWaitingDurationSec = d7;
        }
        if ((i & 8192) == 0) {
            this.maxSessionLengthMin = null;
        } else {
            this.maxSessionLengthMin = num2;
        }
        if ((i & 16384) == 0) {
            this.sensorIssuesELogIntervalSec = null;
        } else {
            this.sensorIssuesELogIntervalSec = d8;
        }
        if ((32768 & i) == 0) {
            this.sensorsConfig = null;
        } else {
            this.sensorsConfig = sensorsConfigResponse;
        }
        if ((i & 65536) == 0) {
            this.shouldNeverStopPressure = null;
        } else {
            this.shouldNeverStopPressure = bool6;
        }
    }

    public SensorsManagerConfigResponse(@Nullable Double d, @Nullable Integer num, @Nullable Double d2, @Nullable Double d3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Integer num2, @Nullable Double d8, @Nullable SensorsConfigResponse sensorsConfigResponse, @Nullable Boolean bool6) {
        this.sensorSamplingRateHz = d;
        this.sensorsDataBufferSize = num;
        this.sensorsDataRelevanceLimitSec = d2;
        this.sensorsDataRelevanceLimitPressureSec = d3;
        this.useNewSensorManager = bool;
        this.monitorFreezes = bool2;
        this.validateSamples = bool3;
        this.stopSessionOnSensorError = bool4;
        this.stopSessionIfSensorDataOutdated = bool5;
        this.foregroundServiceMonitoringIntervalSec = d4;
        this.monitoringIntervalSec = d5;
        this.recoveryWaitingDurationSec = d6;
        this.restartWaitingDurationSec = d7;
        this.maxSessionLengthMin = num2;
        this.sensorIssuesELogIntervalSec = d8;
        this.sensorsConfig = sensorsConfigResponse;
        this.shouldNeverStopPressure = bool6;
    }

    public /* synthetic */ SensorsManagerConfigResponse(Double d, Integer num, Double d2, Double d3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Double d4, Double d5, Double d6, Double d7, Integer num2, Double d8, SensorsConfigResponse sensorsConfigResponse, Boolean bool6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : d3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : bool5, (i & 512) != 0 ? null : d4, (i & 1024) != 0 ? null : d5, (i & 2048) != 0 ? null : d6, (i & 4096) != 0 ? null : d7, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : d8, (i & 32768) != 0 ? null : sensorsConfigResponse, (i & 65536) != 0 ? null : bool6);
    }
}
