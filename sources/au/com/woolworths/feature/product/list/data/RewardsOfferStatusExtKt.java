package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferStatus;", "Lau/com/woolworths/shop/graphql/type/RewardsOfferStatus;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferStatusExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardsOfferStatus.values().length];
            try {
                RewardsOfferStatus.Companion companion = RewardsOfferStatus.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsOfferStatus.Companion companion2 = RewardsOfferStatus.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsOfferStatus.Companion companion3 = RewardsOfferStatus.e;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RewardsOfferStatus.Companion companion4 = RewardsOfferStatus.e;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RewardsOfferStatus.Companion companion5 = RewardsOfferStatus.e;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                RewardsOfferStatus.Companion companion6 = RewardsOfferStatus.e;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus toUiModel(@NotNull RewardsOfferStatus rewardsOfferStatus) {
        Intrinsics.h(rewardsOfferStatus, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[rewardsOfferStatus.ordinal()]) {
            case 1:
                return au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.NOT_ACTIVATED;
            case 2:
                return au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.ACTIVATED;
            case 3:
                return au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.PENDING;
            case 4:
                return au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.ENDED;
            case 5:
                return au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.COMPLETED;
            case 6:
                return au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.MISSED;
            default:
                return au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.d;
        }
    }
}
