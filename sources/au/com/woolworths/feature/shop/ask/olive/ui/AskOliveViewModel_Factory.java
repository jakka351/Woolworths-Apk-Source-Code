package au.com.woolworths.feature.shop.ask.olive.ui;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor;
import au.com.woolworths.feature.shop.ask.olive.ui.link.OliveLinkDelegate;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AskOliveViewModel_Factory implements Factory<AskOliveViewModel> {
    public static AskOliveViewModel a(AppConfig appConfig, ShopAccountInteractor shopAccountInteractor, OliveLinkDelegate oliveLinkDelegate, ConnectionManager connectionManager, FetchChatbotFeedInteractor fetchChatbotFeedInteractor, FeatureToggleManager featureToggleManager, ShopAppTokenAuthenticator shopAppTokenAuthenticator, DispatcherProvider dispatcherProvider, CartUpdateInteractor cartUpdateInteractor) {
        return new AskOliveViewModel(appConfig, shopAccountInteractor, oliveLinkDelegate, connectionManager, fetchChatbotFeedInteractor, featureToggleManager, shopAppTokenAuthenticator, dispatcherProvider, cartUpdateInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
