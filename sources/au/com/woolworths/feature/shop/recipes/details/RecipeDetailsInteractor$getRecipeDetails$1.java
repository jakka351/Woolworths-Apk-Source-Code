package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsInteractor", f = "RecipeDetailsInteractor.kt", l = {36, 42, 45}, m = "getRecipeDetails")
/* loaded from: classes3.dex */
final class RecipeDetailsInteractor$getRecipeDetails$1 extends ContinuationImpl {
    public RecipeDetailData p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RecipeDetailsInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsInteractor$getRecipeDetails$1(RecipeDetailsInteractor recipeDetailsInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = recipeDetailsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
