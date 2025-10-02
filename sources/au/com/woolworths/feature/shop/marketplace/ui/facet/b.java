package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.ui.focus.FocusManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((Function0) this.e).invoke();
                break;
            case 1:
                Function0<Unit> onClickListener = ((FacetItemView) this.e).getOnClickListener();
                if (onClickListener != null) {
                    onClickListener.invoke();
                }
                return Unit.f24250a;
            default:
                ((FocusManager) this.e).u(false);
                break;
        }
        return Unit.f24250a;
    }
}
