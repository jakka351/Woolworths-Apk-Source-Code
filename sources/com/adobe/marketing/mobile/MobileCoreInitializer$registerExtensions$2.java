package com.adobe.marketing.mobile;

import androidx.compose.ui.graphics.colorspace.a;
import com.adobe.marketing.mobile.internal.eventhub.EventHub;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2", f = "MobileCoreInitializer.kt", l = {246}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class MobileCoreInitializer$registerExtensions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MutexImpl p;
    public LinkedHashSet q;
    public a r;
    public int s;
    public final /* synthetic */ MobileCoreInitializer t;
    public final /* synthetic */ LinkedHashSet u;
    public final /* synthetic */ a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileCoreInitializer$registerExtensions$2(MobileCoreInitializer mobileCoreInitializer, LinkedHashSet linkedHashSet, a aVar, Continuation continuation) {
        super(2, continuation);
        this.t = mobileCoreInitializer;
        this.u = linkedHashSet;
        this.v = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobileCoreInitializer$registerExtensions$2(this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MobileCoreInitializer$registerExtensions$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinkedHashSet linkedHashSet;
        MutexImpl mutexImpl;
        final a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            MutexImpl mutexImpl2 = this.t.e;
            this.p = mutexImpl2;
            linkedHashSet = this.u;
            this.q = linkedHashSet;
            a aVar2 = this.v;
            this.r = aVar2;
            this.s = 1;
            if (mutexImpl2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutexImpl = mutexImpl2;
            aVar = aVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.r;
            linkedHashSet = this.q;
            mutexImpl = this.p;
            ResultKt.b(obj);
        }
        try {
            EventHub.m.j(linkedHashSet, new Function0<Unit>() { // from class: com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    AdobeCallback adobeCallback = aVar;
                    if (adobeCallback != null) {
                        adobeCallback.a(null);
                    }
                    return Unit.f24250a;
                }
            });
            mutexImpl.c(null);
            return Unit.f24250a;
        } catch (Throwable th) {
            mutexImpl.c(null);
            throw th;
        }
    }
}
