package com.woolworths.scanlibrary.di.module;

import com.google.common.collect.ImmutableMap;
import com.woolworths.scanlibrary.base.mvvm.SnGViewModelFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ViewModelModule_ProvidesViewModelFactoryFactory implements Factory<SnGViewModelFactory> {
    public static SnGViewModelFactory a(ViewModelModule viewModelModule, ImmutableMap viewModels) {
        viewModelModule.getClass();
        Intrinsics.h(viewModels, "viewModels");
        return new SnGViewModelFactory(viewModels);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
