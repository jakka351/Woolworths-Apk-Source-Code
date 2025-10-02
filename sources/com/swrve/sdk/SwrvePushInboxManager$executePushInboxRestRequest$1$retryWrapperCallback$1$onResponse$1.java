package com.swrve.sdk;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.swrve.sdk.SwrvePushInboxManager$executePushInboxRestRequest$1$retryWrapperCallback$1$onResponse$1", f = "SwrvePushInboxManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class SwrvePushInboxManager$executePushInboxRestRequest$1$retryWrapperCallback$1$onResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SwrvePushInboxManager$executePushInboxRestRequest$1$retryWrapperCallback$1$onResponse$1 swrvePushInboxManager$executePushInboxRestRequest$1$retryWrapperCallback$1$onResponse$1 = (SwrvePushInboxManager$executePushInboxRestRequest$1$retryWrapperCallback$1$onResponse$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        swrvePushInboxManager$executePushInboxRestRequest$1$retryWrapperCallback$1$onResponse$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            throw null;
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: Listener Response Exception.", e, new Object[0]);
            return Unit.f24250a;
        }
    }
}
