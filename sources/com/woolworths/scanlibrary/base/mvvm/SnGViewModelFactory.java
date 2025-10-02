package com.woolworths.scanlibrary.base.mvvm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/SnGViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnGViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21146a;

    public SnGViewModelFactory(Map viewModelMap) {
        Intrinsics.h(viewModelMap, "viewModelMap");
        this.f21146a = viewModelMap;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel c(Class cls) {
        Provider provider = (Provider) this.f21146a.get(cls);
        ViewModel viewModel = provider != null ? (ViewModel) provider.get() : null;
        Intrinsics.f(viewModel, "null cannot be cast to non-null type T of com.woolworths.scanlibrary.base.mvvm.SnGViewModelFactory.create");
        return viewModel;
    }
}
