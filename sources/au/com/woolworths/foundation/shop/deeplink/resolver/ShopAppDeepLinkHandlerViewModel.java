package au.com.woolworths.foundation.shop.deeplink.resolver;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkContract;
import com.airbnb.deeplinkdispatch.DeepLinkResult;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/deeplink/resolver/ShopAppDeepLinkHandlerViewModel;", "Landroidx/lifecycle/ViewModel;", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopAppDeepLinkHandlerViewModel extends ViewModel {
    public final ShopAppDeepLinkInteractor e;
    public final CollectionModeInteractor f;
    public final FeatureToggleManager g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final SharedFlowImpl j;
    public final Flow k;

    public ShopAppDeepLinkHandlerViewModel(ShopAppDeepLinkInteractor shopAppDeepLinkInteractor, CollectionModeInteractor collectionModeInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = shopAppDeepLinkInteractor;
        this.f = collectionModeInteractor;
        this.g = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ShopAppDeepLinkContract.ViewState.d);
        this.h = mutableStateFlowA;
        this.i = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(1, 1, BufferOverflow.e);
        this.j = sharedFlowImplA;
        this.k = FlowKt.a(sharedFlowImplA);
    }

    public final void p6(DeepLinkResult result, Uri uri, Intent intent) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(result, "result");
        do {
            mutableStateFlow = this.h;
            value = mutableStateFlow.getValue();
            ((ShopAppDeepLinkContract.ViewState) value).getClass();
        } while (!mutableStateFlow.d(value, new ShopAppDeepLinkContract.ViewState(true, null, null)));
        boolean z = result.f13292a;
        SharedFlowImpl sharedFlowImpl = this.j;
        if (z) {
            sharedFlowImpl.f(ShopAppDeepLinkContract.Actions.FinishActivity.f8706a);
            return;
        }
        if (intent != null) {
            sharedFlowImpl.f(new ShopAppDeepLinkContract.Actions.LaunchFallbackDeepLinkIntent(intent));
            return;
        }
        String path = uri != null ? uri.getPath() : null;
        if (!this.g.c(BaseShopAppFeature.f0) || ((path == null || !StringsKt.o(path, "/shop/browse/", false)) && (path == null || !StringsKt.o(path, "shop/search/", false)))) {
            sharedFlowImpl.f(ShopAppDeepLinkContract.Actions.LaunchSplashScreen.f8709a);
        } else {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShopAppDeepLinkHandlerViewModel$resolveUniversalDeeplink$1(this, String.valueOf(uri), null), 3);
        }
    }
}
