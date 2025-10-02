package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;", "", "seen1", "", "mapGridUrlExpirationTimeMinutes", "", "mapGridFetchingStrategy", "Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;", "mapGridType", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;Lme/oriient/internal/services/dataModel/engine/MapGridType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DLme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;Lme/oriient/internal/services/dataModel/engine/MapGridType;)V", "getMapGridFetchingStrategy", "()Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;", "getMapGridType", "()Lme/oriient/internal/services/dataModel/engine/MapGridType;", "getMapGridUrlExpirationTimeMinutes", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class ExtraEngineConfig {

    @NotNull
    private final MapGridFetchingStrategy mapGridFetchingStrategy;

    @NotNull
    private final MapGridType mapGridType;
    private final double mapGridUrlExpirationTimeMinutes;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.b(MapGridFetchingStrategy.values(), "me.oriient.internal.services.dataModel.engine.MapGridFetchingStrategy"), EnumsKt.b(MapGridType.values(), "me.oriient.internal.services.dataModel.engine.MapGridType")};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ExtraEngineConfig> serializer() {
            return ExtraEngineConfig$$serializer.INSTANCE;
        }
    }

    public ExtraEngineConfig(double d, @NotNull MapGridFetchingStrategy mapGridFetchingStrategy, @NotNull MapGridType mapGridType) {
        Intrinsics.h(mapGridFetchingStrategy, "mapGridFetchingStrategy");
        Intrinsics.h(mapGridType, "mapGridType");
        this.mapGridUrlExpirationTimeMinutes = d;
        this.mapGridFetchingStrategy = mapGridFetchingStrategy;
        this.mapGridType = mapGridType;
    }

    public static /* synthetic */ ExtraEngineConfig copy$default(ExtraEngineConfig extraEngineConfig, double d, MapGridFetchingStrategy mapGridFetchingStrategy, MapGridType mapGridType, int i, Object obj) {
        if ((i & 1) != 0) {
            d = extraEngineConfig.mapGridUrlExpirationTimeMinutes;
        }
        if ((i & 2) != 0) {
            mapGridFetchingStrategy = extraEngineConfig.mapGridFetchingStrategy;
        }
        if ((i & 4) != 0) {
            mapGridType = extraEngineConfig.mapGridType;
        }
        return extraEngineConfig.copy(d, mapGridFetchingStrategy, mapGridType);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(ExtraEngineConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.G(serialDesc, 0, self.mapGridUrlExpirationTimeMinutes);
        output.F(serialDesc, 1, kSerializerArr[1], self.mapGridFetchingStrategy);
        output.F(serialDesc, 2, kSerializerArr[2], self.mapGridType);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMapGridUrlExpirationTimeMinutes() {
        return this.mapGridUrlExpirationTimeMinutes;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MapGridFetchingStrategy getMapGridFetchingStrategy() {
        return this.mapGridFetchingStrategy;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final MapGridType getMapGridType() {
        return this.mapGridType;
    }

    @NotNull
    public final ExtraEngineConfig copy(double mapGridUrlExpirationTimeMinutes, @NotNull MapGridFetchingStrategy mapGridFetchingStrategy, @NotNull MapGridType mapGridType) {
        Intrinsics.h(mapGridFetchingStrategy, "mapGridFetchingStrategy");
        Intrinsics.h(mapGridType, "mapGridType");
        return new ExtraEngineConfig(mapGridUrlExpirationTimeMinutes, mapGridFetchingStrategy, mapGridType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraEngineConfig)) {
            return false;
        }
        ExtraEngineConfig extraEngineConfig = (ExtraEngineConfig) other;
        return Double.compare(this.mapGridUrlExpirationTimeMinutes, extraEngineConfig.mapGridUrlExpirationTimeMinutes) == 0 && this.mapGridFetchingStrategy == extraEngineConfig.mapGridFetchingStrategy && this.mapGridType == extraEngineConfig.mapGridType;
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

    public int hashCode() {
        return this.mapGridType.hashCode() + ((this.mapGridFetchingStrategy.hashCode() + (Double.hashCode(this.mapGridUrlExpirationTimeMinutes) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ExtraEngineConfig(mapGridUrlExpirationTimeMinutes=" + this.mapGridUrlExpirationTimeMinutes + ", mapGridFetchingStrategy=" + this.mapGridFetchingStrategy + ", mapGridType=" + this.mapGridType + ')';
    }

    @Deprecated
    public /* synthetic */ ExtraEngineConfig(int i, double d, MapGridFetchingStrategy mapGridFetchingStrategy, MapGridType mapGridType, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, ExtraEngineConfig$$serializer.INSTANCE.getB());
            throw null;
        }
        this.mapGridUrlExpirationTimeMinutes = d;
        this.mapGridFetchingStrategy = mapGridFetchingStrategy;
        this.mapGridType = mapGridType;
    }
}
