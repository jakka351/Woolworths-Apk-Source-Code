package com.woolworths.scanlibrary.data.payment;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.securedpreference.preference.SecuredSharedPreference;
import com.google.gson.Gson;
import com.woolworths.scanlibrary.data.payment.PaymentDetail;
import com.woolworths.scanlibrary.models.payment.PaymentInformation;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/data/payment/PaymentDetailImpl;", "Lcom/woolworths/scanlibrary/data/payment/PaymentDetail;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PaymentDetailImpl implements PaymentDetail {

    /* renamed from: a, reason: collision with root package name */
    public final SecuredSharedPreference f21161a;
    public boolean e;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public BigDecimal c = new BigDecimal(0);
    public BigDecimal d = new BigDecimal(0);
    public String g = "";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/data/payment/PaymentDetailImpl$Companion;", "", "", "KEY_PAYMENT_DETAILS", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PaymentDetailImpl(SecuredSharedPreference securedSharedPreference) {
        this.f21161a = securedSharedPreference;
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void a() {
        String strJ = new Gson().j(new PaymentDetail.PaymentDetailStore(this.b, this.c, this.d, this.e, this.g));
        Intrinsics.g(strJ, "toJson(...)");
        SharedPreferences.Editor editorEdit = this.f21161a.edit();
        editorEdit.putString("payment.details", strJ);
        editorEdit.commit();
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void b() {
        this.f = true;
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    /* renamed from: c, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void d(PaymentInformation... paymentInformationArr) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        CollectionsKt.j(arrayList, paymentInformationArr);
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void e() {
        this.e = true;
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void f(BigDecimal amount) {
        Intrinsics.h(amount, "amount");
        this.c = amount;
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void g() {
        this.b.clear();
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    /* renamed from: h, reason: from getter */
    public final ArrayList getB() {
        return this.b;
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void i(String cartId) {
        Intrinsics.h(cartId, "cartId");
        this.g = cartId;
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void j(BigDecimal amount) {
        Intrinsics.h(amount, "amount");
        this.d = amount;
    }

    @Override // com.woolworths.scanlibrary.data.payment.PaymentDetail
    public final void reset() {
        g();
        this.c = new BigDecimal(0);
        this.f = false;
        this.d = new BigDecimal(0);
        this.g = "";
    }
}
