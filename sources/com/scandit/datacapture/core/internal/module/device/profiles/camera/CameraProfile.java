package com.scandit.datacapture.core.internal.module.device.profiles.camera;

import android.hardware.Camera;
import android.util.Range;
import com.scandit.datacapture.core.K6;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes6.dex */
public interface CameraProfile {
    int a();

    Range a(Range[] rangeArr, float f);

    void a(Camera.Parameters parameters);

    boolean a(String str);

    Range b(Range[] rangeArr, float f);

    String b();

    boolean c();

    K6 d();

    boolean e();

    boolean f();

    boolean g();

    boolean h();

    NativeFocusStrategy i();

    boolean j();

    NativeCameraApi k();
}
