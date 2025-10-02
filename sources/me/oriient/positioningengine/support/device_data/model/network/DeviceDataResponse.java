package me.oriient.positioningengine.support.device_data.model.network;

import androidx.annotation.Keep;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.positioningengine.support.device_data.model.BlacklistedFeature;
import me.oriient.positioningengine.support.device_data.model.DeviceData;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB#\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/network/DeviceDataResponse;", "", "seen1", "", "predefinedDataShift", "Lme/oriient/positioningengine/support/device_data/model/network/PredefinedDataShiftResponse;", "blacklistedFeatures", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/positioningengine/support/device_data/model/network/PredefinedDataShiftResponse;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/positioningengine/support/device_data/model/network/PredefinedDataShiftResponse;Ljava/util/List;)V", "getBlacklistedFeatures", "()Ljava/util/List;", "getPredefinedDataShift", "()Lme/oriient/positioningengine/support/device_data/model/network/PredefinedDataShiftResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toDeviceData", "Lme/oriient/positioningengine/support/device_data/model/DeviceData;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class DeviceDataResponse {

    @Nullable
    private final List<String> blacklistedFeatures;

    @Nullable
    private final PredefinedDataShiftResponse predefinedDataShift;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.f24821a)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/network/DeviceDataResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/support/device_data/model/network/DeviceDataResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<DeviceDataResponse> serializer() {
            return DeviceDataResponse$$serializer.INSTANCE;
        }
    }

    public DeviceDataResponse() {
        this((PredefinedDataShiftResponse) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceDataResponse copy$default(DeviceDataResponse deviceDataResponse, PredefinedDataShiftResponse predefinedDataShiftResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            predefinedDataShiftResponse = deviceDataResponse.predefinedDataShift;
        }
        if ((i & 2) != 0) {
            list = deviceDataResponse.blacklistedFeatures;
        }
        return deviceDataResponse.copy(predefinedDataShiftResponse, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(DeviceDataResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.predefinedDataShift != null) {
            output.w(serialDesc, 0, PredefinedDataShiftResponse$$serializer.INSTANCE, self.predefinedDataShift);
        }
        if (!output.q(serialDesc, 1) && self.blacklistedFeatures == null) {
            return;
        }
        output.w(serialDesc, 1, kSerializerArr[1], self.blacklistedFeatures);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final PredefinedDataShiftResponse getPredefinedDataShift() {
        return this.predefinedDataShift;
    }

    @Nullable
    public final List<String> component2() {
        return this.blacklistedFeatures;
    }

    @NotNull
    public final DeviceDataResponse copy(@Nullable PredefinedDataShiftResponse predefinedDataShift, @Nullable List<String> blacklistedFeatures) {
        return new DeviceDataResponse(predefinedDataShift, blacklistedFeatures);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDataResponse)) {
            return false;
        }
        DeviceDataResponse deviceDataResponse = (DeviceDataResponse) other;
        return Intrinsics.c(this.predefinedDataShift, deviceDataResponse.predefinedDataShift) && Intrinsics.c(this.blacklistedFeatures, deviceDataResponse.blacklistedFeatures);
    }

    @Nullable
    public final List<String> getBlacklistedFeatures() {
        return this.blacklistedFeatures;
    }

    @Nullable
    public final PredefinedDataShiftResponse getPredefinedDataShift() {
        return this.predefinedDataShift;
    }

    public int hashCode() {
        PredefinedDataShiftResponse predefinedDataShiftResponse = this.predefinedDataShift;
        int iHashCode = (predefinedDataShiftResponse == null ? 0 : predefinedDataShiftResponse.hashCode()) * 31;
        List<String> list = this.blacklistedFeatures;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @NotNull
    public final DeviceData toDeviceData() {
        ?? arrayList;
        PredefinedDataShiftResponse predefinedDataShiftResponse = this.predefinedDataShift;
        PredefinedDataShift predefinedDataShift = predefinedDataShiftResponse != null ? new PredefinedDataShift(predefinedDataShiftResponse.getEstimatedDataShift(), predefinedDataShiftResponse.getDidEstimatedLastEstimationTime(), predefinedDataShiftResponse.getEnforceNewEstimation(), predefinedDataShiftResponse.getUpdateDateDataShift(), (String) null, 16, (DefaultConstructorMarker) null) : null;
        List<String> list = this.blacklistedFeatures;
        if (list != null) {
            arrayList = new ArrayList();
            for (String str : list) {
                BlacklistedFeature blacklistedFeature = Intrinsics.c(str, "positioning") ? BlacklistedFeature.POSITIONING : Intrinsics.c(str, "multiFloorPositioning") ? BlacklistedFeature.MULTI_FLOOR_POSITIONING : null;
                if (blacklistedFeature != null) {
                    arrayList.add(blacklistedFeature);
                }
            }
        } else {
            arrayList = EmptyList.d;
        }
        return new DeviceData(predefinedDataShift, arrayList);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceDataResponse(predefinedDataShift=");
        sb.append(this.predefinedDataShift);
        sb.append(", blacklistedFeatures=");
        return a.o(sb, this.blacklistedFeatures, ')');
    }

    @Deprecated
    public /* synthetic */ DeviceDataResponse(int i, PredefinedDataShiftResponse predefinedDataShiftResponse, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.predefinedDataShift = null;
        } else {
            this.predefinedDataShift = predefinedDataShiftResponse;
        }
        if ((i & 2) == 0) {
            this.blacklistedFeatures = null;
        } else {
            this.blacklistedFeatures = list;
        }
    }

    public DeviceDataResponse(@Nullable PredefinedDataShiftResponse predefinedDataShiftResponse, @Nullable List<String> list) {
        this.predefinedDataShift = predefinedDataShiftResponse;
        this.blacklistedFeatures = list;
    }

    public /* synthetic */ DeviceDataResponse(PredefinedDataShiftResponse predefinedDataShiftResponse, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : predefinedDataShiftResponse, (i & 2) != 0 ? null : list);
    }
}
