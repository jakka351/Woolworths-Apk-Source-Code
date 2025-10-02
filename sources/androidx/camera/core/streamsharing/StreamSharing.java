package androidx.camera.core.streamsharing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import androidx.camera.camera2.interop.d;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.concurrent.DualOutConfig;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class StreamSharing extends UseCase {
    public SessionConfig.Builder A;
    public SessionConfig.CloseableErrorListener B;
    public final StreamSharingConfig p;
    public final VirtualCameraAdapter q;
    public final LayoutSettings r;
    public final LayoutSettings s;
    public SurfaceProcessorNode t;
    public DualSurfaceProcessorNode u;
    public SurfaceEdge v;
    public SurfaceEdge w;
    public SurfaceEdge x;
    public SurfaceEdge y;
    public SessionConfig.Builder z;

    public interface Control {
    }

    public StreamSharing(CameraInternal cameraInternal, CameraInternal cameraInternal2, LayoutSettings layoutSettings, LayoutSettings layoutSettings2, HashSet hashSet, UseCaseConfigFactory useCaseConfigFactory) {
        super(K(hashSet));
        this.p = K(hashSet);
        this.r = layoutSettings;
        this.s = layoutSettings2;
        this.q = new VirtualCameraAdapter(cameraInternal, cameraInternal2, hashSet, useCaseConfigFactory, new b(this, 2));
    }

    public static ArrayList I(UseCase useCase) {
        ArrayList arrayList = new ArrayList();
        if (!(useCase instanceof StreamSharing)) {
            arrayList.add(useCase.f.Q());
            return arrayList;
        }
        Iterator it = ((StreamSharing) useCase).q.d.iterator();
        while (it.hasNext()) {
            arrayList.add(((UseCase) it.next()).f.Q());
        }
        return arrayList;
    }

    public static StreamSharingConfig K(HashSet hashSet) {
        MutableOptionsBundle mutableOptionsBundleV = MutableOptionsBundle.V();
        new StreamSharingBuilder(mutableOptionsBundleV);
        mutableOptionsBundleV.G(ImageInputConfig.f, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase.f.d(UseCaseConfig.z)) {
                arrayList.add(useCase.f.Q());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        mutableOptionsBundleV.G(StreamSharingConfig.H, arrayList);
        mutableOptionsBundleV.G(ImageOutputConfig.k, 2);
        return new StreamSharingConfig(OptionsBundle.U(mutableOptionsBundleV));
    }

    public final void E() {
        SessionConfig.CloseableErrorListener closeableErrorListener = this.B;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
            this.B = null;
        }
        SurfaceEdge surfaceEdge = this.v;
        if (surfaceEdge != null) {
            surfaceEdge.c();
            this.v = null;
        }
        SurfaceEdge surfaceEdge2 = this.w;
        if (surfaceEdge2 != null) {
            surfaceEdge2.c();
            this.w = null;
        }
        SurfaceEdge surfaceEdge3 = this.x;
        if (surfaceEdge3 != null) {
            surfaceEdge3.c();
            this.x = null;
        }
        SurfaceEdge surfaceEdge4 = this.y;
        if (surfaceEdge4 != null) {
            surfaceEdge4.c();
            this.y = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.t;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.b();
            this.t = null;
        }
        DualSurfaceProcessorNode dualSurfaceProcessorNode = this.u;
        if (dualSurfaceProcessorNode != null) {
            dualSurfaceProcessorNode.f555a.release();
            Threads.c(new d(dualSurfaceProcessorNode, 7));
            this.u = null;
        }
    }

    public final List F(String str, String str2, UseCaseConfig useCaseConfig, StreamSpec streamSpec, StreamSpec streamSpec2) {
        Threads.a();
        VirtualCameraAdapter virtualCameraAdapter = this.q;
        if (streamSpec2 == null) {
            G(str, str2, useCaseConfig, streamSpec, null);
            CameraInternal cameraInternalB = b();
            Objects.requireNonNull(cameraInternalB);
            this.t = new SurfaceProcessorNode(cameraInternalB, new DefaultSurfaceProcessor(streamSpec.b()));
            boolean z = this.i != null;
            SurfaceEdge surfaceEdge = this.x;
            int iJ = j();
            virtualCameraAdapter.getClass();
            HashMap map = new HashMap();
            Iterator it = virtualCameraAdapter.d.iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                ResolutionsMerger resolutionsMerger = virtualCameraAdapter.n;
                CameraInternal cameraInternal = virtualCameraAdapter.i;
                VirtualCameraAdapter virtualCameraAdapter2 = virtualCameraAdapter;
                boolean z2 = z;
                map.put(useCase, virtualCameraAdapter2.r(useCase, resolutionsMerger, cameraInternal, surfaceEdge, iJ, z2));
                z = z2;
                virtualCameraAdapter = virtualCameraAdapter2;
            }
            VirtualCameraAdapter virtualCameraAdapter3 = virtualCameraAdapter;
            SurfaceProcessorNode.Out outC = this.t.c(SurfaceProcessorNode.In.c(this.x, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((UseCase) entry.getKey(), outC.get(entry.getValue()));
            }
            virtualCameraAdapter3.v(map2);
            Object[] objArr = {this.z.k()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        VirtualCameraAdapter virtualCameraAdapter4 = virtualCameraAdapter;
        G(str, str2, useCaseConfig, streamSpec, streamSpec2);
        Matrix matrix = this.j;
        CameraInternal cameraInternalH = h();
        Objects.requireNonNull(cameraInternalH);
        boolean zP = cameraInternalH.p();
        Size sizeE = streamSpec2.e();
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, sizeE.getWidth(), sizeE.getHeight());
        }
        Rect rect2 = rect;
        CameraInternal cameraInternalH2 = h();
        Objects.requireNonNull(cameraInternalH2);
        int iG = g(cameraInternalH2, false);
        CameraInternal cameraInternalH3 = h();
        Objects.requireNonNull(cameraInternalH3);
        SurfaceEdge surfaceEdge2 = new SurfaceEdge(3, 34, streamSpec2, matrix, zP, rect2, iG, -1, m(cameraInternalH3));
        this.w = surfaceEdge2;
        Objects.requireNonNull(h());
        CameraEffect cameraEffect = this.m;
        if (cameraEffect != null) {
            cameraEffect.getClass();
            throw null;
        }
        this.y = surfaceEdge2;
        SessionConfig.Builder builderH = H(this.w, useCaseConfig, streamSpec2);
        this.A = builderH;
        SessionConfig.CloseableErrorListener closeableErrorListener = this.B;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new a(this, str, str2, useCaseConfig, streamSpec, streamSpec2));
        this.B = closeableErrorListener2;
        builderH.o(closeableErrorListener2);
        this.u = new DualSurfaceProcessorNode(b(), h(), new DualSurfaceProcessor(streamSpec.b(), this.r, this.s));
        boolean z3 = this.i != null;
        SurfaceEdge surfaceEdge3 = this.x;
        SurfaceEdge surfaceEdge4 = this.y;
        int iJ2 = j();
        virtualCameraAdapter4.getClass();
        HashMap map3 = new HashMap();
        Iterator it2 = virtualCameraAdapter4.d.iterator();
        while (it2.hasNext()) {
            UseCase useCase2 = (UseCase) it2.next();
            VirtualCameraAdapter virtualCameraAdapter5 = virtualCameraAdapter4;
            OutConfig outConfigR = virtualCameraAdapter5.r(useCase2, virtualCameraAdapter4.n, virtualCameraAdapter4.i, surfaceEdge3, iJ2, z3);
            SurfaceEdge surfaceEdge5 = surfaceEdge3;
            ResolutionsMerger resolutionsMerger2 = virtualCameraAdapter5.o;
            CameraInternal cameraInternal2 = virtualCameraAdapter5.j;
            Objects.requireNonNull(cameraInternal2);
            SurfaceEdge surfaceEdge6 = surfaceEdge4;
            map3.put(useCase2, DualOutConfig.c(outConfigR, virtualCameraAdapter5.r(useCase2, resolutionsMerger2, cameraInternal2, surfaceEdge6, iJ2, z3)));
            virtualCameraAdapter4 = virtualCameraAdapter5;
            surfaceEdge4 = surfaceEdge6;
            surfaceEdge3 = surfaceEdge5;
        }
        VirtualCameraAdapter virtualCameraAdapter6 = virtualCameraAdapter4;
        DualSurfaceProcessorNode dualSurfaceProcessorNode = this.u;
        DualSurfaceProcessorNode.In inD = DualSurfaceProcessorNode.In.d(this.x, this.y, new ArrayList(map3.values()));
        dualSurfaceProcessorNode.getClass();
        SurfaceProcessorInternal surfaceProcessorInternal = dualSurfaceProcessorNode.f555a;
        Threads.a();
        dualSurfaceProcessorNode.e = inD;
        dualSurfaceProcessorNode.d = new DualSurfaceProcessorNode.Out();
        SurfaceEdge surfaceEdgeB = dualSurfaceProcessorNode.e.b();
        SurfaceEdge surfaceEdgeC = dualSurfaceProcessorNode.e.c();
        Iterator it3 = dualSurfaceProcessorNode.e.a().iterator();
        while (it3.hasNext()) {
            DualOutConfig dualOutConfig = (DualOutConfig) it3.next();
            DualSurfaceProcessorNode.Out out = dualSurfaceProcessorNode.d;
            OutConfig outConfigA = dualOutConfig.a();
            Rect rectA = outConfigA.a();
            int iC = outConfigA.c();
            boolean zG = outConfigA.g();
            Matrix matrix2 = new Matrix();
            Iterator it4 = it3;
            HashMap map4 = map3;
            Preconditions.b(TransformUtils.d(TransformUtils.g(TransformUtils.e(rectA), iC), false, outConfigA.d()));
            Size sizeD = outConfigA.d();
            Rect rect3 = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
            StreamSpec.Builder builderG = surfaceEdgeB.g.g();
            builderG.e(outConfigA.d());
            out.put(dualOutConfig, new SurfaceEdge(outConfigA.e(), outConfigA.b(), builderG.a(), matrix2, false, rect3, surfaceEdgeB.i - iC, -1, surfaceEdgeB.e != zG));
            it3 = it4;
            map3 = map4;
        }
        HashMap map5 = map3;
        try {
            surfaceProcessorInternal.a(surfaceEdgeB.d(dualSurfaceProcessorNode.b, true));
        } catch (ProcessingException e) {
            Logger.c("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        try {
            surfaceProcessorInternal.a(surfaceEdgeC.d(dualSurfaceProcessorNode.c, false));
        } catch (ProcessingException e2) {
            Logger.c("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
        CameraInternal cameraInternal3 = dualSurfaceProcessorNode.b;
        CameraInternal cameraInternal4 = dualSurfaceProcessorNode.c;
        for (final Map.Entry<DualOutConfig, SurfaceEdge> entry2 : dualSurfaceProcessorNode.d.entrySet()) {
            final CameraInternal cameraInternal5 = cameraInternal3;
            final DualSurfaceProcessorNode dualSurfaceProcessorNode2 = dualSurfaceProcessorNode;
            final CameraInternal cameraInternal6 = cameraInternal4;
            final SurfaceEdge surfaceEdge7 = surfaceEdgeB;
            final SurfaceEdge surfaceEdge8 = surfaceEdgeC;
            dualSurfaceProcessorNode2.a(cameraInternal5, cameraInternal6, surfaceEdge7, surfaceEdge8, entry2);
            dualSurfaceProcessorNode = dualSurfaceProcessorNode2;
            entry2.getValue().a(new Runnable() { // from class: androidx.camera.core.processing.concurrent.c
                @Override // java.lang.Runnable
                public final void run() {
                    dualSurfaceProcessorNode2.a(cameraInternal5, cameraInternal6, surfaceEdge7, surfaceEdge8, entry2);
                }
            });
            cameraInternal3 = cameraInternal5;
            cameraInternal4 = cameraInternal6;
            surfaceEdgeB = surfaceEdge7;
            surfaceEdgeC = surfaceEdge8;
        }
        DualSurfaceProcessorNode.Out out2 = dualSurfaceProcessorNode.d;
        HashMap map6 = new HashMap();
        for (Map.Entry entry3 : map5.entrySet()) {
            map6.put((UseCase) entry3.getKey(), out2.get(entry3.getValue()));
        }
        virtualCameraAdapter6.v(map6);
        Object[] objArr2 = {this.z.k(), this.A.k()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj2 = objArr2[i];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void G(String str, String str2, UseCaseConfig useCaseConfig, StreamSpec streamSpec, StreamSpec streamSpec2) {
        Matrix matrix = this.j;
        CameraInternal cameraInternalB = b();
        Objects.requireNonNull(cameraInternalB);
        boolean zP = cameraInternalB.p();
        Size sizeE = streamSpec.e();
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, sizeE.getWidth(), sizeE.getHeight());
        }
        Rect rect2 = rect;
        CameraInternal cameraInternalB2 = b();
        Objects.requireNonNull(cameraInternalB2);
        int iG = g(cameraInternalB2, false);
        CameraInternal cameraInternalB3 = b();
        Objects.requireNonNull(cameraInternalB3);
        SurfaceEdge surfaceEdge = new SurfaceEdge(3, 34, streamSpec, matrix, zP, rect2, iG, -1, m(cameraInternalB3));
        this.v = surfaceEdge;
        Objects.requireNonNull(b());
        CameraEffect cameraEffect = this.m;
        if (cameraEffect != null) {
            cameraEffect.getClass();
            throw null;
        }
        this.x = surfaceEdge;
        SessionConfig.Builder builderH = H(this.v, useCaseConfig, streamSpec);
        this.z = builderH;
        SessionConfig.CloseableErrorListener closeableErrorListener = this.B;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new a(this, str, str2, useCaseConfig, streamSpec, streamSpec2));
        this.B = closeableErrorListener2;
        builderH.o(closeableErrorListener2);
    }

    public final SessionConfig.Builder H(SurfaceEdge surfaceEdge, UseCaseConfig useCaseConfig, StreamSpec streamSpec) {
        SessionConfig.Builder builderM = SessionConfig.Builder.m(useCaseConfig, streamSpec.e());
        VirtualCameraAdapter virtualCameraAdapter = this.q;
        Iterator it = virtualCameraAdapter.d.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((UseCase) it.next()).f.A().g.c;
            List list = SessionConfig.i;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            builderM.u(i);
        }
        Size sizeE = streamSpec.e();
        Iterator it2 = virtualCameraAdapter.d.iterator();
        while (it2.hasNext()) {
            SessionConfig sessionConfigK = SessionConfig.Builder.m(((UseCase) it2.next()).f, sizeE).k();
            CaptureConfig captureConfig = sessionConfigK.g;
            builderM.b(captureConfig.e);
            builderM.a(sessionConfigK.e);
            Iterator it3 = sessionConfigK.d.iterator();
            while (it3.hasNext()) {
                builderM.h((CameraCaptureSession.StateCallback) it3.next());
            }
            Iterator it4 = sessionConfigK.c.iterator();
            while (it4.hasNext()) {
                builderM.d((CameraDevice.StateCallback) it4.next());
            }
            builderM.e(captureConfig.b);
        }
        surfaceEdge.getClass();
        Threads.a();
        surfaceEdge.b();
        Preconditions.f("Consumer can only be linked once.", !surfaceEdge.j);
        surfaceEdge.j = true;
        builderM.i(surfaceEdge.l, streamSpec.b(), -1);
        builderM.g(virtualCameraAdapter.k);
        if (streamSpec.d() != null) {
            builderM.e(streamSpec.d());
        }
        return builderM;
    }

    public final Set J() {
        return this.q.d;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig e(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        StreamSharingConfig streamSharingConfig = this.p;
        Config configA = useCaseConfigFactory.a(streamSharingConfig.Q(), 1);
        if (z) {
            configA = Config.R(configA, streamSharingConfig.G);
        }
        if (configA == null) {
            return null;
        }
        return ((StreamSharingBuilder) k(configA)).e();
    }

    @Override // androidx.camera.core.UseCase
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder k(Config config) {
        return new StreamSharingBuilder(MutableOptionsBundle.W(config));
    }

    @Override // androidx.camera.core.UseCase
    public final void r() {
        VirtualCameraAdapter virtualCameraAdapter = this.q;
        Iterator it = virtualCameraAdapter.d.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            VirtualCamera virtualCamera = (VirtualCamera) virtualCameraAdapter.f.get(useCase);
            Objects.requireNonNull(virtualCamera);
            useCase.a(virtualCamera, null, null, useCase.e(true, virtualCameraAdapter.h));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    @Override // androidx.camera.core.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.UseCaseConfig t(androidx.camera.core.impl.CameraInfoInternal r14, androidx.camera.core.impl.UseCaseConfig.Builder r15) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.streamsharing.StreamSharing.t(androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.impl.UseCaseConfig$Builder):androidx.camera.core.impl.UseCaseConfig");
    }

    @Override // androidx.camera.core.UseCase
    public final void u() {
        Iterator it = this.q.d.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            useCase.u();
            useCase.s();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void v() {
        Iterator it = this.q.d.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).v();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec w(Config config) {
        this.z.e(config);
        Object[] objArr = {this.z.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        D(Collections.unmodifiableList(arrayList));
        StreamSpec.Builder builderG = this.g.g();
        builderG.d(config);
        return builderG.a();
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec x(StreamSpec streamSpec, StreamSpec streamSpec2) {
        D(F(d(), h() == null ? null : h().d().b(), this.f, streamSpec, streamSpec2));
        o();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public final void y() {
        E();
        VirtualCameraAdapter virtualCameraAdapter = this.q;
        Iterator it = virtualCameraAdapter.d.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            VirtualCamera virtualCamera = (VirtualCamera) virtualCameraAdapter.f.get(useCase);
            Objects.requireNonNull(virtualCamera);
            useCase.C(virtualCamera);
        }
    }
}
