package au.com.woolworths.feature.shop.recipes.recipes;

import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.feature.shop.recipes.recipes.models.RecipeSearchData;
import au.com.woolworths.feature.shop.recipes.recipes.models.RecipeSearchDataKt;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer;
import au.com.woolworths.pagingutils.NumericPageData;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/pagingutils/NumericPageData;", "", "nextPageKey", "", "<unused var>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor$fetchRecipeListBySearchTerm$1", f = "RecipesInteractor.kt", l = {71, 80, 87}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipesInteractor$fetchRecipeListBySearchTerm$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RecipesInteractor r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipesInteractor$fetchRecipeListBySearchTerm$1(RecipesInteractor recipesInteractor, String str, Continuation continuation) {
        super(3, continuation);
        this.r = recipesInteractor;
        this.s = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        RecipesInteractor$fetchRecipeListBySearchTerm$1 recipesInteractor$fetchRecipeListBySearchTerm$1 = new RecipesInteractor$fetchRecipeListBySearchTerm$1(this.r, this.s, (Continuation) obj3);
        recipesInteractor$fetchRecipeListBySearchTerm$1.q = (Integer) obj;
        return recipesInteractor$fetchRecipeListBySearchTerm$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objA;
        Object objJ;
        RecipeSearchData recipeSearchData;
        Object objK;
        RecipeSearchData recipeSearchData2;
        RecipesInteractor recipesInteractor = this.r;
        GoogleAdManagerInteractor googleAdManagerInteractor = recipesInteractor.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Integer num = (Integer) this.q;
            RecipesRepository recipesRepository = recipesInteractor.f8066a;
            CollectionMode collectionModeW = recipesInteractor.b.w();
            this.p = 1;
            objA = recipesRepository.a(EmptyList.d, num, null, this.s, collectionModeW, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                RecipeSearchData recipeSearchData3 = (RecipeSearchData) this.q;
                ResultKt.b(obj);
                recipeSearchData2 = recipeSearchData3;
                objK = obj;
                return RecipeSearchData.copy$default(recipeSearchData2, null, 0, null, null, (List) objK, 15, null);
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RecipeSearchData recipeSearchData4 = (RecipeSearchData) this.q;
            ResultKt.b(obj);
            recipeSearchData = recipeSearchData4;
            objJ = obj;
            return RecipeSearchData.copy$default(recipeSearchData, null, 0, null, null, (List) objJ, 15, null);
        }
        ResultKt.b(obj);
        objA = obj;
        RecipeSearchData recipeSearchData5 = (RecipeSearchData) objA;
        if (recipesInteractor.d.c(BaseFeature.q) && RecipeSearchDataKt.containsUniversalInventoryContainer(recipeSearchData5)) {
            List<Object> items = recipeSearchData5.getC();
            GoogleAdConsumer googleAdConsumer = GoogleAdConsumer.f;
            this.q = recipeSearchData5;
            this.p = 2;
            objK = googleAdManagerInteractor.k(items, googleAdConsumer, true, this);
            if (objK != coroutineSingletons) {
                recipeSearchData2 = recipeSearchData5;
                return RecipeSearchData.copy$default(recipeSearchData2, null, 0, null, null, (List) objK, 15, null);
            }
        } else {
            if (!RecipeSearchDataKt.containsGoogleAds(recipeSearchData5)) {
                return recipeSearchData5;
            }
            List<Object> items2 = recipeSearchData5.getC();
            GoogleAdConsumer googleAdConsumer2 = GoogleAdConsumer.e;
            this.q = recipeSearchData5;
            this.p = 3;
            objJ = GoogleAdManagerInteractor.j(googleAdManagerInteractor, items2, this, 4);
            if (objJ != coroutineSingletons) {
                recipeSearchData = recipeSearchData5;
                return RecipeSearchData.copy$default(recipeSearchData, null, 0, null, null, (List) objJ, 15, null);
            }
        }
        return coroutineSingletons;
    }
}
