package au.com.woolworths.feature.shop.recipes.search;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchDataStore;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.search.RecipeSearchRepository$addNewRecentSearch$2", f = "RecipeSearchRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RecipeSearchRepository$addNewRecentSearch$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ RecipeSearchRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeSearchRepository$addNewRecentSearch$2(RecipeSearchRepository recipeSearchRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = recipeSearchRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RecipeSearchRepository$addNewRecentSearch$2 recipeSearchRepository$addNewRecentSearch$2 = new RecipeSearchRepository$addNewRecentSearch$2(this.q, this.r, continuation);
        recipeSearchRepository$addNewRecentSearch$2.p = obj;
        return recipeSearchRepository$addNewRecentSearch$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RecipeSearchRepository$addNewRecentSearch$2 recipeSearchRepository$addNewRecentSearch$2 = (RecipeSearchRepository$addNewRecentSearch$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        recipeSearchRepository$addNewRecentSearch$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.p;
        Preferences.Key key = RecipeSearchDataStore.Keys.f8085a;
        ArrayList arrayListA = RecipeSearchRepository.a(this.q, (String) mutablePreferences.b(key));
        String str = this.r;
        boolean zContains = arrayListA.contains(str);
        Unit unit = Unit.f24250a;
        if (zContains) {
            return unit;
        }
        arrayListA.add(0, str);
        mutablePreferences.f(key, CollectionsKt.M(CollectionsKt.w0(arrayListA, 5), "\t", null, null, null, 62));
        return unit;
    }
}
