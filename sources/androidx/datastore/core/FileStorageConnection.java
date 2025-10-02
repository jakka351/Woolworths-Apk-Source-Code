package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/StorageConnection;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {

    /* renamed from: a, reason: collision with root package name */
    public final File f2565a;
    public final Serializer b;
    public final InterProcessCoordinator c;
    public final Function0 d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final MutexImpl f;

    public FileStorageConnection(File file, Serializer serializer, InterProcessCoordinator coordinator, Function0 function0) {
        Intrinsics.h(serializer, "serializer");
        Intrinsics.h(coordinator, "coordinator");
        this.f2565a = file;
        this.b = serializer;
        this.c = coordinator;
        this.d = function0;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = MutexKt.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007d, blocks: (B:33:0x007c, B:43:0x008f, B:42:0x008c, B:39:0x0087), top: B:59:0x0020, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [androidx.datastore.core.StorageConnectionKt$readData$2] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function3 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.FileStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = (androidx.datastore.core.FileStorageConnection$readScope$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = new androidx.datastore.core.FileStorageConnection$readScope$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r8 = r0.r
            androidx.datastore.core.FileReadScope r1 = r0.q
            androidx.datastore.core.FileStorageConnection r0 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r9 = move-exception
            goto L87
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.ResultKt.b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.e
            boolean r9 = r9.get()
            if (r9 != 0) goto L9d
            kotlinx.coroutines.sync.MutexImpl r9 = r7.f
            boolean r9 = r9.f()
            androidx.datastore.core.FileReadScope r2 = new androidx.datastore.core.FileReadScope     // Catch: java.lang.Throwable -> L90
            java.io.File r5 = r7.f2565a     // Catch: java.lang.Throwable -> L90
            androidx.datastore.core.Serializer r6 = r7.b     // Catch: java.lang.Throwable -> L90
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L85
            r0.p = r7     // Catch: java.lang.Throwable -> L85
            r0.q = r2     // Catch: java.lang.Throwable -> L85
            r0.r = r9     // Catch: java.lang.Throwable -> L85
            r0.u = r3     // Catch: java.lang.Throwable -> L85
            androidx.datastore.core.StorageConnectionKt$readData$2 r8 = (androidx.datastore.core.StorageConnectionKt$readData$2) r8     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r8 != r1) goto L67
            return r1
        L67:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L71
            r1 = r4
            goto L72
        L71:
            r1 = move-exception
        L72:
            if (r1 != 0) goto L7c
            if (r8 == 0) goto L7b
            kotlinx.coroutines.sync.MutexImpl r8 = r0.f
            r8.c(r4)
        L7b:
            return r9
        L7c:
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r9 = move-exception
            goto L95
        L7f:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
            goto L87
        L85:
            r8 = move-exception
            goto L7f
        L87:
            r1.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r9, r1)     // Catch: java.lang.Throwable -> L7d
        L8f:
            throw r9     // Catch: java.lang.Throwable -> L7d
        L90:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L95:
            if (r8 == 0) goto L9c
            kotlinx.coroutines.sync.MutexImpl r8 = r0.f
            r8.c(r4)
        L9c:
            throw r9
        L9d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StorageConnection has already been disposed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.a(kotlin.jvm.functions.Function3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[Catch: all -> 0x0122, IOException -> 0x0124, TRY_ENTER, TryCatch #0 {all -> 0x0122, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00eb, B:52:0x0101, B:53:0x0121, B:60:0x012d, B:69:0x013c, B:71:0x0142, B:72:0x0145, B:67:0x013a, B:66:0x0137, B:33:0x009e, B:34:0x00ba), top: B:77:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d A[Catch: all -> 0x0122, IOException -> 0x0124, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0122, blocks: (B:43:0x00e2, B:45:0x00e8, B:47:0x00eb, B:52:0x0101, B:53:0x0121, B:60:0x012d, B:69:0x013c, B:71:0x0142, B:72:0x0145, B:67:0x013a, B:66:0x0137, B:33:0x009e, B:34:0x00ba), top: B:77:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function2 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.b(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    /* renamed from: d, reason: from getter */
    public final InterProcessCoordinator getC() {
        return this.c;
    }
}
