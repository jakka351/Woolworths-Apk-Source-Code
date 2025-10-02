package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.TrackableErrorType;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel$fetchRecipeDetails$1", f = "RecipeDetailsViewModel.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipeDetailsViewModel$fetchRecipeDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RecipeDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsViewModel$fetchRecipeDetails$1(RecipeDetailsViewModel recipeDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = recipeDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RecipeDetailsViewModel$fetchRecipeDetails$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecipeDetailsViewModel$fetchRecipeDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        RecipeDetailsViewModel recipeDetailsViewModel = this.q;
        AnalyticsManager analyticsManager = recipeDetailsViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RecipeDetailsInteractor recipeDetailsInteractor = recipeDetailsViewModel.f;
                String str = recipeDetailsViewModel.m;
                if (str == null) {
                    Intrinsics.p("recipeId");
                    throw null;
                }
                this.p = 1;
                obj = recipeDetailsInteractor.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RecipeDetailData recipeDetailData = (RecipeDetailData) obj;
            RecipeDetailsViewModel.t6(recipeDetailsViewModel, recipeDetailData);
            RecipeDetailsViewModel.w6(recipeDetailsViewModel, recipeDetailData, null, null, null, 0L, 61);
        } catch (NoConnectivityException unused) {
            RecipeDetailsActions recipeDetailsActions = RecipeDetailsActions.n;
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.l0, "Unable to load recipe due to connection error");
            trackingMetadataA.b(TrackableValue.k0, TrackableErrorType.d);
            analyticsManager.j(recipeDetailsActions, trackingMetadataA);
            recipeDetailsViewModel.v6(RecipeDetailsFullPageErrorState.d);
        } catch (ServerErrorException unused2) {
            RecipeDetailsActions recipeDetailsActions2 = RecipeDetailsActions.p;
            TrackingMetadata trackingMetadataA2 = TrackingMetadata.Companion.a(TrackableValue.l0, "Unable to load recipe at this time");
            trackingMetadataA2.b(TrackableValue.k0, TrackableErrorType.d);
            analyticsManager.j(recipeDetailsActions2, trackingMetadataA2);
            recipeDetailsViewModel.v6(RecipeDetailsFullPageErrorState.e);
        }
        return Unit.f24250a;
    }
}
