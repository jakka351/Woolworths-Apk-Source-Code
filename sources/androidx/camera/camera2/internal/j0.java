package androidx.camera.camera2.internal;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }
}
