package androidx.camera.camera2.internal;

import androidx.camera.core.CameraState;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.lifecycle.MutableLiveData;

/* loaded from: classes2.dex */
class CameraStateMachine {

    /* renamed from: a, reason: collision with root package name */
    public final CameraStateRegistry f260a;
    public final MutableLiveData b;

    /* renamed from: androidx.camera.camera2.internal.CameraStateMachine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f261a;

        static {
            int[] iArr = new int[CameraInternal.State.values().length];
            f261a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f261a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f261a[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f261a[7] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f261a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f261a[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f261a[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f261a[0] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public CameraStateMachine(CameraStateRegistry cameraStateRegistry) {
        this.f260a = cameraStateRegistry;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.b = mutableLiveData;
        mutableLiveData.j(CameraState.a(CameraState.Type.h));
    }
}
