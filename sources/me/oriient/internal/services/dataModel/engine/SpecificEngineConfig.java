package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0004?@ABBq\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0002\u0010\u0017J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003Jc\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001J\u0013\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0013HÖ\u0001J&\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=HÁ\u0001¢\u0006\u0002\b>R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0012\u001a\u00020\u0013X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006C"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "", "seen1", "", "enableEnginePerformanceMonitor", "", "calibrationExpirationTimeMinutes", "", "sessionProgressLogsIntervalSeconds", "engineUpdatesBufferSize", "uploading", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Uploading;", "librariesValidationStrategy", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;", "coreConfigProvider", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;", "startReportingRetryCount", "startReportingRetryIntervalSeconds", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZDDILme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Uploading;Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;IDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZDDILme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Uploading;Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;ID)V", "getCalibrationExpirationTimeMinutes", "()D", "getCoreConfigProvider", "()Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;", "getEnableEnginePerformanceMonitor", "()Z", "getEngineUpdatesBufferSize", "()I", "getLibrariesValidationStrategy", "()Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;", "getName", "()Ljava/lang/String;", "getSessionProgressLogsIntervalSeconds", "getStartReportingRetryCount", "getStartReportingRetryIntervalSeconds", "getUploading", "()Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Uploading;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "EngineLibrariesValidationStrategy", "Uploading", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SpecificEngineConfig {
    private final double calibrationExpirationTimeMinutes;

    @NotNull
    private final OnDeviceEngineCoreConfigProvider coreConfigProvider;
    private final boolean enableEnginePerformanceMonitor;
    private final int engineUpdatesBufferSize;

    @NotNull
    private final EngineLibrariesValidationStrategy librariesValidationStrategy;

    @NotNull
    private final String name;
    private final double sessionProgressLogsIntervalSeconds;
    private final int startReportingRetryCount;
    private final double startReportingRetryIntervalSeconds;

    @NotNull
    private final Uploading uploading;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, EngineLibrariesValidationStrategy.INSTANCE.serializer(), null, null, null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SpecificEngineConfig> serializer() {
            return SpecificEngineConfig$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;", "", "(Ljava/lang/String;I)V", "SKIP", "DENY_SERVICE", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final class EngineLibrariesValidationStrategy {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EngineLibrariesValidationStrategy[] $VALUES;

        @NotNull
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @SerialName
        public static final EngineLibrariesValidationStrategy SKIP = new EngineLibrariesValidationStrategy("SKIP", 0);

        @SerialName
        public static final EngineLibrariesValidationStrategy DENY_SERVICE = new EngineLibrariesValidationStrategy("DENY_SERVICE", 1);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<EngineLibrariesValidationStrategy> serializer() {
                return (KSerializer) EngineLibrariesValidationStrategy.$cachedSerializer$delegate.getD();
            }
        }

        private static final /* synthetic */ EngineLibrariesValidationStrategy[] $values() {
            return new EngineLibrariesValidationStrategy[]{SKIP, DENY_SERVICE};
        }

        static {
            EngineLibrariesValidationStrategy[] engineLibrariesValidationStrategyArr$values = $values();
            $VALUES = engineLibrariesValidationStrategyArr$values;
            $ENTRIES = EnumEntriesKt.a(engineLibrariesValidationStrategyArr$values);
            INSTANCE = new Companion();
            $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.d, a.f25423a);
        }

        private EngineLibrariesValidationStrategy(String str, int i) {
        }

        @NotNull
        public static EnumEntries<EngineLibrariesValidationStrategy> getEntries() {
            return $ENTRIES;
        }

        public static EngineLibrariesValidationStrategy valueOf(String str) {
            return (EngineLibrariesValidationStrategy) Enum.valueOf(EngineLibrariesValidationStrategy.class, str);
        }

        public static EngineLibrariesValidationStrategy[] values() {
            return (EngineLibrariesValidationStrategy[]) $VALUES.clone();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0002_`BÉ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fBµ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0002\u0010 J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\u0013HÆ\u0003J\t\u0010@\u001a\u00020\u0013HÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\rHÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\rHÆ\u0003J\t\u0010H\u001a\u00020\rHÆ\u0003J\t\u0010I\u001a\u00020\rHÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003Jå\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\rHÆ\u0001J\u0013\u0010R\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0003HÖ\u0001J\t\u0010U\u001a\u00020VHÖ\u0001J&\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]HÁ\u0001¢\u0006\u0002\b^R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u001c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0019\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0011\u0010\u001a\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0011\u0010\u001b\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-¨\u0006a"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Uploading;", "", "seen1", "", "enableValidationUploading", "", "enablePositionsUploading", "enableSensorsDataUploading", "enableRestrictedAreasValidationUploading", "aggressiveMode", "enableEventsUploading", "uploadWriteToFileRecords", "writeToFileIntervalSec", "", "metadataUpdateIntervalSec", "uploadChunkLengthSeconds", "uploadMaxSessionLengthMin", "uploadingExpirationTimeDays", "uploadTaskMaxDelayMin", "", "controlTaskMaxTimeMin", "controlTaskIntervalMin", "chargerTaskIntervalMin", "uploadingWifiRequired", "uploadingChargerRequired", "minimumStorageLeftToUploadPositionsMb", "minimumStorageLeftToUploadSensorsMb", "minimumStorageLeftToUploadValidationsMb", "minimumStorageLeftToUploadEventsMb", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZZZZIDDDDDJJJJZZDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZZZZZIDDDDDJJJJZZDDDD)V", "getAggressiveMode", "()Z", "getChargerTaskIntervalMin", "()J", "getControlTaskIntervalMin", "getControlTaskMaxTimeMin", "getEnableEventsUploading", "getEnablePositionsUploading", "getEnableRestrictedAreasValidationUploading", "getEnableSensorsDataUploading", "getEnableValidationUploading", "getMetadataUpdateIntervalSec", "()D", "getMinimumStorageLeftToUploadEventsMb", "getMinimumStorageLeftToUploadPositionsMb", "getMinimumStorageLeftToUploadSensorsMb", "getMinimumStorageLeftToUploadValidationsMb", "getUploadChunkLengthSeconds", "getUploadMaxSessionLengthMin", "getUploadTaskMaxDelayMin", "getUploadWriteToFileRecords", "()I", "getUploadingChargerRequired", "getUploadingExpirationTimeDays", "getUploadingWifiRequired", "getWriteToFileIntervalSec", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Uploading {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private final boolean aggressiveMode;
        private final long chargerTaskIntervalMin;
        private final long controlTaskIntervalMin;
        private final long controlTaskMaxTimeMin;
        private final boolean enableEventsUploading;
        private final boolean enablePositionsUploading;
        private final boolean enableRestrictedAreasValidationUploading;
        private final boolean enableSensorsDataUploading;
        private final boolean enableValidationUploading;
        private final double metadataUpdateIntervalSec;
        private final double minimumStorageLeftToUploadEventsMb;
        private final double minimumStorageLeftToUploadPositionsMb;
        private final double minimumStorageLeftToUploadSensorsMb;
        private final double minimumStorageLeftToUploadValidationsMb;
        private final double uploadChunkLengthSeconds;
        private final double uploadMaxSessionLengthMin;
        private final long uploadTaskMaxDelayMin;
        private final int uploadWriteToFileRecords;
        private final boolean uploadingChargerRequired;
        private final double uploadingExpirationTimeDays;
        private final boolean uploadingWifiRequired;
        private final double writeToFileIntervalSec;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Uploading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Uploading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<Uploading> serializer() {
                return SpecificEngineConfig$Uploading$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ Uploading(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, double d, double d2, double d3, double d4, double d5, long j, long j2, long j3, long j4, boolean z7, boolean z8, double d6, double d7, double d8, double d9, SerializationConstructorMarker serializationConstructorMarker) {
            if (4194303 != (i & 4194303)) {
                PluginExceptionsKt.a(i, 4194303, SpecificEngineConfig$Uploading$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.enableValidationUploading = z;
            this.enablePositionsUploading = z2;
            this.enableSensorsDataUploading = z3;
            this.enableRestrictedAreasValidationUploading = z4;
            this.aggressiveMode = z5;
            this.enableEventsUploading = z6;
            this.uploadWriteToFileRecords = i2;
            this.writeToFileIntervalSec = d;
            this.metadataUpdateIntervalSec = d2;
            this.uploadChunkLengthSeconds = d3;
            this.uploadMaxSessionLengthMin = d4;
            this.uploadingExpirationTimeDays = d5;
            this.uploadTaskMaxDelayMin = j;
            this.controlTaskMaxTimeMin = j2;
            this.controlTaskIntervalMin = j3;
            this.chargerTaskIntervalMin = j4;
            this.uploadingWifiRequired = z7;
            this.uploadingChargerRequired = z8;
            this.minimumStorageLeftToUploadPositionsMb = d6;
            this.minimumStorageLeftToUploadSensorsMb = d7;
            this.minimumStorageLeftToUploadValidationsMb = d8;
            this.minimumStorageLeftToUploadEventsMb = d9;
        }

        public static /* synthetic */ Uploading copy$default(Uploading uploading, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, double d, double d2, double d3, double d4, double d5, long j, long j2, long j3, long j4, boolean z7, boolean z8, double d6, double d7, double d8, double d9, int i2, Object obj) {
            double d10;
            double d11;
            long j5;
            long j6;
            long j7;
            long j8;
            double d12;
            double d13;
            boolean z9;
            boolean z10;
            int i3;
            double d14;
            double d15;
            double d16;
            boolean z11;
            double d17;
            double d18;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15 = (i2 & 1) != 0 ? uploading.enableValidationUploading : z;
            boolean z16 = (i2 & 2) != 0 ? uploading.enablePositionsUploading : z2;
            boolean z17 = (i2 & 4) != 0 ? uploading.enableSensorsDataUploading : z3;
            boolean z18 = (i2 & 8) != 0 ? uploading.enableRestrictedAreasValidationUploading : z4;
            boolean z19 = (i2 & 16) != 0 ? uploading.aggressiveMode : z5;
            boolean z20 = (i2 & 32) != 0 ? uploading.enableEventsUploading : z6;
            int i4 = (i2 & 64) != 0 ? uploading.uploadWriteToFileRecords : i;
            double d19 = (i2 & 128) != 0 ? uploading.writeToFileIntervalSec : d;
            double d20 = (i2 & 256) != 0 ? uploading.metadataUpdateIntervalSec : d2;
            double d21 = (i2 & 512) != 0 ? uploading.uploadChunkLengthSeconds : d3;
            boolean z21 = z15;
            boolean z22 = z16;
            double d22 = (i2 & 1024) != 0 ? uploading.uploadMaxSessionLengthMin : d4;
            double d23 = (i2 & 2048) != 0 ? uploading.uploadingExpirationTimeDays : d5;
            long j9 = (i2 & 4096) != 0 ? uploading.uploadTaskMaxDelayMin : j;
            long j10 = (i2 & 8192) != 0 ? uploading.controlTaskMaxTimeMin : j2;
            long j11 = (i2 & 16384) != 0 ? uploading.controlTaskIntervalMin : j3;
            long j12 = (i2 & 32768) != 0 ? uploading.chargerTaskIntervalMin : j4;
            boolean z23 = (i2 & 65536) != 0 ? uploading.uploadingWifiRequired : z7;
            boolean z24 = (i2 & 131072) != 0 ? uploading.uploadingChargerRequired : z8;
            long j13 = j12;
            double d24 = (i2 & 262144) != 0 ? uploading.minimumStorageLeftToUploadPositionsMb : d6;
            double d25 = (i2 & 524288) != 0 ? uploading.minimumStorageLeftToUploadSensorsMb : d7;
            double d26 = (i2 & 1048576) != 0 ? uploading.minimumStorageLeftToUploadValidationsMb : d8;
            if ((i2 & 2097152) != 0) {
                d11 = d26;
                d10 = uploading.minimumStorageLeftToUploadEventsMb;
                j6 = j10;
                j7 = j11;
                j8 = j13;
                d12 = d24;
                d13 = d25;
                z9 = z23;
                d14 = d19;
                d15 = d20;
                d16 = d21;
                z11 = z24;
                d17 = d22;
                d18 = d23;
                j5 = j9;
                z12 = z17;
                z13 = z18;
                z14 = z19;
                z10 = z20;
                i3 = i4;
            } else {
                d10 = d9;
                d11 = d26;
                j5 = j9;
                j6 = j10;
                j7 = j11;
                j8 = j13;
                d12 = d24;
                d13 = d25;
                z9 = z23;
                z10 = z20;
                i3 = i4;
                d14 = d19;
                d15 = d20;
                d16 = d21;
                z11 = z24;
                d17 = d22;
                d18 = d23;
                z12 = z17;
                z13 = z18;
                z14 = z19;
            }
            return uploading.copy(z21, z22, z12, z13, z14, z10, i3, d14, d15, d16, d17, d18, j5, j6, j7, j8, z9, z11, d12, d13, d11, d10);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(Uploading self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.o(serialDesc, 0, self.enableValidationUploading);
            output.o(serialDesc, 1, self.enablePositionsUploading);
            output.o(serialDesc, 2, self.enableSensorsDataUploading);
            output.o(serialDesc, 3, self.enableRestrictedAreasValidationUploading);
            output.o(serialDesc, 4, self.aggressiveMode);
            output.o(serialDesc, 5, self.enableEventsUploading);
            output.C(6, self.uploadWriteToFileRecords, serialDesc);
            output.G(serialDesc, 7, self.writeToFileIntervalSec);
            output.G(serialDesc, 8, self.metadataUpdateIntervalSec);
            output.G(serialDesc, 9, self.uploadChunkLengthSeconds);
            output.G(serialDesc, 10, self.uploadMaxSessionLengthMin);
            output.G(serialDesc, 11, self.uploadingExpirationTimeDays);
            output.t(serialDesc, 12, self.uploadTaskMaxDelayMin);
            output.t(serialDesc, 13, self.controlTaskMaxTimeMin);
            output.t(serialDesc, 14, self.controlTaskIntervalMin);
            output.t(serialDesc, 15, self.chargerTaskIntervalMin);
            output.o(serialDesc, 16, self.uploadingWifiRequired);
            output.o(serialDesc, 17, self.uploadingChargerRequired);
            output.G(serialDesc, 18, self.minimumStorageLeftToUploadPositionsMb);
            output.G(serialDesc, 19, self.minimumStorageLeftToUploadSensorsMb);
            output.G(serialDesc, 20, self.minimumStorageLeftToUploadValidationsMb);
            output.G(serialDesc, 21, self.minimumStorageLeftToUploadEventsMb);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnableValidationUploading() {
            return this.enableValidationUploading;
        }

        /* renamed from: component10, reason: from getter */
        public final double getUploadChunkLengthSeconds() {
            return this.uploadChunkLengthSeconds;
        }

        /* renamed from: component11, reason: from getter */
        public final double getUploadMaxSessionLengthMin() {
            return this.uploadMaxSessionLengthMin;
        }

        /* renamed from: component12, reason: from getter */
        public final double getUploadingExpirationTimeDays() {
            return this.uploadingExpirationTimeDays;
        }

        /* renamed from: component13, reason: from getter */
        public final long getUploadTaskMaxDelayMin() {
            return this.uploadTaskMaxDelayMin;
        }

        /* renamed from: component14, reason: from getter */
        public final long getControlTaskMaxTimeMin() {
            return this.controlTaskMaxTimeMin;
        }

        /* renamed from: component15, reason: from getter */
        public final long getControlTaskIntervalMin() {
            return this.controlTaskIntervalMin;
        }

        /* renamed from: component16, reason: from getter */
        public final long getChargerTaskIntervalMin() {
            return this.chargerTaskIntervalMin;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getUploadingWifiRequired() {
            return this.uploadingWifiRequired;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getUploadingChargerRequired() {
            return this.uploadingChargerRequired;
        }

        /* renamed from: component19, reason: from getter */
        public final double getMinimumStorageLeftToUploadPositionsMb() {
            return this.minimumStorageLeftToUploadPositionsMb;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnablePositionsUploading() {
            return this.enablePositionsUploading;
        }

        /* renamed from: component20, reason: from getter */
        public final double getMinimumStorageLeftToUploadSensorsMb() {
            return this.minimumStorageLeftToUploadSensorsMb;
        }

        /* renamed from: component21, reason: from getter */
        public final double getMinimumStorageLeftToUploadValidationsMb() {
            return this.minimumStorageLeftToUploadValidationsMb;
        }

        /* renamed from: component22, reason: from getter */
        public final double getMinimumStorageLeftToUploadEventsMb() {
            return this.minimumStorageLeftToUploadEventsMb;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getEnableSensorsDataUploading() {
            return this.enableSensorsDataUploading;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getEnableRestrictedAreasValidationUploading() {
            return this.enableRestrictedAreasValidationUploading;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getAggressiveMode() {
            return this.aggressiveMode;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getEnableEventsUploading() {
            return this.enableEventsUploading;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUploadWriteToFileRecords() {
            return this.uploadWriteToFileRecords;
        }

        /* renamed from: component8, reason: from getter */
        public final double getWriteToFileIntervalSec() {
            return this.writeToFileIntervalSec;
        }

        /* renamed from: component9, reason: from getter */
        public final double getMetadataUpdateIntervalSec() {
            return this.metadataUpdateIntervalSec;
        }

        @NotNull
        public final Uploading copy(boolean enableValidationUploading, boolean enablePositionsUploading, boolean enableSensorsDataUploading, boolean enableRestrictedAreasValidationUploading, boolean aggressiveMode, boolean enableEventsUploading, int uploadWriteToFileRecords, double writeToFileIntervalSec, double metadataUpdateIntervalSec, double uploadChunkLengthSeconds, double uploadMaxSessionLengthMin, double uploadingExpirationTimeDays, long uploadTaskMaxDelayMin, long controlTaskMaxTimeMin, long controlTaskIntervalMin, long chargerTaskIntervalMin, boolean uploadingWifiRequired, boolean uploadingChargerRequired, double minimumStorageLeftToUploadPositionsMb, double minimumStorageLeftToUploadSensorsMb, double minimumStorageLeftToUploadValidationsMb, double minimumStorageLeftToUploadEventsMb) {
            return new Uploading(enableValidationUploading, enablePositionsUploading, enableSensorsDataUploading, enableRestrictedAreasValidationUploading, aggressiveMode, enableEventsUploading, uploadWriteToFileRecords, writeToFileIntervalSec, metadataUpdateIntervalSec, uploadChunkLengthSeconds, uploadMaxSessionLengthMin, uploadingExpirationTimeDays, uploadTaskMaxDelayMin, controlTaskMaxTimeMin, controlTaskIntervalMin, chargerTaskIntervalMin, uploadingWifiRequired, uploadingChargerRequired, minimumStorageLeftToUploadPositionsMb, minimumStorageLeftToUploadSensorsMb, minimumStorageLeftToUploadValidationsMb, minimumStorageLeftToUploadEventsMb);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uploading)) {
                return false;
            }
            Uploading uploading = (Uploading) other;
            return this.enableValidationUploading == uploading.enableValidationUploading && this.enablePositionsUploading == uploading.enablePositionsUploading && this.enableSensorsDataUploading == uploading.enableSensorsDataUploading && this.enableRestrictedAreasValidationUploading == uploading.enableRestrictedAreasValidationUploading && this.aggressiveMode == uploading.aggressiveMode && this.enableEventsUploading == uploading.enableEventsUploading && this.uploadWriteToFileRecords == uploading.uploadWriteToFileRecords && Double.compare(this.writeToFileIntervalSec, uploading.writeToFileIntervalSec) == 0 && Double.compare(this.metadataUpdateIntervalSec, uploading.metadataUpdateIntervalSec) == 0 && Double.compare(this.uploadChunkLengthSeconds, uploading.uploadChunkLengthSeconds) == 0 && Double.compare(this.uploadMaxSessionLengthMin, uploading.uploadMaxSessionLengthMin) == 0 && Double.compare(this.uploadingExpirationTimeDays, uploading.uploadingExpirationTimeDays) == 0 && this.uploadTaskMaxDelayMin == uploading.uploadTaskMaxDelayMin && this.controlTaskMaxTimeMin == uploading.controlTaskMaxTimeMin && this.controlTaskIntervalMin == uploading.controlTaskIntervalMin && this.chargerTaskIntervalMin == uploading.chargerTaskIntervalMin && this.uploadingWifiRequired == uploading.uploadingWifiRequired && this.uploadingChargerRequired == uploading.uploadingChargerRequired && Double.compare(this.minimumStorageLeftToUploadPositionsMb, uploading.minimumStorageLeftToUploadPositionsMb) == 0 && Double.compare(this.minimumStorageLeftToUploadSensorsMb, uploading.minimumStorageLeftToUploadSensorsMb) == 0 && Double.compare(this.minimumStorageLeftToUploadValidationsMb, uploading.minimumStorageLeftToUploadValidationsMb) == 0 && Double.compare(this.minimumStorageLeftToUploadEventsMb, uploading.minimumStorageLeftToUploadEventsMb) == 0;
        }

        public final boolean getAggressiveMode() {
            return this.aggressiveMode;
        }

        public final long getChargerTaskIntervalMin() {
            return this.chargerTaskIntervalMin;
        }

        public final long getControlTaskIntervalMin() {
            return this.controlTaskIntervalMin;
        }

        public final long getControlTaskMaxTimeMin() {
            return this.controlTaskMaxTimeMin;
        }

        public final boolean getEnableEventsUploading() {
            return this.enableEventsUploading;
        }

        public final boolean getEnablePositionsUploading() {
            return this.enablePositionsUploading;
        }

        public final boolean getEnableRestrictedAreasValidationUploading() {
            return this.enableRestrictedAreasValidationUploading;
        }

        public final boolean getEnableSensorsDataUploading() {
            return this.enableSensorsDataUploading;
        }

        public final boolean getEnableValidationUploading() {
            return this.enableValidationUploading;
        }

        public final double getMetadataUpdateIntervalSec() {
            return this.metadataUpdateIntervalSec;
        }

        public final double getMinimumStorageLeftToUploadEventsMb() {
            return this.minimumStorageLeftToUploadEventsMb;
        }

        public final double getMinimumStorageLeftToUploadPositionsMb() {
            return this.minimumStorageLeftToUploadPositionsMb;
        }

        public final double getMinimumStorageLeftToUploadSensorsMb() {
            return this.minimumStorageLeftToUploadSensorsMb;
        }

        public final double getMinimumStorageLeftToUploadValidationsMb() {
            return this.minimumStorageLeftToUploadValidationsMb;
        }

        public final double getUploadChunkLengthSeconds() {
            return this.uploadChunkLengthSeconds;
        }

        public final double getUploadMaxSessionLengthMin() {
            return this.uploadMaxSessionLengthMin;
        }

        public final long getUploadTaskMaxDelayMin() {
            return this.uploadTaskMaxDelayMin;
        }

        public final int getUploadWriteToFileRecords() {
            return this.uploadWriteToFileRecords;
        }

        public final boolean getUploadingChargerRequired() {
            return this.uploadingChargerRequired;
        }

        public final double getUploadingExpirationTimeDays() {
            return this.uploadingExpirationTimeDays;
        }

        public final boolean getUploadingWifiRequired() {
            return this.uploadingWifiRequired;
        }

        public final double getWriteToFileIntervalSec() {
            return this.writeToFileIntervalSec;
        }

        public int hashCode() {
            return Double.hashCode(this.minimumStorageLeftToUploadEventsMb) + J.a(this.minimumStorageLeftToUploadValidationsMb, J.a(this.minimumStorageLeftToUploadSensorsMb, J.a(this.minimumStorageLeftToUploadPositionsMb, me.oriient.internal.infra.scheduler.a.a(this.uploadingChargerRequired, me.oriient.internal.infra.scheduler.a.a(this.uploadingWifiRequired, K.a(this.chargerTaskIntervalMin, K.a(this.controlTaskIntervalMin, K.a(this.controlTaskMaxTimeMin, K.a(this.uploadTaskMaxDelayMin, J.a(this.uploadingExpirationTimeDays, J.a(this.uploadMaxSessionLengthMin, J.a(this.uploadChunkLengthSeconds, J.a(this.metadataUpdateIntervalSec, J.a(this.writeToFileIntervalSec, me.oriient.internal.services.config.a.a(this.uploadWriteToFileRecords, me.oriient.internal.infra.scheduler.a.a(this.enableEventsUploading, me.oriient.internal.infra.scheduler.a.a(this.aggressiveMode, me.oriient.internal.infra.scheduler.a.a(this.enableRestrictedAreasValidationUploading, me.oriient.internal.infra.scheduler.a.a(this.enableSensorsDataUploading, me.oriient.internal.infra.scheduler.a.a(this.enablePositionsUploading, Boolean.hashCode(this.enableValidationUploading) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Uploading(enableValidationUploading=");
            sb.append(this.enableValidationUploading);
            sb.append(", enablePositionsUploading=");
            sb.append(this.enablePositionsUploading);
            sb.append(", enableSensorsDataUploading=");
            sb.append(this.enableSensorsDataUploading);
            sb.append(", enableRestrictedAreasValidationUploading=");
            sb.append(this.enableRestrictedAreasValidationUploading);
            sb.append(", aggressiveMode=");
            sb.append(this.aggressiveMode);
            sb.append(", enableEventsUploading=");
            sb.append(this.enableEventsUploading);
            sb.append(", uploadWriteToFileRecords=");
            sb.append(this.uploadWriteToFileRecords);
            sb.append(", writeToFileIntervalSec=");
            sb.append(this.writeToFileIntervalSec);
            sb.append(", metadataUpdateIntervalSec=");
            sb.append(this.metadataUpdateIntervalSec);
            sb.append(", uploadChunkLengthSeconds=");
            sb.append(this.uploadChunkLengthSeconds);
            sb.append(", uploadMaxSessionLengthMin=");
            sb.append(this.uploadMaxSessionLengthMin);
            sb.append(", uploadingExpirationTimeDays=");
            sb.append(this.uploadingExpirationTimeDays);
            sb.append(", uploadTaskMaxDelayMin=");
            sb.append(this.uploadTaskMaxDelayMin);
            sb.append(", controlTaskMaxTimeMin=");
            sb.append(this.controlTaskMaxTimeMin);
            sb.append(", controlTaskIntervalMin=");
            sb.append(this.controlTaskIntervalMin);
            sb.append(", chargerTaskIntervalMin=");
            sb.append(this.chargerTaskIntervalMin);
            sb.append(", uploadingWifiRequired=");
            sb.append(this.uploadingWifiRequired);
            sb.append(", uploadingChargerRequired=");
            sb.append(this.uploadingChargerRequired);
            sb.append(", minimumStorageLeftToUploadPositionsMb=");
            sb.append(this.minimumStorageLeftToUploadPositionsMb);
            sb.append(", minimumStorageLeftToUploadSensorsMb=");
            sb.append(this.minimumStorageLeftToUploadSensorsMb);
            sb.append(", minimumStorageLeftToUploadValidationsMb=");
            sb.append(this.minimumStorageLeftToUploadValidationsMb);
            sb.append(", minimumStorageLeftToUploadEventsMb=");
            return b.p(sb, this.minimumStorageLeftToUploadEventsMb, ')');
        }

        public Uploading(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, double d, double d2, double d3, double d4, double d5, long j, long j2, long j3, long j4, boolean z7, boolean z8, double d6, double d7, double d8, double d9) {
            this.enableValidationUploading = z;
            this.enablePositionsUploading = z2;
            this.enableSensorsDataUploading = z3;
            this.enableRestrictedAreasValidationUploading = z4;
            this.aggressiveMode = z5;
            this.enableEventsUploading = z6;
            this.uploadWriteToFileRecords = i;
            this.writeToFileIntervalSec = d;
            this.metadataUpdateIntervalSec = d2;
            this.uploadChunkLengthSeconds = d3;
            this.uploadMaxSessionLengthMin = d4;
            this.uploadingExpirationTimeDays = d5;
            this.uploadTaskMaxDelayMin = j;
            this.controlTaskMaxTimeMin = j2;
            this.controlTaskIntervalMin = j3;
            this.chargerTaskIntervalMin = j4;
            this.uploadingWifiRequired = z7;
            this.uploadingChargerRequired = z8;
            this.minimumStorageLeftToUploadPositionsMb = d6;
            this.minimumStorageLeftToUploadSensorsMb = d7;
            this.minimumStorageLeftToUploadValidationsMb = d8;
            this.minimumStorageLeftToUploadEventsMb = d9;
        }
    }

    @Deprecated
    public /* synthetic */ SpecificEngineConfig(int i, boolean z, double d, double d2, int i2, Uploading uploading, EngineLibrariesValidationStrategy engineLibrariesValidationStrategy, OnDeviceEngineCoreConfigProvider onDeviceEngineCoreConfigProvider, int i3, double d3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            PluginExceptionsKt.a(i, 511, SpecificEngineConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.enableEnginePerformanceMonitor = z;
        this.calibrationExpirationTimeMinutes = d;
        this.sessionProgressLogsIntervalSeconds = d2;
        this.engineUpdatesBufferSize = i2;
        this.uploading = uploading;
        this.librariesValidationStrategy = engineLibrariesValidationStrategy;
        this.coreConfigProvider = onDeviceEngineCoreConfigProvider;
        this.startReportingRetryCount = i3;
        this.startReportingRetryIntervalSeconds = d3;
        this.name = (i & 512) == 0 ? "OnDevice" : str;
    }

    public static /* synthetic */ SpecificEngineConfig copy$default(SpecificEngineConfig specificEngineConfig, boolean z, double d, double d2, int i, Uploading uploading, EngineLibrariesValidationStrategy engineLibrariesValidationStrategy, OnDeviceEngineCoreConfigProvider onDeviceEngineCoreConfigProvider, int i2, double d3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = specificEngineConfig.enableEnginePerformanceMonitor;
        }
        if ((i3 & 2) != 0) {
            d = specificEngineConfig.calibrationExpirationTimeMinutes;
        }
        if ((i3 & 4) != 0) {
            d2 = specificEngineConfig.sessionProgressLogsIntervalSeconds;
        }
        if ((i3 & 8) != 0) {
            i = specificEngineConfig.engineUpdatesBufferSize;
        }
        if ((i3 & 16) != 0) {
            uploading = specificEngineConfig.uploading;
        }
        if ((i3 & 32) != 0) {
            engineLibrariesValidationStrategy = specificEngineConfig.librariesValidationStrategy;
        }
        if ((i3 & 64) != 0) {
            onDeviceEngineCoreConfigProvider = specificEngineConfig.coreConfigProvider;
        }
        if ((i3 & 128) != 0) {
            i2 = specificEngineConfig.startReportingRetryCount;
        }
        if ((i3 & 256) != 0) {
            d3 = specificEngineConfig.startReportingRetryIntervalSeconds;
        }
        double d4 = d3;
        int i4 = i2;
        EngineLibrariesValidationStrategy engineLibrariesValidationStrategy2 = engineLibrariesValidationStrategy;
        int i5 = i;
        double d5 = d2;
        return specificEngineConfig.copy(z, d, d5, i5, uploading, engineLibrariesValidationStrategy2, onDeviceEngineCoreConfigProvider, i4, d4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SpecificEngineConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.o(serialDesc, 0, self.enableEnginePerformanceMonitor);
        output.G(serialDesc, 1, self.calibrationExpirationTimeMinutes);
        output.G(serialDesc, 2, self.sessionProgressLogsIntervalSeconds);
        output.C(3, self.engineUpdatesBufferSize, serialDesc);
        output.F(serialDesc, 4, SpecificEngineConfig$Uploading$$serializer.INSTANCE, self.uploading);
        output.F(serialDesc, 5, kSerializerArr[5], self.librariesValidationStrategy);
        output.F(serialDesc, 6, OnDeviceEngineCoreConfigProvider$$serializer.INSTANCE, self.coreConfigProvider);
        output.C(7, self.startReportingRetryCount, serialDesc);
        output.G(serialDesc, 8, self.startReportingRetryIntervalSeconds);
        if (!output.q(serialDesc, 9) && Intrinsics.c(self.name, "OnDevice")) {
            return;
        }
        output.p(serialDesc, 9, self.name);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableEnginePerformanceMonitor() {
        return this.enableEnginePerformanceMonitor;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCalibrationExpirationTimeMinutes() {
        return this.calibrationExpirationTimeMinutes;
    }

    /* renamed from: component3, reason: from getter */
    public final double getSessionProgressLogsIntervalSeconds() {
        return this.sessionProgressLogsIntervalSeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEngineUpdatesBufferSize() {
        return this.engineUpdatesBufferSize;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Uploading getUploading() {
        return this.uploading;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final EngineLibrariesValidationStrategy getLibrariesValidationStrategy() {
        return this.librariesValidationStrategy;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final OnDeviceEngineCoreConfigProvider getCoreConfigProvider() {
        return this.coreConfigProvider;
    }

    /* renamed from: component8, reason: from getter */
    public final int getStartReportingRetryCount() {
        return this.startReportingRetryCount;
    }

    /* renamed from: component9, reason: from getter */
    public final double getStartReportingRetryIntervalSeconds() {
        return this.startReportingRetryIntervalSeconds;
    }

    @NotNull
    public final SpecificEngineConfig copy(boolean enableEnginePerformanceMonitor, double calibrationExpirationTimeMinutes, double sessionProgressLogsIntervalSeconds, int engineUpdatesBufferSize, @NotNull Uploading uploading, @NotNull EngineLibrariesValidationStrategy librariesValidationStrategy, @NotNull OnDeviceEngineCoreConfigProvider coreConfigProvider, int startReportingRetryCount, double startReportingRetryIntervalSeconds) {
        Intrinsics.h(uploading, "uploading");
        Intrinsics.h(librariesValidationStrategy, "librariesValidationStrategy");
        Intrinsics.h(coreConfigProvider, "coreConfigProvider");
        return new SpecificEngineConfig(enableEnginePerformanceMonitor, calibrationExpirationTimeMinutes, sessionProgressLogsIntervalSeconds, engineUpdatesBufferSize, uploading, librariesValidationStrategy, coreConfigProvider, startReportingRetryCount, startReportingRetryIntervalSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecificEngineConfig)) {
            return false;
        }
        SpecificEngineConfig specificEngineConfig = (SpecificEngineConfig) other;
        return this.enableEnginePerformanceMonitor == specificEngineConfig.enableEnginePerformanceMonitor && Double.compare(this.calibrationExpirationTimeMinutes, specificEngineConfig.calibrationExpirationTimeMinutes) == 0 && Double.compare(this.sessionProgressLogsIntervalSeconds, specificEngineConfig.sessionProgressLogsIntervalSeconds) == 0 && this.engineUpdatesBufferSize == specificEngineConfig.engineUpdatesBufferSize && Intrinsics.c(this.uploading, specificEngineConfig.uploading) && this.librariesValidationStrategy == specificEngineConfig.librariesValidationStrategy && Intrinsics.c(this.coreConfigProvider, specificEngineConfig.coreConfigProvider) && this.startReportingRetryCount == specificEngineConfig.startReportingRetryCount && Double.compare(this.startReportingRetryIntervalSeconds, specificEngineConfig.startReportingRetryIntervalSeconds) == 0;
    }

    public final double getCalibrationExpirationTimeMinutes() {
        return this.calibrationExpirationTimeMinutes;
    }

    @NotNull
    public final OnDeviceEngineCoreConfigProvider getCoreConfigProvider() {
        return this.coreConfigProvider;
    }

    public final boolean getEnableEnginePerformanceMonitor() {
        return this.enableEnginePerformanceMonitor;
    }

    public final int getEngineUpdatesBufferSize() {
        return this.engineUpdatesBufferSize;
    }

    @NotNull
    public final EngineLibrariesValidationStrategy getLibrariesValidationStrategy() {
        return this.librariesValidationStrategy;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getSessionProgressLogsIntervalSeconds() {
        return this.sessionProgressLogsIntervalSeconds;
    }

    public final int getStartReportingRetryCount() {
        return this.startReportingRetryCount;
    }

    public final double getStartReportingRetryIntervalSeconds() {
        return this.startReportingRetryIntervalSeconds;
    }

    @NotNull
    public final Uploading getUploading() {
        return this.uploading;
    }

    public int hashCode() {
        return Double.hashCode(this.startReportingRetryIntervalSeconds) + me.oriient.internal.services.config.a.a(this.startReportingRetryCount, (this.coreConfigProvider.hashCode() + ((this.librariesValidationStrategy.hashCode() + ((this.uploading.hashCode() + me.oriient.internal.services.config.a.a(this.engineUpdatesBufferSize, J.a(this.sessionProgressLogsIntervalSeconds, J.a(this.calibrationExpirationTimeMinutes, Boolean.hashCode(this.enableEnginePerformanceMonitor) * 31, 31), 31), 31)) * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpecificEngineConfig(enableEnginePerformanceMonitor=");
        sb.append(this.enableEnginePerformanceMonitor);
        sb.append(", calibrationExpirationTimeMinutes=");
        sb.append(this.calibrationExpirationTimeMinutes);
        sb.append(", sessionProgressLogsIntervalSeconds=");
        sb.append(this.sessionProgressLogsIntervalSeconds);
        sb.append(", engineUpdatesBufferSize=");
        sb.append(this.engineUpdatesBufferSize);
        sb.append(", uploading=");
        sb.append(this.uploading);
        sb.append(", librariesValidationStrategy=");
        sb.append(this.librariesValidationStrategy);
        sb.append(", coreConfigProvider=");
        sb.append(this.coreConfigProvider);
        sb.append(", startReportingRetryCount=");
        sb.append(this.startReportingRetryCount);
        sb.append(", startReportingRetryIntervalSeconds=");
        return E.a(sb, this.startReportingRetryIntervalSeconds, ')');
    }

    public SpecificEngineConfig(boolean z, double d, double d2, int i, @NotNull Uploading uploading, @NotNull EngineLibrariesValidationStrategy librariesValidationStrategy, @NotNull OnDeviceEngineCoreConfigProvider coreConfigProvider, int i2, double d3) {
        Intrinsics.h(uploading, "uploading");
        Intrinsics.h(librariesValidationStrategy, "librariesValidationStrategy");
        Intrinsics.h(coreConfigProvider, "coreConfigProvider");
        this.enableEnginePerformanceMonitor = z;
        this.calibrationExpirationTimeMinutes = d;
        this.sessionProgressLogsIntervalSeconds = d2;
        this.engineUpdatesBufferSize = i;
        this.uploading = uploading;
        this.librariesValidationStrategy = librariesValidationStrategy;
        this.coreConfigProvider = coreConfigProvider;
        this.startReportingRetryCount = i2;
        this.startReportingRetryIntervalSeconds = d3;
        this.name = "OnDevice";
    }
}
