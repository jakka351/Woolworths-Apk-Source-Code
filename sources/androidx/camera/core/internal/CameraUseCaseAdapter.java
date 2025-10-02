package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.auto.value.AutoValue;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CameraUseCaseAdapter implements Camera {
    public final CameraInternal d;
    public final CameraInternal e;
    public final CameraDeviceSurfaceManager f;
    public final UseCaseConfigFactory g;
    public final CameraId h;
    public final CameraCoordinator k;
    public ViewPort l;
    public final CameraConfig n;
    public UseCase r;
    public StreamSharing s;
    public final RestrictedCameraControl t;
    public final RestrictedCameraInfo u;
    public final RestrictedCameraInfo v;
    public final LayoutSettings w;
    public final LayoutSettings x;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public List m = Collections.EMPTY_LIST;
    public final Object o = new Object();
    public boolean p = true;
    public Config q = null;

    public static final class CameraException extends Exception {
    }

    @AutoValue
    public static abstract class CameraId {
        public static CameraId a(String str, Identifier identifier) {
            return new AutoValue_CameraUseCaseAdapter_CameraId(str, identifier);
        }

        public abstract Identifier b();

        public abstract String c();
    }

    public static class ConfigPair {

        /* renamed from: a, reason: collision with root package name */
        public UseCaseConfig f529a;
        public UseCaseConfig b;
    }

    public CameraUseCaseAdapter(CameraInternal cameraInternal, CameraInternal cameraInternal2, RestrictedCameraInfo restrictedCameraInfo, RestrictedCameraInfo restrictedCameraInfo2, CameraCoordinator cameraCoordinator, CameraDeviceSurfaceManager cameraDeviceSurfaceManager, UseCaseConfigFactory useCaseConfigFactory) {
        this.d = cameraInternal;
        this.e = cameraInternal2;
        LayoutSettings layoutSettings = LayoutSettings.b;
        this.w = layoutSettings;
        this.x = layoutSettings;
        this.k = cameraCoordinator;
        this.f = cameraDeviceSurfaceManager;
        this.g = useCaseConfigFactory;
        CameraConfig cameraConfig = restrictedCameraInfo.d;
        this.n = cameraConfig;
        this.t = new RestrictedCameraControl(cameraInternal.k(), cameraConfig.K());
        this.u = restrictedCameraInfo;
        this.v = restrictedCameraInfo2;
        this.h = v(restrictedCameraInfo, restrictedCameraInfo2);
    }

    public static boolean B(StreamSpec streamSpec, SessionConfig sessionConfig) {
        Config configD = streamSpec.d();
        OptionsBundle optionsBundle = sessionConfig.g.b;
        if (configD.f().size() != sessionConfig.g.b.f().size()) {
            return true;
        }
        for (Config.Option option : configD.f()) {
            if (!optionsBundle.G.containsKey(option) || !Objects.equals(optionsBundle.a(option), configD.a(option))) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase instanceof ImageCapture) {
                UseCaseConfig useCaseConfig = useCase.f;
                Config.Option option = ImageCaptureConfig.L;
                if (useCaseConfig.d(option)) {
                    Integer num = (Integer) useCaseConfig.a(option);
                    num.getClass();
                    if (num.intValue() == 1) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static boolean D(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase != null) {
                if (!useCase.f.d(UseCaseConfig.z)) {
                    Log.e("CameraUseCaseAdapter", useCase + " UseCase does not have capture type.");
                } else if (useCase.f.Q() == UseCaseConfigFactory.CaptureType.g) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList F(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            useCase.getClass();
            useCase.m = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CameraEffect cameraEffect = (CameraEffect) it2.next();
                cameraEffect.getClass();
                if (useCase.l(0)) {
                    Preconditions.f(useCase + " already has effect" + useCase.m, useCase.m == null);
                    Preconditions.b(useCase.l(0));
                    useCase.m = cameraEffect;
                    arrayList2.remove(cameraEffect);
                }
            }
        }
        return arrayList2;
    }

    public static Matrix q(Rect rect, Size size) {
        Preconditions.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static CameraId v(RestrictedCameraInfo restrictedCameraInfo, RestrictedCameraInfo restrictedCameraInfo2) {
        StringBuilder sb = new StringBuilder();
        sb.append(restrictedCameraInfo.f490a.b());
        sb.append(restrictedCameraInfo2 == null ? "" : restrictedCameraInfo2.f490a.b());
        return new AutoValue_CameraUseCaseAdapter_CameraId(sb.toString(), restrictedCameraInfo.d.C());
    }

    public static HashMap x(ArrayList arrayList, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2) {
        UseCaseConfig useCaseConfigE;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase instanceof StreamSharing) {
                StreamSharing streamSharing = (StreamSharing) useCase;
                UseCaseConfig useCaseConfigE2 = new Preview.Builder().f().e(false, useCaseConfigFactory);
                if (useCaseConfigE2 == null) {
                    useCaseConfigE = null;
                } else {
                    MutableOptionsBundle mutableOptionsBundleW = MutableOptionsBundle.W(useCaseConfigE2);
                    mutableOptionsBundleW.G.remove(TargetConfig.E);
                    useCaseConfigE = streamSharing.k(mutableOptionsBundleW).e();
                }
            } else {
                useCaseConfigE = useCase.e(false, useCaseConfigFactory);
            }
            UseCaseConfig useCaseConfigE3 = useCase.e(true, useCaseConfigFactory2);
            ConfigPair configPair = new ConfigPair();
            configPair.f529a = useCaseConfigE;
            configPair.b = useCaseConfigE3;
            map.put(useCase, configPair);
        }
        return map;
    }

    public final boolean A() {
        boolean z;
        synchronized (this.o) {
            z = this.n.K() != null;
        }
        return z;
    }

    public final void E(ArrayList arrayList) {
        synchronized (this.o) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.i);
            linkedHashSet.removeAll(arrayList);
            G(linkedHashSet, this.e != null);
        }
    }

    public final void G(LinkedHashSet linkedHashSet, boolean z) {
        StreamSpec streamSpec;
        Config configD;
        synchronized (this.o) {
            try {
                s(linkedHashSet);
                if (!z && A() && D(linkedHashSet)) {
                    G(linkedHashSet, true);
                    return;
                }
                StreamSharing streamSharingT = t(linkedHashSet, z);
                UseCase useCaseN = n(linkedHashSet, streamSharingT);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (useCaseN != null) {
                    arrayList.add(useCaseN);
                }
                if (streamSharingT != null) {
                    arrayList.add(streamSharingT);
                    arrayList.removeAll(streamSharingT.J());
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.j);
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.j);
                ArrayList arrayList4 = new ArrayList(this.j);
                arrayList4.removeAll(arrayList);
                HashMap mapX = x(arrayList2, this.n.i(), this.g);
                Map mapR = Collections.EMPTY_MAP;
                try {
                    HashMap mapR2 = r(w(), this.d.d(), arrayList2, arrayList3, mapX);
                    if (this.e != null) {
                        int iW = w();
                        CameraInternal cameraInternal = this.e;
                        Objects.requireNonNull(cameraInternal);
                        mapR = r(iW, cameraInternal.d(), arrayList2, arrayList3, mapX);
                    }
                    H(arrayList, mapR2);
                    ArrayList arrayListF = F(arrayList, this.m);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListF2 = F(arrayList5, arrayListF);
                    if (arrayListF2.size() > 0) {
                        Logger.e("CameraUseCaseAdapter", "Unused effects: " + arrayListF2);
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((UseCase) it.next()).C(this.d);
                    }
                    this.d.h(arrayList4);
                    if (this.e != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            UseCase useCase = (UseCase) it2.next();
                            CameraInternal cameraInternal2 = this.e;
                            Objects.requireNonNull(cameraInternal2);
                            useCase.C(cameraInternal2);
                        }
                        CameraInternal cameraInternal3 = this.e;
                        Objects.requireNonNull(cameraInternal3);
                        cameraInternal3.h(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            UseCase useCase2 = (UseCase) it3.next();
                            if (mapR2.containsKey(useCase2) && (configD = (streamSpec = (StreamSpec) mapR2.get(useCase2)).d()) != null && B(streamSpec, useCase2.n)) {
                                useCase2.g = useCase2.w(configD);
                                if (this.p) {
                                    this.d.c(useCase2);
                                    CameraInternal cameraInternal4 = this.e;
                                    if (cameraInternal4 != null) {
                                        cameraInternal4.c(useCase2);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        UseCase useCase3 = (UseCase) it4.next();
                        ConfigPair configPair = (ConfigPair) mapX.get(useCase3);
                        Objects.requireNonNull(configPair);
                        CameraInternal cameraInternal5 = this.e;
                        if (cameraInternal5 != null) {
                            useCase3.a(this.d, cameraInternal5, configPair.f529a, configPair.b);
                            StreamSpec streamSpec2 = (StreamSpec) mapR2.get(useCase3);
                            streamSpec2.getClass();
                            useCase3.g = useCase3.x(streamSpec2, (StreamSpec) mapR.get(useCase3));
                        } else {
                            useCase3.a(this.d, null, configPair.f529a, configPair.b);
                            StreamSpec streamSpec3 = (StreamSpec) mapR2.get(useCase3);
                            streamSpec3.getClass();
                            useCase3.g = useCase3.x(streamSpec3, null);
                        }
                    }
                    if (this.p) {
                        this.d.o(arrayList2);
                        CameraInternal cameraInternal6 = this.e;
                        if (cameraInternal6 != null) {
                            cameraInternal6.o(arrayList2);
                        }
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        ((UseCase) it5.next()).q();
                    }
                    this.i.clear();
                    this.i.addAll(linkedHashSet);
                    this.j.clear();
                    this.j.addAll(arrayList);
                    this.r = useCaseN;
                    this.s = streamSharingT;
                } catch (IllegalArgumentException e) {
                    if (z || A() || this.k.b() == 2) {
                        throw e;
                    }
                    G(linkedHashSet, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H(ArrayList arrayList, HashMap map) {
        HashMap map2;
        synchronized (this.o) {
            try {
                if (this.l == null || arrayList.isEmpty()) {
                    map2 = map;
                } else {
                    boolean z = this.d.d().d() == 0;
                    Rect rectI = this.d.k().i();
                    Rational rational = this.l.b;
                    int iF = this.d.d().f(this.l.c);
                    ViewPort viewPort = this.l;
                    map2 = map;
                    HashMap mapA = ViewPorts.a(rectI, z, rational, iF, viewPort.f431a, viewPort.d, map2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        UseCase useCase = (UseCase) it.next();
                        Rect rect = (Rect) mapA.get(useCase);
                        rect.getClass();
                        useCase.B(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    UseCase useCase2 = (UseCase) it2.next();
                    Rect rectI2 = this.d.k().i();
                    StreamSpec streamSpec = (StreamSpec) map2.get(useCase2);
                    streamSpec.getClass();
                    useCase2.z(q(rectI2, streamSpec.e()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final CameraControl a() {
        return this.t;
    }

    @Override // androidx.camera.core.Camera
    public final CameraInfo b() {
        return this.u;
    }

    public final void c(Collection collection) {
        synchronized (this.o) {
            try {
                this.d.f(this.n);
                CameraInternal cameraInternal = this.e;
                if (cameraInternal != null) {
                    cameraInternal.f(this.n);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.i);
                linkedHashSet.addAll(collection);
                try {
                    G(linkedHashSet, this.e != null);
                } catch (IllegalArgumentException e) {
                    throw new CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.o) {
            try {
                if (!this.p) {
                    if (!this.j.isEmpty()) {
                        this.d.f(this.n);
                        CameraInternal cameraInternal = this.e;
                        if (cameraInternal != null) {
                            cameraInternal.f(this.n);
                        }
                    }
                    this.d.o(this.j);
                    CameraInternal cameraInternal2 = this.e;
                    if (cameraInternal2 != null) {
                        cameraInternal2.o(this.j);
                    }
                    synchronized (this.o) {
                        try {
                            if (this.q != null) {
                                this.d.k().h(this.q);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.j.iterator();
                    while (it.hasNext()) {
                        ((UseCase) it.next()).q();
                    }
                    this.p = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.UseCase n(java.util.LinkedHashSet r8, androidx.camera.core.streamsharing.StreamSharing r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.o
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L18
            r1.add(r9)     // Catch: java.lang.Throwable -> L15
            java.util.Set r8 = r9.J()     // Catch: java.lang.Throwable -> L15
            r1.removeAll(r8)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r8 = move-exception
            goto Lbb
        L18:
            java.lang.Object r8 = r7.o     // Catch: java.lang.Throwable -> L15
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.CameraConfig r9 = r7.n     // Catch: java.lang.Throwable -> Lb8
            int r9 = r9.I()     // Catch: java.lang.Throwable -> Lb8
            r2 = 0
            r3 = 1
            if (r9 != r3) goto L27
            r9 = r3
            goto L28
        L27:
            r9 = r2
        L28:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb8
            if (r9 == 0) goto Lb5
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L15
            r9 = r2
            r4 = r9
        L31:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.UseCase r5 = (androidx.camera.core.UseCase) r5     // Catch: java.lang.Throwable -> L15
            boolean r6 = r5 instanceof androidx.camera.core.Preview     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L4c
            boolean r6 = r5 instanceof androidx.camera.core.streamsharing.StreamSharing     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L46
            goto L4c
        L46:
            boolean r5 = r5 instanceof androidx.camera.core.ImageCapture     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L31
            r9 = r3
            goto L31
        L4c:
            r4 = r3
            goto L31
        L4e:
            if (r9 == 0) goto L75
            if (r4 != 0) goto L75
            androidx.camera.core.UseCase r8 = r7.r     // Catch: java.lang.Throwable -> L15
            boolean r9 = r8 instanceof androidx.camera.core.Preview     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L59
            goto Lb6
        L59:
            androidx.camera.core.Preview$Builder r8 = new androidx.camera.core.Preview$Builder     // Catch: java.lang.Throwable -> L15
            r8.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = "Preview-Extra"
            androidx.camera.core.impl.MutableOptionsBundle r1 = r8.f418a     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.Config$Option r2 = androidx.camera.core.internal.TargetConfig.D     // Catch: java.lang.Throwable -> L15
            r1.G(r2, r9)     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.Preview r8 = r8.f()     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.internal.a r9 = new androidx.camera.core.internal.a     // Catch: java.lang.Throwable -> L15
            r1 = 0
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r8.F(r9)     // Catch: java.lang.Throwable -> L15
            goto Lb6
        L75:
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L15
            r9 = r2
        L7a:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.UseCase r1 = (androidx.camera.core.UseCase) r1     // Catch: java.lang.Throwable -> L15
            boolean r4 = r1 instanceof androidx.camera.core.Preview     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L95
            boolean r4 = r1 instanceof androidx.camera.core.streamsharing.StreamSharing     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L8f
            goto L95
        L8f:
            boolean r1 = r1 instanceof androidx.camera.core.ImageCapture     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L7a
            r9 = r3
            goto L7a
        L95:
            r2 = r3
            goto L7a
        L97:
            if (r2 == 0) goto Lb5
            if (r9 != 0) goto Lb5
            androidx.camera.core.UseCase r8 = r7.r     // Catch: java.lang.Throwable -> L15
            boolean r9 = r8 instanceof androidx.camera.core.ImageCapture     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto La2
            goto Lb6
        La2:
            androidx.camera.core.ImageCapture$Builder r8 = new androidx.camera.core.ImageCapture$Builder     // Catch: java.lang.Throwable -> L15
            r8.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = "ImageCapture-Extra"
            androidx.camera.core.impl.MutableOptionsBundle r1 = r8.f409a     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.Config$Option r2 = androidx.camera.core.internal.TargetConfig.D     // Catch: java.lang.Throwable -> L15
            r1.G(r2, r9)     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.ImageCapture r8 = r8.f()     // Catch: java.lang.Throwable -> L15
            goto Lb6
        Lb5:
            r8 = 0
        Lb6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r8
        Lb8:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb8
            throw r9     // Catch: java.lang.Throwable -> L15
        Lbb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.n(java.util.LinkedHashSet, androidx.camera.core.streamsharing.StreamSharing):androidx.camera.core.UseCase");
    }

    public final HashMap r(int i, CameraInfoInternal cameraInfoInternal, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        Rect rectI;
        ArrayList arrayList3 = new ArrayList();
        String strB = cameraInfoInternal.b();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UseCase useCase = (UseCase) it.next();
            int iJ = useCase.f.j();
            StreamSpec streamSpec = useCase.g;
            SurfaceConfig surfaceConfigA = this.f.a(i, strB, iJ, streamSpec != null ? streamSpec.e() : null);
            int iJ2 = useCase.f.j();
            StreamSpec streamSpec2 = useCase.g;
            Size sizeE = streamSpec2 != null ? streamSpec2.e() : null;
            StreamSpec streamSpec3 = useCase.g;
            streamSpec3.getClass();
            AttachedSurfaceInfo attachedSurfaceInfoA = AttachedSurfaceInfo.a(surfaceConfigA, iJ2, sizeE, streamSpec3.b(), StreamSharing.I(useCase), useCase.g.d(), useCase.f.L(null));
            arrayList3.add(attachedSurfaceInfoA);
            map3.put(attachedSurfaceInfoA, useCase);
            map2.put(useCase, useCase.g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectI = this.d.k().i();
            } catch (NullPointerException unused) {
                rectI = null;
            }
            SupportedOutputSizesSorter supportedOutputSizesSorter = new SupportedOutputSizesSorter(cameraInfoInternal, rectI != null ? TransformUtils.e(rectI) : null);
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                UseCase useCase2 = (UseCase) it2.next();
                ConfigPair configPair = (ConfigPair) map.get(useCase2);
                UseCaseConfig useCaseConfigN = useCase2.n(cameraInfoInternal, configPair.f529a, configPair.b);
                map4.put(useCaseConfigN, useCase2);
                map5.put(useCaseConfigN, supportedOutputSizesSorter.b(useCaseConfigN));
                UseCaseConfig useCaseConfig = useCase2.f;
                if (useCaseConfig instanceof PreviewConfig) {
                    z = ((PreviewConfig) useCaseConfig).p() == 2;
                }
            }
            Pair pairB = this.f.b(i, strB, arrayList3, map5, z, D(arrayList));
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((UseCase) entry.getValue(), (StreamSpec) ((Map) pairB.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairB.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((UseCase) map3.get(entry2.getKey()), (StreamSpec) entry2.getValue());
                }
            }
        }
        return map2;
    }

    public final void s(LinkedHashSet linkedHashSet) {
        if (A()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                DynamicRange dynamicRangeU = ((UseCase) it.next()).f.u();
                boolean z = dynamicRangeU.b == 10;
                int i = dynamicRangeU.f400a;
                boolean z2 = (i == 1 || i == 0) ? false : true;
                if (z || z2) {
                    throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
                }
            }
            if (C(linkedHashSet)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.o) {
            try {
                if (!this.m.isEmpty() && C(linkedHashSet)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    public final StreamSharing t(LinkedHashSet linkedHashSet, boolean z) {
        synchronized (this.o) {
            try {
                HashSet hashSetY = y(linkedHashSet, z);
                if (hashSetY.size() >= 2 || (A() && D(hashSetY))) {
                    StreamSharing streamSharing = this.s;
                    if (streamSharing != null && streamSharing.J().equals(hashSetY)) {
                        StreamSharing streamSharing2 = this.s;
                        Objects.requireNonNull(streamSharing2);
                        return streamSharing2;
                    }
                    int[] iArr = {1, 2, 4};
                    HashSet hashSet = new HashSet();
                    Iterator it = hashSetY.iterator();
                    while (it.hasNext()) {
                        UseCase useCase = (UseCase) it.next();
                        for (int i = 0; i < 3; i++) {
                            int i2 = iArr[i];
                            if (useCase.l(i2)) {
                                if (hashSet.contains(Integer.valueOf(i2))) {
                                    return null;
                                }
                                hashSet.add(Integer.valueOf(i2));
                            }
                        }
                    }
                    return new StreamSharing(this.d, this.e, this.w, this.x, hashSetY, this.g);
                }
                return null;
            } finally {
            }
        }
    }

    public final void u() {
        synchronized (this.o) {
            try {
                if (this.p) {
                    this.d.h(new ArrayList(this.j));
                    CameraInternal cameraInternal = this.e;
                    if (cameraInternal != null) {
                        cameraInternal.h(new ArrayList(this.j));
                    }
                    synchronized (this.o) {
                        CameraControlInternal cameraControlInternalK = this.d.k();
                        this.q = cameraControlInternalK.k();
                        cameraControlInternalK.o();
                    }
                    this.p = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int w() {
        synchronized (this.o) {
            try {
                return this.k.b() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet y(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.o) {
            try {
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((CameraEffect) it.next()).getClass();
                }
                i = z ? 3 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            UseCase useCase = (UseCase) it2.next();
            Preconditions.a("Only support one level of sharing for now.", !(useCase instanceof StreamSharing));
            if (useCase.l(i)) {
                hashSet.add(useCase);
            }
        }
        return hashSet;
    }

    public final List z() {
        ArrayList arrayList;
        synchronized (this.o) {
            arrayList = new ArrayList(this.i);
        }
        return arrayList;
    }
}
