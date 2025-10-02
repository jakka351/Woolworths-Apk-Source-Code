package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/OnActiveFloorChanged;", "", "floorId", "", "(Ljava/lang/String;)V", "getFloorId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OnActiveFloorChanged {

    @NotNull
    private final String floorId;

    public OnActiveFloorChanged(@NotNull String floorId) {
        Intrinsics.h(floorId, "floorId");
        this.floorId = floorId;
    }

    public static /* synthetic */ OnActiveFloorChanged copy$default(OnActiveFloorChanged onActiveFloorChanged, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onActiveFloorChanged.floorId;
        }
        return onActiveFloorChanged.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final OnActiveFloorChanged copy(@NotNull String floorId) {
        Intrinsics.h(floorId, "floorId");
        return new OnActiveFloorChanged(floorId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnActiveFloorChanged) && Intrinsics.c(this.floorId, ((OnActiveFloorChanged) other).floorId);
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public int hashCode() {
        return this.floorId.hashCode();
    }

    @NotNull
    public String toString() {
        return androidx.camera.core.impl.b.r(new StringBuilder("OnActiveFloorChanged(floorId="), this.floorId, ')');
    }
}
