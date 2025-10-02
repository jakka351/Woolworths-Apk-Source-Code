package me.oriient.navigation.ondevice.navgraph;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraphRecord;", "", "buildingId", "", "floorId", "spaceId", "version", "", "navGraph", "Lme/oriient/navigation/ondevice/navgraph/NavGraph;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILme/oriient/navigation/ondevice/navgraph/NavGraph;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorId", "getNavGraph", "()Lme/oriient/navigation/ondevice/navgraph/NavGraph;", "getSpaceId", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavGraphRecord {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String floorId;

    @NotNull
    private final NavGraph navGraph;

    @NotNull
    private final String spaceId;
    private final int version;

    public NavGraphRecord(@NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId, int i, @NotNull NavGraph navGraph) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(navGraph, "navGraph");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.spaceId = spaceId;
        this.version = i;
        this.navGraph = navGraph;
    }

    public static /* synthetic */ NavGraphRecord copy$default(NavGraphRecord navGraphRecord, String str, String str2, String str3, int i, NavGraph navGraph, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = navGraphRecord.buildingId;
        }
        if ((i2 & 2) != 0) {
            str2 = navGraphRecord.floorId;
        }
        if ((i2 & 4) != 0) {
            str3 = navGraphRecord.spaceId;
        }
        if ((i2 & 8) != 0) {
            i = navGraphRecord.version;
        }
        if ((i2 & 16) != 0) {
            navGraph = navGraphRecord.navGraph;
        }
        NavGraph navGraph2 = navGraph;
        String str4 = str3;
        return navGraphRecord.copy(str, str2, str4, i, navGraph2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final NavGraph getNavGraph() {
        return this.navGraph;
    }

    @NotNull
    public final NavGraphRecord copy(@NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId, int version, @NotNull NavGraph navGraph) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(navGraph, "navGraph");
        return new NavGraphRecord(buildingId, floorId, spaceId, version, navGraph);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavGraphRecord)) {
            return false;
        }
        NavGraphRecord navGraphRecord = (NavGraphRecord) other;
        return Intrinsics.c(this.buildingId, navGraphRecord.buildingId) && Intrinsics.c(this.floorId, navGraphRecord.floorId) && Intrinsics.c(this.spaceId, navGraphRecord.spaceId) && this.version == navGraphRecord.version && Intrinsics.c(this.navGraph, navGraphRecord.navGraph);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final NavGraph getNavGraph() {
        return this.navGraph;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.navGraph.hashCode() + androidx.camera.core.impl.b.a(this.version, androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.buildingId.hashCode() * 31, 31, this.floorId), 31, this.spaceId), 31);
    }

    @NotNull
    public String toString() {
        return "NavGraphRecord(buildingId=" + this.buildingId + ", floorId=" + this.floorId + ", spaceId=" + this.spaceId + ", version=" + this.version + ", navGraph=" + this.navGraph + ')';
    }
}
