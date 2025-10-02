package com.woolworths.scanlibrary.ui.splash;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.domain.servicemessage.GetServiceMessageUC;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.notification.Notifications;
import com.woolworths.scanlibrary.ui.splash.SplashContract;
import com.woolworths.scanlibrary.ui.splash.initialcheck.CheckTask;
import com.woolworths.scanlibrary.ui.splash.initialcheck.InitCheckTask;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/splash/SplashContract$View;", "Lcom/woolworths/scanlibrary/ui/splash/SplashContract$Presenter;", "PostInitResult", "SignInResponseObserver", "GetServiceMessagesObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplashPresenter extends BasePresenter<SplashContract.View> implements SplashContract.Presenter {
    public final SplashContract.View c;
    public final UserManager d;
    public final GetServiceMessageUC e;
    public final AnalyticsManager f;
    public final ScanAndGoFeatureConfig g;
    public final FeatureToggleManager h;
    public boolean i;
    public ArrayList j;
    public final BehaviorSubject k;
    public final BehaviorSubject l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$GetServiceMessagesObserver;", "Lio/reactivex/observers/DisposableSingleObserver;", "Lcom/woolworths/scanlibrary/domain/servicemessage/GetServiceMessageUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class GetServiceMessagesObserver extends DisposableSingleObserver<GetServiceMessageUC.ResponseValue> {
        public GetServiceMessagesObserver() {
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable e) {
            Intrinsics.h(e, "e");
            SplashPresenter.this.D(2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetServiceMessageUC.ResponseValue response = (GetServiceMessageUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            Notifications notifications = response.f21204a;
            boolean zIsEmpty = notifications.getNotifications().isEmpty();
            SplashPresenter splashPresenter = SplashPresenter.this;
            if (zIsEmpty) {
                splashPresenter.D(2);
            } else {
                splashPresenter.c.S0(notifications.getNotifications().get(0), splashPresenter.g);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$PostInitResult;", "", "SignInRequired", "AuthDone", "Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$PostInitResult$AuthDone;", "Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$PostInitResult$SignInRequired;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PostInitResult {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$PostInitResult$AuthDone;", "Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$PostInitResult;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AuthDone extends PostInitResult {

            /* renamed from: a, reason: collision with root package name */
            public final SignInUC.ResponseValue f21335a;

            public AuthDone(SignInUC.ResponseValue response) {
                Intrinsics.h(response, "response");
                this.f21335a = response;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$PostInitResult$SignInRequired;", "Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$PostInitResult;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SignInRequired extends PostInitResult {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/splash/SplashPresenter$SignInResponseObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/login/SignInUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SignInResponseObserver extends BaseDisposableObserver<SignInUC.ResponseValue> {
        public final SplashContract.View g;
        public final BehaviorSubject h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignInResponseObserver(SplashContract.View signInView, BehaviorSubject postInitCompleteSource) {
            super(signInView, 9);
            Intrinsics.h(signInView, "signInView");
            Intrinsics.h(postInitCompleteSource, "postInitCompleteSource");
            this.g = signInView;
            this.h = postInitCompleteSource;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            MvpView mvpView = this.e;
            if (500 > i || i >= 512) {
                mvpView.n(i, i2, apigeeErrorResponse, new h(20));
            } else {
                mvpView.n(i, i2, apigeeErrorResponse, new b(this, 2));
            }
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            SignInUC.ResponseValue response = (SignInUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            this.h.onNext(new PostInitResult.AuthDone(response));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SignInUC.AuthState.values().length];
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SignInUC.AuthState authState = SignInUC.AuthState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SignInUC.AuthState authState2 = SignInUC.AuthState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SignInUC.AuthState authState3 = SignInUC.AuthState.d;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SignInUC.AuthState authState4 = SignInUC.AuthState.d;
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SignInUC.AuthState authState5 = SignInUC.AuthState.d;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                SignInUC.AuthState authState6 = SignInUC.AuthState.d;
                iArr[4] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                SignInUC.AuthState authState7 = SignInUC.AuthState.d;
                iArr[0] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashPresenter(SplashContract.View view, UserManager userManager, GetServiceMessageUC getServiceMessageUC, AnalyticsManager analyticsManager, ScanAndGoFeatureConfig sngFeatureConfig, FeatureToggleManager featureToggleManager) {
        super(view);
        Intrinsics.h(userManager, "userManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(sngFeatureConfig, "sngFeatureConfig");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.c = view;
        this.d = userManager;
        this.e = getServiceMessageUC;
        this.f = analyticsManager;
        this.g = sngFeatureConfig;
        this.h = featureToggleManager;
        this.k = new BehaviorSubject();
        this.l = new BehaviorSubject();
    }

    @Override // com.woolworths.scanlibrary.ui.splash.SplashContract.Presenter
    public final void D(int i) {
        ArrayList arrayList;
        Iterator it;
        if (i != -1 && (arrayList = this.j) != null && (it = arrayList.iterator()) != null) {
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((CheckTask) it.next()).getF21336a() == i) {
                    it.remove();
                    break;
                }
            }
        }
        if (this.j == null || !(!r3.isEmpty())) {
            this.k.onNext(Boolean.TRUE);
            return;
        }
        ArrayList arrayList2 = this.j;
        Intrinsics.e(arrayList2);
        ((CheckTask) arrayList2.get(0)).getB().invoke();
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void M0() {
        if (this.j == null) {
            this.j = this.i ? new ArrayList() : CollectionsKt.Z(new InitCheckTask(2, new b(this, 0)), new InitCheckTask(3, new b(this, 1)));
        }
        D(-1);
        UserManager userManager = this.d;
        boolean zC = userManager.c();
        CompositeDisposable compositeDisposable = this.b;
        SplashContract.View view = this.c;
        BehaviorSubject behaviorSubject = this.l;
        if (zC) {
            view.W3(true);
            Single singleB = userManager.e.b(new SignInUC.RequestValues(this.h.c(ScanAndGoFeature.e)));
            com.woolworths.scanlibrary.domain.login.c cVar = new com.woolworths.scanlibrary.domain.login.c(new i(userManager, 17), 0);
            singleB.getClass();
            SingleObserveOn singleObserveOnF = new SingleFlatMap(singleB, cVar).f(AndroidSchedulers.a());
            MvpView mvpView = this.f21139a;
            Intrinsics.g(mvpView, "mvpView");
            SignInResponseObserver signInResponseObserver = new SignInResponseObserver((SplashContract.View) mvpView, behaviorSubject);
            singleObserveOnF.a(signInResponseObserver);
            compositeDisposable.d(signInResponseObserver);
        } else {
            behaviorSubject.onNext(new PostInitResult.SignInRequired());
        }
        ObservableObserveOn observableObserveOnF = Observable.m(this.k, behaviorSubject, new c(new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(18))).f(AndroidSchedulers.a());
        LambdaObserver lambdaObserver = new LambdaObserver(new c(new d(0, this, view)), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        compositeDisposable.d(lambdaObserver);
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void W0() {
        this.f.a(Screens.o);
    }

    @Override // com.woolworths.scanlibrary.ui.splash.SplashContract.Presenter
    public final void f0(boolean z) {
        this.i = z;
    }
}
