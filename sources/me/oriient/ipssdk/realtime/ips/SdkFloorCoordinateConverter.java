package me.oriient.ipssdk.realtime.ips;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.dataManager.buildingCoordinateConverter.FloorCoordinatesConverter;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSFloorCoordinatesConverter;
import me.oriient.ipssdk.api.models.IPSFloorLayout;
import me.oriient.ipssdk.api.models.IPSFloorLayoutPartFindingResult;
import me.oriient.ipssdk.api.models.IPSHeading;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ofs.M4;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import me.oriient.ipssdk.realtime.utils.models.CoordinateKt;
import me.oriient.ipssdk.realtime.utils.models.HeadingKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/SdkFloorCoordinateConverter;", "Lme/oriient/ipssdk/api/models/IPSFloorCoordinatesConverter;", "", "buildingId", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorCoordinatesConverter;", "floorCoordinatesConverter", "Lme/oriient/ipssdk/api/models/IPSFloorLayout;", "floorLayout", "", "snappingMaxDistance", "warningDistance", "<init>", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorCoordinatesConverter;Lme/oriient/ipssdk/api/models/IPSFloorLayout;DD)V", "getFloorId", "()Ljava/lang/String;", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "coordinate", "convertFromOriient", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;)Lme/oriient/ipssdk/api/models/IPSCoordinate;", "Lme/oriient/ipssdk/api/models/IPSHeading;", "heading", "(Lme/oriient/ipssdk/api/models/IPSHeading;)Lme/oriient/ipssdk/api/models/IPSHeading;", "convertToOriient", "", "allowSnapping", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Z)Lme/oriient/ipssdk/api/models/IPSCoordinate;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SdkFloorCoordinateConverter implements IPSFloorCoordinatesConverter {

    /* renamed from: a, reason: collision with root package name */
    private final String f25858a;
    private final FloorCoordinatesConverter b;
    private final IPSFloorLayout c;
    private final double d;
    private final double e;
    private final Lazy f;

    public SdkFloorCoordinateConverter(@NotNull String buildingId, @NotNull FloorCoordinatesConverter floorCoordinatesConverter, @Nullable IPSFloorLayout iPSFloorLayout, double d, double d2) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorCoordinatesConverter, "floorCoordinatesConverter");
        this.f25858a = buildingId;
        this.b = floorCoordinatesConverter;
        this.c = iPSFloorLayout;
        this.d = d;
        this.e = d2;
        this.f = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(ELog.class));
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloorCoordinatesConverter
    @NotNull
    public IPSCoordinate convertFromOriient(@NotNull IPSCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return CoordinateKt.toCoordinate(this.b.convertFromOriient(BuildingExtKt.toIndoorCoordinate(coordinate)));
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloorCoordinatesConverter
    @NotNull
    public IPSCoordinate convertToOriient(@NotNull IPSCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return convertToOriient(coordinate, true);
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloorCoordinatesConverter
    @NotNull
    public String getFloorId() {
        return this.b.getFloorId();
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloorCoordinatesConverter
    @NotNull
    public IPSCoordinate convertToOriient(@NotNull IPSCoordinate coordinate, boolean allowSnapping) {
        IPSFloorLayout iPSFloorLayout;
        Intrinsics.h(coordinate, "coordinate");
        Coordinate coordinate2 = CoordinateKt.toCoordinate(this.b.convertToOriient(BuildingExtKt.toIndoorCoordinate(coordinate)));
        if (allowSnapping && (iPSFloorLayout = this.c) != null) {
            IPSFloorLayoutPartFindingResult iPSFloorLayoutPartFindingResultFindClosestPart = iPSFloorLayout.findClosestPart(coordinate2);
            if (iPSFloorLayoutPartFindingResultFindClosestPart.getDistance() <= this.d) {
                return iPSFloorLayoutPartFindingResultFindClosestPart.getCoordinate();
            }
            if (iPSFloorLayoutPartFindingResultFindClosestPart.getDistance() >= this.e) {
                ((ELog) this.f.getD()).w("SdkFloorCoordinateConverter", "Client coordinate is too far", new M4(this, coordinate, coordinate2, iPSFloorLayoutPartFindingResultFindClosestPart));
            }
        }
        return coordinate2;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloorCoordinatesConverter
    @NotNull
    public IPSHeading convertFromOriient(@NotNull IPSHeading heading) {
        Intrinsics.h(heading, "heading");
        return HeadingKt.toSdkHeading(this.b.convertFromOriient(BuildingExtKt.toHeading(heading)));
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloorCoordinatesConverter
    @NotNull
    public IPSHeading convertToOriient(@NotNull IPSHeading heading) {
        Intrinsics.h(heading, "heading");
        return HeadingKt.toSdkHeading(this.b.convertToOriient(BuildingExtKt.toHeading(heading)));
    }
}
