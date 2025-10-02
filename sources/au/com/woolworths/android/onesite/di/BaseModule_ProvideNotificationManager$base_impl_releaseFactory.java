package au.com.woolworths.android.onesite.di;

import android.app.Application;
import au.com.woolworths.android.onesite.utils.NotificationManager;
import au.com.woolworths.android.onesite.utils.NotificationManagerCompatImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BaseModule_ProvideNotificationManager$base_impl_releaseFactory implements Factory<NotificationManager> {
    public static NotificationManagerCompatImpl a(Application application) {
        return new NotificationManagerCompatImpl(application);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
