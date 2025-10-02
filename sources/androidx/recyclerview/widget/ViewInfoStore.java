package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.LongSparseArrayKt;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
class ViewInfoStore {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f3707a = new SimpleArrayMap(0);
    public final LongSparseArray b = new LongSparseArray((Object) null);

    public static class InfoRecord {
        public static final Pools.SimplePool d = new Pools.SimplePool(20);

        /* renamed from: a, reason: collision with root package name */
        public int f3708a;
        public RecyclerView.ItemAnimator.ItemHolderInfo b;
        public RecyclerView.ItemAnimator.ItemHolderInfo c;

        public static InfoRecord a() {
            InfoRecord infoRecord = (InfoRecord) d.a();
            return infoRecord == null ? new InfoRecord() : infoRecord;
        }
    }

    public interface ProcessCallback {
    }

    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        SimpleArrayMap simpleArrayMap = this.f3707a;
        InfoRecord infoRecordA = (InfoRecord) simpleArrayMap.get(viewHolder);
        if (infoRecordA == null) {
            infoRecordA = InfoRecord.a();
            simpleArrayMap.put(viewHolder, infoRecordA);
        }
        infoRecordA.c = itemHolderInfo;
        infoRecordA.f3708a |= 8;
    }

    public final RecyclerView.ItemAnimator.ItemHolderInfo b(RecyclerView.ViewHolder viewHolder, int i) {
        InfoRecord infoRecord;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        SimpleArrayMap simpleArrayMap = this.f3707a;
        int iIndexOfKey = simpleArrayMap.indexOfKey(viewHolder);
        if (iIndexOfKey >= 0 && (infoRecord = (InfoRecord) simpleArrayMap.valueAt(iIndexOfKey)) != null) {
            int i2 = infoRecord.f3708a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                infoRecord.f3708a = i3;
                if (i == 4) {
                    itemHolderInfo = infoRecord.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = infoRecord.c;
                }
                if ((i3 & 12) == 0) {
                    simpleArrayMap.removeAt(iIndexOfKey);
                    infoRecord.f3708a = 0;
                    infoRecord.b = null;
                    infoRecord.c = null;
                    InfoRecord.d.b(infoRecord);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.f3707a.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.f3708a &= -2;
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        LongSparseArray longSparseArray = this.b;
        int iJ = longSparseArray.j() - 1;
        while (true) {
            if (iJ < 0) {
                break;
            }
            if (viewHolder == longSparseArray.k(iJ)) {
                Object[] objArr = longSparseArray.f;
                Object obj = objArr[iJ];
                Object obj2 = LongSparseArrayKt.f689a;
                if (obj != obj2) {
                    objArr[iJ] = obj2;
                    longSparseArray.d = true;
                }
            } else {
                iJ--;
            }
        }
        InfoRecord infoRecord = (InfoRecord) this.f3707a.remove(viewHolder);
        if (infoRecord != null) {
            infoRecord.f3708a = 0;
            infoRecord.b = null;
            infoRecord.c = null;
            InfoRecord.d.b(infoRecord);
        }
    }
}
