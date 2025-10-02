package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CameraFilter {
    public final /* synthetic */ int b;

    @Override // androidx.camera.core.CameraFilter
    public final List a(List list) {
        switch (this.b) {
            case 0:
                int i = CameraFilters.f476a;
                return list;
            default:
                int i2 = CameraFilters.f476a;
                return Collections.EMPTY_LIST;
        }
    }
}
