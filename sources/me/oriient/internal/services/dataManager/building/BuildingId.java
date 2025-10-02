package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Mapable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0016\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingId;", "Lme/oriient/internal/infra/utils/core/Mapable;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toMap", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BuildingId implements Mapable {

    @NotNull
    private final String value;

    public BuildingId(@NotNull String value) {
        Intrinsics.h(value, "value");
        this.value = value;
    }

    public static /* synthetic */ BuildingId copy$default(BuildingId buildingId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingId.value;
        }
        return buildingId.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final BuildingId copy(@NotNull String value) {
        Intrinsics.h(value, "value");
        return new BuildingId(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BuildingId) && Intrinsics.c(this.value, ((BuildingId) other).value);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // me.oriient.internal.infra.utils.core.Mapable
    @NotNull
    public Map<String, Object> toMap() {
        return androidx.constraintlayout.core.state.a.s("buildingId", this.value);
    }

    @NotNull
    public String toString() {
        return me.oriient.internal.infra.rest.e.a(new StringBuilder("BuildingId(value="), this.value, ')');
    }
}
