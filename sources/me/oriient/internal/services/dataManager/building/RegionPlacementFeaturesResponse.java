package me.oriient.internal.services.dataManager.building;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006'"}, d2 = {"Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;", "", "seen1", "", "enableStartPositioning", "", "enableStartPositioningOnlyInGeo", "enableAutoStopPositioningGeo", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEnableAutoStopPositioningGeo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableStartPositioning", "getEnableStartPositioningOnlyInGeo", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;", "equals", "other", "hashCode", "toFeatures", "Lme/oriient/internal/services/dataManager/building/RegionPlacementFeatures;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class RegionPlacementFeaturesResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Boolean enableAutoStopPositioningGeo;

    @Nullable
    private final Boolean enableStartPositioning;

    @Nullable
    private final Boolean enableStartPositioningOnlyInGeo;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RegionPlacementFeaturesResponse> serializer() {
            return RegionPlacementFeaturesResponse$$serializer.INSTANCE;
        }
    }

    public RegionPlacementFeaturesResponse() {
        this((Boolean) null, (Boolean) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RegionPlacementFeaturesResponse copy$default(RegionPlacementFeaturesResponse regionPlacementFeaturesResponse, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = regionPlacementFeaturesResponse.enableStartPositioning;
        }
        if ((i & 2) != 0) {
            bool2 = regionPlacementFeaturesResponse.enableStartPositioningOnlyInGeo;
        }
        if ((i & 4) != 0) {
            bool3 = regionPlacementFeaturesResponse.enableAutoStopPositioningGeo;
        }
        return regionPlacementFeaturesResponse.copy(bool, bool2, bool3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(RegionPlacementFeaturesResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.enableStartPositioning != null) {
            output.w(serialDesc, 0, BooleanSerializer.f24779a, self.enableStartPositioning);
        }
        if (output.q(serialDesc, 1) || self.enableStartPositioningOnlyInGeo != null) {
            output.w(serialDesc, 1, BooleanSerializer.f24779a, self.enableStartPositioningOnlyInGeo);
        }
        if (!output.q(serialDesc, 2) && self.enableAutoStopPositioningGeo == null) {
            return;
        }
        output.w(serialDesc, 2, BooleanSerializer.f24779a, self.enableAutoStopPositioningGeo);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getEnableStartPositioning() {
        return this.enableStartPositioning;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getEnableStartPositioningOnlyInGeo() {
        return this.enableStartPositioningOnlyInGeo;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getEnableAutoStopPositioningGeo() {
        return this.enableAutoStopPositioningGeo;
    }

    @NotNull
    public final RegionPlacementFeaturesResponse copy(@Nullable Boolean enableStartPositioning, @Nullable Boolean enableStartPositioningOnlyInGeo, @Nullable Boolean enableAutoStopPositioningGeo) {
        return new RegionPlacementFeaturesResponse(enableStartPositioning, enableStartPositioningOnlyInGeo, enableAutoStopPositioningGeo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionPlacementFeaturesResponse)) {
            return false;
        }
        RegionPlacementFeaturesResponse regionPlacementFeaturesResponse = (RegionPlacementFeaturesResponse) other;
        return Intrinsics.c(this.enableStartPositioning, regionPlacementFeaturesResponse.enableStartPositioning) && Intrinsics.c(this.enableStartPositioningOnlyInGeo, regionPlacementFeaturesResponse.enableStartPositioningOnlyInGeo) && Intrinsics.c(this.enableAutoStopPositioningGeo, regionPlacementFeaturesResponse.enableAutoStopPositioningGeo);
    }

    @Nullable
    public final Boolean getEnableAutoStopPositioningGeo() {
        return this.enableAutoStopPositioningGeo;
    }

    @Nullable
    public final Boolean getEnableStartPositioning() {
        return this.enableStartPositioning;
    }

    @Nullable
    public final Boolean getEnableStartPositioningOnlyInGeo() {
        return this.enableStartPositioningOnlyInGeo;
    }

    public int hashCode() {
        Boolean bool = this.enableStartPositioning;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableStartPositioningOnlyInGeo;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableAutoStopPositioningGeo;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public final RegionPlacementFeatures toFeatures() {
        Boolean bool = this.enableStartPositioning;
        Boolean bool2 = Boolean.TRUE;
        boolean z = Intrinsics.c(bool, bool2) || Intrinsics.c(this.enableStartPositioningOnlyInGeo, bool2);
        Boolean bool3 = this.enableAutoStopPositioningGeo;
        return new RegionPlacementFeatures(z, bool3 != null ? bool3.booleanValue() : false);
    }

    @NotNull
    public String toString() {
        return "RegionPlacementFeaturesResponse(enableStartPositioning=" + this.enableStartPositioning + ", enableStartPositioningOnlyInGeo=" + this.enableStartPositioningOnlyInGeo + ", enableAutoStopPositioningGeo=" + this.enableAutoStopPositioningGeo + ')';
    }

    @Deprecated
    public /* synthetic */ RegionPlacementFeaturesResponse(int i, Boolean bool, Boolean bool2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enableStartPositioning = null;
        } else {
            this.enableStartPositioning = bool;
        }
        if ((i & 2) == 0) {
            this.enableStartPositioningOnlyInGeo = null;
        } else {
            this.enableStartPositioningOnlyInGeo = bool2;
        }
        if ((i & 4) == 0) {
            this.enableAutoStopPositioningGeo = null;
        } else {
            this.enableAutoStopPositioningGeo = bool3;
        }
    }

    public RegionPlacementFeaturesResponse(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.enableStartPositioning = bool;
        this.enableStartPositioningOnlyInGeo = bool2;
        this.enableAutoStopPositioningGeo = bool3;
    }

    public /* synthetic */ RegionPlacementFeaturesResponse(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
