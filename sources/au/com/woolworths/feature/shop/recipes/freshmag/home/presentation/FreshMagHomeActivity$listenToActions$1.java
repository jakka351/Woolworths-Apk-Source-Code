package au.com.woolworths.feature.shop.recipes.freshmag.home.presentation;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity$listenToActions$1", f = "FreshMagHomeActivity.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FreshMagHomeActivity$listenToActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FreshMagHomeActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity$listenToActions$1$1", f = "FreshMagHomeActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity$listenToActions$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<FreshMagHomeContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ FreshMagHomeActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FreshMagHomeActivity freshMagHomeActivity, Continuation continuation) {
            super(2, continuation);
            this.q = freshMagHomeActivity;
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
            int i = FreshMagHomeActivity.C;
            boolean z = actions instanceof FreshMagHomeContract.Actions.LaunchRecipeDetails;
            FreshMagHomeActivity freshMagHomeActivity = this.q;
            if (z) {
                freshMagHomeActivity.startActivity(Activities.RecipeDetails.b(((FreshMagHomeContract.Actions.LaunchRecipeDetails) actions).f8061a));
            } else if (actions instanceof FreshMagHomeContract.Actions.LaunchDeepLink) {
                freshMagHomeActivity.startActivity(ShopAppDeepLink.a(RecipesScreens.d, ((FreshMagHomeContract.Actions.LaunchDeepLink) actions).f8059a));
            } else if (actions instanceof FreshMagHomeContract.Actions.LaunchFreshMagContent) {
                String str = ((FreshMagHomeContract.Actions.LaunchFreshMagContent) actions).f8060a;
                int i2 = FreshMagContentActivity.D;
                FreshMagContentActivity.Companion.a(freshMagHomeActivity, str);
            } else {
                if (!(actions instanceof FreshMagHomeContract.Actions.LaunchCart)) {
                    throw new NoWhenBranchMatchedException();
                }
                freshMagHomeActivity.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshMagHomeActivity$listenToActions$1(FreshMagHomeActivity freshMagHomeActivity, Continuation continuation) {
        super(2, continuation);
        this.q = freshMagHomeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshMagHomeActivity$listenToActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshMagHomeActivity$listenToActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = FreshMagHomeActivity.C;
            FreshMagHomeActivity freshMagHomeActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(freshMagHomeActivity, null), FlowExtKt.a(freshMagHomeActivity.O4().m, freshMagHomeActivity.getD(), Lifecycle.State.h));
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
