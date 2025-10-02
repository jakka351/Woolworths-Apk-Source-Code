package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import au.com.woolworths.pagingutils.NumericPageListing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SavedRecipesActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function0;
        NumericPageListing numericPageListing = (NumericPageListing) ((SavedRecipesViewModel) this.receiver).m.e();
        if (numericPageListing != null && (function0 = numericPageListing.d) != null) {
            function0.invoke();
        }
        return Unit.f24250a;
    }
}
