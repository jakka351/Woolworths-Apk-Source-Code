package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class Camera2CapturePipeline {

    /* renamed from: a, reason: collision with root package name */
    public final Camera2CameraControlImpl f244a;
    public final UseTorchAsFlash b;
    public final boolean c;
    public final Quirks d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final boolean g;
    public int h = 1;

    public static class AePreCaptureTask implements PipelineTask {

        /* renamed from: a, reason: collision with root package name */
        public final Camera2CameraControlImpl f245a;
        public final OverrideAeModeForStillCapture b;
        public final int c;
        public boolean d = false;

        public AePreCaptureTask(Camera2CameraControlImpl camera2CameraControlImpl, int i, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.f245a = camera2CameraControlImpl;
            this.c = i;
            this.b = overrideAeModeForStillCapture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
            if (!Camera2CapturePipeline.c(this.c, totalCaptureResult)) {
                return Futures.g(Boolean.FALSE);
            }
            Logger.a("Camera2CapturePipeline", "Trigger AE");
            this.d = true;
            return (FutureChain) Futures.l(FutureChain.a(CallbackToFutureAdapter.a(new q(this, 0))), new x(2), CameraXExecutors.a());
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final boolean b() {
            return this.c == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final void c() {
            if (this.d) {
                Logger.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f245a.h.a(false, true);
                this.b.b = false;
            }
        }
    }

    public static class AfTask implements PipelineTask {

        /* renamed from: a, reason: collision with root package name */
        public final Camera2CameraControlImpl f246a;
        public boolean b = false;

        public AfTask(Camera2CameraControlImpl camera2CameraControlImpl) {
            this.f246a = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            ListenableFuture listenableFutureG = Futures.g(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                Logger.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.a("Camera2CapturePipeline", "Trigger AF");
                    this.b = true;
                    this.f246a.h.f(false);
                }
            }
            return listenableFutureG;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final boolean b() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final void c() {
            if (this.b) {
                Logger.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f246a.h.a(true, false);
            }
        }
    }

    public static class CameraCapturePipelineImpl implements CameraCapturePipeline {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f247a;
        public final Pipeline b;
        public final int c;

        public CameraCapturePipelineImpl(Pipeline pipeline, Executor executor, int i) {
            this.b = pipeline;
            this.f247a = executor;
            this.c = i;
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public final ListenableFuture a() {
            Logger.a("Camera2CapturePipeline", "invokePreCapture");
            return (FutureChain) Futures.l(FutureChain.a(this.b.a(this.c)), new x(3), this.f247a);
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public final ListenableFuture b() {
            return CallbackToFutureAdapter.a(new q(this, 1));
        }
    }

    @VisibleForTesting
    public static class Pipeline {
        public static final long j;
        public static final long k;
        public static final /* synthetic */ int l = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f248a;
        public final Executor b;
        public final ScheduledExecutorService c;
        public final Camera2CameraControlImpl d;
        public final OverrideAeModeForStillCapture e;
        public final boolean f;
        public long g = j;
        public final ArrayList h = new ArrayList();
        public final AnonymousClass1 i = new AnonymousClass1();

        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1, reason: invalid class name */
        public class AnonymousClass1 implements PipelineTask {
            public AnonymousClass1() {
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Pipeline.this.h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PipelineTask) it.next()).a(totalCaptureResult));
                }
                return Futures.l(Futures.b(arrayList), new x(4), CameraXExecutors.a());
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public final boolean b() {
                Iterator it = Pipeline.this.h.iterator();
                while (it.hasNext()) {
                    if (((PipelineTask) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public final void c() {
                Iterator it = Pipeline.this.h.iterator();
                while (it.hasNext()) {
                    ((PipelineTask) it.next()).c();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            j = timeUnit.toNanos(1L);
            k = timeUnit.toNanos(5L);
        }

        public Pipeline(int i, Executor executor, ScheduledExecutorService scheduledExecutorService, Camera2CameraControlImpl camera2CameraControlImpl, boolean z, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.f248a = i;
            this.b = executor;
            this.c = scheduledExecutorService;
            this.d = camera2CameraControlImpl;
            this.f = z;
            this.e = overrideAeModeForStillCapture;
        }

        public final ListenableFuture a(final int i) {
            ListenableFuture listenableFutureG;
            ListenableFuture listenableFutureG2 = Futures.g(null);
            if (this.h.isEmpty()) {
                return listenableFutureG2;
            }
            if (this.i.b()) {
                ResultListener resultListener = new ResultListener(null);
                Camera2CameraControlImpl camera2CameraControlImpl = this.d;
                camera2CameraControlImpl.p(resultListener);
                b bVar = new b(4, camera2CameraControlImpl, resultListener);
                Executor executor = camera2CameraControlImpl.c;
                listenableFutureG = resultListener.b;
                listenableFutureG.addListener(bVar, executor);
            } else {
                listenableFutureG = Futures.g(null);
            }
            FutureChain futureChainA = FutureChain.a(listenableFutureG);
            AsyncFunction asyncFunction = new AsyncFunction() { // from class: androidx.camera.camera2.internal.s
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                    int i2 = Camera2CapturePipeline.Pipeline.l;
                    boolean zC = Camera2CapturePipeline.c(i, totalCaptureResult);
                    Camera2CapturePipeline.Pipeline pipeline = this.d;
                    if (zC) {
                        pipeline.g = Camera2CapturePipeline.Pipeline.k;
                    }
                    return pipeline.i.a(totalCaptureResult);
                }
            };
            Executor executor2 = this.b;
            return (FutureChain) Futures.m((FutureChain) Futures.m(futureChainA, asyncFunction, executor2), new q(this, 3), executor2);
        }
    }

    public interface PipelineTask {
        ListenableFuture a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {

        /* renamed from: a, reason: collision with root package name */
        public CallbackToFutureAdapter.Completer f251a;
        public final ListenableFuture b = CallbackToFutureAdapter.a(new q(this, 4));
        public final Checker c;

        public interface Checker {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(Checker checker) {
            this.c = checker;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            Checker checker = this.c;
            if (checker != null && !checker.a(totalCaptureResult)) {
                return false;
            }
            this.f251a.b(totalCaptureResult);
            return true;
        }
    }

    public static class ScreenFlashTask implements PipelineTask {
        public static final long f = TimeUnit.SECONDS.toNanos(2);
        public static final /* synthetic */ int g = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Camera2CameraControlImpl f252a;
        public final Executor b;
        public final ScheduledExecutorService c;
        public final ImageCapture.ScreenFlash d;
        public final UseFlashModeTorchFor3aUpdate e;

        public ScreenFlashTask(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor, ScheduledExecutorService scheduledExecutorService, UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
            this.f252a = camera2CameraControlImpl;
            this.b = executor;
            this.c = scheduledExecutorService;
            this.e = useFlashModeTorchFor3aUpdate;
            ImageCapture.ScreenFlash screenFlash = camera2CameraControlImpl.q;
            Objects.requireNonNull(screenFlash);
            this.d = screenFlash;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
            Logger.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            AtomicReference atomicReference = new AtomicReference();
            ListenableFuture listenableFutureA = CallbackToFutureAdapter.a(new q(atomicReference, 5));
            int i = 1;
            FutureChain futureChainA = FutureChain.a(CallbackToFutureAdapter.a(new l(i, this, atomicReference)));
            v vVar = new v(this, i);
            Executor executor = this.b;
            int i2 = 2;
            return (FutureChain) Futures.l((FutureChain) Futures.m((FutureChain) Futures.m((FutureChain) Futures.m((FutureChain) Futures.m((FutureChain) Futures.m(futureChainA, vVar, executor), new v(this, i2), executor), new l(i2, this, listenableFutureA), executor), new v(this, 3), executor), new v(this, 4), executor), new x(0), CameraXExecutors.a());
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final boolean b() {
            return false;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final void c() {
            Camera2CameraControlImpl camera2CameraControlImpl = this.f252a;
            FocusMeteringControl focusMeteringControl = camera2CameraControlImpl.h;
            Logger.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.e.a()) {
                camera2CameraControlImpl.r(false);
            }
            focusMeteringControl.c(false).addListener(new u(0), this.b);
            focusMeteringControl.a(false, true);
            ScheduledExecutorService scheduledExecutorServiceD = CameraXExecutors.d();
            ImageCapture.ScreenFlash screenFlash = this.d;
            Objects.requireNonNull(screenFlash);
            scheduledExecutorServiceD.execute(new m(screenFlash, 10));
        }
    }

    public static class TorchTask implements PipelineTask {
        public static final long g = TimeUnit.SECONDS.toNanos(2);
        public static final /* synthetic */ int h = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Camera2CameraControlImpl f253a;
        public final int b;
        public boolean c = false;
        public final Executor d;
        public final ScheduledExecutorService e;
        public final boolean f;

        public TorchTask(Camera2CameraControlImpl camera2CameraControlImpl, int i, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
            this.f253a = camera2CameraControlImpl;
            this.b = i;
            this.d = executor;
            this.e = scheduledExecutorService;
            this.f = z;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
            Logger.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + Camera2CapturePipeline.c(this.b, totalCaptureResult));
            if (Camera2CapturePipeline.c(this.b, totalCaptureResult)) {
                if (!this.f253a.r) {
                    Logger.a("Camera2CapturePipeline", "Turn on torch");
                    this.c = true;
                    return (FutureChain) Futures.l((FutureChain) Futures.m((FutureChain) Futures.m(FutureChain.a(CallbackToFutureAdapter.a(new y(this, 0))), new y(this, 1), this.d), new y(this, 2), this.d), new x(1), CameraXExecutors.a());
                }
                Logger.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return Futures.g(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final boolean b() {
            return this.b == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public final void c() {
            if (this.c) {
                Camera2CameraControlImpl camera2CameraControlImpl = this.f253a;
                camera2CameraControlImpl.j.a(null, false);
                Logger.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f) {
                    camera2CameraControlImpl.h.a(false, true);
                }
            }
        }
    }

    public Camera2CapturePipeline(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Quirks quirks, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f244a = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.g = num != null && num.intValue() == 2;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.d = quirks;
        this.b = new UseTorchAsFlash(quirks);
        this.c = FlashAvailabilityChecker.a(new q(cameraCharacteristicsCompat, 9));
    }

    public static boolean b(TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult != null) {
            Camera2CameraCaptureResult camera2CameraCaptureResult = new Camera2CameraCaptureResult(totalCaptureResult);
            Set set = ConvergenceUtils.f485a;
            boolean z2 = camera2CameraCaptureResult.h() == CameraCaptureMetaData.AfMode.e || camera2CameraCaptureResult.h() == CameraCaptureMetaData.AfMode.d || ConvergenceUtils.f485a.contains(camera2CameraCaptureResult.c());
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            CaptureResult captureResult = camera2CameraCaptureResult.b;
            Integer num = (Integer) captureResult.get(key);
            CameraCaptureMetaData.AeMode aeMode = CameraCaptureMetaData.AeMode.e;
            CameraCaptureMetaData.AeMode aeMode2 = CameraCaptureMetaData.AeMode.d;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    aeMode2 = aeMode;
                } else if (iIntValue == 1) {
                    aeMode2 = CameraCaptureMetaData.AeMode.f;
                } else if (iIntValue == 2) {
                    aeMode2 = CameraCaptureMetaData.AeMode.g;
                } else if (iIntValue == 3) {
                    aeMode2 = CameraCaptureMetaData.AeMode.h;
                } else if (iIntValue == 4) {
                    aeMode2 = CameraCaptureMetaData.AeMode.i;
                } else if (iIntValue == 5) {
                    aeMode2 = CameraCaptureMetaData.AeMode.j;
                }
            }
            boolean z3 = aeMode2 == aeMode;
            boolean z4 = !z ? !(z3 || ConvergenceUtils.c.contains(camera2CameraCaptureResult.e())) : !(z3 || ConvergenceUtils.d.contains(camera2CameraCaptureResult.e()));
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
            CameraCaptureMetaData.AwbMode awbMode = CameraCaptureMetaData.AwbMode.e;
            CameraCaptureMetaData.AwbMode awbMode2 = CameraCaptureMetaData.AwbMode.d;
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 0:
                        awbMode2 = awbMode;
                        break;
                    case 1:
                        awbMode2 = CameraCaptureMetaData.AwbMode.f;
                        break;
                    case 2:
                        awbMode2 = CameraCaptureMetaData.AwbMode.g;
                        break;
                    case 3:
                        awbMode2 = CameraCaptureMetaData.AwbMode.h;
                        break;
                    case 4:
                        awbMode2 = CameraCaptureMetaData.AwbMode.i;
                        break;
                    case 5:
                        awbMode2 = CameraCaptureMetaData.AwbMode.j;
                        break;
                    case 6:
                        awbMode2 = CameraCaptureMetaData.AwbMode.k;
                        break;
                    case 7:
                        awbMode2 = CameraCaptureMetaData.AwbMode.l;
                        break;
                    case 8:
                        awbMode2 = CameraCaptureMetaData.AwbMode.m;
                        break;
                }
            }
            boolean z5 = awbMode2 == awbMode || ConvergenceUtils.b.contains(camera2CameraCaptureResult.d());
            Logger.a("ConvergenceUtils", "checkCaptureResult, AE=" + camera2CameraCaptureResult.e() + " AF =" + camera2CameraCaptureResult.c() + " AWB=" + camera2CameraCaptureResult.d());
            if (z2 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(int i, TotalCaptureResult totalCaptureResult) {
        Logger.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i);
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            Logger.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline a(int r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r18
            r8 = r19
            androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture r15 = new androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture
            androidx.camera.core.impl.Quirks r2 = r0.d
            r15.<init>(r2)
            androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline r9 = new androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline
            int r10 = r0.h
            boolean r14 = r0.g
            java.util.concurrent.Executor r5 = r0.e
            java.util.concurrent.ScheduledExecutorService r12 = r0.f
            androidx.camera.camera2.internal.Camera2CameraControlImpl r13 = r0.f244a
            r11 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.util.ArrayList r10 = r9.h
            if (r1 != 0) goto L2b
            androidx.camera.camera2.internal.Camera2CapturePipeline$AfTask r3 = new androidx.camera.camera2.internal.Camera2CapturePipeline$AfTask
            r3.<init>(r13)
            r10.add(r3)
        L2b:
            r3 = 3
            if (r4 != r3) goto L3c
            androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask r3 = new androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask
            androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate r6 = new androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate
            r6.<init>(r2)
            r3.<init>(r13, r5, r12, r6)
            r10.add(r3)
            goto L85
        L3c:
            boolean r2 = r0.c
            if (r2 == 0) goto L85
            androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash r2 = r0.b
            boolean r2 = r2.f369a
            r6 = 1
            if (r2 != 0) goto L57
            int r7 = r0.h
            if (r7 == r3) goto L57
            if (r8 != r6) goto L4e
            goto L57
        L4e:
            androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask r2 = new androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask
            r2.<init>(r13, r4, r15)
            r10.add(r2)
            goto L85
        L57:
            if (r2 != 0) goto L79
            androidx.camera.camera2.internal.VideoUsageControl r2 = r13.o
            java.util.concurrent.atomic.AtomicInteger r2 = r2.b
            int r2 = r2.get()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "isInVideoUsage: mVideoUsageControl value = "
            r3.<init>(r7)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "Camera2CameraControlImp"
            androidx.camera.core.Logger.a(r7, r3)
            if (r2 <= 0) goto L77
            goto L79
        L77:
            r7 = r6
            goto L7b
        L79:
            r6 = 0
            goto L77
        L7b:
            androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask r2 = new androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask
            r6 = r12
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r10.add(r2)
        L85:
            java.lang.String r2 = ", flashMode = "
            java.lang.String r3 = ", flashType = "
            java.lang.String r5 = "createPipeline: captureMode = "
            java.lang.StringBuilder r1 = YU.a.q(r1, r4, r5, r2, r3)
            r1.append(r8)
            java.lang.String r2 = ", pipeline tasks = "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Camera2CapturePipeline"
            androidx.camera.core.Logger.a(r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CapturePipeline.a(int, int, int):androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline");
    }
}
