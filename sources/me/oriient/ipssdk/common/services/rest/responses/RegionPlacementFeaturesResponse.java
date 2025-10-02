package me.oriient.ipssdk.common.services.rest.responses;

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
import me.oriient.ipssdk.common.utils.models.RegionPlacementFeatures;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\""}, d2 = {"Lme/oriient/ipssdk/common/services/rest/responses/RegionPlacementFeaturesResponse;", "", "seen1", "", "enableStartPositioning", "", "enableAutoStopPositioningGeo", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZ)V", "getEnableAutoStopPositioningGeo", "()Z", "getEnableStartPositioning", "component1", "component2", "copy", "equals", "other", "hashCode", "toFeatures", "Lme/oriient/ipssdk/common/utils/models/RegionPlacementFeatures;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_common", "$serializer", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class RegionPlacementFeaturesResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enableAutoStopPositioningGeo;
    private final boolean enableStartPositioning;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/responses/RegionPlacementFeaturesResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/common/services/rest/responses/RegionPlacementFeaturesResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<RegionPlacementFeaturesResponse> serializer() {
            return RegionPlacementFeaturesResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ RegionPlacementFeaturesResponse(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, RegionPlacementFeaturesResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.enableStartPositioning = z;
        this.enableAutoStopPositioningGeo = z2;
    }

    public static /* synthetic */ RegionPlacementFeaturesResponse copy$default(RegionPlacementFeaturesResponse regionPlacementFeaturesResponse, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = regionPlacementFeaturesResponse.enableStartPositioning;
        }
        if ((i & 2) != 0) {
            z2 = regionPlacementFeaturesResponse.enableAutoStopPositioningGeo;
        }
        return regionPlacementFeaturesResponse.copy(z, z2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_common(RegionPlacementFeaturesResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.enableStartPositioning);
        output.o(serialDesc, 1, self.enableAutoStopPositioningGeo);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableStartPositioning() {
        return this.enableStartPositioning;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableAutoStopPositioningGeo() {
        return this.enableAutoStopPositioningGeo;
    }

    @NotNull
    public final RegionPlacementFeaturesResponse copy(boolean enableStartPositioning, boolean enableAutoStopPositioningGeo) {
        return new RegionPlacementFeaturesResponse(enableStartPositioning, enableAutoStopPositioningGeo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionPlacementFeaturesResponse)) {
            return false;
        }
        RegionPlacementFeaturesResponse regionPlacementFeaturesResponse = (RegionPlacementFeaturesResponse) other;
        return this.enableStartPositioning == regionPlacementFeaturesResponse.enableStartPositioning && this.enableAutoStopPositioningGeo == regionPlacementFeaturesResponse.enableAutoStopPositioningGeo;
    }

    public final boolean getEnableAutoStopPositioningGeo() {
        return this.enableAutoStopPositioningGeo;
    }

    public final boolean getEnableStartPositioning() {
        return this.enableStartPositioning;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableAutoStopPositioningGeo) + (Boolean.hashCode(this.enableStartPositioning) * 31);
    }

    @NotNull
    public final RegionPlacementFeatures toFeatures() {
        return new RegionPlacementFeatures(this.enableStartPositioning, this.enableAutoStopPositioningGeo);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RegionPlacementFeaturesResponse(enableStartPositioning=");
        sb.append(this.enableStartPositioning);
        sb.append(", enableAutoStopPositioningGeo=");
        return b.s(sb, this.enableAutoStopPositioningGeo, ')');
    }

    public RegionPlacementFeaturesResponse(boolean z, boolean z2) {
        this.enableStartPositioning = z;
        this.enableAutoStopPositioningGeo = z2;
    }
}
