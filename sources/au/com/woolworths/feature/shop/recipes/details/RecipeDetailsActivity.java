package au.com.woolworths.feature.shop.recipes.details;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.haptic.HapticExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipesDetailsScreens;
import au.com.woolworths.feature.shop.recipes.details.data.IngredientsSectionData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeServesData;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsPageKt;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import com.salesforce.marketingcloud.UrlHandler;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Companion", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeDetailsActivity extends Hilt_RecipeDetailsActivity {
    public static final /* synthetic */ int B = 0;
    public final ActivityResultLauncher A;
    public FeatureToggleManager w;
    public AnalyticsManager x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(RecipeDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsActivity$Companion;", "", "", "SHARE_LINK_INTENT_TYPE", "Ljava/lang/String;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity$onCreate$2", f = "RecipeDetailsActivity.kt", l = {114}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity$onCreate$2$1", f = "RecipeDetailsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity$onCreate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<RecipeDetailsContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ RecipeDetailsActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecipeDetailsActivity recipeDetailsActivity, Continuation continuation) {
                super(2, continuation);
                this.q = recipeDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((RecipeDetailsContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                RecipeServesData recipeServesData;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                RecipeDetailsContract.Actions actions = (RecipeDetailsContract.Actions) this.p;
                int i = RecipeDetailsActivity.B;
                boolean z = actions instanceof RecipeDetailsContract.Actions.ShareRecipe;
                RecipeDetailsActivity recipeDetailsActivity = this.q;
                if (z) {
                    String str = ((RecipeDetailsContract.Actions.ShareRecipe) actions).f8010a;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    recipeDetailsActivity.startActivity(Intent.createChooser(intent, str));
                } else if (actions instanceof RecipeDetailsContract.Actions.LaunchLogin) {
                    recipeDetailsActivity.A.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                } else if (actions instanceof RecipeDetailsContract.Actions.PerformSuccessHaptic) {
                    HapticExtKt.c(recipeDetailsActivity);
                } else if (actions instanceof RecipeDetailsContract.Actions.LaunchDeepLink) {
                    recipeDetailsActivity.startActivity(ShopAppDeepLink.a(RecipesDetailsScreens.d, ((RecipeDetailsContract.Actions.LaunchDeepLink) actions).f8003a));
                } else if (actions instanceof RecipeDetailsContract.Actions.HandleBannerClick) {
                    recipeDetailsActivity.startActivity(ShopAppDeepLink.a(Screens.u, ((RecipeDetailsContract.Actions.HandleBannerClick) actions).f8002a));
                } else {
                    boolean z2 = actions instanceof RecipeDetailsContract.Actions.LaunchProductListProductGroup;
                    Activities.ProductList productList = Activities.ProductList.f4505a;
                    if (z2) {
                        RecipeDetailsContract.Actions.LaunchProductListProductGroup launchProductListProductGroup = (RecipeDetailsContract.Actions.LaunchProductListProductGroup) actions;
                        String str2 = launchProductListProductGroup.f8006a;
                        String str3 = launchProductListProductGroup.b;
                        Intent intentA = ActivityNavigatorKt.a(productList, ApplicationType.e);
                        if (str3 == null) {
                            str3 = "";
                        }
                        Activities.ProductList.ExtrasPageData extrasPageData = new Activities.ProductList.ExtrasPageData(str3, null);
                        Activities.ProductList.ProductListType productListType = Activities.ProductList.ProductListType.x;
                        intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(extrasPageData, new Activities.ProductList.ExtrasByProductGroup(str2, productListType.d, null, productListType), (Activities.ProductList.ExtrasConfig) null, 4));
                        recipeDetailsActivity.startActivity(intentA);
                    } else if (actions instanceof RecipeDetailsContract.Actions.LaunchRecipeDetails) {
                        recipeDetailsActivity.startActivity(Activities.RecipeDetails.b(((RecipeDetailsContract.Actions.LaunchRecipeDetails) actions).f8007a));
                    } else if (actions instanceof RecipeDetailsContract.Actions.LaunchShop) {
                        RecipeDetailData recipeDetailData = ((RecipeDetailsContract.Actions.LaunchShop) actions).f8008a;
                        Intent intentA2 = ActivityNavigatorKt.a(productList, ApplicationType.e);
                        String string = recipeDetailsActivity.getString(com.woolworths.R.string.shop_ingredient_product_list_title);
                        Intrinsics.g(string, "getString(...)");
                        Activities.ProductList.ExtrasPageData extrasPageData2 = new Activities.ProductList.ExtrasPageData(string, recipeDetailData.c);
                        String str4 = recipeDetailData.f8018a;
                        String str5 = recipeDetailData.c;
                        String str6 = recipeDetailData.m;
                        List list = recipeDetailData.n;
                        IngredientsSectionData ingredientsSectionData = recipeDetailData.h;
                        intentA2.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(extrasPageData2, new Activities.ProductList.ExtrasByRecipe(str4, str5, str6, list, (ingredientsSectionData == null || (recipeServesData = ingredientsSectionData.f8017a) == null) ? null : Integer.valueOf(recipeServesData.f8022a), Activities.ProductList.ProductListType.C), (Activities.ProductList.ExtrasConfig) null, 12));
                        recipeDetailsActivity.startActivity(intentA2);
                    } else {
                        if (!(actions instanceof RecipeDetailsContract.Actions.LaunchFullPageVideoPlayer)) {
                            if (actions == null) {
                                throw new IllegalStateException("No action should mean no button, so what did we click?");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        RecipeDetailsContract.Actions.LaunchFullPageVideoPlayer launchFullPageVideoPlayer = (RecipeDetailsContract.Actions.LaunchFullPageVideoPlayer) actions;
                        VideoData videoData = launchFullPageVideoPlayer.f8004a;
                        ActivityResultLauncher activityResultLauncher = recipeDetailsActivity.z;
                        Intent intentPutExtra = ActivityNavigatorKt.a(Activities.FullPageVideoPlayerActivity.f4477a, ApplicationType.e).putExtra("FullPageVideo", new Activities.FullPageVideoPlayerActivity.Extras(launchFullPageVideoPlayer.b, videoData.getUrl(), videoData.getTitle(), videoData.getThumbnail(), videoData.getDuration(), videoData.getId()));
                        Intrinsics.g(intentPutExtra, "putExtra(...)");
                        activityResultLauncher.a(intentPutExtra, null);
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RecipeDetailsActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = RecipeDetailsActivity.B;
                RecipeDetailsActivity recipeDetailsActivity = RecipeDetailsActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(recipeDetailsActivity, null), FlowExtKt.a(recipeDetailsActivity.O4().o, recipeDetailsActivity.getD(), Lifecycle.State.h));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    public RecipeDetailsActivity() {
        final int i = 0;
        this.z = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.recipes.details.a
            public final /* synthetic */ RecipeDetailsActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                Activities.FullPageVideoPlayerActivity.Result result;
                int i2 = i;
                RecipeDetailsActivity recipeDetailsActivity = this.e;
                ActivityResult result2 = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        int i3 = RecipeDetailsActivity.B;
                        Intrinsics.h(result2, "result");
                        if (result2.d == -1 && (intent = result2.e) != null && (result = (Activities.FullPageVideoPlayerActivity.Result) intent.getParcelableExtra("RESULT_KEY")) != null) {
                            RecipeDetailsViewModel.w6(recipeDetailsActivity.O4(), null, null, null, null, result.e, 31);
                            String str = result.f;
                            if (str != null) {
                                recipeDetailsActivity.O4().x6(str, true);
                                break;
                            }
                        }
                        break;
                    default:
                        int i4 = RecipeDetailsActivity.B;
                        Intrinsics.h(result2, "it");
                        if (result2.d == -1) {
                            recipeDetailsActivity.O4().u6();
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.A = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.recipes.details.a
            public final /* synthetic */ RecipeDetailsActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                Activities.FullPageVideoPlayerActivity.Result result;
                int i22 = i2;
                RecipeDetailsActivity recipeDetailsActivity = this.e;
                ActivityResult result2 = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i3 = RecipeDetailsActivity.B;
                        Intrinsics.h(result2, "result");
                        if (result2.d == -1 && (intent = result2.e) != null && (result = (Activities.FullPageVideoPlayerActivity.Result) intent.getParcelableExtra("RESULT_KEY")) != null) {
                            RecipeDetailsViewModel.w6(recipeDetailsActivity.O4(), null, null, null, null, result.e, 31);
                            String str = result.f;
                            if (str != null) {
                                recipeDetailsActivity.O4().x6(str, true);
                                break;
                            }
                        }
                        break;
                    default:
                        int i4 = RecipeDetailsActivity.B;
                        Intrinsics.h(result2, "it");
                        if (result2.d == -1) {
                            recipeDetailsActivity.O4().u6();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static final void N4(RecipeDetailsActivity recipeDetailsActivity) throws Resources.NotFoundException {
        RecipeDetailsViewModel recipeDetailsViewModelO4 = recipeDetailsActivity.O4();
        au.com.woolworths.feature.shop.instore.navigation.map.utils.a aVar = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(recipeDetailsActivity, 8);
        RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) recipeDetailsViewModelO4.k.e();
        if ((viewState != null ? viewState.c : null) != RecipeDetailsFullPageErrorState.f) {
            aVar.invoke(Boolean.TRUE);
        } else {
            RecipeDetailsViewModel.w6(recipeDetailsViewModelO4, null, null, null, null, 0L, 59);
            aVar.invoke(Boolean.FALSE);
        }
    }

    public final RecipeDetailsViewModel O4() {
        return (RecipeDetailsViewModel) this.y.getD();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8888) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            O4().u6();
        }
    }

    @Override // au.com.woolworths.feature.shop.recipes.details.Hilt_RecipeDetailsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("EXTRA_RECIPE_ID");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Recipe details requires Recipe Id");
        }
        O4().m = stringExtra;
        WindowCompat.b(getWindow(), false);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RecipeDetailsActivity recipeDetailsActivity = RecipeDetailsActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-282824402, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            MutableState mutableState;
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = RecipeDetailsActivity.B;
                                final RecipeDetailsActivity recipeDetailsActivity2 = recipeDetailsActivity;
                                MutableState mutableStateB = LiveDataAdapterKt.b(recipeDetailsActivity2.O4().k, RecipeDetailsContract.ViewState.g, composer2);
                                RecipeDetailsViewModel recipeDetailsViewModelO4 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(recipeDetailsViewModelO4);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    RecipeDetailsActivity$onCreate$1$1$1$1 recipeDetailsActivity$onCreate$1$1$1$1 = new RecipeDetailsActivity$onCreate$1$1$1$1(0, recipeDetailsViewModelO4, RecipeDetailsViewModel.class, "onSaveToggleClicked", "onSaveToggleClicked()V", 0);
                                    composer2.A(recipeDetailsActivity$onCreate$1$1$1$1);
                                    objG = recipeDetailsActivity$onCreate$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO42 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(recipeDetailsViewModelO42);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    RecipeDetailsActivity$onCreate$1$1$2$1 recipeDetailsActivity$onCreate$1$1$2$1 = new RecipeDetailsActivity$onCreate$1$1$2$1(1, recipeDetailsViewModelO42, RecipeDetailsViewModel.class, "onShareClicked", "onShareClicked(Ljava/lang/String;)V", 0);
                                    composer2.A(recipeDetailsActivity$onCreate$1$1$2$1);
                                    objG2 = recipeDetailsActivity$onCreate$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO43 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(recipeDetailsViewModelO43);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    RecipeDetailsActivity$onCreate$1$1$3$1 recipeDetailsActivity$onCreate$1$1$3$1 = new RecipeDetailsActivity$onCreate$1$1$3$1(1, recipeDetailsViewModelO43, RecipeDetailsViewModel.class, "onServesQuantityIncreased", "onServesQuantityIncreased(I)V", 0);
                                    composer2.A(recipeDetailsActivity$onCreate$1$1$3$1);
                                    objG3 = recipeDetailsActivity$onCreate$1$1$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG3;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO44 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(recipeDetailsViewModelO44);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    RecipeDetailsActivity$onCreate$1$1$4$1 recipeDetailsActivity$onCreate$1$1$4$1 = new RecipeDetailsActivity$onCreate$1$1$4$1(1, recipeDetailsViewModelO44, RecipeDetailsViewModel.class, "onServesQuantityDecreased", "onServesQuantityDecreased(I)V", 0);
                                    composer2.A(recipeDetailsActivity$onCreate$1$1$4$1);
                                    objG4 = recipeDetailsActivity$onCreate$1$1$4$1;
                                }
                                KFunction kFunction4 = (KFunction) objG4;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO45 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(recipeDetailsViewModelO45);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    RecipeDetailsActivity$onCreate$1$1$5$1 recipeDetailsActivity$onCreate$1$1$5$1 = new RecipeDetailsActivity$onCreate$1$1$5$1(1, recipeDetailsViewModelO45, RecipeDetailsViewModel.class, "onCostPerServeFaqBannerClicked", "onCostPerServeFaqBannerClicked(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                                    composer2.A(recipeDetailsActivity$onCreate$1$1$5$1);
                                    objG5 = recipeDetailsActivity$onCreate$1$1$5$1;
                                }
                                KFunction kFunction5 = (KFunction) objG5;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO46 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(recipeDetailsViewModelO46);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$1) {
                                    RecipeDetailsActivity$onCreate$1$1$6$1 recipeDetailsActivity$onCreate$1$1$6$1 = new RecipeDetailsActivity$onCreate$1$1$6$1(1, recipeDetailsViewModelO46, RecipeDetailsViewModel.class, "onDynamicSizeCardClicked", "onDynamicSizeCardClicked(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(recipeDetailsActivity$onCreate$1$1$6$1);
                                    objG6 = recipeDetailsActivity$onCreate$1$1$6$1;
                                }
                                KFunction kFunction6 = (KFunction) objG6;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO47 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(recipeDetailsViewModelO47);
                                Object objG7 = composer2.G();
                                if (zI7 || objG7 == composer$Companion$Empty$1) {
                                    objG7 = new RecipeDetailsActivity$onCreate$1$1$7$1(1, recipeDetailsViewModelO47, RecipeDetailsViewModel.class, "onDynamicSizeCardImpression", "onDynamicSizeCardImpression(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(objG7);
                                }
                                KFunction kFunction7 = (KFunction) objG7;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO48 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI8 = composer2.I(recipeDetailsViewModelO48);
                                Object objG8 = composer2.G();
                                if (zI8 || objG8 == composer$Companion$Empty$1) {
                                    RecipeDetailsActivity$onCreate$1$1$8$1 recipeDetailsActivity$onCreate$1$1$8$1 = new RecipeDetailsActivity$onCreate$1$1$8$1(2, recipeDetailsViewModelO48, RecipeDetailsViewModel.class, "onHorizontalListItemClick", "onHorizontalListItemClick(Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;Ljava/lang/Object;)V", 0);
                                    composer2.A(recipeDetailsActivity$onCreate$1$1$8$1);
                                    objG8 = recipeDetailsActivity$onCreate$1$1$8$1;
                                }
                                KFunction kFunction8 = (KFunction) objG8;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO49 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI9 = composer2.I(recipeDetailsViewModelO49);
                                Object objG9 = composer2.G();
                                if (zI9 || objG9 == composer$Companion$Empty$1) {
                                    objG9 = new RecipeDetailsActivity$onCreate$1$1$9$1(1, recipeDetailsViewModelO49, RecipeDetailsViewModel.class, "onHorizontalListActionClicked", "onHorizontalListActionClicked(Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;)V", 0);
                                    composer2.A(objG9);
                                }
                                KFunction kFunction9 = (KFunction) objG9;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO410 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI10 = composer2.I(recipeDetailsViewModelO410);
                                Object objG10 = composer2.G();
                                if (zI10 || objG10 == composer$Companion$Empty$1) {
                                    objG10 = new RecipeDetailsActivity$onCreate$1$1$10$1(0, recipeDetailsViewModelO410, RecipeDetailsViewModel.class, "onShopClicked", "onShopClicked()V", 0);
                                    composer2.A(objG10);
                                }
                                KFunction kFunction10 = (KFunction) objG10;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO411 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI11 = composer2.I(recipeDetailsViewModelO411);
                                Object objG11 = composer2.G();
                                if (zI11 || objG11 == composer$Companion$Empty$1) {
                                    objG11 = new RecipeDetailsActivity$onCreate$1$1$11$1(0, recipeDetailsViewModelO411, RecipeDetailsViewModel.class, "onVideoPlayClick", "onVideoPlayClick()Ljava/lang/Boolean;", 8);
                                    composer2.A(objG11);
                                }
                                Function0 function0 = (Function0) objG11;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO412 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI12 = composer2.I(recipeDetailsViewModelO412);
                                Object objG12 = composer2.G();
                                if (zI12 || objG12 == composer$Companion$Empty$1) {
                                    objG12 = new RecipeDetailsActivity$onCreate$1$1$12$1(0, recipeDetailsViewModelO412, RecipeDetailsViewModel.class, "onPrimaryActionClicked", "onPrimaryActionClicked()V", 0);
                                    composer2.A(objG12);
                                }
                                KFunction kFunction11 = (KFunction) objG12;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO413 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI13 = composer2.I(recipeDetailsViewModelO413);
                                Object objG13 = composer2.G();
                                if (zI13 || objG13 == composer$Companion$Empty$1) {
                                    objG13 = new RecipeDetailsActivity$onCreate$1$1$13$1(0, recipeDetailsViewModelO413, RecipeDetailsViewModel.class, "onSnackbarShown", "onSnackbarShown()V", 0);
                                    composer2.A(objG13);
                                }
                                KFunction kFunction12 = (KFunction) objG13;
                                composer2.l();
                                RecipeDetailsViewModel recipeDetailsViewModelO414 = recipeDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI14 = composer2.I(recipeDetailsViewModelO414);
                                Object objG14 = composer2.G();
                                if (zI14 || objG14 == composer$Companion$Empty$1) {
                                    objG14 = new RecipeDetailsActivity$onCreate$1$1$14$1(0, recipeDetailsViewModelO414, RecipeDetailsViewModel.class, "fetchRecipeDetails", "fetchRecipeDetails()V", 0);
                                    composer2.A(objG14);
                                }
                                composer2.l();
                                Function0 function02 = (Function0) kFunction;
                                Function1 function1 = (Function1) kFunction2;
                                Function1 function12 = (Function1) kFunction3;
                                Function1 function13 = (Function1) kFunction4;
                                Function1 function14 = (Function1) kFunction5;
                                Function1 function15 = (Function1) kFunction6;
                                Function1 function16 = (Function1) kFunction7;
                                Function0 function03 = (Function0) kFunction10;
                                Function2 function2 = (Function2) kFunction8;
                                Function1 function17 = (Function1) kFunction9;
                                Function0 function04 = (Function0) kFunction11;
                                Function0 function05 = (Function0) kFunction12;
                                Function0 function06 = (Function0) ((KFunction) objG14);
                                composer2.o(5004770);
                                boolean zI15 = composer2.I(recipeDetailsActivity2);
                                Object objG15 = composer2.G();
                                if (zI15 || objG15 == composer$Companion$Empty$1) {
                                    mutableState = mutableStateB;
                                    final int i2 = 0;
                                    objG15 = new Function0() { // from class: au.com.woolworths.feature.shop.recipes.details.b
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() throws Resources.NotFoundException {
                                            switch (i2) {
                                                case 0:
                                                    RecipeDetailsActivity.N4(recipeDetailsActivity2);
                                                    break;
                                                default:
                                                    recipeDetailsActivity2.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG15);
                                } else {
                                    mutableState = mutableStateB;
                                }
                                Function0 function07 = (Function0) objG15;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI16 = composer2.I(recipeDetailsActivity2);
                                Object objG16 = composer2.G();
                                if (zI16 || objG16 == composer$Companion$Empty$1) {
                                    final int i3 = 1;
                                    objG16 = new Function0() { // from class: au.com.woolworths.feature.shop.recipes.details.b
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() throws Resources.NotFoundException {
                                            switch (i3) {
                                                case 0:
                                                    RecipeDetailsActivity.N4(recipeDetailsActivity2);
                                                    break;
                                                default:
                                                    recipeDetailsActivity2.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG16);
                                }
                                composer2.l();
                                RecipeDetailsPageKt.a(mutableState, function02, function1, function12, function13, function14, function15, function16, function03, function2, function17, function0, function04, function05, function06, function07, (Function0) objG16, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 593644262));
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager.a(RecipesDetailsScreens.d);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        O4().u6();
        getF().a(this, new OnBackPressedCallback() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity$onCreate$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void e() throws Resources.NotFoundException {
                RecipeDetailsActivity.N4(this.d);
            }
        });
    }
}
