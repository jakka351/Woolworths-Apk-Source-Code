package au.com.woolworths.feature.shop.recipes.recipes;

import au.com.woolworths.pagingutils.NumericPageData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/pagingutils/NumericPageData;", "", "nextPageKey", "", "<unused var>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor$fetchSavedRecipes$1", f = "RecipesInteractor.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipesInteractor$fetchSavedRecipes$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public int p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ RecipesInteractor r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipesInteractor$fetchSavedRecipes$1(RecipesInteractor recipesInteractor, Continuation continuation) {
        super(3, continuation);
        this.r = recipesInteractor;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        RecipesInteractor$fetchSavedRecipes$1 recipesInteractor$fetchSavedRecipes$1 = new RecipesInteractor$fetchSavedRecipes$1(this.r, (Continuation) obj3);
        recipesInteractor$fetchSavedRecipes$1.q = (Integer) obj;
        return recipesInteractor$fetchSavedRecipes$1.invokeSuspend(Unit.f24250a);
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
        Integer num = this.q;
        RecipesRepository recipesRepository = this.r.f8066a;
        this.p = 1;
        Object objB = recipesRepository.b(num, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
