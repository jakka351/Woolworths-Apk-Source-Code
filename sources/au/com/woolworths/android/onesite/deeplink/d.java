package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import java.util.List;
import kotlin.jvm.functions.Function0;
import me.oriient.ipssdk.ips.IPSContent;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ List g;

    public /* synthetic */ d(String str, String str2, List list) {
        this.e = str;
        this.f = str2;
        this.g = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Activities.RecipeList.RecipeListExtras recipeListExtras = new Activities.RecipeList.RecipeListExtras(new Activities.RecipeList.ExtrasPageData(this.e), new Activities.RecipeList.ExtrasBySourceAndTags(this.g, this.f));
                Intent intentA = ActivityNavigatorKt.a(Activities.RecipeList.f4512a, ApplicationType.e);
                intentA.putExtra("RECIPE_LIST_EXTRAS", recipeListExtras);
                return intentA;
            default:
                return IPSContent.lambda$getProductAndCategoriesLocation$2(this.e, this.f, this.g);
        }
    }

    public /* synthetic */ d(String str, List list, String str2) {
        this.e = str;
        this.g = list;
        this.f = str2;
    }
}
