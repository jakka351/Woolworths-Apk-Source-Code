package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {54, 55}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FlowExtKt$simpleScan$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 s;
    public final /* synthetic */ Function3 t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ Function3 e;
        public final /* synthetic */ FlowCollector f;

        public AnonymousClass1(Ref.ObjectRef objectRef, Function3 function3, FlowCollector flowCollector) {
            this.d = objectRef;
            this.e = function3;
            this.f = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        
            if (r6.emit(r7, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$simpleScan$1$1$emit$1) r0
                int r1 = r0.t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.t = r1
                goto L18
            L13:
                androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.r
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.b(r7)
                goto L6e
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.q
                java.lang.Object r2 = r0.p
                androidx.paging.FlowExtKt$simpleScan$1$1 r2 = (androidx.paging.FlowExtKt$simpleScan$1.AnonymousClass1) r2
                kotlin.ResultKt.b(r7)
                goto L58
            L3c:
                kotlin.ResultKt.b(r7)
                kotlin.jvm.internal.Ref$ObjectRef r7 = r5.d
                java.lang.Object r2 = r7.d
                r0.p = r5
                r0.q = r7
                r0.t = r4
                kotlin.jvm.functions.Function3 r4 = r5.e
                androidx.paging.PageFetcher$flow$1$2 r4 = (androidx.paging.PageFetcher$flow$1.AnonymousClass2) r4
                java.lang.Object r6 = r4.invoke(r2, r6, r0)
                if (r6 != r1) goto L54
                goto L6d
            L54:
                r2 = r7
                r7 = r6
                r6 = r2
                r2 = r5
            L58:
                r6.d = r7
                kotlinx.coroutines.flow.FlowCollector r6 = r2.f
                kotlin.jvm.internal.Ref$ObjectRef r7 = r2.d
                java.lang.Object r7 = r7.d
                r2 = 0
                r0.p = r2
                r0.q = r2
                r0.t = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L6e
            L6d:
                return r1
            L6e:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleScan$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleScan$1(FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.s = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        this.t = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.s, this.t, continuation);
        flowExtKt$simpleScan$1.r = obj;
        return flowExtKt$simpleScan$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$simpleScan$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r6.s.collect(r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.q
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            kotlin.ResultKt.b(r7)
            goto L55
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.p
            java.lang.Object r4 = r6.r
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.b(r7)
            goto L3f
        L23:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.r
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r1.d = r2
            r6.r = r7
            r6.p = r1
            r6.q = r4
            java.lang.Object r4 = r7.emit(r2, r6)
            if (r4 != r0) goto L3e
            goto L54
        L3e:
            r4 = r7
        L3f:
            androidx.paging.FlowExtKt$simpleScan$1$1 r7 = new androidx.paging.FlowExtKt$simpleScan$1$1
            kotlin.jvm.functions.Function3 r5 = r6.t
            r7.<init>(r1, r5, r4)
            r6.r = r2
            r6.p = r2
            r6.q = r3
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r1 = r6.s
            java.lang.Object r7 = r1.collect(r7, r6)
            if (r7 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleScan$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
