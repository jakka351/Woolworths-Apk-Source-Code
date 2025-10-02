package au.com.woolworths.shop.digipay;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayEmptyResultCallback;", "Lau/com/woolworths/pay/sdk/interfaces/PayEmptyResultCallback;", "Companion", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DigipayEmptyResultCallback implements PayEmptyResultCallback {
    public final SafeContinuation d;
    public final ShopAppTokenAuthenticator e;
    public final DispatcherProvider f;
    public final ContextScope g;
    public int h;
    public final DigipayEmptyResultCallback$authPayError$1 i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayEmptyResultCallback$Companion;", "", "", "AUTH_ERROR_MESSAGE", "Ljava/lang/String;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public DigipayEmptyResultCallback(SafeContinuation safeContinuation, ShopAppTokenAuthenticator tokenAuthenticator, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(tokenAuthenticator, "tokenAuthenticator");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.d = safeContinuation;
        this.e = tokenAuthenticator;
        this.f = dispatcherProvider;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.g = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        this.i = new DigipayEmptyResultCallback$authPayError$1();
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
    public final void A(Retryable retryable) {
        Intrinsics.h(retryable, "retryable");
        int i = this.h;
        if (i >= 3) {
            v(this.i);
            return;
        }
        this.h = i + 1;
        BuildersKt.c(this.g, null, null, new DigipayEmptyResultCallback$authorisationRequired$1(this, retryable, null), 3);
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
    public final void d2() {
        this.d.resumeWith(Unit.f24250a);
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
    public final void v(PayError error) {
        Intrinsics.h(error, "error");
        this.d.resumeWith(ResultKt.a(DigipayExtKt.a(error)));
    }
}
