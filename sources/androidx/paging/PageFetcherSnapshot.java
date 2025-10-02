package androidx.paging;

import androidx.paging.HintHandler;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageFetcherSnapshot;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PageFetcherSnapshot<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3559a;
    public final PagingSource b;
    public final PagingConfig c;
    public final Flow d;
    public final RemoteMediatorConnection e;
    public final PagingState f;
    public final Function0 g;
    public final HintHandler h;
    public final AtomicBoolean i;
    public final BufferedChannel j;
    public final PageFetcherSnapshotState.Holder k;
    public final JobImpl l;
    public final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 m;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.PageFetcherSnapshot$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3560a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3560a = iArr;
        }
    }

    public PageFetcherSnapshot(Object obj, PagingSource pagingSource, PagingConfig pagingConfig, ConflatedEventBus$special$$inlined$mapNotNull$1 retryFlow, RemoteMediatorConnection remoteMediatorConnection, PagingState pagingState, Function0 function0) {
        Intrinsics.h(pagingSource, "pagingSource");
        Intrinsics.h(retryFlow, "retryFlow");
        this.f3559a = obj;
        this.b = pagingSource;
        this.c = pagingConfig;
        this.d = retryFlow;
        this.e = remoteMediatorConnection;
        this.f = pagingState;
        this.g = function0;
        this.h = new HintHandler();
        this.i = new AtomicBoolean(false);
        this.j = ChannelKt.a(-2, 6, null);
        this.k = new PageFetcherSnapshotState.Holder(pagingConfig);
        JobImpl jobImplA = JobKt.a();
        this.l = jobImplA;
        this.m = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new PageFetcherSnapshot$pageEventFlow$2(this, null), SimpleChannelFlowKt.a(new CancelableChannelFlowKt$cancelableChannelFlow$1(jobImplA, new PageFetcherSnapshot$pageEventFlow$1(this, null), null)));
    }

    public static final Object a(final PageFetcherSnapshot pageFetcherSnapshot, FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, final LoadType loadType, SuspendLambda suspendLambda) {
        pageFetcherSnapshot.getClass();
        Flow flowA = FlowExtKt.a(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, pageFetcherSnapshot, loadType));
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, null);
        Intrinsics.h(flowA, "<this>");
        Object objCollect = FlowKt.c(FlowKt.B(new FlowExtKt$simpleRunningReduce$1(flowA, pageFetcherSnapshot$collectAsGenerationalViewportHints$3, null)), -1).collect(new FlowCollector() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                Object objB = PageFetcherSnapshot.b(this.d, loadType, (GenerationalViewportHint) obj, continuation);
                return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
            }
        }, suspendLambda);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x067b, code lost:
    
        if (r5.a(r3) != r4) goto L242;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:201:0x0639, B:204:0x0642], limit reached: 247 */
    /* JADX WARN: Path cross not found for [B:207:0x0647, B:210:0x064f], limit reached: 247 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x058f A[Catch: all -> 0x05c8, TryCatch #6 {all -> 0x05c8, blocks: (B:176:0x0583, B:178:0x058f, B:186:0x05d0, B:188:0x05e8, B:190:0x05f0, B:192:0x05f4, B:194:0x05f9, B:193:0x05f7, B:195:0x05fc), top: B:250:0x0583 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05e8 A[Catch: all -> 0x05c8, TryCatch #6 {all -> 0x05c8, blocks: (B:176:0x0583, B:178:0x058f, B:186:0x05d0, B:188:0x05e8, B:190:0x05f0, B:192:0x05f4, B:194:0x05f9, B:193:0x05f7, B:195:0x05fc), top: B:250:0x0583 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05f4 A[Catch: all -> 0x05c8, TryCatch #6 {all -> 0x05c8, blocks: (B:176:0x0583, B:178:0x058f, B:186:0x05d0, B:188:0x05e8, B:190:0x05f0, B:192:0x05f4, B:194:0x05f9, B:193:0x05f7, B:195:0x05fc), top: B:250:0x0583 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05f7 A[Catch: all -> 0x05c8, TryCatch #6 {all -> 0x05c8, blocks: (B:176:0x0583, B:178:0x058f, B:186:0x05d0, B:188:0x05e8, B:190:0x05f0, B:192:0x05f4, B:194:0x05f9, B:193:0x05f7, B:195:0x05fc), top: B:250:0x0583 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0328 A[Catch: all -> 0x034e, TRY_LEAVE, TryCatch #8 {all -> 0x034e, blocks: (B:73:0x0313, B:75:0x0328), top: B:254:0x0313 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c2  */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v29, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v25, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x0652 -> B:224:0x069a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x0656 -> B:224:0x069a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:216:0x067b -> B:242:0x067e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.paging.PageFetcherSnapshot r21, androidx.paging.LoadType r22, androidx.paging.GenerationalViewportHint r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.b(androidx.paging.PageFetcherSnapshot, androidx.paging.LoadType, androidx.paging.GenerationalViewportHint, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object c(PageFetcherSnapshot pageFetcherSnapshot, final LoadType loadType, final ViewportHint viewportHint, Continuation continuation) throws Throwable {
        pageFetcherSnapshot.getClass();
        int i = WhenMappings.f3560a[loadType.ordinal()];
        Unit unit = Unit.f24250a;
        if (i == 1) {
            Object objF = pageFetcherSnapshot.f((ContinuationImpl) continuation);
            return objF == CoroutineSingletons.d ? objF : unit;
        }
        if (viewportHint == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        HintHandler hintHandler = pageFetcherSnapshot.h;
        hintHandler.getClass();
        if (loadType == LoadType.e || loadType == LoadType.f) {
            hintHandler.f3538a.a(null, new Function2<HintHandler.HintFlow, HintHandler.HintFlow, Unit>() { // from class: androidx.paging.HintHandler$forceSetHint$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    HintHandler.HintFlow prependHint = (HintHandler.HintFlow) obj;
                    HintHandler.HintFlow appendHint = (HintHandler.HintFlow) obj2;
                    Intrinsics.h(prependHint, "prependHint");
                    Intrinsics.h(appendHint, "appendHint");
                    LoadType loadType2 = loadType;
                    LoadType loadType3 = LoadType.e;
                    ViewportHint viewportHint2 = viewportHint;
                    if (loadType2 == loadType3) {
                        prependHint.f3539a = viewportHint2;
                        if (viewportHint2 != null) {
                            prependHint.b.f(viewportHint2);
                        }
                    } else {
                        appendHint.f3539a = viewportHint2;
                        if (viewportHint2 != null) {
                            appendHint.b.f(viewportHint2);
                        }
                    }
                    return Unit.f24250a;
                }
            });
            return unit;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public static final void d(PageFetcherSnapshot pageFetcherSnapshot, CoroutineScope coroutineScope) {
        PagingConfig pagingConfig = pageFetcherSnapshot.c;
        BuildersKt.c(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$2(pageFetcherSnapshot, null), 3);
        BuildersKt.c(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$3(pageFetcherSnapshot, null), 3);
    }

    public static String h(LoadType loadType, Object obj, PagingSource.LoadResult loadResult) {
        if (loadResult == null) {
            return "End " + loadType + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + obj + ". Returned " + loadResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.PageFetcherSnapshot$currentPagingState$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = (androidx.paging.PageFetcherSnapshot$currentPagingState$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.MutexImpl r1 = r0.r
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r0.q
            androidx.paging.PageFetcherSnapshot r0 = r0.p
            kotlin.ResultKt.b(r5)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.b(r5)
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r4.k
            kotlinx.coroutines.sync.MutexImpl r5 = r2.f3563a
            r0.p = r4
            r0.q = r2
            r0.r = r5
            r0.u = r3
            java.lang.Object r0 = r5.a(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
            r1 = r5
        L4d:
            r5 = 0
            androidx.paging.PageFetcherSnapshotState r2 = r2.b     // Catch: java.lang.Throwable -> L5e
            androidx.paging.HintHandler r0 = r0.h     // Catch: java.lang.Throwable -> L5e
            androidx.paging.HintHandler$State r0 = r0.f3538a     // Catch: java.lang.Throwable -> L5e
            androidx.paging.ViewportHint$Access r0 = r0.c     // Catch: java.lang.Throwable -> L5e
            androidx.paging.PagingState r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L5e
            r1.c(r5)
            return r0
        L5e:
            r0 = move-exception
            r1.c(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171 A[Catch: all -> 0x0175, TRY_ENTER, TryCatch #2 {all -> 0x0175, blocks: (B:54:0x0155, B:57:0x0171, B:60:0x0178, B:62:0x017f), top: B:138:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #2 {all -> 0x0175, blocks: (B:54:0x0155, B:57:0x0171, B:60:0x0178, B:62:0x017f), top: B:138:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0230  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.paging.PagingSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v29, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final PagingSource.LoadParams g(LoadType loadType, Object obj) {
        LoadType loadType2 = LoadType.d;
        PagingConfig pagingConfig = this.c;
        int i = loadType == loadType2 ? pagingConfig.d : pagingConfig.f3572a;
        boolean z = pagingConfig.c;
        Intrinsics.h(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            return new PagingSource.LoadParams.Refresh(obj, z, i);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new PagingSource.LoadParams.Prepend(obj, z, i);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (obj != null) {
            return new PagingSource.LoadParams.Append(obj, z, i);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    public final Object i(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        int i3;
        pageFetcherSnapshotState.getClass();
        ArrayList arrayList = pageFetcherSnapshotState.c;
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            i3 = pageFetcherSnapshotState.g;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = pageFetcherSnapshotState.h;
        }
        if (i == i3 && !(pageFetcherSnapshotState.l.a(loadType) instanceof LoadState.Error) && i2 < this.c.b) {
            return loadType == LoadType.e ? ((PagingSource.LoadResult.Page) CollectionsKt.D(arrayList)).e : ((PagingSource.LoadResult.Page) CollectionsKt.O(arrayList)).f;
        }
        return null;
    }

    public final Object j(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, LoadState.Error error, ContinuationImpl continuationImpl) {
        MutableLoadStateCollection mutableLoadStateCollection = pageFetcherSnapshotState.l;
        if (!Intrinsics.c(mutableLoadStateCollection.a(loadType), error)) {
            mutableLoadStateCollection.c(loadType, error);
            Object objZ = this.j.z(new PageEvent.LoadStateUpdate(mutableLoadStateCollection.d(), null), continuationImpl);
            if (objZ == CoroutineSingletons.d) {
                return objZ;
            }
        }
        return Unit.f24250a;
    }

    public final Object k(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, ContinuationImpl continuationImpl) {
        MutableLoadStateCollection mutableLoadStateCollection = pageFetcherSnapshotState.l;
        LoadState loadStateA = mutableLoadStateCollection.a(loadType);
        LoadState.Loading loading = LoadState.Loading.b;
        if (!Intrinsics.c(loadStateA, loading)) {
            mutableLoadStateCollection.c(loadType, loading);
            Object objZ = this.j.z(new PageEvent.LoadStateUpdate(mutableLoadStateCollection.d(), null), continuationImpl);
            if (objZ == CoroutineSingletons.d) {
                return objZ;
            }
        }
        return Unit.f24250a;
    }
}
