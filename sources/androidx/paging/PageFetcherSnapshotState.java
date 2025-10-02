package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PagingSource;
import androidx.paging.ViewportHint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState;", "", "Key", "Value", "Holder", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PageFetcherSnapshotState<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    public final PagingConfig f3562a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final BufferedChannel i;
    public final BufferedChannel j;
    public final LinkedHashMap k;
    public final MutableLoadStateCollection l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState$Holder;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Holder<Key, Value> {

        /* renamed from: a, reason: collision with root package name */
        public final MutexImpl f3563a = MutexKt.a();
        public final PageFetcherSnapshotState b;

        public Holder(PagingConfig pagingConfig) {
            this.b = new PageFetcherSnapshotState(pagingConfig);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3564a;

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
            f3564a = iArr;
        }
    }

    public PageFetcherSnapshotState(PagingConfig pagingConfig) {
        this.f3562a = pagingConfig;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.i = ChannelKt.a(-1, 6, null);
        this.j = ChannelKt.a(-1, 6, null);
        this.k = new LinkedHashMap();
        MutableLoadStateCollection mutableLoadStateCollection = new MutableLoadStateCollection();
        mutableLoadStateCollection.c(LoadType.d, LoadState.Loading.b);
        this.l = mutableLoadStateCollection;
    }

    public final PagingState a(ViewportHint.Access access) {
        Integer numValueOf;
        PagingConfig pagingConfig = this.f3562a;
        int i = pagingConfig.f3572a;
        ArrayList arrayList = this.c;
        List listG0 = CollectionsKt.G0(arrayList);
        if (access != null) {
            int i2 = access.e;
            int iD = d();
            int i3 = -this.d;
            int I = CollectionsKt.I(arrayList) - this.d;
            int i4 = i3;
            while (i4 < i2) {
                iD += i4 > I ? i : ((PagingSource.LoadResult.Page) arrayList.get(this.d + i4)).d.size();
                i4++;
            }
            int i5 = iD + access.f;
            if (i2 < i3) {
                i5 -= i;
            }
            numValueOf = Integer.valueOf(i5);
        } else {
            numValueOf = null;
        }
        return new PagingState(listG0, numValueOf, pagingConfig, d());
    }

    public final void b(PageEvent.Drop drop) {
        int i = drop.d;
        LoadType loadType = drop.f3551a;
        int iB = drop.b();
        ArrayList arrayList = this.c;
        if (iB > arrayList.size()) {
            throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + drop.b()).toString());
        }
        this.k.remove(loadType);
        this.l.c(loadType, LoadState.NotLoading.c);
        int iOrdinal = loadType.ordinal();
        ArrayList arrayList2 = this.b;
        if (iOrdinal == 1) {
            int iB2 = drop.b();
            for (int i2 = 0; i2 < iB2; i2++) {
                arrayList2.remove(0);
            }
            this.d -= drop.b();
            if (i == Integer.MIN_VALUE) {
                i = 0;
            }
            this.e = i;
            int i3 = this.g + 1;
            this.g = i3;
            this.i.k(Integer.valueOf(i3));
            return;
        }
        if (iOrdinal != 2) {
            throw new IllegalArgumentException("cannot drop " + loadType);
        }
        int iB3 = drop.b();
        for (int i4 = 0; i4 < iB3; i4++) {
            arrayList2.remove(arrayList.size() - 1);
        }
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f = i;
        int i5 = this.h + 1;
        this.h = i5;
        this.j.k(Integer.valueOf(i5));
    }

    public final PageEvent.Drop c(LoadType loadType, ViewportHint hint) {
        Intrinsics.h(loadType, "loadType");
        Intrinsics.h(hint, "hint");
        PagingConfig pagingConfig = this.f3562a;
        int i = pagingConfig.e;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        ArrayList arrayList = this.c;
        if (arrayList.size() <= 2) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((PagingSource.LoadResult.Page) it.next()).d.size();
        }
        if (size <= i) {
            return null;
        }
        if (loadType == LoadType.d) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < arrayList.size()) {
            Iterator it2 = arrayList.iterator();
            int size2 = 0;
            while (it2.hasNext()) {
                size2 += ((PagingSource.LoadResult.Page) it2.next()).d.size();
            }
            if (size2 - i3 <= i) {
                break;
            }
            int[] iArr = WhenMappings.f3564a;
            int size3 = iArr[loadType.ordinal()] == 2 ? ((PagingSource.LoadResult.Page) arrayList.get(i2)).d.size() : ((PagingSource.LoadResult.Page) arrayList.get(CollectionsKt.I(arrayList) - i2)).d.size();
            if (((iArr[loadType.ordinal()] == 2 ? hint.f3592a : hint.b) - i3) - size3 < pagingConfig.b) {
                break;
            }
            i3 += size3;
            i2++;
        }
        if (i2 == 0) {
            return null;
        }
        int[] iArr2 = WhenMappings.f3564a;
        int I = iArr2[loadType.ordinal()] == 2 ? -this.d : (CollectionsKt.I(arrayList) - this.d) - (i2 - 1);
        int I2 = iArr2[loadType.ordinal()] == 2 ? (i2 - 1) - this.d : CollectionsKt.I(arrayList) - this.d;
        if (pagingConfig.c) {
            if (loadType == LoadType.e) {
                iD = d() + i3;
            } else {
                iD = (pagingConfig.c ? this.f : 0) + i3;
            }
        }
        return new PageEvent.Drop(loadType, I, I2, iD);
    }

    public final int d() {
        if (this.f3562a.c) {
            return this.e;
        }
        return 0;
    }

    public final boolean e(int i, LoadType loadType, PagingSource.LoadResult.Page page) {
        Intrinsics.h(loadType, "loadType");
        Intrinsics.h(page, "page");
        int i2 = page.g;
        List list = page.d;
        int i3 = page.h;
        int iOrdinal = loadType.ordinal();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            arrayList.add(page);
            this.d = 0;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            this.f = i3;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            this.e = i2;
            return true;
        }
        LinkedHashMap linkedHashMap = this.k;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before append");
            }
            if (i == this.h) {
                arrayList.add(page);
                if (i3 == Integer.MIN_VALUE) {
                    int size = (this.f3562a.c ? this.f : 0) - list.size();
                    i3 = size < 0 ? 0 : size;
                }
                this.f = i3 != Integer.MIN_VALUE ? i3 : 0;
                linkedHashMap.remove(LoadType.f);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before prepend");
            }
            if (i == this.g) {
                arrayList.add(0, page);
                this.d++;
                if (i2 == Integer.MIN_VALUE) {
                    int iD = d() - list.size();
                    i2 = iD < 0 ? 0 : iD;
                }
                this.e = i2 != Integer.MIN_VALUE ? i2 : 0;
                linkedHashMap.remove(LoadType.e);
                return true;
            }
        }
        return false;
    }

    public final PageEvent.Insert f(LoadType loadType, PagingSource.LoadResult.Page page) {
        int size;
        Intrinsics.h(page, "<this>");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            size = 0;
        } else if (iOrdinal == 1) {
            size = 0 - this.d;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            size = (this.c.size() - this.d) - 1;
        }
        List listQ = CollectionsKt.Q(new TransformablePage(size, page.d));
        int iOrdinal2 = loadType.ordinal();
        PagingConfig pagingConfig = this.f3562a;
        MutableLoadStateCollection mutableLoadStateCollection = this.l;
        if (iOrdinal2 == 0) {
            PageEvent.Insert insert = PageEvent.Insert.g;
            return PageEvent.Insert.Companion.a(listQ, d(), pagingConfig.c ? this.f : 0, mutableLoadStateCollection.d(), null);
        }
        if (iOrdinal2 == 1) {
            PageEvent.Insert insert2 = PageEvent.Insert.g;
            return new PageEvent.Insert(LoadType.e, listQ, d(), -1, mutableLoadStateCollection.d(), null);
        }
        if (iOrdinal2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        PageEvent.Insert insert3 = PageEvent.Insert.g;
        return new PageEvent.Insert(LoadType.f, listQ, -1, pagingConfig.c ? this.f : 0, mutableLoadStateCollection.d(), null);
    }
}
