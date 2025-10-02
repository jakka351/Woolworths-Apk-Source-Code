package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0018J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010/J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bHÆ\u0003J°\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0006HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u00103\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001f¨\u0006I"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "floorIndex", "", "height", "", "preferredInitialRotationDegrees", "exitRegions", "", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegion;", "signMarks", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMark;", "restrictedAreas", "Lme/oriient/internal/services/dataManager/floorMetadata/RestrictedArea;", "maps", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMap;", "defaultMap", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;", "defaultSvgMap", "obstacleMap", "navGraph", "(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;)V", "getDefaultMap", "()Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;", "getDefaultSvgMap", "getExitRegions", "()Ljava/util/List;", "getFloorIndex", "()I", "getHeight", "()D", "getId", "()Ljava/lang/String;", "getMaps", "getName", "getNavGraph", "getObstacleMap", "offset", "Lme/oriient/internal/services/dataManager/floorMetadata/Offset;", "getOffset", "()Lme/oriient/internal/services/dataManager/floorMetadata/Offset;", "pixelToMeter", "getPixelToMeter", "getPreferredInitialRotationDegrees", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRestrictedAreas", "getSignMarks", "version", "getVersion", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;)Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;", "equals", "", "other", "hashCode", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FloorMetadata {

    @NotNull
    private final FloorImage defaultMap;

    @Nullable
    private final FloorImage defaultSvgMap;

    @NotNull
    private final List<FloorExitRegion> exitRegions;
    private final int floorIndex;
    private final double height;

    @NotNull
    private final String id;

    @NotNull
    private final List<FloorMap> maps;

    @NotNull
    private final String name;

    @Nullable
    private final FloorImage navGraph;

    @Nullable
    private final FloorImage obstacleMap;

    @NotNull
    private final Offset offset;
    private final double pixelToMeter;

    @Nullable
    private final Double preferredInitialRotationDegrees;

    @NotNull
    private final List<RestrictedArea> restrictedAreas;

    @NotNull
    private final List<SignMark> signMarks;
    private final int version;

    public FloorMetadata(@NotNull String id, @NotNull String name, int i, double d, @Nullable Double d2, @NotNull List<FloorExitRegion> exitRegions, @NotNull List<SignMark> signMarks, @NotNull List<RestrictedArea> restrictedAreas, @NotNull List<FloorMap> maps, @NotNull FloorImage defaultMap, @Nullable FloorImage floorImage, @Nullable FloorImage floorImage2, @Nullable FloorImage floorImage3) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(exitRegions, "exitRegions");
        Intrinsics.h(signMarks, "signMarks");
        Intrinsics.h(restrictedAreas, "restrictedAreas");
        Intrinsics.h(maps, "maps");
        Intrinsics.h(defaultMap, "defaultMap");
        this.id = id;
        this.name = name;
        this.floorIndex = i;
        this.height = d;
        this.preferredInitialRotationDegrees = d2;
        this.exitRegions = exitRegions;
        this.signMarks = signMarks;
        this.restrictedAreas = restrictedAreas;
        this.maps = maps;
        this.defaultMap = defaultMap;
        this.defaultSvgMap = floorImage;
        this.obstacleMap = floorImage2;
        this.navGraph = floorImage3;
        this.version = defaultMap.getVersion();
        this.pixelToMeter = defaultMap.getPixelToMeter();
        this.offset = defaultMap.getOffset();
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final FloorImage getDefaultMap() {
        return this.defaultMap;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final FloorImage getDefaultSvgMap() {
        return this.defaultSvgMap;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final FloorImage getObstacleMap() {
        return this.obstacleMap;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final FloorImage getNavGraph() {
        return this.navGraph;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFloorIndex() {
        return this.floorIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getPreferredInitialRotationDegrees() {
        return this.preferredInitialRotationDegrees;
    }

    @NotNull
    public final List<FloorExitRegion> component6() {
        return this.exitRegions;
    }

    @NotNull
    public final List<SignMark> component7() {
        return this.signMarks;
    }

    @NotNull
    public final List<RestrictedArea> component8() {
        return this.restrictedAreas;
    }

    @NotNull
    public final List<FloorMap> component9() {
        return this.maps;
    }

    @NotNull
    public final FloorMetadata copy(@NotNull String id, @NotNull String name, int floorIndex, double height, @Nullable Double preferredInitialRotationDegrees, @NotNull List<FloorExitRegion> exitRegions, @NotNull List<SignMark> signMarks, @NotNull List<RestrictedArea> restrictedAreas, @NotNull List<FloorMap> maps, @NotNull FloorImage defaultMap, @Nullable FloorImage defaultSvgMap, @Nullable FloorImage obstacleMap, @Nullable FloorImage navGraph) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(exitRegions, "exitRegions");
        Intrinsics.h(signMarks, "signMarks");
        Intrinsics.h(restrictedAreas, "restrictedAreas");
        Intrinsics.h(maps, "maps");
        Intrinsics.h(defaultMap, "defaultMap");
        return new FloorMetadata(id, name, floorIndex, height, preferredInitialRotationDegrees, exitRegions, signMarks, restrictedAreas, maps, defaultMap, defaultSvgMap, obstacleMap, navGraph);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorMetadata)) {
            return false;
        }
        FloorMetadata floorMetadata = (FloorMetadata) other;
        return Intrinsics.c(this.id, floorMetadata.id) && Intrinsics.c(this.name, floorMetadata.name) && this.floorIndex == floorMetadata.floorIndex && Double.compare(this.height, floorMetadata.height) == 0 && Intrinsics.c(this.preferredInitialRotationDegrees, floorMetadata.preferredInitialRotationDegrees) && Intrinsics.c(this.exitRegions, floorMetadata.exitRegions) && Intrinsics.c(this.signMarks, floorMetadata.signMarks) && Intrinsics.c(this.restrictedAreas, floorMetadata.restrictedAreas) && Intrinsics.c(this.maps, floorMetadata.maps) && Intrinsics.c(this.defaultMap, floorMetadata.defaultMap) && Intrinsics.c(this.defaultSvgMap, floorMetadata.defaultSvgMap) && Intrinsics.c(this.obstacleMap, floorMetadata.obstacleMap) && Intrinsics.c(this.navGraph, floorMetadata.navGraph);
    }

    @NotNull
    public final FloorImage getDefaultMap() {
        return this.defaultMap;
    }

    @Nullable
    public final FloorImage getDefaultSvgMap() {
        return this.defaultSvgMap;
    }

    @NotNull
    public final List<FloorExitRegion> getExitRegions() {
        return this.exitRegions;
    }

    public final int getFloorIndex() {
        return this.floorIndex;
    }

    public final double getHeight() {
        return this.height;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<FloorMap> getMaps() {
        return this.maps;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final FloorImage getNavGraph() {
        return this.navGraph;
    }

    @Nullable
    public final FloorImage getObstacleMap() {
        return this.obstacleMap;
    }

    @NotNull
    public final Offset getOffset() {
        return this.offset;
    }

    public final double getPixelToMeter() {
        return this.pixelToMeter;
    }

    @Nullable
    public final Double getPreferredInitialRotationDegrees() {
        return this.preferredInitialRotationDegrees;
    }

    @NotNull
    public final List<RestrictedArea> getRestrictedAreas() {
        return this.restrictedAreas;
    }

    @NotNull
    public final List<SignMark> getSignMarks() {
        return this.signMarks;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.locationManager.J.a(this.height, me.oriient.internal.services.config.a.a(this.floorIndex, me.oriient.internal.infra.rest.a.a(this.name, this.id.hashCode() * 31, 31), 31), 31);
        Double d = this.preferredInitialRotationDegrees;
        int iHashCode = (this.defaultMap.hashCode() + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((iA + (d == null ? 0 : d.hashCode())) * 31, 31, this.exitRegions), 31, this.signMarks), 31, this.restrictedAreas), 31, this.maps)) * 31;
        FloorImage floorImage = this.defaultSvgMap;
        int iHashCode2 = (iHashCode + (floorImage == null ? 0 : floorImage.hashCode())) * 31;
        FloorImage floorImage2 = this.obstacleMap;
        int iHashCode3 = (iHashCode2 + (floorImage2 == null ? 0 : floorImage2.hashCode())) * 31;
        FloorImage floorImage3 = this.navGraph;
        return iHashCode3 + (floorImage3 != null ? floorImage3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FloorMetadata(id=" + this.id + ", name=" + this.name + ", floorIndex=" + this.floorIndex + ", height=" + this.height + ", preferredInitialRotationDegrees=" + this.preferredInitialRotationDegrees + ", exitRegions=" + this.exitRegions + ", signMarks=" + this.signMarks + ", restrictedAreas=" + this.restrictedAreas + ", maps=" + this.maps + ", defaultMap=" + this.defaultMap + ", defaultSvgMap=" + this.defaultSvgMap + ", obstacleMap=" + this.obstacleMap + ", navGraph=" + this.navGraph + ')';
    }
}
