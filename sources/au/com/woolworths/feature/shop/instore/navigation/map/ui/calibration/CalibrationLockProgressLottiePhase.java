package au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie.LottiePhase;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/calibration/CalibrationLockProgressLottiePhase;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/lottie/LottiePhase;", "Intro", "FigureEight", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/calibration/CalibrationLockProgressLottiePhase$FigureEight;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/calibration/CalibrationLockProgressLottiePhase$Intro;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CalibrationLockProgressLottiePhase extends LottiePhase {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/calibration/CalibrationLockProgressLottiePhase$FigureEight;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/calibration/CalibrationLockProgressLottiePhase;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FigureEight implements CalibrationLockProgressLottiePhase {

        /* renamed from: a, reason: collision with root package name */
        public static final FigureEight f7400a = new FigureEight();

        @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie.LottiePhase
        public final int a() {
            return 150;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FigureEight);
        }

        @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie.LottiePhase
        public final int getStart() {
            return 60;
        }

        public final int hashCode() {
            return -1971089330;
        }

        @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie.LottiePhase
        public final boolean isLooping() {
            return true;
        }

        public final String toString() {
            return "FigureEight";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/calibration/CalibrationLockProgressLottiePhase$Intro;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/calibration/CalibrationLockProgressLottiePhase;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Intro implements CalibrationLockProgressLottiePhase {

        /* renamed from: a, reason: collision with root package name */
        public static final Intro f7401a = new Intro();

        @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie.LottiePhase
        public final int a() {
            return 60;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Intro);
        }

        @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie.LottiePhase
        public final int getStart() {
            return 0;
        }

        public final int hashCode() {
            return 786686191;
        }

        @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie.LottiePhase
        public final boolean isLooping() {
            return false;
        }

        public final String toString() {
            return "Intro";
        }
    }
}
