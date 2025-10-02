package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$unreadNotificationMessages$2$1", f = "MainViewModel.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MainViewModel$unreadNotificationMessages$2$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends InboxMessage>>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainViewModel$unreadNotificationMessages$2$1 mainViewModel$unreadNotificationMessages$2$1 = new MainViewModel$unreadNotificationMessages$2$1(2, continuation);
        mainViewModel$unreadNotificationMessages$2$1.q = obj;
        return mainViewModel$unreadNotificationMessages$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$unreadNotificationMessages$2$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.q;
            this.p = 1;
            if (flowCollector.emit(EmptyList.d, this) == coroutineSingletons) {
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
