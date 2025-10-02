package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.auth.rest.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigPerBuildingResponse;", "", "seen1", "", "onDeviceCore", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;", "buildingIds", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;Ljava/util/List;)V", "getBuildingIds", "()Ljava/util/List;", "getOnDeviceCore", "()Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toConfig", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigPerBuilding;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class OnDeviceEngineCoreConfigPerBuildingResponse {

    @NotNull
    private final List<String> buildingIds;

    @NotNull
    private final OnDeviceEngineCoreConfigResponse onDeviceCore;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.f24821a)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigPerBuildingResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigPerBuildingResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<OnDeviceEngineCoreConfigPerBuildingResponse> serializer() {
            return OnDeviceEngineCoreConfigPerBuildingResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ OnDeviceEngineCoreConfigPerBuildingResponse(int i, OnDeviceEngineCoreConfigResponse onDeviceEngineCoreConfigResponse, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, OnDeviceEngineCoreConfigPerBuildingResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.onDeviceCore = onDeviceEngineCoreConfigResponse;
        this.buildingIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnDeviceEngineCoreConfigPerBuildingResponse copy$default(OnDeviceEngineCoreConfigPerBuildingResponse onDeviceEngineCoreConfigPerBuildingResponse, OnDeviceEngineCoreConfigResponse onDeviceEngineCoreConfigResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            onDeviceEngineCoreConfigResponse = onDeviceEngineCoreConfigPerBuildingResponse.onDeviceCore;
        }
        if ((i & 2) != 0) {
            list = onDeviceEngineCoreConfigPerBuildingResponse.buildingIds;
        }
        return onDeviceEngineCoreConfigPerBuildingResponse.copy(onDeviceEngineCoreConfigResponse, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(OnDeviceEngineCoreConfigPerBuildingResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.F(serialDesc, 0, OnDeviceEngineCoreConfigResponse$$serializer.INSTANCE, self.onDeviceCore);
        output.F(serialDesc, 1, kSerializerArr[1], self.buildingIds);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OnDeviceEngineCoreConfigResponse getOnDeviceCore() {
        return this.onDeviceCore;
    }

    @NotNull
    public final List<String> component2() {
        return this.buildingIds;
    }

    @NotNull
    public final OnDeviceEngineCoreConfigPerBuildingResponse copy(@NotNull OnDeviceEngineCoreConfigResponse onDeviceCore, @NotNull List<String> buildingIds) {
        Intrinsics.h(onDeviceCore, "onDeviceCore");
        Intrinsics.h(buildingIds, "buildingIds");
        return new OnDeviceEngineCoreConfigPerBuildingResponse(onDeviceCore, buildingIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnDeviceEngineCoreConfigPerBuildingResponse)) {
            return false;
        }
        OnDeviceEngineCoreConfigPerBuildingResponse onDeviceEngineCoreConfigPerBuildingResponse = (OnDeviceEngineCoreConfigPerBuildingResponse) other;
        return Intrinsics.c(this.onDeviceCore, onDeviceEngineCoreConfigPerBuildingResponse.onDeviceCore) && Intrinsics.c(this.buildingIds, onDeviceEngineCoreConfigPerBuildingResponse.buildingIds);
    }

    @NotNull
    public final List<String> getBuildingIds() {
        return this.buildingIds;
    }

    @NotNull
    public final OnDeviceEngineCoreConfigResponse getOnDeviceCore() {
        return this.onDeviceCore;
    }

    public int hashCode() {
        return this.buildingIds.hashCode() + (this.onDeviceCore.hashCode() * 31);
    }

    @NotNull
    public final OnDeviceEngineCoreConfigPerBuilding toConfig() {
        return new OnDeviceEngineCoreConfigPerBuilding(this.onDeviceCore.toConfig(), this.buildingIds);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceEngineCoreConfigPerBuildingResponse(onDeviceCore=");
        sb.append(this.onDeviceCore);
        sb.append(", buildingIds=");
        return m.a(sb, this.buildingIds, ')');
    }

    public OnDeviceEngineCoreConfigPerBuildingResponse(@NotNull OnDeviceEngineCoreConfigResponse onDeviceCore, @NotNull List<String> buildingIds) {
        Intrinsics.h(onDeviceCore, "onDeviceCore");
        Intrinsics.h(buildingIds, "buildingIds");
        this.onDeviceCore = onDeviceCore;
        this.buildingIds = buildingIds;
    }
}
