package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.Object r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.FileWriteScope$writeData$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = (androidx.datastore.core.FileWriteScope$writeData$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = new androidx.datastore.core.FileWriteScope$writeData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileOutputStream r6 = r0.q
            java.io.FileOutputStream r0 = r0.p
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5d
        L2b:
            r6 = move-exception
            goto L6d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.c
            boolean r7 = r7.get()
            if (r7 != 0) goto L73
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.f2563a
            r7.<init>(r2)
            androidx.datastore.core.Serializer r2 = r5.b     // Catch: java.lang.Throwable -> L6b
            androidx.datastore.core.UncloseableOutputStream r4 = new androidx.datastore.core.UncloseableOutputStream     // Catch: java.lang.Throwable -> L6b
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            r0.p = r7     // Catch: java.lang.Throwable -> L6b
            r0.q = r7     // Catch: java.lang.Throwable -> L6b
            r0.t = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r6 = r2.writeTo(r6, r4, r0)     // Catch: java.lang.Throwable -> L6b
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r6 = r7
            r0 = r6
        L5d:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L2b
            r6.sync()     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            kotlin.io.CloseableKt.a(r0, r6)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L6b:
            r6 = move-exception
            r0 = r7
        L6d:
            throw r6     // Catch: java.lang.Throwable -> L6e
        L6e:
            r7 = move-exception
            kotlin.io.CloseableKt.a(r0, r6)
            throw r7
        L73:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This scope has already been closed."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileWriteScope.c(java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
