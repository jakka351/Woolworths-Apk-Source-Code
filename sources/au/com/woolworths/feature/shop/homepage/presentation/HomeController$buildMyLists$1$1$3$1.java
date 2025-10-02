package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.shop.homepage.analytics.HomePageActions;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeController$buildMyLists$1$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomePageViewModel homePageViewModel = (HomePageViewModel) this.receiver;
        homePageViewModel.f.j(HomePageActions.MyListsItemClick.e, TrackingMetadata.Companion.a(TrackableValue.o0, "Buy Again"));
        homePageViewModel.w6(HomePageContract.Actions.LaunchBuyAgain.f7214a);
        return Unit.f24250a;
    }
}
