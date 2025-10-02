package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Ee {
    public static final FrameSourceListener a(Camera camera, Function1 block) {
        Intrinsics.h(camera, "<this>");
        Intrinsics.h(block, "block");
        C0587d7 c0587d7 = new C0587d7(block);
        camera.addListener(c0587d7);
        return c0587d7;
    }
}
