package au.com.woolworths.shop.checkout;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/CheckoutFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CheckoutFeature implements Feature {
    public static final CheckoutFeature d;
    public static final CheckoutFeature e;
    public static final CheckoutFeature f;
    public static final CheckoutFeature g;
    public static final CheckoutFeature h;
    public static final CheckoutFeature i;
    public static final CheckoutFeature j;
    public static final CheckoutFeature k;
    public static final CheckoutFeature l;
    public static final CheckoutFeature m;
    public static final CheckoutFeature n;
    public static final CheckoutFeature o;
    public static final /* synthetic */ CheckoutFeature[] p;
    public static final /* synthetic */ EnumEntries q;

    static {
        CheckoutFeature checkoutFeature = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_CONTACT_DETAILS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_contact_details";
            }
        };
        d = checkoutFeature;
        CheckoutFeature checkoutFeature2 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_MARKETPLACE_MIXED_FULFILMENT
            @Override // au.com.woolworths.shop.checkout.CheckoutFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "MARKETPLACE_MIXED_FULFILMENT";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_marketplace_mixed_fulfilment";
            }

            @Override // au.com.woolworths.shop.checkout.CheckoutFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = checkoutFeature2;
        CheckoutFeature checkoutFeature3 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_PAYMENT_CALLS_MIGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_payment_calls_migration";
            }
        };
        f = checkoutFeature3;
        CheckoutFeature checkoutFeature4 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_PAYMENT_THREAT_METRIX
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_payment_threat_metrix";
            }
        };
        g = checkoutFeature4;
        CheckoutFeature checkoutFeature5 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_PROMO_CODE_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_promo_code_uplift";
            }
        };
        h = checkoutFeature5;
        CheckoutFeature checkoutFeature6 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_REWARDS_AND_DISCOUNTS_IMPRESSION_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_rewards_and_discounts_impression_uplift";
            }
        };
        i = checkoutFeature6;
        CheckoutFeature checkoutFeature7 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_REWARDS_UPLIFT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_rewards_uplift";
            }

            @Override // au.com.woolworths.shop.checkout.CheckoutFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        j = checkoutFeature7;
        CheckoutFeature checkoutFeature8 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_SPEND_SAVE_BREAKDOWN
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_spend_save_breakdown";
            }
        };
        CheckoutFeature checkoutFeature9 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_STORE_CREDIT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_store_credit";
            }

            @Override // au.com.woolworths.shop.checkout.CheckoutFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        k = checkoutFeature9;
        CheckoutFeature checkoutFeature10 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_TIME_SELECTION_SUGGESTED_SLOTS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_checkout_time_selection_suggested_slots";
            }
        };
        l = checkoutFeature10;
        CheckoutFeature checkoutFeature11 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.CHECKOUT_WPAY_INTEGRATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_wpay_integration";
            }
        };
        m = checkoutFeature11;
        CheckoutFeature checkoutFeature12 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.ID_VERIFICATION
            @Override // au.com.woolworths.shop.checkout.CheckoutFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String a() {
                return "ID_VERIFICATION";
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_id_verification";
            }
        };
        n = checkoutFeature12;
        CheckoutFeature checkoutFeature13 = new CheckoutFeature() { // from class: au.com.woolworths.shop.checkout.CheckoutFeature.ORDER_CONFIRMATION_CMO_BANNER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_order_confirmation_cmo_banner";
            }
        };
        o = checkoutFeature13;
        CheckoutFeature[] checkoutFeatureArr = {checkoutFeature, checkoutFeature2, checkoutFeature3, checkoutFeature4, checkoutFeature5, checkoutFeature6, checkoutFeature7, checkoutFeature8, checkoutFeature9, checkoutFeature10, checkoutFeature11, checkoutFeature12, checkoutFeature13};
        p = checkoutFeatureArr;
        q = EnumEntriesKt.a(checkoutFeatureArr);
    }

    public static CheckoutFeature valueOf(String str) {
        return (CheckoutFeature) Enum.valueOf(CheckoutFeature.class, str);
    }

    public static CheckoutFeature[] values() {
        return (CheckoutFeature[]) p.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
