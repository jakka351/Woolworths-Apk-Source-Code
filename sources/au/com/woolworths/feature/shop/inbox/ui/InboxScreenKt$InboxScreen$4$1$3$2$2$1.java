package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SnackbarResult;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.feature.shop.inbox.InboxUiState;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$4$1$3$2$2$1", f = "InboxScreen.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InboxScreenKt$InboxScreen$4$1$3$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InboxUiState q;
    public final /* synthetic */ SnackbarHostState r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxScreenKt$InboxScreen$4$1$3$2$2$1(InboxUiState inboxUiState, SnackbarHostState snackbarHostState, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = inboxUiState;
        this.r = snackbarHostState;
        this.s = str;
        this.t = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InboxScreenKt$InboxScreen$4$1$3$2$2$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxScreenKt$InboxScreen$4$1$3$2$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InboxScreenKt$InboxScreen$4$1$3$2$2$1 inboxScreenKt$InboxScreen$4$1$3$2$2$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            if (!((InboxUiState.Content) this.q).d) {
                return Unit.f24250a;
            }
            this.p = 1;
            inboxScreenKt$InboxScreen$4$1$3$2$2$1 = this;
            obj = SnackbarHostState.b(this.r, this.s, null, null, inboxScreenKt$InboxScreen$4$1$3$2$2$1, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            inboxScreenKt$InboxScreen$4$1$3$2$2$1 = this;
        }
        if (((SnackbarResult) obj) == SnackbarResult.d) {
            inboxScreenKt$InboxScreen$4$1$3$2$2$1.t.invoke(InboxUiEvent.DismissTransientError.f7273a);
        }
        return Unit.f24250a;
    }
}
