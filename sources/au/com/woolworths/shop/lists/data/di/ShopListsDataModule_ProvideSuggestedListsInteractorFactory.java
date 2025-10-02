package au.com.woolworths.shop.lists.data.di;

import au.com.woolworths.shop.lists.data.SuggestedListsInteractor;
import au.com.woolworths.shop.lists.data.repository.SuggestedListsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsDataModule_ProvideSuggestedListsInteractorFactory implements Factory<SuggestedListsInteractor> {
    public static SuggestedListsInteractor a(ShopListsDataModule shopListsDataModule, SuggestedListsRepository repository) {
        Intrinsics.h(repository, "repository");
        return new SuggestedListsInteractor(repository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
