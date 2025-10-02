package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002\\]B¹\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 B\u009d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0002\u0010!J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0016HÆ\u0003J\t\u0010A\u001a\u00020\u0018HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u001cHÆ\u0003J\t\u0010E\u001a\u00020\u001cHÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\t\u0010M\u001a\u00020\u000fHÆ\u0003JÇ\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cHÆ\u0001J\u0013\u0010O\u001a\u00020\u00052\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\t\u0010R\u001a\u00020SHÖ\u0001J&\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZHÁ\u0001¢\u0006\u0002\b[R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010#R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010#R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u001d\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006^"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "", "seen1", "", "enableLocationReporting", "", "locationReportingIntervalSeconds", "", "locationReportingTimeoutSeconds", "locationReportingTimeoutsToFail", "isSmartCartMode", "modelFetchRetryIntervalSeconds", "modelFetchRetryCount", "mapGridUrlExpirationTimeMinutes", "mapGridFetchingStrategy", "Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;", "mapGridType", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "engineSessionFetchRetryCount", "engineSessionFetchRetryIntervalSeconds", "engineSessionRefreshIntervalBeforeExpirationSeconds", "specificConfig", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "mainOrientationCalculator", "Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfig;", "isPositioningDebuggingEnabled", "locationReportingQueueLimit", "locationReportingConnectionRetryInitialIntervalMillis", "", "locationReportingConnectionRetryMaxIntervalMillis", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZDDIZDIDLme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;Lme/oriient/internal/services/dataModel/engine/MapGridType;IDDLme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfig;ZIJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZDDIZDIDLme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;Lme/oriient/internal/services/dataModel/engine/MapGridType;IDDLme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfig;ZIJJ)V", "getEnableLocationReporting", "()Z", "getEngineSessionFetchRetryCount", "()I", "getEngineSessionFetchRetryIntervalSeconds", "()D", "getEngineSessionRefreshIntervalBeforeExpirationSeconds", "getLocationReportingConnectionRetryInitialIntervalMillis", "()J", "getLocationReportingConnectionRetryMaxIntervalMillis", "getLocationReportingIntervalSeconds", "getLocationReportingQueueLimit", "getLocationReportingTimeoutSeconds", "getLocationReportingTimeoutsToFail", "getMainOrientationCalculator", "()Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfig;", "getMapGridFetchingStrategy", "()Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;", "getMapGridType", "()Lme/oriient/internal/services/dataModel/engine/MapGridType;", "getMapGridUrlExpirationTimeMinutes", "getModelFetchRetryCount", "getModelFetchRetryIntervalSeconds", "getSpecificConfig", "()Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class EngineConfig {
    private final boolean enableLocationReporting;
    private final int engineSessionFetchRetryCount;
    private final double engineSessionFetchRetryIntervalSeconds;
    private final double engineSessionRefreshIntervalBeforeExpirationSeconds;
    private final boolean isPositioningDebuggingEnabled;
    private final boolean isSmartCartMode;
    private final long locationReportingConnectionRetryInitialIntervalMillis;
    private final long locationReportingConnectionRetryMaxIntervalMillis;
    private final double locationReportingIntervalSeconds;
    private final int locationReportingQueueLimit;
    private final double locationReportingTimeoutSeconds;
    private final int locationReportingTimeoutsToFail;

    @NotNull
    private final MainOrientationCalculatorConfig mainOrientationCalculator;

    @NotNull
    private final MapGridFetchingStrategy mapGridFetchingStrategy;

    @NotNull
    private final MapGridType mapGridType;
    private final double mapGridUrlExpirationTimeMinutes;
    private final int modelFetchRetryCount;
    private final double modelFetchRetryIntervalSeconds;

    @NotNull
    private final SpecificEngineConfig specificConfig;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, EnumsKt.b(MapGridFetchingStrategy.values(), "me.oriient.internal.services.dataModel.engine.MapGridFetchingStrategy"), EnumsKt.b(MapGridType.values(), "me.oriient.internal.services.dataModel.engine.MapGridType"), null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/EngineConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<EngineConfig> serializer() {
            return EngineConfig$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ EngineConfig(int i, boolean z, double d, double d2, int i2, boolean z2, double d3, int i3, double d4, MapGridFetchingStrategy mapGridFetchingStrategy, MapGridType mapGridType, int i4, double d5, double d6, SpecificEngineConfig specificEngineConfig, MainOrientationCalculatorConfig mainOrientationCalculatorConfig, boolean z3, int i5, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (524287 != (i & 524287)) {
            PluginExceptionsKt.a(i, 524287, EngineConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.enableLocationReporting = z;
        this.locationReportingIntervalSeconds = d;
        this.locationReportingTimeoutSeconds = d2;
        this.locationReportingTimeoutsToFail = i2;
        this.isSmartCartMode = z2;
        this.modelFetchRetryIntervalSeconds = d3;
        this.modelFetchRetryCount = i3;
        this.mapGridUrlExpirationTimeMinutes = d4;
        this.mapGridFetchingStrategy = mapGridFetchingStrategy;
        this.mapGridType = mapGridType;
        this.engineSessionFetchRetryCount = i4;
        this.engineSessionFetchRetryIntervalSeconds = d5;
        this.engineSessionRefreshIntervalBeforeExpirationSeconds = d6;
        this.specificConfig = specificEngineConfig;
        this.mainOrientationCalculator = mainOrientationCalculatorConfig;
        this.isPositioningDebuggingEnabled = z3;
        this.locationReportingQueueLimit = i5;
        this.locationReportingConnectionRetryInitialIntervalMillis = j;
        this.locationReportingConnectionRetryMaxIntervalMillis = j2;
    }

    public static /* synthetic */ EngineConfig copy$default(EngineConfig engineConfig, boolean z, double d, double d2, int i, boolean z2, double d3, int i2, double d4, MapGridFetchingStrategy mapGridFetchingStrategy, MapGridType mapGridType, int i3, double d5, double d6, SpecificEngineConfig specificEngineConfig, MainOrientationCalculatorConfig mainOrientationCalculatorConfig, boolean z3, int i4, long j, long j2, int i5, Object obj) {
        long j3;
        long j4;
        boolean z4 = (i5 & 1) != 0 ? engineConfig.enableLocationReporting : z;
        double d7 = (i5 & 2) != 0 ? engineConfig.locationReportingIntervalSeconds : d;
        double d8 = (i5 & 4) != 0 ? engineConfig.locationReportingTimeoutSeconds : d2;
        int i6 = (i5 & 8) != 0 ? engineConfig.locationReportingTimeoutsToFail : i;
        boolean z5 = (i5 & 16) != 0 ? engineConfig.isSmartCartMode : z2;
        double d9 = (i5 & 32) != 0 ? engineConfig.modelFetchRetryIntervalSeconds : d3;
        int i7 = (i5 & 64) != 0 ? engineConfig.modelFetchRetryCount : i2;
        double d10 = (i5 & 128) != 0 ? engineConfig.mapGridUrlExpirationTimeMinutes : d4;
        MapGridFetchingStrategy mapGridFetchingStrategy2 = (i5 & 256) != 0 ? engineConfig.mapGridFetchingStrategy : mapGridFetchingStrategy;
        MapGridType mapGridType2 = (i5 & 512) != 0 ? engineConfig.mapGridType : mapGridType;
        boolean z6 = z4;
        int i8 = (i5 & 1024) != 0 ? engineConfig.engineSessionFetchRetryCount : i3;
        double d11 = d7;
        double d12 = (i5 & 2048) != 0 ? engineConfig.engineSessionFetchRetryIntervalSeconds : d5;
        double d13 = (i5 & 4096) != 0 ? engineConfig.engineSessionRefreshIntervalBeforeExpirationSeconds : d6;
        SpecificEngineConfig specificEngineConfig2 = (i5 & 8192) != 0 ? engineConfig.specificConfig : specificEngineConfig;
        double d14 = d13;
        MainOrientationCalculatorConfig mainOrientationCalculatorConfig2 = (i5 & 16384) != 0 ? engineConfig.mainOrientationCalculator : mainOrientationCalculatorConfig;
        boolean z7 = (32768 & i5) != 0 ? engineConfig.isPositioningDebuggingEnabled : z3;
        int i9 = (i5 & 65536) != 0 ? engineConfig.locationReportingQueueLimit : i4;
        MainOrientationCalculatorConfig mainOrientationCalculatorConfig3 = mainOrientationCalculatorConfig2;
        long j5 = (i5 & 131072) != 0 ? engineConfig.locationReportingConnectionRetryInitialIntervalMillis : j;
        if ((i5 & 262144) != 0) {
            j4 = j5;
            j3 = engineConfig.locationReportingConnectionRetryMaxIntervalMillis;
        } else {
            j3 = j2;
            j4 = j5;
        }
        return engineConfig.copy(z6, d11, d8, i6, z5, d9, i7, d10, mapGridFetchingStrategy2, mapGridType2, i8, d12, d14, specificEngineConfig2, mainOrientationCalculatorConfig3, z7, i9, j4, j3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(EngineConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.o(serialDesc, 0, self.enableLocationReporting);
        output.G(serialDesc, 1, self.locationReportingIntervalSeconds);
        output.G(serialDesc, 2, self.locationReportingTimeoutSeconds);
        output.C(3, self.locationReportingTimeoutsToFail, serialDesc);
        output.o(serialDesc, 4, self.isSmartCartMode);
        output.G(serialDesc, 5, self.modelFetchRetryIntervalSeconds);
        output.C(6, self.modelFetchRetryCount, serialDesc);
        output.G(serialDesc, 7, self.mapGridUrlExpirationTimeMinutes);
        output.F(serialDesc, 8, kSerializerArr[8], self.mapGridFetchingStrategy);
        output.F(serialDesc, 9, kSerializerArr[9], self.mapGridType);
        output.C(10, self.engineSessionFetchRetryCount, serialDesc);
        output.G(serialDesc, 11, self.engineSessionFetchRetryIntervalSeconds);
        output.G(serialDesc, 12, self.engineSessionRefreshIntervalBeforeExpirationSeconds);
        output.F(serialDesc, 13, SpecificEngineConfig$$serializer.INSTANCE, self.specificConfig);
        output.F(serialDesc, 14, MainOrientationCalculatorConfig$$serializer.INSTANCE, self.mainOrientationCalculator);
        output.o(serialDesc, 15, self.isPositioningDebuggingEnabled);
        output.C(16, self.locationReportingQueueLimit, serialDesc);
        output.t(serialDesc, 17, self.locationReportingConnectionRetryInitialIntervalMillis);
        output.t(serialDesc, 18, self.locationReportingConnectionRetryMaxIntervalMillis);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableLocationReporting() {
        return this.enableLocationReporting;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final MapGridType getMapGridType() {
        return this.mapGridType;
    }

    /* renamed from: component11, reason: from getter */
    public final int getEngineSessionFetchRetryCount() {
        return this.engineSessionFetchRetryCount;
    }

    /* renamed from: component12, reason: from getter */
    public final double getEngineSessionFetchRetryIntervalSeconds() {
        return this.engineSessionFetchRetryIntervalSeconds;
    }

    /* renamed from: component13, reason: from getter */
    public final double getEngineSessionRefreshIntervalBeforeExpirationSeconds() {
        return this.engineSessionRefreshIntervalBeforeExpirationSeconds;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final SpecificEngineConfig getSpecificConfig() {
        return this.specificConfig;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final MainOrientationCalculatorConfig getMainOrientationCalculator() {
        return this.mainOrientationCalculator;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsPositioningDebuggingEnabled() {
        return this.isPositioningDebuggingEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final int getLocationReportingQueueLimit() {
        return this.locationReportingQueueLimit;
    }

    /* renamed from: component18, reason: from getter */
    public final long getLocationReportingConnectionRetryInitialIntervalMillis() {
        return this.locationReportingConnectionRetryInitialIntervalMillis;
    }

    /* renamed from: component19, reason: from getter */
    public final long getLocationReportingConnectionRetryMaxIntervalMillis() {
        return this.locationReportingConnectionRetryMaxIntervalMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLocationReportingIntervalSeconds() {
        return this.locationReportingIntervalSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLocationReportingTimeoutSeconds() {
        return this.locationReportingTimeoutSeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLocationReportingTimeoutsToFail() {
        return this.locationReportingTimeoutsToFail;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSmartCartMode() {
        return this.isSmartCartMode;
    }

    /* renamed from: component6, reason: from getter */
    public final double getModelFetchRetryIntervalSeconds() {
        return this.modelFetchRetryIntervalSeconds;
    }

    /* renamed from: component7, reason: from getter */
    public final int getModelFetchRetryCount() {
        return this.modelFetchRetryCount;
    }

    /* renamed from: component8, reason: from getter */
    public final double getMapGridUrlExpirationTimeMinutes() {
        return this.mapGridUrlExpirationTimeMinutes;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final MapGridFetchingStrategy getMapGridFetchingStrategy() {
        return this.mapGridFetchingStrategy;
    }

    @NotNull
    public final EngineConfig copy(boolean enableLocationReporting, double locationReportingIntervalSeconds, double locationReportingTimeoutSeconds, int locationReportingTimeoutsToFail, boolean isSmartCartMode, double modelFetchRetryIntervalSeconds, int modelFetchRetryCount, double mapGridUrlExpirationTimeMinutes, @NotNull MapGridFetchingStrategy mapGridFetchingStrategy, @NotNull MapGridType mapGridType, int engineSessionFetchRetryCount, double engineSessionFetchRetryIntervalSeconds, double engineSessionRefreshIntervalBeforeExpirationSeconds, @NotNull SpecificEngineConfig specificConfig, @NotNull MainOrientationCalculatorConfig mainOrientationCalculator, boolean isPositioningDebuggingEnabled, int locationReportingQueueLimit, long locationReportingConnectionRetryInitialIntervalMillis, long locationReportingConnectionRetryMaxIntervalMillis) {
        Intrinsics.h(mapGridFetchingStrategy, "mapGridFetchingStrategy");
        Intrinsics.h(mapGridType, "mapGridType");
        Intrinsics.h(specificConfig, "specificConfig");
        Intrinsics.h(mainOrientationCalculator, "mainOrientationCalculator");
        return new EngineConfig(enableLocationReporting, locationReportingIntervalSeconds, locationReportingTimeoutSeconds, locationReportingTimeoutsToFail, isSmartCartMode, modelFetchRetryIntervalSeconds, modelFetchRetryCount, mapGridUrlExpirationTimeMinutes, mapGridFetchingStrategy, mapGridType, engineSessionFetchRetryCount, engineSessionFetchRetryIntervalSeconds, engineSessionRefreshIntervalBeforeExpirationSeconds, specificConfig, mainOrientationCalculator, isPositioningDebuggingEnabled, locationReportingQueueLimit, locationReportingConnectionRetryInitialIntervalMillis, locationReportingConnectionRetryMaxIntervalMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineConfig)) {
            return false;
        }
        EngineConfig engineConfig = (EngineConfig) other;
        return this.enableLocationReporting == engineConfig.enableLocationReporting && Double.compare(this.locationReportingIntervalSeconds, engineConfig.locationReportingIntervalSeconds) == 0 && Double.compare(this.locationReportingTimeoutSeconds, engineConfig.locationReportingTimeoutSeconds) == 0 && this.locationReportingTimeoutsToFail == engineConfig.locationReportingTimeoutsToFail && this.isSmartCartMode == engineConfig.isSmartCartMode && Double.compare(this.modelFetchRetryIntervalSeconds, engineConfig.modelFetchRetryIntervalSeconds) == 0 && this.modelFetchRetryCount == engineConfig.modelFetchRetryCount && Double.compare(this.mapGridUrlExpirationTimeMinutes, engineConfig.mapGridUrlExpirationTimeMinutes) == 0 && this.mapGridFetchingStrategy == engineConfig.mapGridFetchingStrategy && this.mapGridType == engineConfig.mapGridType && this.engineSessionFetchRetryCount == engineConfig.engineSessionFetchRetryCount && Double.compare(this.engineSessionFetchRetryIntervalSeconds, engineConfig.engineSessionFetchRetryIntervalSeconds) == 0 && Double.compare(this.engineSessionRefreshIntervalBeforeExpirationSeconds, engineConfig.engineSessionRefreshIntervalBeforeExpirationSeconds) == 0 && Intrinsics.c(this.specificConfig, engineConfig.specificConfig) && Intrinsics.c(this.mainOrientationCalculator, engineConfig.mainOrientationCalculator) && this.isPositioningDebuggingEnabled == engineConfig.isPositioningDebuggingEnabled && this.locationReportingQueueLimit == engineConfig.locationReportingQueueLimit && this.locationReportingConnectionRetryInitialIntervalMillis == engineConfig.locationReportingConnectionRetryInitialIntervalMillis && this.locationReportingConnectionRetryMaxIntervalMillis == engineConfig.locationReportingConnectionRetryMaxIntervalMillis;
    }

    public final boolean getEnableLocationReporting() {
        return this.enableLocationReporting;
    }

    public final int getEngineSessionFetchRetryCount() {
        return this.engineSessionFetchRetryCount;
    }

    public final double getEngineSessionFetchRetryIntervalSeconds() {
        return this.engineSessionFetchRetryIntervalSeconds;
    }

    public final double getEngineSessionRefreshIntervalBeforeExpirationSeconds() {
        return this.engineSessionRefreshIntervalBeforeExpirationSeconds;
    }

    public final long getLocationReportingConnectionRetryInitialIntervalMillis() {
        return this.locationReportingConnectionRetryInitialIntervalMillis;
    }

    public final long getLocationReportingConnectionRetryMaxIntervalMillis() {
        return this.locationReportingConnectionRetryMaxIntervalMillis;
    }

    public final double getLocationReportingIntervalSeconds() {
        return this.locationReportingIntervalSeconds;
    }

    public final int getLocationReportingQueueLimit() {
        return this.locationReportingQueueLimit;
    }

    public final double getLocationReportingTimeoutSeconds() {
        return this.locationReportingTimeoutSeconds;
    }

    public final int getLocationReportingTimeoutsToFail() {
        return this.locationReportingTimeoutsToFail;
    }

    @NotNull
    public final MainOrientationCalculatorConfig getMainOrientationCalculator() {
        return this.mainOrientationCalculator;
    }

    @NotNull
    public final MapGridFetchingStrategy getMapGridFetchingStrategy() {
        return this.mapGridFetchingStrategy;
    }

    @NotNull
    public final MapGridType getMapGridType() {
        return this.mapGridType;
    }

    public final double getMapGridUrlExpirationTimeMinutes() {
        return this.mapGridUrlExpirationTimeMinutes;
    }

    public final int getModelFetchRetryCount() {
        return this.modelFetchRetryCount;
    }

    public final double getModelFetchRetryIntervalSeconds() {
        return this.modelFetchRetryIntervalSeconds;
    }

    @NotNull
    public final SpecificEngineConfig getSpecificConfig() {
        return this.specificConfig;
    }

    public int hashCode() {
        return Long.hashCode(this.locationReportingConnectionRetryMaxIntervalMillis) + K.a(this.locationReportingConnectionRetryInitialIntervalMillis, me.oriient.internal.services.config.a.a(this.locationReportingQueueLimit, me.oriient.internal.infra.scheduler.a.a(this.isPositioningDebuggingEnabled, (this.mainOrientationCalculator.hashCode() + ((this.specificConfig.hashCode() + J.a(this.engineSessionRefreshIntervalBeforeExpirationSeconds, J.a(this.engineSessionFetchRetryIntervalSeconds, me.oriient.internal.services.config.a.a(this.engineSessionFetchRetryCount, (this.mapGridType.hashCode() + ((this.mapGridFetchingStrategy.hashCode() + J.a(this.mapGridUrlExpirationTimeMinutes, me.oriient.internal.services.config.a.a(this.modelFetchRetryCount, J.a(this.modelFetchRetryIntervalSeconds, me.oriient.internal.infra.scheduler.a.a(this.isSmartCartMode, me.oriient.internal.services.config.a.a(this.locationReportingTimeoutsToFail, J.a(this.locationReportingTimeoutSeconds, J.a(this.locationReportingIntervalSeconds, Boolean.hashCode(this.enableLocationReporting) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31, 31), 31), 31);
    }

    public final boolean isPositioningDebuggingEnabled() {
        return this.isPositioningDebuggingEnabled;
    }

    public final boolean isSmartCartMode() {
        return this.isSmartCartMode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EngineConfig(enableLocationReporting=");
        sb.append(this.enableLocationReporting);
        sb.append(", locationReportingIntervalSeconds=");
        sb.append(this.locationReportingIntervalSeconds);
        sb.append(", locationReportingTimeoutSeconds=");
        sb.append(this.locationReportingTimeoutSeconds);
        sb.append(", locationReportingTimeoutsToFail=");
        sb.append(this.locationReportingTimeoutsToFail);
        sb.append(", isSmartCartMode=");
        sb.append(this.isSmartCartMode);
        sb.append(", modelFetchRetryIntervalSeconds=");
        sb.append(this.modelFetchRetryIntervalSeconds);
        sb.append(", modelFetchRetryCount=");
        sb.append(this.modelFetchRetryCount);
        sb.append(", mapGridUrlExpirationTimeMinutes=");
        sb.append(this.mapGridUrlExpirationTimeMinutes);
        sb.append(", mapGridFetchingStrategy=");
        sb.append(this.mapGridFetchingStrategy);
        sb.append(", mapGridType=");
        sb.append(this.mapGridType);
        sb.append(", engineSessionFetchRetryCount=");
        sb.append(this.engineSessionFetchRetryCount);
        sb.append(", engineSessionFetchRetryIntervalSeconds=");
        sb.append(this.engineSessionFetchRetryIntervalSeconds);
        sb.append(", engineSessionRefreshIntervalBeforeExpirationSeconds=");
        sb.append(this.engineSessionRefreshIntervalBeforeExpirationSeconds);
        sb.append(", specificConfig=");
        sb.append(this.specificConfig);
        sb.append(", mainOrientationCalculator=");
        sb.append(this.mainOrientationCalculator);
        sb.append(", isPositioningDebuggingEnabled=");
        sb.append(this.isPositioningDebuggingEnabled);
        sb.append(", locationReportingQueueLimit=");
        sb.append(this.locationReportingQueueLimit);
        sb.append(", locationReportingConnectionRetryInitialIntervalMillis=");
        sb.append(this.locationReportingConnectionRetryInitialIntervalMillis);
        sb.append(", locationReportingConnectionRetryMaxIntervalMillis=");
        return b.q(sb, this.locationReportingConnectionRetryMaxIntervalMillis, ')');
    }

    public EngineConfig(boolean z, double d, double d2, int i, boolean z2, double d3, int i2, double d4, @NotNull MapGridFetchingStrategy mapGridFetchingStrategy, @NotNull MapGridType mapGridType, int i3, double d5, double d6, @NotNull SpecificEngineConfig specificConfig, @NotNull MainOrientationCalculatorConfig mainOrientationCalculator, boolean z3, int i4, long j, long j2) {
        Intrinsics.h(mapGridFetchingStrategy, "mapGridFetchingStrategy");
        Intrinsics.h(mapGridType, "mapGridType");
        Intrinsics.h(specificConfig, "specificConfig");
        Intrinsics.h(mainOrientationCalculator, "mainOrientationCalculator");
        this.enableLocationReporting = z;
        this.locationReportingIntervalSeconds = d;
        this.locationReportingTimeoutSeconds = d2;
        this.locationReportingTimeoutsToFail = i;
        this.isSmartCartMode = z2;
        this.modelFetchRetryIntervalSeconds = d3;
        this.modelFetchRetryCount = i2;
        this.mapGridUrlExpirationTimeMinutes = d4;
        this.mapGridFetchingStrategy = mapGridFetchingStrategy;
        this.mapGridType = mapGridType;
        this.engineSessionFetchRetryCount = i3;
        this.engineSessionFetchRetryIntervalSeconds = d5;
        this.engineSessionRefreshIntervalBeforeExpirationSeconds = d6;
        this.specificConfig = specificConfig;
        this.mainOrientationCalculator = mainOrientationCalculator;
        this.isPositioningDebuggingEnabled = z3;
        this.locationReportingQueueLimit = i4;
        this.locationReportingConnectionRetryInitialIntervalMillis = j;
        this.locationReportingConnectionRetryMaxIntervalMillis = j2;
    }
}
