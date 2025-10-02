package me.oriient.internal.services.dataModel.positioning;

import androidx.annotation.Keep;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import me.oriient.internal.services.dataModel.positioning.PositioningConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0003cdeBû\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!B\u0093\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\"J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010G\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010K\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010N\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010O\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010P\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010Q\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u009c\u0002\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\u00052\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\u0003HÖ\u0001J\u0006\u0010X\u001a\u00020YJ\t\u0010Z\u001a\u00020\u001bHÖ\u0001J&\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00002\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aHÁ\u0001¢\u0006\u0002\bbR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b+\u0010(R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b,\u0010(R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b/\u0010(R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b0\u0010$R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b1\u0010$R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b2\u0010$R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b3\u0010$R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0010\u0010$R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0004\u0010$R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b4\u0010(R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b5\u0010(R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b6\u0010(R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b7\u0010(R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b8\u0010(R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b9\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010)\u001a\u0004\b:\u0010(R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006f"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse;", "", "seen1", "", "isPreheatingEnabledByDefault", "", "enableAutoStartPositioning", "enableAutoCalib", "ignorePublicAPIIsAutomaticCalibrationEnabled", "autoStartPositioningPauseAfterAutoStopMinutes", "", "autoStartPositioningPauseAfterErrorMinutes", "autoStartPositioningPauseAfterClientStopMinutes", "autoStartPositioningPauseAfterClientStartMinutes", "enableChargingBasedAutoStartPositioning", "maximumLocationAccuracyToAutoStartMeters", "isAutomaticPositioningPartOfCalibration", "stopNoMovementSec", "stopBackgroundSec", "positioningSessionTimeoutMinutes", "backgroundCalibrationTimeoutMinutes", "allowPositioningOutOfBuilding", "allowPositioningWhenLocationIsUnknown", "maxPositionAgeToEventTagSeconds", "noMovementDelta", "supportedCustomEventTagTypes", "", "", "secondsSinceChargingToUseKiosk", "autoStop", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;)V", "getAllowPositioningOutOfBuilding", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowPositioningWhenLocationIsUnknown", "getAutoStartPositioningPauseAfterAutoStopMinutes", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAutoStartPositioningPauseAfterClientStartMinutes", "getAutoStartPositioningPauseAfterClientStopMinutes", "getAutoStartPositioningPauseAfterErrorMinutes", "getAutoStop", "()Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;", "getBackgroundCalibrationTimeoutMinutes", "getEnableAutoCalib", "getEnableAutoStartPositioning", "getEnableChargingBasedAutoStartPositioning", "getIgnorePublicAPIIsAutomaticCalibrationEnabled", "getMaxPositionAgeToEventTagSeconds", "getMaximumLocationAccuracyToAutoStartMeters", "getNoMovementDelta", "getPositioningSessionTimeoutMinutes", "getSecondsSinceChargingToUseKiosk", "getStopBackgroundSec", "getStopNoMovementSec", "getSupportedCustomEventTagTypes", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;)Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse;", "equals", "other", "hashCode", "toPositioningConfig", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "AutoStopResponse", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class PositioningConfigResponse {

    @Nullable
    private final Boolean allowPositioningOutOfBuilding;

    @Nullable
    private final Boolean allowPositioningWhenLocationIsUnknown;

    @Nullable
    private final Double autoStartPositioningPauseAfterAutoStopMinutes;

    @Nullable
    private final Double autoStartPositioningPauseAfterClientStartMinutes;

    @Nullable
    private final Double autoStartPositioningPauseAfterClientStopMinutes;

    @Nullable
    private final Double autoStartPositioningPauseAfterErrorMinutes;

    @Nullable
    private final AutoStopResponse autoStop;

    @Nullable
    private final Double backgroundCalibrationTimeoutMinutes;

    @Nullable
    private final Boolean enableAutoCalib;

    @Nullable
    private final Boolean enableAutoStartPositioning;

    @Nullable
    private final Boolean enableChargingBasedAutoStartPositioning;

    @Nullable
    private final Boolean ignorePublicAPIIsAutomaticCalibrationEnabled;

    @Nullable
    private final Boolean isAutomaticPositioningPartOfCalibration;

    @Nullable
    private final Boolean isPreheatingEnabledByDefault;

    @Nullable
    private final Double maxPositionAgeToEventTagSeconds;

    @Nullable
    private final Double maximumLocationAccuracyToAutoStartMeters;

    @Nullable
    private final Double noMovementDelta;

    @Nullable
    private final Double positioningSessionTimeoutMinutes;

    @Nullable
    private final Double secondsSinceChargingToUseKiosk;

    @Nullable
    private final Double stopBackgroundSec;

    @Nullable
    private final Double stopNoMovementSec;

    @Nullable
    private final List<String> supportedCustomEventTagTypes;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.f24821a), null, null};

    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002IJB\u009b\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016B¡\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJª\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0006\u0010>\u001a\u00020?J\t\u0010@\u001a\u00020\u0011HÖ\u0001J&\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GHÁ\u0001¢\u0006\u0002\bHR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b#\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b*\u0010'R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b+\u0010'¨\u0006K"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;", "", "seen1", "", "useBuildingGeofence", "", "useExternalRegion", "useExitRegions", "useCharging", "geofenceMaxDistanceMeters", "", "externalRegionSlidingWindowSize", "externalMaxDistanceFromBuildingMeters", "externalRequiredConsistentAttemptsToStop", "downloadExitRegionsRetryInterval", "downloadExitRegionsRetryCount", "exitRegionTriggerType", "", "exitRegionDwellTime", "exitRegionCooldownTime", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getDownloadExitRegionsRetryCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDownloadExitRegionsRetryInterval", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getExitRegionCooldownTime", "getExitRegionDwellTime", "getExitRegionTriggerType", "()Ljava/lang/String;", "getExternalMaxDistanceFromBuildingMeters", "getExternalRegionSlidingWindowSize", "getExternalRequiredConsistentAttemptsToStop", "getGeofenceMaxDistanceMeters", "getUseBuildingGeofence", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUseCharging", "getUseExitRegions", "getUseExternalRegion", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;", "equals", "other", "hashCode", "toAutoStop", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AutoStopResponse {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @Nullable
        private final Integer downloadExitRegionsRetryCount;

        @Nullable
        private final Double downloadExitRegionsRetryInterval;

        @Nullable
        private final Double exitRegionCooldownTime;

        @Nullable
        private final Double exitRegionDwellTime;

        @Nullable
        private final String exitRegionTriggerType;

        @Nullable
        private final Double externalMaxDistanceFromBuildingMeters;

        @Nullable
        private final Integer externalRegionSlidingWindowSize;

        @Nullable
        private final Integer externalRequiredConsistentAttemptsToStop;

        @Nullable
        private final Double geofenceMaxDistanceMeters;

        @Nullable
        private final Boolean useBuildingGeofence;

        @Nullable
        private final Boolean useCharging;

        @Nullable
        private final Boolean useExitRegions;

        @Nullable
        private final Boolean useExternalRegion;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<AutoStopResponse> serializer() {
                return PositioningConfigResponse$AutoStopResponse$$serializer.INSTANCE;
            }
        }

        public AutoStopResponse() {
            this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (Integer) null, (Double) null, (Integer) null, (Double) null, (Integer) null, (String) null, (Double) null, (Double) null, 8191, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AutoStopResponse copy$default(AutoStopResponse autoStopResponse, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Double d, Integer num, Double d2, Integer num2, Double d3, Integer num3, String str, Double d4, Double d5, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = autoStopResponse.useBuildingGeofence;
            }
            return autoStopResponse.copy(bool, (i & 2) != 0 ? autoStopResponse.useExternalRegion : bool2, (i & 4) != 0 ? autoStopResponse.useExitRegions : bool3, (i & 8) != 0 ? autoStopResponse.useCharging : bool4, (i & 16) != 0 ? autoStopResponse.geofenceMaxDistanceMeters : d, (i & 32) != 0 ? autoStopResponse.externalRegionSlidingWindowSize : num, (i & 64) != 0 ? autoStopResponse.externalMaxDistanceFromBuildingMeters : d2, (i & 128) != 0 ? autoStopResponse.externalRequiredConsistentAttemptsToStop : num2, (i & 256) != 0 ? autoStopResponse.downloadExitRegionsRetryInterval : d3, (i & 512) != 0 ? autoStopResponse.downloadExitRegionsRetryCount : num3, (i & 1024) != 0 ? autoStopResponse.exitRegionTriggerType : str, (i & 2048) != 0 ? autoStopResponse.exitRegionDwellTime : d4, (i & 4096) != 0 ? autoStopResponse.exitRegionCooldownTime : d5);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(AutoStopResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (output.q(serialDesc, 0) || self.useBuildingGeofence != null) {
                output.w(serialDesc, 0, BooleanSerializer.f24779a, self.useBuildingGeofence);
            }
            if (output.q(serialDesc, 1) || self.useExternalRegion != null) {
                output.w(serialDesc, 1, BooleanSerializer.f24779a, self.useExternalRegion);
            }
            if (output.q(serialDesc, 2) || self.useExitRegions != null) {
                output.w(serialDesc, 2, BooleanSerializer.f24779a, self.useExitRegions);
            }
            if (output.q(serialDesc, 3) || self.useCharging != null) {
                output.w(serialDesc, 3, BooleanSerializer.f24779a, self.useCharging);
            }
            if (output.q(serialDesc, 4) || self.geofenceMaxDistanceMeters != null) {
                output.w(serialDesc, 4, DoubleSerializer.f24792a, self.geofenceMaxDistanceMeters);
            }
            if (output.q(serialDesc, 5) || self.externalRegionSlidingWindowSize != null) {
                output.w(serialDesc, 5, IntSerializer.f24800a, self.externalRegionSlidingWindowSize);
            }
            if (output.q(serialDesc, 6) || self.externalMaxDistanceFromBuildingMeters != null) {
                output.w(serialDesc, 6, DoubleSerializer.f24792a, self.externalMaxDistanceFromBuildingMeters);
            }
            if (output.q(serialDesc, 7) || self.externalRequiredConsistentAttemptsToStop != null) {
                output.w(serialDesc, 7, IntSerializer.f24800a, self.externalRequiredConsistentAttemptsToStop);
            }
            if (output.q(serialDesc, 8) || self.downloadExitRegionsRetryInterval != null) {
                output.w(serialDesc, 8, DoubleSerializer.f24792a, self.downloadExitRegionsRetryInterval);
            }
            if (output.q(serialDesc, 9) || self.downloadExitRegionsRetryCount != null) {
                output.w(serialDesc, 9, IntSerializer.f24800a, self.downloadExitRegionsRetryCount);
            }
            if (output.q(serialDesc, 10) || self.exitRegionTriggerType != null) {
                output.w(serialDesc, 10, StringSerializer.f24821a, self.exitRegionTriggerType);
            }
            if (output.q(serialDesc, 11) || self.exitRegionDwellTime != null) {
                output.w(serialDesc, 11, DoubleSerializer.f24792a, self.exitRegionDwellTime);
            }
            if (!output.q(serialDesc, 12) && self.exitRegionCooldownTime == null) {
                return;
            }
            output.w(serialDesc, 12, DoubleSerializer.f24792a, self.exitRegionCooldownTime);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Boolean getUseBuildingGeofence() {
            return this.useBuildingGeofence;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final Integer getDownloadExitRegionsRetryCount() {
            return this.downloadExitRegionsRetryCount;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final String getExitRegionTriggerType() {
            return this.exitRegionTriggerType;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final Double getExitRegionDwellTime() {
            return this.exitRegionDwellTime;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final Double getExitRegionCooldownTime() {
            return this.exitRegionCooldownTime;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Boolean getUseExternalRegion() {
            return this.useExternalRegion;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Boolean getUseExitRegions() {
            return this.useExitRegions;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Boolean getUseCharging() {
            return this.useCharging;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Double getGeofenceMaxDistanceMeters() {
            return this.geofenceMaxDistanceMeters;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Integer getExternalRegionSlidingWindowSize() {
            return this.externalRegionSlidingWindowSize;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Double getExternalMaxDistanceFromBuildingMeters() {
            return this.externalMaxDistanceFromBuildingMeters;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final Integer getExternalRequiredConsistentAttemptsToStop() {
            return this.externalRequiredConsistentAttemptsToStop;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final Double getDownloadExitRegionsRetryInterval() {
            return this.downloadExitRegionsRetryInterval;
        }

        @NotNull
        public final AutoStopResponse copy(@Nullable Boolean useBuildingGeofence, @Nullable Boolean useExternalRegion, @Nullable Boolean useExitRegions, @Nullable Boolean useCharging, @Nullable Double geofenceMaxDistanceMeters, @Nullable Integer externalRegionSlidingWindowSize, @Nullable Double externalMaxDistanceFromBuildingMeters, @Nullable Integer externalRequiredConsistentAttemptsToStop, @Nullable Double downloadExitRegionsRetryInterval, @Nullable Integer downloadExitRegionsRetryCount, @Nullable String exitRegionTriggerType, @Nullable Double exitRegionDwellTime, @Nullable Double exitRegionCooldownTime) {
            return new AutoStopResponse(useBuildingGeofence, useExternalRegion, useExitRegions, useCharging, geofenceMaxDistanceMeters, externalRegionSlidingWindowSize, externalMaxDistanceFromBuildingMeters, externalRequiredConsistentAttemptsToStop, downloadExitRegionsRetryInterval, downloadExitRegionsRetryCount, exitRegionTriggerType, exitRegionDwellTime, exitRegionCooldownTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoStopResponse)) {
                return false;
            }
            AutoStopResponse autoStopResponse = (AutoStopResponse) other;
            return Intrinsics.c(this.useBuildingGeofence, autoStopResponse.useBuildingGeofence) && Intrinsics.c(this.useExternalRegion, autoStopResponse.useExternalRegion) && Intrinsics.c(this.useExitRegions, autoStopResponse.useExitRegions) && Intrinsics.c(this.useCharging, autoStopResponse.useCharging) && Intrinsics.c(this.geofenceMaxDistanceMeters, autoStopResponse.geofenceMaxDistanceMeters) && Intrinsics.c(this.externalRegionSlidingWindowSize, autoStopResponse.externalRegionSlidingWindowSize) && Intrinsics.c(this.externalMaxDistanceFromBuildingMeters, autoStopResponse.externalMaxDistanceFromBuildingMeters) && Intrinsics.c(this.externalRequiredConsistentAttemptsToStop, autoStopResponse.externalRequiredConsistentAttemptsToStop) && Intrinsics.c(this.downloadExitRegionsRetryInterval, autoStopResponse.downloadExitRegionsRetryInterval) && Intrinsics.c(this.downloadExitRegionsRetryCount, autoStopResponse.downloadExitRegionsRetryCount) && Intrinsics.c(this.exitRegionTriggerType, autoStopResponse.exitRegionTriggerType) && Intrinsics.c(this.exitRegionDwellTime, autoStopResponse.exitRegionDwellTime) && Intrinsics.c(this.exitRegionCooldownTime, autoStopResponse.exitRegionCooldownTime);
        }

        @Nullable
        public final Integer getDownloadExitRegionsRetryCount() {
            return this.downloadExitRegionsRetryCount;
        }

        @Nullable
        public final Double getDownloadExitRegionsRetryInterval() {
            return this.downloadExitRegionsRetryInterval;
        }

        @Nullable
        public final Double getExitRegionCooldownTime() {
            return this.exitRegionCooldownTime;
        }

        @Nullable
        public final Double getExitRegionDwellTime() {
            return this.exitRegionDwellTime;
        }

        @Nullable
        public final String getExitRegionTriggerType() {
            return this.exitRegionTriggerType;
        }

        @Nullable
        public final Double getExternalMaxDistanceFromBuildingMeters() {
            return this.externalMaxDistanceFromBuildingMeters;
        }

        @Nullable
        public final Integer getExternalRegionSlidingWindowSize() {
            return this.externalRegionSlidingWindowSize;
        }

        @Nullable
        public final Integer getExternalRequiredConsistentAttemptsToStop() {
            return this.externalRequiredConsistentAttemptsToStop;
        }

        @Nullable
        public final Double getGeofenceMaxDistanceMeters() {
            return this.geofenceMaxDistanceMeters;
        }

        @Nullable
        public final Boolean getUseBuildingGeofence() {
            return this.useBuildingGeofence;
        }

        @Nullable
        public final Boolean getUseCharging() {
            return this.useCharging;
        }

        @Nullable
        public final Boolean getUseExitRegions() {
            return this.useExitRegions;
        }

        @Nullable
        public final Boolean getUseExternalRegion() {
            return this.useExternalRegion;
        }

        public int hashCode() {
            Boolean bool = this.useBuildingGeofence;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.useExternalRegion;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.useExitRegions;
            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.useCharging;
            int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Double d = this.geofenceMaxDistanceMeters;
            int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
            Integer num = this.externalRegionSlidingWindowSize;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Double d2 = this.externalMaxDistanceFromBuildingMeters;
            int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
            Integer num2 = this.externalRequiredConsistentAttemptsToStop;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d3 = this.downloadExitRegionsRetryInterval;
            int iHashCode9 = (iHashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
            Integer num3 = this.downloadExitRegionsRetryCount;
            int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str = this.exitRegionTriggerType;
            int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            Double d4 = this.exitRegionDwellTime;
            int iHashCode12 = (iHashCode11 + (d4 == null ? 0 : d4.hashCode())) * 31;
            Double d5 = this.exitRegionCooldownTime;
            return iHashCode12 + (d5 != null ? d5.hashCode() : 0);
        }

        @NotNull
        public final PositioningConfig.AutoStop toAutoStop() {
            Boolean bool = this.useBuildingGeofence;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.useExternalRegion;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = this.useExitRegions;
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            Boolean bool4 = this.useCharging;
            boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
            Double d = this.geofenceMaxDistanceMeters;
            double dDoubleValue = d != null ? d.doubleValue() : 2000.0d;
            Double d2 = this.downloadExitRegionsRetryInterval;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 10.0d;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = (long) (dDoubleValue2 * timeUnit.toMillis(1L));
            Integer num = this.downloadExitRegionsRetryCount;
            int iIntValue = num != null ? num.intValue() : 5;
            a aVar = PositioningConfig.AutoStop.ExitRegionTriggerType.Companion;
            String str = this.exitRegionTriggerType;
            if (str == null) {
                str = "exit";
            }
            aVar.getClass();
            PositioningConfig.AutoStop.ExitRegionTriggerType exitRegionTriggerType = PositioningConfig.AutoStop.ExitRegionTriggerType.ENTER;
            if (!str.equals(exitRegionTriggerType.getRawValue())) {
                exitRegionTriggerType = PositioningConfig.AutoStop.ExitRegionTriggerType.DWELL;
                if (!str.equals(exitRegionTriggerType.getRawValue())) {
                    exitRegionTriggerType = PositioningConfig.AutoStop.ExitRegionTriggerType.EXIT;
                    str.equals(exitRegionTriggerType.getRawValue());
                }
            }
            PositioningConfig.AutoStop.ExitRegionTriggerType exitRegionTriggerType2 = exitRegionTriggerType;
            Double d3 = this.exitRegionDwellTime;
            boolean z = zBooleanValue;
            boolean z2 = zBooleanValue4;
            boolean z3 = zBooleanValue2;
            long jDoubleValue = (long) ((d3 != null ? d3.doubleValue() : 5.0d) * timeUnit.toMillis(1L));
            Double d4 = this.exitRegionCooldownTime;
            return new PositioningConfig.AutoStop(z, z3, zBooleanValue3, z2, dDoubleValue, 20, 3000.0d, 3, millis, iIntValue, exitRegionTriggerType2, jDoubleValue, (long) ((d4 != null ? d4.doubleValue() : 1.0d) * timeUnit.toMillis(1L)));
        }

        @NotNull
        public String toString() {
            return "AutoStopResponse(useBuildingGeofence=" + this.useBuildingGeofence + ", useExternalRegion=" + this.useExternalRegion + ", useExitRegions=" + this.useExitRegions + ", useCharging=" + this.useCharging + ", geofenceMaxDistanceMeters=" + this.geofenceMaxDistanceMeters + ", externalRegionSlidingWindowSize=" + this.externalRegionSlidingWindowSize + ", externalMaxDistanceFromBuildingMeters=" + this.externalMaxDistanceFromBuildingMeters + ", externalRequiredConsistentAttemptsToStop=" + this.externalRequiredConsistentAttemptsToStop + ", downloadExitRegionsRetryInterval=" + this.downloadExitRegionsRetryInterval + ", downloadExitRegionsRetryCount=" + this.downloadExitRegionsRetryCount + ", exitRegionTriggerType=" + this.exitRegionTriggerType + ", exitRegionDwellTime=" + this.exitRegionDwellTime + ", exitRegionCooldownTime=" + this.exitRegionCooldownTime + ')';
        }

        @Deprecated
        public /* synthetic */ AutoStopResponse(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Double d, Integer num, Double d2, Integer num2, Double d3, Integer num3, String str, Double d4, Double d5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.useBuildingGeofence = null;
            } else {
                this.useBuildingGeofence = bool;
            }
            if ((i & 2) == 0) {
                this.useExternalRegion = null;
            } else {
                this.useExternalRegion = bool2;
            }
            if ((i & 4) == 0) {
                this.useExitRegions = null;
            } else {
                this.useExitRegions = bool3;
            }
            if ((i & 8) == 0) {
                this.useCharging = null;
            } else {
                this.useCharging = bool4;
            }
            if ((i & 16) == 0) {
                this.geofenceMaxDistanceMeters = null;
            } else {
                this.geofenceMaxDistanceMeters = d;
            }
            if ((i & 32) == 0) {
                this.externalRegionSlidingWindowSize = null;
            } else {
                this.externalRegionSlidingWindowSize = num;
            }
            if ((i & 64) == 0) {
                this.externalMaxDistanceFromBuildingMeters = null;
            } else {
                this.externalMaxDistanceFromBuildingMeters = d2;
            }
            if ((i & 128) == 0) {
                this.externalRequiredConsistentAttemptsToStop = null;
            } else {
                this.externalRequiredConsistentAttemptsToStop = num2;
            }
            if ((i & 256) == 0) {
                this.downloadExitRegionsRetryInterval = null;
            } else {
                this.downloadExitRegionsRetryInterval = d3;
            }
            if ((i & 512) == 0) {
                this.downloadExitRegionsRetryCount = null;
            } else {
                this.downloadExitRegionsRetryCount = num3;
            }
            if ((i & 1024) == 0) {
                this.exitRegionTriggerType = null;
            } else {
                this.exitRegionTriggerType = str;
            }
            if ((i & 2048) == 0) {
                this.exitRegionDwellTime = null;
            } else {
                this.exitRegionDwellTime = d4;
            }
            if ((i & 4096) == 0) {
                this.exitRegionCooldownTime = null;
            } else {
                this.exitRegionCooldownTime = d5;
            }
        }

        public AutoStopResponse(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Double d, @Nullable Integer num, @Nullable Double d2, @Nullable Integer num2, @Nullable Double d3, @Nullable Integer num3, @Nullable String str, @Nullable Double d4, @Nullable Double d5) {
            this.useBuildingGeofence = bool;
            this.useExternalRegion = bool2;
            this.useExitRegions = bool3;
            this.useCharging = bool4;
            this.geofenceMaxDistanceMeters = d;
            this.externalRegionSlidingWindowSize = num;
            this.externalMaxDistanceFromBuildingMeters = d2;
            this.externalRequiredConsistentAttemptsToStop = num2;
            this.downloadExitRegionsRetryInterval = d3;
            this.downloadExitRegionsRetryCount = num3;
            this.exitRegionTriggerType = str;
            this.exitRegionDwellTime = d4;
            this.exitRegionCooldownTime = d5;
        }

        public /* synthetic */ AutoStopResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Double d, Integer num, Double d2, Integer num2, Double d3, Integer num3, String str, Double d4, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : d3, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : d4, (i & 4096) != 0 ? null : d5);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PositioningConfigResponse> serializer() {
            return PositioningConfigResponse$$serializer.INSTANCE;
        }
    }

    public PositioningConfigResponse() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (Boolean) null, (Double) null, (Double) null, (List) null, (Double) null, (AutoStopResponse) null, 4194303, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PositioningConfigResponse copy$default(PositioningConfigResponse positioningConfigResponse, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Double d, Double d2, Double d3, Double d4, Boolean bool5, Double d5, Boolean bool6, Double d6, Double d7, Double d8, Double d9, Boolean bool7, Boolean bool8, Double d10, Double d11, List list, Double d12, AutoStopResponse autoStopResponse, int i, Object obj) {
        AutoStopResponse autoStopResponse2;
        Double d13;
        Boolean bool9 = (i & 1) != 0 ? positioningConfigResponse.isPreheatingEnabledByDefault : bool;
        Boolean bool10 = (i & 2) != 0 ? positioningConfigResponse.enableAutoStartPositioning : bool2;
        Boolean bool11 = (i & 4) != 0 ? positioningConfigResponse.enableAutoCalib : bool3;
        Boolean bool12 = (i & 8) != 0 ? positioningConfigResponse.ignorePublicAPIIsAutomaticCalibrationEnabled : bool4;
        Double d14 = (i & 16) != 0 ? positioningConfigResponse.autoStartPositioningPauseAfterAutoStopMinutes : d;
        Double d15 = (i & 32) != 0 ? positioningConfigResponse.autoStartPositioningPauseAfterErrorMinutes : d2;
        Double d16 = (i & 64) != 0 ? positioningConfigResponse.autoStartPositioningPauseAfterClientStopMinutes : d3;
        Double d17 = (i & 128) != 0 ? positioningConfigResponse.autoStartPositioningPauseAfterClientStartMinutes : d4;
        Boolean bool13 = (i & 256) != 0 ? positioningConfigResponse.enableChargingBasedAutoStartPositioning : bool5;
        Double d18 = (i & 512) != 0 ? positioningConfigResponse.maximumLocationAccuracyToAutoStartMeters : d5;
        Boolean bool14 = (i & 1024) != 0 ? positioningConfigResponse.isAutomaticPositioningPartOfCalibration : bool6;
        Double d19 = (i & 2048) != 0 ? positioningConfigResponse.stopNoMovementSec : d6;
        Double d20 = (i & 4096) != 0 ? positioningConfigResponse.stopBackgroundSec : d7;
        Double d21 = (i & 8192) != 0 ? positioningConfigResponse.positioningSessionTimeoutMinutes : d8;
        Boolean bool15 = bool9;
        Double d22 = (i & 16384) != 0 ? positioningConfigResponse.backgroundCalibrationTimeoutMinutes : d9;
        Boolean bool16 = (i & 32768) != 0 ? positioningConfigResponse.allowPositioningOutOfBuilding : bool7;
        Boolean bool17 = (i & 65536) != 0 ? positioningConfigResponse.allowPositioningWhenLocationIsUnknown : bool8;
        Double d23 = (i & 131072) != 0 ? positioningConfigResponse.maxPositionAgeToEventTagSeconds : d10;
        Double d24 = (i & 262144) != 0 ? positioningConfigResponse.noMovementDelta : d11;
        List list2 = (i & 524288) != 0 ? positioningConfigResponse.supportedCustomEventTagTypes : list;
        Double d25 = (i & 1048576) != 0 ? positioningConfigResponse.secondsSinceChargingToUseKiosk : d12;
        if ((i & 2097152) != 0) {
            d13 = d25;
            autoStopResponse2 = positioningConfigResponse.autoStop;
        } else {
            autoStopResponse2 = autoStopResponse;
            d13 = d25;
        }
        return positioningConfigResponse.copy(bool15, bool10, bool11, bool12, d14, d15, d16, d17, bool13, d18, bool14, d19, d20, d21, d22, bool16, bool17, d23, d24, list2, d13, autoStopResponse2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(PositioningConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.isPreheatingEnabledByDefault != null) {
            output.w(serialDesc, 0, BooleanSerializer.f24779a, self.isPreheatingEnabledByDefault);
        }
        if (output.q(serialDesc, 1) || self.enableAutoStartPositioning != null) {
            output.w(serialDesc, 1, BooleanSerializer.f24779a, self.enableAutoStartPositioning);
        }
        if (output.q(serialDesc, 2) || self.enableAutoCalib != null) {
            output.w(serialDesc, 2, BooleanSerializer.f24779a, self.enableAutoCalib);
        }
        if (output.q(serialDesc, 3) || self.ignorePublicAPIIsAutomaticCalibrationEnabled != null) {
            output.w(serialDesc, 3, BooleanSerializer.f24779a, self.ignorePublicAPIIsAutomaticCalibrationEnabled);
        }
        if (output.q(serialDesc, 4) || self.autoStartPositioningPauseAfterAutoStopMinutes != null) {
            output.w(serialDesc, 4, DoubleSerializer.f24792a, self.autoStartPositioningPauseAfterAutoStopMinutes);
        }
        if (output.q(serialDesc, 5) || self.autoStartPositioningPauseAfterErrorMinutes != null) {
            output.w(serialDesc, 5, DoubleSerializer.f24792a, self.autoStartPositioningPauseAfterErrorMinutes);
        }
        if (output.q(serialDesc, 6) || self.autoStartPositioningPauseAfterClientStopMinutes != null) {
            output.w(serialDesc, 6, DoubleSerializer.f24792a, self.autoStartPositioningPauseAfterClientStopMinutes);
        }
        if (output.q(serialDesc, 7) || self.autoStartPositioningPauseAfterClientStartMinutes != null) {
            output.w(serialDesc, 7, DoubleSerializer.f24792a, self.autoStartPositioningPauseAfterClientStartMinutes);
        }
        if (output.q(serialDesc, 8) || self.enableChargingBasedAutoStartPositioning != null) {
            output.w(serialDesc, 8, BooleanSerializer.f24779a, self.enableChargingBasedAutoStartPositioning);
        }
        if (output.q(serialDesc, 9) || self.maximumLocationAccuracyToAutoStartMeters != null) {
            output.w(serialDesc, 9, DoubleSerializer.f24792a, self.maximumLocationAccuracyToAutoStartMeters);
        }
        if (output.q(serialDesc, 10) || self.isAutomaticPositioningPartOfCalibration != null) {
            output.w(serialDesc, 10, BooleanSerializer.f24779a, self.isAutomaticPositioningPartOfCalibration);
        }
        if (output.q(serialDesc, 11) || self.stopNoMovementSec != null) {
            output.w(serialDesc, 11, DoubleSerializer.f24792a, self.stopNoMovementSec);
        }
        if (output.q(serialDesc, 12) || self.stopBackgroundSec != null) {
            output.w(serialDesc, 12, DoubleSerializer.f24792a, self.stopBackgroundSec);
        }
        if (output.q(serialDesc, 13) || self.positioningSessionTimeoutMinutes != null) {
            output.w(serialDesc, 13, DoubleSerializer.f24792a, self.positioningSessionTimeoutMinutes);
        }
        if (output.q(serialDesc, 14) || self.backgroundCalibrationTimeoutMinutes != null) {
            output.w(serialDesc, 14, DoubleSerializer.f24792a, self.backgroundCalibrationTimeoutMinutes);
        }
        if (output.q(serialDesc, 15) || self.allowPositioningOutOfBuilding != null) {
            output.w(serialDesc, 15, BooleanSerializer.f24779a, self.allowPositioningOutOfBuilding);
        }
        if (output.q(serialDesc, 16) || self.allowPositioningWhenLocationIsUnknown != null) {
            output.w(serialDesc, 16, BooleanSerializer.f24779a, self.allowPositioningWhenLocationIsUnknown);
        }
        if (output.q(serialDesc, 17) || self.maxPositionAgeToEventTagSeconds != null) {
            output.w(serialDesc, 17, DoubleSerializer.f24792a, self.maxPositionAgeToEventTagSeconds);
        }
        if (output.q(serialDesc, 18) || self.noMovementDelta != null) {
            output.w(serialDesc, 18, DoubleSerializer.f24792a, self.noMovementDelta);
        }
        if (output.q(serialDesc, 19) || self.supportedCustomEventTagTypes != null) {
            output.w(serialDesc, 19, kSerializerArr[19], self.supportedCustomEventTagTypes);
        }
        if (output.q(serialDesc, 20) || self.secondsSinceChargingToUseKiosk != null) {
            output.w(serialDesc, 20, DoubleSerializer.f24792a, self.secondsSinceChargingToUseKiosk);
        }
        if (!output.q(serialDesc, 21) && self.autoStop == null) {
            return;
        }
        output.w(serialDesc, 21, PositioningConfigResponse$AutoStopResponse$$serializer.INSTANCE, self.autoStop);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsPreheatingEnabledByDefault() {
        return this.isPreheatingEnabledByDefault;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getMaximumLocationAccuracyToAutoStartMeters() {
        return this.maximumLocationAccuracyToAutoStartMeters;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getIsAutomaticPositioningPartOfCalibration() {
        return this.isAutomaticPositioningPartOfCalibration;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getStopNoMovementSec() {
        return this.stopNoMovementSec;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getStopBackgroundSec() {
        return this.stopBackgroundSec;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getPositioningSessionTimeoutMinutes() {
        return this.positioningSessionTimeoutMinutes;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getBackgroundCalibrationTimeoutMinutes() {
        return this.backgroundCalibrationTimeoutMinutes;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getAllowPositioningOutOfBuilding() {
        return this.allowPositioningOutOfBuilding;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Boolean getAllowPositioningWhenLocationIsUnknown() {
        return this.allowPositioningWhenLocationIsUnknown;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Double getMaxPositionAgeToEventTagSeconds() {
        return this.maxPositionAgeToEventTagSeconds;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Double getNoMovementDelta() {
        return this.noMovementDelta;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getEnableAutoStartPositioning() {
        return this.enableAutoStartPositioning;
    }

    @Nullable
    public final List<String> component20() {
        return this.supportedCustomEventTagTypes;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Double getSecondsSinceChargingToUseKiosk() {
        return this.secondsSinceChargingToUseKiosk;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final AutoStopResponse getAutoStop() {
        return this.autoStop;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getEnableAutoCalib() {
        return this.enableAutoCalib;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getIgnorePublicAPIIsAutomaticCalibrationEnabled() {
        return this.ignorePublicAPIIsAutomaticCalibrationEnabled;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getAutoStartPositioningPauseAfterAutoStopMinutes() {
        return this.autoStartPositioningPauseAfterAutoStopMinutes;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getAutoStartPositioningPauseAfterErrorMinutes() {
        return this.autoStartPositioningPauseAfterErrorMinutes;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getAutoStartPositioningPauseAfterClientStopMinutes() {
        return this.autoStartPositioningPauseAfterClientStopMinutes;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getAutoStartPositioningPauseAfterClientStartMinutes() {
        return this.autoStartPositioningPauseAfterClientStartMinutes;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getEnableChargingBasedAutoStartPositioning() {
        return this.enableChargingBasedAutoStartPositioning;
    }

    @NotNull
    public final PositioningConfigResponse copy(@Nullable Boolean isPreheatingEnabledByDefault, @Nullable Boolean enableAutoStartPositioning, @Nullable Boolean enableAutoCalib, @Nullable Boolean ignorePublicAPIIsAutomaticCalibrationEnabled, @Nullable Double autoStartPositioningPauseAfterAutoStopMinutes, @Nullable Double autoStartPositioningPauseAfterErrorMinutes, @Nullable Double autoStartPositioningPauseAfterClientStopMinutes, @Nullable Double autoStartPositioningPauseAfterClientStartMinutes, @Nullable Boolean enableChargingBasedAutoStartPositioning, @Nullable Double maximumLocationAccuracyToAutoStartMeters, @Nullable Boolean isAutomaticPositioningPartOfCalibration, @Nullable Double stopNoMovementSec, @Nullable Double stopBackgroundSec, @Nullable Double positioningSessionTimeoutMinutes, @Nullable Double backgroundCalibrationTimeoutMinutes, @Nullable Boolean allowPositioningOutOfBuilding, @Nullable Boolean allowPositioningWhenLocationIsUnknown, @Nullable Double maxPositionAgeToEventTagSeconds, @Nullable Double noMovementDelta, @Nullable List<String> supportedCustomEventTagTypes, @Nullable Double secondsSinceChargingToUseKiosk, @Nullable AutoStopResponse autoStop) {
        return new PositioningConfigResponse(isPreheatingEnabledByDefault, enableAutoStartPositioning, enableAutoCalib, ignorePublicAPIIsAutomaticCalibrationEnabled, autoStartPositioningPauseAfterAutoStopMinutes, autoStartPositioningPauseAfterErrorMinutes, autoStartPositioningPauseAfterClientStopMinutes, autoStartPositioningPauseAfterClientStartMinutes, enableChargingBasedAutoStartPositioning, maximumLocationAccuracyToAutoStartMeters, isAutomaticPositioningPartOfCalibration, stopNoMovementSec, stopBackgroundSec, positioningSessionTimeoutMinutes, backgroundCalibrationTimeoutMinutes, allowPositioningOutOfBuilding, allowPositioningWhenLocationIsUnknown, maxPositionAgeToEventTagSeconds, noMovementDelta, supportedCustomEventTagTypes, secondsSinceChargingToUseKiosk, autoStop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositioningConfigResponse)) {
            return false;
        }
        PositioningConfigResponse positioningConfigResponse = (PositioningConfigResponse) other;
        return Intrinsics.c(this.isPreheatingEnabledByDefault, positioningConfigResponse.isPreheatingEnabledByDefault) && Intrinsics.c(this.enableAutoStartPositioning, positioningConfigResponse.enableAutoStartPositioning) && Intrinsics.c(this.enableAutoCalib, positioningConfigResponse.enableAutoCalib) && Intrinsics.c(this.ignorePublicAPIIsAutomaticCalibrationEnabled, positioningConfigResponse.ignorePublicAPIIsAutomaticCalibrationEnabled) && Intrinsics.c(this.autoStartPositioningPauseAfterAutoStopMinutes, positioningConfigResponse.autoStartPositioningPauseAfterAutoStopMinutes) && Intrinsics.c(this.autoStartPositioningPauseAfterErrorMinutes, positioningConfigResponse.autoStartPositioningPauseAfterErrorMinutes) && Intrinsics.c(this.autoStartPositioningPauseAfterClientStopMinutes, positioningConfigResponse.autoStartPositioningPauseAfterClientStopMinutes) && Intrinsics.c(this.autoStartPositioningPauseAfterClientStartMinutes, positioningConfigResponse.autoStartPositioningPauseAfterClientStartMinutes) && Intrinsics.c(this.enableChargingBasedAutoStartPositioning, positioningConfigResponse.enableChargingBasedAutoStartPositioning) && Intrinsics.c(this.maximumLocationAccuracyToAutoStartMeters, positioningConfigResponse.maximumLocationAccuracyToAutoStartMeters) && Intrinsics.c(this.isAutomaticPositioningPartOfCalibration, positioningConfigResponse.isAutomaticPositioningPartOfCalibration) && Intrinsics.c(this.stopNoMovementSec, positioningConfigResponse.stopNoMovementSec) && Intrinsics.c(this.stopBackgroundSec, positioningConfigResponse.stopBackgroundSec) && Intrinsics.c(this.positioningSessionTimeoutMinutes, positioningConfigResponse.positioningSessionTimeoutMinutes) && Intrinsics.c(this.backgroundCalibrationTimeoutMinutes, positioningConfigResponse.backgroundCalibrationTimeoutMinutes) && Intrinsics.c(this.allowPositioningOutOfBuilding, positioningConfigResponse.allowPositioningOutOfBuilding) && Intrinsics.c(this.allowPositioningWhenLocationIsUnknown, positioningConfigResponse.allowPositioningWhenLocationIsUnknown) && Intrinsics.c(this.maxPositionAgeToEventTagSeconds, positioningConfigResponse.maxPositionAgeToEventTagSeconds) && Intrinsics.c(this.noMovementDelta, positioningConfigResponse.noMovementDelta) && Intrinsics.c(this.supportedCustomEventTagTypes, positioningConfigResponse.supportedCustomEventTagTypes) && Intrinsics.c(this.secondsSinceChargingToUseKiosk, positioningConfigResponse.secondsSinceChargingToUseKiosk) && Intrinsics.c(this.autoStop, positioningConfigResponse.autoStop);
    }

    @Nullable
    public final Boolean getAllowPositioningOutOfBuilding() {
        return this.allowPositioningOutOfBuilding;
    }

    @Nullable
    public final Boolean getAllowPositioningWhenLocationIsUnknown() {
        return this.allowPositioningWhenLocationIsUnknown;
    }

    @Nullable
    public final Double getAutoStartPositioningPauseAfterAutoStopMinutes() {
        return this.autoStartPositioningPauseAfterAutoStopMinutes;
    }

    @Nullable
    public final Double getAutoStartPositioningPauseAfterClientStartMinutes() {
        return this.autoStartPositioningPauseAfterClientStartMinutes;
    }

    @Nullable
    public final Double getAutoStartPositioningPauseAfterClientStopMinutes() {
        return this.autoStartPositioningPauseAfterClientStopMinutes;
    }

    @Nullable
    public final Double getAutoStartPositioningPauseAfterErrorMinutes() {
        return this.autoStartPositioningPauseAfterErrorMinutes;
    }

    @Nullable
    public final AutoStopResponse getAutoStop() {
        return this.autoStop;
    }

    @Nullable
    public final Double getBackgroundCalibrationTimeoutMinutes() {
        return this.backgroundCalibrationTimeoutMinutes;
    }

    @Nullable
    public final Boolean getEnableAutoCalib() {
        return this.enableAutoCalib;
    }

    @Nullable
    public final Boolean getEnableAutoStartPositioning() {
        return this.enableAutoStartPositioning;
    }

    @Nullable
    public final Boolean getEnableChargingBasedAutoStartPositioning() {
        return this.enableChargingBasedAutoStartPositioning;
    }

    @Nullable
    public final Boolean getIgnorePublicAPIIsAutomaticCalibrationEnabled() {
        return this.ignorePublicAPIIsAutomaticCalibrationEnabled;
    }

    @Nullable
    public final Double getMaxPositionAgeToEventTagSeconds() {
        return this.maxPositionAgeToEventTagSeconds;
    }

    @Nullable
    public final Double getMaximumLocationAccuracyToAutoStartMeters() {
        return this.maximumLocationAccuracyToAutoStartMeters;
    }

    @Nullable
    public final Double getNoMovementDelta() {
        return this.noMovementDelta;
    }

    @Nullable
    public final Double getPositioningSessionTimeoutMinutes() {
        return this.positioningSessionTimeoutMinutes;
    }

    @Nullable
    public final Double getSecondsSinceChargingToUseKiosk() {
        return this.secondsSinceChargingToUseKiosk;
    }

    @Nullable
    public final Double getStopBackgroundSec() {
        return this.stopBackgroundSec;
    }

    @Nullable
    public final Double getStopNoMovementSec() {
        return this.stopNoMovementSec;
    }

    @Nullable
    public final List<String> getSupportedCustomEventTagTypes() {
        return this.supportedCustomEventTagTypes;
    }

    public int hashCode() {
        Boolean bool = this.isPreheatingEnabledByDefault;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableAutoStartPositioning;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableAutoCalib;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.ignorePublicAPIIsAutomaticCalibrationEnabled;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Double d = this.autoStartPositioningPauseAfterAutoStopMinutes;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.autoStartPositioningPauseAfterErrorMinutes;
        int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.autoStartPositioningPauseAfterClientStopMinutes;
        int iHashCode7 = (iHashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.autoStartPositioningPauseAfterClientStartMinutes;
        int iHashCode8 = (iHashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Boolean bool5 = this.enableChargingBasedAutoStartPositioning;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Double d5 = this.maximumLocationAccuracyToAutoStartMeters;
        int iHashCode10 = (iHashCode9 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Boolean bool6 = this.isAutomaticPositioningPartOfCalibration;
        int iHashCode11 = (iHashCode10 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Double d6 = this.stopNoMovementSec;
        int iHashCode12 = (iHashCode11 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.stopBackgroundSec;
        int iHashCode13 = (iHashCode12 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.positioningSessionTimeoutMinutes;
        int iHashCode14 = (iHashCode13 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.backgroundCalibrationTimeoutMinutes;
        int iHashCode15 = (iHashCode14 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Boolean bool7 = this.allowPositioningOutOfBuilding;
        int iHashCode16 = (iHashCode15 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.allowPositioningWhenLocationIsUnknown;
        int iHashCode17 = (iHashCode16 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Double d10 = this.maxPositionAgeToEventTagSeconds;
        int iHashCode18 = (iHashCode17 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.noMovementDelta;
        int iHashCode19 = (iHashCode18 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<String> list = this.supportedCustomEventTagTypes;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        Double d12 = this.secondsSinceChargingToUseKiosk;
        int iHashCode21 = (iHashCode20 + (d12 == null ? 0 : d12.hashCode())) * 31;
        AutoStopResponse autoStopResponse = this.autoStop;
        return iHashCode21 + (autoStopResponse != null ? autoStopResponse.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAutomaticPositioningPartOfCalibration() {
        return this.isAutomaticPositioningPartOfCalibration;
    }

    @Nullable
    public final Boolean isPreheatingEnabledByDefault() {
        return this.isPreheatingEnabledByDefault;
    }

    @NotNull
    public final PositioningConfig toPositioningConfig() {
        Boolean bool = this.isPreheatingEnabledByDefault;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = this.allowPositioningOutOfBuilding;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Boolean bool3 = this.allowPositioningWhenLocationIsUnknown;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        Boolean bool4 = this.enableAutoStartPositioning;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = this.enableAutoCalib;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : true;
        Boolean bool6 = this.ignorePublicAPIIsAutomaticCalibrationEnabled;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        Boolean bool7 = this.enableChargingBasedAutoStartPositioning;
        boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        Double d = this.autoStartPositioningPauseAfterAutoStopMinutes;
        double dDoubleValue = d != null ? d.doubleValue() : 5.0d;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = (long) (dDoubleValue * timeUnit.toMillis(1L));
        Double d2 = this.autoStartPositioningPauseAfterErrorMinutes;
        long jDoubleValue = (long) ((d2 != null ? d2.doubleValue() : 5.0d) * timeUnit.toMillis(1L));
        Double d3 = this.autoStartPositioningPauseAfterClientStopMinutes;
        long jDoubleValue2 = (long) ((d3 != null ? d3.doubleValue() : 120.0d) * timeUnit.toMillis(1L));
        Double d4 = this.autoStartPositioningPauseAfterClientStartMinutes;
        long jDoubleValue3 = (long) ((d4 != null ? d4.doubleValue() : 120.0d) * timeUnit.toMillis(1L));
        Double d5 = this.maximumLocationAccuracyToAutoStartMeters;
        double dDoubleValue2 = d5 != null ? d5.doubleValue() : 50.0d;
        Boolean bool8 = this.isAutomaticPositioningPartOfCalibration;
        boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : true;
        Double d6 = this.positioningSessionTimeoutMinutes;
        long millis2 = (long) (timeUnit.toMillis(1L) * (d6 != null ? d6.doubleValue() : 120.0d));
        Double d7 = this.stopNoMovementSec;
        double dDoubleValue3 = d7 != null ? d7.doubleValue() : 300.0d;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        boolean z = zBooleanValue;
        boolean z2 = zBooleanValue4;
        boolean z3 = zBooleanValue5;
        long millis3 = (long) (dDoubleValue3 * timeUnit2.toMillis(1L));
        Double d8 = this.stopBackgroundSec;
        long jDoubleValue4 = (long) ((d8 != null ? d8.doubleValue() : 1800.0d) * timeUnit2.toMillis(1L));
        Double d9 = this.backgroundCalibrationTimeoutMinutes;
        long jDoubleValue5 = (long) ((d9 != null ? d9.doubleValue() : 10.0d) * timeUnit.toMillis(1L));
        Double d10 = this.maxPositionAgeToEventTagSeconds;
        long jDoubleValue6 = (long) ((d10 != null ? d10.doubleValue() : 15.0d) * timeUnit2.toMillis(1L));
        Double d11 = this.noMovementDelta;
        double dDoubleValue4 = d11 != null ? d11.doubleValue() : 0.1d;
        List list = this.supportedCustomEventTagTypes;
        if (list == null) {
            list = EmptyList.d;
        }
        List list2 = list;
        Double d12 = this.secondsSinceChargingToUseKiosk;
        double dDoubleValue5 = d12 != null ? d12.doubleValue() : 3.0d;
        AutoStopResponse autoStopResponse = this.autoStop;
        if (autoStopResponse == null) {
            autoStopResponse = new AutoStopResponse((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (Integer) null, (Double) null, (Integer) null, (Double) null, (Integer) null, (String) null, (Double) null, (Double) null, 8191, (DefaultConstructorMarker) null);
        }
        return new PositioningConfig(z, z2, z3, zBooleanValue6, zBooleanValue7, millis, jDoubleValue, jDoubleValue2, jDoubleValue3, dDoubleValue2, zBooleanValue8, zBooleanValue2, zBooleanValue3, millis2, millis3, jDoubleValue4, jDoubleValue5, jDoubleValue6, dDoubleValue4, list2, dDoubleValue5, autoStopResponse.toAutoStop());
    }

    @NotNull
    public String toString() {
        return "PositioningConfigResponse(isPreheatingEnabledByDefault=" + this.isPreheatingEnabledByDefault + ", enableAutoStartPositioning=" + this.enableAutoStartPositioning + ", enableAutoCalib=" + this.enableAutoCalib + ", ignorePublicAPIIsAutomaticCalibrationEnabled=" + this.ignorePublicAPIIsAutomaticCalibrationEnabled + ", autoStartPositioningPauseAfterAutoStopMinutes=" + this.autoStartPositioningPauseAfterAutoStopMinutes + ", autoStartPositioningPauseAfterErrorMinutes=" + this.autoStartPositioningPauseAfterErrorMinutes + ", autoStartPositioningPauseAfterClientStopMinutes=" + this.autoStartPositioningPauseAfterClientStopMinutes + ", autoStartPositioningPauseAfterClientStartMinutes=" + this.autoStartPositioningPauseAfterClientStartMinutes + ", enableChargingBasedAutoStartPositioning=" + this.enableChargingBasedAutoStartPositioning + ", maximumLocationAccuracyToAutoStartMeters=" + this.maximumLocationAccuracyToAutoStartMeters + ", isAutomaticPositioningPartOfCalibration=" + this.isAutomaticPositioningPartOfCalibration + ", stopNoMovementSec=" + this.stopNoMovementSec + ", stopBackgroundSec=" + this.stopBackgroundSec + ", positioningSessionTimeoutMinutes=" + this.positioningSessionTimeoutMinutes + ", backgroundCalibrationTimeoutMinutes=" + this.backgroundCalibrationTimeoutMinutes + ", allowPositioningOutOfBuilding=" + this.allowPositioningOutOfBuilding + ", allowPositioningWhenLocationIsUnknown=" + this.allowPositioningWhenLocationIsUnknown + ", maxPositionAgeToEventTagSeconds=" + this.maxPositionAgeToEventTagSeconds + ", noMovementDelta=" + this.noMovementDelta + ", supportedCustomEventTagTypes=" + this.supportedCustomEventTagTypes + ", secondsSinceChargingToUseKiosk=" + this.secondsSinceChargingToUseKiosk + ", autoStop=" + this.autoStop + ')';
    }

    @Deprecated
    public /* synthetic */ PositioningConfigResponse(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Double d, Double d2, Double d3, Double d4, Boolean bool5, Double d5, Boolean bool6, Double d6, Double d7, Double d8, Double d9, Boolean bool7, Boolean bool8, Double d10, Double d11, List list, Double d12, AutoStopResponse autoStopResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isPreheatingEnabledByDefault = null;
        } else {
            this.isPreheatingEnabledByDefault = bool;
        }
        if ((i & 2) == 0) {
            this.enableAutoStartPositioning = null;
        } else {
            this.enableAutoStartPositioning = bool2;
        }
        if ((i & 4) == 0) {
            this.enableAutoCalib = null;
        } else {
            this.enableAutoCalib = bool3;
        }
        if ((i & 8) == 0) {
            this.ignorePublicAPIIsAutomaticCalibrationEnabled = null;
        } else {
            this.ignorePublicAPIIsAutomaticCalibrationEnabled = bool4;
        }
        if ((i & 16) == 0) {
            this.autoStartPositioningPauseAfterAutoStopMinutes = null;
        } else {
            this.autoStartPositioningPauseAfterAutoStopMinutes = d;
        }
        if ((i & 32) == 0) {
            this.autoStartPositioningPauseAfterErrorMinutes = null;
        } else {
            this.autoStartPositioningPauseAfterErrorMinutes = d2;
        }
        if ((i & 64) == 0) {
            this.autoStartPositioningPauseAfterClientStopMinutes = null;
        } else {
            this.autoStartPositioningPauseAfterClientStopMinutes = d3;
        }
        if ((i & 128) == 0) {
            this.autoStartPositioningPauseAfterClientStartMinutes = null;
        } else {
            this.autoStartPositioningPauseAfterClientStartMinutes = d4;
        }
        if ((i & 256) == 0) {
            this.enableChargingBasedAutoStartPositioning = null;
        } else {
            this.enableChargingBasedAutoStartPositioning = bool5;
        }
        if ((i & 512) == 0) {
            this.maximumLocationAccuracyToAutoStartMeters = null;
        } else {
            this.maximumLocationAccuracyToAutoStartMeters = d5;
        }
        if ((i & 1024) == 0) {
            this.isAutomaticPositioningPartOfCalibration = null;
        } else {
            this.isAutomaticPositioningPartOfCalibration = bool6;
        }
        if ((i & 2048) == 0) {
            this.stopNoMovementSec = null;
        } else {
            this.stopNoMovementSec = d6;
        }
        if ((i & 4096) == 0) {
            this.stopBackgroundSec = null;
        } else {
            this.stopBackgroundSec = d7;
        }
        if ((i & 8192) == 0) {
            this.positioningSessionTimeoutMinutes = null;
        } else {
            this.positioningSessionTimeoutMinutes = d8;
        }
        if ((i & 16384) == 0) {
            this.backgroundCalibrationTimeoutMinutes = null;
        } else {
            this.backgroundCalibrationTimeoutMinutes = d9;
        }
        if ((32768 & i) == 0) {
            this.allowPositioningOutOfBuilding = null;
        } else {
            this.allowPositioningOutOfBuilding = bool7;
        }
        if ((65536 & i) == 0) {
            this.allowPositioningWhenLocationIsUnknown = null;
        } else {
            this.allowPositioningWhenLocationIsUnknown = bool8;
        }
        if ((131072 & i) == 0) {
            this.maxPositionAgeToEventTagSeconds = null;
        } else {
            this.maxPositionAgeToEventTagSeconds = d10;
        }
        if ((262144 & i) == 0) {
            this.noMovementDelta = null;
        } else {
            this.noMovementDelta = d11;
        }
        if ((524288 & i) == 0) {
            this.supportedCustomEventTagTypes = null;
        } else {
            this.supportedCustomEventTagTypes = list;
        }
        if ((1048576 & i) == 0) {
            this.secondsSinceChargingToUseKiosk = null;
        } else {
            this.secondsSinceChargingToUseKiosk = d12;
        }
        if ((i & 2097152) == 0) {
            this.autoStop = null;
        } else {
            this.autoStop = autoStopResponse;
        }
    }

    public PositioningConfigResponse(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Boolean bool5, @Nullable Double d5, @Nullable Boolean bool6, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Double d10, @Nullable Double d11, @Nullable List<String> list, @Nullable Double d12, @Nullable AutoStopResponse autoStopResponse) {
        this.isPreheatingEnabledByDefault = bool;
        this.enableAutoStartPositioning = bool2;
        this.enableAutoCalib = bool3;
        this.ignorePublicAPIIsAutomaticCalibrationEnabled = bool4;
        this.autoStartPositioningPauseAfterAutoStopMinutes = d;
        this.autoStartPositioningPauseAfterErrorMinutes = d2;
        this.autoStartPositioningPauseAfterClientStopMinutes = d3;
        this.autoStartPositioningPauseAfterClientStartMinutes = d4;
        this.enableChargingBasedAutoStartPositioning = bool5;
        this.maximumLocationAccuracyToAutoStartMeters = d5;
        this.isAutomaticPositioningPartOfCalibration = bool6;
        this.stopNoMovementSec = d6;
        this.stopBackgroundSec = d7;
        this.positioningSessionTimeoutMinutes = d8;
        this.backgroundCalibrationTimeoutMinutes = d9;
        this.allowPositioningOutOfBuilding = bool7;
        this.allowPositioningWhenLocationIsUnknown = bool8;
        this.maxPositionAgeToEventTagSeconds = d10;
        this.noMovementDelta = d11;
        this.supportedCustomEventTagTypes = list;
        this.secondsSinceChargingToUseKiosk = d12;
        this.autoStop = autoStopResponse;
    }

    public /* synthetic */ PositioningConfigResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Double d, Double d2, Double d3, Double d4, Boolean bool5, Double d5, Boolean bool6, Double d6, Double d7, Double d8, Double d9, Boolean bool7, Boolean bool8, Double d10, Double d11, List list, Double d12, AutoStopResponse autoStopResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : d2, (i & 64) != 0 ? null : d3, (i & 128) != 0 ? null : d4, (i & 256) != 0 ? null : bool5, (i & 512) != 0 ? null : d5, (i & 1024) != 0 ? null : bool6, (i & 2048) != 0 ? null : d6, (i & 4096) != 0 ? null : d7, (i & 8192) != 0 ? null : d8, (i & 16384) != 0 ? null : d9, (i & 32768) != 0 ? null : bool7, (i & 65536) != 0 ? null : bool8, (i & 131072) != 0 ? null : d10, (i & 262144) != 0 ? null : d11, (i & 524288) != 0 ? null : list, (i & 1048576) != 0 ? null : d12, (i & 2097152) != 0 ? null : autoStopResponse);
    }
}
