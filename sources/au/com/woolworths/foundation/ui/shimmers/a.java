package au.com.woolworths.foundation.ui.shimmers;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Dp e;

    public /* synthetic */ a(Dp dp, int i) {
        this.d = i;
        this.e = dp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Modifier conditional = (Modifier) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(conditional, "$this$conditional");
                Dp dp = this.e;
                Intrinsics.e(dp);
                return SizeKt.g(conditional, dp.d);
            case 1:
                Intrinsics.h(conditional, "$this$conditional");
                Dp dp2 = this.e;
                Intrinsics.e(dp2);
                return SizeKt.u(conditional, dp2.d);
            case 2:
                Intrinsics.h(conditional, "$this$conditional");
                Dp dp3 = this.e;
                Intrinsics.e(dp3);
                return SizeKt.g(conditional, dp3.d);
            default:
                Intrinsics.h(conditional, "$this$conditional");
                Dp dp4 = this.e;
                Intrinsics.e(dp4);
                return SizeKt.u(conditional, dp4.d);
        }
    }
}
