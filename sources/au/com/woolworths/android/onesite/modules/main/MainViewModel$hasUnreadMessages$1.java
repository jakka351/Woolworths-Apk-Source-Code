package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.feature.shop.inbox.InboxFeature;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"<anonymous>", "", "unreadNotifications", "", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage;", "unreadChatbotMessageCount", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$hasUnreadMessages$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MainViewModel$hasUnreadMessages$1 extends SuspendLambda implements Function3<List<? extends InboxMessage>, Integer, Continuation<? super Boolean>, Object> {
    public /* synthetic */ List p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ MainViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$hasUnreadMessages$1(MainViewModel mainViewModel, Continuation continuation) {
        super(3, continuation);
        this.r = mainViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainViewModel$hasUnreadMessages$1 mainViewModel$hasUnreadMessages$1 = new MainViewModel$hasUnreadMessages$1(this.r, (Continuation) obj3);
        mainViewModel$hasUnreadMessages$1.p = (List) obj;
        mainViewModel$hasUnreadMessages$1.q = (Integer) obj2;
        return mainViewModel$hasUnreadMessages$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        List list = this.p;
        Integer num = this.q;
        boolean zIsEmpty = list.isEmpty();
        boolean z = false;
        boolean z2 = (num != null ? num.intValue() : 0) > 0;
        if (!this.r.e.c(InboxFeature.d) ? !zIsEmpty : !(zIsEmpty && !z2)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
