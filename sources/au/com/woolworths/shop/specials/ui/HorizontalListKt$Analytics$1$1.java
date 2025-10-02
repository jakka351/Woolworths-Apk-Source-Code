package au.com.woolworths.shop.specials.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.specials.ui.HorizontalListKt$Analytics$1$1", f = "HorizontalList.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HorizontalListKt$Analytics$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ HorizontalListData t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalListKt$Analytics$1$1(LazyListState lazyListState, MutableState mutableState, Function1 function1, HorizontalListData horizontalListData, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.q = lazyListState;
        this.r = mutableState;
        this.s = function1;
        this.t = horizontalListData;
        this.u = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HorizontalListKt$Analytics$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HorizontalListKt$Analytics$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowR = FlowKt.r(SnapshotStateKt.m(new au.com.woolworths.design.wx.component.topbar.a(this.q, 14)));
            final HorizontalListData horizontalListData = this.t;
            final Function1 function1 = this.u;
            final LazyListState lazyListState = this.q;
            final MutableState mutableState = this.r;
            final Function1 function12 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.specials.ui.HorizontalListKt$Analytics$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    MutableState mutableState2 = mutableState;
                    LazyListState lazyListState2 = lazyListState;
                    if (!zBooleanValue) {
                        int iH = lazyListState2.h();
                        int iIntValue = ((Number) ((Pair) mutableState2.getD()).d).intValue();
                        Function1 function13 = function12;
                        HorizontalListData horizontalListData2 = horizontalListData;
                        if (iH > iIntValue) {
                            function13.invoke(horizontalListData2);
                        } else {
                            int iH2 = lazyListState2.h();
                            int iIntValue2 = ((Number) ((Pair) mutableState2.getD()).d).intValue();
                            Function1 function14 = function1;
                            if (iH2 < iIntValue2) {
                                function14.invoke(horizontalListData2);
                            } else if (lazyListState2.i() > ((Number) ((Pair) mutableState2.getD()).e).intValue()) {
                                function13.invoke(horizontalListData2);
                            } else if (lazyListState2.i() < ((Number) ((Pair) mutableState2.getD()).e).intValue()) {
                                function14.invoke(horizontalListData2);
                            }
                        }
                    }
                    mutableState2.setValue(new Pair(new Integer(lazyListState2.h()), new Integer(lazyListState2.i())));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowR.collect(flowCollector, this) == coroutineSingletons) {
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
