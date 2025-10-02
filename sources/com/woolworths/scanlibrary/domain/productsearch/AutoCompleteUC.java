package com.woolworths.scanlibrary.domain.productsearch;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.base.ObservableUseCase;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import io.reactivex.Scheduler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/productsearch/AutoCompleteUC;", "Lcom/woolworths/scanlibrary/base/ObservableUseCase;", "Lcom/woolworths/scanlibrary/domain/productsearch/AutoCompleteUC$RequestValues;", "Lcom/woolworths/scanlibrary/domain/productsearch/AutoCompleteUC$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AutoCompleteUC extends ObservableUseCase<RequestValues, ResponseValue> {
    public final ScanNGoRepository b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/productsearch/AutoCompleteUC$RequestValues;", "Lcom/woolworths/scanlibrary/base/ObservableUseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements ObservableUseCase.RequestValues {

        /* renamed from: a, reason: collision with root package name */
        public final String f21195a;

        public RequestValues(String searQuery) {
            Intrinsics.h(searQuery, "searQuery");
            this.f21195a = searQuery;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/productsearch/AutoCompleteUC$ResponseValue;", "Lcom/woolworths/scanlibrary/base/ObservableUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements ObservableUseCase.ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final List f21196a;
        public final String b;

        public ResponseValue(List items, String searQuery) {
            Intrinsics.h(items, "items");
            Intrinsics.h(searQuery, "searQuery");
            this.f21196a = items;
            this.b = searQuery;
        }
    }

    public AutoCompleteUC(ScanNGoRepository scanNGoRepository, Scheduler scheduler) {
        super(scheduler);
        this.b = scanNGoRepository;
    }
}
