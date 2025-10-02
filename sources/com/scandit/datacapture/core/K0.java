package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes6.dex */
public abstract class K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f18335a = LazyKt.b(J0.f18330a);
    public static final /* synthetic */ int b = 0;

    public static CameraProfile a() {
        return (CameraProfile) f18335a.getD();
    }
}
