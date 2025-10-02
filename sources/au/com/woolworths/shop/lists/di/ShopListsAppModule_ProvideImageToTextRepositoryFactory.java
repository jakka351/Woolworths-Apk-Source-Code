package au.com.woolworths.shop.lists.di;

import au.com.woolworths.shop.lists.network.ApigeeXApi;
import au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsAppModule_ProvideImageToTextRepositoryFactory implements Factory<ImageToTextRepository> {
    public static ImageToTextRepository a(ShopListsAppModule shopListsAppModule, ApigeeXApi apigeeXApi) {
        shopListsAppModule.getClass();
        Intrinsics.h(apigeeXApi, "apigeeXApi");
        return new ImageToTextRepository(apigeeXApi);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
