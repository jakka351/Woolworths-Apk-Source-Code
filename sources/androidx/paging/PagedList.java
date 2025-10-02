package androidx.paging;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.interop.d;
import androidx.paging.LoadState;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/PagedList;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/AbstractList;", "BoundaryCallback", "Builder", "Callback", "Companion", "Config", "LoadStateManager", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class PagedList<T> extends AbstractList<T> {
    public static final /* synthetic */ int m = 0;
    public final PagingSource d;
    public final CoroutineScope e;
    public final CoroutineDispatcher f;
    public final PagedStorage g;
    public final Config h;
    public d i;
    public final int j;
    public final ArrayList k;
    public final ArrayList l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/PagedList$BoundaryCallback;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @MainThread
    public static abstract class BoundaryCallback<T> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagedList$Builder;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Deprecated
    public static final class Builder<Key, Value> {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagedList$Callback;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Callback {
        public abstract void a(int i, int i2);

        public abstract void b(int i, int i2);

        public abstract void c(int i, int i2);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagedList$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagedList$Config;", "", "Builder", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Config {

        /* renamed from: a, reason: collision with root package name */
        public final int f3568a;
        public final int b;
        public final boolean c;
        public final int d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/PagedList$Config$Builder;", "", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public int f3569a = -1;
            public int b = -1;
            public int c = -1;
            public boolean d = true;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagedList$Config$Builder$Companion;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
            }

            public final Config a() {
                if (this.b < 0) {
                    this.b = this.f3569a;
                }
                if (this.c < 0) {
                    this.c = this.f3569a * 3;
                }
                boolean z = this.d;
                if (z || this.b != 0) {
                    return new Config(this.f3569a, this.b, z, this.c);
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }

            public final void b(int i) {
                if (i < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.f3569a = i;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagedList$Config$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public Config(int i, int i2, boolean z, int i3) {
            this.f3568a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/PagedList$LoadStateManager;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static abstract class LoadStateManager {

        /* renamed from: a, reason: collision with root package name */
        public LoadState f3570a;
        public LoadState b;
        public LoadState c;

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

        public LoadStateManager() {
            LoadState.NotLoading notLoading = LoadState.NotLoading.c;
            this.f3570a = notLoading;
            this.b = notLoading;
            this.c = notLoading;
        }

        public abstract void a(LoadType loadType, LoadState loadState);

        public final void b(LoadType type, LoadState state) {
            Intrinsics.h(type, "type");
            Intrinsics.h(state, "state");
            int iOrdinal = type.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        if (Intrinsics.c(this.c, state)) {
                            return;
                        } else {
                            this.c = state;
                        }
                    }
                } else if (Intrinsics.c(this.b, state)) {
                    return;
                } else {
                    this.b = state;
                }
            } else if (Intrinsics.c(this.f3570a, state)) {
                return;
            } else {
                this.f3570a = state;
            }
            a(type, state);
        }
    }

    public PagedList(PagingSource pagingSource, CoroutineScope coroutineScope, CoroutineDispatcher notifyDispatcher, PagedStorage pagedStorage, Config config) {
        Intrinsics.h(pagingSource, "pagingSource");
        Intrinsics.h(coroutineScope, "coroutineScope");
        Intrinsics.h(notifyDispatcher, "notifyDispatcher");
        Intrinsics.h(config, "config");
        this.d = pagingSource;
        this.e = coroutineScope;
        this.f = notifyDispatcher;
        this.g = pagedStorage;
        this.h = config;
        this.j = (config.b * 2) + config.f3568a;
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public final void b(Callback callback) {
        Intrinsics.h(callback, "callback");
        PagedList$addWeakCallback$1 pagedList$addWeakCallback$1 = PagedList$addWeakCallback$1.h;
        ArrayList arrayList = this.k;
        CollectionsKt.g0(arrayList, pagedList$addWeakCallback$1);
        arrayList.add(new WeakReference(callback));
    }

    public abstract void d(Function2 function2);

    public abstract Object g();

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.g.get(i);
    }

    /* renamed from: h, reason: from getter */
    public PagingSource getD() {
        return this.d;
    }

    public abstract boolean i();

    public boolean j() {
        return i();
    }

    public final void k(int i) {
        PagedStorage pagedStorage = this.g;
        if (i < 0 || i >= pagedStorage.getSize()) {
            StringBuilder sbR = YU.a.r(i, "Index: ", ", Size: ");
            sbR.append(pagedStorage.getSize());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        pagedStorage.j = RangesKt.c(i - pagedStorage.e, 0, pagedStorage.i - 1);
        l(i);
    }

    public abstract void l(int i);

    public final void m(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.l0(this.k).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.a(i, i2);
            }
        }
    }

    public final void n(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.l0(this.k).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.b(i, i2);
            }
        }
    }

    public void o() {
    }

    public void q(LoadState loadState) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g.getSize();
    }
}
