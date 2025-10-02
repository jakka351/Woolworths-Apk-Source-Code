package me.oriient.positioningengine.support.device_data.model;

import androidx.annotation.Keep;
import androidx.compose.ui.input.pointer.a;
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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/DeviceData;", "", "seen1", "", "predefinedDataShift", "Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "blacklistedFeatures", "", "Lme/oriient/positioningengine/support/device_data/model/BlacklistedFeature;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;Ljava/util/List;)V", "getBlacklistedFeatures", "()Ljava/util/List;", "getPredefinedDataShift", "()Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class DeviceData {

    @NotNull
    private final List<BlacklistedFeature> blacklistedFeatures;

    @Nullable
    private final PredefinedDataShift predefinedDataShift;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EnumsKt.b(BlacklistedFeature.values(), "me.oriient.positioningengine.support.device_data.model.BlacklistedFeature"))};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/DeviceData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/support/device_data/model/DeviceData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<DeviceData> serializer() {
            return DeviceData$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ DeviceData(int i, PredefinedDataShift predefinedDataShift, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, DeviceData$$serializer.INSTANCE.getB());
            throw null;
        }
        this.predefinedDataShift = predefinedDataShift;
        this.blacklistedFeatures = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, PredefinedDataShift predefinedDataShift, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            predefinedDataShift = deviceData.predefinedDataShift;
        }
        if ((i & 2) != 0) {
            list = deviceData.blacklistedFeatures;
        }
        return deviceData.copy(predefinedDataShift, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(DeviceData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.w(serialDesc, 0, PredefinedDataShift$$serializer.INSTANCE, self.predefinedDataShift);
        output.F(serialDesc, 1, kSerializerArr[1], self.blacklistedFeatures);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final PredefinedDataShift getPredefinedDataShift() {
        return this.predefinedDataShift;
    }

    @NotNull
    public final List<BlacklistedFeature> component2() {
        return this.blacklistedFeatures;
    }

    @NotNull
    public final DeviceData copy(@Nullable PredefinedDataShift predefinedDataShift, @NotNull List<? extends BlacklistedFeature> blacklistedFeatures) {
        Intrinsics.h(blacklistedFeatures, "blacklistedFeatures");
        return new DeviceData(predefinedDataShift, blacklistedFeatures);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceData)) {
            return false;
        }
        DeviceData deviceData = (DeviceData) other;
        return Intrinsics.c(this.predefinedDataShift, deviceData.predefinedDataShift) && Intrinsics.c(this.blacklistedFeatures, deviceData.blacklistedFeatures);
    }

    @NotNull
    public final List<BlacklistedFeature> getBlacklistedFeatures() {
        return this.blacklistedFeatures;
    }

    @Nullable
    public final PredefinedDataShift getPredefinedDataShift() {
        return this.predefinedDataShift;
    }

    public int hashCode() {
        PredefinedDataShift predefinedDataShift = this.predefinedDataShift;
        return this.blacklistedFeatures.hashCode() + ((predefinedDataShift == null ? 0 : predefinedDataShift.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceData(predefinedDataShift=");
        sb.append(this.predefinedDataShift);
        sb.append(", blacklistedFeatures=");
        return a.o(sb, this.blacklistedFeatures, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceData(@Nullable PredefinedDataShift predefinedDataShift, @NotNull List<? extends BlacklistedFeature> blacklistedFeatures) {
        Intrinsics.h(blacklistedFeatures, "blacklistedFeatures");
        this.predefinedDataShift = predefinedDataShift;
        this.blacklistedFeatures = blacklistedFeatures;
    }
}
