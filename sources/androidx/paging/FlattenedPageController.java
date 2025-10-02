package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/FlattenedPageController;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class FlattenedPageController<T> {

    /* renamed from: a, reason: collision with root package name */
    public final FlattenedPageEventStorage f3534a = new FlattenedPageEventStorage();
    public final MutexImpl b = MutexKt.a();
    public int c = -1;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.paging.FlattenedPageController$getStateAsEvents$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = (androidx.paging.FlattenedPageController$getStateAsEvents$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = new androidx.paging.FlattenedPageController$getStateAsEvents$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.MutexImpl r1 = r0.q
            java.lang.Object r0 = r0.p
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            kotlin.ResultKt.b(r9)
            goto L49
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.ResultKt.b(r9)
            r0.p = r8
            kotlinx.coroutines.sync.MutexImpl r9 = r8.b
            r0.q = r9
            r0.t = r3
            java.lang.Object r0 = r9.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r8
            r1 = r9
        L49:
            r9 = 0
            androidx.paging.FlattenedPageEventStorage r2 = r0.f3534a     // Catch: java.lang.Throwable -> L85
            java.util.List r2 = r2.b()     // Catch: java.lang.Throwable -> L85
            int r0 = r0.c     // Catch: java.lang.Throwable -> L85
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L85
            int r0 = r0 - r4
            int r0 = r0 + r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L85
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L85
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.s(r2, r4)     // Catch: java.lang.Throwable -> L85
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = 0
        L6a:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L85
            int r6 = r4 + 1
            if (r4 < 0) goto L87
            androidx.paging.PageEvent r5 = (androidx.paging.PageEvent) r5     // Catch: java.lang.Throwable -> L85
            kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue     // Catch: java.lang.Throwable -> L85
            int r4 = r4 + r0
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L85
            r3.add(r7)     // Catch: java.lang.Throwable -> L85
            r4 = r6
            goto L6a
        L85:
            r0 = move-exception
            goto L8f
        L87:
            kotlin.collections.CollectionsKt.z0()     // Catch: java.lang.Throwable -> L85
            throw r9     // Catch: java.lang.Throwable -> L85
        L8b:
            r1.c(r9)
            return r3
        L8f:
            r1.c(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.collections.IndexedValue r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.FlattenedPageController$record$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController$record$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$record$1 r0 = new androidx.paging.FlattenedPageController$record$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlinx.coroutines.sync.MutexImpl r5 = r0.r
            kotlin.collections.IndexedValue r1 = r0.q
            java.lang.Object r0 = r0.p
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            kotlin.ResultKt.b(r6)
            r6 = r5
            r5 = r1
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.b(r6)
            r0.p = r4
            r0.q = r5
            kotlinx.coroutines.sync.MutexImpl r6 = r4.b
            r0.r = r6
            r0.u = r3
            java.lang.Object r0 = r6.a(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            r1 = 0
            int r2 = r5.f24254a     // Catch: java.lang.Throwable -> L62
            r0.c = r2     // Catch: java.lang.Throwable -> L62
            androidx.paging.FlattenedPageEventStorage r0 = r0.f3534a     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r5.b     // Catch: java.lang.Throwable -> L62
            androidx.paging.PageEvent r5 = (androidx.paging.PageEvent) r5     // Catch: java.lang.Throwable -> L62
            r0.a(r5)     // Catch: java.lang.Throwable -> L62
            r6.c(r1)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L62:
            r5 = move-exception
            r6.c(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.b(kotlin.collections.IndexedValue, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
