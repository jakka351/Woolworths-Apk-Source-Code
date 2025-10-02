package au.com.woolworths.design.core.ui.component.experimental.progressindicator;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.compose.productsearch.VoiceProductSearchEntryIconKt;
import au.com.woolworths.product.composeui.ProductCardButtonsKt;
import au.com.woolworths.rewards.base.confetti.RewardsConfettiKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import au.com.woolworths.shop.receipts.ui.ReceiptPaginationErrorUiKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ c(Modifier modifier, Function0 function0, int i, int i2) {
        this.d = 5;
        this.f = modifier;
        this.e = function0;
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
                LinearProgressIndicatorKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 1:
                VoiceProductSearchEntryIconKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 2:
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.VoiceProductSearchEntryIconKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 3:
                au.com.woolworths.feature.product.list.v2.ui.VoiceProductSearchEntryIconKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 4:
                ProductCardButtonsKt.c(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 5:
                RewardsConfettiKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            case 6:
                ReceiptListScreenKt.c(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
            default:
                ReceiptPaginationErrorUiKt.a(RecomposeScopeImplKt.a(this.g | 1), this.h, composer, this.f, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(Function0 function0, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.e = function0;
        this.f = modifier;
        this.g = i;
        this.h = i2;
    }
}
