package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import androidx.activity.result.ActivityResult;
import androidx.paging.LivePagedList;
import au.com.woolworths.feature.shop.recipes.recipes.analytics.RecipesScreens;
import au.com.woolworths.pagingutils.NumericPageListing;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SavedRecipesViewModel e;

    public /* synthetic */ a(SavedRecipesViewModel savedRecipesViewModel, int i) {
        this.d = i;
        this.e = savedRecipesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NumericPageListing numericPageListing;
        Function0 function0;
        switch (this.d) {
            case 0:
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.h(result, "result");
                if (result.d == -1) {
                    this.e.p6();
                }
                return Unit.f24250a;
            case 1:
                ActivityResult result2 = (ActivityResult) obj;
                Intrinsics.h(result2, "result");
                if (result2.d == -1 && (numericPageListing = (NumericPageListing) this.e.m.e()) != null && (function0 = numericPageListing.d) != null) {
                    function0.invoke();
                }
                return Unit.f24250a;
            case 2:
                return this.e.e.c();
            default:
                NumericPageListing it = (NumericPageListing) obj;
                Intrinsics.h(it, "it");
                LivePagedList livePagedList = it.f9175a;
                this.e.f.a(RecipesScreens.f);
                return livePagedList;
        }
    }
}
