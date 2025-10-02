package au.com.woolworths.feature.shop.recipes.recipes;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.recipes.RecipesRepository", f = "RecipesRepository.kt", l = {75}, m = "fetchSavedRecipes")
/* loaded from: classes3.dex */
final class RecipesRepository$fetchSavedRecipes$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RecipesRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipesRepository$fetchSavedRecipes$1(RecipesRepository recipesRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = recipesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
