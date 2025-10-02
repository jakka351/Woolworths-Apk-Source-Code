package au.com.woolworths.shop.cart.ui;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                au.com.woolworths.shop.cart.ui.cart.a aVar = (au.com.woolworths.shop.cart.ui.cart.a) this.e;
                Function0 function0 = (Function0) this.f;
                aVar.invoke();
                function0.invoke();
                break;
            case 2:
                au.com.woolworths.shop.cart.ui.cart.a aVar2 = (au.com.woolworths.shop.cart.ui.cart.a) this.e;
                Function0 function02 = (Function0) this.f;
                aVar2.invoke();
                function02.invoke();
                break;
            default:
                ((ViewGroup) this.e).removeView((ComposeView) this.f);
                break;
        }
        return Unit.f24250a;
    }
}
