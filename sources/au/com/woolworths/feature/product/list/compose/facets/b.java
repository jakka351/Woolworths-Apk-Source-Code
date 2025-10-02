package au.com.woolworths.feature.product.list.compose.facets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ b(List list, boolean z, Function1 function1, Function0 function0, int i) {
        this.d = 2;
        this.f = list;
        this.e = z;
        this.g = function1;
        this.h = function0;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                FacetsChipGroupKt.a(RecomposeScopeImplKt.a(this.i | 1), (Composer) obj, this.f, this.h, this.g, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.facets.FacetsChipGroupKt.a(RecomposeScopeImplKt.a(this.i | 1), (Composer) obj, this.f, this.h, this.g, this.e);
                break;
            default:
                ((Integer) obj2).intValue();
                SavedRecipesScreenKt.d(RecomposeScopeImplKt.a(this.i | 1), (Composer) obj, this.f, this.h, this.g, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(boolean z, List list, Function1 function1, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.f = list;
        this.g = function1;
        this.h = function0;
        this.i = i;
    }
}
