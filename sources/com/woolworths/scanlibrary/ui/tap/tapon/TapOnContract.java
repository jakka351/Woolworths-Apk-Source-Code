package com.woolworths.scanlibrary.ui.tap.tapon;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract;", "", "View", "Presenter", "ViewState", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TapOnContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        void A(int i);

        void C0();

        boolean H0();

        void J();

        void K();

        Voucher Q0();

        boolean S0();

        void V0();

        void Y();

        void a0();

        void b0(String str);

        void c1();

        MutableLiveData e0();

        boolean g0();

        String g1();

        boolean j0();

        String m0();

        void w0();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
        void d3();

        void m0(String str);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState;", "", "SUCCESS_WITH_STORE_DETAILS", "TIMEOUT_LOCATE_TAP_ON_DEVICE", "CANNOT_FETCH_STORE_DETAILS", "NON_APPLICATION_FAILURE", "PARKING_AVAILABLE", "PARKING_NOT_AVAILABLE", "GUEST_ACCESS_UNAVAILABLE", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$CANNOT_FETCH_STORE_DETAILS;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$GUEST_ACCESS_UNAVAILABLE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$NON_APPLICATION_FAILURE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$PARKING_AVAILABLE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$PARKING_NOT_AVAILABLE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$SUCCESS_WITH_STORE_DETAILS;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$TIMEOUT_LOCATE_TAP_ON_DEVICE;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$CANNOT_FETCH_STORE_DETAILS;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CANNOT_FETCH_STORE_DETAILS extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final CANNOT_FETCH_STORE_DETAILS f21348a = new CANNOT_FETCH_STORE_DETAILS();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$GUEST_ACCESS_UNAVAILABLE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GUEST_ACCESS_UNAVAILABLE extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final String f21349a;
            public final String b;

            public GUEST_ACCESS_UNAVAILABLE(String title, String description) {
                Intrinsics.h(title, "title");
                Intrinsics.h(description, "description");
                this.f21349a = title;
                this.b = description;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GUEST_ACCESS_UNAVAILABLE)) {
                    return false;
                }
                GUEST_ACCESS_UNAVAILABLE guest_access_unavailable = (GUEST_ACCESS_UNAVAILABLE) obj;
                return Intrinsics.c(this.f21349a, guest_access_unavailable.f21349a) && Intrinsics.c(this.b, guest_access_unavailable.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f21349a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("GUEST_ACCESS_UNAVAILABLE(title=", this.f21349a, ", description=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$NON_APPLICATION_FAILURE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NON_APPLICATION_FAILURE extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final NON_APPLICATION_FAILURE f21350a = new NON_APPLICATION_FAILURE();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$PARKING_AVAILABLE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PARKING_AVAILABLE extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final PARKING_AVAILABLE f21351a = new PARKING_AVAILABLE();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$PARKING_NOT_AVAILABLE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PARKING_NOT_AVAILABLE extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final PARKING_NOT_AVAILABLE f21352a = new PARKING_NOT_AVAILABLE();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$SUCCESS_WITH_STORE_DETAILS;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SUCCESS_WITH_STORE_DETAILS extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final SUCCESS_WITH_STORE_DETAILS f21353a = new SUCCESS_WITH_STORE_DETAILS();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState$TIMEOUT_LOCATE_TAP_ON_DEVICE;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TIMEOUT_LOCATE_TAP_ON_DEVICE extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final TIMEOUT_LOCATE_TAP_ON_DEVICE f21354a = new TIMEOUT_LOCATE_TAP_ON_DEVICE();
        }
    }
}
