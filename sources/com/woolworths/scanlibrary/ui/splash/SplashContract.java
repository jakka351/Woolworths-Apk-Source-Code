package com.woolworths.scanlibrary.ui.splash;

import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.models.notification.Notification;
import com.woolworths.scanlibrary.models.profile.ProfileResponse;
import com.woolworths.scanlibrary.ui.exit.ExitDTO;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashContract;", "", "View", "Presenter", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SplashContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        void D(int i);

        void f0(boolean z);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/splash/SplashContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
        void G2();

        void N(int i, ProfileResponse profileResponse);

        void S();

        void S0(Notification notification, ScanAndGoFeatureConfig scanAndGoFeatureConfig);

        void l1(ExitDTO exitDTO);

        void t();

        void w3();
    }
}
