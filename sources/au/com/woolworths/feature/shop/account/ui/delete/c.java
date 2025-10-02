package au.com.woolworths.feature.shop.account.ui.delete;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.rewards.offers.ui.OfferCtaButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ c(String str, boolean z, Modifier modifier, Function0 function0, int i, int i2) {
        this.e = str;
        this.f = z;
        this.h = modifier;
        this.g = function0;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                DeleteAccountTnCActionFooterUiKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.h, this.e, this.g, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                OfferCtaButtonKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.h, this.e, this.g, this.f);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(String str, boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.e = str;
        this.f = z;
        this.g = function0;
        this.h = modifier;
        this.i = i;
        this.j = i2;
    }
}
