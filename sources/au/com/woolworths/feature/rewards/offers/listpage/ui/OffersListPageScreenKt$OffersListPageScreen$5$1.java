package au.com.woolworths.feature.rewards.offers.listpage.ui;

import au.com.woolworths.feature.rewards.offers.OfferActivationScreen;
import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OffersListPageScreenKt$OffersListPageScreen$5$1 extends FunctionReferenceImpl implements Function1<RewardsOfferData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        RewardsOfferData p0 = (RewardsOfferData) obj;
        Intrinsics.h(p0, "p0");
        OfferListPageViewModel offerListPageViewModel = (OfferListPageViewModel) this.receiver;
        offerListPageViewModel.getClass();
        String str = p0.d;
        MutableStateFlow mutableStateFlow = offerListPageViewModel.w;
        List list = ((OffersListPageContract.ViewState) mutableStateFlow.getValue()).c;
        if (list != null) {
            List<Object> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (Object objG : list2) {
                if (objG instanceof OfferSectionViewItem) {
                    objG = SectionViewItemExtKt.g((OfferSectionViewItem) objG, new androidx.navigation.fragment.d(str, 26));
                }
                arrayList.add(objG);
            }
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, OffersListPageContract.ViewState.a((OffersListPageContract.ViewState) value, arrayList, null, null, null, null, false, null, null, null, false, 4091)));
        }
        offerListPageViewModel.p.a(p0, OfferActivationScreen.Offers.f6228a);
        offerListPageViewModel.r.l(p0, offerListPageViewModel.u, RewardsPointsActionData.o, null);
        return Unit.f24250a;
    }
}
