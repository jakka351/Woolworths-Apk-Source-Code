package androidx.camera.camera2.internal;

import android.text.TextUtils;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.Preview;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Camera2CameraImpl e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ n(Camera2CameraImpl camera2CameraImpl, ArrayList arrayList, int i) {
        this.d = i;
        this.e = camera2CameraImpl;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode;
        switch (this.d) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = this.e;
                ArrayList arrayList = this.f;
                Camera2CameraControlImpl camera2CameraControlImpl = camera2CameraImpl.k;
                try {
                    camera2CameraImpl.J(arrayList);
                    return;
                } finally {
                    camera2CameraControlImpl.q();
                }
            default:
                Camera2CameraImpl camera2CameraImpl2 = this.e;
                ArrayList arrayList2 = this.f;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Camera2CameraImpl.UseCaseInfo useCaseInfo = (Camera2CameraImpl.UseCaseInfo) it.next();
                    if (camera2CameraImpl2.d.d(useCaseInfo.f())) {
                        camera2CameraImpl2.d.b.remove(useCaseInfo.f());
                        arrayList3.add(useCaseInfo.f());
                        if (useCaseInfo.g() == Preview.class) {
                            z = true;
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                camera2CameraImpl2.v("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera", null);
                if (z) {
                    camera2CameraImpl2.k.h.e = null;
                }
                camera2CameraImpl2.r();
                if (camera2CameraImpl2.d.c().isEmpty()) {
                    camera2CameraImpl2.k.l.c = false;
                } else {
                    camera2CameraImpl2.N();
                }
                if (!camera2CameraImpl2.d.b().isEmpty()) {
                    camera2CameraImpl2.M();
                    camera2CameraImpl2.F();
                    if (camera2CameraImpl2.h == Camera2CameraImpl.InternalState.l) {
                        camera2CameraImpl2.D();
                        return;
                    }
                    return;
                }
                camera2CameraImpl2.k.q();
                camera2CameraImpl2.F();
                camera2CameraImpl2.k.y(false);
                camera2CameraImpl2.p = camera2CameraImpl2.B();
                Camera2CameraImpl.InternalState internalState = Camera2CameraImpl.InternalState.h;
                camera2CameraImpl2.v("Closing camera.", null);
                switch (camera2CameraImpl2.h.ordinal()) {
                    case 3:
                        Preconditions.f(null, camera2CameraImpl2.n == null);
                        camera2CameraImpl2.G(Camera2CameraImpl.InternalState.f);
                        return;
                    case 4:
                    default:
                        camera2CameraImpl2.v("close() ignored due to being in state: " + camera2CameraImpl2.h, null);
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (camera2CameraImpl2.l.a() || ((scheduleNode = camera2CameraImpl2.L.f237a) != null && !scheduleNode.b.get())) {
                            z = true;
                        }
                        camera2CameraImpl2.L.a();
                        camera2CameraImpl2.G(internalState);
                        if (z) {
                            Preconditions.f(null, camera2CameraImpl2.q.isEmpty());
                            camera2CameraImpl2.t();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        camera2CameraImpl2.G(internalState);
                        camera2CameraImpl2.s();
                        return;
                }
        }
    }
}
