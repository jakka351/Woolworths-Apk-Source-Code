package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.content.res.Resources;
import au.com.woolworths.android.onesite.models.checkout.NewCreditCardData;
import au.com.woolworths.android.onesite.models.checkout.NewGiftCardData;
import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class PaymentFailureHelper {

    /* renamed from: a, reason: collision with root package name */
    public final List f4287a;
    public final List b;
    public final List c;
    public final NewGiftCardData d;
    public final List e;
    public final List f;
    public final NewCreditCardData g;
    public final DigitalPayErrorLabelProvider h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();
    public final ShopAppTokenAuthenticator k;
    public final PayClient l;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public PayClient f4288a;
    }

    public interface DigitalPayErrorLabelProvider {
        String a(int i);
    }

    public static class GlobalErrorLabelProvider implements DigitalPayErrorLabelProvider {
        public static GlobalErrorLabelProvider b;

        /* renamed from: a, reason: collision with root package name */
        public Resources f4289a;

        @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.PaymentFailureHelper.DigitalPayErrorLabelProvider
        public final String a(int i) {
            Resources resources = this.f4289a;
            switch (i) {
                case 1:
                    return resources.getString(R.string.payment_unknown_failure);
                case 2:
                    return resources.getString(R.string.single_payment_new_creditcard_opt_save_failure);
                case 3:
                    return resources.getString(R.string.single_payment_new_creditcard_failure);
                case 4:
                    return resources.getString(R.string.single_payment_saved_creditcard_failure);
                case 5:
                    return resources.getString(R.string.single_payment_new_giftcard_opt_save_failure);
                case 6:
                    return resources.getString(R.string.single_payment_new_giftcard_specific_failure);
                case 7:
                    return resources.getString(R.string.single_payment_new_giftcard_opt_save_generic_failure);
                case 8:
                    return resources.getString(R.string.single_payment_new_giftcard_generic_failure);
                case 9:
                    return resources.getString(R.string.single_payment_saved_giftcard_specific_failure);
                case 10:
                    return resources.getString(R.string.single_payment_saved_giftcard_generic_failure);
                case 11:
                    return resources.getString(R.string.paypal_unregistered_externally_single_payment);
                case 12:
                    return resources.getString(R.string.single_payment_paypal_failure);
                case 13:
                    return resources.getString(R.string.single_payment_paypal_generic_failure);
                case 14:
                    return resources.getString(R.string.payment_bad_gateway);
                case 15:
                    return resources.getString(R.string.tokenisation_failed);
                case 16:
                    return resources.getString(R.string.split_payment_failed_gc);
                case 17:
                    return resources.getString(R.string.split_payment_failed_new_cc);
                case 18:
                    return resources.getString(R.string.split_payment_failed_saved_cc);
                case 19:
                    return resources.getString(R.string.split_payment_failed_pp);
                case 20:
                    return resources.getString(R.string.split_payment_failed_pp_supplementary_info);
                case 21:
                    return resources.getString(R.string.split_payment_failed_heading);
                case 22:
                    return resources.getString(R.string.payment_times_out);
                case 23:
                    return resources.getString(R.string.payment_instrument_not_found);
                default:
                    return resources.getString(R.string.payment_unknown_failure);
            }
        }
    }

    public PaymentFailureHelper(PayClient payClient, ShopAppTokenAuthenticator shopAppTokenAuthenticator, GlobalErrorLabelProvider globalErrorLabelProvider, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, NewGiftCardData newGiftCardData, ArrayList arrayList4, ArrayList arrayList5, NewCreditCardData newCreditCardData) {
        this.l = payClient;
        this.k = shopAppTokenAuthenticator;
        this.h = globalErrorLabelProvider;
        this.f4287a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = newGiftCardData;
        this.e = arrayList4;
        this.f = arrayList5;
        this.g = newCreditCardData;
        if (newGiftCardData != null && newGiftCardData.getPaymentInstrumentId() != null) {
            this.i.put(newGiftCardData.getPaymentInstrumentId(), newGiftCardData.getMaskedCardNumber());
            this.j.put(newGiftCardData.getPaymentInstrumentId(), Boolean.TRUE);
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                NewGiftCardData newGiftCardData2 = (NewGiftCardData) it.next();
                if (newGiftCardData2.getPaymentInstrumentId() != null) {
                    this.i.put(newGiftCardData2.getPaymentInstrumentId(), newGiftCardData2.getMaskedCardNumber());
                    this.j.put(newGiftCardData2.getPaymentInstrumentId(), Boolean.TRUE);
                }
            }
        }
        List<SavedGiftCardData> list = this.f4287a;
        if (list != null) {
            for (SavedGiftCardData savedGiftCardData : list) {
                if (savedGiftCardData.getPaymentInstrumentId() != null) {
                    this.i.put(savedGiftCardData.getPaymentInstrumentId(), savedGiftCardData.getMaskedCardNumber());
                    this.j.put(savedGiftCardData.getPaymentInstrumentId(), Boolean.FALSE);
                }
            }
        }
        List<SavedGiftCardData> list2 = this.b;
        if (list2 != null) {
            for (SavedGiftCardData savedGiftCardData2 : list2) {
                if (savedGiftCardData2.getPaymentInstrumentId() != null) {
                    this.i.put(savedGiftCardData2.getPaymentInstrumentId(), savedGiftCardData2.getMaskedCardNumber());
                    this.j.put(savedGiftCardData2.getPaymentInstrumentId(), Boolean.FALSE);
                }
            }
        }
        NewCreditCardData newCreditCardData2 = this.g;
        if (newCreditCardData2 != null) {
            this.j.put(newCreditCardData2.getPaymentInstrumentId(), Boolean.TRUE);
        }
        List<CreditCardInstrument> list3 = this.e;
        if (list3 != null) {
            for (CreditCardInstrument creditCardInstrument : list3) {
                if (creditCardInstrument.getInstrumentId() != null) {
                    this.i.put(creditCardInstrument.getInstrumentId(), DigitalPayUtils.a(creditCardInstrument.getCardSuffix()));
                    this.j.put(creditCardInstrument.getInstrumentId(), Boolean.FALSE);
                }
            }
        }
        List<CreditCardInstrument> list4 = this.f;
        if (list4 != null) {
            for (CreditCardInstrument creditCardInstrument2 : list4) {
                if (creditCardInstrument2.getInstrumentId() != null) {
                    this.i.put(creditCardInstrument2.getInstrumentId(), DigitalPayUtils.a(creditCardInstrument2.getCardSuffix()));
                    this.j.put(creditCardInstrument2.getInstrumentId(), Boolean.FALSE);
                }
            }
        }
    }

    public static boolean e(String str) {
        return "ES151".equalsIgnoreCase(str) || "ES130".equalsIgnoreCase(str) || "ES611".equalsIgnoreCase(str) || "ES105".equalsIgnoreCase(str) || "ES120".equalsIgnoreCase(str);
    }

    public final boolean a(String str) {
        if (str == null || Strings.a(str)) {
            return false;
        }
        List list = this.f4287a;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (str.equals(((SavedGiftCardData) it.next()).getPaymentInstrumentId())) {
                    return false;
                }
            }
        }
        List list2 = this.b;
        if (list2 == null || list2.isEmpty()) {
            return true;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.equals(((SavedGiftCardData) it2.next()).getPaymentInstrumentId())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final au.com.woolworths.android.onesite.modules.checkout.digitalpay.InstrumentPaymentResult b(au.com.woolworths.foundation.shop.model.checkout.ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse r15) {
        /*
            r14 = this;
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.InstrumentPaymentResult r0 = new au.com.woolworths.android.onesite.modules.checkout.digitalpay.InstrumentPaymentResult
            java.lang.String r1 = r15.e()
            au.com.woolworths.foundation.shop.model.checkout.PaymentStepUp r2 = r15.g()
            java.lang.String r3 = r15.d()
            java.lang.String r4 = r15.f()
            java.lang.String r5 = r15.a()
            java.lang.String r6 = r15.c()
            java.lang.String r7 = r15.b()
            java.lang.String r8 = r15.d()
            if (r8 == 0) goto L31
            java.util.HashMap r8 = r14.i
            java.lang.String r9 = r15.d()
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            goto L32
        L31:
            r8 = 0
        L32:
            java.lang.String r9 = r15.e()
            r9.getClass()
            java.lang.String r10 = "GiftCard"
            boolean r10 = r9.equals(r10)
            r11 = 0
            if (r10 != 0) goto L6a
            java.lang.String r10 = "CreditCard"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L4c
        L4a:
            r9 = r11
            goto Lb4
        L4c:
            java.lang.String r9 = r15.d()
            if (r9 != 0) goto L53
            goto L4a
        L53:
            au.com.woolworths.android.onesite.models.checkout.NewCreditCardData r9 = r14.g
            if (r9 == 0) goto L4a
            java.lang.String r10 = r15.d()
            java.lang.String r12 = r9.getPaymentInstrumentId()
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L4a
            boolean r9 = r9.isSaveForLater()
            goto Lb4
        L6a:
            java.lang.String r9 = r15.d()
            if (r9 != 0) goto L71
            goto L4a
        L71:
            au.com.woolworths.android.onesite.models.checkout.NewGiftCardData r9 = r14.d
            if (r9 == 0) goto L88
            java.lang.String r10 = r15.d()
            java.lang.String r12 = r9.getPaymentInstrumentId()
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L88
            boolean r9 = r9.isSaveForLater()
            goto Lb4
        L88:
            java.util.List r9 = r14.c
            if (r9 == 0) goto L4a
            java.util.Iterator r9 = r9.iterator()
        L90:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L4a
            java.lang.Object r10 = r9.next()
            au.com.woolworths.android.onesite.models.checkout.NewGiftCardData r10 = (au.com.woolworths.android.onesite.models.checkout.NewGiftCardData) r10
            java.lang.String r12 = r10.getPaymentInstrumentId()
            if (r12 == 0) goto L90
            java.lang.String r12 = r10.getPaymentInstrumentId()
            java.lang.String r13 = r15.d()
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L90
            boolean r9 = r10.isSaveForLater()
        Lb4:
            java.lang.String r15 = r15.d()
            if (r15 == 0) goto Lc8
            java.util.HashMap r10 = r14.j
            java.lang.Object r15 = r10.get(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            if (r15 == 0) goto Lc8
            boolean r11 = r15.booleanValue()
        Lc8:
            r10 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.PaymentFailureHelper.b(au.com.woolworths.foundation.shop.model.checkout.ResponseStatusWithErrorListForOkStatus$PaymentInstrumentResponse):au.com.woolworths.android.onesite.modules.checkout.digitalpay.InstrumentPaymentResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String[] c() {
        /*
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            au.com.woolworths.android.onesite.models.checkout.NewCreditCardData r1 = r5.g
            if (r1 == 0) goto L6d
            boolean r2 = r1.isSaveForLater()
            if (r2 == 0) goto L6d
            java.lang.String r2 = r1.getPaymentInstrumentId()
            if (r2 == 0) goto L6d
            boolean r3 = au.com.woolworths.android.onesite.utils.Strings.a(r2)
            if (r3 == 0) goto L1c
            goto L6d
        L1c:
            java.util.List r3 = r5.e
            if (r3 == 0) goto L41
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L41
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()
            au.com.woolworths.pay.sdk.models.CreditCardInstrument r4 = (au.com.woolworths.pay.sdk.models.CreditCardInstrument) r4
            java.lang.String r4 = r4.getInstrumentId()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L2a
            goto L6d
        L41:
            java.util.List r3 = r5.f
            if (r3 == 0) goto L66
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L66
            java.util.Iterator r3 = r3.iterator()
        L4f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            au.com.woolworths.pay.sdk.models.CreditCardInstrument r4 = (au.com.woolworths.pay.sdk.models.CreditCardInstrument) r4
            java.lang.String r4 = r4.getInstrumentId()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L4f
            goto L6d
        L66:
            java.lang.String r1 = r1.getPaymentInstrumentId()
            r0.add(r1)
        L6d:
            au.com.woolworths.android.onesite.models.checkout.NewGiftCardData r1 = r5.d
            if (r1 == 0) goto L88
            boolean r2 = r1.isSaveForLater()
            if (r2 == 0) goto L88
            java.lang.String r2 = r1.getPaymentInstrumentId()
            boolean r2 = r5.a(r2)
            if (r2 == 0) goto L88
            java.lang.String r1 = r1.getPaymentInstrumentId()
            r0.add(r1)
        L88:
            java.util.List r1 = r5.c
            if (r1 == 0) goto Lb4
            java.util.Iterator r1 = r1.iterator()
        L90:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r1.next()
            au.com.woolworths.android.onesite.models.checkout.NewGiftCardData r2 = (au.com.woolworths.android.onesite.models.checkout.NewGiftCardData) r2
            boolean r3 = r2.isSaveForLater()
            if (r3 == 0) goto L90
            java.lang.String r3 = r2.getPaymentInstrumentId()
            boolean r3 = r5.a(r3)
            if (r3 == 0) goto L90
            java.lang.String r2 = r2.getPaymentInstrumentId()
            r0.add(r2)
            goto L90
        Lb4:
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.PaymentFailureHelper.c():java.lang.String[]");
    }

    public final boolean d(String str) {
        List<SavedGiftCardData> list;
        if (str != null && !Strings.a(str) && (list = this.f4287a) != null && list.size() != 0) {
            for (SavedGiftCardData savedGiftCardData : list) {
                if (str.equals(savedGiftCardData.getPaymentInstrumentId())) {
                    return savedGiftCardData.isSelectedForPayment();
                }
            }
        }
        return false;
    }
}
