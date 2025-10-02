package com.tealium.core.messaging;

import com.google.android.gms.ads.RequestConfiguration;
import com.tealium.core.messaging.c.u;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/messaging/MessengerService;", "Lcom/tealium/core/messaging/Subscribable;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MessengerService implements Subscribable {

    /* renamed from: a, reason: collision with root package name */
    public final c f19153a;
    public final ContextScope b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/tealium/core/messaging/ExternalListener;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.messaging.MessengerService$send$1", f = "MessengerService.kt", l = {}, m = "invokeSuspend")
    final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Messenger q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Messenger messenger, Continuation continuation) {
            super(2, continuation);
            this.q = messenger;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MessengerService.this.new a(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            aVar.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            c cVar = MessengerService.this.f19153a;
            cVar.b(cVar.new u(this.q));
            return Unit.f24250a;
        }
    }

    public MessengerService(c cVar, ContextScope contextScope) {
        this.f19153a = cVar;
        this.b = contextScope;
    }

    public final void a(Messenger messenger) {
        BuildersKt.c(this.b, null, null, new a(messenger, null), 3);
    }
}
