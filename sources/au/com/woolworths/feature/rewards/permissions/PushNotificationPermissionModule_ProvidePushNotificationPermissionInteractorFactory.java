package au.com.woolworths.feature.rewards.permissions;

import android.app.Application;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class PushNotificationPermissionModule_ProvidePushNotificationPermissionInteractorFactory implements Factory<PushNotificationPermissionInteractor> {
    public static PushNotificationPermissionInteractor a(PushNotificationPermissionModule pushNotificationPermissionModule, Application application, DispatcherProvider dispatcherProvider) {
        pushNotificationPermissionModule.getClass();
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new PushNotificationPermissionInteractor(application, dispatcherProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
