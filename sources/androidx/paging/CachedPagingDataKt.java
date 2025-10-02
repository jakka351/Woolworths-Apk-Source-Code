package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharingStarted;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CachedPagingDataKt {
    public static final Flow a(Flow flow, CoroutineScope scope) {
        Intrinsics.h(flow, "<this>");
        Intrinsics.h(scope, "scope");
        Flow flowA = FlowExtKt.a(flow, new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(scope, null));
        CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(3, null);
        Intrinsics.h(flowA, "<this>");
        final Flow flowB = FlowKt.B(new FlowExtKt$simpleRunningReduce$1(flowA, cachedPagingDataKt$cachedIn$2, null));
        return FlowKt.M(new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new CachedPagingDataKt$cachedIn$4(2, null), new Flow<PagingData<Object>>() { // from class: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {223}, m = "emit")
                @SourceDebugExtension
                /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r9)
                        goto L68
                    L27:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L2f:
                        kotlin.ResultKt.b(r9)
                        androidx.paging.MulticastedPagingData r8 = (androidx.paging.MulticastedPagingData) r8
                        androidx.paging.PagingData r9 = new androidx.paging.PagingData
                        androidx.paging.CachedPageEventFlow r2 = r8.c
                        kotlinx.coroutines.flow.Flow r2 = r2.e
                        androidx.paging.MulticastedPagingData$asPagingData$1 r4 = new androidx.paging.MulticastedPagingData$asPagingData$1
                        r5 = 0
                        r4.<init>(r8, r5)
                        kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r6 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1
                        r6.<init>(r4, r2)
                        androidx.paging.MulticastedPagingData$asPagingData$2 r2 = new androidx.paging.MulticastedPagingData$asPagingData$2
                        r2.<init>(r8, r5)
                        kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r4 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1
                        r4.<init>(r6, r2)
                        androidx.paging.PagingData r2 = r8.b
                        androidx.paging.UiReceiver r5 = r2.b
                        androidx.paging.HintReceiver r2 = r2.c
                        androidx.paging.MulticastedPagingData$asPagingData$3 r6 = new androidx.paging.MulticastedPagingData$asPagingData$3
                        r6.<init>(r8)
                        r9.<init>(r4, r5, r2, r6)
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r8 = r7.d
                        java.lang.Object r8 = r8.emit(r9, r0)
                        if (r8 != r1) goto L68
                        return r1
                    L68:
                        kotlin.Unit r8 = kotlin.Unit.f24250a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = ((AbstractFlow) flowB).collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), new CachedPagingDataKt$cachedIn$5(3, null)), scope, SharingStarted.Companion.b, 1);
    }
}
