package androidx.datastore.core;

import androidx.datastore.core.UpdatingDataContextElement;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/DataStore;", "Companion", "InitDataStore", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DataStoreImpl<T> implements DataStore<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Storage f2560a;
    public final CorruptionHandler b;
    public final CoroutineScope c;
    public int f;
    public Job g;
    public final InitDataStore i;
    public final SimpleActor l;
    public final Flow d = FlowKt.B(new DataStoreImpl$data$1(this, null));
    public final MutexImpl e = MutexKt.a();
    public final DataStoreInMemoryCache h = new DataStoreInMemoryCache();
    public final Lazy j = LazyKt.b(new Function0<StorageConnection<Object>>() { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.f2560a.a();
        }
    });
    public final Lazy k = LazyKt.b(new Function0<InterProcessCoordinator>() { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((StorageConnection) this.h.j.getD()).getC();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$Companion;", "", "", "BUG_MESSAGE", "Ljava/lang/String;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class InitDataStore extends RunOnce {
        public List c;

        public InitDataStore(List list) {
            this.c = CollectionsKt.G0(list);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws androidx.datastore.core.CorruptionException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.s = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.q
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r0 = r0.p
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.ResultKt.b(r7)
                goto L64
            L2e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L36:
                java.lang.Object r0 = r0.p
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.ResultKt.b(r7)
                goto L74
            L3e:
                kotlin.ResultKt.b(r7)
                java.util.List r7 = r6.c
                androidx.datastore.core.DataStoreImpl r2 = androidx.datastore.core.DataStoreImpl.this
                if (r7 == 0) goto L67
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L4e
                goto L67
            L4e:
                androidx.datastore.core.InterProcessCoordinator r7 = r2.g()
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r4 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                r5 = 0
                r4.<init>(r2, r6, r5)
                r0.p = r6
                r0.s = r3
                java.lang.Object r7 = r7.c(r4, r0)
                if (r7 != r1) goto L63
                goto L72
            L63:
                r0 = r6
            L64:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L76
            L67:
                r0.p = r6
                r0.s = r4
                r7 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.f(r2, r7, r0)
                if (r7 != r1) goto L73
            L72:
                return r1
            L73:
                r0 = r6
            L74:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L76:
                androidx.datastore.core.DataStoreImpl r0 = androidx.datastore.core.DataStoreImpl.this
                androidx.datastore.core.DataStoreInMemoryCache r0 = r0.h
                r0.b(r7)
                kotlin.Unit r7 = kotlin.Unit.f24250a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope) {
        this.f2560a = storage;
        this.b = corruptionHandler;
        this.c = coroutineScope;
        this.i = new InitDataStore(list);
        this.l = new SimpleActor(coroutineScope, new DataStoreImpl$writeActor$1(this), new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.datastore.core.DataStoreImpl r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.datastore.core.DataStoreImpl$decrementCollector$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl$decrementCollector$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.MutexImpl r4 = r0.q
            androidx.datastore.core.DataStoreImpl r0 = r0.p
            kotlin.ResultKt.b(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r5)
            kotlinx.coroutines.sync.MutexImpl r5 = r4.e
            r0.p = r4
            r0.q = r5
            r0.t = r3
            java.lang.Object r0 = r5.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L5c
            int r1 = r1 + (-1)
            r4.f = r1     // Catch: java.lang.Throwable -> L5c
            if (r1 != 0) goto L5e
            kotlinx.coroutines.Job r1 = r4.g     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L59
            kotlinx.coroutines.JobSupport r1 = (kotlinx.coroutines.JobSupport) r1     // Catch: java.lang.Throwable -> L5c
            r1.cancel(r0)     // Catch: java.lang.Throwable -> L5c
        L59:
            r4.g = r0     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r4 = move-exception
            goto L64
        L5e:
            r5.c(r0)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L64:
            r5.c(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.b(androidx.datastore.core.DataStoreImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(8:69|(1:(1:(2:18|19))(3:20|21|22))|13|14|62|(1:64)(1:65)|66|67)(5:23|68|24|(3:26|72|27)(3:37|(1:39)(1:40)|(2:42|(2:44|(1:46))(2:53|54))(2:55|(2:57|58)(2:59|60)))|50)|47|70|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.datastore.core.DataStoreImpl r9, androidx.datastore.core.Message.Update r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.c(androidx.datastore.core.DataStoreImpl, androidx.datastore.core.Message$Update, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.datastore.core.DataStoreImpl r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.datastore.core.DataStoreImpl$incrementCollector$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl$incrementCollector$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.MutexImpl r4 = r0.q
            androidx.datastore.core.DataStoreImpl r0 = r0.p
            kotlin.ResultKt.b(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r5)
            kotlinx.coroutines.sync.MutexImpl r5 = r4.e
            r0.p = r4
            r0.q = r5
            r0.t = r3
            java.lang.Object r0 = r5.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L5e
            int r1 = r1 + r3
            r4.f = r1     // Catch: java.lang.Throwable -> L5e
            if (r1 != r3) goto L60
            kotlinx.coroutines.CoroutineScope r1 = r4.c     // Catch: java.lang.Throwable -> L5e
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r2 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L5e
            r3 = 3
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.c(r1, r0, r0, r2, r3)     // Catch: java.lang.Throwable -> L5e
            r4.g = r1     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r4 = move-exception
            goto L66
        L60:
            r5.c(r0)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L66:
            r5.c(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.d(androidx.datastore.core.DataStoreImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(androidx.datastore.core.DataStoreImpl r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.e(androidx.datastore.core.DataStoreImpl, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: CorruptionException -> 0x005f, TryCatch #3 {CorruptionException -> 0x005f, blocks: (B:19:0x005a, B:54:0x00fe, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013b A[Catch: all -> 0x0167, TryCatch #1 {all -> 0x0167, blocks: (B:61:0x0129, B:63:0x013b, B:64:0x0143), top: B:80:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143 A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #1 {all -> 0x0167, blocks: (B:61:0x0129, B:63:0x013b, B:64:0x0143), top: B:80:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(androidx.datastore.core.DataStoreImpl r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.f(androidx.datastore.core.DataStoreImpl, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.DataStore
    public final Object a(Function2 function2, Continuation continuation) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuation.getE().get(UpdatingDataContextElement.Companion.Key.d);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.b(this);
        }
        return BuildersKt.f(new UpdatingDataContextElement(updatingDataContextElement, this), new DataStoreImpl$updateData$2(this, function2, null), continuation);
    }

    public final InterProcessCoordinator g() {
        return (InterProcessCoordinator) this.k.getD();
    }

    @Override // androidx.datastore.core.DataStore
    /* renamed from: getData, reason: from getter */
    public final Flow getD() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.b(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.q
            androidx.datastore.core.DataStoreImpl r0 = r0.p
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            androidx.datastore.core.DataStoreImpl r2 = r0.p
            kotlin.ResultKt.b(r6)
            goto L51
        L3e:
            kotlin.ResultKt.b(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.g()
            r0.p = r5
            r0.t = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl$InitDataStore r4 = r2.i     // Catch: java.lang.Throwable -> L69
            r0.p = r2     // Catch: java.lang.Throwable -> L69
            r0.q = r6     // Catch: java.lang.Throwable -> L69
            r0.t = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r4.b(r0)     // Catch: java.lang.Throwable -> L69
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L69:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6d:
            androidx.datastore.core.DataStoreInMemoryCache r0 = r0.h
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.b(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object i(ContinuationImpl continuationImpl) {
        return ((StorageConnection) this.j.getD()).a(new StorageConnectionKt$readData$2(3, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r11, boolean r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$IntRef r11 = r0.p
            kotlin.ResultKt.b(r13)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.ResultKt.b(r13)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            kotlin.Lazy r13 = r10.j
            java.lang.Object r13 = r13.getD()
            androidx.datastore.core.StorageConnection r13 = (androidx.datastore.core.StorageConnection) r13
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.p = r5
            r0.s = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.d
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.j(java.lang.Object, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
