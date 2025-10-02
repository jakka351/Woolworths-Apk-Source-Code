package au.com.woolworths.feature.shop.homepage.presentation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel", f = "HomePageViewModel.kt", l = {342}, m = "initInstoreNavigation")
/* loaded from: classes3.dex */
final class HomePageViewModel$initInstoreNavigation$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ HomePageViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$initInstoreNavigation$1(HomePageViewModel homePageViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = homePageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return HomePageViewModel.p6(this.q, this);
    }
}
