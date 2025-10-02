package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f14484a;

    public EventStoreModule_PackageNameFactory(Provider provider) {
        this.f14484a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String packageName = ((Context) this.f14484a.get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
