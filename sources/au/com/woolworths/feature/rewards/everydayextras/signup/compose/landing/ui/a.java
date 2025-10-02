package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.foundation.rewards.common.ui.textitem.SubheadTextUiKt;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.ui.OfferCardKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(long j, List list, List list2, List list3, int i) {
        this.d = 0;
        this.e = j;
        this.f = list;
        this.g = list2;
        this.h = list3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                BenefitsComparisonTableKt.c(this.e, (List) this.f, (List) this.g, (List) this.h, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                SubheadTextUiKt.a((String) this.f, (Modifier) this.g, this.e, (TextStyle) this.h, (Composer) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                OfferCardKt.d((ImageWithAltText) this.f, (String) this.g, this.e, (Modifier) this.h, (Composer) obj, iA3);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, Object obj2, long j, Object obj3, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = j;
        this.h = obj3;
    }
}
