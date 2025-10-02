package me.oriient.internal.infra.utils.core;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;

/* loaded from: classes7.dex */
public final class f implements GlobalCoordinatesConverter {

    /* renamed from: a, reason: collision with root package name */
    public final double f25006a = 6356752.314245179d;
    public final double b = 4.0680631590769E13d;
    public final double c = 4.0408299984661445E13d;
    public final double d = Math.sqrt(0.006694379990141316d);
    public final double e = Math.sqrt(0.006739496742276434d);

    public static double a(double d) {
        return (d / SubsamplingScaleImageView.ORIENTATION_180) * 3.141592653589793d;
    }

    @Override // me.oriient.internal.infra.utils.core.GlobalCoordinatesConverter
    public final WorldCoordinate convertBuildingCoordinateToGlobal(IndoorCoordinate coordinate, WorldCoordinate buildingOrigin, double d) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        double d2 = -a(d);
        IndoorCoordinate indoorCoordinate = new IndoorCoordinate((coordinate.getX() * Math.cos(d2)) - (coordinate.getY() * Math.sin(d2)), (coordinate.getY() * Math.cos(d2)) + (coordinate.getX() * Math.sin(d2)), 0.0d);
        double x = indoorCoordinate.getX();
        double y = indoorCoordinate.getY();
        double z = coordinate.getZ();
        double dA = a(buildingOrigin.getLatitude());
        double dA2 = a(buildingOrigin.getLongitude());
        double altitude = buildingOrigin.getAltitude();
        double dSin = Math.sin(dA);
        double d3 = 1;
        double d4 = this.d;
        double dSqrt = 6378137.0d / Math.sqrt(d3 - (((d4 * d4) * dSin) * dSin));
        double d5 = dSqrt + altitude;
        IndoorCoordinate indoorCoordinate2 = new IndoorCoordinate(Math.cos(dA) * d5 * Math.cos(dA2), Math.cos(dA) * d5 * Math.sin(dA2), Math.sin(dA) * (((this.c / this.b) * dSqrt) + altitude));
        double dA3 = a(buildingOrigin.getLatitude());
        double dA4 = a(buildingOrigin.getLongitude());
        double dCos = (Math.cos(dA3) * z) - (Math.sin(dA3) * y);
        IndoorCoordinate indoorCoordinate3 = new IndoorCoordinate((Math.cos(dA4) * dCos) - (Math.sin(dA4) * x), (Math.cos(dA4) * x) + (Math.sin(dA4) * dCos), (Math.cos(dA3) * y) + (Math.sin(dA3) * z));
        IndoorCoordinate indoorCoordinate4 = new IndoorCoordinate(indoorCoordinate2.getX() + indoorCoordinate3.getX(), indoorCoordinate2.getY() + indoorCoordinate3.getY(), indoorCoordinate2.getZ() + indoorCoordinate3.getZ());
        double x2 = indoorCoordinate4.getX();
        double y2 = indoorCoordinate4.getY();
        double z2 = indoorCoordinate4.getZ();
        double dSqrt2 = Math.sqrt((y2 * y2) + (x2 * x2));
        double dAtan = Math.atan((z2 * 6378137.0d) / (this.f25006a * dSqrt2));
        double dSin2 = Math.sin(dAtan);
        double dCos2 = Math.cos(dAtan);
        double d6 = this.e;
        double d7 = (d6 * d6 * this.f25006a * dSin2 * dSin2 * dSin2) + z2;
        double d8 = this.d;
        double dAtan2 = Math.atan(d7 / (dSqrt2 - (((((d8 * d8) * 6378137.0d) * dCos2) * dCos2) * dCos2)));
        double dAtan3 = Math.atan(y2 / x2);
        double dSin3 = Math.sin(dAtan2);
        double d9 = this.d;
        double dCos3 = (dSqrt2 / Math.cos(dAtan2)) - (6378137.0d / Math.sqrt(d3 - (((d9 * d9) * dSin3) * dSin3)));
        if (x2 < 0.0d && y2 < 0.0d) {
            dAtan3 -= 3.141592653589793d;
        }
        if (x2 < 0.0d && y2 > 0.0d) {
            dAtan3 += 3.141592653589793d;
        }
        WorldCoordinate worldCoordinate = new WorldCoordinate(dAtan2, dAtan3, dCos3);
        double latitude = worldCoordinate.getLatitude();
        double d10 = SubsamplingScaleImageView.ORIENTATION_180;
        return new WorldCoordinate((latitude * d10) / 3.141592653589793d, (worldCoordinate.getLongitude() * d10) / 3.141592653589793d, worldCoordinate.getAltitude());
    }

    @Override // me.oriient.internal.infra.utils.core.GlobalCoordinatesConverter
    public final IndoorCoordinate convertGlobalCoordinateToBuilding(WorldCoordinate coordinate, WorldCoordinate buildingOrigin, double d) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        double latitude = coordinate.getLatitude();
        double longitude = coordinate.getLongitude();
        double altitude = coordinate.getAltitude();
        double dA = a(latitude);
        double dA2 = a(longitude);
        double dSin = Math.sin(dA);
        double d2 = 1;
        double d3 = this.d;
        double dSqrt = 6378137.0d / Math.sqrt(d2 - (((d3 * d3) * dSin) * dSin));
        double d4 = dSqrt + altitude;
        IndoorCoordinate indoorCoordinate = new IndoorCoordinate(Math.cos(dA) * d4 * Math.cos(dA2), Math.cos(dA) * d4 * Math.sin(dA2), Math.sin(dA) * (((this.c / this.b) * dSqrt) + altitude));
        double x = indoorCoordinate.getX();
        double y = indoorCoordinate.getY();
        double z = indoorCoordinate.getZ();
        double dSin2 = Math.sin(a(buildingOrigin.getLatitude()));
        double d5 = this.d;
        double dSqrt2 = 6378137.0d / Math.sqrt(d2 - (((d5 * d5) * dSin2) * dSin2));
        double dSin3 = Math.sin(a(buildingOrigin.getLatitude()));
        double dCos = Math.cos(a(buildingOrigin.getLatitude()));
        double dSin4 = Math.sin(a(buildingOrigin.getLongitude()));
        double dCos2 = Math.cos(a(buildingOrigin.getLongitude()));
        double altitude2 = x - (((buildingOrigin.getAltitude() + dSqrt2) * dCos) * dCos2);
        double altitude3 = y - (((buildingOrigin.getAltitude() + dSqrt2) * dCos) * dSin4);
        double altitude4 = buildingOrigin.getAltitude();
        double d6 = this.d;
        double d7 = z - ((((d2 - (d6 * d6)) * dSqrt2) + altitude4) * dSin3);
        IndoorCoordinate indoorCoordinate2 = new IndoorCoordinate((dCos2 * altitude3) + ((-dSin4) * altitude2), (dCos * d7) + ((((-dCos2) * dSin3) * altitude2) - ((dSin3 * dSin4) * altitude3)), (dSin3 * d7) + (dCos * dSin4 * altitude3) + (dCos2 * dCos * altitude2));
        double dA3 = a(d);
        return new IndoorCoordinate((indoorCoordinate2.getX() * Math.cos(dA3)) - (indoorCoordinate2.getY() * Math.sin(dA3)), (indoorCoordinate2.getY() * Math.cos(dA3)) + (indoorCoordinate2.getX() * Math.sin(dA3)), indoorCoordinate2.getZ());
    }

    @Override // me.oriient.internal.infra.utils.core.GlobalCoordinatesConverter
    public final double convertHeadingToAzimuth(double d, double d2, double d3) {
        double dAtan2 = ((Math.atan2(d, d2) * 180.0d) / 3.141592653589793d) + d3;
        double d4 = 360;
        double d5 = ((dAtan2 % d4) + d4) % d4;
        if (d5 != 0.0d || dAtan2 <= 0.0d) {
            return d5;
        }
        return 360.0d;
    }
}
