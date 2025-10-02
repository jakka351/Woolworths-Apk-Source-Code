package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, d2 = {"Lme/oriient/internal/services/dataManager/building/RegionPlacementFeatures;", "", "seen1", "", "canStartPositioning", "", "canStopPositioning", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZ)V", "getCanStartPositioning", "()Z", "getCanStopPositioning", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class RegionPlacementFeatures {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final boolean canStartPositioning;
    private final boolean canStopPositioning;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/RegionPlacementFeatures$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/RegionPlacementFeatures;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
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

    public static /* synthetic */ RegionPlacementFeatures copy$default(RegionPlacementFeatures regionPlacementFeatures, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = regionPlacementFeatures.canStartPositioning;
        }
        if ((i & 2) != 0) {
            z2 = regionPlacementFeatures.canStopPositioning;
        }
        return regionPlacementFeatures.copy(z, z2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(RegionPlacementFeatures self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.canStartPositioning);
        output.o(serialDesc, 1, self.canStopPositioning);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanStartPositioning() {
        return this.canStartPositioning;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanStopPositioning() {
        return this.canStopPositioning;
    }

    @NotNull
    public final RegionPlacementFeatures copy(boolean canStartPositioning, boolean canStopPositioning) {
        return new RegionPlacementFeatures(canStartPositioning, canStopPositioning);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionPlacementFeatures)) {
            return false;
        }
        RegionPlacementFeatures regionPlacementFeatures = (RegionPlacementFeatures) other;
        return this.canStartPositioning == regionPlacementFeatures.canStartPositioning && this.canStopPositioning == regionPlacementFeatures.canStopPositioning;
    }

    public final boolean getCanStartPositioning() {
        return this.canStartPositioning;
    }

    public final boolean getCanStopPositioning() {
        return this.canStopPositioning;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canStopPositioning) + (Boolean.hashCode(this.canStartPositioning) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RegionPlacementFeatures(canStartPositioning=");
        sb.append(this.canStartPositioning);
        sb.append(", canStopPositioning=");
        return androidx.camera.core.impl.b.s(sb, this.canStopPositioning, ')');
    }

    public RegionPlacementFeatures(boolean z, boolean z2) {
        this.canStartPositioning = z;
        this.canStopPositioning = z2;
    }
}
