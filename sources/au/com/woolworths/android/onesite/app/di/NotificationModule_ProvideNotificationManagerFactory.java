package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.network.ApiService;
import au.com.woolworths.android.onesite.notification.WowNotificationManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class NotificationModule_ProvideNotificationManagerFactory implements Factory<WowNotificationManager> {
    public static WowNotificationManager a(NotificationModule notificationModule, ApiService apiService) {
        notificationModule.getClass();
        Intrinsics.h(apiService, "apiService");
        WowNotificationManager wowNotificationManager = new WowNotificationManager();
        wowNotificationManager.f4582a = apiService;
        wowNotificationManager.b = new WeakHashMap();
        wowNotificationManager.c = new HashMap();
        return wowNotificationManager;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
