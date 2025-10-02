package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesContract;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageListingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SavedRecipesScreenKt$SavedRecipesContent$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SavedRecipesViewModel savedRecipesViewModel = (SavedRecipesViewModel) this.receiver;
        SavedRecipesContract.ViewState viewState = (SavedRecipesContract.ViewState) savedRecipesViewModel.h.e();
        if ((viewState != null ? viewState.b : null) == SavedRecipesFullPageErrorState.h) {
            savedRecipesViewModel.f.c(SavedRecipesActions.e);
            savedRecipesViewModel.j.f(SavedRecipesContract.Actions.LaunchLogin.f8069a);
        } else {
            SavedRecipesViewModel.r6(savedRecipesViewModel, savedRecipesViewModel.h, null, false, null, 6);
            NumericPageListing numericPageListing = (NumericPageListing) savedRecipesViewModel.m.e();
            if (numericPageListing != null) {
                PageListingKt.a(numericPageListing);
            }
        }
        return Unit.f24250a;
    }
}
