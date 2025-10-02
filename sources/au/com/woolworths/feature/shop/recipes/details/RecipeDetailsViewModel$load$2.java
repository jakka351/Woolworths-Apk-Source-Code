package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.feature.shop.recipes.details.data.IngredientsSectionData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/recipes/details/data/IngredientsSectionData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel$load$2", f = "RecipeDetailsViewModel.kt", l = {430}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipeDetailsViewModel$load$2 extends SuspendLambda implements Function1<Continuation<? super IngredientsSectionData>, Object> {
    public int p;
    public final /* synthetic */ RecipeDetailsViewModel q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsViewModel$load$2(RecipeDetailsViewModel recipeDetailsViewModel, int i, Continuation continuation) {
        super(1, continuation);
        this.q = recipeDetailsViewModel;
        this.r = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecipeDetailsViewModel$load$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecipeDetailsViewModel$load$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        RecipeDetailsViewModel recipeDetailsViewModel = this.q;
        RecipeDetailsInteractor recipeDetailsInteractor = recipeDetailsViewModel.f;
        String str = recipeDetailsViewModel.m;
        if (str == null) {
            Intrinsics.p("recipeId");
            throw null;
        }
        this.p = 1;
        Object objA = recipeDetailsInteractor.f8012a.a(this.r, str, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
