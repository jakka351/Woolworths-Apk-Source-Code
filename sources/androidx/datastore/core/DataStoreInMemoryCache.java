package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DataStoreInMemoryCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f2562a = StateFlowKt.a(UnInitialized.b);

    public final State a() {
        return (State) this.f2562a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.datastore.core.State r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
        L5:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r5.f2562a
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            androidx.datastore.core.State r2 = (androidx.datastore.core.State) r2
            boolean r3 = r2 instanceof androidx.datastore.core.ReadException
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            androidx.datastore.core.UnInitialized r3 = androidx.datastore.core.UnInitialized.b
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L27
        L1d:
            boolean r3 = r2 instanceof androidx.datastore.core.Data
            if (r3 == 0) goto L29
            int r3 = r6.f2573a
            int r4 = r2.f2573a
            if (r3 <= r4) goto L2d
        L27:
            r2 = r6
            goto L2d
        L29:
            boolean r3 = r2 instanceof androidx.datastore.core.Final
            if (r3 == 0) goto L34
        L2d:
            boolean r0 = r0.d(r1, r2)
            if (r0 == 0) goto L5
            return
        L34:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreInMemoryCache.b(androidx.datastore.core.State):void");
    }
}
