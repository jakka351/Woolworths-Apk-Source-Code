package com.woolworths.scanlibrary.domain.login;

import au.com.woolworths.pay.internal.services.paymentinstruments.PaymentInstrumentService;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.scanlibrary.domain.payment.GetInstrumentsUC;
import com.woolworths.scanlibrary.domain.payment.GetMerchantProfileUC;
import com.woolworths.scanlibrary.domain.productsearch.ProductSearchUC;
import com.woolworths.scanlibrary.domain.receipt.GetEmailReceiptUC;
import com.woolworths.scanlibrary.domain.receipt.GetParkingReceiptUC;
import com.woolworths.scanlibrary.domain.receipt.GetReceiptWithCartIdUC;
import com.woolworths.scanlibrary.domain.servicemessage.GetServiceMessageUC;
import com.woolworths.scanlibrary.domain.stores.GetAvailableStoresUC;
import com.woolworths.scanlibrary.models.product.search.AutoCompleteResponse;
import com.woolworths.scanlibrary.util.exceptions.PaymentError;
import com.woolworths.scanlibrary.util.payment.DefaultRetryService;
import io.reactivex.ObservableSource;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Function, SingleOnSubscribe, Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        switch (this.d) {
            case 20:
                ((com.woolworths.scanlibrary.ui.entry.launcher.a) this.e).invoke(obj);
                break;
            case 21:
                ((com.woolworths.scanlibrary.ui.entry.launcher.a) this.e).invoke(obj);
                break;
            case 22:
            case 23:
            default:
                ((com.woolworths.scanlibrary.ui.reward.a) this.e).invoke(obj);
                break;
            case 24:
                ((l) this.e).invoke(obj);
                break;
            case 25:
                ((com.woolworths.scanlibrary.ui.productsearch.datasource.a) this.e).invoke(obj);
                break;
            case 26:
                ((l) this.e).invoke(obj);
                break;
            case 27:
                ((com.woolworths.scanlibrary.ui.productsearch.datasource.a) this.e).invoke(obj);
                break;
            case 28:
                ((com.woolworths.scanlibrary.ui.reward.a) this.e).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 0:
                i iVar = (i) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) iVar.invoke(p0);
            case 1:
            case 2:
            case 20:
            case 21:
            default:
                com.woolworths.scanlibrary.domain.productsearch.a aVar = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (Pair) aVar.invoke(p0);
            case 3:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar2 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar2.invoke(p0);
            case 4:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar3 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar3.invoke(p0);
            case 5:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar4 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (AutoCompleteResponse) aVar4.invoke(p0);
            case 6:
                au.com.woolworths.shop.ratingsandreviews.ui.shared.a aVar5 = (au.com.woolworths.shop.ratingsandreviews.ui.shared.a) this.e;
                Intrinsics.h(p0, "p0");
                return (List) aVar5.invoke(p0);
            case 7:
                com.woolworths.scanlibrary.domain.productsearch.a aVar6 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (Iterable) aVar6.invoke(p0);
            case 8:
                com.woolworths.scanlibrary.domain.productsearch.a aVar7 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (String) aVar7.invoke(p0);
            case 9:
                i iVar2 = (i) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) iVar2.invoke(p0);
            case 10:
                com.woolworths.scanlibrary.domain.productsearch.a aVar8 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (ProductSearchUC.ResponseValue) aVar8.invoke(p0);
            case 11:
                com.woolworths.scanlibrary.domain.productsearch.a aVar9 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (ProductSearchUC.ResponseValue) aVar9.invoke(p0);
            case 12:
                com.woolworths.scanlibrary.domain.productsearch.a aVar10 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (GetEmailReceiptUC.ResponseValue) aVar10.invoke(p0);
            case 13:
                com.woolworths.scanlibrary.domain.productsearch.a aVar11 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (GetParkingReceiptUC.ResponseValue) aVar11.invoke(p0);
            case 14:
                com.woolworths.scanlibrary.domain.productsearch.a aVar12 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (GetReceiptWithCartIdUC.ResponseValue) aVar12.invoke(p0);
            case 15:
                com.woolworths.scanlibrary.domain.productsearch.a aVar13 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (GetServiceMessageUC.ResponseValue) aVar13.invoke(p0);
            case 16:
                com.woolworths.scanlibrary.domain.productsearch.a aVar14 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (GetAvailableStoresUC.ResponseValue) aVar14.invoke(p0);
            case 17:
                com.woolworths.scanlibrary.domain.productsearch.a aVar15 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar15.invoke(p0);
            case 18:
                com.woolworths.scanlibrary.domain.productsearch.a aVar16 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar16.invoke(p0);
            case 19:
                com.woolworths.scanlibrary.domain.productsearch.a aVar17 = (com.woolworths.scanlibrary.domain.productsearch.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar17.invoke(p0);
            case 22:
                com.woolworths.scanlibrary.ui.productsearch.c cVar = (com.woolworths.scanlibrary.ui.productsearch.c) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) cVar.invoke(p0);
        }
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void d(final SingleEmitter singleEmitter) {
        switch (this.d) {
            case 1:
                final GetInstrumentsUC getInstrumentsUC = (GetInstrumentsUC) this.e;
                PayClient payClient = getInstrumentsUC.c;
                new PaymentInstrumentService(payClient.b, payClient.c, payClient.e).a(new PayResultCallback<List<? extends PaymentInstrument>>() { // from class: com.woolworths.scanlibrary.domain.payment.GetInstrumentsUC$getPaymentInstrumentsObservable$1$1
                    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                    public final void A(Retryable retryable) {
                        Intrinsics.h(retryable, "retryable");
                        GetInstrumentsUC getInstrumentsUC2 = getInstrumentsUC;
                        ((DefaultRetryService) getInstrumentsUC2.f.getD()).a(getInstrumentsUC2.e, retryable, new a(singleEmitter, 0));
                    }

                    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                    public final void k0(Object obj) {
                        List paymentInstruments = (List) obj;
                        Intrinsics.h(paymentInstruments, "paymentInstruments");
                        SingleEmitter singleEmitter2 = singleEmitter;
                        if (singleEmitter2.b()) {
                            return;
                        }
                        singleEmitter2.onSuccess(new GetInstrumentsUC.ResponseValue(paymentInstruments));
                    }

                    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                    public final void v(PayError payError) {
                        Intrinsics.h(payError, "payError");
                        SingleEmitter singleEmitter2 = singleEmitter;
                        if (singleEmitter2.b()) {
                            return;
                        }
                        singleEmitter2.onError(new PaymentError(payError));
                    }
                });
                break;
            default:
                final GetMerchantProfileUC getMerchantProfileUC = (GetMerchantProfileUC) this.e;
                PayClient payClient2 = getMerchantProfileUC.c;
                payClient2.f9189a.c(new PayResultCallback<MerchantProfile>() { // from class: com.woolworths.scanlibrary.domain.payment.GetMerchantProfileUC$prepareResponse$1$1
                    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                    public final void A(Retryable retryable) {
                        Intrinsics.h(retryable, "retryable");
                        GetMerchantProfileUC getMerchantProfileUC2 = getMerchantProfileUC;
                        ((DefaultRetryService) getMerchantProfileUC2.e.getD()).a(getMerchantProfileUC2.d, retryable, new a(singleEmitter, 1));
                    }

                    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                    public final void k0(Object obj) {
                        MerchantProfile merchantProfile = (MerchantProfile) obj;
                        Intrinsics.h(merchantProfile, "merchantProfile");
                        SingleEmitter singleEmitter2 = singleEmitter;
                        if (singleEmitter2.b()) {
                            return;
                        }
                        singleEmitter2.onSuccess(new GetMerchantProfileUC.ResponseValue(merchantProfile));
                    }

                    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                    public final void v(PayError payError) {
                        Intrinsics.h(payError, "payError");
                        SingleEmitter singleEmitter2 = singleEmitter;
                        if (singleEmitter2.b()) {
                            return;
                        }
                        singleEmitter2.onError(new PaymentError(payError));
                    }
                });
                break;
        }
    }
}
