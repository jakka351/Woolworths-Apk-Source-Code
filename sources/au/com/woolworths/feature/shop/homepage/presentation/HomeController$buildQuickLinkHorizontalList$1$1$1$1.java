package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.homepage.analytics.HomePageActions;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeController$buildQuickLinkHorizontalList$1$1$1$1 extends FunctionReferenceImpl implements Function1<QuickLinkCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QuickLinkCard p0 = (QuickLinkCard) obj;
        Intrinsics.h(p0, "p0");
        HomePageViewModel homePageViewModel = (HomePageViewModel) this.receiver;
        homePageViewModel.getClass();
        homePageViewModel.f.c(new HomePageActions.QuickLinkClick(p0.getTitle()));
        homePageViewModel.w6(new HomePageContract.Actions.LaunchDeepLink(p0.getAction().getAction()));
        return Unit.f24250a;
    }
}
