package com.woolworths.scanlibrary.base;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.base.UseCase.RequestValues;
import com.woolworths.scanlibrary.base.UseCase.ResponseValue;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "Req", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "Res", "", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UseCase<Req extends RequestValues, Res extends ResponseValue> {

    /* renamed from: a, reason: collision with root package name */
    public final Scheduler f21141a;
    public final boolean b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RequestValues {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResponseValue {
    }

    public UseCase(Scheduler backgroundScheduler, boolean z) {
        Intrinsics.h(backgroundScheduler, "backgroundScheduler");
        this.f21141a = backgroundScheduler;
        this.b = z;
    }

    public abstract Single a(RequestValues requestValues);

    public final Single b(RequestValues requestValues) {
        return this.b ? a(requestValues).h(this.f21141a) : a(requestValues);
    }
}
