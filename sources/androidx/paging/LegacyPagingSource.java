package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.DataSource;
import io.jsonwebtoken.JwtParser;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/LegacyPagingSource;", "", "Key", "Value", "Landroidx/paging/PagingSource;", "Landroidx/paging/CompatLegacyPagingSource;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LegacyPagingSource<Key, Value> extends PagingSource<Key, Value> implements CompatLegacyPagingSource {
    public final CoroutineContext b;
    public final DataSource c;
    public int d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.LegacyPagingSource$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 implements DataSource.InvalidatedCallback, FunctionAdapter {
        public AnonymousClass1() {
        }

        @Override // androidx.paging.DataSource.InvalidatedCallback
        public final void a() {
            LegacyPagingSource.this.c();
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function b() {
            return new FunctionReferenceImpl(0, LegacyPagingSource.this, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof FunctionAdapter)) {
                return b().equals(((FunctionAdapter) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/LegacyPagingSource$Companion;", "", "", "PAGE_SIZE_NOT_SET", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DataSource.KeyType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LegacyPagingSource(CoroutineContext fetchContext, DataSource dataSource) {
        Intrinsics.h(fetchContext, "fetchContext");
        Intrinsics.h(dataSource, "dataSource");
        this.b = fetchContext;
        this.c = dataSource;
        this.d = Integer.MIN_VALUE;
        dataSource.a(new AnonymousClass1());
        this.f3581a.b(new Function0<Unit>() { // from class: androidx.paging.LegacyPagingSource.2

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.paging.LegacyPagingSource$2$1, reason: invalid class name */
            final /* synthetic */ class AnonymousClass1 implements DataSource.InvalidatedCallback, FunctionAdapter {
                public final /* synthetic */ LegacyPagingSource d;

                public AnonymousClass1(LegacyPagingSource legacyPagingSource) {
                    this.d = legacyPagingSource;
                }

                @Override // androidx.paging.DataSource.InvalidatedCallback
                public final void a() {
                    this.d.c();
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function b() {
                    return new FunctionReferenceImpl(0, this.d, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof FunctionAdapter)) {
                        return b().equals(((FunctionAdapter) obj).b());
                    }
                    return false;
                }

                public final int hashCode() {
                    return b().hashCode();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LegacyPagingSource legacyPagingSource = LegacyPagingSource.this;
                DataSource dataSource2 = legacyPagingSource.c;
                dataSource2.f(new AnonymousClass1(legacyPagingSource));
                dataSource2.c();
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.paging.CompatLegacyPagingSource
    public final void a(int i) {
        int i2 = this.d;
        if (i2 != Integer.MIN_VALUE && i != i2) {
            throw new IllegalStateException(YU.a.l(new StringBuilder("Page size is already set to "), this.d, JwtParser.SEPARATOR_CHAR).toString());
        }
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.paging.PagingState r9) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.LegacyPagingSource.b(androidx.paging.PagingState):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(androidx.paging.PagingSource.LoadParams r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.paging.PagingSource.LoadParams.Refresh
            if (r0 == 0) goto L8
            androidx.paging.LoadType r1 = androidx.paging.LoadType.d
        L6:
            r3 = r1
            goto L16
        L8:
            boolean r1 = r9 instanceof androidx.paging.PagingSource.LoadParams.Append
            if (r1 == 0) goto Lf
            androidx.paging.LoadType r1 = androidx.paging.LoadType.f
            goto L6
        Lf:
            boolean r1 = r9 instanceof androidx.paging.PagingSource.LoadParams.Prepend
            if (r1 == 0) goto L4e
            androidx.paging.LoadType r1 = androidx.paging.LoadType.e
            goto L6
        L16:
            int r1 = r8.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L32
            java.lang.String r1 = "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106"
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r1)
            if (r0 == 0) goto L2e
            int r0 = r9.f3582a
            int r1 = r0 % 3
            if (r1 != 0) goto L2e
            int r0 = r0 / 3
            goto L30
        L2e:
            int r0 = r9.f3582a
        L30:
            r8.d = r0
        L32:
            androidx.paging.DataSource$Params r2 = new androidx.paging.DataSource$Params
            java.lang.Object r4 = r9.getC()
            int r5 = r9.f3582a
            boolean r6 = r9.b
            int r7 = r8.d
            r2.<init>(r3, r4, r5, r6, r7)
            androidx.paging.LegacyPagingSource$load$2 r0 = new androidx.paging.LegacyPagingSource$load$2
            r1 = 0
            r0.<init>(r8, r2, r9, r1)
            kotlin.coroutines.CoroutineContext r9 = r8.b
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.f(r9, r0, r10)
            return r9
        L4e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.LegacyPagingSource.d(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
