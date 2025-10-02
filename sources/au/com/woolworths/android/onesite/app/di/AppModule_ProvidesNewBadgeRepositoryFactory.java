package au.com.woolworths.android.onesite.app.di;

import android.content.SharedPreferences;
import au.com.woolworths.feature.shop.more.newbadge.NewBadgeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvidesNewBadgeRepositoryFactory implements Factory<NewBadgeRepository> {
    public static NewBadgeRepository a(AppModule appModule, SharedPreferences sharedPreferences) {
        appModule.getClass();
        return new NewBadgeRepository(sharedPreferences);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
