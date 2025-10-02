package au.com.woolworths.feature.shop.instore.navigation.map.data.proximity;

import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import kotlin.Metadata;
import me.oriient.ipssdk.api.models.IPSCoordinate;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalProximityLocationDefinitionKt {
    public static final IPSCoordinate a(final WowCoordinate wowCoordinate, BuildingInteractor buildingInteractor) {
        final OriientMetersCoordinate oriientMetersCoordinateE = buildingInteractor.e(wowCoordinate, null);
        return oriientMetersCoordinateE != null ? new IPSCoordinate() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityLocationDefinitionKt$toIPSCoordinate$1$1
            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            public final double getX() {
                return oriientMetersCoordinateE.f7344a;
            }

            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            public final double getY() {
                return oriientMetersCoordinateE.b;
            }

            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            public final double getZ() {
                return 0.0d;
            }
        } : new IPSCoordinate() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityLocationDefinitionKt$toIPSCoordinate$2
            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            public final double getX() {
                return wowCoordinate.f7347a / 100.0d;
            }

            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            public final double getY() {
                return wowCoordinate.b / 100.0d;
            }

            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            public final double getZ() {
                return 0.0d;
            }
        };
    }
}
