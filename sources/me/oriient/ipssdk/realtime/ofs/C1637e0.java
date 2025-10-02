package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ips.ValidationService;

/* renamed from: me.oriient.ipssdk.realtime.ofs.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1637e0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26064a;
    public final /* synthetic */ User b;
    public final /* synthetic */ IPSCompletionListener c;
    public final /* synthetic */ IPSError d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637e0(User user, IPSCompletionListener iPSCompletionListener, IPSError iPSError, Continuation continuation) {
        super(2, continuation);
        this.b = user;
        this.c = iPSCompletionListener;
        this.d = iPSError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1637e0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1637e0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26064a;
        if (i == 0) {
            ResultKt.b(obj);
            AuthManager authManagerAccess$getAuthManager = Core.access$getAuthManager(Core.INSTANCE);
            String id = this.b.getSpace().getId();
            this.f26064a = 1;
            if (authManagerAccess$getAuthManager.setSpaceId(id, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ValidationService.safeFailListener(this.c, this.d);
        return Unit.f24250a;
    }
}
