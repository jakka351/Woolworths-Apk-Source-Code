package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.material.DismissState;
import androidx.compose.material.DismissValue;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.feature.shop.inbox.domain.NotificationItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$2$5$1$1", f = "InboxScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InboxScreenKt$ContentUi$3$1$2$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ DismissState p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ NotificationItem r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxScreenKt$ContentUi$3$1$2$5$1$1(DismissState dismissState, Function1 function1, NotificationItem notificationItem, Continuation continuation) {
        super(2, continuation);
        this.p = dismissState;
        this.q = function1;
        this.r = notificationItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InboxScreenKt$ContentUi$3$1$2$5$1$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InboxScreenKt$ContentUi$3$1$2$5$1$1 inboxScreenKt$ContentUi$3$1$2$5$1$1 = (InboxScreenKt$ContentUi$3$1$2$5$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        inboxScreenKt$ContentUi$3$1$2$5$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (((SnapshotMutableStateImpl) this.p.c).getD() == DismissValue.f) {
            this.q.invoke(new InboxUiEvent.DeleteItem(this.r.f7288a));
        }
        return Unit.f24250a;
    }
}
