package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Camera2CameraImpl e;
    public final /* synthetic */ String f;
    public final /* synthetic */ SessionConfig g;
    public final /* synthetic */ UseCaseConfig h;
    public final /* synthetic */ StreamSpec i;
    public final /* synthetic */ List j;

    public /* synthetic */ i(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list, int i) {
        this.d = i;
        this.e = camera2CameraImpl;
        this.f = str;
        this.g = sessionConfig;
        this.h = useCaseConfig;
        this.i = streamSpec;
        this.j = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = this.e;
                String str = this.f;
                SessionConfig sessionConfig = this.g;
                UseCaseConfig useCaseConfig = this.h;
                StreamSpec streamSpec = this.i;
                List list = this.j;
                camera2CameraImpl.v(YU.a.h("Use case ", str, " RESET"), null);
                camera2CameraImpl.d.e(str, sessionConfig, useCaseConfig, streamSpec, list);
                camera2CameraImpl.r();
                camera2CameraImpl.F();
                camera2CameraImpl.M();
                if (camera2CameraImpl.h == Camera2CameraImpl.InternalState.l) {
                    camera2CameraImpl.D();
                    break;
                }
                break;
            case 1:
                Camera2CameraImpl camera2CameraImpl2 = this.e;
                String str2 = this.f;
                SessionConfig sessionConfig2 = this.g;
                UseCaseConfig useCaseConfig2 = this.h;
                StreamSpec streamSpec2 = this.i;
                List list2 = this.j;
                camera2CameraImpl2.getClass();
                camera2CameraImpl2.v("Use case " + str2 + " UPDATED", null);
                camera2CameraImpl2.d.e(str2, sessionConfig2, useCaseConfig2, streamSpec2, list2);
                camera2CameraImpl2.M();
                break;
            default:
                Camera2CameraImpl camera2CameraImpl3 = this.e;
                String str3 = this.f;
                SessionConfig sessionConfig3 = this.g;
                UseCaseConfig useCaseConfig3 = this.h;
                StreamSpec streamSpec3 = this.i;
                List list3 = this.j;
                camera2CameraImpl3.v(YU.a.h("Use case ", str3, " ACTIVE"), null);
                LinkedHashMap linkedHashMap = camera2CameraImpl3.d.b;
                UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) linkedHashMap.get(str3);
                if (useCaseAttachInfo == null) {
                    useCaseAttachInfo = new UseCaseAttachState.UseCaseAttachInfo(sessionConfig3, useCaseConfig3, streamSpec3, list3);
                    linkedHashMap.put(str3, useCaseAttachInfo);
                }
                useCaseAttachInfo.f = true;
                camera2CameraImpl3.d.e(str3, sessionConfig3, useCaseConfig3, streamSpec3, list3);
                camera2CameraImpl3.M();
                break;
        }
    }
}
