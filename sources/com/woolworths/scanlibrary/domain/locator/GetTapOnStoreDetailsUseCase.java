package com.woolworths.scanlibrary.domain.locator;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.ratingsandreviews.ui.shared.a;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.token.b;
import com.woolworths.scanlibrary.models.tapon.TapOnResponse;
import com.woolworths.scanlibrary.models.tapon.TapOnStoreDetailsRequest;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleFlatMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/locator/GetTapOnStoreDetailsUseCase;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/locator/GetTapOnStoreDetailsUseCase$RequestValues;", "Lcom/woolworths/scanlibrary/domain/locator/GetTapOnStoreDetailsUseCase$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetTapOnStoreDetailsUseCase extends UseCase<RequestValues, ResponseValue> {
    public final ScanNGoRepository c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/locator/GetTapOnStoreDetailsUseCase$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {

        /* renamed from: a, reason: collision with root package name */
        public TapOnStoreDetailsRequest f21182a;
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/locator/GetTapOnStoreDetailsUseCase$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final TapOnResponse f21183a;

        public ResponseValue(TapOnResponse storeDetails) {
            Intrinsics.h(storeDetails, "storeDetails");
            this.f21183a = storeDetails;
        }
    }

    public GetTapOnStoreDetailsUseCase(ScanNGoRepository scanNGoRepository, Scheduler scheduler) {
        super(scheduler, true);
        this.c = scanNGoRepository;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        TapOnStoreDetailsRequest request = ((RequestValues) requestValues).f21182a;
        ScanNGoRepository scanNGoRepository = this.c;
        scanNGoRepository.getClass();
        Intrinsics.h(request, "request");
        return new SingleFlatMap(scanNGoRepository.f21149a.f21163a.u(request).h(scanNGoRepository.b), new b(new a(18), 13));
    }
}
