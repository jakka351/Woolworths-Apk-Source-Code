package androidx.paging;

import androidx.paging.DataSource;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/WrapperDataSource;", "", "Key", "ValueFrom", "ValueTo", "Landroidx/paging/DataSource;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class WrapperDataSource<Key, ValueFrom, ValueTo> extends DataSource<Key, ValueTo> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            try {
                new int[DataSource.KeyType.values().length][2] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object g(androidx.paging.WrapperDataSource r3, androidx.paging.DataSource.Params r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r4 = r5 instanceof androidx.paging.WrapperDataSource$load$1
            if (r4 == 0) goto L13
            r4 = r5
            androidx.paging.WrapperDataSource$load$1 r4 = (androidx.paging.WrapperDataSource$load$1) r4
            int r0 = r4.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.s = r0
            goto L18
        L13:
            androidx.paging.WrapperDataSource$load$1 r4 = new androidx.paging.WrapperDataSource$load$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r4.s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L46
            if (r0 != r2) goto L3e
            androidx.paging.WrapperDataSource r3 = r4.p
            kotlin.ResultKt.b(r5)
            androidx.paging.DataSource$BaseResult r5 = (androidx.paging.DataSource.BaseResult) r5
            r3.getClass()
            java.lang.String r3 = "result"
            kotlin.jvm.internal.Intrinsics.h(r5, r3)
            java.lang.String r3 = "function"
            kotlin.jvm.internal.Intrinsics.h(r1, r3)
            java.util.List r3 = r5.f3532a
            androidx.paging.DataSource.Companion.a(r3)
            throw r1
        L3e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L46:
            kotlin.ResultKt.b(r5)
            r4.p = r3
            r4.s = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.WrapperDataSource.g(androidx.paging.WrapperDataSource, androidx.paging.DataSource$Params, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.paging.DataSource
    public final void a(DataSource.InvalidatedCallback invalidatedCallback) {
        throw null;
    }

    @Override // androidx.paging.DataSource
    public final Object b(Object obj) {
        throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
    }

    @Override // androidx.paging.DataSource
    public final void c() {
        throw null;
    }

    @Override // androidx.paging.DataSource
    public final boolean d() {
        throw null;
    }

    @Override // androidx.paging.DataSource
    public final Object e(DataSource.Params params, ContinuationImpl continuationImpl) {
        g(this, params, continuationImpl);
        throw null;
    }

    @Override // androidx.paging.DataSource
    public final void f(DataSource.InvalidatedCallback invalidatedCallback) {
        throw null;
    }
}
