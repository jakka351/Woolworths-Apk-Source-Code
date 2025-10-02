package androidx.camera.video;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
class QualityRatioToResolutionsTable {
    public static final HashMap b;
    public static final HashMap c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f587a = new HashMap();

    @AutoValue
    public static abstract class QualityRatio {
        public abstract int a();

        public abstract Quality b();
    }

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(Quality.d, Range.create(2160, 4319));
        map.put(Quality.c, Range.create(1080, 1439));
        map.put(Quality.b, Range.create(720, 1079));
        map.put(Quality.f586a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        c = map2;
        map2.put(0, AspectRatioUtil.f509a);
        map2.put(1, AspectRatioUtil.c);
    }

    public QualityRatioToResolutionsTable(List list, HashMap map) {
        HashMap map2;
        Integer num;
        Quality quality;
        HashMap map3 = b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = c;
            if (!zHasNext) {
                break;
            }
            Quality quality2 = (Quality) it.next();
            this.f587a.put(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.f587a.put(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.f587a.get(new AutoValue_QualityRatioToResolutionsTable_QualityRatio((Quality) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    quality = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    quality = (Quality) entry2.getKey();
                    break;
                }
            }
            if (quality != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (AspectRatioUtil.a(size, (Rational) entry3.getValue(), SizeUtil.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f587a.get(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(quality, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f587a.entrySet()) {
            Size size2 = (Size) map.get(((QualityRatio) entry4.getKey()).b());
            if (size2 != null) {
                Size size3 = SizeUtil.f543a;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: androidx.camera.video.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        HashMap map4 = QualityRatioToResolutionsTable.b;
                        int iA = SizeUtil.a((Size) obj);
                        int i = height;
                        return Math.abs(iA - i) - Math.abs(SizeUtil.a((Size) obj2) - i);
                    }
                });
            }
        }
    }
}
