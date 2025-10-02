package au.com.woolworths.dynamic.page.di;

import au.com.woolworths.dynamic.page.interactor.DynamicPageInteractor;
import au.com.woolworths.dynamic.page.interactor.DynamicPageInteractorImpl;
import au.com.woolworths.dynamic.page.interactor.DynamicPageRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DynamicPageModule_ProvideDynamicPageInteractor$dynamic_page_releaseFactory implements Factory<DynamicPageInteractor> {
    public static DynamicPageInteractorImpl a(DynamicPageModule dynamicPageModule, DynamicPageRepository dynamicPageRepository) {
        return new DynamicPageInteractorImpl(dynamicPageRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
