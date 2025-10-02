package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.shop.prompt.handler.ui.BottomSheetPromptContentKt;
import au.com.woolworths.sdui.common.IconAsset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(float f, Modifier modifier, int i) {
        this.e = f;
        this.f = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                NutritionCircleIndicatorKt.a(this.e, (Modifier) this.f, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(49);
                BottomSheetPromptContentKt.b((IconAsset) this.f, this.e, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(IconAsset iconAsset, float f, int i) {
        this.f = iconAsset;
        this.e = f;
    }
}
