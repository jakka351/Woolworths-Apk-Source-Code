package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.MutableState;
import coil3.compose.AsyncImagePainter;
import com.google.android.gms.wallet.button.PayButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ m(MutableState mutableState, Function0 function0) {
        this.d = 1;
        this.e = function0;
        this.f = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj;
                Intrinsics.h(it, "it");
                this.f.setValue(Boolean.TRUE);
                this.e.invoke();
                break;
            case 1:
                if (((Boolean) this.f.getD()).booleanValue()) {
                    this.e.invoke();
                }
                break;
            default:
                PayButton button = (PayButton) obj;
                Intrinsics.h(button, "button");
                if (!((Boolean) this.f.getD()).booleanValue()) {
                    button.setAlpha(1.0f);
                    button.setEnabled(true);
                    button.setOnClickListener(new au.com.woolworths.feature.shop.homepage.presentation.f(2, this.e));
                }
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ m(MutableState mutableState, Function0 function0, int i) {
        this.d = i;
        this.f = mutableState;
        this.e = function0;
    }
}
