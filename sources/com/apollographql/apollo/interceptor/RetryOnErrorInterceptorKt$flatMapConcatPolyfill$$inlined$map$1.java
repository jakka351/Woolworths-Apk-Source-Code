package com.apollographql.apollo.interceptor;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1 implements Flow<Flow<Object>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2", f = "RetryOnErrorInterceptor.kt", l = {50, 50}, m = "emit")
        /* renamed from: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public /* synthetic */ Object p;
            public int q;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.p = obj;
                this.q |= Integer.MIN_VALUE;
                AnonymousClass2.this.emit(null, this);
                return Unit.f24250a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r5 = r6 instanceof com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r5 == 0) goto L13
                r5 = r6
                com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2$1 r5 = (com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                int r0 = r5.q
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r5.q = r0
                goto L18
            L13:
                com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2$1 r5 = new com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1$2$1
                r5.<init>(r6)
            L18:
                java.lang.Object r6 = r5.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r0 = r5.q
                r1 = 0
                if (r0 == 0) goto L3b
                r2 = 2
                r3 = 1
                if (r0 == r3) goto L35
                if (r0 != r2) goto L2d
                kotlin.ResultKt.b(r6)
                kotlin.Unit r5 = kotlin.Unit.f24250a
                return r5
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.ResultKt.b(r6)
                r5.q = r2
                throw r1
            L3b:
                kotlin.ResultKt.b(r6)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt$flatMapConcatPolyfill$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        throw null;
    }
}
