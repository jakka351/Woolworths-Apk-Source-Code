package com.woolworths.scanlibrary.ui.splash;

import com.woolworths.scanlibrary.domain.servicemessage.GetServiceMessageUC;
import com.woolworths.scanlibrary.ui.splash.SplashPresenter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                SplashPresenter splashPresenter = (SplashPresenter) this.e;
                splashPresenter.c.W3(true);
                CompositeDisposable compositeDisposable = splashPresenter.b;
                SingleObserveOn singleObserveOnF = splashPresenter.e.b(new GetServiceMessageUC.RequestValues()).f(AndroidSchedulers.a());
                SplashPresenter.GetServiceMessagesObserver getServiceMessagesObserver = new SplashPresenter.GetServiceMessagesObserver(splashPresenter);
                singleObserveOnF.a(getServiceMessagesObserver);
                compositeDisposable.d(getServiceMessagesObserver);
                break;
            case 1:
                SplashPresenter splashPresenter2 = (SplashPresenter) this.e;
                splashPresenter2.c.W3(true);
                splashPresenter2.D(3);
                break;
            default:
                ((SplashPresenter.SignInResponseObserver) this.e).g.w3();
                break;
        }
        return Unit.f24250a;
    }
}
