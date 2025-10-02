package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.feature.shop.homepage.data.ChatEntryCardCta;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomePageFragment$ProcessHomeContentPageFeed$7$1 extends FunctionReferenceImpl implements Function1<ChatEntryCardCta, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ChatEntryCardCta p0 = (ChatEntryCardCta) obj;
        Intrinsics.h(p0, "p0");
        HomePageViewModel homePageViewModel = (HomePageViewModel) this.receiver;
        homePageViewModel.getClass();
        ActionData actionData = p0.e;
        String action = actionData.getAction();
        if (action != null) {
            homePageViewModel.w6(new HomePageContract.Actions.OpenOliveChat(action));
        }
        AnalyticsData analytics = actionData.getAnalytics();
        if (analytics != null) {
            homePageViewModel.f.g(AnalyticsDataKt.a(analytics));
        }
        return Unit.f24250a;
    }
}
