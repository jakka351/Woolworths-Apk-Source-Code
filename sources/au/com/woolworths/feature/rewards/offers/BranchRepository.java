package au.com.woolworths.feature.rewards.offers;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.util.BranchEvent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/BranchRepository;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BranchRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6224a;

    @Inject
    public BranchRepository(@ApplicationContext @NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f6224a = context;
    }

    public final void a(String str, List list) {
        String partnerId;
        String uoid;
        BranchEvent branchEvent = new BranchEvent("Boost");
        branchEvent.c(str, lqlqqlq.mmm006Dm006Dm);
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
        branchEvent.d(this.f6224a);
    }
}
