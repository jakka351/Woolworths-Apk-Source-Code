package com.scandit.datacapture.core;

import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18322a;
    private final String b;
    private final String c;

    public H0(String focusModeContinuousPicture, String focusModeContinuousVideo, String focusModeAuto) {
        Intrinsics.h(focusModeContinuousPicture, "focusModeContinuousPicture");
        Intrinsics.h(focusModeContinuousVideo, "focusModeContinuousVideo");
        Intrinsics.h(focusModeAuto, "focusModeAuto");
        this.f18322a = focusModeContinuousPicture;
        this.b = focusModeContinuousVideo;
        this.c = focusModeAuto;
    }

    public static void a(H0 h0) {
        String focusModeContinuousVideo = h0.b;
        String focusModeAuto = h0.c;
        Intrinsics.h(focusModeContinuousVideo, "focusModeContinuousVideo");
        Intrinsics.h(focusModeAuto, "focusModeAuto");
        new H0("object-tracking-picture", focusModeContinuousVideo, focusModeAuto);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h0 = (H0) obj;
        return Intrinsics.c(this.f18322a, h0.f18322a) && Intrinsics.c(this.b, h0.b) && Intrinsics.c(this.c, h0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f18322a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraParametersKeys(focusModeContinuousPicture=");
        sb.append(this.f18322a);
        sb.append(", focusModeContinuousVideo=");
        sb.append(this.b);
        sb.append(", focusModeAuto=");
        return androidx.camera.core.impl.b.r(sb, this.c, ')');
    }

    public /* synthetic */ H0() {
        this("continuous-picture", "continuous-video", CameraSettings.FOCUS_STRATEGY_AUTO);
    }
}
