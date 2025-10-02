package au.com.woolworths.shop.digipay;

import YU.a;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.utils.Locales;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.CardCaptureInfo;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.pay.sdk.models.merchantprofile.CreditCardInfo;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import au.com.woolworths.shop.digipay.models.CreditCardType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayInteractor;", "", "Companion", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DigipayInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PayClient f10909a;
    public final ShopAccountInteractor b;
    public final DispatcherProvider c;
    public final ShopAppTokenAuthenticator d;
    public final FeatureToggleManager e;
    public CardCaptureInfo f;
    public MerchantProfile g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final SharedFlowImpl j;
    public final ContextScope k;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayInteractor$Companion;", "", "", "CREDIT_CARD_CAPTURE_REFERENCE", "Ljava/lang/String;", "", "MERCHANT_PROFILE_TIMEOUT", "J", "ENABLED", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public DigipayInteractor(PayClient payClient, ShopAccountInteractor accountInteractor, DispatcherProvider dispatcherProvider, ShopAppTokenAuthenticator tokenAuthenticator, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(payClient, "payClient");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(tokenAuthenticator, "tokenAuthenticator");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f10909a = payClient;
        this.b = accountInteractor;
        this.c = dispatcherProvider;
        this.d = tokenAuthenticator;
        this.e = featureToggleManager;
        this.h = new MutableLiveData(Boolean.FALSE);
        this.i = new MutableLiveData();
        this.j = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.k = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.shop.digipay.DigipayInteractor r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof au.com.woolworths.shop.digipay.DigipayInteractor$fetchPaymentInstruments$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.digipay.DigipayInteractor$fetchPaymentInstruments$1 r0 = (au.com.woolworths.shop.digipay.DigipayInteractor$fetchPaymentInstruments$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.digipay.DigipayInteractor$fetchPaymentInstruments$1 r0 = new au.com.woolworths.shop.digipay.DigipayInteractor$fetchPaymentInstruments$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.p
            androidx.lifecycle.MutableLiveData r6 = (androidx.lifecycle.MutableLiveData) r6
            kotlin.ResultKt.b(r8)
            goto La2
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r7 = r0.p
            au.com.woolworths.shop.digipay.DigipayInteractor r7 = (au.com.woolworths.shop.digipay.DigipayInteractor) r7
            kotlin.ResultKt.b(r8)
            goto L6e
        L3f:
            kotlin.ResultKt.b(r8)
            r0.p = r6
            r0.s = r4
            au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile r8 = r6.g
            if (r8 == 0) goto L4b
            goto L6a
        L4b:
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r8 = r6.e
            au.com.woolworths.base.shopapp.BaseShopAppFeature r2 = au.com.woolworths.base.shopapp.BaseShopAppFeature.x
            boolean r8 = r8.c(r2)
            r2 = 0
            if (r8 == 0) goto L58
            r8 = r2
            goto L6a
        L58:
            au.com.woolworths.shop.digipay.DigipayInteractor$getMerchantProfileIfNeeded$2 r8 = new au.com.woolworths.shop.digipay.DigipayInteractor$getMerchantProfileIfNeeded$2
            r8.<init>(r6, r7, r2)
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.b(r4, r8, r0)
            if (r7 != r1) goto L67
        L65:
            r8 = r7
            goto L6a
        L67:
            au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile r7 = (au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile) r7
            goto L65
        L6a:
            if (r8 != r1) goto L6d
            goto La0
        L6d:
            r7 = r6
        L6e:
            au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile r8 = (au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile) r8
            r7.g = r8
            androidx.lifecycle.MutableLiveData r7 = r6.i
            r0.p = r7
            r0.s = r3
            kotlin.coroutines.SafeContinuation r8 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r8.<init>(r0)
            au.com.woolworths.pay.sdk.PayClient r0 = r6.f10909a
            au.com.woolworths.shop.digipay.DigipayResultCallback r2 = new au.com.woolworths.shop.digipay.DigipayResultCallback
            au.com.woolworths.shop.auth.ShopAppTokenAuthenticator r3 = r6.d
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r6 = r6.c
            r2.<init>(r8, r3, r6)
            au.com.woolworths.pay.internal.services.paymentinstruments.PaymentInstrumentService r6 = new au.com.woolworths.pay.internal.services.paymentinstruments.PaymentInstrumentService
            au.com.woolworths.pay.sdk.models.config.Configuration r3 = r0.b
            au.com.woolworths.pay.internal.network.HttpClient r4 = r0.c
            au.com.woolworths.pay.internal.AccessTokenManager r0 = r0.e
            r6.<init>(r3, r4, r0)
            r6.a(r2)
            java.lang.Object r8 = r8.a()
            if (r8 != r1) goto La1
        La0:
            return r1
        La1:
            r6 = r7
        La2:
            r6.j(r8)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.digipay.DigipayInteractor.a(au.com.woolworths.shop.digipay.DigipayInteractor, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(String str, Continuation continuation) {
        ArrayList arrayList;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        this.f10909a.a(str, new DigipayEmptyResultCallback(safeContinuation, this.d, this.c));
        MutableLiveData mutableLiveData = this.i;
        List list = (List) mutableLiveData.e();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.c(((PaymentInstrument) obj).getInstrumentId(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        mutableLiveData.j(arrayList);
        Object objA = safeContinuation.a();
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final Object c(boolean z, SuspendLambda suspendLambda) {
        CardCaptureInfo cardCaptureInfo = this.f;
        if (cardCaptureInfo != null && !z) {
            return cardCaptureInfo;
        }
        this.c.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new DigipayInteractor$fetchCardCaptureInfo$2(this, null), suspendLambda);
    }

    public final List d() {
        CreditCardInfo creditCardInfo;
        String[] allowedNetworks;
        MerchantProfile merchantProfile = this.g;
        if (merchantProfile == null || (creditCardInfo = merchantProfile.getCreditCardInfo()) == null || (allowedNetworks = creditCardInfo.getAllowedNetworks()) == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList(allowedNetworks.length);
        for (String str : allowedNetworks) {
            CreditCardType.Companion companion = CreditCardType.e;
            Intrinsics.e(str);
            companion.getClass();
            LinkedHashMap linkedHashMap = CreditCardType.f;
            String lowerCase = str.toLowerCase(Locales.a());
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            CreditCardType creditCardType = (CreditCardType) linkedHashMap.get(lowerCase);
            if (creditCardType == null) {
                throw new IllegalArgumentException(a.h("Cannot find scheme ", str, " from CreditCardType enum"));
            }
            arrayList.add(creditCardType);
        }
        return arrayList;
    }

    public final void e() {
        boolean z = this.f10909a.f;
        BuildersKt.c(this.k, null, null, new DigipayInteractor$initDigipaySdkIfNeeded$1(this, null), 3);
    }

    public final void f() {
        BuildersKt.c(this.k, null, null, new DigipayInteractor$refresh$1(this, null), 3);
    }
}
