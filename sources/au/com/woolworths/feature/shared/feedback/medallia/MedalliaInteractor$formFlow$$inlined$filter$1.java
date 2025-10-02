package au.com.woolworths.feature.shared.feedback.medallia;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MedalliaInteractor$formFlow$$inlined$filter$1 implements Flow<MedalliaFormEvent> {
    public final /* synthetic */ Flow d;
    public final /* synthetic */ String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector d;
        public final /* synthetic */ String e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1$2", f = "MedalliaInteractor.kt", l = {50}, m = "emit")
        /* renamed from: au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1$2$1, reason: invalid class name */
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
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, String str) {
            this.d = flowCollector;
            this.e = str;
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
                boolean r0 = r6 instanceof au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r6
                au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.q = r1
                goto L18
            L13:
                au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1$2$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.q
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.ResultKt.b(r6)
                goto L4c
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.ResultKt.b(r6)
                r6 = r5
                au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent r6 = (au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent) r6
                java.lang.String r6 = r6.getF6484a()
                java.lang.String r2 = r4.e
                boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r2)
                if (r6 == 0) goto L4c
                r0.q = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L4c
                return r1
            L4c:
                kotlin.Unit r5 = kotlin.Unit.f24250a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public MedalliaInteractor$formFlow$$inlined$filter$1(Flow flow, String str) {
        this.d = flow;
        this.e = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.d.collect(new AnonymousClass2(flowCollector, this.e), continuation);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }
}
