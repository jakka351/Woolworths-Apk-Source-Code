package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingRestServiceImpl;
import me.oriient.ipssdk.realtime.services.tag.model.TagRequest;

/* loaded from: classes8.dex */
public final class W1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26025a;
    public final /* synthetic */ EventTaggingRestServiceImpl b;
    public final /* synthetic */ TagRequest c;
    public final /* synthetic */ User d;
    public final /* synthetic */ String e;
    public final /* synthetic */ IPSCompletionListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(EventTaggingRestServiceImpl eventTaggingRestServiceImpl, TagRequest tagRequest, User user, String str, IPSCompletionListener iPSCompletionListener, Continuation continuation) {
        super(2, continuation);
        this.b = eventTaggingRestServiceImpl;
        this.c = tagRequest;
        this.d = user;
        this.e = str;
        this.f = iPSCompletionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new W1(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26025a;
        if (i == 0) {
            ResultKt.b(obj);
            EventTaggingRestServiceImpl eventTaggingRestServiceImpl = this.b;
            TagRequest tagRequest = this.c;
            User user = this.d;
            String str = this.e;
            IPSCompletionListener iPSCompletionListener = this.f;
            this.f26025a = 1;
            if (EventTaggingRestServiceImpl.m477access$sendEventTagq7CU6k(eventTaggingRestServiceImpl, tagRequest, user, str, iPSCompletionListener, this) == coroutineSingletons) {
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
