package au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.product.availability.ui.NearbyStoresSectionUiKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ List e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;

    public /* synthetic */ a(List list, Function1 function1, int i, Modifier modifier, int i2) {
        this.e = list;
        this.f = function1;
        this.h = i;
        this.g = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                SingleChoiceSegmentedButtonsBarKt.a(this.e, this.f, this.h, this.g, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(this.h | 1);
                NearbyStoresSectionUiKt.b(this.e, this.f, this.g, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(List list, Function1 function1, Modifier modifier, int i) {
        this.e = list;
        this.f = function1;
        this.g = modifier;
        this.h = i;
    }
}
