package au.com.woolworths.feature.shop.recipes.details.data;

import com.woolworths.feature.shop.recipes.details.GetIngredientsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipe-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GetIngredientsQueryGetIngredientsExtKt {
    public static final IngredientsSectionData a(GetIngredientsQuery.GetIngredients getIngredients) {
        RecipeServesData recipeServesData;
        Intrinsics.h(getIngredients, "<this>");
        GetIngredientsQuery.ServesInfo servesInfo = getIngredients.f20229a;
        if (servesInfo != null) {
            recipeServesData = new RecipeServesData(servesInfo.f20230a, servesInfo.c, servesInfo.d, servesInfo.b);
        } else {
            recipeServesData = null;
        }
        ArrayList arrayList = getIngredients.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        return new IngredientsSectionData(recipeServesData, arrayList2);
    }
}
