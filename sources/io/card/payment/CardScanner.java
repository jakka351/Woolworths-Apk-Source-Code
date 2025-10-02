package io.card.payment;

import YU.a;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import android.os.Vibrator;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
class CardScanner implements Camera.AutoFocusCallback, Camera.PreviewCallback, SurfaceHolder.Callback {
    public static final boolean p;
    public static boolean q;
    public Bitmap d;
    public final WeakReference e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public int i;
    public boolean j = true;
    public long k;
    public long l;
    public Camera m;
    public byte[] n;
    public boolean o;

    static {
        Log.i("card.io", "card.io 5.5.1 03/17/2017 14:23:12 -0400");
        try {
            d("cardioDecider");
            Log.d("card.io", "Loaded card.io decider library.");
            Log.d("card.io", "    nUseNeon(): " + nUseNeon());
            Log.d("card.io", "    nUseTegra():" + nUseTegra());
            Log.d("card.io", "    nUseX86():  " + nUseX86());
            if (nUseNeon() || nUseTegra() || nUseX86()) {
                d("opencv_core");
                Log.d("card.io", "Loaded opencv core library");
                d("opencv_imgproc");
                Log.d("card.io", "Loaded opencv imgproc library");
            }
            if (nUseNeon()) {
                d("cardioRecognizer");
                Log.i("card.io", "Loaded card.io NEON library");
            } else if (nUseX86()) {
                d("cardioRecognizer");
                Log.i("card.io", "Loaded card.io x86 library");
            } else if (nUseTegra()) {
                d("cardioRecognizer_tegra2");
                Log.i("card.io", "Loaded card.io Tegra2 library");
            } else {
                Log.w("card.io", "unsupported processor - card.io scanning requires ARMv7 or x86 architecture");
                p = true;
            }
        } catch (UnsatisfiedLinkError e) {
            Log.e("card.io", "Failed to load native library: " + e.getMessage());
            p = true;
        }
        q = false;
    }

    public CardScanner(CardIOActivity cardIOActivity, int i) {
        boolean z = false;
        this.f = false;
        this.h = -1;
        this.i = 1;
        Intent intent = cardIOActivity.getIntent();
        if (intent != null) {
            this.f = intent.getBooleanExtra(CardIOActivity.EXTRA_SUPPRESS_SCAN, false);
            if (intent.getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, false) && intent.getBooleanExtra(CardIOActivity.EXTRA_SCAN_EXPIRY, true)) {
                z = true;
            }
            this.g = z;
            this.h = intent.getIntExtra(CardIOActivity.EXTRA_UNBLUR_DIGITS, -1);
        }
        this.e = new WeakReference(cardIOActivity);
        this.i = i;
        nSetup(this.f, 6.0f, this.h);
    }

    public static void d(String str) {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e) {
            String strConcat = CardIONativeLibsConfig.f23877a;
            if (strConcat == null || strConcat.length() == 0) {
                throw e;
            }
            String str2 = File.separator;
            if (!str2.equals(Character.valueOf(strConcat.charAt(strConcat.length() - 1)))) {
                strConcat = strConcat.concat(str2);
            }
            StringBuilder sbS = a.s(strConcat);
            sbS.append(Build.CPU_ABI);
            sbS.append(str2);
            sbS.append(System.mapLibraryName(str));
            String string = sbS.toString();
            Log.d("card.io", "loadLibrary failed for library " + str + ". Trying " + string);
            System.load(string);
        }
    }

    private native void nCleanup();

    private native void nGetGuideFrame(int i, int i2, int i3, Rect rect);

    private native int nGetNumFramesScanned();

    private native void nResetAnalytics();

    private native void nScanFrame(byte[] bArr, int i, int i2, int i3, DetectionInfo detectionInfo, Bitmap bitmap, boolean z);

    private native void nSetup(boolean z, float f);

    private native void nSetup(boolean z, float f, int i);

    public static native boolean nUseNeon();

    public static native boolean nUseTegra();

    public static native boolean nUseX86();

    public final void a() {
        if (this.m != null) {
            f();
        }
        nCleanup();
        this.n = null;
    }

    public final Rect b(int i, int i2) {
        int i3 = this.i;
        if (p) {
            return null;
        }
        if (!nUseNeon() && !nUseTegra() && !nUseX86()) {
            return null;
        }
        Rect rect = new Rect();
        nGetGuideFrame(i3, i, i2, rect);
        return rect;
    }

    public final int c() {
        int rotation = ((WindowManager) ((CardIOActivity) this.e.get()).getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return SubsamplingScaleImageView.ORIENTATION_180;
        }
        if (rotation == 3) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        return 0;
    }

    public final void e(SurfaceHolder surfaceHolder) throws IOException {
        this.j = true;
        try {
            this.m.setPreviewDisplay(surfaceHolder);
            try {
                this.m.startPreview();
                this.m.autoFocus(this);
            } catch (RuntimeException e) {
                Log.e("card.io", "startPreview failed on camera. Error: ", e);
            }
        } catch (IOException e2) {
            Log.e("card.io", "can't set preview display", e2);
        }
    }

    public final void f() {
        i(false);
        Camera camera = this.m;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.m.setPreviewDisplay(null);
            } catch (IOException e) {
                Log.w("card.io", "can't stop preview display", e);
            }
            this.m.setPreviewCallback(null);
            this.m.release();
            this.n = null;
            this.m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[LOOP:0: B:5:0x0017->B:44:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r11 = this;
            java.lang.String r0 = "card.io"
            r1 = 1
            r11.j = r1
            r1 = 0
            r11.k = r1
            r11.l = r1
            android.hardware.Camera r1 = r11.m
            java.lang.String r2 = "CardScanner"
            if (r1 != 0) goto Lab
            long r3 = java.lang.System.currentTimeMillis()
            r1 = 5000(0x1388, float:7.006E-42)
        L17:
            r5 = 0
            r6 = 0
            android.hardware.Camera r1 = android.hardware.Camera.open()     // Catch: java.lang.Exception -> L1e java.lang.RuntimeException -> L26
            goto L48
        L1e:
            r1 = move-exception
            java.lang.String r7 = "Unexpected exception. Please report it as a GitHub issue"
            android.util.Log.e(r0, r7, r1)
            r1 = r6
            goto L38
        L26:
            java.lang.String r7 = "Wasn't able to connect to camera service. Waiting and trying again..."
            android.util.Log.w(r0, r7)     // Catch: java.lang.InterruptedException -> L32
            r7 = 50
            long r7 = (long) r7     // Catch: java.lang.InterruptedException -> L32
            java.lang.Thread.sleep(r7)     // Catch: java.lang.InterruptedException -> L32
            goto L38
        L32:
            r7 = move-exception
            java.lang.String r8 = "Interrupted while waiting for camera"
            android.util.Log.e(r0, r8, r7)
        L38:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            long r9 = (long) r1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L17
            java.lang.String r1 = "camera connect timeout"
            android.util.Log.w(r2, r1)
            r1 = r5
        L48:
            r11.m = r1
            if (r1 != 0) goto L52
            java.lang.String r1 = "prepare scanner couldn't connect to camera!"
            android.util.Log.e(r0, r1)
            return
        L52:
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            android.hardware.Camera.getCameraInfo(r6, r2)
            int r3 = r11.c()
            int r2 = r2.orientation
            int r2 = r2 - r3
            int r2 = r2 + 360
            int r2 = r2 % 360
            r1.setDisplayOrientation(r2)
            android.hardware.Camera r1 = r11.m
            android.hardware.Camera$Parameters r1 = r1.getParameters()
            java.util.List r2 = r1.getSupportedPreviewSizes()
            r3 = 480(0x1e0, float:6.73E-43)
            r4 = 640(0x280, float:8.97E-43)
            if (r2 == 0) goto La2
            java.util.Iterator r7 = r2.iterator()
        L7c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L91
            java.lang.Object r8 = r7.next()
            android.hardware.Camera$Size r8 = (android.hardware.Camera.Size) r8
            int r9 = r8.width
            if (r9 != r4) goto L7c
            int r9 = r8.height
            if (r9 != r3) goto L7c
            r5 = r8
        L91:
            if (r5 != 0) goto La2
            java.lang.String r5 = "Didn't find a supported 640x480 resolution, so forcing"
            android.util.Log.w(r0, r5)
            java.lang.Object r0 = r2.get(r6)
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0
            r0.width = r4
            r0.height = r3
        La2:
            r1.setPreviewSize(r4, r3)
            android.hardware.Camera r0 = r11.m
            r0.setParameters(r1)
            goto Lbe
        Lab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "we already have a camera instance: "
            r0.<init>(r1)
            android.hardware.Camera r1 = r11.m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        Lbe:
            android.graphics.Bitmap r0 = r11.d
            if (r0 != 0) goto Lce
            r0 = 270(0x10e, float:3.78E-43)
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = 428(0x1ac, float:6.0E-43)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r0, r1)
            r11.d = r0
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.card.payment.CardScanner.g():void");
    }

    public final boolean h(SurfaceHolder surfaceHolder) {
        if (this.m == null) {
            g();
        }
        Camera camera = this.m;
        if (camera == null) {
            Log.i("CardScanner", "null camera. failure");
            return false;
        }
        if (this.n == null) {
            byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(camera.getParameters().getPreviewFormat()) / 8) * 921600];
            this.n = bArr;
            this.m.addCallbackBuffer(bArr);
        }
        surfaceHolder.addCallback(this);
        surfaceHolder.setType(3);
        this.m.setPreviewCallbackWithBuffer(this);
        if (this.o) {
            e(surfaceHolder);
        }
        i(false);
        System.currentTimeMillis();
        nResetAnalytics();
        return true;
    }

    public final boolean i(boolean z) {
        Camera camera = this.m;
        if (camera == null) {
            return false;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(z ? "torch" : "off");
            this.m.setParameters(parameters);
            return true;
        } catch (RuntimeException e) {
            Log.w("CardScanner", "Could not set flash mode: " + e);
            return false;
        }
    }

    public final void j(boolean z) {
        if (this.l < this.k) {
            return;
        }
        try {
            this.k = System.currentTimeMillis();
            this.m.autoFocus(this);
        } catch (RuntimeException e) {
            Log.w("CardScanner", "could not trigger auto focus: " + e);
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        this.l = System.currentTimeMillis();
    }

    public void onEdgeUpdate(DetectionInfo detectionInfo) {
        ((CardIOActivity) this.e.get()).e(detectionInfo);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        float f;
        float f2;
        int i;
        if (bArr == null) {
            Log.w("CardScanner", "frame is null! skipping");
            return;
        }
        if (q) {
            Log.e("CardScanner", "processing in progress.... dropping frame");
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
                return;
            }
            return;
        }
        q = true;
        boolean z = this.j;
        WeakReference weakReference = this.e;
        if (z) {
            this.j = false;
            this.i = 1;
            CardIOActivity cardIOActivity = (CardIOActivity) weakReference.get();
            SurfaceView surfaceView = cardIOActivity.f.f;
            OverlayView overlayView = cardIOActivity.d;
            if (overlayView != null) {
                overlayView.q = new Rect(surfaceView.getLeft(), surfaceView.getTop(), surfaceView.getRight(), surfaceView.getBottom());
            }
            cardIOActivity.j = 1;
            cardIOActivity.g(0);
            if (1 != cardIOActivity.j) {
                Log.wtf("card.io", "the orientation of the scanner doesn't match the orientation of the activity");
            }
            cardIOActivity.e(new DetectionInfo());
        }
        DetectionInfo detectionInfo = new DetectionInfo();
        nScanFrame(bArr, 640, 480, this.i, detectionInfo, this.d, this.g);
        if (detectionInfo.focusScore < 6.0f) {
            j(false);
        } else if (detectionInfo.complete || (this.f && detectionInfo.topEdge && detectionInfo.bottomEdge && detectionInfo.rightEdge && detectionInfo.leftEdge)) {
            CardIOActivity cardIOActivity2 = (CardIOActivity) weakReference.get();
            Bitmap bitmap = this.d;
            cardIOActivity2.getClass();
            try {
                ((Vibrator) cardIOActivity2.getSystemService("vibrator")).vibrate(CardIOActivity.t, -1);
            } catch (SecurityException unused) {
                Log.e("card.io", "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.");
            } catch (Exception e) {
                Log.w("card.io", "Exception while attempting to vibrate: ", e);
            }
            cardIOActivity2.r.f();
            cardIOActivity2.o.setVisibility(4);
            if (detectionInfo.complete) {
                String str = new String();
                for (int i2 = 0; i2 < 16 && (i = detectionInfo.prediction[i2]) >= 0 && i < 10; i2++) {
                    StringBuilder sbS = a.s(str);
                    sbS.append(String.valueOf(detectionInfo.prediction[i2]));
                    str = sbS.toString();
                }
                CreditCard creditCard = detectionInfo.detectedCard;
                creditCard.cardNumber = str;
                creditCard.expiryMonth = detectionInfo.expiry_month;
                creditCard.expiryYear = detectionInfo.expiry_year;
                cardIOActivity2.g = creditCard;
                cardIOActivity2.d.h = creditCard;
            }
            int i3 = cardIOActivity2.j;
            if (i3 == 1 || i3 == 2) {
                f = cardIOActivity2.h.right / 428.0f;
                f2 = 0.95f;
            } else {
                f = cardIOActivity2.h.right / 428.0f;
                f2 = 1.15f;
            }
            float f3 = f * f2;
            Matrix matrix = new Matrix();
            matrix.postScale(f3, f3);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            OverlayView overlayView2 = cardIOActivity2.d;
            Bitmap bitmap2 = overlayView2.f;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            overlayView2.f = bitmapCreateBitmap;
            if (bitmapCreateBitmap != null) {
                RectF rectF = new RectF(2.0f, 2.0f, overlayView2.f.getWidth() - 2, overlayView2.f.getHeight() - 2);
                float height = overlayView2.f.getHeight() * 0.06666667f;
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(overlayView2.f.getWidth(), overlayView2.f.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                canvas.drawColor(0);
                Paint paint = new Paint(1);
                paint.setColor(-16777216);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawRoundRect(rectF, height, height, paint);
                Paint paint2 = new Paint();
                paint2.setFilterBitmap(false);
                Canvas canvas2 = new Canvas(overlayView2.f);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                canvas2.drawBitmap(bitmapCreateBitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint2);
                paint2.setXfermode(null);
                bitmapCreateBitmap2.recycle();
            }
            if (cardIOActivity2.l) {
                Intent intent = new Intent();
                Util.d(cardIOActivity2.getIntent(), intent, cardIOActivity2.d);
                cardIOActivity2.setResult(CardIOActivity.RESULT_SCAN_SUPPRESSED, intent);
                CardIOActivity.v = null;
                cardIOActivity2.finish();
            } else {
                cardIOActivity2.d();
            }
        }
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
        q = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.d("CardScanner", String.format("Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )", Boolean.valueOf(surfaceHolder != null), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) throws IOException {
        if (this.m == null) {
            Log.wtf("card.io", "CardScanner.surfaceCreated() - camera is null!");
        } else {
            this.o = true;
            e(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Camera camera = this.m;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception e) {
                Log.e("card.io", "error stopping camera", e);
            }
        }
        this.o = false;
    }
}
