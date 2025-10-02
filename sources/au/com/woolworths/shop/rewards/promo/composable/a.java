package au.com.woolworths.shop.rewards.promo.composable;

import au.com.woolworths.android.onesite.data.ContentCta;
import com.woolworths.shop.product.ui.boost.BoostingState;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ a(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objA;
        int i = this.d;
        Unit unit = Unit.f24250a;
        Function1 function1 = this.e;
        switch (i) {
            case 0:
                ContentCta it = (ContentCta) obj;
                Intrinsics.h(it, "it");
                String url = it.getUrl();
                if (url != null) {
                    function1.invoke(url);
                }
                return unit;
            case 1:
                function1.invoke(BoostingState.f);
                return unit;
            default:
                Throwable th = (Throwable) obj;
                int i2 = ExceptionsConstructorKt.f24721a;
                try {
                    Throwable th2 = (Throwable) function1.invoke(th);
                    boolean zC = Intrinsics.c(th.getMessage(), th2.getMessage());
                    objA = th2;
                    if (!zC) {
                        boolean zC2 = Intrinsics.c(th2.getMessage(), th.toString());
                        objA = th2;
                        if (!zC2) {
                            objA = null;
                        }
                    }
                } catch (Throwable th3) {
                    objA = ResultKt.a(th3);
                }
                return (Throwable) (objA instanceof Result.Failure ? null : objA);
        }
    }
}
