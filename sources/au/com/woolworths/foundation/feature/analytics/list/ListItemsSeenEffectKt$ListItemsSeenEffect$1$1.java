package au.com.woolworths.foundation.feature.analytics.list;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$1$1", f = "ListItemsSeenEffect.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ListItemsSeenEffectKt$ListItemsSeenEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ItemsSeenState q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemsSeenEffectKt$ListItemsSeenEffect$1$1(ItemsSeenState itemsSeenState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = itemsSeenState;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListItemsSeenEffectKt$ListItemsSeenEffect$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ListItemsSeenEffectKt$ListItemsSeenEffect$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final ItemsSeenState itemsSeenState = this.q;
            Flow flow = itemsSeenState.e;
            final MutableState mutableState = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    ItemsSeenState itemsSeenState2 = itemsSeenState;
                    float f = itemsSeenState2.b;
                    SnapshotStateMap snapshotStateMap = itemsSeenState2.d;
                    ArrayList arrayListC = ListItemsSeenEffectKt.c((LazyListLayoutInfo) obj2, f);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListC.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                        Set set = snapshotStateMap.f;
                        if (set == null || !set.isEmpty()) {
                            Iterator<T> it2 = set.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.c(it2.next(), lazyListItemInfo.getL())) {
                                    break;
                                }
                            }
                        }
                        arrayList.add(next);
                    }
                    if (!arrayList.isEmpty()) {
                        ((Function1) mutableState.getD()).invoke(arrayList);
                    }
                    Iterator it3 = arrayListC.iterator();
                    while (it3.hasNext()) {
                        LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) it3.next();
                        snapshotStateMap.put(lazyListItemInfo2.getL(), lazyListItemInfo2);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((AbstractFlow) flow).collect(flowCollector, this) == coroutineSingletons) {
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
