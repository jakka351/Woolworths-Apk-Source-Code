package androidx.datastore.core.okio;

import androidx.datastore.OkioSerializerWrapper;
import androidx.datastore.core.ReadScope;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/ReadScope;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class OkioReadScope<T> implements ReadScope<T> {

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f2576a;
    public final Path b;
    public final OkioSerializerWrapper c;
    public final AtomicBoolean d;

    public OkioReadScope(FileSystem fileSystem, Path path, OkioSerializerWrapper okioSerializerWrapper) {
        Intrinsics.h(fileSystem, "fileSystem");
        Intrinsics.h(path, "path");
        this.f2576a = fileSystem;
        this.b = path;
        this.c = okioSerializerWrapper;
        this.d = new AtomicBoolean();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b8, code lost:
    
        if (r8 == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093 A[Catch: FileNotFoundException -> 0x008d, TryCatch #8 {FileNotFoundException -> 0x008d, blocks: (B:47:0x0093, B:48:0x0097, B:43:0x0089, B:40:0x0084), top: B:82:0x0084, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[Catch: FileNotFoundException -> 0x008d, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x008d, blocks: (B:47:0x0093, B:48:0x0097, B:43:0x0089, B:40:0x0084), top: B:82:0x0084, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.okio.OkioReadScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.datastore.core.okio.OkioReadScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(androidx.datastore.core.okio.OkioReadScope r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioReadScope.f(androidx.datastore.core.okio.OkioReadScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.d.f2575a.set(true);
    }

    @Override // androidx.datastore.core.ReadScope
    public final Object e(Continuation continuation) {
        return f(this, (ContinuationImpl) continuation);
    }
}
