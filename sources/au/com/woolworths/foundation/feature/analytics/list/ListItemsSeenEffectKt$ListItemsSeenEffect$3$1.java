package au.com.woolworths.foundation.feature.analytics.list;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1", f = "ListItemsSeenEffect.kt", l = {93}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ListItemsSeenEffectKt$ListItemsSeenEffect$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ListItemsTrackerState q;
    public final /* synthetic */ MutableState r;

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\t0\u0001H\n"}, d2 = {"<anonymous>", "", "Lkotlin/Pair;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "items", "Lau/com/woolworths/foundation/feature/analytics/list/ListItemKeyToEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$2", f = "ListItemsSeenEffect.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function3<LazyListLayoutInfo, List<? extends ListItemKeyToEvent<Object>>, Continuation<? super List<? extends Pair<Object, ? extends LazyListItemInfo>>>, Object> {
        public /* synthetic */ LazyListLayoutInfo p;
        public /* synthetic */ List q;
        public final /* synthetic */ ListItemsTrackerState r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ListItemsTrackerState listItemsTrackerState, Continuation continuation) {
            super(3, continuation);
            this.r = listItemsTrackerState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.r, (Continuation) obj3);
            anonymousClass2.p = (LazyListLayoutInfo) obj;
            anonymousClass2.q = (List) obj2;
            return anonymousClass2.invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            LazyListLayoutInfo lazyListLayoutInfo = this.p;
            List list = this.q;
            ListItemsTrackerState listItemsTrackerState = this.r;
            listItemsTrackerState.getClass();
            ArrayList arrayListC = ListItemsSeenEffectKt.c(lazyListLayoutInfo, 1.0f);
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next2;
                Set set = listItemsTrackerState.d.f;
                if (set == null || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.c(it2.next(), lazyListItemInfo.getL())) {
                            break;
                        }
                    }
                }
                arrayList.add(next2);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) it3.next();
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    if (Intrinsics.c(((ListItemKeyToEvent) next).f8492a, lazyListItemInfo2.getL())) {
                        break;
                    }
                }
                ListItemKeyToEvent listItemKeyToEvent = (ListItemKeyToEvent) next;
                Pair pair = listItemKeyToEvent != null ? new Pair(listItemKeyToEvent.b, lazyListItemInfo2) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemsSeenEffectKt$ListItemsSeenEffect$3$1(ListItemsTrackerState listItemsTrackerState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = listItemsTrackerState;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListItemsSeenEffectKt$ListItemsSeenEffect$3$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ListItemsSeenEffectKt$ListItemsSeenEffect$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final ListItemsTrackerState listItemsTrackerState = this.q;
            final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(SnapshotStateKt.m(new a(listItemsTrackerState, 20)), listItemsTrackerState.c, new AnonymousClass2(listItemsTrackerState, null));
            Flow<List<? extends Pair<Object, ? extends LazyListItemInfo>>> flow = new Flow<List<? extends Pair<Object, ? extends LazyListItemInfo>>>() { // from class: au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1$2", f = "ListItemsSeenEffect.kt", l = {219}, m = "emit")
                    /* renamed from: au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object p;
                        public int q;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.p = obj;
                            this.q |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.d = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L18
                        L13:
                            au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.q
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r6)
                            goto L48
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            kotlin.ResultKt.b(r6)
                            r6 = r5
                            java.util.List r6 = (java.util.List) r6
                            java.util.Collection r6 = (java.util.Collection) r6
                            boolean r6 = r6.isEmpty()
                            if (r6 != 0) goto L48
                            r0.q = r3
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L48
                            return r1
                        L48:
                            kotlin.Unit r5 = kotlin.Unit.f24250a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flowKt__ZipKt$combine$$inlined$unsafeFlow$1L.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            };
            final MutableState mutableState = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt$ListItemsSeenEffect$3$1.4
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    for (Pair pair : (List) obj2) {
                        Object obj3 = pair.d;
                        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) pair.e;
                        ((Function1) mutableState.getD()).invoke(obj3);
                        listItemsTrackerState.d.put(lazyListItemInfo.getL(), lazyListItemInfo);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
