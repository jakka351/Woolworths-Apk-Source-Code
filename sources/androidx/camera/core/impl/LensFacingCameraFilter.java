package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class LensFacingCameraFilter implements CameraFilter {
    public final int b;

    public LensFacingCameraFilter(int i) {
        this.b = i;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            Preconditions.a("The camera info doesn't contain internal implementation.", cameraInfo instanceof CameraInfoInternal);
            if (cameraInfo.d() == this.b) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }
}
