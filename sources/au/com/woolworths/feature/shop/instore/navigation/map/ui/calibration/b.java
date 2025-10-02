package au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration;

import com.airbnb.lottie.compose.LottieAnimatable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LottieAnimatable e;

    public /* synthetic */ b(LottieAnimatable lottieAnimatable, int i) {
        this.d = i;
        this.e = lottieAnimatable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fFloatValue;
        switch (this.d) {
            case 0:
                fFloatValue = ((Number) this.e.getD()).floatValue();
                break;
            case 1:
                fFloatValue = ((Number) this.e.getD()).floatValue();
                break;
            case 2:
                fFloatValue = ((Number) this.e.getD()).floatValue();
                break;
            case 3:
                fFloatValue = ((Number) this.e.getD()).floatValue();
                break;
            case 4:
                fFloatValue = this.e.q();
                break;
            default:
                fFloatValue = this.e.q();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
