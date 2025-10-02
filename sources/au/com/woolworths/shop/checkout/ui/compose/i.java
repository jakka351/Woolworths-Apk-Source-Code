package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.material.ModalBottomSheetState;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return BuildersKt.c((CoroutineScope) this.e, null, null, new IdVerificationBottomSheetKt$IdVerificationBottomSheet$hideSheet$1$1$1((ModalBottomSheetState) this.f, null), 3);
            default:
                ((Function1) this.e).invoke(((FulfilmentSlotSelectionOption) this.f).f10605a);
                return Unit.f24250a;
        }
    }
}
