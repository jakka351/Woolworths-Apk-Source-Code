package au.com.woolworths.android.onesite.di;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BaseDataModule_ProvidesBuyAgainSharedPrefsFactory implements Factory<SharedPreferences> {
    public static SharedPreferences a(BaseDataModule baseDataModule, Application application) {
        baseDataModule.getClass();
        return androidx.constraintlayout.core.state.a.b(application.getPackageName(), ".buy.again", application, 0, "getSharedPreferences(...)");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
