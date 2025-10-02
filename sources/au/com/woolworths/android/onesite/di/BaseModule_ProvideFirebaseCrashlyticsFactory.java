package au.com.woolworths.android.onesite.di;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideFirebaseCrashlyticsFactory implements Factory<FirebaseCrashlytics> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
    }

    public static FirebaseCrashlytics a() {
        return FirebaseCrashlyticsKt.a();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return FirebaseCrashlyticsKt.a();
    }
}
