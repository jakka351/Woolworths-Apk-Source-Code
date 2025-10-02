package au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.CalibrationLockProgressLottiePhase;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.lottie.LottiePhase;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/lottie/LottieState;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/lottie/LottiePhase;", "Phase", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class LottieState<Phase extends LottiePhase> {

    /* renamed from: a, reason: collision with root package name */
    public final float f7404a;
    public final MutableState b = SnapshotStateKt.f(CalibrationLockProgressLottiePhase.Intro.f7401a);

    public LottieState(float f) {
        this.f7404a = f;
    }
}
