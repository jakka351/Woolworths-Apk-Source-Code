package au.com.woolworths.android.onesite.modules.search.searchscreen;

import au.com.woolworths.android.onesite.modules.search.analytics.SearchScreens;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import au.com.woolworths.shop.buyagain.analytics.BuyAgainEntryActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SearchActivity$initVoiceEntryPoints$3$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SearchViewModel searchViewModel = (SearchViewModel) this.receiver;
        searchViewModel.h.c(new BuyAgainEntryActions.EntryPointClick(SearchScreens.d));
        searchViewModel.u.f(SearchContract.Actions.OpenBuyAgain.f4417a);
        return Unit.f24250a;
    }
}
