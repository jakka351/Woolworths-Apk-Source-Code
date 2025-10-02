package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.feature.shop.more.newbadge.NewBadgeInteractor;
import au.com.woolworths.feature.shop.more.newbadge.NewBadgeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvidesNewBadgeInteractorFactory implements Factory<NewBadgeInteractor> {
    public static NewBadgeInteractor a(AppModule appModule, NewBadgeRepository newBadgeRepository) {
        appModule.getClass();
        return new NewBadgeInteractor(newBadgeRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
