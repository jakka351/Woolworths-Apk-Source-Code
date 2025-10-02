package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.rxutils.AndroidSchedulersProvider;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideSchedulerProviderFactory implements Factory<SchedulersProvider> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AndroidSchedulersProvider();
    }
}
