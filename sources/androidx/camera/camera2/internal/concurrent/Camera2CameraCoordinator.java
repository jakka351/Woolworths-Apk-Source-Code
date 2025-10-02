package androidx.camera.camera2.internal.concurrent;

import YU.a;
import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl;
import androidx.camera.camera2.internal.CameraIdUtil;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class Camera2CameraCoordinator implements CameraCoordinator {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f371a;
    public final HashMap b;
    public final ArrayList c;
    public final HashSet d;
    public int e = 0;

    public Camera2CameraCoordinator(CameraManagerCompat cameraManagerCompat) {
        HashMap map = new HashMap();
        this.b = map;
        this.d = new HashSet();
        this.f371a = new ArrayList();
        this.c = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = cameraManagerCompat.f304a.d();
        } catch (CameraAccessExceptionCompat unused) {
            Logger.b("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (CameraIdUtil.a(cameraManagerCompat, str) && CameraIdUtil.a(cameraManagerCompat, str2)) {
                        this.d.add(new HashSet(Arrays.asList(str, str2)));
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    Logger.a("Camera2CameraCoordinator", a.j("Concurrent camera id pair: (", str, ", ", str2, ") is not backward compatible"));
                }
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final String a(String str) {
        Camera2CameraInfo camera2CameraInfo;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            for (String str2 : (List) map.get(str)) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    CameraInfo cameraInfo = (CameraInfo) it.next();
                    if (cameraInfo instanceof Camera2PhysicalCameraInfoImpl) {
                        camera2CameraInfo = null;
                    } else {
                        CameraInfoInternal implementation = ((CameraInfoInternal) cameraInfo).getImplementation();
                        Preconditions.a("CameraInfo doesn't contain Camera2 implementation.", implementation instanceof Camera2CameraInfoImpl);
                        camera2CameraInfo = ((Camera2CameraInfoImpl) implementation).c;
                    }
                    if (str2.equals(camera2CameraInfo.f382a.f241a)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final int b() {
        return this.e;
    }
}
