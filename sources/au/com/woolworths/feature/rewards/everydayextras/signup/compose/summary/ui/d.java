package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsTargetProductSection;
import au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d(EverydayExtrasSummaryContentItem.CheckableTextItem checkableTextItem, boolean z, boolean z2, Function1 function1, int i) {
        this.g = checkableTextItem;
        this.e = z;
        this.f = z2;
        this.h = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                CheckableTextUiKt.a((EverydayExtrasSummaryContentItem.CheckableTextItem) this.g, this.e, this.f, (Function1) this.h, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                SimilarProductsScreenKt.i((AlternativeProductsTargetProductSection) this.g, (ScrollState) this.h, this.e, this.f, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(AlternativeProductsTargetProductSection alternativeProductsTargetProductSection, ScrollState scrollState, boolean z, boolean z2, int i) {
        this.g = alternativeProductsTargetProductSection;
        this.h = scrollState;
        this.e = z;
        this.f = z2;
    }
}
