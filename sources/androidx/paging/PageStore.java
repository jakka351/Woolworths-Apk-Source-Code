package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.PagingDataEvent;
import androidx.paging.ViewportHint;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PageStore;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PlaceholderPaddedList;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PageStore<T> implements PlaceholderPaddedList<T> {
    public static final PageStore h = new PageStore(PageEvent.Insert.g);
    public final ArrayList d;
    public int e;
    public int f;
    public int g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PageStore$Companion;", "", "Landroidx/paging/PageStore;", "INITIAL", "Landroidx/paging/PageStore;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

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

    public PageStore(int i, int i2, List pages) {
        Intrinsics.h(pages, "pages");
        this.d = CollectionsKt.J0(pages);
        Iterator<T> it = pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((TransformablePage) it.next()).b.size();
        }
        this.e = size;
        this.f = i;
        this.g = i2;
    }

    public final ViewportHint.Access a(int i) {
        ArrayList arrayList;
        int iIntValue = i - this.f;
        int i2 = 0;
        while (true) {
            arrayList = this.d;
            if (iIntValue < ((TransformablePage) arrayList.get(i2)).b.size() || i2 >= CollectionsKt.I(arrayList)) {
                break;
            }
            iIntValue -= ((TransformablePage) arrayList.get(i2)).b.size();
            i2++;
        }
        TransformablePage transformablePage = (TransformablePage) arrayList.get(i2);
        int i3 = i - this.f;
        int size = ((getSize() - i) - this.g) - 1;
        Integer numY = ArraysKt.Y(((TransformablePage) CollectionsKt.D(arrayList)).f3590a);
        Intrinsics.e(numY);
        int iIntValue2 = numY.intValue();
        Integer numW = ArraysKt.W(((TransformablePage) CollectionsKt.O(arrayList)).f3590a);
        Intrinsics.e(numW);
        int iIntValue3 = numW.intValue();
        int i4 = transformablePage.c;
        List list = transformablePage.d;
        if (list != null && CollectionsKt.H(list).g(iIntValue)) {
            iIntValue = ((Number) list.get(iIntValue)).intValue();
        }
        return new ViewportHint.Access(i4, iIntValue, i3, size, iIntValue2, iIntValue3);
    }

    @Override // androidx.paging.PlaceholderPaddedList
    /* renamed from: b, reason: from getter */
    public final int getI() {
        return this.e;
    }

    public final PagingDataEvent c(PageEvent pageEvent) {
        Intrinsics.h(pageEvent, "pageEvent");
        boolean z = pageEvent instanceof PageEvent.Insert;
        ArrayList arrayList = this.d;
        if (!z) {
            if (!(pageEvent instanceof PageEvent.Drop)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            PageEvent.Drop drop = (PageEvent.Drop) pageEvent;
            int i = drop.b;
            int i2 = drop.d;
            IntRange intRange = new IntRange(i, drop.c, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                TransformablePage transformablePage = (TransformablePage) it.next();
                int[] iArr = transformablePage.f3590a;
                int length = iArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (intRange.g(iArr[i3])) {
                        size += transformablePage.b.size();
                        it.remove();
                        break;
                    }
                    i3++;
                }
            }
            int i4 = this.e - size;
            this.e = i4;
            if (drop.f3551a == LoadType.e) {
                int i5 = this.f;
                this.f = i2;
                return new PagingDataEvent.DropPrepend(size, i2, i5);
            }
            int i6 = this.g;
            this.g = i2;
            return new PagingDataEvent.DropAppend(this.f + i4, size, i2, i6);
        }
        PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
        List list = insert.b;
        List list2 = list;
        Iterator<T> it2 = list2.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((TransformablePage) it2.next()).b.size();
        }
        int iOrdinal = insert.f3552a.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (iOrdinal == 1) {
            int i7 = this.f;
            arrayList.addAll(0, list);
            this.e += size2;
            this.f = insert.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                CollectionsKt.h(((TransformablePage) it3.next()).b, arrayList2);
            }
            return new PagingDataEvent.Prepend(this.f, i7, arrayList2);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = this.g;
        int i9 = this.e;
        arrayList.addAll(arrayList.size(), list);
        this.e += size2;
        this.g = insert.d;
        int i10 = this.f + i9;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            CollectionsKt.h(((TransformablePage) it4.next()).b, arrayList3);
        }
        return new PagingDataEvent.Append(i10, arrayList3, this.g, i8);
    }

    @Override // androidx.paging.PlaceholderPaddedList
    /* renamed from: d, reason: from getter */
    public final int getE() {
        return this.f;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    /* renamed from: g, reason: from getter */
    public final int getF() {
        return this.g;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final Object getItem(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((TransformablePage) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((TransformablePage) arrayList.get(i2)).b.get(i);
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public final int getSize() {
        return this.f + this.e + this.g;
    }

    public final String toString() {
        int i = this.e;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(getItem(i2));
        }
        String strM = CollectionsKt.M(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        androidx.compose.ui.input.pointer.a.u(this.f, " placeholders), ", strM, ", (", sb);
        return YU.a.m(sb, this.g, " placeholders)]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageStore(PageEvent.Insert insertEvent) {
        this(insertEvent.c, insertEvent.d, insertEvent.b);
        Intrinsics.h(insertEvent, "insertEvent");
    }
}
