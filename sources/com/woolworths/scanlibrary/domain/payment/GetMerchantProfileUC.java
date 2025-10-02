package com.woolworths.scanlibrary.domain.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.domain.login.c;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleCreate;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/payment/GetMerchantProfileUC;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/payment/GetMerchantProfileUC$RequestValues;", "Lcom/woolworths/scanlibrary/domain/payment/GetMerchantProfileUC$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMerchantProfileUC extends UseCase<RequestValues, ResponseValue> {
    public final PayClient c;
    public final DefaultTokenProvider d;
    public final Lazy e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/payment/GetMerchantProfileUC$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/payment/GetMerchantProfileUC$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final MerchantProfile f21191a;

        public ResponseValue(MerchantProfile merchantProfiles) {
            Intrinsics.h(merchantProfiles, "merchantProfiles");
            this.f21191a = merchantProfiles;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMerchantProfileUC(PayClient payClient, Scheduler scheduler, DefaultTokenProvider defaultTokenProvider) {
        super(scheduler, true);
        Intrinsics.h(payClient, "payClient");
        this.c = payClient;
        this.d = defaultTokenProvider;
        this.e = LazyKt.b(new b(0));
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        return new SingleCreate(new c(this, 2));
    }
}
