package androidx.camera.core.streamsharing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
class VirtualCameraAdapter implements UseCase.StateChangeCallback {
    public final HashSet d;
    public final UseCaseConfigFactory h;
    public final CameraInternal i;
    public final CameraInternal j;
    public final HashSet l;
    public final HashMap m;
    public final ResolutionsMerger n;
    public final ResolutionsMerger o;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final CameraCaptureCallback k = new CameraCaptureCallback() { // from class: androidx.camera.core.streamsharing.VirtualCameraAdapter.1
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void b(int i, CameraCaptureResult cameraCaptureResult) {
            Iterator it = VirtualCameraAdapter.this.d.iterator();
            while (it.hasNext()) {
                SessionConfig sessionConfig = ((UseCase) it.next()).n;
                Iterator it2 = sessionConfig.g.e.iterator();
                while (it2.hasNext()) {
                    ((CameraCaptureCallback) it2.next()).b(i, new VirtualCameraCaptureResult(cameraCaptureResult, sessionConfig.g.g, -1L));
                }
            }
        }
    };

    public VirtualCameraAdapter(CameraInternal cameraInternal, CameraInternal cameraInternal2, HashSet hashSet, UseCaseConfigFactory useCaseConfigFactory, b bVar) {
        this.i = cameraInternal;
        this.j = cameraInternal2;
        this.h = useCaseConfigFactory;
        this.d = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            map.put(useCase, useCase.n(cameraInternal.d(), null, useCase.e(true, useCaseConfigFactory)));
        }
        this.m = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.l = hashSet2;
        this.n = new ResolutionsMerger(cameraInternal, hashSet2);
        if (this.j != null) {
            this.o = new ResolutionsMerger(this.j, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            UseCase useCase2 = (UseCase) it2.next();
            this.g.put(useCase2, Boolean.FALSE);
            this.f.put(useCase2, new VirtualCamera(cameraInternal, this, bVar));
        }
    }

    public static void s(SurfaceEdge surfaceEdge, DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
        surfaceEdge.f();
        try {
            surfaceEdge.h(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            if (sessionConfig.f != null) {
                sessionConfig.f.a(sessionConfig);
            }
        }
    }

    public static DeferrableSurface t(UseCase useCase) {
        List listB = useCase instanceof ImageCapture ? useCase.n.b() : Collections.unmodifiableList(useCase.n.g.f482a);
        Preconditions.f(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (DeferrableSurface) listB.get(0);
        }
        return null;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void c(UseCase useCase) {
        Threads.a();
        if (u(useCase)) {
            SurfaceEdge surfaceEdge = (SurfaceEdge) this.e.get(useCase);
            Objects.requireNonNull(surfaceEdge);
            DeferrableSurface deferrableSurfaceT = t(useCase);
            if (deferrableSurfaceT != null) {
                s(surfaceEdge, deferrableSurfaceT, useCase.n);
            } else {
                surfaceEdge.e();
            }
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void j(UseCase useCase) {
        Threads.a();
        if (u(useCase)) {
            return;
        }
        this.g.put(useCase, Boolean.TRUE);
        DeferrableSurface deferrableSurfaceT = t(useCase);
        if (deferrableSurfaceT != null) {
            SurfaceEdge surfaceEdge = (SurfaceEdge) this.e.get(useCase);
            Objects.requireNonNull(surfaceEdge);
            s(surfaceEdge, deferrableSurfaceT, useCase.n);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void n(UseCase useCase) {
        DeferrableSurface deferrableSurfaceT;
        Threads.a();
        SurfaceEdge surfaceEdge = (SurfaceEdge) this.e.get(useCase);
        Objects.requireNonNull(surfaceEdge);
        if (u(useCase) && (deferrableSurfaceT = t(useCase)) != null) {
            s(surfaceEdge, deferrableSurfaceT, useCase.n);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void q(UseCase useCase) {
        Threads.a();
        if (u(useCase)) {
            this.g.put(useCase, Boolean.FALSE);
            SurfaceEdge surfaceEdge = (SurfaceEdge) this.e.get(useCase);
            Objects.requireNonNull(surfaceEdge);
            surfaceEdge.e();
        }
    }

    public final OutConfig r(UseCase useCase, ResolutionsMerger resolutionsMerger, CameraInternal cameraInternal, SurfaceEdge surfaceEdge, int i, boolean z) {
        boolean z2;
        Size sizeE;
        int iF = cameraInternal.b().f(i);
        Matrix matrix = surfaceEdge.b;
        RectF rectF = TransformUtils.f522a;
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        boolean z3 = ((float) Math.toDegrees(Math.atan2(((double) f6) / dSqrt, ((double) f5) / dSqrt))) > BitmapDescriptorFactory.HUE_RED;
        UseCaseConfig useCaseConfig = (UseCaseConfig) this.m.get(useCase);
        Objects.requireNonNull(useCaseConfig);
        Rect rectA = surfaceEdge.d;
        surfaceEdge.b.getValues(new float[9]);
        int iH = TransformUtils.h((int) Math.round(Math.atan2(r11[3], r11[0]) * 57.29577951308232d));
        resolutionsMerger.getClass();
        if (TransformUtils.c(iH)) {
            rectA = new Rect(rectA.top, rectA.left, rectA.bottom, rectA.right);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            sizeE = TransformUtils.e(rectA);
            Iterator it = resolutionsMerger.b(useCaseConfig).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size sizeE2 = TransformUtils.e(ResolutionsMerger.a((Size) it.next(), sizeE));
                if (!ResolutionsMerger.c(sizeE2, sizeE)) {
                    sizeE = sizeE2;
                    break;
                }
            }
        } else {
            Size sizeE3 = TransformUtils.e(rectA);
            List listB = resolutionsMerger.b(useCaseConfig);
            Iterator it2 = listB.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            sizeE = sizeE3;
                            break;
                        }
                        Size size = (Size) it3.next();
                        if (!ResolutionsMerger.c(size, sizeE3)) {
                            sizeE = size;
                            break;
                        }
                    }
                } else {
                    Size size2 = (Size) it2.next();
                    Rational rationalG = AspectRatioUtil.f509a;
                    Size size3 = SizeUtil.c;
                    if (!AspectRatioUtil.a(sizeE3, rationalG, size3)) {
                        rationalG = AspectRatioUtil.c;
                        if (!AspectRatioUtil.a(sizeE3, rationalG, size3)) {
                            rationalG = ResolutionsMerger.g(sizeE3);
                        }
                    }
                    if (!resolutionsMerger.d(rationalG, size2) && !ResolutionsMerger.c(size2, sizeE3)) {
                        sizeE = size2;
                        break;
                    }
                }
            }
            rectA = ResolutionsMerger.a(sizeE3, sizeE);
        }
        Pair pair = new Pair(rectA, sizeE);
        Rect rect = (Rect) pair.first;
        Size size4 = (Size) pair.second;
        if (z2) {
            Size size5 = new Size(size4.getHeight(), size4.getWidth());
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            size4 = size5;
        }
        Pair pair2 = new Pair(rect, size4);
        Rect rect2 = (Rect) pair2.first;
        Size size6 = (Size) pair2.second;
        int iF2 = this.i.b().f(((ImageOutputConfig) useCase.f).s(0));
        VirtualCamera virtualCamera = (VirtualCamera) this.f.get(useCase);
        Objects.requireNonNull(virtualCamera);
        virtualCamera.f.c = iF2;
        int iH2 = TransformUtils.h((surfaceEdge.i + iF2) - iF);
        return OutConfig.h(useCase instanceof Preview ? 1 : useCase instanceof ImageCapture ? 4 : 2, useCase instanceof ImageCapture ? 256 : 34, rect2, TransformUtils.g(size6, iH2), iH2, useCase.m(cameraInternal) ^ z3);
    }

    public final boolean u(UseCase useCase) {
        Boolean bool = (Boolean) this.g.get(useCase);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void v(HashMap map) {
        HashMap map2 = this.e;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            UseCase useCase = (UseCase) entry.getKey();
            SurfaceEdge surfaceEdge = (SurfaceEdge) entry.getValue();
            useCase.B(surfaceEdge.d);
            useCase.z(surfaceEdge.b);
            useCase.g = useCase.x(surfaceEdge.g, null);
            useCase.q();
        }
    }
}
