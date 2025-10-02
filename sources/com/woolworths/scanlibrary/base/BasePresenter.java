package com.woolworths.scanlibrary.base;

import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: classes7.dex */
public abstract class BasePresenter<V extends MvpView> implements MvpPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final MvpView f21139a;
    public final CompositeDisposable b = new CompositeDisposable();

    public BasePresenter(MvpView mvpView) {
        this.f21139a = mvpView;
        mvpView.k1(this);
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public void M0() {
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public void X0() {
        this.b.e();
    }
}
