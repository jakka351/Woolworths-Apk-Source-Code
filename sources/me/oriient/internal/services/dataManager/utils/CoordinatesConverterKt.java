package me.oriient.internal.services.dataManager.utils;

import androidx.annotation.Keep;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.salesforce.marketingcloud.storage.db.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b \u001a'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010!\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010 \u001a/\u0010\"\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010 \u001a/\u0010#\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010 \u001a\u001f\u0010&\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010\r\u001a\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\r\"\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00101\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00102\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u0010/\"\u0014\u00103\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u0010/\"\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/\"\u0014\u00104\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010/¨\u00065"}, d2 = {"Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "indoorCoordinate", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "buildingOrigin", "", "buildingRotation", "convertBuildingCoordinateToGlobal", "(Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;D)Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "worldCoordinate", "convertGlobalCoordinateToBuilding", "(Lme/oriient/internal/services/dataManager/common/WorldCoordinate;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;D)Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", h.a.b, "getN", "(D)D", "x", "y", "z", "ECEFToLLA", "(DDD)Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", h.a.c, "altitude", "Lme/oriient/internal/services/dataManager/utils/d;", "llaToEcef", "(DDD)Lme/oriient/internal/services/dataManager/utils/d;", "e", "n", "u", "origin", "convertENUToGeodetic", "(DDDLme/oriient/internal/services/dataManager/common/WorldCoordinate;)Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "height", "convertECEFToENU", "(DDDLme/oriient/internal/services/dataManager/common/WorldCoordinate;)Lme/oriient/internal/services/dataManager/utils/d;", "convertENUToECEF", "convertLLAToENU", "convertENUToUVW", "coordinate", "buildingToEnuRotation", "buildingToENU", "(Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;D)Lme/oriient/internal/services/dataManager/utils/d;", "enuToBuilding", "(Lme/oriient/internal/services/dataManager/utils/d;D)Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "degrees", "toRadians", "radians", "toDegrees", "a", "D", "f", "b", "asqr", "bsqr", "eprime", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoordinatesConverterKt {

    /* renamed from: a, reason: collision with root package name */
    private static final double f25415a = 6378137.0d;
    private static final double asqr = 4.0680631590769E13d;
    private static final double b = 6356752.314245179d;
    private static final double bsqr = 4.0408299984661445E13d;
    private static final double e = Math.sqrt(0.006694379990141316d);
    private static final double eprime = Math.sqrt(0.006739496742276434d);
    private static final double f = 0.0033528106647474805d;

    private static final WorldCoordinate ECEFToLLA(double d, double d2, double d3) {
        double dSqrt = Math.sqrt((d2 * d2) + (d * d));
        double d4 = f25415a;
        double d5 = b;
        double dAtan = Math.atan((d3 * d4) / (dSqrt * d5));
        double dSin = Math.sin(dAtan);
        double dCos = Math.cos(dAtan);
        double d6 = eprime;
        double d7 = (d6 * d6 * d5 * dSin * dSin * dSin) + d3;
        double d8 = e;
        double dAtan2 = Math.atan(d7 / (dSqrt - (((((d8 * d8) * d4) * dCos) * dCos) * dCos)));
        double dAtan3 = Math.atan(d2 / d);
        double dCos2 = (dSqrt / Math.cos(dAtan2)) - getN(dAtan2);
        if (d < 0.0d && d2 < 0.0d) {
            dAtan3 -= 3.141592653589793d;
        }
        if (d < 0.0d && d2 > 0.0d) {
            dAtan3 += 3.141592653589793d;
        }
        return new WorldCoordinate(dAtan2, dAtan3, dCos2);
    }

    private static final d buildingToENU(IndoorCoordinate indoorCoordinate, double d) {
        double d2 = -toRadians(d);
        return new d((indoorCoordinate.getX() * Math.cos(d2)) - (indoorCoordinate.getY() * Math.sin(d2)), (indoorCoordinate.getY() * Math.cos(d2)) + (indoorCoordinate.getX() * Math.sin(d2)), 0.0d);
    }

    @Keep
    @NotNull
    public static final WorldCoordinate convertBuildingCoordinateToGlobal(@NotNull IndoorCoordinate indoorCoordinate, @NotNull WorldCoordinate buildingOrigin, double d) {
        Intrinsics.h(indoorCoordinate, "indoorCoordinate");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        d dVarBuildingToENU = buildingToENU(indoorCoordinate, d);
        return convertENUToGeodetic(dVarBuildingToENU.f25417a, dVarBuildingToENU.b, indoorCoordinate.getZ(), buildingOrigin);
    }

    private static final d convertECEFToENU(double d, double d2, double d3, WorldCoordinate worldCoordinate) {
        double n = getN(toRadians(worldCoordinate.getLatitude()));
        double dSin = Math.sin(toRadians(worldCoordinate.getLatitude()));
        double dCos = Math.cos(toRadians(worldCoordinate.getLatitude()));
        double dSin2 = Math.sin(toRadians(worldCoordinate.getLongitude()));
        double dCos2 = Math.cos(toRadians(worldCoordinate.getLongitude()));
        double altitude = d - (((worldCoordinate.getAltitude() + n) * dCos) * dCos2);
        double altitude2 = d2 - (((worldCoordinate.getAltitude() + n) * dCos) * dSin2);
        double altitude3 = worldCoordinate.getAltitude();
        double d4 = e;
        double d5 = d3 - ((((1 - (d4 * d4)) * n) + altitude3) * dSin);
        return new d((dCos2 * altitude2) + ((-dSin2) * altitude), (dCos * d5) + ((((-dCos2) * dSin) * altitude) - ((dSin * dSin2) * altitude2)), (dSin * d5) + (dCos * dSin2 * altitude2) + (dCos2 * dCos * altitude));
    }

    private static final d convertENUToECEF(double d, double d2, double d3, WorldCoordinate worldCoordinate) {
        d dVarLlaToEcef = llaToEcef(toRadians(worldCoordinate.getLatitude()), toRadians(worldCoordinate.getLongitude()), worldCoordinate.getAltitude());
        d dVarConvertENUToUVW = convertENUToUVW(d, d2, d3, worldCoordinate);
        return new d(dVarLlaToEcef.f25417a + dVarConvertENUToUVW.f25417a, dVarLlaToEcef.b + dVarConvertENUToUVW.b, dVarLlaToEcef.c + dVarConvertENUToUVW.c);
    }

    private static final WorldCoordinate convertENUToGeodetic(double d, double d2, double d3, WorldCoordinate worldCoordinate) {
        d dVarConvertENUToECEF = convertENUToECEF(d, d2, d3, worldCoordinate);
        WorldCoordinate worldCoordinateECEFToLLA = ECEFToLLA(dVarConvertENUToECEF.f25417a, dVarConvertENUToECEF.b, dVarConvertENUToECEF.c);
        return new WorldCoordinate(toDegrees(worldCoordinateECEFToLLA.getLatitude()), toDegrees(worldCoordinateECEFToLLA.getLongitude()), worldCoordinateECEFToLLA.getAltitude());
    }

    private static final d convertENUToUVW(double d, double d2, double d3, WorldCoordinate worldCoordinate) {
        double radians = toRadians(worldCoordinate.getLatitude());
        double radians2 = toRadians(worldCoordinate.getLongitude());
        double dCos = (Math.cos(radians) * d3) - (Math.sin(radians) * d2);
        return new d((Math.cos(radians2) * dCos) - (Math.sin(radians2) * d), (Math.cos(radians2) * d) + (Math.sin(radians2) * dCos), (Math.cos(radians) * d2) + (Math.sin(radians) * d3));
    }

    @Keep
    @NotNull
    public static final IndoorCoordinate convertGlobalCoordinateToBuilding(@NotNull WorldCoordinate worldCoordinate, @NotNull WorldCoordinate buildingOrigin, double d) {
        Intrinsics.h(worldCoordinate, "worldCoordinate");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        return enuToBuilding(convertLLAToENU(worldCoordinate.getLatitude(), worldCoordinate.getLongitude(), worldCoordinate.getAltitude(), buildingOrigin), d);
    }

    private static final d convertLLAToENU(double d, double d2, double d3, WorldCoordinate worldCoordinate) {
        d dVarLlaToEcef = llaToEcef(toRadians(d), toRadians(d2), d3);
        return convertECEFToENU(dVarLlaToEcef.f25417a, dVarLlaToEcef.b, dVarLlaToEcef.c, worldCoordinate);
    }

    private static final IndoorCoordinate enuToBuilding(d dVar, double d) {
        double radians = toRadians(d);
        return new IndoorCoordinate((Math.cos(radians) * dVar.f25417a) - (Math.sin(radians) * dVar.b), (Math.sin(radians) * dVar.f25417a) + (Math.cos(radians) * dVar.b), dVar.c);
    }

    private static final double getN(double d) {
        double dSin = Math.sin(d);
        double d2 = e;
        return f25415a / Math.sqrt(1 - (((d2 * d2) * dSin) * dSin));
    }

    private static final d llaToEcef(double d, double d2, double d3) {
        double n = getN(d);
        double d4 = bsqr / asqr;
        double d5 = n + d3;
        return new d(Math.cos(d2) * Math.cos(d) * d5, Math.cos(d) * d5 * Math.sin(d2), Math.sin(d) * ((d4 * n) + d3));
    }

    private static final double toDegrees(double d) {
        return (d * SubsamplingScaleImageView.ORIENTATION_180) / 3.141592653589793d;
    }

    private static final double toRadians(double d) {
        return (d / SubsamplingScaleImageView.ORIENTATION_180) * 3.141592653589793d;
    }
}
