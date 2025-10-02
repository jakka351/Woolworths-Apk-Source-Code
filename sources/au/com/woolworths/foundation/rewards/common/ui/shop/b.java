package au.com.woolworths.foundation.rewards.common.ui.shop;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.TextWithAlt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextWithAlt e;
    public final /* synthetic */ IconAsset.LocalAsset f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;

    public /* synthetic */ b(TextWithAlt textWithAlt, IconAsset.LocalAsset localAsset, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = textWithAlt;
        this.f = localAsset;
        this.g = modifier;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ShippingEtaUiKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                au.com.woolworths.foundation.rewards.common.ui.shop.core.ShippingEtaUiKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }
}
