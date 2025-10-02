package au.com.woolworths.feature.product.list.legacy;

import androidx.compose.material.ModalBottomSheetState;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                BuildersKt.c((CoroutineScope) this.e, null, null, new ComposeProductListActivity$initUi$1$1$1$2$1$1$1((ComposeProductListActivity) this.f, (ModalBottomSheetState) this.g, null), 3);
                break;
            default:
                ((ProductClickListener) this.e).Q2((String) this.f, (String) this.g);
                break;
        }
        return Unit.f24250a;
    }
}
