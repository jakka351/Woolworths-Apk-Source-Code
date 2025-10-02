package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ImagePipeline {
    public static int f;

    /* renamed from: a, reason: collision with root package name */
    public final ImageCaptureConfig f447a;
    public final CaptureConfig b;
    public final CaptureNode c;
    public final ProcessingNode d;
    public final AutoValue_CaptureNode_In e;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePipeline(ImageCaptureConfig imageCaptureConfig, Size size, CameraEffect cameraEffect, boolean z, Size size2, int i) {
        int iIntValue;
        Consumer consumer;
        NoMetadataImageReader noMetadataImageReader;
        Threads.a();
        this.f447a = imageCaptureConfig;
        CaptureConfig.OptionUnpacker optionUnpacker = (CaptureConfig.OptionUnpacker) imageCaptureConfig.c(UseCaseConfig.u, null);
        if (optionUnpacker == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + imageCaptureConfig.m(imageCaptureConfig.toString()));
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        optionUnpacker.a(imageCaptureConfig, builder);
        this.b = builder.d();
        final CaptureNode captureNode = new CaptureNode();
        captureNode.f442a = null;
        captureNode.f = null;
        this.c = captureNode;
        Executor executor = (Executor) imageCaptureConfig.c(IoConfig.C, CameraXExecutors.c());
        Objects.requireNonNull(executor);
        Executor executor2 = executor;
        if (cameraEffect != null) {
            Preconditions.b(false);
            throw null;
        }
        final ProcessingNode processingNode = new ProcessingNode(executor2);
        this.d = processingNode;
        int iJ = imageCaptureConfig.j();
        Integer num = (Integer) imageCaptureConfig.c(ImageCaptureConfig.K, null);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer num2 = (Integer) imageCaptureConfig.c(ImageInputConfig.f, null);
            iIntValue = (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
        }
        ImageReaderProxyProvider imageReaderProxyProvider = (ImageReaderProxyProvider) imageCaptureConfig.c(ImageCaptureConfig.M, null);
        Edge edge = new Edge();
        Edge edge2 = new Edge();
        AutoValue_CaptureNode_In autoValue_CaptureNode_In = new AutoValue_CaptureNode_In(size, iJ, iIntValue, z, imageReaderProxyProvider, size2, i, edge, edge2);
        this.e = autoValue_CaptureNode_In;
        Preconditions.f("CaptureNode does not support recreation yet.", captureNode.e == null && captureNode.b == null);
        captureNode.e = autoValue_CaptureNode_In;
        CaptureNode.AnonymousClass1 anonymousClass1 = captureNode.new AnonymousClass1();
        if (z || imageReaderProxyProvider != null) {
            final int i2 = 1;
            NoMetadataImageReader noMetadataImageReader2 = new NoMetadataImageReader(imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance() : ImageReaderProxys.a(size.getWidth(), size.getHeight(), iJ, 4));
            captureNode.f = noMetadataImageReader2;
            consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.b
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    switch (i2) {
                        case 0:
                            captureNode.c((ProcessingRequest) obj);
                            break;
                        case 1:
                            ProcessingRequest processingRequest = (ProcessingRequest) obj;
                            CaptureNode captureNode2 = captureNode;
                            captureNode2.c(processingRequest);
                            NoMetadataImageReader noMetadataImageReader3 = captureNode2.f;
                            Preconditions.f("Pending request should be null", noMetadataImageReader3.b == null);
                            noMetadataImageReader3.b = processingRequest;
                            break;
                        default:
                            captureNode.d((TakePictureManager.CaptureError) obj);
                            break;
                    }
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        } else {
            final int i3 = 0;
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), iJ, 4);
            CameraCaptureCallbacks.a(anonymousClass1, metadataImageReader.b);
            consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.b
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    switch (i3) {
                        case 0:
                            captureNode.c((ProcessingRequest) obj);
                            break;
                        case 1:
                            ProcessingRequest processingRequest = (ProcessingRequest) obj;
                            CaptureNode captureNode2 = captureNode;
                            captureNode2.c(processingRequest);
                            NoMetadataImageReader noMetadataImageReader3 = captureNode2.f;
                            Preconditions.f("Pending request should be null", noMetadataImageReader3.b == null);
                            noMetadataImageReader3.b = processingRequest;
                            break;
                        default:
                            captureNode.d((TakePictureManager.CaptureError) obj);
                            break;
                    }
                }
            };
            noMetadataImageReader = metadataImageReader;
        }
        Surface surface = noMetadataImageReader.getSurface();
        Objects.requireNonNull(surface);
        Preconditions.f("The surface is already set.", autoValue_CaptureNode_In.f445a == null);
        autoValue_CaptureNode_In.f445a = new ImmediateSurface(surface, size, iJ);
        captureNode.b = new SafeCloseImageReaderProxy(noMetadataImageReader);
        final int i4 = 0;
        noMetadataImageReader.f(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.c
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void a(ImageReaderProxy imageReaderProxy) throws Exception {
                switch (i4) {
                    case 0:
                        CaptureNode captureNode2 = captureNode;
                        try {
                            ImageProxy imageProxyD = imageReaderProxy.d();
                            if (imageProxyD != null) {
                                captureNode2.b(imageProxyD);
                            } else {
                                ProcessingRequest processingRequest = captureNode2.f442a;
                                if (processingRequest != null) {
                                    captureNode2.d(new AutoValue_TakePictureManager_CaptureError(processingRequest.f450a, new ImageCaptureException("Failed to acquire latest image", null)));
                                }
                            }
                            break;
                        } catch (IllegalStateException e) {
                            ProcessingRequest processingRequest2 = captureNode2.f442a;
                            if (processingRequest2 != null) {
                                captureNode2.d(new AutoValue_TakePictureManager_CaptureError(processingRequest2.f450a, new ImageCaptureException("Failed to acquire latest image", e)));
                                return;
                            }
                            return;
                        }
                    default:
                        CaptureNode captureNode3 = captureNode;
                        try {
                            ImageProxy imageProxyD2 = imageReaderProxy.d();
                            if (imageProxyD2 != null) {
                                if (captureNode3.f442a == null) {
                                    Logger.e("CaptureNode", "Postview image is closed due to request completed or aborted");
                                    imageProxyD2.close();
                                } else {
                                    AutoValue_ProcessingNode_In autoValue_ProcessingNode_In = captureNode3.d;
                                    Objects.requireNonNull(autoValue_ProcessingNode_In);
                                    autoValue_ProcessingNode_In.b.accept(new AutoValue_ProcessingNode_InputPacket(captureNode3.f442a, imageProxyD2));
                                }
                            }
                            break;
                        } catch (IllegalStateException e2) {
                            Logger.c("CaptureNode", "Failed to acquire latest image of postview", e2);
                            return;
                        }
                }
            }
        }, CameraXExecutors.d());
        if (size2 != null) {
            ImageReaderProxy imageReaderProxyNewInstance = imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance() : ImageReaderProxys.a(size2.getWidth(), size2.getHeight(), i, 4);
            final int i5 = 1;
            imageReaderProxyNewInstance.f(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.c
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void a(ImageReaderProxy imageReaderProxy) throws Exception {
                    switch (i5) {
                        case 0:
                            CaptureNode captureNode2 = captureNode;
                            try {
                                ImageProxy imageProxyD = imageReaderProxy.d();
                                if (imageProxyD != null) {
                                    captureNode2.b(imageProxyD);
                                } else {
                                    ProcessingRequest processingRequest = captureNode2.f442a;
                                    if (processingRequest != null) {
                                        captureNode2.d(new AutoValue_TakePictureManager_CaptureError(processingRequest.f450a, new ImageCaptureException("Failed to acquire latest image", null)));
                                    }
                                }
                                break;
                            } catch (IllegalStateException e) {
                                ProcessingRequest processingRequest2 = captureNode2.f442a;
                                if (processingRequest2 != null) {
                                    captureNode2.d(new AutoValue_TakePictureManager_CaptureError(processingRequest2.f450a, new ImageCaptureException("Failed to acquire latest image", e)));
                                    return;
                                }
                                return;
                            }
                        default:
                            CaptureNode captureNode3 = captureNode;
                            try {
                                ImageProxy imageProxyD2 = imageReaderProxy.d();
                                if (imageProxyD2 != null) {
                                    if (captureNode3.f442a == null) {
                                        Logger.e("CaptureNode", "Postview image is closed due to request completed or aborted");
                                        imageProxyD2.close();
                                    } else {
                                        AutoValue_ProcessingNode_In autoValue_ProcessingNode_In = captureNode3.d;
                                        Objects.requireNonNull(autoValue_ProcessingNode_In);
                                        autoValue_ProcessingNode_In.b.accept(new AutoValue_ProcessingNode_InputPacket(captureNode3.f442a, imageProxyD2));
                                    }
                                }
                                break;
                            } catch (IllegalStateException e2) {
                                Logger.c("CaptureNode", "Failed to acquire latest image of postview", e2);
                                return;
                            }
                    }
                }
            }, CameraXExecutors.d());
            captureNode.c = new SafeCloseImageReaderProxy(imageReaderProxyNewInstance);
            autoValue_CaptureNode_In.b = new ImmediateSurface(imageReaderProxyNewInstance.getSurface(), size2, i);
        }
        edge.d = consumer;
        final int i6 = 2;
        edge2.d = new Consumer() { // from class: androidx.camera.core.imagecapture.b
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        captureNode.c((ProcessingRequest) obj);
                        break;
                    case 1:
                        ProcessingRequest processingRequest = (ProcessingRequest) obj;
                        CaptureNode captureNode2 = captureNode;
                        captureNode2.c(processingRequest);
                        NoMetadataImageReader noMetadataImageReader3 = captureNode2.f;
                        Preconditions.f("Pending request should be null", noMetadataImageReader3.b == null);
                        noMetadataImageReader3.b = processingRequest;
                        break;
                    default:
                        captureNode.d((TakePictureManager.CaptureError) obj);
                        break;
                }
            }
        };
        Edge edge3 = new Edge();
        Edge edge4 = new Edge();
        AutoValue_ProcessingNode_In autoValue_ProcessingNode_In = new AutoValue_ProcessingNode_In(edge3, edge4, iJ, iIntValue);
        captureNode.d = autoValue_ProcessingNode_In;
        processingNode.b = autoValue_ProcessingNode_In;
        final int i7 = 0;
        edge3.d = new Consumer() { // from class: androidx.camera.core.imagecapture.e
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) throws Exception {
                final ProcessingNode.InputPacket inputPacket = (ProcessingNode.InputPacket) obj;
                switch (i7) {
                    case 0:
                        if (!inputPacket.b().g.g) {
                            final ProcessingNode processingNode2 = processingNode;
                            final int i8 = 1;
                            processingNode2.f449a.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.f
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i8) {
                                        case 0:
                                            ProcessingNode processingNode3 = processingNode2;
                                            int i9 = processingNode3.b.d;
                                            Preconditions.a("Postview only support YUV and JPEG output formats. Output format: " + i9, i9 == 35 || i9 == 256);
                                            ProcessingNode.InputPacket inputPacket2 = inputPacket;
                                            try {
                                                CameraXExecutors.d().execute(new h(inputPacket2.b(), (Bitmap) processingNode3.j.a((Packet) ((ProcessingInput2Packet) processingNode3.c).a(inputPacket2)), 0));
                                                return;
                                            } catch (Exception e) {
                                                inputPacket2.a().close();
                                                Logger.c("ProcessingNode", "process postview input packet failed.", e);
                                                return;
                                            }
                                        default:
                                            ProcessingNode.InputPacket inputPacket3 = inputPacket;
                                            ProcessingRequest processingRequestB = inputPacket3.b();
                                            try {
                                                ImageCapture.OutputFileOptions outputFileOptions = inputPacket3.b().b;
                                                ProcessingNode processingNode4 = processingNode2;
                                                if (outputFileOptions == null) {
                                                    CameraXExecutors.d().execute(new g(0, processingRequestB, processingNode4.a(inputPacket3)));
                                                    return;
                                                } else {
                                                    processingNode4.b(inputPacket3);
                                                    throw null;
                                                }
                                            } catch (ImageCaptureException e2) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, e2, 1));
                                                return;
                                            } catch (OutOfMemoryError e3) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, new ImageCaptureException("Processing failed due to low memory.", e3), 1));
                                                return;
                                            } catch (RuntimeException e4) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, new ImageCaptureException("Processing failed.", e4), 1));
                                                return;
                                            }
                                    }
                                }
                            });
                            break;
                        } else {
                            inputPacket.a().close();
                            break;
                        }
                    default:
                        if (!inputPacket.b().g.g) {
                            final ProcessingNode processingNode3 = processingNode;
                            final int i9 = 0;
                            processingNode3.f449a.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.f
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i9) {
                                        case 0:
                                            ProcessingNode processingNode32 = processingNode3;
                                            int i92 = processingNode32.b.d;
                                            Preconditions.a("Postview only support YUV and JPEG output formats. Output format: " + i92, i92 == 35 || i92 == 256);
                                            ProcessingNode.InputPacket inputPacket2 = inputPacket;
                                            try {
                                                CameraXExecutors.d().execute(new h(inputPacket2.b(), (Bitmap) processingNode32.j.a((Packet) ((ProcessingInput2Packet) processingNode32.c).a(inputPacket2)), 0));
                                                return;
                                            } catch (Exception e) {
                                                inputPacket2.a().close();
                                                Logger.c("ProcessingNode", "process postview input packet failed.", e);
                                                return;
                                            }
                                        default:
                                            ProcessingNode.InputPacket inputPacket3 = inputPacket;
                                            ProcessingRequest processingRequestB = inputPacket3.b();
                                            try {
                                                ImageCapture.OutputFileOptions outputFileOptions = inputPacket3.b().b;
                                                ProcessingNode processingNode4 = processingNode3;
                                                if (outputFileOptions == null) {
                                                    CameraXExecutors.d().execute(new g(0, processingRequestB, processingNode4.a(inputPacket3)));
                                                    return;
                                                } else {
                                                    processingNode4.b(inputPacket3);
                                                    throw null;
                                                }
                                            } catch (ImageCaptureException e2) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, e2, 1));
                                                return;
                                            } catch (OutOfMemoryError e3) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, new ImageCaptureException("Processing failed due to low memory.", e3), 1));
                                                return;
                                            } catch (RuntimeException e4) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, new ImageCaptureException("Processing failed.", e4), 1));
                                                return;
                                            }
                                    }
                                }
                            });
                            break;
                        } else {
                            Logger.e("ProcessingNode", "The postview image is closed due to request aborted");
                            inputPacket.a().close();
                            break;
                        }
                }
            }
        };
        final int i8 = 1;
        edge4.d = new Consumer() { // from class: androidx.camera.core.imagecapture.e
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) throws Exception {
                final ProcessingNode.InputPacket inputPacket = (ProcessingNode.InputPacket) obj;
                switch (i8) {
                    case 0:
                        if (!inputPacket.b().g.g) {
                            final ProcessingNode processingNode2 = processingNode;
                            final int i82 = 1;
                            processingNode2.f449a.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.f
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i82) {
                                        case 0:
                                            ProcessingNode processingNode32 = processingNode2;
                                            int i92 = processingNode32.b.d;
                                            Preconditions.a("Postview only support YUV and JPEG output formats. Output format: " + i92, i92 == 35 || i92 == 256);
                                            ProcessingNode.InputPacket inputPacket2 = inputPacket;
                                            try {
                                                CameraXExecutors.d().execute(new h(inputPacket2.b(), (Bitmap) processingNode32.j.a((Packet) ((ProcessingInput2Packet) processingNode32.c).a(inputPacket2)), 0));
                                                return;
                                            } catch (Exception e) {
                                                inputPacket2.a().close();
                                                Logger.c("ProcessingNode", "process postview input packet failed.", e);
                                                return;
                                            }
                                        default:
                                            ProcessingNode.InputPacket inputPacket3 = inputPacket;
                                            ProcessingRequest processingRequestB = inputPacket3.b();
                                            try {
                                                ImageCapture.OutputFileOptions outputFileOptions = inputPacket3.b().b;
                                                ProcessingNode processingNode4 = processingNode2;
                                                if (outputFileOptions == null) {
                                                    CameraXExecutors.d().execute(new g(0, processingRequestB, processingNode4.a(inputPacket3)));
                                                    return;
                                                } else {
                                                    processingNode4.b(inputPacket3);
                                                    throw null;
                                                }
                                            } catch (ImageCaptureException e2) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, e2, 1));
                                                return;
                                            } catch (OutOfMemoryError e3) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, new ImageCaptureException("Processing failed due to low memory.", e3), 1));
                                                return;
                                            } catch (RuntimeException e4) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, new ImageCaptureException("Processing failed.", e4), 1));
                                                return;
                                            }
                                    }
                                }
                            });
                            break;
                        } else {
                            inputPacket.a().close();
                            break;
                        }
                    default:
                        if (!inputPacket.b().g.g) {
                            final ProcessingNode processingNode3 = processingNode;
                            final int i9 = 0;
                            processingNode3.f449a.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.f
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i9) {
                                        case 0:
                                            ProcessingNode processingNode32 = processingNode3;
                                            int i92 = processingNode32.b.d;
                                            Preconditions.a("Postview only support YUV and JPEG output formats. Output format: " + i92, i92 == 35 || i92 == 256);
                                            ProcessingNode.InputPacket inputPacket2 = inputPacket;
                                            try {
                                                CameraXExecutors.d().execute(new h(inputPacket2.b(), (Bitmap) processingNode32.j.a((Packet) ((ProcessingInput2Packet) processingNode32.c).a(inputPacket2)), 0));
                                                return;
                                            } catch (Exception e) {
                                                inputPacket2.a().close();
                                                Logger.c("ProcessingNode", "process postview input packet failed.", e);
                                                return;
                                            }
                                        default:
                                            ProcessingNode.InputPacket inputPacket3 = inputPacket;
                                            ProcessingRequest processingRequestB = inputPacket3.b();
                                            try {
                                                ImageCapture.OutputFileOptions outputFileOptions = inputPacket3.b().b;
                                                ProcessingNode processingNode4 = processingNode3;
                                                if (outputFileOptions == null) {
                                                    CameraXExecutors.d().execute(new g(0, processingRequestB, processingNode4.a(inputPacket3)));
                                                    return;
                                                } else {
                                                    processingNode4.b(inputPacket3);
                                                    throw null;
                                                }
                                            } catch (ImageCaptureException e2) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, e2, 1));
                                                return;
                                            } catch (OutOfMemoryError e3) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, new ImageCaptureException("Processing failed due to low memory.", e3), 1));
                                                return;
                                            } catch (RuntimeException e4) {
                                                CameraXExecutors.d().execute(new h(processingRequestB, new ImageCaptureException("Processing failed.", e4), 1));
                                                return;
                                            }
                                    }
                                }
                            });
                            break;
                        } else {
                            Logger.e("ProcessingNode", "The postview image is closed due to request aborted");
                            inputPacket.a().close();
                            break;
                        }
                }
            }
        };
        processingNode.c = new ProcessingInput2Packet();
        processingNode.d = new Image2JpegBytes(processingNode.k);
        processingNode.g = new JpegBytes2CroppedBitmap();
        processingNode.e = new Bitmap2JpegBytes();
        processingNode.f = new JpegBytes2Disk();
        processingNode.h = new JpegImage2Result();
        processingNode.j = new Image2Bitmap();
        if (iJ == 35 || processingNode.l) {
            processingNode.i = new JpegBytes2Image();
        }
    }

    public final void a() {
        Threads.a();
        CaptureNode captureNode = this.c;
        captureNode.getClass();
        Threads.a();
        AutoValue_CaptureNode_In autoValue_CaptureNode_In = captureNode.e;
        Objects.requireNonNull(autoValue_CaptureNode_In);
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy = captureNode.b;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = captureNode.c;
        ImmediateSurface immediateSurface = autoValue_CaptureNode_In.f445a;
        Objects.requireNonNull(immediateSurface);
        immediateSurface.a();
        ImmediateSurface immediateSurface2 = autoValue_CaptureNode_In.f445a;
        Objects.requireNonNull(immediateSurface2);
        final int i = 0;
        Futures.h(immediateSurface2.e).addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.a
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        safeCloseImageReaderProxy.g();
                        break;
                    default:
                        SafeCloseImageReaderProxy safeCloseImageReaderProxy3 = safeCloseImageReaderProxy;
                        if (safeCloseImageReaderProxy3 != null) {
                            safeCloseImageReaderProxy3.g();
                            break;
                        }
                        break;
                }
            }
        }, CameraXExecutors.d());
        ImmediateSurface immediateSurface3 = autoValue_CaptureNode_In.b;
        if (immediateSurface3 != null) {
            immediateSurface3.a();
            final int i2 = 1;
            Futures.h(autoValue_CaptureNode_In.b.e).addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.a
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            safeCloseImageReaderProxy2.g();
                            break;
                        default:
                            SafeCloseImageReaderProxy safeCloseImageReaderProxy3 = safeCloseImageReaderProxy2;
                            if (safeCloseImageReaderProxy3 != null) {
                                safeCloseImageReaderProxy3.g();
                                break;
                            }
                            break;
                    }
                }
            }, CameraXExecutors.d());
        }
        this.d.getClass();
    }

    public final SessionConfig.Builder b(Size size) {
        SessionConfig.Builder builderM = SessionConfig.Builder.m(this.f447a, size);
        AutoValue_CaptureNode_In autoValue_CaptureNode_In = this.e;
        ImmediateSurface immediateSurface = autoValue_CaptureNode_In.f445a;
        Objects.requireNonNull(immediateSurface);
        builderM.f(immediateSurface, DynamicRange.d);
        ImmediateSurface immediateSurface2 = autoValue_CaptureNode_In.b;
        if (immediateSurface2 != null) {
            builderM.s(immediateSurface2);
        }
        return builderM;
    }
}
