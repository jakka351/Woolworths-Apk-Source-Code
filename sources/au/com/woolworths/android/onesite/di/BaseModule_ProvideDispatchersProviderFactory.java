package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.coroutineutils.AndroidDispatcherProvider;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideDispatchersProviderFactory implements Factory<DispatcherProvider> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AndroidDispatcherProvider();
    }
}
