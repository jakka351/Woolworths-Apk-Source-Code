package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.SupportedOutputSizesSorter;
import androidx.camera.core.internal.utils.SizeUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ResolutionsMerger {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public static final /* synthetic */ int i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Size f567a;
    public final Rational b;
    public final Rational c;
    public final HashSet d;
    public final SupportedOutputSizesSorter e;
    public final CameraInfoInternal f;
    public final HashMap g;

    public static class CompareAspectRatioByOverlappingAreaToReference implements Comparator<Rational> {
        public final Rational d;

        public CompareAspectRatioByOverlappingAreaToReference(Rational rational) {
            this.d = rational;
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational2;
            int i = ResolutionsMerger.i;
            float fFloatValue = rational.floatValue();
            Rational rational4 = this.d;
            float fFloatValue2 = rational4.floatValue();
            float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
            float fFloatValue3 = rational3.floatValue();
            float fFloatValue4 = rational4.floatValue();
            return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
        }
    }

    public ResolutionsMerger(CameraInternal cameraInternal, HashSet hashSet) {
        Size sizeE = TransformUtils.e(cameraInternal.k().i());
        CameraInfoInternal cameraInfoInternalD = cameraInternal.d();
        SupportedOutputSizesSorter supportedOutputSizesSorter = new SupportedOutputSizesSorter(cameraInfoInternalD, sizeE);
        this.g = new HashMap();
        this.f567a = sizeE;
        Rational rational = ((double) sizeE.getWidth()) / ((double) sizeE.getHeight()) > h ? AspectRatioUtil.c : AspectRatioUtil.f509a;
        Logger.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + sizeE + ") is " + rational + ".");
        this.b = rational;
        Rational rational2 = AspectRatioUtil.f509a;
        if (rational.equals(rational2)) {
            rational2 = AspectRatioUtil.c;
        } else if (!rational.equals(AspectRatioUtil.c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.c = rational2;
        this.f = cameraInfoInternalD;
        this.d = hashSet;
        this.e = supportedOutputSizesSorter;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalG = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalG2 = g(size);
        if (rationalG.floatValue() == rationalG2.floatValue()) {
            rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
        } else {
            if (rationalG.floatValue() > rationalG2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalG.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(BitmapDescriptorFactory.HUE_RED, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalG.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, BitmapDescriptorFactory.HUE_RED, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(UseCaseConfig useCaseConfig) {
        Rational rationalG;
        if (!this.d.contains(useCaseConfig)) {
            throw new IllegalArgumentException("Invalid child config: " + useCaseConfig);
        }
        HashMap map = this.g;
        if (map.containsKey(useCaseConfig)) {
            List list = (List) map.get(useCaseConfig);
            Objects.requireNonNull(list);
            return list;
        }
        List listB = this.e.b(useCaseConfig);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) listB).iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = map2.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rationalG = null;
                    break;
                }
                rationalG = (Rational) it2.next();
                Rational rational = AspectRatioUtil.f509a;
                if (AspectRatioUtil.a(size, rationalG, SizeUtil.c)) {
                    break;
                }
            }
            if (rationalG != null) {
                Size size2 = (Size) map2.get(rationalG);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalG = g(size);
            }
            arrayList.add(size);
            map2.put(rationalG, size);
        }
        map.put(useCaseConfig, arrayList);
        return arrayList;
    }

    public final boolean d(Rational rational, Size size) {
        Rational rational2 = this.b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = AspectRatioUtil.f509a;
        Size size2 = SizeUtil.c;
        if (AspectRatioUtil.a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalG = AspectRatioUtil.f509a;
        if (!AspectRatioUtil.a(size, rationalG, size2)) {
            rationalG = AspectRatioUtil.c;
            if (!AspectRatioUtil.a(size, rationalG, size2)) {
                rationalG = g(size);
            }
        }
        float fFloatValue3 = rationalG.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        return fFloatValue > fFloatValue2 ? fFloatValue2 < fFloatValue3 : fFloatValue2 > fFloatValue3;
    }

    public final ArrayList e(List list, boolean z) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = AspectRatioUtil.f509a;
        map.put(rational, new ArrayList());
        Rational rational2 = AspectRatioUtil.c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (AspectRatioUtil.a(size, rational3, SizeUtil.c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalG = g(size);
                    arrayList2.add(rationalG);
                    map.put(rationalG, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new CompareAspectRatioByOverlappingAreaToReference(g(this.f567a)));
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(AspectRatioUtil.c) && !rational4.equals(AspectRatioUtil.f509a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(f(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final ArrayList f(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = AspectRatioUtil.f509a;
            if (AspectRatioUtil.a(size, rational, SizeUtil.c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new CompareSizesByArea(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            List<Size> listB = b((UseCaseConfig) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listB) {
                    if (!d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listB = arrayList3;
            }
            if (listB.isEmpty()) {
                return new ArrayList();
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!c((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listB.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (c((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
