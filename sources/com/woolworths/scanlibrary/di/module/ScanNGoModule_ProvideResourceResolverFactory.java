package com.woolworths.scanlibrary.di.module;

import android.content.Context;
import com.woolworths.scanlibrary.util.resource.ResourceResolver;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideResourceResolverFactory implements Factory<ResourceResolver> {
    public static ResourceResolverImpl a(ScanNGoModule scanNGoModule, Context context) {
        scanNGoModule.getClass();
        Intrinsics.h(context, "context");
        return new ResourceResolverImpl(context);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
