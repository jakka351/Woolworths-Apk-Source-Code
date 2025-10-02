package com.woolworths.scanlibrary.base;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.base.ObservableUseCase.RequestValues;
import com.woolworths.scanlibrary.base.ObservableUseCase.ResponseValue;
import io.reactivex.Scheduler;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/base/ObservableUseCase;", "Lcom/woolworths/scanlibrary/base/ObservableUseCase$RequestValues;", "Req", "Lcom/woolworths/scanlibrary/base/ObservableUseCase$ResponseValue;", "Res", "", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ObservableUseCase<Req extends RequestValues, Res extends ResponseValue> {

    /* renamed from: a, reason: collision with root package name */
    public final Scheduler f21140a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/base/ObservableUseCase$RequestValues;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RequestValues {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/base/ObservableUseCase$ResponseValue;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResponseValue {
    }

    public ObservableUseCase(Scheduler scheduler) {
        this.f21140a = scheduler;
    }
}
