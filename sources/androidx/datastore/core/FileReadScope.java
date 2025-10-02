package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/FileReadScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/ReadScope;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class FileReadScope<T> implements ReadScope<T> {

    /* renamed from: a, reason: collision with root package name */
    public final File f2563a;
    public final Serializer b;
    public final java.util.concurrent.atomic.AtomicBoolean c;

    public FileReadScope(File file, Serializer serializer) {
        Intrinsics.h(serializer, "serializer");
        this.f2563a = file;
        this.b = serializer;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(androidx.datastore.core.FileReadScope r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileReadScope.f(androidx.datastore.core.FileReadScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.c.set(true);
    }

    @Override // androidx.datastore.core.ReadScope
    public final Object e(Continuation continuation) {
        return f(this, (ContinuationImpl) continuation);
    }
}
