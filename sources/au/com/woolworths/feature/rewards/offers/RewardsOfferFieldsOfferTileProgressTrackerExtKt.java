package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.foundation.rewards.offers.model.CircularProgressIndicator;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressRing;
import au.com.woolworths.foundation.rewards.offers.model.OfferProgressTracker;
import com.woolworths.rewards.offers.fragment.RewardsOfferFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferFieldsOfferTileProgressTrackerExtKt {
    public static final OfferProgressTracker a(RewardsOfferFields.OfferTileProgressTracker offerTileProgressTracker) {
        Intrinsics.h(offerTileProgressTracker, "<this>");
        String str = offerTileProgressTracker.f20952a;
        String str2 = offerTileProgressTracker.b;
        String str3 = offerTileProgressTracker.c;
        RewardsOfferFields.CircularProgressIndicator circularProgressIndicator = offerTileProgressTracker.d;
        Intrinsics.h(circularProgressIndicator, "<this>");
        RewardsOfferFields.PrimaryRing primaryRing = circularProgressIndicator.f20944a;
        Intrinsics.h(primaryRing, "<this>");
        return new OfferProgressTracker(str, str2, str3, new CircularProgressIndicator(new CircularProgressRing(primaryRing.f20953a, primaryRing.b)));
    }
}
