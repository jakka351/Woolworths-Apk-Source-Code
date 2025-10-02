package io.card.payment;

import YU.a;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.q2;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import io.card.payment.ui.ViewUtil;
import java.io.ByteArrayInputStream;
import java.util.Date;

/* loaded from: classes7.dex */
public final class CardIOActivity extends Activity {
    public static final String EXTRA_CAPTURED_CARD_IMAGE = "io.card.payment.capturedCardImage";
    public static final String EXTRA_GUIDE_COLOR = "io.card.payment.guideColor";
    public static final String EXTRA_HIDE_CARDIO_LOGO = "io.card.payment.hideLogo";
    public static final String EXTRA_KEEP_APPLICATION_THEME = "io.card.payment.keepApplicationTheme";
    public static final String EXTRA_LANGUAGE_OR_LOCALE = "io.card.payment.languageOrLocale";
    public static final String EXTRA_NO_CAMERA = "io.card.payment.noCamera";
    public static final String EXTRA_REQUIRE_CARDHOLDER_NAME = "io.card.payment.requireCardholderName";
    public static final String EXTRA_REQUIRE_CVV = "io.card.payment.requireCVV";
    public static final String EXTRA_REQUIRE_EXPIRY = "io.card.payment.requireExpiry";
    public static final String EXTRA_REQUIRE_POSTAL_CODE = "io.card.payment.requirePostalCode";
    public static final String EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY = "io.card.payment.restrictPostalCodeToNumericOnly";
    public static final String EXTRA_RETURN_CARD_IMAGE = "io.card.payment.returnCardImage";
    public static final String EXTRA_SCAN_EXPIRY = "io.card.payment.scanExpiry";
    public static final String EXTRA_SCAN_INSTRUCTIONS = "io.card.payment.scanInstructions";
    public static final String EXTRA_SCAN_OVERLAY_LAYOUT_ID = "io.card.payment.scanOverlayLayoutId";
    public static final String EXTRA_SCAN_RESULT = "io.card.payment.scanResult";
    public static final String EXTRA_SUPPRESS_CONFIRMATION = "io.card.payment.suppressConfirmation";
    public static final String EXTRA_SUPPRESS_MANUAL_ENTRY = "io.card.payment.suppressManual";
    public static final String EXTRA_SUPPRESS_SCAN = "io.card.payment.suppressScan";
    public static final String EXTRA_UNBLUR_DIGITS = "io.card.payment.unblurDigits";
    public static final String EXTRA_USE_CARDIO_LOGO = "io.card.payment.useCardIOLogo";
    public static final String EXTRA_USE_PAYPAL_ACTIONBAR_ICON = "io.card.payment.intentSenderIsPayPal";
    public static final int RESULT_CARD_INFO = 13274384;
    public static final int RESULT_CONFIRMATION_SUPPRESSED = 13274388;
    public static final int RESULT_ENTRY_CANCELED = 13274385;
    public static final int RESULT_SCAN_NOT_AVAILABLE = 13274386;
    public static final int RESULT_SCAN_SUPPRESSED = 13274387;
    public static int u;
    public OverlayView d;
    public OrientationEventListener e;
    public Preview f;
    public CreditCard g;
    public Rect h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public LinearLayout m;
    public boolean n;
    public RelativeLayout o;
    public FrameLayout p;
    public boolean q;
    public CardScanner r;
    public boolean s = false;
    public static final long[] t = {0, 70, 10, 40};
    public static Bitmap v = null;

    public static boolean canReadCardWithCamera() {
        try {
            return Util.a();
        } catch (CameraUnavailableException unused) {
            return false;
        } catch (RuntimeException unused2) {
            Log.w("CardIOActivity", "RuntimeException accessing Util.hardwareSupported()");
            return false;
        }
    }

    public static Bitmap getCapturedCardImage(Intent intent) {
        if (intent == null || !intent.hasExtra(EXTRA_CAPTURED_CARD_IMAGE)) {
            return null;
        }
        return BitmapFactory.decodeStream(new ByteArrayInputStream(intent.getByteArrayExtra(EXTRA_CAPTURED_CARD_IMAGE)), null, new BitmapFactory.Options());
    }

    public static Date sdkBuildDate() {
        return new Date(BuildConfig.BUILD_TIME);
    }

    public static String sdkVersion() {
        return BuildConfig.PRODUCT_VERSION;
    }

    public final void a() {
        try {
            if (Util.a()) {
                return;
            }
            StringKey stringKey = StringKey.u;
            Log.w("card.io", stringKey + ": " + LocalizedStrings.a(stringKey));
            this.s = true;
        } catch (CameraUnavailableException unused) {
            StringKey stringKey2 = StringKey.v;
            String strA = LocalizedStrings.a(stringKey2);
            Log.e("card.io", stringKey2 + ": " + strA);
            Toast toastMakeText = Toast.makeText(this, strA, 1);
            toastMakeText.setGravity(17, 0, -75);
            toastMakeText.show();
            this.s = true;
        }
    }

    public final void b(int i) {
        CardScanner cardScanner;
        int i2;
        if (i < 0 || (cardScanner = this.r) == null) {
            return;
        }
        int iC = i + cardScanner.c();
        if (iC > 360) {
            iC -= 360;
        }
        if (iC < 15 || iC > 345) {
            this.j = 1;
            i2 = 0;
        } else if (iC > 75 && iC < 105) {
            this.j = 4;
            i2 = 90;
        } else if (iC > 165 && iC < 195) {
            this.j = 2;
            i2 = SubsamplingScaleImageView.ORIENTATION_180;
        } else if (iC <= 255 || iC >= 285) {
            i2 = -1;
        } else {
            this.j = 3;
            i2 = 270;
        }
        if (i2 < 0 || i2 == this.i) {
            return;
        }
        this.r.i = this.j;
        g(i2);
        if (i2 == 90) {
            f(270.0f);
        } else if (i2 == 270) {
            f(90.0f);
        } else {
            f(i2);
        }
    }

    public final void c(Exception exc) {
        String strA = LocalizedStrings.a(StringKey.w);
        Log.e("card.io", "Unknown exception, please post the stack trace as a GitHub issue", exc);
        Toast toastMakeText = Toast.makeText(this, strA, 1);
        toastMakeText.setGravity(17, 0, -75);
        toastMakeText.show();
        this.s = true;
    }

    public final void d() {
        final Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra(EXTRA_SUPPRESS_CONFIRMATION, false)) {
            new Handler().post(new Runnable() { // from class: io.card.payment.CardIOActivity.2
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmapCreateBitmap;
                    CardIOActivity cardIOActivity = CardIOActivity.this;
                    cardIOActivity.getWindow().clearFlags(1024);
                    cardIOActivity.getWindow().addFlags(512);
                    Intent intent2 = new Intent(cardIOActivity, (Class<?>) DataEntryActivity.class);
                    Util.d(intent, intent2, cardIOActivity.d);
                    OverlayView overlayView = cardIOActivity.d;
                    if (overlayView != null) {
                        if (overlayView.f != null) {
                            if (overlayView.h.flipped) {
                                Matrix matrix = new Matrix();
                                matrix.setRotate(180.0f, overlayView.f.getWidth() / 2, overlayView.f.getHeight() / 2);
                                Bitmap bitmap = overlayView.f;
                                overlayView.f = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), overlayView.f.getHeight(), matrix, false);
                            }
                            Canvas canvas = new Canvas(overlayView.f);
                            Paint paint = new Paint();
                            Util.c(paint);
                            paint.setTextSize(overlayView.x * 28.0f);
                            int length = overlayView.h.cardNumber.length();
                            float width = overlayView.f.getWidth() / 428.0f;
                            int i = (int) ((overlayView.h.yoff * width) - 6.0f);
                            for (int i2 = 0; i2 < length; i2++) {
                                canvas.drawText("" + overlayView.h.cardNumber.charAt(i2), (int) (overlayView.h.xoff[i2] * width), i, paint);
                            }
                        }
                        Bitmap bitmap2 = CardIOActivity.v;
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            CardIOActivity.v.recycle();
                        }
                        OverlayView overlayView2 = cardIOActivity.d;
                        Bitmap bitmap3 = overlayView2.f;
                        if (bitmap3 == null || bitmap3.isRecycled()) {
                            bitmapCreateBitmap = null;
                        } else {
                            Bitmap bitmap4 = overlayView2.f;
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmap4, 0, 0, bitmap4.getWidth(), overlayView2.f.getHeight());
                        }
                        CardIOActivity.v = bitmapCreateBitmap;
                    }
                    CreditCard creditCard = cardIOActivity.g;
                    if (creditCard != null) {
                        intent2.putExtra(CardIOActivity.EXTRA_SCAN_RESULT, creditCard);
                        cardIOActivity.g = null;
                    } else {
                        intent2.putExtra("io.card.payment.manualEntryScanResult", true);
                    }
                    intent2.putExtras(cardIOActivity.getIntent());
                    intent2.addFlags(1082195968);
                    cardIOActivity.startActivityForResult(intent2, 10);
                }
            });
            return;
        }
        Intent intent2 = new Intent(this, (Class<?>) DataEntryActivity.class);
        CreditCard creditCard = this.g;
        if (creditCard != null) {
            intent2.putExtra(EXTRA_SCAN_RESULT, creditCard);
            this.g = null;
        }
        Util.d(intent, intent2, this.d);
        setResult(RESULT_CONFIRMATION_SUPPRESSED, intent2);
        v = null;
        finish();
    }

    public final void e(DetectionInfo detectionInfo) {
        OverlayView overlayView = this.d;
        DetectionInfo detectionInfo2 = overlayView.e;
        if (detectionInfo2 != null && (detectionInfo.topEdge != detectionInfo2.topEdge || detectionInfo.bottomEdge != detectionInfo2.bottomEdge || detectionInfo.leftEdge != detectionInfo2.leftEdge || detectionInfo.rightEdge != detectionInfo2.rightEdge)) {
            overlayView.invalidate();
        }
        overlayView.e = detectionInfo;
    }

    public final void f(float f) {
        if (this.m != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, f, r0.getWidth() / 2, this.m.getHeight() / 2);
            rotateAnimation.setDuration(0L);
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setFillAfter(true);
            this.m.setAnimation(rotateAnimation);
        }
    }

    public final void g(int i) {
        Point point;
        SurfaceView surfaceView = this.f.f;
        if (surfaceView == null) {
            Log.wtf("card.io", "surface view is null.. recovering... rotation might be weird.");
            return;
        }
        Rect rectB = this.r.b(surfaceView.getWidth(), surfaceView.getHeight());
        this.h = rectB;
        rectB.top = surfaceView.getTop() + rectB.top;
        Rect rect = this.h;
        rect.bottom = surfaceView.getTop() + rect.bottom;
        OverlayView overlayView = this.d;
        Rect rect2 = this.h;
        float f = overlayView.x;
        overlayView.i = i;
        overlayView.g = rect2;
        overlayView.invalidate();
        if (overlayView.i % SubsamplingScaleImageView.ORIENTATION_180 != 0) {
            point = new Point((int) (40.0f * f), (int) (60.0f * f));
            overlayView.w = -1;
        } else {
            point = new Point((int) (60.0f * f), (int) (40.0f * f));
            overlayView.w = 1;
        }
        if (overlayView.q != null) {
            Rect rect3 = overlayView.q;
            int i2 = (int) (50.0f * f);
            overlayView.t = Util.b(new Point(rect3.left + point.x, rect3.top + point.y), (int) (70.0f * f), i2);
            Rect rect4 = overlayView.q;
            overlayView.u = Util.b(new Point(rect4.right - point.x, rect4.top + point.y), (int) (f * 100.0f), i2);
            GradientDrawable gradientDrawable = new GradientDrawable(OverlayView.y[(overlayView.i / 90) % 4], new int[]{-1, -16777216});
            overlayView.m = gradientDrawable;
            gradientDrawable.setGradientType(0);
            overlayView.m.setBounds(overlayView.g);
            overlayView.m.setAlpha(50);
            Path path = new Path();
            overlayView.p = path;
            path.addRect(new RectF(overlayView.q), Path.Direction.CW);
            overlayView.p.addRect(new RectF(overlayView.g), Path.Direction.CCW);
        }
        this.i = i;
    }

    public Rect getTorchRect() {
        OverlayView overlayView = this.d;
        if (overlayView == null) {
            return null;
        }
        return overlayView.t;
    }

    public final void h(boolean z) {
        if (this.f == null || this.d == null || !this.r.i(z)) {
            return;
        }
        OverlayView overlayView = this.d;
        overlayView.r.f23880a = z;
        overlayView.invalidate();
    }

    public final void i() {
        FrameLayout frameLayout = new FrameLayout(this);
        this.p = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.p.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.setId(1);
        this.r.getClass();
        this.r.getClass();
        Preview preview = new Preview(this, null);
        preview.d = 480;
        preview.e = 640;
        SurfaceView surfaceView = new SurfaceView(this);
        preview.f = surfaceView;
        preview.addView(surfaceView);
        this.f = preview;
        preview.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        frameLayout2.addView(this.f);
        OverlayView overlayView = new OverlayView(this, !Util.f23881a && getPackageManager().hasSystemFeature("android.hardware.camera.flash"));
        this.d = overlayView;
        overlayView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (getIntent() != null) {
            this.d.s.a(getIntent().getBooleanExtra(EXTRA_USE_CARDIO_LOGO, false));
            int intExtra = getIntent().getIntExtra(EXTRA_GUIDE_COLOR, 0);
            if (intExtra != 0) {
                int i = (-16777216) | intExtra;
                if (intExtra != i) {
                    Log.w("card.io", "Removing transparency from provided guide color.");
                }
                this.d.j = i;
            } else {
                this.d.j = -16711936;
            }
            this.d.k = getIntent().getBooleanExtra(EXTRA_HIDE_CARDIO_LOGO, false);
            String stringExtra = getIntent().getStringExtra(EXTRA_SCAN_INSTRUCTIONS);
            if (stringExtra != null) {
                this.d.l = stringExtra;
            }
        }
        frameLayout2.addView(this.d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(2, 2);
        this.p.addView(frameLayout2, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.o = relativeLayout;
        relativeLayout.setGravity(80);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.o.setLayoutParams(layoutParams2);
        this.o.setId(2);
        this.o.setGravity(85);
        if (!this.k) {
            Button button = new Button(this);
            button.setId(3);
            button.setText(LocalizedStrings.a(StringKey.r));
            button.setOnClickListener(new View.OnClickListener() { // from class: io.card.payment.CardIOActivity.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.g(view);
                    try {
                        CardIOActivity cardIOActivity = CardIOActivity.this;
                        String str = CardIOActivity.EXTRA_NO_CAMERA;
                        cardIOActivity.d();
                    } finally {
                        Callback.h();
                    }
                }
            });
            this.o.addView(button);
            ViewUtil.c(button, false, this, this.q);
            if (!this.q) {
                button.setTextSize(14.0f);
            }
            button.setMinimumHeight(ViewUtil.e(this, "42dip"));
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            layoutParams3.addRule(12);
            ViewUtil.b(button, "16dip", null, "16dip", null);
            ViewUtil.a(button, "4dip", "4dip", "4dip", "4dip");
        }
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(12);
        int i2 = (int) ((getResources().getDisplayMetrics().density * 15.0f) + 0.5f);
        layoutParams4.setMargins(0, i2, 0, i2);
        this.p.addView(this.o, layoutParams4);
        if (getIntent() != null) {
            LinearLayout linearLayout = this.m;
            if (linearLayout != null) {
                this.p.removeView(linearLayout);
                this.m = null;
            }
            int intExtra2 = getIntent().getIntExtra(EXTRA_SCAN_OVERLAY_LAYOUT_ID, -1);
            if (intExtra2 != -1) {
                LinearLayout linearLayout2 = new LinearLayout(this);
                this.m = linearLayout2;
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                getLayoutInflater().inflate(intExtra2, this.m);
                this.p.addView(this.m);
            }
        }
        setContentView(this.p);
    }

    public final void j() {
        getWindow().getDecorView().setSystemUiVisibility(4);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        try {
            this.h = new Rect();
            this.j = 1;
            if (!getIntent().getBooleanExtra("io.card.payment.cameraBypassTestMode", false)) {
                this.r = new CardScanner(this, this.j);
            } else {
                if (!getPackageName().contentEquals("io.card.development")) {
                    throw new IllegalStateException("Illegal access of private extra");
                }
                this.r = (CardScanner) Class.forName("io.card.payment.CardScannerTester").getConstructor(CardIOActivity.class, Integer.TYPE).newInstance(this, Integer.valueOf(this.j));
            }
            this.r.g();
            i();
            this.e = new OrientationEventListener(this) { // from class: io.card.payment.CardIOActivity.1
                @Override // android.view.OrientationEventListener
                public final void onOrientationChanged(int i) {
                    String str = CardIOActivity.EXTRA_NO_CAMERA;
                    CardIOActivity.this.b(i);
                }
            };
        } catch (Exception e) {
            c(e);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10) {
            return;
        }
        if (i2 == 0) {
            Log.d("CardIOActivity", "ignoring onActivityResult(RESULT_CANCELED) caused only when Camera Permissions are Denied in Android 23");
            return;
        }
        if (i2 != RESULT_CARD_INFO && i2 != RESULT_ENTRY_CANCELED && !this.s) {
            RelativeLayout relativeLayout = this.o;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                return;
            }
            return;
        }
        if (intent == null || !intent.hasExtra(EXTRA_SCAN_RESULT)) {
            Log.d("CardIOActivity", "no data in EXTRA_SCAN_RESULT");
        } else {
            Log.v("CardIOActivity", "EXTRA_SCAN_RESULT: " + intent.getParcelableExtra(EXTRA_SCAN_RESULT));
        }
        setResult(i2, intent);
        v = null;
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.s) {
            this.d.getClass();
        }
        if (this.r != null) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = u + 1;
        u = i;
        if (i != 1) {
            Log.i("CardIOActivity", String.format("INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!", Integer.valueOf(i)));
        }
        Intent intent = getIntent();
        boolean booleanExtra = getIntent().getBooleanExtra(EXTRA_KEEP_APPLICATION_THEME, false);
        this.q = booleanExtra;
        if (!booleanExtra || getApplicationInfo().theme == 0) {
            setTheme(android.R.style.Theme.Holo.Light);
        } else {
            setTheme(getApplicationInfo().theme);
        }
        LocalizedStrings.f23883a.d(intent.getStringExtra(EXTRA_LANGUAGE_OR_LOCALE));
        this.l = intent.getBooleanExtra(EXTRA_SUPPRESS_SCAN, false);
        ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(intent, 65536);
        boolean z = Util.f23881a;
        String strH = resolveInfoResolveActivity == null ? a.h("Didn't find ", CardIOActivity.class.getName(), " in the AndroidManifest.xml") : (resolveInfoResolveActivity.activityInfo.configChanges & 128) == 128 ? null : CardIOActivity.class.getName().concat(" requires attribute android:configChanges=\"orientation\"");
        if (strH != null) {
            Log.e("card.io", strH);
        }
        if (strH != null) {
            throw new RuntimeException(strH);
        }
        this.k = intent.getBooleanExtra(EXTRA_SUPPRESS_MANUAL_ENTRY, false);
        if (bundle != null) {
            this.n = bundle.getBoolean("io.card.payment.waitingForPermission");
        }
        if (intent.getBooleanExtra("io.card.payment.noCamera", false)) {
            Log.i("card.io", "EXTRA_NO_CAMERA set to true. Skipping camera.");
            this.s = true;
            return;
        }
        if (CardScanner.p || !(CardScanner.nUseNeon() || CardScanner.nUseTegra() || CardScanner.nUseX86())) {
            Log.i("card.io", "Processor not Supported. Skipping camera.");
            this.s = true;
            return;
        }
        try {
            if (this.n) {
                return;
            }
            if (checkSelfPermission("android.permission.CAMERA") == -1) {
                Log.d("CardIOActivity", "permission denied to camera - requesting it");
                this.n = true;
                requestPermissions(new String[]{"android.permission.CAMERA"}, 11);
                return;
            }
            a();
            if (!this.s) {
                j();
            } else if (this.k) {
                Log.i("card.io", "Camera not available and manual entry suppressed.");
                setResult(RESULT_SCAN_NOT_AVAILABLE, null);
                v = null;
                finish();
            }
        } catch (Exception e) {
            c(e);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.d = null;
        u--;
        OrientationEventListener orientationEventListener = this.e;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        h(false);
        CardScanner cardScanner = this.r;
        if (cardScanner != null) {
            cardScanner.a();
            this.r = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        OrientationEventListener orientationEventListener = this.e;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        h(false);
        CardScanner cardScanner = this.r;
        if (cardScanner != null) {
            cardScanner.f();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 11) {
            this.n = false;
            if (iArr.length <= 0 || iArr[0] != 0) {
                this.s = true;
            } else {
                j();
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.n) {
            return;
        }
        if (this.s) {
            d();
            return;
        }
        boolean z = Util.f23881a;
        StringBuilder sb = new StringBuilder("Native memory stats: ");
        sb.append("(free/alloc'd/total)" + Debug.getNativeHeapFreeSize() + q2.c + Debug.getNativeHeapAllocatedSize() + q2.c + Debug.getNativeHeapSize());
        Log.d("MEMORY", sb.toString());
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        getWindow().addFlags(8192);
        setRequestedOrientation(1);
        this.e.enable();
        this.g = null;
        boolean zH = this.r.h(this.f.f.getHolder());
        if (zH) {
            this.o.setVisibility(0);
        }
        if (zH) {
            h(false);
        } else {
            Log.e("CardIOActivity", "Could not connect to camera.");
            String strA = LocalizedStrings.a(StringKey.w);
            androidx.compose.ui.input.pointer.a.v("error display: ", strA, "card.io");
            Toast.makeText(this, strA, 1).show();
            d();
        }
        b(this.i);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("io.card.payment.waitingForPermission", this.n);
    }
}
