package au.com.woolworths.feature.product.list.compose.recipe;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ListSectionHeaderApiData e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ a(ListSectionHeaderApiData listSectionHeaderApiData, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.e = listSectionHeaderApiData;
        this.f = modifier;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ListSectionHeaderKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                au.com.woolworths.feature.product.list.legacy.compose.recipe.ListSectionHeaderKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }
}
