package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo;", "unreadNotifications", "", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage;", "unreadChatbotMessageCount", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$unreadMessagesInfo$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MainViewModel$unreadMessagesInfo$1 extends SuspendLambda implements Function3<List<? extends InboxMessage>, Integer, Continuation<? super UnreadMessagesInfo>, Object> {
    public /* synthetic */ List p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ MainViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$unreadMessagesInfo$1(MainViewModel mainViewModel, Continuation continuation) {
        super(3, continuation);
        this.r = mainViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainViewModel$unreadMessagesInfo$1 mainViewModel$unreadMessagesInfo$1 = new MainViewModel$unreadMessagesInfo$1(this.r, (Continuation) obj3);
        mainViewModel$unreadMessagesInfo$1.p = (List) obj;
        mainViewModel$unreadMessagesInfo$1.q = (Integer) obj2;
        return mainViewModel$unreadMessagesInfo$1.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r4 == false) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            kotlin.ResultKt.b(r4)
            java.util.List r4 = r3.p
            java.util.List r4 = (java.util.List) r4
            java.lang.Integer r0 = r3.q
            if (r0 == 0) goto L3c
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            int r0 = r0.intValue()
            if (r0 <= 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            au.com.woolworths.android.onesite.modules.main.MainViewModel r1 = r3.r
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r1 = r1.e
            au.com.woolworths.feature.shop.inbox.InboxFeature r2 = au.com.woolworths.feature.shop.inbox.InboxFeature.d
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto L37
            if (r4 != 0) goto L2f
            if (r0 == 0) goto L2f
            au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo$Both r4 = au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo.Both.f4368a
            return r4
        L2f:
            if (r4 != 0) goto L32
            goto L39
        L32:
            if (r0 == 0) goto L3c
            au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo$ChatbotMessagesOnly r4 = au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo.ChatbotMessagesOnly.f4369a
            return r4
        L37:
            if (r4 != 0) goto L3c
        L39:
            au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo$NotificationsOnly r4 = au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo.NotificationsOnly.f4371a
            return r4
        L3c:
            au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo$None r4 = au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo.None.f4370a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.main.MainViewModel$unreadMessagesInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
