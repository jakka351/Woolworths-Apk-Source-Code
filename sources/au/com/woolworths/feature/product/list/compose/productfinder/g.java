package au.com.woolworths.feature.product.list.compose.productfinder;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.product.list.ComposeProductListActivity$initUi$1;
import au.com.woolworths.feature.product.list.ComposeProductListActivityContract;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.product.list.compose.productsearch.SearchRowSectionKt;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity$initUi$1;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityContract;
import au.com.woolworths.feature.product.list.legacy.ProductListFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.AlertDialogUiKt;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsCtaViewState;
import au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt;
import au.com.woolworths.feature.shared.force.upgrade.UpdateDialogType;
import au.com.woolworths.feature.shared.force.upgrade.ui.UpdateDialogKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerConsent;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.FoodTrackerConsentFormKt;
import au.com.woolworths.feature.shop.inbox.InboxViewModel;
import au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveVoiceSearchLottieKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.OliveVoiceSearchLottiePhase;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.PermissionRationaleContentKt;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerConfig;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.StandardPopUpUiKt;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt;
import au.com.woolworths.shop.lists.ui.snapalist.dialog.DialogType;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorScreenKt;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt;
import au.com.woolworths.shop.specials.ui.HorizontalListKt;
import com.google.accompanist.permissions.PermissionState;
import com.halilibo.richtext.ui.RichTextThemeProviderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductListScreenKt.b((ProductListFragment.Extras) this.e, (FragmentManager) this.f, (FrameLayout) this.g, (ComposeProductListActivity$initUi$1.AnonymousClass1.C00991.AnonymousClass3.C01001) this.h, (ComposeProductListActivityContract.ViewState) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                SearchRowSectionKt.d((Function0) this.e, (Function0) this.f, (Function0) this.g, (Function1) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(3511));
                break;
            case 2:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductListScreenKt.b((ProductListFragment.Extras) this.e, (FragmentManager) this.f, (FrameLayout) this.g, (ComposeProductListActivity$initUi$1.AnonymousClass1.C01051.AnonymousClass3.C01061) this.h, (ComposeProductListActivityContract.ViewState) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AlertDialogUiKt.a((String) this.e, (String) this.f, (ContentCta) this.g, (ContentCta) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                RewardsOfferDetailsScreenLegacyKt.d((String) this.e, (RewardsOfferData) this.f, (OfferDetailsCtaViewState) this.g, (Function0) this.h, (Function2) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                UpdateDialogKt.a((UpdateDialogType) this.e, (Function2) this.f, (Function2) this.g, (Function2) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                FoodTrackerConsentFormKt.a((FoodTrackerConsent) this.e, (StatefulButtonState) this.f, (Function0) this.g, (Function0) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                InboxScreenKt.c((InboxViewModel) this.e, (Function2) this.f, (Function0) this.g, (Function0) this.h, (String) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                FreshMagHomeScreenKt.a((FreshMagHomeData) this.e, (Function1) this.f, (Function2) this.g, (Function1) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                VocSurveyCardKt.f((VocContract.ViewState) this.e, (Function0) this.f, (Function1) this.g, (Function0) this.h, (Function3) this.i, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 10:
                ((Integer) obj2).getClass();
                RewardsOfferTileKt.a((RewardsOfferData) this.e, (StatefulButtonState) this.f, (Function2) this.g, (Modifier) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                OliveVoiceSearchLottieKt.a((OliveVoiceSearchLottiePhase) this.e, (Function0) this.f, (Function0) this.g, (Function0) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(3505));
                break;
            case 12:
                ((Integer) obj2).getClass();
                PermissionRationaleContentKt.a((PaddingValues) this.e, (PermissionState) this.f, (Function0) this.g, (Function1) this.h, (Function2) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                VideoAdPlayerKt.a((ExoPlayer) this.e, (Context) this.f, (Player.Listener) this.g, (Modifier) this.h, (VideoAdPlayerConfig) this.i, (Composer) obj, RecomposeScopeImplKt.a(3073));
                break;
            case 14:
                ((Integer) obj2).getClass();
                StandardPopUpUiKt.a((StandardCampaignContent) this.e, (Function1) this.f, (Function0) this.g, (Function0) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                FulfilmentFeesBottomSheetKt.d((FulfilmentExtraInfo) this.e, (Function0) this.f, (au.com.woolworths.shop.checkout.ui.fulfilmentwindows.a) this.g, (Function1) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ProcessorScreenKt.a((DialogType) this.e, (Function1) this.f, (Function1) this.g, (Function0) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(433));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ProductDetailsScreenKt.h((ProductDetailsRowLink) this.e, (Function1) this.f, (Function1) this.g, (Function0) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                HorizontalListKt.a((HorizontalListData) this.e, (LazyListState) this.f, (Function2) this.g, (Function1) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                RichTextThemeProviderKt.a((Function2) this.e, (Function4) this.f, (Function2) this.g, (Function4) this.h, (ComposableLambdaImpl) this.i, (Composer) obj, RecomposeScopeImplKt.a(27697));
                break;
        }
        return Unit.f24250a;
    }
}
