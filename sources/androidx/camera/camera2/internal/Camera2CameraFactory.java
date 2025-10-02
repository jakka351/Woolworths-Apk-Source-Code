package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CameraThreadConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class Camera2CameraFactory implements CameraFactory {

    /* renamed from: a, reason: collision with root package name */
    public final Context f230a;
    public final Camera2CameraCoordinator b;
    public final CameraThreadConfig c;
    public final CameraStateRegistry d;
    public final CameraManagerCompat e;
    public final ArrayList f;
    public final DisplayInfoManager g;
    public final long h;
    public final HashMap i = new HashMap();

    public Camera2CameraFactory(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector, long j) throws InitializationException {
        String strA;
        this.f230a = context;
        this.c = cameraThreadConfig;
        CameraManagerCompat cameraManagerCompatA = CameraManagerCompat.a(context);
        this.e = cameraManagerCompatA;
        this.g = DisplayInfoManager.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(cameraManagerCompatA.f304a.e());
            if (cameraSelector == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    strA = CameraSelectionOptimizer.a(cameraManagerCompatA, cameraSelector.b(), listAsList);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList) {
                    if (!str.equals(strA)) {
                        arrayList2.add(e(str));
                    }
                }
                Iterator it2 = cameraSelector.a(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((CameraInfoInternal) ((CameraInfo) it2.next())).b());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str2 = (String) it3.next();
                if (str2.equals("0") || str2.equals("1")) {
                    arrayList3.add(str2);
                } else if (CameraIdUtil.a(this.e, str2)) {
                    arrayList3.add(str2);
                } else {
                    Logger.a("Camera2CameraFactory", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            this.f = arrayList3;
            Camera2CameraCoordinator camera2CameraCoordinator = new Camera2CameraCoordinator(this.e);
            this.b = camera2CameraCoordinator;
            CameraStateRegistry cameraStateRegistry = new CameraStateRegistry(camera2CameraCoordinator);
            this.d = cameraStateRegistry;
            camera2CameraCoordinator.f371a.add(cameraStateRegistry);
            this.h = j;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(new CameraUnavailableException(e));
        } catch (CameraUnavailableException e2) {
            throw new InitializationException(e2);
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final CameraManagerCompat a() {
        return this.e;
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final CameraInternal b(String str) throws CameraUnavailableException {
        if (!this.f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        Camera2CameraInfoImpl camera2CameraInfoImplE = e(str);
        CameraThreadConfig cameraThreadConfig = this.c;
        return new Camera2CameraImpl(this.f230a, this.e, str, camera2CameraInfoImplE, this.b, this.d, cameraThreadConfig.b(), cameraThreadConfig.c(), this.g, this.h);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final LinkedHashSet c() {
        return new LinkedHashSet(this.f);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final Camera2CameraCoordinator d() {
        return this.b;
    }

    public final Camera2CameraInfoImpl e(String str) throws CameraUnavailableException {
        HashMap map = this.i;
        try {
            Camera2CameraInfoImpl camera2CameraInfoImpl = (Camera2CameraInfoImpl) map.get(str);
            if (camera2CameraInfoImpl != null) {
                return camera2CameraInfoImpl;
            }
            Camera2CameraInfoImpl camera2CameraInfoImpl2 = new Camera2CameraInfoImpl(this.e, str);
            map.put(str, camera2CameraInfoImpl2);
            return camera2CameraInfoImpl2;
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }
}
