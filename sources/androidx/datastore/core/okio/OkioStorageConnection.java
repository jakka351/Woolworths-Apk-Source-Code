package androidx.datastore.core.okio;

import androidx.datastore.OkioSerializerWrapper;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/StorageConnection;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f2578a;
    public final Path b;
    public final OkioSerializerWrapper c;
    public final InterProcessCoordinator d;
    public final Function0 e;
    public final AtomicBoolean f;
    public final MutexImpl g;

    public OkioStorageConnection(FileSystem fileSystem, Path path, OkioSerializerWrapper okioSerializerWrapper, InterProcessCoordinator coordinator, Function0 function0) {
        Intrinsics.h(fileSystem, "fileSystem");
        Intrinsics.h(path, "path");
        Intrinsics.h(coordinator, "coordinator");
        this.f2578a = fileSystem;
        this.b = path;
        this.c = okioSerializerWrapper;
        this.d = coordinator;
        this.e = function0;
        this.f = new AtomicBoolean();
        this.g = MutexKt.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x007f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x007f, blocks: (B:33:0x007e, B:42:0x008f, B:41:0x008c, B:38:0x0087), top: B:60:0x0020, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function3 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection$readScope$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r9 = r0.r
            androidx.datastore.core.okio.OkioReadScope r1 = r0.q
            androidx.datastore.core.okio.OkioStorageConnection r0 = r0.p
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L6e
        L2e:
            r10 = move-exception
            goto L87
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.b(r10)
            androidx.datastore.core.okio.AtomicBoolean r10 = r8.f
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.f2575a
            boolean r10 = r10.get()
            if (r10 != 0) goto L9d
            kotlinx.coroutines.sync.MutexImpl r10 = r8.g
            boolean r10 = r10.f()
            androidx.datastore.core.okio.OkioReadScope r2 = new androidx.datastore.core.okio.OkioReadScope     // Catch: java.lang.Throwable -> L90
            okio.FileSystem r5 = r8.f2578a     // Catch: java.lang.Throwable -> L90
            okio.Path r6 = r8.b     // Catch: java.lang.Throwable -> L90
            androidx.datastore.OkioSerializerWrapper r7 = r8.c     // Catch: java.lang.Throwable -> L90
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L81
            r0.p = r8     // Catch: java.lang.Throwable -> L81
            r0.q = r2     // Catch: java.lang.Throwable -> L81
            r0.r = r10     // Catch: java.lang.Throwable -> L81
            r0.u = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r9.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L69
            return r1
        L69:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L6e:
            r1.close()     // Catch: java.lang.Throwable -> L73
            r1 = r4
            goto L74
        L73:
            r1 = move-exception
        L74:
            if (r1 != 0) goto L7e
            if (r9 == 0) goto L7d
            kotlinx.coroutines.sync.MutexImpl r9 = r0.g
            r9.c(r4)
        L7d:
            return r10
        L7e:
            throw r1     // Catch: java.lang.Throwable -> L7f
        L7f:
            r10 = move-exception
            goto L95
        L81:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L87:
            r1.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r10, r1)     // Catch: java.lang.Throwable -> L7f
        L8f:
            throw r10     // Catch: java.lang.Throwable -> L7f
        L90:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
        L95:
            if (r9 == 0) goto L9c
            kotlinx.coroutines.sync.MutexImpl r9 = r0.g
            r9.c(r4)
        L9c:
            throw r10
        L9d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.a(kotlin.jvm.functions.Function3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[Catch: all -> 0x00cb, IOException -> 0x00ce, TRY_ENTER, TryCatch #9 {IOException -> 0x00ce, all -> 0x00cb, blocks: (B:38:0x00bb, B:40:0x00c3, B:48:0x00d8, B:55:0x00e6, B:54:0x00e3, B:51:0x00de), top: B:84:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[Catch: all -> 0x00cb, IOException -> 0x00ce, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00ce, all -> 0x00cb, blocks: (B:38:0x00bb, B:40:0x00c3, B:48:0x00d8, B:55:0x00e6, B:54:0x00e3, B:51:0x00de), top: B:84:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r0v4, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [okio.Path] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, kotlinx.coroutines.sync.MutexImpl] */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.datastore.core.okio.OkioStorageConnection$writeScope$1, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, okio.FileSystem] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [okio.FileSystem] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function2 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.b(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.f.f2575a.set(true);
        ((OkioStorage$createConnection$2) this.e).invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    /* renamed from: d, reason: from getter */
    public final InterProcessCoordinator getD() {
        return this.d;
    }
}
