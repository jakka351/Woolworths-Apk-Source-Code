package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ HomeController e;
    public final /* synthetic */ HorizontalListDataInterface f;

    public /* synthetic */ b(HomeController homeController, HorizontalListDataInterface horizontalListDataInterface, int i) {
        this.d = i;
        this.e = homeController;
        this.f = horizontalListDataInterface;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.viewModel.G0(this.f);
                break;
            default:
                this.e.viewModel.G0(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
