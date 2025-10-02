package au.com.woolworths.shop.checkout.ui.summary;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorActionType;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CheckoutSummaryFragment$updateBottomSheet$1$1$1$3$1 extends FunctionReferenceImpl implements Function3<Integer, String, RewardsQuantitySelectorActionType, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m(((Number) obj).intValue(), (String) obj2, (RewardsQuantitySelectorActionType) obj3);
        return Unit.f24250a;
    }

    public final void m(int i, String p1, RewardsQuantitySelectorActionType p2) {
        Event event;
        Intrinsics.h(p1, "p1");
        Intrinsics.h(p2, "p2");
        CheckoutSummaryViewModel checkoutSummaryViewModel = (CheckoutSummaryViewModel) this.receiver;
        checkoutSummaryViewModel.getClass();
        Screens screens = Screens.d;
        RewardsAmountSelectorAnalytics.RewardsAmountSelector rewardsAmountSelector = new RewardsAmountSelectorAnalytics.RewardsAmountSelector();
        CloseableCoroutineScope closeableCoroutineScopeA = ViewModelKt.a(checkoutSummaryViewModel);
        final RewardsAmountSelectorAnalytics.RewardsAmountSelector.Action action = rewardsAmountSelector.g;
        BuildersKt.c(closeableCoroutineScopeA, null, null, new CheckoutSummaryViewModel$onUpdateAmountClick$1(checkoutSummaryViewModel, p2, i, p1, action, null), 3);
        final String amount = YU.a.d(i / 100, "$");
        int iOrdinal = p2.ordinal();
        if (iOrdinal == 0) {
            action.getClass();
            Intrinsics.h(amount, "amount");
            event = new Event(action, amount) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$rewardsDollarsConfirmationButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action.f4033a.f);
                    spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "Rewards Dollars - amount used confirmed", spreadBuilder, "event.Value", amount);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "rewards_dollars_confirmation_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "rewards_dollars_confirmation_button_click".equals(event2.getD()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        } else if (iOrdinal == 1) {
            action.getClass();
            Intrinsics.h(amount, "amount");
            event = new Event(action, amount) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$updateEdrDollarsButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action.f4033a.f);
                    spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "Update EDR dollars", spreadBuilder, "event.Value", amount);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "update_edr_dollars_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "update_edr_dollars_button_click".equals(event2.getD()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            action.getClass();
            Intrinsics.h(amount, "amount");
            event = new Event(action, amount) { // from class: au.com.woolworths.analytics.supers.checkout.RewardsAmountSelectorAnalytics$RewardsAmountSelector$Action$removeEdrDollarsButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action.f4033a.f);
                    spreadBuilder.a(new Pair("event.Category", "Checkout rewards tiles"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "Remove EDR dollars", spreadBuilder, "event.Value", amount);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "remove_edr_dollars_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "remove_edr_dollars_button_click".equals(event2.getD()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        }
        checkoutSummaryViewModel.p.g(event);
    }
}
