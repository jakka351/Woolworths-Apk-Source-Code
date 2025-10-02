package androidx.camera.lifecycle;

import android.content.Context;
import android.os.Trace;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroidx/camera/lifecycle/LifecycleCameraProvider;", "Companion", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ProcessCameraProvider implements LifecycleCameraProvider {
    public static final ProcessCameraProvider h = new ProcessCameraProvider();
    public ListenableFuture b;
    public CameraX e;
    public Context f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f574a = new Object();
    public final ListenableFuture c = Futures.g(null);
    public final LifecycleCameraRepository d = new LifecycleCameraRepository();
    public final HashMap g = new HashMap();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "sAppInstance", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static ListenableFuture a(final Context context) {
            ListenableFuture listenableFutureA;
            Intrinsics.h(context, "context");
            final ProcessCameraProvider processCameraProvider = ProcessCameraProvider.h;
            synchronized (processCameraProvider.f574a) {
                listenableFutureA = processCameraProvider.b;
                if (listenableFutureA == null) {
                    final CameraX cameraX = new CameraX(context);
                    listenableFutureA = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.lifecycle.a
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
                            ProcessCameraProvider this$0 = processCameraProvider;
                            final CameraX cameraX2 = cameraX;
                            ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.h;
                            Intrinsics.h(this$0, "this$0");
                            synchronized (this$0.f574a) {
                                Futures.a((FutureChain) Futures.m(FutureChain.a(this$0.c), new b(0, new Function1<Void, ListenableFuture<Void>>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return cameraX2.j;
                                    }
                                }), CameraXExecutors.a()), new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$1
                                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                                    public final void onFailure(Throwable th) {
                                        completer.d(th);
                                    }

                                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                                    public final void onSuccess(Object obj) {
                                        completer.b(cameraX2);
                                    }
                                }, CameraXExecutors.a());
                            }
                            return "ProcessCameraProvider-initializeCameraX";
                        }
                    });
                    processCameraProvider.b = listenableFutureA;
                }
            }
            final Function1<CameraX, ProcessCameraProvider> function1 = new Function1<CameraX, ProcessCameraProvider>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$getInstance$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CameraX cameraX2 = (CameraX) obj;
                    ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.h;
                    Intrinsics.g(cameraX2, "cameraX");
                    processCameraProvider2.e = cameraX2;
                    Context contextA = ContextUtil.a(context);
                    Intrinsics.g(contextA, "getApplicationContext(context)");
                    processCameraProvider2.f = contextA;
                    return processCameraProvider2;
                }
            };
            return Futures.l(listenableFutureA, new Function() { // from class: androidx.camera.lifecycle.c
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Function1 tmp0 = function1;
                    Intrinsics.h(tmp0, "$tmp0");
                    return (ProcessCameraProvider) tmp0.invoke(obj);
                }
            }, CameraXExecutors.a());
        }
    }

    public static final CameraConfig a(ProcessCameraProvider processCameraProvider, CameraSelector cameraSelector, CameraInfoInternal cameraInfoInternal) {
        Iterator it = cameraSelector.f395a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.g(next, "cameraSelector.cameraFilterSet");
            Identifier identifier = CameraFilter.f394a;
            if (!Intrinsics.c(identifier, identifier)) {
                synchronized (ExtendedCameraConfigProviderStore.f489a) {
                }
                Intrinsics.e(processCameraProvider.f);
            }
        }
        return CameraConfigs.f473a;
    }

    public final LifecycleCamera b(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCaseArr) {
        int i;
        Intrinsics.h(lifecycleOwner, "lifecycleOwner");
        Intrinsics.h(cameraSelector, "cameraSelector");
        Trace.beginSection(androidx.tracing.Trace.f("CX:bindToLifecycle"));
        try {
            CameraX cameraX = this.e;
            if (cameraX == null) {
                i = 0;
            } else {
                CameraFactory cameraFactory = cameraX.f;
                if (cameraFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i = cameraFactory.d().e;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            CameraX cameraX2 = this.e;
            if (cameraX2 != null) {
                CameraFactory cameraFactory2 = cameraX2.f;
                if (cameraFactory2 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                Camera2CameraCoordinator camera2CameraCoordinatorD = cameraFactory2.d();
                if (1 != camera2CameraCoordinatorD.e) {
                    Iterator it = camera2CameraCoordinatorD.f371a.iterator();
                    while (it.hasNext()) {
                        ((CameraCoordinator.ConcurrentCameraModeListener) it.next()).a(camera2CameraCoordinatorD.e, 1);
                    }
                }
                if (camera2CameraCoordinatorD.e == 2) {
                    camera2CameraCoordinatorD.c.clear();
                }
                camera2CameraCoordinatorD.e = 1;
            }
            LifecycleCamera lifecycleCameraC = c(lifecycleOwner, cameraSelector, null, EmptyList.d, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
            Trace.endSection();
            return lifecycleCameraC;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final LifecycleCamera c(LifecycleOwner lifecycleOwner, CameraSelector primaryCameraSelector, ViewPort viewPort, List effects, UseCase... useCases) {
        LifecycleCamera lifecycleCameraB;
        Intrinsics.h(lifecycleOwner, "lifecycleOwner");
        Intrinsics.h(primaryCameraSelector, "primaryCameraSelector");
        Intrinsics.h(effects, "effects");
        Intrinsics.h(useCases, "useCases");
        Trace.beginSection(androidx.tracing.Trace.f("CX:bindToLifecycle-internal"));
        try {
            Threads.a();
            CameraX cameraX = this.e;
            Intrinsics.e(cameraX);
            CameraInternal cameraInternalC = primaryCameraSelector.c(cameraX.f397a.a());
            Intrinsics.g(cameraInternalC, "primaryCameraSelector.se…cameraRepository.cameras)");
            cameraInternalC.i(true);
            RestrictedCameraInfo restrictedCameraInfoD = d(primaryCameraSelector);
            LifecycleCameraRepository lifecycleCameraRepository = this.d;
            CameraUseCaseAdapter.CameraId cameraIdV = CameraUseCaseAdapter.v(restrictedCameraInfoD, null);
            synchronized (lifecycleCameraRepository.f573a) {
                lifecycleCameraB = (LifecycleCamera) lifecycleCameraRepository.b.get(new AutoValue_LifecycleCameraRepository_Key(lifecycleOwner, cameraIdV));
            }
            Collection collectionD = this.d.d();
            Iterator it = ArraysKt.F(useCases).iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                for (Object lifecycleCameras : collectionD) {
                    Intrinsics.g(lifecycleCameras, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameras;
                    if (lifecycleCamera.n(useCase) && !lifecycleCamera.equals(lifecycleCameraB)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1)));
                    }
                }
            }
            if (lifecycleCameraB == null) {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.d;
                CameraX cameraX2 = this.e;
                Intrinsics.e(cameraX2);
                CameraFactory cameraFactory = cameraX2.f;
                if (cameraFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                Camera2CameraCoordinator camera2CameraCoordinatorD = cameraFactory.d();
                CameraX cameraX3 = this.e;
                Intrinsics.e(cameraX3);
                CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX3.g;
                if (cameraDeviceSurfaceManager == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                CameraX cameraX4 = this.e;
                Intrinsics.e(cameraX4);
                UseCaseConfigFactory useCaseConfigFactory = cameraX4.h;
                if (useCaseConfigFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                lifecycleCameraB = lifecycleCameraRepository2.b(lifecycleOwner, new CameraUseCaseAdapter(cameraInternalC, null, restrictedCameraInfoD, null, camera2CameraCoordinatorD, cameraDeviceSurfaceManager, useCaseConfigFactory));
            }
            LifecycleCamera lifecycleCamera2 = lifecycleCameraB;
            if (useCases.length != 0) {
                LifecycleCameraRepository lifecycleCameraRepository3 = this.d;
                List listR = CollectionsKt.R(Arrays.copyOf(useCases, useCases.length));
                CameraX cameraX5 = this.e;
                Intrinsics.e(cameraX5);
                CameraFactory cameraFactory2 = cameraX5.f;
                if (cameraFactory2 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                lifecycleCameraRepository3.a(lifecycleCamera2, viewPort, effects, listR, cameraFactory2.d());
            }
            return lifecycleCamera2;
        } finally {
            Trace.endSection();
        }
    }

    public final RestrictedCameraInfo d(CameraSelector cameraSelector) {
        Object restrictedCameraInfo;
        Intrinsics.h(cameraSelector, "cameraSelector");
        Trace.beginSection(androidx.tracing.Trace.f("CX:getCameraInfo"));
        try {
            CameraX cameraX = this.e;
            Intrinsics.e(cameraX);
            CameraInfoInternal cameraInfoInternalD = cameraSelector.c(cameraX.f397a.a()).d();
            Intrinsics.g(cameraInfoInternalD, "cameraSelector.select(mC…meras).cameraInfoInternal");
            CameraConfig cameraConfigA = a(this, cameraSelector, cameraInfoInternalD);
            CameraUseCaseAdapter.CameraId cameraIdA = CameraUseCaseAdapter.CameraId.a(cameraInfoInternalD.b(), cameraConfigA.C());
            synchronized (this.f574a) {
                restrictedCameraInfo = this.g.get(cameraIdA);
                if (restrictedCameraInfo == null) {
                    restrictedCameraInfo = new RestrictedCameraInfo(cameraInfoInternalD, cameraConfigA);
                    this.g.put(cameraIdA, restrictedCameraInfo);
                }
            }
            return (RestrictedCameraInfo) restrictedCameraInfo;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean e(UseCase useCase) {
        Intrinsics.h(useCase, "useCase");
        for (Object obj : this.d.d()) {
            Intrinsics.g(obj, "mLifecycleCameraRepository.lifecycleCameras");
            if (((LifecycleCamera) obj).n(useCase)) {
                return true;
            }
        }
        return false;
    }

    public final void f(UseCase... useCaseArr) {
        int i;
        Trace.beginSection(androidx.tracing.Trace.f("CX:unbind"));
        try {
            Threads.a();
            CameraX cameraX = this.e;
            if (cameraX == null) {
                i = 0;
            } else {
                CameraFactory cameraFactory = cameraX.f;
                if (cameraFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i = cameraFactory.d().e;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.d.j(CollectionsKt.R(Arrays.copyOf(useCaseArr, useCaseArr.length)));
        } finally {
            Trace.endSection();
        }
    }

    public final void g() {
        Trace.beginSection(androidx.tracing.Trace.f("CX:unbindAll"));
        try {
            Threads.a();
            CameraX cameraX = this.e;
            if (cameraX != null) {
                CameraFactory cameraFactory = cameraX.f;
                if (cameraFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                Camera2CameraCoordinator camera2CameraCoordinatorD = cameraFactory.d();
                if (camera2CameraCoordinatorD.e != 0) {
                    Iterator it = camera2CameraCoordinatorD.f371a.iterator();
                    while (it.hasNext()) {
                        ((CameraCoordinator.ConcurrentCameraModeListener) it.next()).a(camera2CameraCoordinatorD.e, 0);
                    }
                }
                if (camera2CameraCoordinatorD.e == 2) {
                    camera2CameraCoordinatorD.c.clear();
                }
                camera2CameraCoordinatorD.e = 0;
            }
            this.d.k();
        } finally {
            Trace.endSection();
        }
    }
}
