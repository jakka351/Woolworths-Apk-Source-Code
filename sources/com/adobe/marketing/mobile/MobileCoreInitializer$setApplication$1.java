package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.internal.eventhub.EventHub;
import com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory;
import com.adobe.marketing.mobile.internal.migration.V4Migrator;
import com.adobe.marketing.mobile.services.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$setApplication$1", f = "MobileCoreInitializer.kt", l = {246}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class MobileCoreInitializer$setApplication$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MutexImpl p;
    public int q;
    public final /* synthetic */ MobileCoreInitializer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileCoreInitializer$setApplication$1(MobileCoreInitializer mobileCoreInitializer, Continuation continuation) {
        super(2, continuation);
        this.r = mobileCoreInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobileCoreInitializer$setApplication$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MobileCoreInitializer$setApplication$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutexImpl mutexImpl;
        AndroidEventHistory androidEventHistory;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl2 = this.r.e;
            this.p = mutexImpl2;
            this.q = 1;
            if (mutexImpl2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutexImpl = mutexImpl2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutexImpl = this.p;
            ResultKt.b(obj);
        }
        try {
            try {
                new V4Migrator().a();
            } catch (Exception e) {
                Log.b("MobileCore", "MobileCoreInitializer", "Migration from V4 SDK failed with error - " + e.getLocalizedMessage(), new Object[0]);
            }
            EventHub eventHub = EventHub.m;
            if (eventHub.k != null) {
                Log.d();
            } else {
                try {
                    androidEventHistory = new AndroidEventHistory();
                } catch (Exception e2) {
                    e2.getMessage();
                    Log.d();
                    androidEventHistory = null;
                }
                eventHub.k = androidEventHistory;
            }
            mutexImpl.c(null);
            return Unit.f24250a;
        } catch (Throwable th) {
            mutexImpl.c(null);
            throw th;
        }
    }
}
