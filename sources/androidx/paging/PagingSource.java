package androidx.paging;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/PagingSource;", "", "Key", "Value", "LoadParams", "LoadResult", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class PagingSource<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    public final InvalidateCallbackTracker f3581a = new InvalidateCallbackTracker(null, PagingSource$invalidateCallbackTracker$1.h);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/PagingSource$LoadParams;", "", "Key", "Append", "Companion", "Prepend", "Refresh", "Landroidx/paging/PagingSource$LoadParams$Append;", "Landroidx/paging/PagingSource$LoadParams$Prepend;", "Landroidx/paging/PagingSource$LoadParams$Refresh;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadParams<Key> {

        /* renamed from: a, reason: collision with root package name */
        public final int f3582a;
        public final boolean b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Append;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Append<Key> extends LoadParams<Key> {
            public final Object c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Append(Object key, boolean z, int i) {
                super(i, z);
                Intrinsics.h(key, "key");
                this.c = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            /* renamed from: a, reason: from getter */
            public final Object getC() {
                return this.c;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[LoadType.values().length];
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
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Prepend;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Prepend<Key> extends LoadParams<Key> {
            public final Object c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Prepend(Object key, boolean z, int i) {
                super(i, z);
                Intrinsics.h(key, "key");
                this.c = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            /* renamed from: a, reason: from getter */
            public final Object getC() {
                return this.c;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Refresh;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Refresh<Key> extends LoadParams<Key> {
            public final Object c;

            public Refresh(Object obj, boolean z, int i) {
                super(i, z);
                this.c = obj;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            /* renamed from: a, reason: from getter */
            public final Object getC() {
                return this.c;
            }
        }

        public LoadParams(int i, boolean z) {
            this.f3582a = i;
            this.b = z;
        }

        /* renamed from: a */
        public abstract Object getC();
    }

    public abstract Object b(PagingState pagingState);

    public final void c() {
        if (this.f3581a.a() && PagingLogger.a(3)) {
            PagingLogger.b(3, "Invalidated PagingSource " + this);
        }
    }

    public abstract Object d(LoadParams loadParams, ContinuationImpl continuationImpl);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/PagingSource$LoadResult;", "", "Key", "Value", "Error", "Invalid", "Page", "Landroidx/paging/PagingSource$LoadResult$Error;", "Landroidx/paging/PagingSource$LoadResult$Invalid;", "Landroidx/paging/PagingSource$LoadResult$Page;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadResult<Key, Value> {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Error;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Error<Key, Value> extends LoadResult<Key, Value> {
            public final Throwable d;

            public Error(Throwable th) {
                this.d = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.d, ((Error) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return StringsKt.n0("LoadResult.Error(\n                    |   throwable: " + this.d + "\n                    |) ");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Invalid;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Invalid<Key, Value> extends LoadResult<Key, Value> {
            public final String toString() {
                return "LoadResult.Invalid";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00042\b\u0012\u0004\u0012\u00028\u00050\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Page;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Page<Key, Value> extends LoadResult<Key, Value> implements Iterable<Value>, KMappedMarker {
            public static final Page i = new Page(EmptyList.d, null, null, 0, 0);
            public final List d;
            public final Object e;
            public final Object f;
            public final int g;
            public final int h;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Page$Companion;", "", "", "COUNT_UNDEFINED", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
            }

            public Page(List data, Object obj, Object obj2, int i2, int i3) {
                Intrinsics.h(data, "data");
                this.d = data;
                this.e = obj;
                this.f = obj2;
                this.g = i2;
                this.h = i3;
                if (i2 != Integer.MIN_VALUE && i2 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i3 != Integer.MIN_VALUE && i3 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Page)) {
                    return false;
                }
                Page page = (Page) obj;
                return Intrinsics.c(this.d, page.d) && Intrinsics.c(this.e, page.e) && Intrinsics.c(this.f, page.f) && this.g == page.g && this.h == page.h;
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                Object obj = this.e;
                int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
                Object obj2 = this.f;
                return Integer.hashCode(this.h) + androidx.camera.core.impl.b.a(this.g, (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.d.listIterator();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List list = this.d;
                sb.append(list.size());
                sb.append("\n                    |   first Item: ");
                sb.append(CollectionsKt.F(list));
                sb.append("\n                    |   last Item: ");
                sb.append(CollectionsKt.P(list));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.f);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.e);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.g);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.h);
                sb.append("\n                    |) ");
                return StringsKt.n0(sb.toString());
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Page(List data, Integer num, Object obj) {
                this(data, num, obj, Integer.MIN_VALUE, Integer.MIN_VALUE);
                Intrinsics.h(data, "data");
            }
        }
    }
}
