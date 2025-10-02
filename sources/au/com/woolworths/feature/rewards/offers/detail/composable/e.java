package au.com.woolworths.feature.rewards.offers.detail.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.ui.bottomsheet.StaticBottomSheetContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ e(String str, Function0 function0, Modifier modifier, boolean z, int i) {
        this.e = str;
        this.f = function0;
        this.g = modifier;
        this.h = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                RewardsOfferDetailsScreenLegacyKt.e(RecomposeScopeImplKt.a(3073), (Composer) obj, this.g, this.e, this.f, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                StaticBottomSheetContentKt.b(RecomposeScopeImplKt.a(1), (Composer) obj, this.g, this.e, this.f, this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(String str, boolean z, Function0 function0, Modifier modifier, int i) {
        this.e = str;
        this.h = z;
        this.f = function0;
        this.g = modifier;
    }
}
