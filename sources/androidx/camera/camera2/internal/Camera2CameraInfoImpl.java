package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.OptIn;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.CameraQuirks;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

@OptIn
/* loaded from: classes2.dex */
public final class Camera2CameraInfoImpl implements CameraInfoInternal {

    /* renamed from: a, reason: collision with root package name */
    public final String f241a;
    public final CameraCharacteristicsCompat b;
    public final Camera2CameraInfo c;
    public Camera2CameraControlImpl e;
    public final RedirectableLiveData h;
    public final Quirks j;
    public final Camera2EncoderProfilesProvider k;
    public final Object d = new Object();
    public RedirectableLiveData f = null;
    public RedirectableLiveData g = null;
    public ArrayList i = null;

    public static class RedirectableLiveData<T> extends MediatorLiveData<T> {
        public LiveData m;
        public final Object n;

        public RedirectableLiveData(Object obj) {
            this.n = obj;
        }

        @Override // androidx.lifecycle.LiveData
        public final Object e() {
            LiveData liveData = this.m;
            return liveData == null ? this.n : liveData.e();
        }

        @Override // androidx.lifecycle.MediatorLiveData
        public final void n(LiveData liveData, Observer observer) {
            throw new UnsupportedOperationException();
        }

        public final void p(MutableLiveData mutableLiveData) {
            LiveData liveData = this.m;
            if (liveData != null) {
                o(liveData);
            }
            this.m = mutableLiveData;
            super.n(mutableLiveData, new Observer() { // from class: androidx.camera.camera2.internal.p
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.d.m(obj);
                }
            });
        }
    }

    public Camera2CameraInfoImpl(CameraManagerCompat cameraManagerCompat, String str) {
        str.getClass();
        this.f241a = str;
        CameraCharacteristicsCompat cameraCharacteristicsCompatB = cameraManagerCompat.b(str);
        this.b = cameraCharacteristicsCompatB;
        Camera2CameraInfo camera2CameraInfo = new Camera2CameraInfo();
        camera2CameraInfo.f382a = this;
        this.c = camera2CameraInfo;
        Quirks quirksA = CameraQuirks.a(cameraCharacteristicsCompatB);
        this.j = quirksA;
        this.k = new Camera2EncoderProfilesProvider(str, quirksA);
        this.h = new RedirectableLiveData(CameraState.a(CameraState.Type.h));
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set a() {
        return DynamicRangesCompat.a(this.b).c();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final String b() {
        return this.f241a;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void c(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.e;
                if (camera2CameraControlImpl != null) {
                    camera2CameraControlImpl.c.execute(new d(0, camera2CameraControlImpl, executor, cameraCaptureCallback));
                    return;
                }
                if (this.i == null) {
                    this.i = new ArrayList();
                }
                this.i.add(new Pair(cameraCaptureCallback, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final int d() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        Preconditions.a("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(YU.a.e(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void e(CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.e;
                if (camera2CameraControlImpl != null) {
                    camera2CameraControlImpl.c.execute(new b(0, camera2CameraControlImpl, cameraCaptureCallback));
                    return;
                }
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == cameraCaptureCallback) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final int f(int i) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return CameraOrientationUtil.a(CameraOrientationUtil.b(i), num.intValue(), 1 == d());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final EncoderProfilesProvider g() {
        return this.k;
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData h() {
        synchronized (this.d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.e;
                if (camera2CameraControlImpl != null) {
                    RedirectableLiveData redirectableLiveData = this.g;
                    if (redirectableLiveData != null) {
                        return redirectableLiveData;
                    }
                    return camera2CameraControlImpl.i.d;
                }
                if (this.g == null) {
                    ZoomControl.ZoomImpl zoomImplA = ZoomControl.a(this.b);
                    ZoomStateImpl zoomStateImpl = new ZoomStateImpl(zoomImplA.d(), zoomImplA.c());
                    zoomStateImpl.f(1.0f);
                    this.g = new RedirectableLiveData(ImmutableZoomState.f(zoomStateImpl));
                }
                return this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final int i() {
        return f(0);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Quirks j() {
        return this.j;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List k(int i) {
        Size[] sizeArrB = this.b.b().b(i);
        return sizeArrB != null ? Arrays.asList(sizeArrB) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean l() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData m() {
        synchronized (this.d) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.e;
                if (camera2CameraControlImpl == null) {
                    if (this.f == null) {
                        this.f = new RedirectableLiveData(0);
                    }
                    return this.f;
                }
                RedirectableLiveData redirectableLiveData = this.f;
                if (redirectableLiveData != null) {
                    return redirectableLiveData;
                }
                return camera2CameraControlImpl.j.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Timebase n() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? Timebase.d : Timebase.e;
    }

    @Override // androidx.camera.core.CameraInfo
    public final String o() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    public final void p(Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.d) {
            try {
                this.e = camera2CameraControlImpl;
                RedirectableLiveData redirectableLiveData = this.g;
                if (redirectableLiveData != null) {
                    redirectableLiveData.p(camera2CameraControlImpl.i.d);
                }
                RedirectableLiveData redirectableLiveData2 = this.f;
                if (redirectableLiveData2 != null) {
                    redirectableLiveData2.p(this.e.j.b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        Camera2CameraControlImpl camera2CameraControlImpl2 = this.e;
                        camera2CameraControlImpl2.c.execute(new d(0, camera2CameraControlImpl2, (Executor) pair.second, (CameraCaptureCallback) pair.first));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int iIntValue = num.intValue();
        String strA = YU.a.A("Device Level: ", iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? YU.a.d(iIntValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED");
        if (Logger.d(4, "Camera2CameraInfo")) {
            Log.i("Camera2CameraInfo", strA);
        }
    }
}
