package au.com.woolworths.shop.aem.components.ui.chatentrycard;

import androidx.compose.runtime.MutableIntState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt$SpecialPromptMarqueeTextField$1$1", f = "ChatEntryCardUi.kt", l = {241}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChatEntryCardUiKt$SpecialPromptMarqueeTextField$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ List q;
    public final /* synthetic */ MutableIntState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatEntryCardUiKt$SpecialPromptMarqueeTextField$1$1(List list, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.q = list;
        this.r = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatEntryCardUiKt$SpecialPromptMarqueeTextField$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((ChatEntryCardUiKt$SpecialPromptMarqueeTextField$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:12:0x0023). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.p
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.b(r6)
            goto L23
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.ResultKt.b(r6)
        L18:
            r5.p = r2
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r3, r5)
            if (r6 != r0) goto L23
            return r0
        L23:
            androidx.compose.runtime.MutableIntState r6 = r5.r
            int r1 = r6.d()
            int r1 = r1 + r2
            java.util.List r3 = r5.q
            int r3 = r3.size()
            int r1 = r1 % r3
            r6.i(r1)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt$SpecialPromptMarqueeTextField$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
