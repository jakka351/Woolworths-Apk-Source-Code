package au.com.woolworths.shop.digipay.creditcard;

import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.pay.sdk.web.FormView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CardCaptureViewCallback;", "Lau/com/woolworths/pay/sdk/web/FormView$FormViewCallback;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardCaptureViewCallback implements FormView.FormViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final CardCaptureViewEventHandler f10910a;

    public CardCaptureViewCallback(CardCaptureViewEventHandler handler) {
        Intrinsics.h(handler, "handler");
        this.f10910a = handler;
    }

    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
    public final void a(FormFocusState formFocusState) {
        this.f10910a.u5(formFocusState);
    }

    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
    public final void b() {
        this.f10910a.C2();
    }

    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
    public final void c(boolean z, boolean z2) {
        this.f10910a.c2(z, z2);
    }

    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
    public final void d(BaseError baseError) {
        this.f10910a.Z4();
    }

    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
    public final void e(String auditId, String instrumentId, String stepUpToken) {
        Intrinsics.h(auditId, "auditId");
        Intrinsics.h(instrumentId, "instrumentId");
        Intrinsics.h(stepUpToken, "stepUpToken");
        this.f10910a.E3(instrumentId, stepUpToken);
    }

    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
    public final void f(String fieldName, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.h(fieldName, "fieldName");
        this.f10910a.d1(zBooleanValue);
    }
}
