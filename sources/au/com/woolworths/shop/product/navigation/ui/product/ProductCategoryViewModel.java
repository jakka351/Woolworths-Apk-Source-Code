package au.com.woolworths.shop.product.navigation.ui.product;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler;
import au.com.woolworths.foundation.shop.storelocator.LegacyStoreLocatorInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePromptClickHandler;", "Companion", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCategoryViewModel extends ViewModel implements InstorePresencePromptClickHandler {
    public final AnalyticsManager e;
    public final InstorePresenceInteractor f;
    public final LegacyStoreLocatorInteractorImpl g;
    public final PublishSubject h;
    public final PublishSubject i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryViewModel$Companion;", "", "", "EVENT_FIRE_DELAY_MS", "J", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductCategoryViewModel(AnalyticsManager analyticsManager, InstorePresenceInteractor instorePresenceInteractor, LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(instorePresenceInteractor, "instorePresenceInteractor");
        this.e = analyticsManager;
        this.f = instorePresenceInteractor;
        this.g = legacyStoreLocatorInteractorImpl;
        PublishSubject publishSubject = new PublishSubject();
        this.h = publishSubject;
        this.i = publishSubject;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    /* renamed from: L5, reason: from getter */
    public final InstorePresenceInteractor getF() {
        return this.f;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    /* renamed from: c, reason: from getter */
    public final AnalyticsManager getE() {
        return this.e;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final LegacyStoreLocatorInteractor e3() {
        return this.g;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final Screen f() {
        return Screens.u;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final CloseableCoroutineScope s0() {
        return ViewModelKt.a(this);
    }
}
