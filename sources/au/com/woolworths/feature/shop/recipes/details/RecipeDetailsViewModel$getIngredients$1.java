package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import au.com.woolworths.feature.shop.recipes.details.data.IngredientsSectionData;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel$getIngredients$1", f = "RecipeDetailsViewModel.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipeDetailsViewModel$getIngredients$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RecipeDetailsViewModel q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsViewModel$getIngredients$1(RecipeDetailsViewModel recipeDetailsViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.q = recipeDetailsViewModel;
        this.r = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RecipeDetailsViewModel$getIngredients$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecipeDetailsViewModel$getIngredients$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        RecipeDetailsViewModel recipeDetailsViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = this.r;
                this.p = 1;
                obj = recipeDetailsViewModel.p.a(new RecipeDetailsViewModel$load$2(recipeDetailsViewModel, i2, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RecipeDetailsViewModel.q6(recipeDetailsViewModel, (IngredientsSectionData) obj);
        } catch (NoConnectivityException unused) {
            RecipeDetailsViewModel.s6(recipeDetailsViewModel, com.woolworths.R.string.recipe_detail_serves_toggle_connection_error, RecipeDetailsActions.n);
        } catch (ServerErrorException unused2) {
            RecipeDetailsViewModel.s6(recipeDetailsViewModel, com.woolworths.R.string.recipe_detail_serves_toggle_server_error, RecipeDetailsActions.p);
        }
        return Unit.f24250a;
    }
}
