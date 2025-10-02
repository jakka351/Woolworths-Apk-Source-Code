package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestrictTo
/* loaded from: classes2.dex */
public final class CaptureBundles {

    public static final class CaptureBundleImpl implements CaptureBundle {

        /* renamed from: a, reason: collision with root package name */
        public final List f399a;

        public CaptureBundleImpl(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f399a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        public final List a() {
            return this.f399a;
        }
    }

    public static CaptureBundle a() {
        CaptureStage.DefaultCaptureStage defaultCaptureStage = new CaptureStage.DefaultCaptureStage();
        new CaptureConfig.Builder().d();
        return new CaptureBundleImpl(Arrays.asList(defaultCaptureStage));
    }
}
