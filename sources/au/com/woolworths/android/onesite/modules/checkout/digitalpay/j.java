package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.GiftCardInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import com.woolworths.R;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Action {
    public final /* synthetic */ int d;
    public final /* synthetic */ DigitalPayForOrderFragment e;
    public final /* synthetic */ int f;

    public /* synthetic */ j(DigitalPayForOrderFragment digitalPayForOrderFragment, int i, int i2) {
        this.d = i2;
        this.e = digitalPayForOrderFragment;
        this.f = i;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.d) {
            case 0:
                final DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) this.e.b2().get();
                ArrayList arrayList = digitalPayForOrderPresenter.q;
                int size = arrayList.size();
                final int i = this.f;
                if (i < size) {
                    if (digitalPayForOrderPresenter.i()) {
                        Object obj = digitalPayForOrderPresenter.f4374a;
                        Intrinsics.e(obj);
                        ((DigitalPayForOrderContract.View) obj).Q0(R.string.deleting_card);
                    }
                    PayClient payClient = digitalPayForOrderPresenter.m;
                    PaymentInstrument paymentInstrument = (PaymentInstrument) arrayList.get(i);
                    final SchedulersProvider schedulersProvider = digitalPayForOrderPresenter.i;
                    final ShopAppTokenAuthenticator shopAppTokenAuthenticator = digitalPayForOrderPresenter.j;
                    BasePayEmptyResultCallback basePayEmptyResultCallback = new BasePayEmptyResultCallback(schedulersProvider, shopAppTokenAuthenticator) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$deleteSavedCreditCard$1
                        @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                        public final void d2() {
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                            ArrayList arrayList2 = digitalPayForOrderPresenter2.q;
                            int i2 = i;
                            if (Intrinsics.c(((CreditCardInstrument) arrayList2.get(i2)).getInstrumentId(), digitalPayForOrderPresenter2.y)) {
                                digitalPayForOrderPresenter2.y = null;
                            }
                            arrayList2.remove(i2);
                            if (digitalPayForOrderPresenter2.i()) {
                                Object obj2 = digitalPayForOrderPresenter2.f4374a;
                                Intrinsics.e(obj2);
                                ((DigitalPayForOrderContract.View) obj2).y();
                                if (!digitalPayForOrderPresenter2.m()) {
                                    if (!digitalPayForOrderPresenter2.R()) {
                                        digitalPayForOrderPresenter2.t0(false);
                                        return;
                                    }
                                    if (digitalPayForOrderPresenter2.O()) {
                                        Object obj3 = digitalPayForOrderPresenter2.f4374a;
                                        Intrinsics.e(obj3);
                                        ((DigitalPayForOrderContract.View) obj3).g1();
                                        return;
                                    } else {
                                        Object obj4 = digitalPayForOrderPresenter2.f4374a;
                                        Intrinsics.e(obj4);
                                        ((DigitalPayForOrderContract.View) obj4).j3();
                                        Object obj5 = digitalPayForOrderPresenter2.f4374a;
                                        Intrinsics.e(obj5);
                                        ((DigitalPayForOrderContract.View) obj5).a1(digitalPayForOrderPresenter2.O());
                                        return;
                                    }
                                }
                                if (!digitalPayForOrderPresenter2.R()) {
                                    Object obj6 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj6);
                                    ((DigitalPayForOrderContract.View) obj6).Y1();
                                    Object obj7 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj7);
                                    ((DigitalPayForOrderContract.View) obj7).j3();
                                    Object obj8 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj8);
                                    ((DigitalPayForOrderContract.View) obj8).r4();
                                    Object obj9 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj9);
                                    ((DigitalPayForOrderContract.View) obj9).n0();
                                    return;
                                }
                                if (digitalPayForOrderPresenter2.O()) {
                                    Object obj10 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj10);
                                    ((DigitalPayForOrderContract.View) obj10).g1();
                                } else {
                                    Object obj11 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj11);
                                    ((DigitalPayForOrderContract.View) obj11).j3();
                                }
                                Object obj12 = digitalPayForOrderPresenter2.f4374a;
                                Intrinsics.e(obj12);
                                ((DigitalPayForOrderContract.View) obj12).v4();
                                Object obj13 = digitalPayForOrderPresenter2.f4374a;
                                Intrinsics.e(obj13);
                                ((DigitalPayForOrderContract.View) obj13).D2(digitalPayForOrderPresenter2.R(), digitalPayForOrderPresenter2.O());
                            }
                        }

                        @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                        public final void v(PayError payError) {
                            Intrinsics.h(payError, "payError");
                            Timber.f27013a.o(payError.getErrorMessage(), new Object[0]);
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                            if (digitalPayForOrderPresenter2.i()) {
                                Object obj2 = digitalPayForOrderPresenter2.f4374a;
                                Intrinsics.e(obj2);
                                ((DigitalPayForOrderContract.View) obj2).y();
                                Object obj3 = digitalPayForOrderPresenter2.f4374a;
                                Intrinsics.e(obj3);
                                Object obj4 = digitalPayForOrderPresenter2.f4374a;
                                Intrinsics.e(obj4);
                                ((DigitalPayForOrderContract.View) obj3).D1(((DigitalPayForOrderContract.View) obj4).v3());
                            }
                        }
                    };
                    payClient.getClass();
                    payClient.a(paymentInstrument.getInstrumentId(), basePayEmptyResultCallback);
                    break;
                }
                break;
            case 1:
                DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) this.e.b2().get();
                ArrayList arrayList2 = digitalPayForOrderPresenter2.u;
                int i2 = this.f;
                if (i2 >= 0 && i2 < arrayList2.size()) {
                    arrayList2.remove(i2);
                    if (digitalPayForOrderPresenter2.K()) {
                        Object obj2 = digitalPayForOrderPresenter2.f4374a;
                        Intrinsics.e(obj2);
                        ((DigitalPayForOrderContract.View) obj2).u4();
                    } else {
                        Object obj3 = digitalPayForOrderPresenter2.f4374a;
                        Intrinsics.e(obj3);
                        ((DigitalPayForOrderContract.View) obj3).E3();
                        Object obj4 = digitalPayForOrderPresenter2.f4374a;
                        Intrinsics.e(obj4);
                        ((DigitalPayForOrderContract.View) obj4).X(false);
                    }
                }
                digitalPayForOrderPresenter2.z0();
                break;
            case 2:
                final DigitalPayForOrderPresenter digitalPayForOrderPresenter3 = (DigitalPayForOrderPresenter) this.e.b2().get();
                ArrayList arrayList3 = digitalPayForOrderPresenter3.p;
                int size2 = arrayList3.size();
                final int i3 = this.f;
                if (i3 < size2) {
                    if (digitalPayForOrderPresenter3.i()) {
                        Object obj5 = digitalPayForOrderPresenter3.f4374a;
                        Intrinsics.e(obj5);
                        ((DigitalPayForOrderContract.View) obj5).Q0(R.string.deleting_card);
                    }
                    PayClient payClient2 = digitalPayForOrderPresenter3.m;
                    PaymentInstrument paymentInstrument2 = (PaymentInstrument) arrayList3.get(i3);
                    final SchedulersProvider schedulersProvider2 = digitalPayForOrderPresenter3.i;
                    final ShopAppTokenAuthenticator shopAppTokenAuthenticator2 = digitalPayForOrderPresenter3.j;
                    BasePayEmptyResultCallback basePayEmptyResultCallback2 = new BasePayEmptyResultCallback(schedulersProvider2, shopAppTokenAuthenticator2) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$deleteExpiredCreditCard$1
                        @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                        public final void d2() {
                            String strL4;
                            String strL42;
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter4 = digitalPayForOrderPresenter3;
                            ArrayList arrayList4 = digitalPayForOrderPresenter4.p;
                            arrayList4.remove(i3);
                            if (digitalPayForOrderPresenter4.i()) {
                                Object obj6 = digitalPayForOrderPresenter4.f4374a;
                                Intrinsics.e(obj6);
                                ((DigitalPayForOrderContract.View) obj6).y();
                                if (!digitalPayForOrderPresenter4.m()) {
                                    if (!digitalPayForOrderPresenter4.R()) {
                                        digitalPayForOrderPresenter4.t0(false);
                                        return;
                                    }
                                    if (!digitalPayForOrderPresenter4.L()) {
                                        Object obj7 = digitalPayForOrderPresenter4.f4374a;
                                        Intrinsics.e(obj7);
                                        ((DigitalPayForOrderContract.View) obj7).r4();
                                        return;
                                    }
                                    Object obj8 = digitalPayForOrderPresenter4.f4374a;
                                    Intrinsics.e(obj8);
                                    DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj8;
                                    if (arrayList4.size() == 1) {
                                        Object obj9 = digitalPayForOrderPresenter4.f4374a;
                                        Intrinsics.e(obj9);
                                        strL4 = ((DigitalPayForOrderContract.View) obj9).F1();
                                    } else {
                                        Object obj10 = digitalPayForOrderPresenter4.f4374a;
                                        Intrinsics.e(obj10);
                                        strL4 = ((DigitalPayForOrderContract.View) obj10).l4();
                                    }
                                    view.M1(strL4);
                                    return;
                                }
                                if (!digitalPayForOrderPresenter4.R()) {
                                    Object obj11 = digitalPayForOrderPresenter4.f4374a;
                                    Intrinsics.e(obj11);
                                    ((DigitalPayForOrderContract.View) obj11).Y1();
                                    Object obj12 = digitalPayForOrderPresenter4.f4374a;
                                    Intrinsics.e(obj12);
                                    ((DigitalPayForOrderContract.View) obj12).j3();
                                    Object obj13 = digitalPayForOrderPresenter4.f4374a;
                                    Intrinsics.e(obj13);
                                    ((DigitalPayForOrderContract.View) obj13).r4();
                                    Object obj14 = digitalPayForOrderPresenter4.f4374a;
                                    Intrinsics.e(obj14);
                                    ((DigitalPayForOrderContract.View) obj14).n0();
                                    return;
                                }
                                if (digitalPayForOrderPresenter4.L()) {
                                    Object obj15 = digitalPayForOrderPresenter4.f4374a;
                                    Intrinsics.e(obj15);
                                    DigitalPayForOrderContract.View view2 = (DigitalPayForOrderContract.View) obj15;
                                    if (arrayList4.size() == 1) {
                                        Object obj16 = digitalPayForOrderPresenter4.f4374a;
                                        Intrinsics.e(obj16);
                                        strL42 = ((DigitalPayForOrderContract.View) obj16).F1();
                                    } else {
                                        Object obj17 = digitalPayForOrderPresenter4.f4374a;
                                        Intrinsics.e(obj17);
                                        strL42 = ((DigitalPayForOrderContract.View) obj17).l4();
                                    }
                                    view2.M1(strL42);
                                } else {
                                    Object obj18 = digitalPayForOrderPresenter4.f4374a;
                                    Intrinsics.e(obj18);
                                    ((DigitalPayForOrderContract.View) obj18).r4();
                                }
                                Object obj19 = digitalPayForOrderPresenter4.f4374a;
                                Intrinsics.e(obj19);
                                ((DigitalPayForOrderContract.View) obj19).v4();
                                Object obj20 = digitalPayForOrderPresenter4.f4374a;
                                Intrinsics.e(obj20);
                                ((DigitalPayForOrderContract.View) obj20).D2(digitalPayForOrderPresenter4.R(), digitalPayForOrderPresenter4.O());
                            }
                        }

                        @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                        public final void v(PayError payError) {
                            Intrinsics.h(payError, "payError");
                            Timber.f27013a.o(payError.getErrorMessage(), new Object[0]);
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter4 = digitalPayForOrderPresenter3;
                            if (digitalPayForOrderPresenter4.i()) {
                                Object obj6 = digitalPayForOrderPresenter4.f4374a;
                                Intrinsics.e(obj6);
                                ((DigitalPayForOrderContract.View) obj6).y();
                                Object obj7 = digitalPayForOrderPresenter4.f4374a;
                                Intrinsics.e(obj7);
                                Object obj8 = digitalPayForOrderPresenter4.f4374a;
                                Intrinsics.e(obj8);
                                ((DigitalPayForOrderContract.View) obj7).D1(((DigitalPayForOrderContract.View) obj8).v3());
                            }
                        }
                    };
                    payClient2.getClass();
                    payClient2.a(paymentInstrument2.getInstrumentId(), basePayEmptyResultCallback2);
                    break;
                }
                break;
            case 3:
                final DigitalPayForOrderPresenter digitalPayForOrderPresenter4 = (DigitalPayForOrderPresenter) this.e.b2().get();
                ArrayList arrayList4 = digitalPayForOrderPresenter4.r;
                ArrayList arrayList5 = digitalPayForOrderPresenter4.s;
                if (digitalPayForOrderPresenter4.M()) {
                    int size3 = arrayList5.size();
                    final int i4 = this.f;
                    if (i4 < size3 && arrayList4 != null && !arrayList4.isEmpty()) {
                        if (digitalPayForOrderPresenter4.i()) {
                            Object obj6 = digitalPayForOrderPresenter4.f4374a;
                            Intrinsics.e(obj6);
                            ((DigitalPayForOrderContract.View) obj6).Q0(R.string.deleting_card);
                        }
                        Iterator it = arrayList4.iterator();
                        final GiftCardInstrument giftCardInstrument = null;
                        while (it.hasNext()) {
                            GiftCardInstrument giftCardInstrument2 = (GiftCardInstrument) it.next();
                            if (Intrinsics.c(giftCardInstrument2.getInstrumentId(), ((SavedGiftCardData) arrayList5.get(i4)).getPaymentInstrumentId())) {
                                giftCardInstrument = giftCardInstrument2;
                            }
                        }
                        if (giftCardInstrument != null) {
                            PayClient payClient3 = digitalPayForOrderPresenter4.m;
                            final SchedulersProvider schedulersProvider3 = digitalPayForOrderPresenter4.i;
                            final ShopAppTokenAuthenticator shopAppTokenAuthenticator3 = digitalPayForOrderPresenter4.j;
                            BasePayEmptyResultCallback basePayEmptyResultCallback3 = new BasePayEmptyResultCallback(schedulersProvider3, shopAppTokenAuthenticator3) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$deleteExpiredGiftCard$1
                                @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                                public final void d2() {
                                    DigitalPayForOrderPresenter digitalPayForOrderPresenter5 = digitalPayForOrderPresenter4;
                                    digitalPayForOrderPresenter5.s.remove(i4);
                                    digitalPayForOrderPresenter5.r.remove(giftCardInstrument);
                                    if (digitalPayForOrderPresenter5.i()) {
                                        Object obj7 = digitalPayForOrderPresenter5.f4374a;
                                        Intrinsics.e(obj7);
                                        ((DigitalPayForOrderContract.View) obj7).y();
                                        if (!digitalPayForOrderPresenter5.n()) {
                                            if (digitalPayForOrderPresenter5.P()) {
                                                digitalPayForOrderPresenter5.w0();
                                                return;
                                            } else {
                                                digitalPayForOrderPresenter5.u0();
                                                return;
                                            }
                                        }
                                        if (digitalPayForOrderPresenter5.P()) {
                                            digitalPayForOrderPresenter5.w0();
                                            Object obj8 = digitalPayForOrderPresenter5.f4374a;
                                            Intrinsics.e(obj8);
                                            ((DigitalPayForOrderContract.View) obj8).Y0();
                                            Object obj9 = digitalPayForOrderPresenter5.f4374a;
                                            Intrinsics.e(obj9);
                                            ((DigitalPayForOrderContract.View) obj9).h1(true, digitalPayForOrderPresenter5.Q());
                                            return;
                                        }
                                        Object obj10 = digitalPayForOrderPresenter5.f4374a;
                                        Intrinsics.e(obj10);
                                        ((DigitalPayForOrderContract.View) obj10).b3();
                                        Object obj11 = digitalPayForOrderPresenter5.f4374a;
                                        Intrinsics.e(obj11);
                                        ((DigitalPayForOrderContract.View) obj11).h0();
                                        Object obj12 = digitalPayForOrderPresenter5.f4374a;
                                        Intrinsics.e(obj12);
                                        ((DigitalPayForOrderContract.View) obj12).K0();
                                        Object obj13 = digitalPayForOrderPresenter5.f4374a;
                                        Intrinsics.e(obj13);
                                        ((DigitalPayForOrderContract.View) obj13).X(digitalPayForOrderPresenter5.K());
                                    }
                                }

                                @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                                public final void v(PayError payError) {
                                    Intrinsics.h(payError, "payError");
                                    Timber.f27013a.o(payError.getErrorMessage(), new Object[0]);
                                    DigitalPayForOrderPresenter digitalPayForOrderPresenter5 = digitalPayForOrderPresenter4;
                                    if (digitalPayForOrderPresenter5.i()) {
                                        Object obj7 = digitalPayForOrderPresenter5.f4374a;
                                        Intrinsics.e(obj7);
                                        ((DigitalPayForOrderContract.View) obj7).y();
                                        Object obj8 = digitalPayForOrderPresenter5.f4374a;
                                        Intrinsics.e(obj8);
                                        Object obj9 = digitalPayForOrderPresenter5.f4374a;
                                        Intrinsics.e(obj9);
                                        ((DigitalPayForOrderContract.View) obj8).D1(((DigitalPayForOrderContract.View) obj9).J0());
                                    }
                                }
                            };
                            payClient3.getClass();
                            payClient3.a(giftCardInstrument.getInstrumentId(), basePayEmptyResultCallback3);
                            break;
                        }
                    }
                }
                break;
            default:
                final DigitalPayForOrderPresenter digitalPayForOrderPresenter5 = (DigitalPayForOrderPresenter) this.e.b2().get();
                ArrayList arrayList6 = digitalPayForOrderPresenter5.r;
                ArrayList arrayList7 = digitalPayForOrderPresenter5.t;
                int size4 = arrayList7.size();
                final int i5 = this.f;
                if (i5 < size4 && arrayList6 != null && !arrayList6.isEmpty()) {
                    if (digitalPayForOrderPresenter5.i()) {
                        Object obj7 = digitalPayForOrderPresenter5.f4374a;
                        Intrinsics.e(obj7);
                        ((DigitalPayForOrderContract.View) obj7).Q0(R.string.deleting_card);
                    }
                    Iterator it2 = arrayList6.iterator();
                    final GiftCardInstrument giftCardInstrument3 = null;
                    while (it2.hasNext()) {
                        GiftCardInstrument giftCardInstrument4 = (GiftCardInstrument) it2.next();
                        if (Intrinsics.c(giftCardInstrument4.getInstrumentId(), ((SavedGiftCardData) arrayList7.get(i5)).getPaymentInstrumentId())) {
                            giftCardInstrument3 = giftCardInstrument4;
                        }
                    }
                    if (giftCardInstrument3 != null) {
                        PayClient payClient4 = digitalPayForOrderPresenter5.m;
                        final SchedulersProvider schedulersProvider4 = digitalPayForOrderPresenter5.i;
                        final ShopAppTokenAuthenticator shopAppTokenAuthenticator4 = digitalPayForOrderPresenter5.j;
                        BasePayEmptyResultCallback basePayEmptyResultCallback4 = new BasePayEmptyResultCallback(schedulersProvider4, shopAppTokenAuthenticator4) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$deleteSavedGiftCard$1
                            @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                            public final void d2() {
                                DigitalPayForOrderPresenter digitalPayForOrderPresenter6 = digitalPayForOrderPresenter5;
                                digitalPayForOrderPresenter6.t.remove(i5);
                                ArrayList arrayList8 = digitalPayForOrderPresenter6.r;
                                TypeIntrinsics.a(arrayList8).remove(giftCardInstrument3);
                                if (digitalPayForOrderPresenter6.i()) {
                                    Object obj8 = digitalPayForOrderPresenter6.f4374a;
                                    Intrinsics.e(obj8);
                                    ((DigitalPayForOrderContract.View) obj8).y();
                                    if (!digitalPayForOrderPresenter6.n()) {
                                        if (!digitalPayForOrderPresenter6.P()) {
                                            digitalPayForOrderPresenter6.u0();
                                            return;
                                        }
                                        if (digitalPayForOrderPresenter6.Q()) {
                                            Object obj9 = digitalPayForOrderPresenter6.f4374a;
                                            Intrinsics.e(obj9);
                                            ((DigitalPayForOrderContract.View) obj9).d1();
                                            digitalPayForOrderPresenter6.s();
                                            return;
                                        }
                                        Object obj10 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj10);
                                        ((DigitalPayForOrderContract.View) obj10).h0();
                                        Object obj11 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj11);
                                        ((DigitalPayForOrderContract.View) obj11).r3();
                                        Object obj12 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj12);
                                        ((DigitalPayForOrderContract.View) obj12).c0(digitalPayForOrderPresenter6.Q());
                                        return;
                                    }
                                    if (!digitalPayForOrderPresenter6.P()) {
                                        Object obj13 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj13);
                                        ((DigitalPayForOrderContract.View) obj13).b3();
                                        Object obj14 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj14);
                                        ((DigitalPayForOrderContract.View) obj14).h0();
                                        Object obj15 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj15);
                                        ((DigitalPayForOrderContract.View) obj15).r3();
                                        Object obj16 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj16);
                                        ((DigitalPayForOrderContract.View) obj16).K0();
                                        Object obj17 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj17);
                                        ((DigitalPayForOrderContract.View) obj17).X(digitalPayForOrderPresenter6.K());
                                        return;
                                    }
                                    if (digitalPayForOrderPresenter6.Q()) {
                                        Object obj18 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj18);
                                        ((DigitalPayForOrderContract.View) obj18).d1();
                                        digitalPayForOrderPresenter6.s();
                                    } else {
                                        Object obj19 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj19);
                                        ((DigitalPayForOrderContract.View) obj19).h0();
                                        Object obj20 = digitalPayForOrderPresenter6.f4374a;
                                        Intrinsics.e(obj20);
                                        ((DigitalPayForOrderContract.View) obj20).r3();
                                    }
                                    Object obj21 = digitalPayForOrderPresenter6.f4374a;
                                    Intrinsics.e(obj21);
                                    ((DigitalPayForOrderContract.View) obj21).Y0();
                                    Object obj22 = digitalPayForOrderPresenter6.f4374a;
                                    Intrinsics.e(obj22);
                                    ((DigitalPayForOrderContract.View) obj22).h1(true, digitalPayForOrderPresenter6.Q());
                                }
                            }

                            @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                            public final void v(PayError payError) {
                                Intrinsics.h(payError, "payError");
                                Timber.f27013a.o(payError.getErrorMessage(), new Object[0]);
                                DigitalPayForOrderPresenter digitalPayForOrderPresenter6 = digitalPayForOrderPresenter5;
                                if (digitalPayForOrderPresenter6.i()) {
                                    Object obj8 = digitalPayForOrderPresenter6.f4374a;
                                    Intrinsics.e(obj8);
                                    ((DigitalPayForOrderContract.View) obj8).y();
                                    Object obj9 = digitalPayForOrderPresenter6.f4374a;
                                    Intrinsics.e(obj9);
                                    Object obj10 = digitalPayForOrderPresenter6.f4374a;
                                    Intrinsics.e(obj10);
                                    ((DigitalPayForOrderContract.View) obj9).D1(((DigitalPayForOrderContract.View) obj10).J0());
                                }
                            }
                        };
                        payClient4.getClass();
                        payClient4.a(giftCardInstrument3.getInstrumentId(), basePayEmptyResultCallback4);
                        break;
                    }
                }
                break;
        }
    }
}
