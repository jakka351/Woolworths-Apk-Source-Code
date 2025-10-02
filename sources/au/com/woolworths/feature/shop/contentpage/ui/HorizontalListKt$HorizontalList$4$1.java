package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ui.HorizontalListKt$HorizontalList$4$1", f = "HorizontalList.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class HorizontalListKt$HorizontalList$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LazyListState p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalListKt$HorizontalList$4$1(LazyListState lazyListState, LazyListState lazyListState2, Function1 function1, int i, Continuation continuation) {
        super(2, continuation);
        this.p = lazyListState;
        this.q = lazyListState2;
        this.r = function1;
        this.s = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HorizontalListKt$HorizontalList$4$1(this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HorizontalListKt$HorizontalList$4$1 horizontalListKt$HorizontalList$4$1 = (HorizontalListKt$HorizontalList$4$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        horizontalListKt$HorizontalList$4$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        LazyListState lazyListState = this.p;
        if (!lazyListState.h.a()) {
            LazyListState lazyListState2 = this.q;
            if (!lazyListState2.h.a() && (function1 = this.r) != null) {
                Iterator it = lazyListState2.j().f().iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Object l = ((LazyListItemInfo) next).getL();
                    Integer num = l instanceof Integer ? (Integer) l : null;
                    if (num != null && num.intValue() == this.s) {
                        obj2 = next;
                        break;
                    }
                }
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj2;
                if (lazyListItemInfo != null && ListItemsSeenEffectKt.d(lazyListState2.j(), lazyListItemInfo)) {
                    ArrayList arrayListC = ListItemsSeenEffectKt.c(lazyListState.j(), 0.5f);
                    function1.invoke(new Integer(!arrayListC.isEmpty() ? ((LazyListItemInfo) CollectionsKt.O(arrayListC)).getF996a() : -1));
                }
            }
        }
        return Unit.f24250a;
    }
}
