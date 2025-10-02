package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentFeesInfoSection;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentInfoRowAccordion;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.f = obj;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                FulfilmentFeesBottomSheetKt.e((FulfilmentFeesInfoSection) this.f, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                FulfilmentFeesBottomSheetKt.f((FulfilmentInfoRowAccordion) this.f, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            default:
                ((Integer) obj2).getClass();
                IdVerificationScreenKt.a((IdVerificationViewModel) this.f, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
