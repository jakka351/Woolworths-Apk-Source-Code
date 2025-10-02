package au.com.woolworths.feature.shop.shippingcalculator.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt;
import com.halilibo.richtext.markdown.MarkdownImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Modifier g;

    public /* synthetic */ a(String str, String str2, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ShippingCalculatorScreenKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(385));
                break;
            case 1:
                EdrOfferBannerKt.d(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                MarkdownImageKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(3457));
                break;
        }
        return Unit.f24250a;
    }
}
