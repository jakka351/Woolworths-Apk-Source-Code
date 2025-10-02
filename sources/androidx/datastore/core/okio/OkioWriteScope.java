package androidx.datastore.core.okio;

import androidx.datastore.OkioSerializerWrapper;
import androidx.datastore.core.WriteScope;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(FileSystem fileSystem, Path path, OkioSerializerWrapper okioSerializerWrapper) {
        super(fileSystem, path, okioSerializerWrapper);
        Intrinsics.h(fileSystem, "fileSystem");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7 A[Catch: all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00b3, blocks: (B:50:0x00a7, B:58:0x00b5, B:21:0x0058), top: B:77:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5 A[Catch: all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00b3, blocks: (B:50:0x00a7, B:58:0x00b5, B:21:0x0058), top: B:77:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.Object r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioWriteScope.c(java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
