package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.feature.rewards.offers.OfferActivationScreen;
import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
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
final /* synthetic */ class PointsScreenKt$PointsScreen$12$1 extends FunctionReferenceImpl implements Function1<RewardsOfferData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RewardsOfferData p0 = (RewardsOfferData) obj;
        Intrinsics.h(p0, "p0");
        RewardsPointsViewModel rewardsPointsViewModel = (RewardsPointsViewModel) this.receiver;
        rewardsPointsViewModel.getClass();
        String str = p0.d;
        MutableStateFlow mutableStateFlow = rewardsPointsViewModel.w;
        List list = ((RewardsPointsContract.ViewState) mutableStateFlow.getValue()).e;
        if (list != null) {
            List<Object> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (Object objG : list2) {
                if (objG instanceof OfferSectionViewItem) {
                    objG = SectionViewItemExtKt.g((OfferSectionViewItem) objG, new au.com.woolworths.feature.rewards.offers.points.a(str, 1));
                }
                arrayList.add(objG);
            }
            mutableStateFlow.setValue(RewardsPointsContract.ViewState.a((RewardsPointsContract.ViewState) mutableStateFlow.getValue(), false, arrayList, null, false, null, null, 4079));
        }
        rewardsPointsViewModel.o.a(p0, OfferActivationScreen.Offers.f6228a);
        rewardsPointsViewModel.u.l(p0, RewardsOfferScreen.e, RewardsPointsActionData.o, null);
        return Unit.f24250a;
    }
}
