package com.woolworths.scanlibrary.domain.productsearch;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.domain.login.c;
import com.woolworths.scanlibrary.models.product.search.ProductSearchRequest;
import com.woolworths.scanlibrary.models.product.search.SearchResponse;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/productsearch/ProductSearchUC;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/productsearch/ProductSearchUC$RequestValues;", "Lcom/woolworths/scanlibrary/domain/productsearch/ProductSearchUC$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductSearchUC extends UseCase<RequestValues, ResponseValue> {
    public final ScanNGoRepository c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/productsearch/ProductSearchUC$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {

        /* renamed from: a, reason: collision with root package name */
        public final String f21197a;
        public final String b;

        public RequestValues(String searchTerm, String nextPageUrl) {
            Intrinsics.h(searchTerm, "searchTerm");
            Intrinsics.h(nextPageUrl, "nextPageUrl");
            this.f21197a = searchTerm;
            this.b = nextPageUrl;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/productsearch/ProductSearchUC$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final SearchResponse f21198a;

        public ResponseValue(SearchResponse response) {
            Intrinsics.h(response, "response");
            this.f21198a = response;
        }
    }

    public ProductSearchUC(ScanNGoRepository scanNGoRepository, Scheduler scheduler) {
        super(scheduler, false);
        this.c = scanNGoRepository;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        RequestValues requestValues2 = (RequestValues) requestValues;
        String str = requestValues2.f21197a;
        int length = str.length();
        ScanNGoRepository scanNGoRepository = this.c;
        if (length > 0) {
            Single<SearchResponse> singleL = scanNGoRepository.f21149a.f21163a.L(new ProductSearchRequest(str, null, 2, null).getSearchTerm());
            c cVar = new c(new a(2), 10);
            singleL.getClass();
            return new SingleMap(singleL, cVar);
        }
        Single<SearchResponse> singleY = scanNGoRepository.f21149a.f21163a.y(new ProductSearchRequest("", requestValues2.b).getNextpageUrl());
        c cVar2 = new c(new a(3), 11);
        singleY.getClass();
        return new SingleMap(singleY, cVar2);
    }
}
