package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SdkError", "InvalidArgument", "NoBarometerInMultiFloorBuilding", "MissingSensors", "MockError", "PositioningUnavailable", "MultiFloorPositioningUnavailable", "NotInStore", "GenericError", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$GenericError;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$InvalidArgument;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$MissingSensors;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$MockError;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$MultiFloorPositioningUnavailable;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$NoBarometerInMultiFloorBuilding;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$NotInStore;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$PositioningUnavailable;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$SdkError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OriientError extends Exception {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$GenericError;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GenericError extends OriientError {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$InvalidArgument;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InvalidArgument extends OriientError {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$MissingSensors;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MissingSensors extends OriientError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingSensors() {
            super("Device unsupported - missing sensors");
            OriientErrorRecoveryStrategy[] oriientErrorRecoveryStrategyArr = OriientErrorRecoveryStrategy.d;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$MockError;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MockError extends OriientError {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$MultiFloorPositioningUnavailable;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultiFloorPositioningUnavailable extends OriientError {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$NoBarometerInMultiFloorBuilding;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoBarometerInMultiFloorBuilding extends OriientError {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$NotInStore;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotInStore extends OriientError {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$PositioningUnavailable;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PositioningUnavailable extends OriientError {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError$SdkError;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientError;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SdkError extends OriientError {
    }
}
