package au.com.woolworths.shop.cart.di;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import au.com.woolworths.shop.cart.ShopCartFeature;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import kotlin.collections.CollectionsKt;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopCartAppModule_ProvideCartFeaturesFactory implements Factory<Set<Feature>> {

    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return CollectionsKt.L0(ShopCartFeature.k);
    }
}
