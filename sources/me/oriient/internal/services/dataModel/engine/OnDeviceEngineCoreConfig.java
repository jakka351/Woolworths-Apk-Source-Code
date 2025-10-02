package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;", "", "seen1", "", "rtEngine", "Lme/oriient/internal/services/dataModel/engine/RtEngineConfig;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataModel/engine/RtEngineConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataModel/engine/RtEngineConfig;)V", "getRtEngine", "()Lme/oriient/internal/services/dataModel/engine/RtEngineConfig;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class OnDeviceEngineCoreConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final RtEngineConfig rtEngine;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<OnDeviceEngineCoreConfig> serializer() {
            return OnDeviceEngineCoreConfig$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ OnDeviceEngineCoreConfig(int i, RtEngineConfig rtEngineConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i & 1)) {
            this.rtEngine = rtEngineConfig;
        } else {
            PluginExceptionsKt.a(i, 1, OnDeviceEngineCoreConfig$$serializer.INSTANCE.getB());
            throw null;
        }
    }

    public static /* synthetic */ OnDeviceEngineCoreConfig copy$default(OnDeviceEngineCoreConfig onDeviceEngineCoreConfig, RtEngineConfig rtEngineConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            rtEngineConfig = onDeviceEngineCoreConfig.rtEngine;
        }
        return onDeviceEngineCoreConfig.copy(rtEngineConfig);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RtEngineConfig getRtEngine() {
        return this.rtEngine;
    }

    @NotNull
    public final OnDeviceEngineCoreConfig copy(@NotNull RtEngineConfig rtEngine) {
        Intrinsics.h(rtEngine, "rtEngine");
        return new OnDeviceEngineCoreConfig(rtEngine);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnDeviceEngineCoreConfig) && Intrinsics.c(this.rtEngine, ((OnDeviceEngineCoreConfig) other).rtEngine);
    }

    @NotNull
    public final RtEngineConfig getRtEngine() {
        return this.rtEngine;
    }

    public int hashCode() {
        return this.rtEngine.hashCode();
    }

    @NotNull
    public String toString() {
        return "OnDeviceEngineCoreConfig(rtEngine=" + this.rtEngine + ')';
    }

    public OnDeviceEngineCoreConfig(@NotNull RtEngineConfig rtEngine) {
        Intrinsics.h(rtEngine, "rtEngine");
        this.rtEngine = rtEngine;
    }
}
