package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import androidx.activity.compose.ManagedActivityResultLauncher;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesScreen$2$1$1", f = "SavedRecipesScreen.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavedRecipesScreenKt$SavedRecipesScreen$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SavedRecipesViewModel q;
    public final /* synthetic */ ManagedActivityResultLauncher r;
    public final /* synthetic */ ManagedActivityResultLauncher s;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesScreen$2$1$1$1", f = "SavedRecipesScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesScreen$2$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<SavedRecipesContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ ManagedActivityResultLauncher q;
        public final /* synthetic */ ManagedActivityResultLauncher r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, Continuation continuation) {
            super(2, continuation);
            this.q = managedActivityResultLauncher;
            this.r = managedActivityResultLauncher2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, this.r, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((SavedRecipesContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            SavedRecipesContract.Actions actions = (SavedRecipesContract.Actions) this.p;
            if (actions instanceof SavedRecipesContract.Actions.LaunchRecipeDetails) {
                this.q.a(Activities.RecipeDetails.b(((SavedRecipesContract.Actions.LaunchRecipeDetails) actions).f8070a), null);
            } else {
                if (!(actions instanceof SavedRecipesContract.Actions.LaunchLogin)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.r.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedRecipesScreenKt$SavedRecipesScreen$2$1$1(SavedRecipesViewModel savedRecipesViewModel, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, Continuation continuation) {
        super(2, continuation);
        this.q = savedRecipesViewModel;
        this.r = managedActivityResultLauncher;
        this.s = managedActivityResultLauncher2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavedRecipesScreenKt$SavedRecipesScreen$2$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SavedRecipesScreenKt$SavedRecipesScreen$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.k;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, null);
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
