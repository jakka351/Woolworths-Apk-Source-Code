package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.ipssdk.api.models.IPSRegionPlacementFeatures;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015HÁ\u0001¢\u0006\u0002\b\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures;", "Lme/oriient/ipssdk/api/models/IPSRegionPlacementFeatures;", "seen1", "", "canStartPositioning", "", "canStopPositioning", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZ)V", "getCanStartPositioning", "getCanStopPositioning", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_common", "$serializer", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final class RegionPlacementFeatures implements IPSRegionPlacementFeatures {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean canStartPositioning;
    private final boolean canStopPositioning;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<RegionPlacementFeatures> serializer() {
            return RegionPlacementFeatures$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ RegionPlacementFeatures(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, RegionPlacementFeatures$$serializer.INSTANCE.getB());
            throw null;
        }
        this.canStartPositioning = z;
        this.canStopPositioning = z2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_common(RegionPlacementFeatures self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.canStartPositioning);
        output.o(serialDesc, 1, self.canStopPositioning);
    }

    @Override // me.oriient.ipssdk.api.models.IPSRegionPlacementFeatures
    public /* bridge */ /* synthetic */ Boolean getCanStartPositioning() {
        return Boolean.valueOf(getCanStartPositioning());
    }

    @Override // me.oriient.ipssdk.api.models.IPSRegionPlacementFeatures
    public /* bridge */ /* synthetic */ Boolean getCanStopPositioning() {
        return Boolean.valueOf(getCanStopPositioning());
    }

    @NotNull
    public String toString() {
        return b.s(new StringBuilder("RegionPlacementFeatures(canStartPositioning="), this.canStartPositioning, ')');
    }

    public RegionPlacementFeatures(boolean z, boolean z2) {
        this.canStartPositioning = z;
        this.canStopPositioning = z2;
    }

    public boolean getCanStartPositioning() {
        return this.canStartPositioning;
    }

    public boolean getCanStopPositioning() {
        return this.canStopPositioning;
    }
}
