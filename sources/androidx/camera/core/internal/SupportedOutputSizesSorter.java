package androidx.camera.core.internal;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class SupportedOutputSizesSorter {

    /* renamed from: a, reason: collision with root package name */
    public final CameraInfoInternal f531a;
    public final int b;
    public final int c;
    public final Rational d;
    public final SupportedOutputSizesSorterLegacy e;

    public SupportedOutputSizesSorter(CameraInfoInternal cameraInfoInternal, Size size) {
        Rational rational;
        this.f531a = cameraInfoInternal;
        this.b = cameraInfoInternal.i();
        this.c = cameraInfoInternal.d();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listK = cameraInfoInternal.k(256);
            if (listK.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listK, new CompareSizesByArea(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.d = rational;
        this.e = new SupportedOutputSizesSorterLegacy(cameraInfoInternal, rational);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AspectRatioUtil.f509a);
        arrayList.add(AspectRatioUtil.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (AspectRatioUtil.a(size, (Rational) it2.next(), SizeUtil.c)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static Rational c(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z ? AspectRatioUtil.f509a : AspectRatioUtil.b;
        }
        if (i == 1) {
            return z ? AspectRatioUtil.c : AspectRatioUtil.d;
        }
        Logger.b("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap d(List list) {
        HashMap map = new HashMap();
        Iterator it = a(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (AspectRatioUtil.a(size, rational, SizeUtil.c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List e(ResolutionSelector resolutionSelector, List list, Size size, int i, Rational rational, int i2, int i3) {
        AspectRatioStrategy aspectRatioStrategy = resolutionSelector.f564a;
        HashMap mapD = d(list);
        Rational rationalC = c(aspectRatioStrategy.f563a, rational == null || rational.getNumerator() >= rational.getDenominator());
        ArrayList arrayList = new ArrayList(mapD.keySet());
        Collections.sort(arrayList, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(rationalC, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rational rational2 = (Rational) it.next();
            linkedHashMap.put(rational2, (List) mapD.get(rational2));
        }
        if (size != null) {
            Size size2 = SizeUtil.f543a;
            int height = size.getHeight() * size.getWidth();
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it2.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (SizeUtil.a(size3) <= height) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        ResolutionStrategy resolutionStrategy = resolutionSelector.b;
        if (resolutionStrategy != null) {
            Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it3.next());
                if (!list3.isEmpty()) {
                    int i4 = resolutionStrategy.b;
                    if (!resolutionStrategy.equals(ResolutionStrategy.c)) {
                        Size size4 = resolutionStrategy.f566a;
                        if (i4 == 0) {
                            boolean zContains = list3.contains(size4);
                            list3.clear();
                            if (zContains) {
                                list3.add(size4);
                            }
                        } else if (i4 == 1) {
                            f(list3, size4, true);
                        } else if (i4 == 2) {
                            f(list3, size4, false);
                        } else if (i4 == 3) {
                            g(list3, size4, true);
                        } else if (i4 == 4) {
                            g(list3, size4, false);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            for (Size size5 : (List) it4.next()) {
                if (!arrayList3.contains(size5)) {
                    arrayList3.add(size5);
                }
            }
        }
        ResolutionFilter resolutionFilter = resolutionSelector.c;
        if (resolutionFilter == null) {
            return arrayList3;
        }
        CameraOrientationUtil.a(CameraOrientationUtil.b(i), i2, i3 == 1);
        ArrayList arrayListA = resolutionFilter.a(new ArrayList(arrayList3));
        if (arrayList3.containsAll(arrayListA)) {
            return arrayListA;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    public static void f(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void g(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b(androidx.camera.core.impl.UseCaseConfig r14) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.SupportedOutputSizesSorter.b(androidx.camera.core.impl.UseCaseConfig):java.util.List");
    }
}
