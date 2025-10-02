package com.google.firebase.firestore;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class FirestoreKt$dataObjects$$inlined$map$2 implements Flow<Object> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    /* renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object p;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.p = obj;
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    @SourceDebugExtension
    /* renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
        @DebugMetadata(c = "com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2", f = "Firestore.kt", l = {50}, m = "emit")
        /* renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2$1, reason: invalid class name */
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
                boolean r0 = r6 instanceof com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r6
                com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2$1 r0 = (com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.q = r1
                goto L18
            L13:
                com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2$1 r0 = new com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r0 = r0.q
                if (r0 == 0) goto L31
                r5 = 1
                if (r0 != r5) goto L29
                kotlin.ResultKt.b(r6)
                kotlin.Unit r5 = kotlin.Unit.f24250a
                return r5
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.ResultKt.b(r6)
                com.google.firebase.firestore.DocumentSnapshot r5 = (com.google.firebase.firestore.DocumentSnapshot) r5
                kotlin.jvm.internal.Intrinsics.o()
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Intrinsics.o();
        throw null;
    }
}
