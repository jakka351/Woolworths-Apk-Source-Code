package com.woolworths.scanlibrary.ui.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import java.math.BigDecimal;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract;", "", "View", "Presenter", "HomeEvent", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HomeActivityContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$HomeEvent;", "", "ShowTapOnViewEvent", "Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$HomeEvent$ShowTapOnViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class HomeEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$HomeEvent$ShowTapOnViewEvent;", "Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$HomeEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowTapOnViewEvent extends HomeEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowTapOnViewEvent f21266a = new ShowTapOnViewEvent();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        void F();

        boolean J0();

        void U();

        BigDecimal V();

        void a();

        void b();

        void i(boolean z);

        int l();

        void l0();

        int n();

        void r0();

        MutableLiveData t0();

        void v();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
    }
}
