package au.com.woolworths.shop.product.details.navigation;

import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ NavHostController e;

    public /* synthetic */ e(NavHostController navHostController, int i) {
        this.d = i;
        this.e = navHostController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                NavController.e(this.e, NutritionalInfo.INSTANCE);
                break;
            case 1:
                NavController.e(this.e, ParagraphText.INSTANCE);
                break;
            case 2:
                NavController.e(this.e, FullScreenImageGallery.INSTANCE);
                break;
            case 3:
                NavController.e(this.e, AboutEverydayMarket.INSTANCE);
                break;
            case 4:
                this.e.f();
                break;
            case 5:
                this.e.f();
                break;
            case 6:
                this.e.f();
                break;
            default:
                this.e.f();
                break;
        }
        return Unit.f24250a;
    }
}
