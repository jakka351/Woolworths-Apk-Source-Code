package com.woolworths.scanlibrary.ui.payment.instrumentlist;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract;", "", "View", "Presenter", "InstrumentListViewEvent", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InstrumentListContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent;", "", "FetchInstrumentListFailureEvent", "UpdateFetchedInstrumentList", "SetLoadingIndicatorEvent", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent$FetchInstrumentListFailureEvent;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent$SetLoadingIndicatorEvent;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent$UpdateFetchedInstrumentList;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class InstrumentListViewEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent$FetchInstrumentListFailureEvent;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FetchInstrumentListFailureEvent extends InstrumentListViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final FetchInstrumentListFailureEvent f21285a = new FetchInstrumentListFailureEvent();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent$SetLoadingIndicatorEvent;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SetLoadingIndicatorEvent extends InstrumentListViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f21286a;

            public SetLoadingIndicatorEvent(boolean z) {
                this.f21286a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetLoadingIndicatorEvent) && this.f21286a == ((SetLoadingIndicatorEvent) obj).f21286a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f21286a);
            }

            public final String toString() {
                return a.n("SetLoadingIndicatorEvent(show=", ")", this.f21286a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent$UpdateFetchedInstrumentList;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$InstrumentListViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateFetchedInstrumentList extends InstrumentListViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final List f21287a;

            public UpdateFetchedInstrumentList(ArrayList paymentInstruments) {
                Intrinsics.h(paymentInstruments, "paymentInstruments");
                this.f21287a = paymentInstruments;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateFetchedInstrumentList) && Intrinsics.c(this.f21287a, ((UpdateFetchedInstrumentList) obj).f21287a);
            }

            public final int hashCode() {
                return this.f21287a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.l("UpdateFetchedInstrumentList(paymentInstruments=", ")", this.f21287a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        ArrayList C();

        ArrayList E();

        boolean R();

        void Z0();

        MutableLiveData v0();

        void z(PaymentInstrument paymentInstrument);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
    }
}
