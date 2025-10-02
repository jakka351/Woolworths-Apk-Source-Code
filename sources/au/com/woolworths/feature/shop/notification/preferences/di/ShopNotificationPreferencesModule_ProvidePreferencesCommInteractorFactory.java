package au.com.woolworths.feature.shop.notification.preferences.di;

import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesCommInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShopNotificationPreferencesModule_ProvidePreferencesCommInteractorFactory implements Factory<PreferencesCommInteractor> {
    public static PreferencesCommInteractor a(ShopNotificationPreferencesModule shopNotificationPreferencesModule) {
        shopNotificationPreferencesModule.getClass();
        return new PreferencesCommInteractor();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
