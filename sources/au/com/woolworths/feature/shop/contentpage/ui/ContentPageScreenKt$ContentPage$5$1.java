package au.com.woolworths.feature.shop.contentpage.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.State;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelperKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.home.model.Validity;
import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.CatalogueCardType;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt$ContentPage$5$1", f = "ContentPageScreen.kt", l = {553}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ContentPageScreenKt$ContentPage$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1 A;
    public int p;
    public final /* synthetic */ Flow q;
    public final /* synthetic */ Activity r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ State t;
    public final /* synthetic */ ManagedActivityResultLauncher u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ ManagedActivityResultLauncher x;
    public final /* synthetic */ ManagedActivityResultLauncher y;
    public final /* synthetic */ Context z;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/contentpage/ContentPageContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt$ContentPage$5$1$1", f = "ContentPageScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt$ContentPage$5$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<ContentPageContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ Activity q;
        public final /* synthetic */ Function2 r;
        public final /* synthetic */ State s;
        public final /* synthetic */ ManagedActivityResultLauncher t;
        public final /* synthetic */ Function2 u;
        public final /* synthetic */ Function1 v;
        public final /* synthetic */ ManagedActivityResultLauncher w;
        public final /* synthetic */ ManagedActivityResultLauncher x;
        public final /* synthetic */ Context y;
        public final /* synthetic */ Function1 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, Function2 function2, State state, ManagedActivityResultLauncher managedActivityResultLauncher, Function2 function22, Function1 function1, ManagedActivityResultLauncher managedActivityResultLauncher2, ManagedActivityResultLauncher managedActivityResultLauncher3, Context context, Function1 function12, Continuation continuation) {
            super(2, continuation);
            this.q = activity;
            this.r = function2;
            this.s = state;
            this.t = managedActivityResultLauncher;
            this.u = function22;
            this.v = function1;
            this.w = managedActivityResultLauncher2;
            this.x = managedActivityResultLauncher3;
            this.y = context;
            this.z = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ContentPageContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ContentPageContract.Actions actions = (ContentPageContract.Actions) this.p;
            boolean z = actions instanceof ContentPageContract.Actions.LaunchWatchlistGuestOnboardingScreen;
            Activity activity = this.q;
            if (z) {
                activity.startActivity(Activities.ShopListGuestOnboardingActivity.f4532a.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
            } else {
                boolean z2 = actions instanceof ContentPageContract.Actions.LaunchAddToCartBottomSheet;
                State state = this.s;
                if (z2) {
                    Function2 function2 = this.r;
                    if (function2 != null) {
                        function2.invoke(((ContentPageContract.ViewState) state.getD()).b, ((ContentPageContract.Actions.LaunchAddToCartBottomSheet) actions).f6961a);
                    }
                } else if (actions instanceof ContentPageContract.Actions.LaunchDeepLink) {
                    String str = ((ContentPageContract.Actions.LaunchDeepLink) actions).f6964a;
                    final String str2 = ((ContentPageContract.ViewState) state.getD()).j;
                    Screen screen = ((ContentPageContract.ViewState) state.getD()).b;
                    if (screen == null) {
                        screen = new Screen() { // from class: au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt$launchDeepLink$intent$1
                            @Override // au.com.woolworths.android.onesite.analytics.Screen
                            /* renamed from: a */
                            public final String getE() {
                                return "Not available";
                            }

                            @Override // au.com.woolworths.android.onesite.analytics.Screen
                            /* renamed from: d */
                            public final String getD() {
                                return YU.a.g(str2, " screen");
                            }
                        };
                    }
                    Intent intentA = ShopAppDeepLink.a(screen, str);
                    if (SupportedLinksHelperKt.a(str)) {
                        activity.startActivity(intentA);
                    }
                } else if (actions instanceof ContentPageContract.Actions.LaunchFullPageVideoPlayer) {
                    ContentPageContract.Actions.LaunchFullPageVideoPlayer launchFullPageVideoPlayer = (ContentPageContract.Actions.LaunchFullPageVideoPlayer) actions;
                    VideoData videoData = launchFullPageVideoPlayer.f6965a;
                    Intent intentPutExtra = ActivityNavigatorKt.a(Activities.FullPageVideoPlayerActivity.f4477a, ApplicationType.e).putExtra("FullPageVideo", new Activities.FullPageVideoPlayerActivity.Extras(launchFullPageVideoPlayer.b, videoData.getUrl(), videoData.getTitle(), videoData.getThumbnail(), videoData.getDuration(), videoData.getId()));
                    Intrinsics.g(intentPutExtra, "putExtra(...)");
                    this.t.a(intentPutExtra, null);
                } else if (actions instanceof ContentPageContract.Actions.LaunchListsBottomSheet) {
                    Function2 function22 = this.u;
                    if (function22 != null) {
                        function22.invoke(((ContentPageContract.ViewState) state.getD()).b, ((ContentPageContract.Actions.LaunchListsBottomSheet) actions).f6966a);
                    }
                } else if (actions instanceof ContentPageContract.Actions.LaunchProductDetails) {
                    this.v.invoke(((ContentPageContract.Actions.LaunchProductDetails) actions).f6968a.getProductId());
                } else {
                    if (actions instanceof ContentPageContract.Actions.LaunchProductListProductGroup) {
                        ContentPageContract.Actions.LaunchProductListProductGroup launchProductListProductGroup = (ContentPageContract.Actions.LaunchProductListProductGroup) actions;
                        String str3 = launchProductListProductGroup.f6969a;
                        String str4 = launchProductListProductGroup.b;
                        Intent intentA2 = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                        Activities.ProductList.ExtrasPageData extrasPageData = new Activities.ProductList.ExtrasPageData(str4 != null ? str4 : "", null);
                        Activities.ProductList.ProductListType productListType = Activities.ProductList.ProductListType.x;
                        intentA2.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(extrasPageData, new Activities.ProductList.ExtrasByProductGroup(str3, productListType.d, null, productListType), (Activities.ProductList.ExtrasConfig) null, 4));
                        activity.startActivity(intentA2);
                    } else if (actions instanceof ContentPageContract.Actions.LaunchRecipeDetails) {
                        this.w.a(Activities.RecipeDetails.b(((ContentPageContract.Actions.LaunchRecipeDetails) actions).f6972a.getId()), null);
                    } else if (actions instanceof ContentPageContract.Actions.SharePage) {
                        String str5 = ((ContentPageContract.Actions.SharePage) actions).f6976a;
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", str5);
                        intent.setType("text/plain");
                        activity.startActivity(Intent.createChooser(intent, str5));
                    } else if (actions instanceof ContentPageContract.Actions.ViewShoppingList) {
                        activity.startActivity(Activities.ShoppingListDetails.f4535a.b(((ContentPageContract.Actions.ViewShoppingList) actions).f6977a, false));
                    } else if (actions instanceof ContentPageContract.Actions.LaunchWebView) {
                        ContentPageContract.Actions.LaunchWebView launchWebView = (ContentPageContract.Actions.LaunchWebView) actions;
                        String str6 = launchWebView.f6974a;
                        String str7 = launchWebView.b;
                        Screens screens = Screens.d;
                        activity.startActivity(Activities.WebViewActivity.f4554a.b(new Activities.WebViewActivity.Extras(52, str7, str6, null)));
                    } else if (actions instanceof ContentPageContract.Actions.ViewWatchlist) {
                        activity.startActivity(Activities.ShoppingListDetails.f4535a.b(((ContentPageContract.Actions.ViewWatchlist) actions).f6978a, false));
                    } else if (Intrinsics.c(actions, ContentPageContract.Actions.LaunchLogin.f6967a)) {
                        this.x.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                    } else if (actions instanceof ContentPageContract.Actions.OpenOliveChat) {
                        activity.startActivity(Activities.AskOliveActivity.b(5, null, ((ContentPageContract.Actions.OpenOliveChat) actions).f6975a, null));
                    } else if (actions instanceof ContentPageContract.Actions.LaunchCatalogueDetails) {
                        CatalogueCard catalogueCard = ((ContentPageContract.Actions.LaunchCatalogueDetails) actions).f6962a;
                        String id = catalogueCard.getId();
                        CatalogueTracking catalogueTracking = new CatalogueTracking(id == null ? "" : id, catalogueCard.d == CatalogueCardType.e ? Validity.e : Validity.d, catalogueCard.f10140a, "", "", "", "", "");
                        int i = CatalogueDetailsActivity.B;
                        String id2 = catalogueCard.getId();
                        CatalogueDetailsActivity.Companion.a(this.y, new CatalogueDetailsActivity.Extra(catalogueTracking, id2 != null ? id2 : ""));
                    } else if (actions instanceof ContentPageContract.Actions.LaunchCatalogueHome) {
                        activity.startActivity(ActivityNavigatorKt.a(Activities.CatalogueHome.f4455a, ApplicationType.e));
                    } else if (actions instanceof ContentPageContract.Actions.LaunchProductOnMap) {
                        this.z.invoke(((ContentPageContract.Actions.LaunchProductOnMap) actions).f6970a);
                    } else {
                        if (!(actions instanceof ContentPageContract.Actions.LaunchPromotionDetails)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ContentPageContract.Actions.LaunchPromotionDetails launchPromotionDetails = (ContentPageContract.Actions.LaunchPromotionDetails) actions;
                        PromotionCard promotionCard = launchPromotionDetails.f6971a;
                        String str8 = launchPromotionDetails.b;
                        String productId = promotionCard.getProductCard().getProductId();
                        String offerId = promotionCard.getOfferId();
                        String source = promotionCard.getProductCard().getSource();
                        Intent intentA3 = ActivityNavigatorKt.a(Activities.CataloguePromotionDetails.f4456a, ApplicationType.e);
                        intentA3.putExtra("extra_promotion_details", new Activities.CataloguePromotionDetails.Extra(productId, offerId, source, str8));
                        activity.startActivity(intentA3);
                    }
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageScreenKt$ContentPage$5$1(Flow flow, Activity activity, Function2 function2, State state, ManagedActivityResultLauncher managedActivityResultLauncher, Function2 function22, Function1 function1, ManagedActivityResultLauncher managedActivityResultLauncher2, ManagedActivityResultLauncher managedActivityResultLauncher3, Context context, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.q = flow;
        this.r = activity;
        this.s = function2;
        this.t = state;
        this.u = managedActivityResultLauncher;
        this.v = function22;
        this.w = function1;
        this.x = managedActivityResultLauncher2;
        this.y = managedActivityResultLauncher3;
        this.z = context;
        this.A = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContentPageScreenKt$ContentPage$5$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentPageScreenKt$ContentPage$5$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, null);
            this.p = 1;
            if (FlowKt.h(this.q, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
