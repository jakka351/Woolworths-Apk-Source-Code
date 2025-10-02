package au.com.woolworths.feature.shop.recipes.details;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsRepository", f = "RecipeDetailsRepository.kt", l = {48}, m = "getRecipeDetails")
/* loaded from: classes3.dex */
final class RecipeDetailsRepository$getRecipeDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RecipeDetailsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsRepository$getRecipeDetails$1(RecipeDetailsRepository recipeDetailsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = recipeDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, this);
    }
}
