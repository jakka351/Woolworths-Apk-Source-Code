package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductFinderScreenKt$lambda$1334362063$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductFinderContract.LocationServicesUnavailableState locationServicesUnavailableState = ProductFinderContract.LocationServicesUnavailableState.d;
            ProductFinderScreenKt.c(new ProductFinderContract.ViewState(CollectionsKt.R("bread", "bananas", "oranges", "pears", "mangoes"), CollectionsKt.R("toothpaste", "toilet paper", "kiwi", "grapes", "blueberries", "apricots", "peaches", "peaches", "peaches", "peaches", "peaches", "peaches", "peaches"), 3), EmptyCallbacks.d, composer, 48);
        }
        return Unit.f24250a;
    }
}
