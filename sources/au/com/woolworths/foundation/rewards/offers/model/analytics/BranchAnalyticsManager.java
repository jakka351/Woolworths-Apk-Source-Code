package au.com.woolworths.foundation.rewards.offers.model.analytics;

import android.content.Context;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.util.BranchEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/analytics/BranchAnalyticsManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BranchAnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8618a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/analytics/BranchAnalyticsManager$Companion;", "", "", "BRANCH_EVENT_NAME_BOOST", "Ljava/lang/String;", "BRANCH_EVENT_NAME_PURCHASE", "BRANCH_EVENT_ALIAS_BOOST", "BRANCH_EVENT_ALIAS_BOOST_ALL", "BRANCH_EVENT_ALIAS_PURCHASE", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Inject
    public BranchAnalyticsManager(@ApplicationContext @NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f8618a = context;
    }

    public final void a(String str, List list) {
        String partnerId;
        String uoid;
        BranchEvent branchEvent = new BranchEvent("Boost");
        HashMap map = branchEvent.c;
        if (map.containsKey("customer_event_alias")) {
            map.remove("customer_event_alias");
        } else {
            map.put("customer_event_alias", str);
        }
        List<RewardsOfferData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (RewardsOfferData rewardsOfferData : list2) {
            BranchUniversalObject branchUniversalObject = new BranchUniversalObject();
            String str2 = rewardsOfferData.g;
            branchUniversalObject.f = str2;
            branchUniversalObject.i.i = str2;
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData = rewardsOfferData.r;
            if (rewardsOfferAnalyticsData != null && (uoid = rewardsOfferAnalyticsData.getUoid()) != null) {
                branchUniversalObject.d = "offer/".concat(uoid);
                branchUniversalObject.i.h = uoid;
            }
            if (rewardsOfferAnalyticsData != null && (partnerId = rewardsOfferAnalyticsData.getPartnerId()) != null) {
                branchUniversalObject.i.j = partnerId;
            }
            arrayList.add(branchUniversalObject);
        }
        branchEvent.f.addAll(arrayList);
        branchEvent.d(this.f8618a);
    }
}
