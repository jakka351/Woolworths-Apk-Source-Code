package au.com.woolworths.feature.rewards.offers.points;

import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsPointsContractKt {
    public static final int a(RewardsPointsContract.ViewState viewState) {
        Intrinsics.h(viewState, "<this>");
        RewardsOfferFilterData rewardsOfferFilterData = viewState.i;
        if (rewardsOfferFilterData != null) {
            Set set = viewState.h;
            Integer numValueOf = null;
            if (set != null) {
                Iterator it = set.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    if (Intrinsics.c((RewardsOfferFilterData) next, rewardsOfferFilterData)) {
                        break;
                    }
                    i++;
                }
                numValueOf = Integer.valueOf(i);
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return -1;
    }
}
