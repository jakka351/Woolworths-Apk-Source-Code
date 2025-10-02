package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.dynamic.page.data.CampaignCardData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(CampaignCardData campaignCardData, Modifier modifier, Function2 function2, int i) {
        this.g = campaignCardData;
        this.f = modifier;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                CardCarouselUiKt.a((CampaignCardData) this.g, this.f, this.e, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                DynamicPageScreenKt.a((List) this.g, this.e, this.f, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(List list, Function2 function2, Modifier modifier, int i) {
        this.g = list;
        this.e = function2;
        this.f = modifier;
    }
}
