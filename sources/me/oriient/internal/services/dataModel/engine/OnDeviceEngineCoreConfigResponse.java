package me.oriient.internal.services.dataModel.engine;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;", "", "seen1", "", "rtEngine", "Lme/oriient/internal/services/dataModel/engine/RtEngineConfigResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataModel/engine/RtEngineConfigResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataModel/engine/RtEngineConfigResponse;)V", "getRtEngine", "()Lme/oriient/internal/services/dataModel/engine/RtEngineConfigResponse;", "component1", "copy", "equals", "", "other", "hashCode", "toConfig", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class OnDeviceEngineCoreConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final RtEngineConfigResponse rtEngine;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<OnDeviceEngineCoreConfigResponse> serializer() {
            return OnDeviceEngineCoreConfigResponse$$serializer.INSTANCE;
        }
    }

    public OnDeviceEngineCoreConfigResponse() {
        this((RtEngineConfigResponse) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ OnDeviceEngineCoreConfigResponse copy$default(OnDeviceEngineCoreConfigResponse onDeviceEngineCoreConfigResponse, RtEngineConfigResponse rtEngineConfigResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            rtEngineConfigResponse = onDeviceEngineCoreConfigResponse.rtEngine;
        }
        return onDeviceEngineCoreConfigResponse.copy(rtEngineConfigResponse);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(OnDeviceEngineCoreConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.q(serialDesc, 0) && self.rtEngine == null) {
            return;
        }
        output.w(serialDesc, 0, RtEngineConfigResponse$$serializer.INSTANCE, self.rtEngine);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final RtEngineConfigResponse getRtEngine() {
        return this.rtEngine;
    }

    @NotNull
    public final OnDeviceEngineCoreConfigResponse copy(@Nullable RtEngineConfigResponse rtEngine) {
        return new OnDeviceEngineCoreConfigResponse(rtEngine);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnDeviceEngineCoreConfigResponse) && Intrinsics.c(this.rtEngine, ((OnDeviceEngineCoreConfigResponse) other).rtEngine);
    }

    @Nullable
    public final RtEngineConfigResponse getRtEngine() {
        return this.rtEngine;
    }

    public int hashCode() {
        RtEngineConfigResponse rtEngineConfigResponse = this.rtEngine;
        if (rtEngineConfigResponse == null) {
            return 0;
        }
        return rtEngineConfigResponse.hashCode();
    }

    @NotNull
    public final OnDeviceEngineCoreConfig toConfig() {
        RtEngineConfigResponse rtEngineConfigResponse = this.rtEngine;
        if (rtEngineConfigResponse == null) {
            rtEngineConfigResponse = new RtEngineConfigResponse((Boolean) null, (Double) null, 3, (DefaultConstructorMarker) null);
        }
        return new OnDeviceEngineCoreConfig(rtEngineConfigResponse.toConfig());
    }

    @NotNull
    public String toString() {
        return "OnDeviceEngineCoreConfigResponse(rtEngine=" + this.rtEngine + ')';
    }

    @Deprecated
    public /* synthetic */ OnDeviceEngineCoreConfigResponse(int i, RtEngineConfigResponse rtEngineConfigResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rtEngine = null;
        } else {
            this.rtEngine = rtEngineConfigResponse;
        }
    }

    public OnDeviceEngineCoreConfigResponse(@Nullable RtEngineConfigResponse rtEngineConfigResponse) {
        this.rtEngine = rtEngineConfigResponse;
    }

    public /* synthetic */ OnDeviceEngineCoreConfigResponse(RtEngineConfigResponse rtEngineConfigResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rtEngineConfigResponse);
    }
}
