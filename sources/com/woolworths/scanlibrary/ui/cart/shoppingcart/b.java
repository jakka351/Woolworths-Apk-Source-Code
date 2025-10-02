package com.woolworths.scanlibrary.ui.cart.shoppingcart;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.DiffUtil;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.RewardsRedemptionCancelled;
import com.woolworths.scanlibrary.analytics.RewardsRedemptionConfirmed;
import com.woolworths.scanlibrary.analytics.RewardsRedemptionPopUpDisplayed;
import com.woolworths.scanlibrary.databinding.FragmentShoppingCartBinding;
import com.woolworths.scanlibrary.models.cart.PendingPromotion;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ ShoppingCartFragment d;

    public /* synthetic */ b(ShoppingCartFragment shoppingCartFragment) {
        this.d = shoppingCartFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Event event = (Event) obj;
        CartContract.CartViewEvent cartViewEvent = event != null ? (CartContract.CartViewEvent) event.a() : null;
        boolean z = cartViewEvent instanceof CartContract.CartViewEvent.SetLoadingIndicatorEvent;
        final ShoppingCartFragment shoppingCartFragment = this.d;
        final int i = 0;
        if (z) {
            shoppingCartFragment.N3(false);
        } else {
            final int i2 = 1;
            if (cartViewEvent instanceof CartContract.CartViewEvent.SuccessGetCartItemsEvent) {
                shoppingCartFragment.N3(false);
                ArrayList arrayListB0 = ((CartContract.Presenter) shoppingCartFragment.Q1()).B0();
                List oldItems = shoppingCartFragment.r;
                Intrinsics.h(oldItems, "oldItems");
                ItemDiffCallback itemDiffCallback = new ItemDiffCallback();
                itemDiffCallback.f21217a = arrayListB0;
                itemDiffCallback.b = oldItems;
                DiffUtil.DiffResult diffResultA = DiffUtil.a(itemDiffCallback, true);
                ArrayList arrayListB02 = ((CartContract.Presenter) shoppingCartFragment.Q1()).B0();
                shoppingCartFragment.r = arrayListB02;
                ShoppingCartFragment$getShoppingCartView$1 shoppingCartFragment$getShoppingCartView$1 = shoppingCartFragment.q;
                if (shoppingCartFragment$getShoppingCartView$1 == null) {
                    Intrinsics.p("mCartAdapter");
                    throw null;
                }
                shoppingCartFragment$getShoppingCartView$1.g = arrayListB02;
                diffResultA.b(new AdapterListUpdateCallback(shoppingCartFragment$getShoppingCartView$1));
                if (shoppingCartFragment.o == null) {
                    Intrinsics.p("rootView");
                    throw null;
                }
                boolean zI0 = ((CartContract.Presenter) shoppingCartFragment.Q1()).I0();
                FragmentActivity activity = shoppingCartFragment.getActivity();
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                }
                if (zI0) {
                    FragmentShoppingCartBinding fragmentShoppingCartBinding = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding);
                    fragmentShoppingCartBinding.D.setVisibility(8);
                    FragmentShoppingCartBinding fragmentShoppingCartBinding2 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding2);
                    fragmentShoppingCartBinding2.C.setVisibility(8);
                    FragmentShoppingCartBinding fragmentShoppingCartBinding3 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding3);
                    fragmentShoppingCartBinding3.A.setVisibility(0);
                    FragmentShoppingCartBinding fragmentShoppingCartBinding4 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding4);
                    fragmentShoppingCartBinding4.A.setText(shoppingCartFragment.getString(R.string.sng_label_scan_an_item));
                    FragmentShoppingCartBinding fragmentShoppingCartBinding5 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding5);
                    fragmentShoppingCartBinding5.A.setTag("scan");
                    FragmentShoppingCartBinding fragmentShoppingCartBinding6 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding6);
                    fragmentShoppingCartBinding6.z.setVisibility(0);
                } else {
                    FragmentShoppingCartBinding fragmentShoppingCartBinding7 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding7);
                    fragmentShoppingCartBinding7.C.setVisibility(0);
                    FragmentShoppingCartBinding fragmentShoppingCartBinding8 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding8);
                    fragmentShoppingCartBinding8.A.setTag("checkout");
                    FragmentShoppingCartBinding fragmentShoppingCartBinding9 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding9);
                    fragmentShoppingCartBinding9.A.setText(shoppingCartFragment.getString(R.string.sng_label_checkout));
                    FragmentShoppingCartBinding fragmentShoppingCartBinding10 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding10);
                    fragmentShoppingCartBinding10.D.setVisibility(0);
                    FragmentShoppingCartBinding fragmentShoppingCartBinding11 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding11);
                    fragmentShoppingCartBinding11.A.setVisibility(0);
                    FragmentShoppingCartBinding fragmentShoppingCartBinding12 = shoppingCartFragment.s;
                    Intrinsics.e(fragmentShoppingCartBinding12);
                    fragmentShoppingCartBinding12.z.setVisibility(8);
                }
                FragmentShoppingCartBinding fragmentShoppingCartBinding13 = shoppingCartFragment.s;
                Intrinsics.e(fragmentShoppingCartBinding13);
                fragmentShoppingCartBinding13.y.setVisibility(0);
            } else if (cartViewEvent instanceof CartContract.CartViewEvent.ShowTapOnViewEvent) {
                shoppingCartFragment.N3(false);
                FragmentActivity activity2 = shoppingCartFragment.getActivity();
                if (activity2 != null) {
                    int i3 = TapActivity.W;
                    TapActivity.Companion.a(activity2, null, null, 14);
                }
            } else if (cartViewEvent instanceof CartContract.CartViewEvent.ShowPaymentTenderViewEvent) {
                shoppingCartFragment.N3(false);
                int i4 = CheckOutActivity.L;
                Intent intent = new Intent(shoppingCartFragment.requireContext(), (Class<?>) CheckOutActivity.class);
                intent.addFlags(0);
                shoppingCartFragment.startActivityForResult(intent, 4005);
                FragmentActivity activity3 = shoppingCartFragment.getActivity();
                if (activity3 != null) {
                    activity3.overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
                }
            } else if (cartViewEvent instanceof CartContract.CartViewEvent.ShowPendingPromotionViewEvent) {
                shoppingCartFragment.N3(false);
                final PendingPromotion pendingPromotion = ((CartContract.CartViewEvent.ShowPendingPromotionViewEvent) cartViewEvent).f21215a;
                shoppingCartFragment.I1().b(new RewardsRedemptionPopUpDisplayed("Rewards Redemption Pop Up Displayed"));
                FragmentActivity activity4 = shoppingCartFragment.getActivity();
                if (activity4 != null) {
                    String voucherMessage = pendingPromotion.getVoucherMessage();
                    String string = shoppingCartFragment.getString(R.string.sng_label_yes);
                    Intrinsics.g(string, "getString(...)");
                    String string2 = shoppingCartFragment.getString(R.string.sng_label_not_now);
                    Intrinsics.g(string2, "getString(...)");
                    AppCompatActivityExtKt.e(activity4, voucherMessage, string, new Function0() { // from class: com.woolworths.scanlibrary.ui.cart.shoppingcart.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    ShoppingCartFragment shoppingCartFragment2 = shoppingCartFragment;
                                    ((CartContract.Presenter) shoppingCartFragment2.Q1()).d0(PendingPromotion.copy$default(pendingPromotion, null, null, null, true, 7, null));
                                    shoppingCartFragment2.I1().b(new RewardsRedemptionConfirmed("Rewards Redemption - Confirmed"));
                                    break;
                                default:
                                    ShoppingCartFragment shoppingCartFragment3 = shoppingCartFragment;
                                    ((CartContract.Presenter) shoppingCartFragment3.Q1()).d0(PendingPromotion.copy$default(pendingPromotion, null, null, null, false, 7, null));
                                    shoppingCartFragment3.I1().b(new RewardsRedemptionCancelled("Rewards Redemption - Cancelled"));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    }, string2, new Function0() { // from class: com.woolworths.scanlibrary.ui.cart.shoppingcart.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    ShoppingCartFragment shoppingCartFragment2 = shoppingCartFragment;
                                    ((CartContract.Presenter) shoppingCartFragment2.Q1()).d0(PendingPromotion.copy$default(pendingPromotion, null, null, null, true, 7, null));
                                    shoppingCartFragment2.I1().b(new RewardsRedemptionConfirmed("Rewards Redemption - Confirmed"));
                                    break;
                                default:
                                    ShoppingCartFragment shoppingCartFragment3 = shoppingCartFragment;
                                    ((CartContract.Presenter) shoppingCartFragment3.Q1()).d0(PendingPromotion.copy$default(pendingPromotion, null, null, null, false, 7, null));
                                    shoppingCartFragment3.I1().b(new RewardsRedemptionCancelled("Rewards Redemption - Cancelled"));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    }, false);
                }
            } else {
                if (cartViewEvent instanceof CartContract.CartViewEvent.ShowPaymentTenderForTranferToPosViewEvent) {
                    throw new NotImplementedError("ShowPaymentTenderForTranferToPosViewEvent currently unused");
                }
                if (cartViewEvent != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return Unit.f24250a;
    }
}
