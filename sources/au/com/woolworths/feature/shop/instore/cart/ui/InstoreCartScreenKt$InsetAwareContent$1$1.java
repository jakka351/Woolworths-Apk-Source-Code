package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$InsetAwareContent$1$1", f = "InstoreCartScreen.kt", l = {253}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreCartScreenKt$InsetAwareContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WindowInsets q;
    public final /* synthetic */ Density r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreCartScreenKt$InsetAwareContent$1$1(WindowInsets windowInsets, Density density, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.q = windowInsets;
        this.r = density;
        this.s = mutableState;
        this.t = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreCartScreenKt$InsetAwareContent$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreCartScreenKt$InsetAwareContent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            WindowInsets windowInsets = this.q;
            final Density density = this.r;
            Flow flowM = SnapshotStateKt.m(new n(12, windowInsets, density));
            final MutableState mutableState = this.s;
            final MutableState mutableState2 = this.t;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$InsetAwareContent$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    int iIntValue = ((Number) obj2).intValue();
                    float fB = density.B(iIntValue);
                    Timber.Forest forest = Timber.f27013a;
                    forest.b("InsetAwareContent: Inset SnapshotFlow: topPx = " + iIntValue + ", currentTopDp = " + Dp.b(fB), new Object[0]);
                    float f = (float) 0;
                    int iCompare = Float.compare(fB, f);
                    MutableState mutableState3 = mutableState2;
                    MutableState mutableState4 = mutableState;
                    if (iCompare > 0) {
                        float f2 = InstoreCartScreenKt.f7322a;
                        mutableState4.setValue(new Dp(fB));
                        if (!((Boolean) mutableState3.getD()).booleanValue()) {
                            mutableState3.setValue(Boolean.TRUE);
                            forest.b(YU.a.A("InsetAwareContent: Insets ready, topInsetDp: ", Dp.b(((Dp) mutableState4.getD()).d)), new Object[0]);
                        }
                    } else {
                        float f3 = InstoreCartScreenKt.f7322a;
                        if (!((Boolean) mutableState3.getD()).booleanValue() && Dp.a(fB, f) && Dp.a(((Dp) mutableState4.getD()).d, f)) {
                            forest.b("InsetAwareContent: Insets still 0dp from start, waiting...", new Object[0]);
                        } else if (((Boolean) mutableState3.getD()).booleanValue() && Dp.a(fB, f)) {
                            mutableState4.setValue(new Dp(fB));
                            forest.b("InsetAwareContent: Insets were ready, now 0dp. topInsetDp updated.", new Object[0]);
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((AbstractFlow) flowM).collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
