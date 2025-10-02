package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.AbstractList;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/ItemSnapshotList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/collections/AbstractList;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ItemSnapshotList<T> extends AbstractList<T> {
    public final int d;
    public final int e;
    public final ArrayList f;

    public ItemSnapshotList(int i, int i2, ArrayList arrayList) {
        this.d = i;
        this.e = i2;
        this.f = arrayList;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public final int getF() {
        return this.f.size() + this.d + this.e;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.d;
        if (i >= 0 && i < i2) {
            return null;
        }
        ArrayList arrayList = this.f;
        if (i < arrayList.size() + i2 && i2 <= i) {
            return arrayList.get(i - i2);
        }
        int size = arrayList.size() + i2;
        if (i < getF() && size <= i) {
            return null;
        }
        StringBuilder sbR = YU.a.r(i, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
        sbR.append(getF());
        throw new IndexOutOfBoundsException(sbR.toString());
    }
}
