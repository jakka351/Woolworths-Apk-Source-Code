package com.woolworths.scanlibrary.base.mvvm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class BaseViewModel extends ViewModel {
    public final CompositeDisposable e = new CompositeDisposable();
    public final MutableLiveData f = new MutableLiveData();
    public final MutableLiveData g;

    public BaseViewModel() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.j(Boolean.FALSE);
        this.g = mutableLiveData;
    }

    @Override // androidx.lifecycle.ViewModel
    public void o6() {
        this.e.e();
    }

    public final void p6() {
        this.g.j(Boolean.FALSE);
    }

    public final void q6() {
        this.g.j(Boolean.TRUE);
    }
}
