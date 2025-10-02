package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.PagingSource;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/PagedStorage;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/AbstractList;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Landroidx/paging/PlaceholderPaddedList;", "Callback", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PagedStorage<T> extends AbstractList<T> implements LegacyPageFetcher.KeyProvider<Object>, PlaceholderPaddedList<T> {
    public final ArrayList d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/paging/PagedStorage$Callback;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public interface Callback {
    }

    public PagedStorage() {
        this.d = new ArrayList();
        this.h = true;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    /* renamed from: b, reason: from getter */
    public final int getE() {
        return this.i;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    /* renamed from: d, reason: from getter */
    public final int getF() {
        return this.e;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    /* renamed from: g, reason: from getter */
    public final int getG() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = i - this.e;
        if (i < 0 || i >= getSize()) {
            StringBuilder sbR = YU.a.r(i, "Index: ", ", Size: ");
            sbR.append(getSize());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        if (i2 < 0 || i2 >= this.i) {
            return null;
        }
        return getItem(i2);
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final Object getItem(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((PagingSource.LoadResult.Page) arrayList.get(i2)).d.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((PagingSource.LoadResult.Page) arrayList.get(i2)).d.get(i);
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final int getSize() {
        return this.e + this.i + this.f;
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public final Object h() {
        if (!this.h || this.f > 0) {
            return ((PagingSource.LoadResult.Page) CollectionsKt.O(this.d)).f;
        }
        return null;
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public final Object i() {
        if (!this.h || this.e + this.g > 0) {
            return ((PagingSource.LoadResult.Page) CollectionsKt.D(this.d)).e;
        }
        return null;
    }

    public final void j(int i, PagingSource.LoadResult.Page page, int i2, int i3, ContiguousPagedList contiguousPagedList, boolean z) {
        Intrinsics.h(page, "page");
        this.e = i;
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.add(page);
        this.f = i2;
        this.g = i3;
        List list = page.d;
        this.i = list.size();
        this.h = z;
        this.j = list.size() / 2;
        contiguousPagedList.n(0, getSize());
        PagedStorage pagedStorage = contiguousPagedList.g;
        contiguousPagedList.v = pagedStorage.e > 0 || pagedStorage.f > 0;
    }

    public final boolean k(int i, int i2) {
        ArrayList arrayList = this.d;
        return this.i > Integer.MAX_VALUE && arrayList.size() > 2 && this.i - ((PagingSource.LoadResult.Page) arrayList.get(i2)).d.size() >= i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "leading " + this.e + ", dataCount " + this.i + ", trailing " + this.f + ' ' + CollectionsKt.M(this.d, " ", null, null, null, 62);
    }

    public PagedStorage(PagedStorage pagedStorage) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.h = true;
        arrayList.addAll(pagedStorage.d);
        this.e = pagedStorage.e;
        this.f = pagedStorage.f;
        this.g = pagedStorage.g;
        this.h = pagedStorage.h;
        this.i = pagedStorage.i;
        this.j = pagedStorage.j;
    }
}
