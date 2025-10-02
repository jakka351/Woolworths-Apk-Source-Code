package au.com.woolworths.feature.shop.recipes.freshmag.home.ui;

import android.app.Activity;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelperKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeContract;
import au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt$FreshMagHomeScreen$3$1", f = "FreshMagHomeScreen.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FreshMagHomeScreenKt$FreshMagHomeScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FreshMagHomeViewModel q;
    public final /* synthetic */ Activity r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt$FreshMagHomeScreen$3$1$1", f = "FreshMagHomeScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt$FreshMagHomeScreen$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<FreshMagHomeContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ Activity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, Continuation continuation) {
            super(2, continuation);
            this.q = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((FreshMagHomeContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            FreshMagHomeContract.Actions actions = (FreshMagHomeContract.Actions) this.p;
            boolean z = actions instanceof FreshMagHomeContract.Actions.LaunchRecipeDetails;
            Activity activity = this.q;
            if (z) {
                activity.startActivity(Activities.RecipeDetails.b(((FreshMagHomeContract.Actions.LaunchRecipeDetails) actions).f8061a));
            } else if (actions instanceof FreshMagHomeContract.Actions.LaunchDeepLink) {
                String str = ((FreshMagHomeContract.Actions.LaunchDeepLink) actions).f8059a;
                RecipesScreens recipesScreens = RecipesScreens.d;
                if (SupportedLinksHelperKt.a(str)) {
                    activity.startActivity(ShopAppDeepLink.a(recipesScreens, str));
                }
            } else if (actions instanceof FreshMagHomeContract.Actions.LaunchFreshMagContent) {
                String str2 = ((FreshMagHomeContract.Actions.LaunchFreshMagContent) actions).f8060a;
                int i = FreshMagContentActivity.D;
                FreshMagContentActivity.Companion.a(activity, str2);
            } else {
                if (!(actions instanceof FreshMagHomeContract.Actions.LaunchCart)) {
                    throw new NoWhenBranchMatchedException();
                }
                activity.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshMagHomeScreenKt$FreshMagHomeScreen$3$1(FreshMagHomeViewModel freshMagHomeViewModel, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.q = freshMagHomeViewModel;
        this.r = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshMagHomeScreenKt$FreshMagHomeScreen$3$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshMagHomeScreenKt$FreshMagHomeScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.m;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, null);
            this.p = 1;
            if (FlowKt.h(flow, anonymousClass1, this) == coroutineSingletons) {
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
