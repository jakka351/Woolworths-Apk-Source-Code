package androidx.paging;

import androidx.paging.HintHandler;
import androidx.paging.ViewportHint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/PageFetcher;", "", "Key", "Value", "GenerationInfo", "PagerHintReceiver", "PagerUiReceiver", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PageFetcher<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3555a;
    public final PagingConfig b;
    public final ConflatedEventBus c = new ConflatedEventBus();
    public final ConflatedEventBus d = new ConflatedEventBus();
    public final Flow e = SimpleChannelFlowKt.a(new PageFetcher$flow$1(this, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageFetcher$GenerationInfo;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GenerationInfo<Key, Value> {

        /* renamed from: a, reason: collision with root package name */
        public final PageFetcherSnapshot f3556a;
        public final PagingState b;
        public final JobImpl c;

        public GenerationInfo(PageFetcherSnapshot pageFetcherSnapshot, PagingState pagingState, JobImpl jobImpl) {
            this.f3556a = pageFetcherSnapshot;
            this.b = pagingState;
            this.c = jobImpl;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PageFetcher$PagerHintReceiver;", "", "Key", "Value", "Landroidx/paging/HintReceiver;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PagerHintReceiver<Key, Value> implements HintReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final PageFetcherSnapshot f3557a;

        public PagerHintReceiver(PageFetcherSnapshot pageFetcherSnapshot) {
            this.f3557a = pageFetcherSnapshot;
        }

        @Override // androidx.paging.HintReceiver
        public final void a(final ViewportHint viewportHint) {
            HintHandler hintHandler = this.f3557a.h;
            hintHandler.getClass();
            hintHandler.f3538a.a(viewportHint instanceof ViewportHint.Access ? (ViewportHint.Access) viewportHint : null, new Function2<HintHandler.HintFlow, HintHandler.HintFlow, Unit>() { // from class: androidx.paging.HintHandler$processHint$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    HintHandler.HintFlow prependHint = (HintHandler.HintFlow) obj;
                    HintHandler.HintFlow appendHint = (HintHandler.HintFlow) obj2;
                    Intrinsics.h(prependHint, "prependHint");
                    Intrinsics.h(appendHint, "appendHint");
                    ViewportHint viewportHint2 = prependHint.f3539a;
                    LoadType loadType = LoadType.e;
                    ViewportHint viewportHint3 = viewportHint;
                    if (HintHandlerKt.a(viewportHint3, viewportHint2, loadType)) {
                        prependHint.f3539a = viewportHint3;
                        prependHint.b.f(viewportHint3);
                    }
                    if (HintHandlerKt.a(viewportHint3, appendHint.f3539a, LoadType.f)) {
                        appendHint.f3539a = viewportHint3;
                        appendHint.b.f(viewportHint3);
                    }
                    return Unit.f24250a;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PageFetcher$PagerUiReceiver;", "Landroidx/paging/UiReceiver;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PagerUiReceiver implements UiReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final ConflatedEventBus f3558a;
        public final /* synthetic */ PageFetcher b;

        public PagerUiReceiver(PageFetcher pageFetcher, ConflatedEventBus retryEventBus) {
            Intrinsics.h(retryEventBus, "retryEventBus");
            this.b = pageFetcher;
            this.f3558a = retryEventBus;
        }

        @Override // androidx.paging.UiReceiver
        public final void g() {
            this.f3558a.a(Unit.f24250a);
        }

        @Override // androidx.paging.UiReceiver
        public final void h() {
            this.b.c.a(Boolean.TRUE);
        }
    }

    public PageFetcher(Function1 function1, PagingConfig pagingConfig) {
        this.f3555a = function1;
        this.b = pagingConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.paging.PageFetcher r9, androidx.paging.PagingSource r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof androidx.paging.PageFetcher$generateNewPagingSource$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = (androidx.paging.PageFetcher$generateNewPagingSource$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            androidx.paging.PagingSource r10 = r0.q
            androidx.paging.PageFetcher r9 = r0.p
            kotlin.ResultKt.b(r11)
        L2a:
            r4 = r9
            goto L46
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r9.f3555a
            r0.p = r9
            r0.q = r10
            r0.t = r3
            java.lang.Object r11 = r11.invoke(r0)
            if (r11 != r1) goto L2a
            return r1
        L46:
            androidx.paging.PagingSource r11 = (androidx.paging.PagingSource) r11
            boolean r9 = r11 instanceof androidx.paging.CompatLegacyPagingSource
            if (r9 == 0) goto L56
            r9 = r11
            androidx.paging.CompatLegacyPagingSource r9 = (androidx.paging.CompatLegacyPagingSource) r9
            androidx.paging.PagingConfig r0 = r4.b
            int r0 = r0.f3572a
            r9.a(r0)
        L56:
            if (r11 == r10) goto L9f
            androidx.paging.PageFetcher$generateNewPagingSource$3 r2 = new androidx.paging.PageFetcher$generateNewPagingSource$3
            java.lang.String r7 = "invalidate()V"
            r8 = 0
            r3 = 0
            java.lang.Class<androidx.paging.PageFetcher> r5 = androidx.paging.PageFetcher.class
            java.lang.String r6 = "invalidate"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.getClass()
            androidx.paging.InvalidateCallbackTracker r9 = r11.f3581a
            r9.b(r2)
            if (r10 == 0) goto L81
            androidx.paging.PageFetcher$generateNewPagingSource$4 r2 = new androidx.paging.PageFetcher$generateNewPagingSource$4
            java.lang.String r7 = "invalidate()V"
            r8 = 0
            r3 = 0
            java.lang.Class<androidx.paging.PageFetcher> r5 = androidx.paging.PageFetcher.class
            java.lang.String r6 = "invalidate"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.paging.InvalidateCallbackTracker r9 = r10.f3581a
            r9.c(r2)
        L81:
            if (r10 == 0) goto L86
            r10.c()
        L86:
            r9 = 3
            boolean r10 = androidx.paging.PagingLogger.a(r9)
            if (r10 == 0) goto L9e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Generated new PagingSource "
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            androidx.paging.PagingLogger.b(r9, r10)
        L9e:
            return r11
        L9f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.a(androidx.paging.PageFetcher, androidx.paging.PagingSource, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
