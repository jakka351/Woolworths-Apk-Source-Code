package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeSaveInfoData;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel$toggleRecipeSave$1$2", f = "RecipeDetailsViewModel.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipeDetailsViewModel$toggleRecipeSave$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RecipeDetailsViewModel q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsViewModel$toggleRecipeSave$1$2(RecipeDetailsViewModel recipeDetailsViewModel, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.q = recipeDetailsViewModel;
        this.r = z;
        this.s = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RecipeDetailsViewModel$toggleRecipeSave$1$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecipeDetailsViewModel$toggleRecipeSave$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        boolean z = this.s;
        RecipeDetailsViewModel recipeDetailsViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RecipeDetailsInteractor recipeDetailsInteractor = recipeDetailsViewModel.f;
                String str = recipeDetailsViewModel.m;
                if (str == null) {
                    Intrinsics.p("recipeId");
                    throw null;
                }
                boolean z2 = this.r;
                this.p = 1;
                obj = recipeDetailsInteractor.b(z2, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RecipeSaveInfoData recipeSaveInfoData = (RecipeSaveInfoData) obj;
            RecipeDetailsViewModel.r6(recipeDetailsViewModel, recipeSaveInfoData.f8021a);
            recipeDetailsViewModel.q = true;
            recipeDetailsViewModel.x6(recipeSaveInfoData.b, true);
        } catch (NoConnectivityException unused) {
            RecipeDetailsViewModel.r6(recipeDetailsViewModel, z);
            RecipeDetailsViewModel.s6(recipeDetailsViewModel, z ? com.woolworths.R.string.recipe_detail_unsave_connection_error : com.woolworths.R.string.recipe_detail_save_connection_error, RecipeDetailsActions.n);
        } catch (ServerErrorException unused2) {
            RecipeDetailsViewModel.r6(recipeDetailsViewModel, z);
            RecipeDetailsViewModel.s6(recipeDetailsViewModel, z ? com.woolworths.R.string.recipe_detail_unable_to_unsave : com.woolworths.R.string.recipe_detail_unable_to_save, RecipeDetailsActions.p);
        }
        return Unit.f24250a;
    }
}
