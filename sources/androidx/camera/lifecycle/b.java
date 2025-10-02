package androidx.camera.lifecycle;

import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.media3.ui.PlayerView;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy;
import au.com.woolworths.feature.shop.onboarding.OnboardingActivity;
import au.com.woolworths.product.details.LegacyProductDetailsActivity;
import com.google.common.util.concurrent.ListenableFuture;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements AsyncFunction, Consumer, PlayerView.ControllerVisibilityListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ b(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // androidx.media3.ui.PlayerView.ControllerVisibilityListener
    public void a(int i) {
        this.e.invoke(Integer.valueOf(i));
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.d;
        Function1 function1 = this.e;
        switch (i) {
            case 1:
                int i2 = BarcodeScannerActivity.G;
                function1.invoke(obj);
                break;
            case 2:
                int i3 = BarcodeScannerLegacyActivity.E;
                function1.invoke(obj);
                break;
            case 3:
                RewardsBoostersFragmentLegacy.Companion companion = RewardsBoostersFragmentLegacy.n;
                function1.invoke(obj);
                break;
            case 4:
                int i4 = OnboardingActivity.I;
                function1.invoke(obj);
                break;
            case 5:
                function1.invoke(obj);
                break;
            case 6:
                int i5 = LegacyProductDetailsActivity.G;
                function1.invoke(obj);
                break;
            case 7:
            default:
                function1.invoke(obj);
                break;
            case 8:
                function1.invoke(obj);
                break;
            case 9:
                function1.invoke(obj);
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.h;
        Function1 tmp0 = this.e;
        Intrinsics.h(tmp0, "$tmp0");
        return (ListenableFuture) tmp0.invoke(obj);
    }
}
