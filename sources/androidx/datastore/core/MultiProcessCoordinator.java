package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f2567a;
    public final File b;
    public final Flow c;
    public final String d;
    public final String e;
    public final String f;
    public final MutexImpl g;
    public final Lazy h;
    public final Lazy i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:27:0x0075). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object a(java.io.FileOutputStream r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.io.IOException {
            /*
                boolean r0 = r13 instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                if (r0 == 0) goto L13
                r0 = r13
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) r0
                int r1 = r0.s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.s = r1
                goto L18
            L13:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.r
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.s
                r3 = 1
                if (r2 == 0) goto L34
                if (r2 != r3) goto L2c
                long r4 = r0.q
                java.io.FileOutputStream r12 = r0.p
                kotlin.ResultKt.b(r13)
                r13 = r0
                goto L75
            L2c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L34:
                kotlin.ResultKt.b(r13)
                r4 = 10
                r13 = r0
            L3a:
                r6 = 60000(0xea60, double:2.9644E-319)
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r0 > 0) goto L7a
                java.nio.channels.FileChannel r6 = r12.getChannel()     // Catch: java.io.IOException -> L58
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r7 = 0
                java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L58
                kotlin.jvm.internal.Intrinsics.g(r0, r2)     // Catch: java.io.IOException -> L58
                r1 = r0
                goto L8d
            L58:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L79
                java.lang.String r6 = "Resource deadlock would occur"
                r7 = 0
                boolean r2 = kotlin.text.StringsKt.o(r2, r6, r7)
                if (r2 != r3) goto L79
                r13.p = r12
                r13.q = r4
                r13.s = r3
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.b(r4, r13)
                if (r0 != r1) goto L75
                goto L8d
            L75:
                r0 = 2
                long r6 = (long) r0
                long r4 = r4 * r6
                goto L3a
            L79:
                throw r0
            L7a:
                java.nio.channels.FileChannel r6 = r12.getChannel()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r7 = 0
                java.nio.channels.FileLock r1 = r6.lock(r7, r9, r11)
                kotlin.jvm.internal.Intrinsics.g(r1, r2)
            L8d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.a(java.io.FileOutputStream, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public MultiProcessCoordinator(CoroutineContext context, File file) {
        Intrinsics.h(context, "context");
        Intrinsics.h(file, "file");
        this.f2567a = context;
        this.b = file;
        Object obj = MulticastFileObserver.b;
        this.c = FlowKt.f(new MulticastFileObserver$Companion$observe$1(file, null));
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = MutexKt.a();
        this.h = LazyKt.b(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                MultiProcessCoordinator multiProcessCoordinator = this.h;
                File file2 = new File(multiProcessCoordinator.b.getAbsolutePath() + multiProcessCoordinator.d);
                MultiProcessCoordinator.f(multiProcessCoordinator, file2);
                return file2;
            }
        });
        this.i = LazyKt.b(new Function0<SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                ParcelFileDescriptor parcelFileDescriptorOpen;
                System.loadLibrary("datastore_shared_counter");
                final MultiProcessCoordinator multiProcessCoordinator = this.h;
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() throws IOException {
                            MultiProcessCoordinator multiProcessCoordinator2 = multiProcessCoordinator;
                            File file2 = new File(multiProcessCoordinator2.b.getAbsolutePath() + multiProcessCoordinator2.e);
                            MultiProcessCoordinator.f(multiProcessCoordinator2, file2);
                            return file2;
                        }
                    }.invoke(), 939524096);
                } catch (Throwable th) {
                    th = th;
                    parcelFileDescriptorOpen = null;
                }
                try {
                    int fd = parcelFileDescriptorOpen.getFd();
                    NativeSharedCounter nativeSharedCounter = SharedCounter.b;
                    if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    SharedCounter sharedCounter = new SharedCounter(jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return sharedCounter;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            }
        });
    }

    public static final void f(MultiProcessCoordinator multiProcessCoordinator, File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    /* renamed from: a, reason: from getter */
    public final Flow getC() {
        return this.c;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object b(ContinuationImpl continuationImpl) {
        if (this.i.isInitialized()) {
            return new Integer(SharedCounter.b.nativeGetCounterValue(g().f2570a));
        }
        return BuildersKt.f(this.f2567a, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuationImpl);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.jvm.functions.Function1 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.c(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.jvm.functions.Function2 r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.d(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object e(Continuation continuation) {
        if (this.i.isInitialized()) {
            return new Integer(SharedCounter.b.nativeIncrementAndGetCounterValue(g().f2570a));
        }
        return BuildersKt.f(this.f2567a, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    public final SharedCounter g() {
        return (SharedCounter) this.i.getD();
    }
}
