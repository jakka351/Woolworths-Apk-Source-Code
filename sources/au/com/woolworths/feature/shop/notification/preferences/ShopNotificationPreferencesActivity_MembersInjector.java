package au.com.woolworths.feature.shop.notification.preferences;

import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesCommInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShopNotificationPreferencesActivity_MembersInjector implements MembersInjector<ShopNotificationPreferencesActivity> {
    public static void a(ShopNotificationPreferencesActivity shopNotificationPreferencesActivity, PreferencesCommInteractor preferencesCommInteractor) {
        shopNotificationPreferencesActivity.x = preferencesCommInteractor;
    }
}
