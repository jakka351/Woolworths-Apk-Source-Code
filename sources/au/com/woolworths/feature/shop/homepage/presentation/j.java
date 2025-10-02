package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.android.onesite.rxutils.Optional;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ HomePageViewModel e;

    public /* synthetic */ j(HomePageViewModel homePageViewModel, int i) {
        this.d = i;
        this.e = homePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                HomePageViewModel homePageViewModel = this.e;
                homePageViewModel.v6();
                homePageViewModel.y6();
                break;
            default:
                Optional optional = (Optional) obj;
                HomePageViewModel homePageViewModel2 = this.e;
                if (!Intrinsics.c(optional, homePageViewModel2.O)) {
                    Intrinsics.e(optional);
                    homePageViewModel2.O = optional;
                    homePageViewModel2.v6();
                }
                break;
        }
        return Unit.f24250a;
    }
}
