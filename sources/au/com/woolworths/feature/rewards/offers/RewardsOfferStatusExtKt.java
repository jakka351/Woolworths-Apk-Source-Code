package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.rewards.graphql.type.RewardsOfferStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferStatusExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RewardsOfferStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsOfferStatus.Companion companion = RewardsOfferStatus.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsOfferStatus.Companion companion2 = RewardsOfferStatus.e;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RewardsOfferStatus.Companion companion3 = RewardsOfferStatus.e;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RewardsOfferStatus.Companion companion4 = RewardsOfferStatus.e;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                RewardsOfferStatus.Companion companion5 = RewardsOfferStatus.e;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus a(RewardsOfferStatus rewardsOfferStatus) {
        Intrinsics.h(rewardsOfferStatus, "<this>");
        int iOrdinal = rewardsOfferStatus.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.d : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.PENDING : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.ENDED : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.COMPLETED : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.MISSED : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.ACTIVATED : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.NOT_ACTIVATED;
    }
}
