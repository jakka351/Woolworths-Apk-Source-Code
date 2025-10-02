package au.com.woolworths.feature.rewards.offers.points;

import au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                RewardsPointsContract.ViewState viewState = (RewardsPointsContract.ViewState) this.e;
                List offers = (List) obj;
                Intrinsics.h(offers, "offers");
                RewardsOfferFilterData rewardsOfferFilterData = viewState.i;
                if (rewardsOfferFilterData == null) {
                    return offers;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : offers) {
                    if (rewardsOfferFilterData.c.contains(((OfferViewItem) obj2).b.d)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 1:
                String str = (String) this.e;
                List offers2 = (List) obj;
                Intrinsics.h(offers2, "offers");
                return SectionViewItemExtKt.f(str, true, offers2);
            default:
                RewardsOfferData rewardsOfferData = (RewardsOfferData) this.e;
                List offers3 = (List) obj;
                Intrinsics.h(offers3, "offers");
                return SectionViewItemExtKt.f(rewardsOfferData.d, false, offers3);
        }
    }
}
