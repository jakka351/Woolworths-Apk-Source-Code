package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* loaded from: classes2.dex */
public final class Camera2UseCaseConfigFactory implements UseCaseConfigFactory {
    public final DisplayInfoManager b;

    public Camera2UseCaseConfigFactory(@NonNull Context context) {
        this.b = DisplayInfoManager.b(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0015  */
    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.Config a(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType r8, int r9) {
        /*
            r7 = this;
            androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.V()
            androidx.camera.core.impl.SessionConfig$Builder r1 = new androidx.camera.core.impl.SessionConfig$Builder
            r1.<init>()
            int r2 = r8.ordinal()
            r3 = 5
            r4 = 2
            r5 = 1
            r6 = 3
            if (r2 == 0) goto L19
            if (r2 == r6) goto L17
        L15:
            r2 = r5
            goto L1c
        L17:
            r2 = r6
            goto L1c
        L19:
            if (r9 != r4) goto L15
            r2 = r3
        L1c:
            r1.u(r2)
            androidx.camera.core.impl.Config$Option r2 = androidx.camera.core.impl.UseCaseConfig.r
            androidx.camera.core.impl.SessionConfig r1 = r1.k()
            r0.G(r2, r1)
            androidx.camera.core.impl.Config$Option r1 = androidx.camera.core.impl.UseCaseConfig.t
            androidx.camera.camera2.internal.Camera2SessionOptionUnpacker r2 = androidx.camera.camera2.internal.Camera2SessionOptionUnpacker.f256a
            r0.G(r1, r2)
            androidx.camera.core.impl.CaptureConfig$Builder r1 = new androidx.camera.core.impl.CaptureConfig$Builder
            r1.<init>()
            int r2 = r8.ordinal()
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3e
            r3 = r5
            goto L44
        L3e:
            r3 = r6
            goto L44
        L40:
            if (r9 != r4) goto L43
            goto L44
        L43:
            r3 = r4
        L44:
            r1.c = r3
            androidx.camera.core.impl.Config$Option r9 = androidx.camera.core.impl.UseCaseConfig.s
            androidx.camera.core.impl.CaptureConfig r1 = r1.d()
            r0.G(r9, r1)
            androidx.camera.core.impl.Config$Option r9 = androidx.camera.core.impl.UseCaseConfig.u
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.d
            if (r8 != r1) goto L58
            androidx.camera.camera2.internal.ImageCaptureOptionUnpacker r1 = androidx.camera.camera2.internal.ImageCaptureOptionUnpacker.b
            goto L5a
        L58:
            androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker r1 = androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker.f243a
        L5a:
            r0.G(r9, r1)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r9 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.e
            androidx.camera.camera2.internal.DisplayInfoManager r1 = r7.b
            if (r8 != r9) goto L6c
            android.util.Size r9 = r1.e()
            androidx.camera.core.impl.Config$Option r2 = androidx.camera.core.impl.ImageOutputConfig.n
            r0.G(r2, r9)
        L6c:
            android.view.Display r9 = r1.c(r5)
            int r9 = r9.getRotation()
            androidx.camera.core.impl.Config$Option r1 = androidx.camera.core.impl.ImageOutputConfig.i
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.G(r1, r9)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r9 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.g
            if (r8 == r9) goto L85
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r9 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.h
            if (r8 != r9) goto L8c
        L85:
            androidx.camera.core.impl.Config$Option r8 = androidx.camera.core.impl.UseCaseConfig.x
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r0.G(r8, r9)
        L8c:
            androidx.camera.core.impl.OptionsBundle r8 = androidx.camera.core.impl.OptionsBundle.U(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2UseCaseConfigFactory.a(androidx.camera.core.impl.UseCaseConfigFactory$CaptureType, int):androidx.camera.core.impl.Config");
    }
}
