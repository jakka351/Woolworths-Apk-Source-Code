package androidx.paging;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.airbnb.epoxy.paging3.PagedListModelCache$updateCallback$1;
import com.google.android.gms.ads.RequestConfiguration;
import com.woolworths.scanlibrary.ui.productsearch.adapter.ProductSearchResultItemAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u000b\fR\"\u0010\n\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor$paging_runtime_release", "()Ljava/util/concurrent/Executor;", "setMainThreadExecutor$paging_runtime_release", "(Ljava/util/concurrent/Executor;)V", "mainThreadExecutor", "OnCurrentListChangedWrapper", "PagedListListener", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public class AsyncPagedListDiffer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ListUpdateCallback f3524a;
    public final AsyncDifferConfig b;

    /* renamed from: c, reason: from kotlin metadata */
    public Executor mainThreadExecutor = ArchTaskExecutor.c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public PagedList e;
    public PagedList f;
    public int g;
    public final AsyncPagedListDiffer$loadStateManager$1 h;
    public final KFunction i;
    public final CopyOnWriteArrayList j;
    public final AsyncPagedListDiffer$pagedListCallback$1 k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$OnCurrentListChangedWrapper;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OnCurrentListChangedWrapper<T> implements PagedListListener<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Function2 f3525a;

        public OnCurrentListChangedWrapper(Function2 function2) {
            this.f3525a = function2;
        }

        @Override // androidx.paging.AsyncPagedListDiffer.PagedListListener
        public final void a(PagedList pagedList, PagedList pagedList2) {
            this.f3525a.invoke(pagedList, pagedList2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Deprecated
    public interface PagedListListener<T> {
        void a(PagedList pagedList, PagedList pagedList2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.paging.AsyncPagedListDiffer$loadStateManager$1] */
    public AsyncPagedListDiffer(PagedListAdapter pagedListAdapter) {
        ?? r0 = new PagedList.LoadStateManager() { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            @Override // androidx.paging.PagedList.LoadStateManager
            public final void a(LoadType type, LoadState state) {
                Intrinsics.h(type, "type");
                Intrinsics.h(state, "state");
                Iterator it = this.d.j.iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(type, state);
                }
            }
        };
        this.h = r0;
        this.i = new AsyncPagedListDiffer$loadStateListener$1(r0);
        this.j = new CopyOnWriteArrayList();
        this.k = new AsyncPagedListDiffer$pagedListCallback$1(this);
        this.f3524a = new AdapterListUpdateCallback(pagedListAdapter);
        this.b = new AsyncDifferConfig.Builder(ProductSearchResultItemAdapter.k).a();
    }

    public final PagedList a() {
        PagedList pagedList = this.f;
        return pagedList == null ? this.e : pagedList;
    }

    public final int b() {
        PagedList pagedListA = a();
        if (pagedListA != null) {
            return pagedListA.g.getSize();
        }
        return 0;
    }

    public final ListUpdateCallback c() {
        ListUpdateCallback listUpdateCallback = this.f3524a;
        if (listUpdateCallback != null) {
            return listUpdateCallback;
        }
        Intrinsics.p("updateCallback");
        throw null;
    }

    public final void d(PagedList pagedList, PagedList pagedList2) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((PagedListListener) it.next()).a(pagedList, pagedList2);
        }
    }

    public final void e(final PagedList pagedList) {
        final int i = this.g + 1;
        this.g = i;
        PagedList pagedList2 = this.e;
        if (pagedList == pagedList2) {
            return;
        }
        KFunction kFunction = this.i;
        final PagedList.Callback callback = this.k;
        if (pagedList2 != null && (pagedList instanceof InitialPagedList)) {
            Intrinsics.h(callback, "callback");
            CollectionsKt.g0(pagedList2.k, new Function1<WeakReference<PagedList.Callback>, Boolean>() { // from class: androidx.paging.PagedList$removeWeakCallback$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WeakReference it = (WeakReference) obj;
                    Intrinsics.h(it, "it");
                    return Boolean.valueOf(it.get() == null || it.get() == callback);
                }
            });
            final Function2 listener = (Function2) kFunction;
            Intrinsics.h(listener, "listener");
            CollectionsKt.g0(pagedList2.l, new Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean>() { // from class: androidx.paging.PagedList$removeWeakLoadStateListener$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WeakReference it = (WeakReference) obj;
                    Intrinsics.h(it, "it");
                    return Boolean.valueOf(it.get() == null || it.get() == listener);
                }
            });
            LoadType loadType = LoadType.d;
            LoadState.Loading loading = LoadState.Loading.b;
            AsyncPagedListDiffer$loadStateManager$1 asyncPagedListDiffer$loadStateManager$1 = this.h;
            asyncPagedListDiffer$loadStateManager$1.b(loadType, loading);
            asyncPagedListDiffer$loadStateManager$1.b(LoadType.e, new LoadState.NotLoading(false));
            asyncPagedListDiffer$loadStateManager$1.b(LoadType.f, new LoadState.NotLoading(false));
            return;
        }
        PagedList pagedListA = a();
        if (pagedList == null) {
            int iB = b();
            if (pagedList2 != null) {
                Intrinsics.h(callback, "callback");
                CollectionsKt.g0(pagedList2.k, new Function1<WeakReference<PagedList.Callback>, Boolean>() { // from class: androidx.paging.PagedList$removeWeakCallback$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        WeakReference it = (WeakReference) obj;
                        Intrinsics.h(it, "it");
                        return Boolean.valueOf(it.get() == null || it.get() == callback);
                    }
                });
                final Function2 listener2 = (Function2) kFunction;
                Intrinsics.h(listener2, "listener");
                CollectionsKt.g0(pagedList2.l, new Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean>() { // from class: androidx.paging.PagedList$removeWeakLoadStateListener$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        WeakReference it = (WeakReference) obj;
                        Intrinsics.h(it, "it");
                        return Boolean.valueOf(it.get() == null || it.get() == listener2);
                    }
                });
                this.e = null;
            } else if (this.f != null) {
                this.f = null;
            }
            c().b(0, iB);
            d(pagedListA, null);
            return;
        }
        if (a() == null) {
            this.e = pagedList;
            Function2 listener3 = (Function2) kFunction;
            Intrinsics.h(listener3, "listener");
            ArrayList arrayList = pagedList.l;
            CollectionsKt.g0(arrayList, PagedList$addWeakLoadStateListener$1.h);
            arrayList.add(new WeakReference(listener3));
            pagedList.d(listener3);
            pagedList.b(callback);
            c().d(0, pagedList.g.getSize());
            d(null, pagedList);
            return;
        }
        PagedList snapshotPagedList = this.e;
        if (snapshotPagedList != null) {
            Intrinsics.h(callback, "callback");
            CollectionsKt.g0(snapshotPagedList.k, new Function1<WeakReference<PagedList.Callback>, Boolean>() { // from class: androidx.paging.PagedList$removeWeakCallback$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WeakReference it = (WeakReference) obj;
                    Intrinsics.h(it, "it");
                    return Boolean.valueOf(it.get() == null || it.get() == callback);
                }
            });
            final Function2 listener4 = (Function2) kFunction;
            Intrinsics.h(listener4, "listener");
            CollectionsKt.g0(snapshotPagedList.l, new Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean>() { // from class: androidx.paging.PagedList$removeWeakLoadStateListener$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WeakReference it = (WeakReference) obj;
                    Intrinsics.h(it, "it");
                    return Boolean.valueOf(it.get() == null || it.get() == listener4);
                }
            });
            if (!snapshotPagedList.getO()) {
                snapshotPagedList = new SnapshotPagedList(snapshotPagedList);
            }
            this.f = snapshotPagedList;
            this.e = null;
        }
        final PagedList pagedList3 = this.f;
        if (pagedList3 == null || this.e != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        final PagedList snapshotPagedList2 = pagedList.getO() ? pagedList : new SnapshotPagedList(pagedList);
        final RecordingCallback recordingCallback = new RecordingCallback();
        pagedList.b(recordingCallback);
        this.b.b.execute(new Runnable() { // from class: androidx.paging.a
            @Override // java.lang.Runnable
            public final void run() {
                final AsyncPagedListDiffer this$0 = this;
                Intrinsics.h(this$0, "this$0");
                final PagedList pagedList4 = pagedList3;
                PagedStorage pagedStorage = pagedList4.g;
                final PagedList pagedList5 = snapshotPagedList2;
                final PlaceholderPaddedDiffResult placeholderPaddedDiffResultA = PlaceholderPaddedListDiffHelperKt.a(pagedStorage, pagedList5.g, this$0.b.c);
                Executor executor = this$0.mainThreadExecutor;
                final int i2 = i;
                final PagedList pagedList6 = pagedList;
                final RecordingCallback recordingCallback2 = recordingCallback;
                executor.execute(new Runnable() { // from class: androidx.paging.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3;
                        AsyncPagedListDiffer this$02 = this$0;
                        Intrinsics.h(this$02, "this$0");
                        if (this$02.g == i2) {
                            PagedStorage pagedStorage2 = pagedList4.g;
                            int i4 = pagedStorage2.e + pagedStorage2.j;
                            AsyncPagedListDiffer$pagedListCallback$1 other = this$02.k;
                            PagedList newList = pagedList6;
                            Intrinsics.h(newList, "newList");
                            PagedStorage pagedStorage3 = pagedList5.g;
                            PagedList pagedList7 = this$02.f;
                            if (pagedList7 != null) {
                                PagedStorage pagedStorage4 = pagedList7.g;
                                if (this$02.e == null) {
                                    this$02.e = newList;
                                    Function2 listener5 = (Function2) this$02.i;
                                    Intrinsics.h(listener5, "listener");
                                    ArrayList arrayList2 = newList.l;
                                    CollectionsKt.g0(arrayList2, PagedList$addWeakLoadStateListener$1.h);
                                    arrayList2.add(new WeakReference(listener5));
                                    newList.d(listener5);
                                    this$02.f = null;
                                    ListUpdateCallback listUpdateCallbackC = this$02.c();
                                    PlaceholderPaddedDiffResult placeholderPaddedDiffResult = placeholderPaddedDiffResultA;
                                    PlaceholderPaddedListDiffHelperKt.b(pagedStorage4, listUpdateCallbackC, pagedStorage3, placeholderPaddedDiffResult);
                                    Intrinsics.h(other, "other");
                                    ArrayList arrayList3 = recordingCallback2.f3586a;
                                    IntProgression intProgressionN = RangesKt.n(3, RangesKt.o(0, arrayList3.size()));
                                    int i5 = intProgressionN.d;
                                    int i6 = intProgressionN.e;
                                    int i7 = intProgressionN.f;
                                    int i8 = 1;
                                    if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                                        while (true) {
                                            int iIntValue = ((Number) arrayList3.get(i5)).intValue();
                                            if (iIntValue == 0) {
                                                i3 = i8;
                                                other.a(((Number) arrayList3.get(i5 + 1)).intValue(), ((Number) arrayList3.get(i5 + 2)).intValue());
                                            } else if (iIntValue != i8) {
                                                i3 = i8;
                                                if (iIntValue != 2) {
                                                    throw new IllegalStateException("Unexpected recording value");
                                                }
                                                other.c(((Number) arrayList3.get(i5 + 1)).intValue(), ((Number) arrayList3.get(i5 + 2)).intValue());
                                            } else {
                                                i3 = i8;
                                                other.b(((Number) arrayList3.get(i5 + 1)).intValue(), ((Number) arrayList3.get(i5 + 2)).intValue());
                                            }
                                            if (i5 == i6) {
                                                break;
                                            }
                                            i5 += i7;
                                            i8 = i3;
                                        }
                                    }
                                    arrayList3.clear();
                                    newList.b(other);
                                    if (!newList.isEmpty()) {
                                        newList.k(RangesKt.c(PlaceholderPaddedListDiffHelperKt.c(pagedStorage4, placeholderPaddedDiffResult, pagedStorage3, i4), 0, newList.g.getSize() - 1));
                                    }
                                    this$02.d(pagedList7, this$02.e);
                                    return;
                                }
                            }
                            throw new IllegalStateException("must be in snapshot state to apply diff");
                        }
                    }
                });
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.paging.AsyncPagedListDiffer$loadStateManager$1] */
    public AsyncPagedListDiffer(PagedListModelCache$updateCallback$1 pagedListModelCache$updateCallback$1, AsyncDifferConfig asyncDifferConfig) {
        ?? r0 = new PagedList.LoadStateManager() { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            @Override // androidx.paging.PagedList.LoadStateManager
            public final void a(LoadType type, LoadState state) {
                Intrinsics.h(type, "type");
                Intrinsics.h(state, "state");
                Iterator it = this.d.j.iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(type, state);
                }
            }
        };
        this.h = r0;
        this.i = new AsyncPagedListDiffer$loadStateListener$1(r0);
        this.j = new CopyOnWriteArrayList();
        this.k = new AsyncPagedListDiffer$pagedListCallback$1(this);
        this.f3524a = pagedListModelCache$updateCallback$1;
        this.b = asyncDifferConfig;
    }
}
