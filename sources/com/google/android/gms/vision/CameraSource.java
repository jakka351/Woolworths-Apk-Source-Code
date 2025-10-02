package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.vision.Frame;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes5.dex */
public class CameraSource {

    @SuppressLint
    public static final int CAMERA_FACING_BACK = 0;

    @SuppressLint
    public static final int CAMERA_FACING_FRONT = 1;
    private Context zza;
    private final Object zzb;

    @GuardedBy
    @Nullable
    private Camera zzc;
    private int zzd;
    private int zze;
    private Size zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;

    @Nullable
    private String zzk;

    @Nullable
    private SurfaceTexture zzl;

    @Nullable
    private Thread zzm;
    private zza zzn;
    private final IdentityHashMap<byte[], ByteBuffer> zzo;

    public static class Builder {
        private final Detector<?> zza;
        private CameraSource zzb;

        public Builder(@RecentlyNonNull Context context, @RecentlyNonNull Detector<?> detector) {
            CameraSource cameraSource = new CameraSource();
            this.zzb = cameraSource;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            if (detector == null) {
                throw new IllegalArgumentException("No detector supplied.");
            }
            this.zza = detector;
            cameraSource.zza = context;
        }

        @RecentlyNonNull
        public CameraSource build() {
            CameraSource cameraSource = this.zzb;
            cameraSource.getClass();
            cameraSource.zzn = cameraSource.new zza(this.zza);
            return this.zzb;
        }

        @RecentlyNonNull
        public Builder setAutoFocusEnabled(boolean z) {
            this.zzb.zzj = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setFacing(int i) {
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException(c.k(27, i, "Invalid camera: "));
            }
            this.zzb.zzd = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setFocusMode(@RecentlyNonNull String str) {
            if (str.equals("continuous-video") || str.equals("continuous-picture")) {
                this.zzb.zzk = str;
                return this;
            }
            Log.w("CameraSource", "FocusMode " + str + " is not supported for now.");
            this.zzb.zzk = null;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestedFps(float f) {
            if (f > BitmapDescriptorFactory.HUE_RED) {
                this.zzb.zzg = f;
                return this;
            }
            StringBuilder sb = new StringBuilder(28);
            sb.append("Invalid fps: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }

        @RecentlyNonNull
        public Builder setRequestedPreviewSize(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                throw new IllegalArgumentException(c.j(45, i, i2, "Invalid preview size: ", "x"));
            }
            this.zzb.zzh = i;
            this.zzb.zzi = i2;
            return this;
        }
    }

    public interface PictureCallback {
        void onPictureTaken(@RecentlyNonNull byte[] bArr);
    }

    public interface ShutterCallback {
        void onShutter();
    }

    public class zzb implements Camera.PreviewCallback {
        private zzb() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.zzn.zza(bArr, camera);
        }
    }

    public class zzc implements Camera.PictureCallback {

        @Nullable
        private PictureCallback zza;

        private zzc() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public final void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.zza;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (CameraSource.this.zzb) {
                try {
                    if (CameraSource.this.zzc != null) {
                        CameraSource.this.zzc.startPreview();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class zzd implements Camera.ShutterCallback {

        @Nullable
        private ShutterCallback zza;

        private zzd() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public final void onShutter() {
            ShutterCallback shutterCallback = this.zza;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }
    }

    @VisibleForTesting
    public static class zze {
        private Size zza;
        private Size zzb;

        public zze(Camera.Size size, @Nullable Camera.Size size2) {
            this.zza = new Size(size.width, size.height);
            if (size2 != null) {
                this.zzb = new Size(size2.width, size2.height);
            }
        }

        public final Size zza() {
            return this.zza;
        }

        @Nullable
        public final Size zzb() {
            return this.zzb;
        }
    }

    private CameraSource() {
        this.zzb = new Object();
        this.zzd = 0;
        this.zzg = 30.0f;
        this.zzh = 1024;
        this.zzi = 768;
        this.zzj = false;
        this.zzo = new IdentityHashMap<>();
    }

    @SuppressLint
    private final Camera zza() throws IOException {
        int i;
        int i2;
        int i3 = this.zzd;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= Camera.getNumberOfCameras()) {
                i5 = -1;
                break;
            }
            Camera.getCameraInfo(i5, cameraInfo);
            if (cameraInfo.facing == i3) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            throw new IOException("Could not find requested camera.");
        }
        Camera cameraOpen = Camera.open(i5);
        int i6 = this.zzh;
        int i7 = this.zzi;
        Camera.Parameters parameters = cameraOpen.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f = size.width / size.height;
            Iterator<Camera.Size> it = supportedPictureSizes.iterator();
            while (true) {
                if (it.hasNext()) {
                    Camera.Size next = it.next();
                    if (Math.abs(f - (next.width / next.height)) < 0.01f) {
                        arrayList.add(new zze(size, next));
                        break;
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
            while (it2.hasNext()) {
                arrayList.add(new zze(it2.next(), null));
            }
        }
        int size2 = arrayList.size();
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        int i10 = Integer.MAX_VALUE;
        zze zzeVar = null;
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            zze zzeVar2 = (zze) obj;
            Size sizeZza = zzeVar2.zza();
            int iAbs = Math.abs(sizeZza.getHeight() - i7) + Math.abs(sizeZza.getWidth() - i6);
            if (iAbs < i10) {
                zzeVar = zzeVar2;
                i10 = iAbs;
            }
        }
        zze zzeVar3 = (zze) Preconditions.checkNotNull(zzeVar);
        if (zzeVar3 == null) {
            throw new IOException("Could not find suitable preview size.");
        }
        Size sizeZzb = zzeVar3.zzb();
        this.zzf = zzeVar3.zza();
        int i11 = (int) (this.zzg * 1000.0f);
        int[] iArr = null;
        for (int[] iArr2 : cameraOpen.getParameters().getSupportedPreviewFpsRange()) {
            int i12 = i11 - iArr2[0];
            int iAbs2 = Math.abs(i11 - iArr2[1]) + Math.abs(i12);
            if (iAbs2 < i8) {
                iArr = iArr2;
                i8 = iAbs2;
            }
        }
        int[] iArr3 = (int[]) Preconditions.checkNotNull(iArr);
        if (iArr3 == null) {
            throw new IOException("Could not find suitable preview frames per second range.");
        }
        Camera.Parameters parameters2 = cameraOpen.getParameters();
        if (sizeZzb != null) {
            parameters2.setPictureSize(sizeZzb.getWidth(), sizeZzb.getHeight());
        }
        parameters2.setPreviewSize(this.zzf.getWidth(), this.zzf.getHeight());
        parameters2.setPreviewFpsRange(iArr3[0], iArr3[1]);
        parameters2.setPreviewFormat(17);
        int rotation = ((WindowManager) Preconditions.checkNotNull((WindowManager) this.zza.getSystemService("window"))).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i4 = 90;
            } else if (rotation == 2) {
                i4 = SubsamplingScaleImageView.ORIENTATION_180;
            } else if (rotation != 3) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Bad rotation value: ");
                sb.append(rotation);
                Log.e("CameraSource", sb.toString());
            } else {
                i4 = SubsamplingScaleImageView.ORIENTATION_270;
            }
        }
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i5, cameraInfo2);
        if (cameraInfo2.facing == 1) {
            i = (cameraInfo2.orientation + i4) % 360;
            i2 = (360 - i) % 360;
        } else {
            i = ((cameraInfo2.orientation - i4) + 360) % 360;
            i2 = i;
        }
        this.zze = i / 90;
        cameraOpen.setDisplayOrientation(i2);
        parameters2.setRotation(i);
        if (this.zzk != null) {
            if (parameters2.getSupportedFocusModes().contains(this.zzk)) {
                parameters2.setFocusMode((String) Preconditions.checkNotNull(this.zzk));
            } else {
                Log.w("CameraSource", "FocusMode " + this.zzk + " is not supported on this device.");
                this.zzk = null;
            }
        }
        if (this.zzk == null && this.zzj) {
            if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                parameters2.setFocusMode("continuous-video");
                this.zzk = "continuous-video";
            } else {
                Log.i("CameraSource", "Camera auto focus is not supported on this device.");
            }
        }
        cameraOpen.setParameters(parameters2);
        cameraOpen.setPreviewCallbackWithBuffer(new zzb());
        cameraOpen.addCallbackBuffer(zza(this.zzf));
        cameraOpen.addCallbackBuffer(zza(this.zzf));
        cameraOpen.addCallbackBuffer(zza(this.zzf));
        cameraOpen.addCallbackBuffer(zza(this.zzf));
        return cameraOpen;
    }

    public int getCameraFacing() {
        return this.zzd;
    }

    @RecentlyNonNull
    public Size getPreviewSize() {
        return this.zzf;
    }

    public void release() {
        synchronized (this.zzb) {
            stop();
            this.zzn.zza();
        }
    }

    @RecentlyNonNull
    @RequiresPermission
    public CameraSource start() throws IOException {
        synchronized (this.zzb) {
            try {
                if (this.zzc != null) {
                    return this;
                }
                this.zzc = zza();
                SurfaceTexture surfaceTexture = new SurfaceTexture(100);
                this.zzl = surfaceTexture;
                this.zzc.setPreviewTexture(surfaceTexture);
                this.zzc.startPreview();
                Thread thread = new Thread(this.zzn);
                this.zzm = thread;
                thread.setName("gms.vision.CameraSource");
                this.zzn.zza(true);
                Thread thread2 = this.zzm;
                if (thread2 != null) {
                    thread2.start();
                }
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000e, B:12:0x001b, B:13:0x001d, B:15:0x0021, B:16:0x0029, B:20:0x0057, B:19:0x0037, B:21:0x0064, B:22:0x0069, B:11:0x0014), top: B:28:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000e, B:12:0x001b, B:13:0x001d, B:15:0x0021, B:16:0x0029, B:20:0x0057, B:19:0x0037, B:21:0x0064, B:22:0x0069, B:11:0x0014), top: B:28:0x0003, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void stop() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzb
            monitor-enter(r0)
            com.google.android.gms.vision.CameraSource$zza r1 = r6.zzn     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.zza(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Thread r1 = r6.zzm     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r1 == 0) goto L1d
            r1.join()     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L14
            goto L1b
        L12:
            r1 = move-exception
            goto L6b
        L14:
            java.lang.String r1 = "CameraSource"
            java.lang.String r3 = "Frame processing thread interrupted on release."
            android.util.Log.d(r1, r3)     // Catch: java.lang.Throwable -> L12
        L1b:
            r6.zzm = r2     // Catch: java.lang.Throwable -> L12
        L1d:
            android.hardware.Camera r1 = r6.zzc     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L64
            r1.stopPreview()     // Catch: java.lang.Throwable -> L12
            android.hardware.Camera r1 = r6.zzc     // Catch: java.lang.Throwable -> L12
            r1.setPreviewCallbackWithBuffer(r2)     // Catch: java.lang.Throwable -> L12
            android.hardware.Camera r1 = r6.zzc     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            r1.setPreviewTexture(r2)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            r6.zzl = r2     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            android.hardware.Camera r1 = r6.zzc     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            r1.setPreviewDisplay(r2)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L36
            goto L57
        L36:
            r1 = move-exception
            java.lang.String r3 = "CameraSource"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L12
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L12
            int r4 = r4 + 32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "Failed to clear camera preview: "
            r5.append(r4)     // Catch: java.lang.Throwable -> L12
            r5.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.e(r3, r1)     // Catch: java.lang.Throwable -> L12
        L57:
            android.hardware.Camera r1 = r6.zzc     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L12
            android.hardware.Camera r1 = (android.hardware.Camera) r1     // Catch: java.lang.Throwable -> L12
            r1.release()     // Catch: java.lang.Throwable -> L12
            r6.zzc = r2     // Catch: java.lang.Throwable -> L12
        L64:
            java.util.IdentityHashMap<byte[], java.nio.ByteBuffer> r1 = r6.zzo     // Catch: java.lang.Throwable -> L12
            r1.clear()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource.stop():void");
    }

    public void takePicture(@Nullable ShutterCallback shutterCallback, @Nullable PictureCallback pictureCallback) {
        synchronized (this.zzb) {
            try {
                if (this.zzc != null) {
                    zzd zzdVar = new zzd();
                    zzdVar.zza = shutterCallback;
                    zzc zzcVar = new zzc();
                    zzcVar.zza = pictureCallback;
                    this.zzc.takePicture(zzdVar, null, null, zzcVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public class zza implements Runnable {

        @Nullable
        private Detector<?> zza;
        private long zze;

        @Nullable
        private ByteBuffer zzg;
        private long zzb = SystemClock.elapsedRealtime();
        private final Object zzc = new Object();
        private boolean zzd = true;
        private int zzf = 0;

        public zza(Detector<?> detector) {
            this.zza = detector;
        }

        @Override // java.lang.Runnable
        @SuppressLint
        public final void run() {
            boolean z;
            Frame frameBuild;
            ByteBuffer byteBuffer;
            while (true) {
                synchronized (this.zzc) {
                    while (true) {
                        z = this.zzd;
                        if (!z || this.zzg != null) {
                            break;
                        }
                        try {
                            this.zzc.wait();
                        } catch (InterruptedException e) {
                            Log.d("CameraSource", "Frame processing loop terminated.", e);
                            return;
                        }
                    }
                    if (!z) {
                        return;
                    }
                    frameBuild = new Frame.Builder().setImageData((ByteBuffer) Preconditions.checkNotNull(this.zzg), CameraSource.this.zzf.getWidth(), CameraSource.this.zzf.getHeight(), 17).setId(this.zzf).setTimestampMillis(this.zze).setRotation(CameraSource.this.zze).build();
                    byteBuffer = this.zzg;
                    this.zzg = null;
                }
                try {
                    ((Detector) Preconditions.checkNotNull(this.zza)).receiveFrame(frameBuild);
                } catch (Exception e2) {
                    Log.e("CameraSource", "Exception thrown from receiver.", e2);
                } finally {
                    ((Camera) Preconditions.checkNotNull(CameraSource.this.zzc)).addCallbackBuffer(((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).array());
                }
            }
        }

        @SuppressLint
        public final void zza() {
            Detector<?> detector = this.zza;
            if (detector != null) {
                detector.release();
                this.zza = null;
            }
        }

        public final void zza(boolean z) {
            synchronized (this.zzc) {
                this.zzd = z;
                this.zzc.notifyAll();
            }
        }

        public final void zza(byte[] bArr, Camera camera) {
            synchronized (this.zzc) {
                try {
                    ByteBuffer byteBuffer = this.zzg;
                    if (byteBuffer != null) {
                        camera.addCallbackBuffer(byteBuffer.array());
                        this.zzg = null;
                    }
                    if (!CameraSource.this.zzo.containsKey(bArr)) {
                        Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                        return;
                    }
                    this.zze = SystemClock.elapsedRealtime() - this.zzb;
                    this.zzf++;
                    this.zzg = (ByteBuffer) CameraSource.this.zzo.get(bArr);
                    this.zzc.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @RecentlyNonNull
    @RequiresPermission
    public CameraSource start(@RecentlyNonNull SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.zzb) {
            try {
                if (this.zzc != null) {
                    return this;
                }
                Camera cameraZza = zza();
                this.zzc = cameraZza;
                cameraZza.setPreviewDisplay(surfaceHolder);
                this.zzc.startPreview();
                this.zzm = new Thread(this.zzn);
                this.zzn.zza(true);
                Thread thread = this.zzm;
                if (thread != null) {
                    thread.start();
                }
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint
    private final byte[] zza(Size size) {
        byte[] bArr = new byte[((int) Math.ceil(((size.getHeight() * size.getWidth()) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap.hasArray() && byteBufferWrap.array() == bArr) {
            this.zzo.put(bArr, byteBufferWrap);
            return bArr;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }
}
