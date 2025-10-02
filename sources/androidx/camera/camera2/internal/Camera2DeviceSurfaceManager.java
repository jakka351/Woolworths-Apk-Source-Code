package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Camera2DeviceSurfaceManager implements CameraDeviceSurfaceManager {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f254a;
    public final AnonymousClass1 b;

    /* renamed from: androidx.camera.camera2.internal.Camera2DeviceSurfaceManager$1, reason: invalid class name */
    class AnonymousClass1 implements CamcorderProfileHelper {
        @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
        public final CamcorderProfile a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
        public final boolean b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public Camera2DeviceSurfaceManager(Context context, Object obj, Set set) {
        CameraManagerCompat cameraManagerCompatA;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.f254a = new HashMap();
        this.b = anonymousClass1;
        if (obj instanceof CameraManagerCompat) {
            cameraManagerCompatA = (CameraManagerCompat) obj;
        } else {
            MainThreadAsyncHandler.a();
            cameraManagerCompatA = CameraManagerCompat.a(context);
        }
        context.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f254a.put(str, new SupportedSurfaceCombination(context, str, cameraManagerCompatA, this.b));
        }
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public final SurfaceConfig a(int i, String str, int i2, Size size) {
        SupportedSurfaceCombination supportedSurfaceCombination = (SupportedSurfaceCombination) this.f254a.get(str);
        if (supportedSurfaceCombination != null) {
            return SurfaceConfig.g(i, i2, size, supportedSurfaceCombination.i(i2));
        }
        return null;
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public final Pair b(int i, String str, ArrayList arrayList, HashMap map, boolean z, boolean z2) {
        Preconditions.a("No new use cases to be bound.", !map.isEmpty());
        SupportedSurfaceCombination supportedSurfaceCombination = (SupportedSurfaceCombination) this.f254a.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.g(i, arrayList, map, z, z2);
        }
        throw new IllegalArgumentException(YU.a.A("No such camera id in supported combination list: ", str));
    }
}
