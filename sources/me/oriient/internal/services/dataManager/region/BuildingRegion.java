package me.oriient.internal.services.dataManager.region;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.auth.rest.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lme/oriient/internal/services/dataManager/region/BuildingRegion;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "metadata", "placements", "", "Lme/oriient/internal/services/dataManager/region/BuildingRegionPlacement;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getMetadata", "getName", "getPlacements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BuildingRegion {

    @NotNull
    private final String id;

    @Nullable
    private final String metadata;

    @NotNull
    private final String name;

    @NotNull
    private final List<BuildingRegionPlacement> placements;

    public BuildingRegion(@NotNull String id, @NotNull String name, @Nullable String str, @NotNull List<BuildingRegionPlacement> placements) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(placements, "placements");
        this.id = id;
        this.name = name;
        this.metadata = str;
        this.placements = placements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuildingRegion copy$default(BuildingRegion buildingRegion, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingRegion.id;
        }
        if ((i & 2) != 0) {
            str2 = buildingRegion.name;
        }
        if ((i & 4) != 0) {
            str3 = buildingRegion.metadata;
        }
        if ((i & 8) != 0) {
            list = buildingRegion.placements;
        }
        return buildingRegion.copy(str, str2, str3, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final List<BuildingRegionPlacement> component4() {
        return this.placements;
    }

    @NotNull
    public final BuildingRegion copy(@NotNull String id, @NotNull String name, @Nullable String metadata, @NotNull List<BuildingRegionPlacement> placements) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(placements, "placements");
        return new BuildingRegion(id, name, metadata, placements);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildingRegion)) {
            return false;
        }
        BuildingRegion buildingRegion = (BuildingRegion) other;
        return Intrinsics.c(this.id, buildingRegion.id) && Intrinsics.c(this.name, buildingRegion.name) && Intrinsics.c(this.metadata, buildingRegion.metadata) && Intrinsics.c(this.placements, buildingRegion.placements);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<BuildingRegionPlacement> getPlacements() {
        return this.placements;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.rest.a.a(this.name, this.id.hashCode() * 31, 31);
        String str = this.metadata;
        return this.placements.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BuildingRegion(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", placements=");
        return m.a(sb, this.placements, ')');
    }
}
