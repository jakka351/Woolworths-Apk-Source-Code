package com.apollographql.apollo.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import okio.BufferedSource;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lokio/BufferedSource;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class MultipartKt$multipartBodyFlow$2 extends SuspendLambda implements Function3<FlowCollector<? super BufferedSource>, Throwable, Continuation<? super Unit>, Object> {
    public /* synthetic */ FlowCollector p;
    public final /* synthetic */ Ref.ObjectRef q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$multipartBodyFlow$2(Ref.ObjectRef objectRef, Continuation continuation) {
        super(3, continuation);
        this.q = objectRef;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MultipartKt$multipartBodyFlow$2 multipartKt$multipartBodyFlow$2 = new MultipartKt$multipartBodyFlow$2(this.q, (Continuation) obj3);
        multipartKt$multipartBodyFlow$2.p = (FlowCollector) obj;
        Unit unit = Unit.f24250a;
        multipartKt$multipartBodyFlow$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            MultipartReader multipartReader = (MultipartReader) this.q.d;
            if (multipartReader != null) {
                multipartReader.close();
            }
        } catch (Throwable th) {
            ResultKt.a(th);
        }
        return Unit.f24250a;
    }
}
