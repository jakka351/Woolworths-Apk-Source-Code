package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class CompareSizesByArea implements Comparator<Size> {
    public final boolean d;

    public CompareSizesByArea(boolean z) {
        this.d = z;
    }

    @Override // java.util.Comparator
    public final int compare(Size size, Size size2) {
        Size size3 = size;
        Size size4 = size2;
        int iSignum = Long.signum((size3.getWidth() * size3.getHeight()) - (size4.getWidth() * size4.getHeight()));
        return this.d ? iSignum * (-1) : iSignum;
    }
}
