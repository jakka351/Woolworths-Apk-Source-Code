package com.woolworths.scanlibrary.domain.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.rewards.base.d;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.domain.login.c;
import com.woolworths.scanlibrary.domain.payment.GetMerchantProfileUC;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleCreate;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/payment/GetInstrumentsUC;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/payment/GetInstrumentsUC$RequestValues;", "Lcom/woolworths/scanlibrary/domain/payment/GetInstrumentsUC$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class GetInstrumentsUC extends UseCase<RequestValues, ResponseValue> {
    public final PayClient c;
    public final GetMerchantProfileUC d;
    public final DefaultTokenProvider e;
    public final Lazy f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/payment/GetInstrumentsUC$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/payment/GetInstrumentsUC$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final List f21190a;

        public ResponseValue(List paymentInstruments) {
            Intrinsics.h(paymentInstruments, "paymentInstruments");
            this.f21190a = paymentInstruments;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInstrumentsUC(PayClient payClient, GetMerchantProfileUC getMerchantProfileUC, Scheduler scheduler, DefaultTokenProvider defaultTokenProvider) {
        super(scheduler, true);
        Intrinsics.h(payClient, "payClient");
        this.c = payClient;
        this.d = getMerchantProfileUC;
        this.e = defaultTokenProvider;
        this.f = LazyKt.b(new d(29));
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        return Single.j(this.d.b(new GetMerchantProfileUC.RequestValues()), new SingleCreate(new c(this, 1)), new com.google.common.net.a(21));
    }
}
