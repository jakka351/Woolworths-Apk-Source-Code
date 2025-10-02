package com.woolworths.scanlibrary.di.module;

import android.content.Context;
import com.woolworths.scanlibrary.analytics.AnalyticsAggregationProvider;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideAggregatedAnalyticsFactory implements Factory<AnalyticsProvider> {
    public static AnalyticsAggregationProvider a(ScanNGoModule scanNGoModule, Context context) {
        scanNGoModule.getClass();
        Intrinsics.h(context, "context");
        return new AnalyticsAggregationProvider(context);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
