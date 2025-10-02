package androidx.camera.core.impl;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.Camera2DeviceSurfaceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public interface CameraDeviceSurfaceManager {

    public interface Provider {
        Camera2DeviceSurfaceManager a(Context context, Object obj, Set set);
    }

    SurfaceConfig a(int i, String str, int i2, Size size);

    Pair b(int i, String str, ArrayList arrayList, HashMap map, boolean z, boolean z2);
}
