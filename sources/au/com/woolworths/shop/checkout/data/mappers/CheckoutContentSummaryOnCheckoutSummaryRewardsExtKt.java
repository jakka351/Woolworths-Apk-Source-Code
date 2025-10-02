package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.CheckoutInfoDialog;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewards;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsSegment;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutContentSummaryOnCheckoutSummaryRewardsExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsSegment$RegisteredRedeemable] */
    public static final CheckoutSummaryRewards a(CheckoutContentSummary.OnCheckoutSummaryRewards onCheckoutSummaryRewards) {
        CheckoutSummaryRewardsSegment.Registered registeredRedeemable;
        Intrinsics.h(onCheckoutSummaryRewards, "<this>");
        ArrayList<CheckoutContentSummary.RewardsSection> arrayList = onCheckoutSummaryRewards.f22265a;
        ArrayList arrayList2 = new ArrayList();
        for (CheckoutContentSummary.RewardsSection rewardsSection : arrayList) {
            CheckoutContentSummary.OnCheckoutSummaryRewardsRegistered onCheckoutSummaryRewardsRegistered = rewardsSection.b;
            if (onCheckoutSummaryRewardsRegistered != null) {
                registeredRedeemable = new CheckoutSummaryRewardsSegment.Registered(onCheckoutSummaryRewardsRegistered.f22266a, onCheckoutSummaryRewardsRegistered.b, onCheckoutSummaryRewardsRegistered.c);
            } else {
                CheckoutContentSummary.OnCheckoutSummaryRewardsRegisteredRedeemable onCheckoutSummaryRewardsRegisteredRedeemable = rewardsSection.c;
                if (onCheckoutSummaryRewardsRegisteredRedeemable != null) {
                    String str = onCheckoutSummaryRewardsRegisteredRedeemable.f22267a;
                    String str2 = onCheckoutSummaryRewardsRegisteredRedeemable.b;
                    boolean z = onCheckoutSummaryRewardsRegisteredRedeemable.c;
                    CheckoutContentSummary.RedeemInfo redeemInfo = onCheckoutSummaryRewardsRegisteredRedeemable.d;
                    registeredRedeemable = new CheckoutSummaryRewardsSegment.RegisteredRedeemable(str, str2, z, redeemInfo != null ? new CheckoutInfoDialog(redeemInfo.f22279a, redeemInfo.b, redeemInfo.c, redeemInfo.d) : null);
                } else {
                    registeredRedeemable = null;
                }
            }
            if (registeredRedeemable != null) {
                arrayList2.add(registeredRedeemable);
            }
        }
        return new CheckoutSummaryRewards(arrayList2);
    }
}
