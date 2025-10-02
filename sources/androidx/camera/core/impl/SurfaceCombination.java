package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class SurfaceCombination {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f503a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(SurfaceConfig surfaceConfig) {
        this.f503a.add(surfaceConfig);
    }

    public final List c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f503a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        b(arrayList2, size2, new int[size2], 0);
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z2 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    SurfaceConfig surfaceConfig = (SurfaceConfig) arrayList.get(i);
                    SurfaceConfig surfaceConfig2 = (SurfaceConfig) list.get(iArr[i]);
                    surfaceConfig.getClass();
                    z2 &= surfaceConfig2.c().d <= surfaceConfig.c().d && surfaceConfig2.d() == surfaceConfig.d();
                    if (!z2) {
                        break;
                    }
                    surfaceConfigArr[iArr[i]] = (SurfaceConfig) arrayList.get(i);
                }
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }
}
