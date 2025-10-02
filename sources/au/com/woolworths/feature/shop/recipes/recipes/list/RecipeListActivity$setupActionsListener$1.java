package au.com.woolworths.feature.shop.recipes.recipes.list;

import android.content.Intent;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipesListContract;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity$setupActionsListener$1", f = "RecipeListActivity.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipeListActivity$setupActionsListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RecipeListActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipesListContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity$setupActionsListener$1$1", f = "RecipeListActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity$setupActionsListener$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<RecipesListContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ RecipeListActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RecipeListActivity recipeListActivity, Continuation continuation) {
            super(2, continuation);
            this.q = recipeListActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((RecipesListContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            RecipesListContract.Actions actions = (RecipesListContract.Actions) this.p;
            int i = RecipeListActivity.C;
            boolean z = actions instanceof RecipesListContract.Actions.HandleBannerClick;
            RecipeListActivity recipeListActivity = this.q;
            if (z) {
                recipeListActivity.startActivity(ShopAppDeepLink.a(Screens.u, ((RecipesListContract.Actions.HandleBannerClick) actions).f8077a));
            } else if (actions instanceof RecipesListContract.Actions.LaunchRecipeDetails) {
                recipeListActivity.startActivity(Activities.RecipeDetails.b(((RecipesListContract.Actions.LaunchRecipeDetails) actions).f8079a));
            } else if (actions instanceof RecipesListContract.Actions.LaunchRecipeSearch) {
                Activities.RecipeSearch.Extras extras = new Activities.RecipeSearch.Extras(((RecipesListContract.Actions.LaunchRecipeSearch) actions).f8080a, null, 2);
                Intent intentA = ActivityNavigatorKt.a(Activities.RecipeSearch.f4513a, ApplicationType.e);
                intentA.putExtra("RECIPE_SEARCH_EXTRAS", extras);
                recipeListActivity.startActivity(intentA);
                recipeListActivity.finish();
            } else {
                if (!(actions instanceof RecipesListContract.Actions.LaunchProductListProductGroup)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecipesListContract.Actions.LaunchProductListProductGroup launchProductListProductGroup = (RecipesListContract.Actions.LaunchProductListProductGroup) actions;
                String str = launchProductListProductGroup.f8078a;
                String str2 = launchProductListProductGroup.b;
                Intent intentA2 = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                if (str2 == null) {
                    str2 = "";
                }
                Activities.ProductList.ExtrasPageData extrasPageData = new Activities.ProductList.ExtrasPageData(str2, null);
                Activities.ProductList.ProductListType productListType = Activities.ProductList.ProductListType.x;
                intentA2.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(extrasPageData, new Activities.ProductList.ExtrasByProductGroup(str, productListType.d, null, productListType), (Activities.ProductList.ExtrasConfig) null, 4));
                recipeListActivity.startActivity(intentA2);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeListActivity$setupActionsListener$1(RecipeListActivity recipeListActivity, Continuation continuation) {
        super(2, continuation);
        this.q = recipeListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RecipeListActivity$setupActionsListener$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecipeListActivity$setupActionsListener$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = RecipeListActivity.C;
            RecipeListActivity recipeListActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(recipeListActivity, null), FlowExtKt.a(recipeListActivity.O4().m, recipeListActivity.getD(), Lifecycle.State.h));
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
