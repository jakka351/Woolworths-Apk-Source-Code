package me.oriient.ipssdk.realtime.ips;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.dataManager.buildingCoordinateConverter.BuildingCoordinateConverter;
import me.oriient.internal.services.dataManager.buildingCoordinateConverter.FloorCoordinatesConverter;
import me.oriient.internal.services.dataManager.common.Heading;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter;
import me.oriient.ipssdk.api.models.IPSBuildingLayout;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSFloorCoordinatesConverter;
import me.oriient.ipssdk.api.models.IPSFloorLayout;
import me.oriient.ipssdk.api.models.IPSHeading;
import me.oriient.ipssdk.realtime.utils.models.CoordinateKt;
import me.oriient.ipssdk.realtime.utils.models.HeadingKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0014\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0018J)\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0015J!\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/SdkBuildingCoordinateConverter;", "Lme/oriient/ipssdk/api/models/IPSBuildingCoordinatesConverter;", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/BuildingCoordinateConverter;", "buildingCoordinateConverter", "Lme/oriient/ipssdk/api/models/IPSBuildingLayout;", "buildingLayout", "", "snappingMaxDistance", "warningDistance", "<init>", "(Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/BuildingCoordinateConverter;Lme/oriient/ipssdk/api/models/IPSBuildingLayout;DD)V", "", "getBuildingId", "()Ljava/lang/String;", "floorId", "Lme/oriient/ipssdk/api/models/IPSFloorCoordinatesConverter;", "getFloorCoordinatesConverter", "(Ljava/lang/String;)Lme/oriient/ipssdk/api/models/IPSFloorCoordinatesConverter;", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "coordinate", "convertFromOriient", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Ljava/lang/String;)Lme/oriient/ipssdk/api/models/IPSCoordinate;", "Lme/oriient/ipssdk/api/models/IPSHeading;", "heading", "(Lme/oriient/ipssdk/api/models/IPSHeading;Ljava/lang/String;)Lme/oriient/ipssdk/api/models/IPSHeading;", "", "allowSnapping", "convertToOriient", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Ljava/lang/String;Z)Lme/oriient/ipssdk/api/models/IPSCoordinate;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SdkBuildingCoordinateConverter implements IPSBuildingCoordinatesConverter {

    /* renamed from: a, reason: collision with root package name */
    private final BuildingCoordinateConverter f25857a;
    private final IPSBuildingLayout b;
    private final double c;
    private final double d;

    public SdkBuildingCoordinateConverter(@NotNull BuildingCoordinateConverter buildingCoordinateConverter, @Nullable IPSBuildingLayout iPSBuildingLayout, double d, double d2) {
        Intrinsics.h(buildingCoordinateConverter, "buildingCoordinateConverter");
        this.f25857a = buildingCoordinateConverter;
        this.b = iPSBuildingLayout;
        this.c = d;
        this.d = d2;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter
    @Nullable
    public IPSCoordinate convertFromOriient(@NotNull IPSCoordinate coordinate, @NotNull String floorId) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(floorId, "floorId");
        IndoorCoordinate indoorCoordinateConvertFromOriient = this.f25857a.convertFromOriient(BuildingExtKt.toIndoorCoordinate(coordinate), floorId);
        if (indoorCoordinateConvertFromOriient != null) {
            return CoordinateKt.toCoordinate(indoorCoordinateConvertFromOriient);
        }
        return null;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter
    @Nullable
    public IPSCoordinate convertToOriient(@NotNull IPSCoordinate coordinate, @NotNull String floorId, boolean allowSnapping) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(floorId, "floorId");
        IPSFloorCoordinatesConverter floorCoordinatesConverter = getFloorCoordinatesConverter(floorId);
        if (floorCoordinatesConverter != null) {
            return floorCoordinatesConverter.convertToOriient(coordinate, allowSnapping);
        }
        return null;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter
    @NotNull
    public String getBuildingId() {
        return this.f25857a.getBuildingId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter
    @Nullable
    public IPSFloorCoordinatesConverter getFloorCoordinatesConverter(@NotNull String floorId) {
        List<IPSFloorLayout> floors;
        Intrinsics.h(floorId, "floorId");
        FloorCoordinatesConverter floorCoordinatesConverter = this.f25857a.getFloorConverters().get(floorId);
        IPSFloorLayout iPSFloorLayout = null;
        if (floorCoordinatesConverter == null) {
            return null;
        }
        String buildingId = this.f25857a.getBuildingId();
        IPSBuildingLayout iPSBuildingLayout = this.b;
        if (iPSBuildingLayout != null && (floors = iPSBuildingLayout.getFloors()) != null) {
            Iterator<T> it = floors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.c(((IPSFloorLayout) next).getFloorId(), floorId)) {
                    iPSFloorLayout = next;
                    break;
                }
            }
            iPSFloorLayout = iPSFloorLayout;
        }
        return new SdkFloorCoordinateConverter(buildingId, floorCoordinatesConverter, iPSFloorLayout, this.c, this.d);
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter
    @Nullable
    public IPSCoordinate convertToOriient(@NotNull IPSCoordinate coordinate, @NotNull String floorId) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(floorId, "floorId");
        return convertToOriient(coordinate, floorId, true);
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter
    @Nullable
    public IPSHeading convertToOriient(@NotNull IPSHeading heading, @NotNull String floorId) {
        Intrinsics.h(heading, "heading");
        Intrinsics.h(floorId, "floorId");
        Heading headingConvertToOriient = this.f25857a.convertToOriient(BuildingExtKt.toHeading(heading), floorId);
        if (headingConvertToOriient != null) {
            return HeadingKt.toSdkHeading(headingConvertToOriient);
        }
        return null;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter
    @Nullable
    public IPSHeading convertFromOriient(@NotNull IPSHeading heading, @NotNull String floorId) {
        Intrinsics.h(heading, "heading");
        Intrinsics.h(floorId, "floorId");
        Heading headingConvertFromOriient = this.f25857a.convertFromOriient(BuildingExtKt.toHeading(heading), floorId);
        if (headingConvertFromOriient != null) {
            return HeadingKt.toSdkHeading(headingConvertFromOriient);
        }
        return null;
    }

    public /* synthetic */ SdkBuildingCoordinateConverter(BuildingCoordinateConverter buildingCoordinateConverter, IPSBuildingLayout iPSBuildingLayout, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(buildingCoordinateConverter, (i & 2) != 0 ? null : iPSBuildingLayout, d, d2);
    }
}
