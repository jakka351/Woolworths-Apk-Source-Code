package au.com.woolworths.foundation.shop.olive.voice.ui.lottie;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.composeui.ProductUnavailablePriceLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ a(Modifier modifier, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                OliveIntroLottieKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ProductUnavailablePriceLabelKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }
}
