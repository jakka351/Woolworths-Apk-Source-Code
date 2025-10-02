package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
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
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$MultipleProductCardFooter$1$1", f = "InstoreMapScreen.kt", l = {629}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapScreenKt$MultipleProductCardFooter$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ List r;
    public final /* synthetic */ Function1 s;

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "isScrollInProgress", "", "index", "offset"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$MultipleProductCardFooter$1$1$4", f = "InstoreMapScreen.kt", l = {626}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$MultipleProductCardFooter$1$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function5<FlowCollector<? super Pair<? extends Integer, ? extends Integer>>, Boolean, Integer, Integer, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ FlowCollector q;
        public /* synthetic */ boolean r;
        public /* synthetic */ int s;
        public /* synthetic */ int t;

        @Override // kotlin.jvm.functions.Function5
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            int iIntValue = ((Number) obj3).intValue();
            int iIntValue2 = ((Number) obj4).intValue();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(5, (Continuation) obj5);
            anonymousClass4.q = (FlowCollector) obj;
            anonymousClass4.r = zBooleanValue;
            anonymousClass4.s = iIntValue;
            anonymousClass4.t = iIntValue2;
            return anonymousClass4.invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                FlowCollector flowCollector = this.q;
                boolean z = this.r;
                int i2 = this.s;
                int i3 = this.t;
                Timber.f27013a.b("isScrollInProgress: " + z + ", index: " + i2 + ", offset: " + i3, new Object[0]);
                if (!z) {
                    Pair pair = new Pair(new Integer(i2), new Integer(i3));
                    this.p = 1;
                    if (flowCollector.emit(pair, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapScreenKt$MultipleProductCardFooter$1$1(LazyListState lazyListState, List list, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = lazyListState;
        this.r = list;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapScreenKt$MultipleProductCardFooter$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreMapScreenKt$MultipleProductCardFooter$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            LazyListState lazyListState = this.q;
            Flow flowM = FlowKt.m(SnapshotStateKt.m(new au.com.woolworths.design.wx.component.topbar.a(lazyListState, 5)), SnapshotStateKt.m(new au.com.woolworths.design.wx.component.topbar.a(lazyListState, 6)), SnapshotStateKt.m(new au.com.woolworths.design.wx.component.topbar.a(lazyListState, 7)), new AnonymousClass4(5, null));
            final List list = this.r;
            final Function1 function1 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$MultipleProductCardFooter$1$1.5
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Pair pair = (Pair) obj2;
                    int iIntValue = ((Number) pair.d).intValue();
                    int iIntValue2 = ((Number) pair.e).intValue();
                    Timber.f27013a.b(androidx.camera.core.impl.b.j(iIntValue, iIntValue2, "NOT SCROLLING (index, offset): (", ", ", ")"), new Object[0]);
                    Function1 function12 = function1;
                    if (iIntValue2 == 0) {
                        function12.invoke(new Integer(iIntValue));
                    } else if (iIntValue == list.size() - 2) {
                        function12.invoke(new Integer(iIntValue + 1));
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
