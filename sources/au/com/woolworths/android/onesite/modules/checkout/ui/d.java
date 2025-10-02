package au.com.woolworths.android.onesite.modules.checkout.ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.shop.checkout.domain.model.ProgressStep;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeContract;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                State state = (State) this.e;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.h(LazyRow, "$this$LazyRow");
                final List list = ((CheckoutBridgeContract.ViewState) state.getD()).f10676a;
                final androidx.navigation.a aVar = new androidx.navigation.a(27);
                LazyRow.b(list.size(), new Function1<Integer, Object>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$onCreate$1$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aVar.invoke(list.get(((Number) obj2).intValue()));
                    }
                }, new Function1<Integer, Object>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$onCreate$1$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity$onCreate$1$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            ProgressStep progressStep = (ProgressStep) list.get(iIntValue);
                            composer.o(-643065648);
                            ProgressStepItemKt.a(progressStep, null, composer, 0);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
            default:
                ProgressStep progressStep = (ProgressStep) this.e;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                if (!progressStep.e) {
                    SemanticsPropertiesKt.g(semantics);
                }
                break;
        }
        return Unit.f24250a;
    }
}
