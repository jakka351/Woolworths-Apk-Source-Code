package au.com.woolworths.feature.shop.shippingcalculator.di;

import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorInteractor;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorInteractorImpl;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShippingCalculatorAppModule_ProvidesShippingCalculatorInteractorFactory implements Factory<ShippingCalculatorInteractor> {
    public static ShippingCalculatorInteractorImpl a(ShippingCalculatorAppModule shippingCalculatorAppModule, ShippingCalculatorRepository shippingCalculatorRepository) {
        shippingCalculatorAppModule.getClass();
        return new ShippingCalculatorInteractorImpl(shippingCalculatorRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
