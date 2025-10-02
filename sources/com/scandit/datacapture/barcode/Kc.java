package com.scandit.datacapture.barcode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.ScrollViewSwipeListenerParent;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewCameraSwitchButton;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewTargetModeButton;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningModeKt;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Kc extends ScrollViewSwipeListenerParent {
    private Zc h;
    private Function1 i;
    private SparkScanViewUISettings j;
    private SparkScanStateManager k;
    private ImageButton l;
    private ImageButton m;
    private ImageButton n;
    private ImageButton o;
    private ImageButton p;
    private SparkScanViewTargetModeButton q;
    private ImageButton r;
    private ImageButton s;
    private SparkScanViewCameraSwitchButton t;
    private View u;
    private View v;
    private View w;

    public /* synthetic */ Kc(Context context) {
        this(context, null, 0);
    }

    private static final void b(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).N();
        }
    }

    private static final void c(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).z();
        }
    }

    private static final void e(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).B();
        }
    }

    private static final void f(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).C();
        }
    }

    private static final void g(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).F();
        }
    }

    private static final void h(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).M();
        }
    }

    private static final void i(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m275x22404b7d(Zc zc, View view) {
        Callback.g(view);
        try {
            a(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$1$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m276x42d195be(Zc zc, View view) {
        Callback.g(view);
        try {
            f(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$2$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m277x6362dfff(Zc zc, View view) {
        Callback.g(view);
        try {
            g(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$3$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m278x83f42a40(Zc zc, View view) {
        Callback.g(view);
        try {
            h(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$4$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m279xa4857481(Zc zc, View view) {
        Callback.g(view);
        try {
            i(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$5$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m280xc516bec2(Zc zc, View view) {
        Callback.g(view);
        try {
            b(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$6$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m281xe5a80903(Zc zc, View view) {
        Callback.g(view);
        try {
            c(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$7$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m282x6395344(Zc zc, View view) {
        Callback.g(view);
        try {
            d(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$8$a$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-SparkScanViewUISettings-Lcom-scandit-datacapture-barcode-Zc-Lcom-scandit-datacapture-barcode-internal-module-spark-data-SparkScanStateManager-Lcom-scandit-datacapture-barcode-spark-ui-SparkScanViewSettings--V, reason: not valid java name */
    public static /* synthetic */ void m283x26ca9d85(Zc zc, View view) {
        Callback.g(view);
        try {
            e(zc, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        View.inflate(context, R.layout.sc_spark_scan_view_button_triggers_layout, this);
        setId(Gc.x());
    }

    public static final void b(Kc kc) {
        int i;
        ImageButton imageButton = kc.r;
        if (imageButton != null) {
            SparkScanViewUISettings sparkScanViewUISettings = kc.j;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zA = sparkScanViewUISettings.a();
            if (zA) {
                i = 0;
            } else {
                if (zA) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 8;
            }
            imageButton.setVisibility(i);
        }
        kc.g();
    }

    public static final void c(Kc kc) {
        int i;
        ImageButton imageButton = kc.s;
        if (imageButton != null) {
            SparkScanViewUISettings sparkScanViewUISettings = kc.j;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zB = sparkScanViewUISettings.b();
            if (zB) {
                i = 0;
            } else {
                if (zB) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 8;
            }
            imageButton.setVisibility(i);
        }
        kc.g();
    }

    private static final void d(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).A();
        }
    }

    public static final void e(Kc kc) {
        int i;
        ImageButton imageButton = kc.n;
        if (imageButton != null) {
            SparkScanViewUISettings sparkScanViewUISettings = kc.j;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zH = sparkScanViewUISettings.h();
            if (zH) {
                i = 0;
            } else {
                if (zH) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 8;
            }
            imageButton.setVisibility(i);
        }
        kc.f();
        kc.g();
    }

    public static final void f(Kc kc) {
        int i;
        ImageButton imageButton = kc.m;
        if (imageButton != null) {
            SparkScanViewUISettings sparkScanViewUISettings = kc.j;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zJ = sparkScanViewUISettings.j();
            if (zJ) {
                i = 0;
            } else {
                if (zJ) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 8;
            }
            imageButton.setVisibility(i);
        }
        kc.f();
        kc.g();
    }

    public static final void g(Kc kc) {
        int i;
        ImageButton imageButton = kc.o;
        if (imageButton != null) {
            SparkScanViewUISettings sparkScanViewUISettings = kc.j;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zM = sparkScanViewUISettings.m();
            if (zM) {
                i = 0;
            } else {
                if (zM) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 8;
            }
            imageButton.setVisibility(i);
        }
        kc.f();
        kc.g();
    }

    public static final void h(Kc kc) {
        int i;
        SparkScanViewTargetModeButton sparkScanViewTargetModeButton = kc.q;
        if (sparkScanViewTargetModeButton != null) {
            SparkScanViewUISettings sparkScanViewUISettings = kc.j;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zP = sparkScanViewUISettings.p();
            if (zP) {
                i = 0;
            } else {
                if (zP) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 8;
            }
            sparkScanViewTargetModeButton.setVisibility(i);
        }
        kc.f();
        kc.g();
    }

    public final void a(SparkScanViewUISettings settings, final Zc zc, SparkScanStateManager stateManager, SparkScanViewSettings viewSettings) {
        int i;
        int iIntValue;
        int i2;
        int iIntValue2;
        int i3;
        int iIntValue3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.h(settings, "settings");
        Intrinsics.h(stateManager, "stateManager");
        Intrinsics.h(viewSettings, "viewSettings");
        this.h = zc;
        this.j = settings;
        this.k = stateManager;
        int i8 = Hc.f17185a[stateManager.c().ordinal()];
        if (i8 == 1) {
            i = R.drawable.sc_spark_scan_button_toolbar_background_right;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.sc_spark_scan_button_toolbar_background_left;
        }
        setBackgroundResource(i);
        SparkScanViewUISettings sparkScanViewUISettings = this.j;
        if (sparkScanViewUISettings == null) {
            Intrinsics.p("settings");
            throw null;
        }
        Integer numQ = sparkScanViewUISettings.q();
        if (numQ != null) {
            iIntValue = numQ.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarBackgroundColor = NativeSparkScanViewDefaults.defaultToolbarBackgroundColor();
            Intrinsics.g(nativeColorDefaultToolbarBackgroundColor, "defaultToolbarBackgroundColor()");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarBackgroundColor);
        }
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(iIntValue));
        }
        SparkScanViewTargetModeButton sparkScanViewTargetModeButton = (SparkScanViewTargetModeButton) findViewById(R.id.spark_scan_target_mode_button);
        if (sparkScanViewTargetModeButton != null) {
            sparkScanViewTargetModeButton.setImageTintList(c());
            final int i9 = 0;
            sparkScanViewTargetModeButton.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
            SparkScanScanningMode scanningMode = stateManager.m();
            Intrinsics.h(scanningMode, "scanningMode");
            sparkScanViewTargetModeButton.setSelected(scanningMode instanceof SparkScanScanningMode.Target);
        } else {
            sparkScanViewTargetModeButton = null;
        }
        this.q = sparkScanViewTargetModeButton;
        int i10 = 8;
        if (sparkScanViewTargetModeButton != null) {
            SparkScanViewUISettings sparkScanViewUISettings2 = this.j;
            if (sparkScanViewUISettings2 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zP = sparkScanViewUISettings2.p();
            if (zP) {
                i7 = 0;
            } else {
                if (zP) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 = 8;
            }
            sparkScanViewTargetModeButton.setVisibility(i7);
        }
        f();
        g();
        ImageButton imageButton = (ImageButton) findViewById(R.id.spark_capture_trigger_flash_button);
        if (imageButton != null) {
            imageButton.setImageTintList(c());
            final int i11 = 1;
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
            imageButton.setSelected(stateManager.r() == TorchState.ON);
        } else {
            imageButton = null;
        }
        this.l = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.spark_capture_trigger_hand_mode_button);
        if (imageButton2 != null) {
            imageButton2.setImageTintList(c());
            final int i12 = 2;
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
            imageButton2.setSelected(stateManager.c() == SparkScanViewHandMode.LEFT);
        } else {
            imageButton2 = null;
        }
        this.p = imageButton2;
        d();
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.spark_capture_trigger_continuous_mode_button);
        if (imageButton3 != null) {
            imageButton3.setImageTintList(c());
            final int i13 = 3;
            imageButton3.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
            imageButton3.setSelected(SparkScanScanningModeKt.getScanningBehavior(stateManager.m()) == SparkScanScanningBehavior.CONTINUOUS);
        } else {
            imageButton3 = null;
        }
        this.m = imageButton3;
        if (imageButton3 != null) {
            SparkScanViewUISettings sparkScanViewUISettings3 = this.j;
            if (sparkScanViewUISettings3 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zJ = sparkScanViewUISettings3.j();
            if (zJ) {
                i6 = 0;
            } else {
                if (zJ) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = 8;
            }
            imageButton3.setVisibility(i6);
        }
        f();
        g();
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.spark_scan_haptic_enabled_button);
        if (imageButton4 != null) {
            imageButton4.setImageTintList(c());
            final int i14 = 4;
            imageButton4.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
            imageButton4.setSelected(stateManager.f());
        } else {
            imageButton4 = null;
        }
        this.n = imageButton4;
        if (imageButton4 != null) {
            SparkScanViewUISettings sparkScanViewUISettings4 = this.j;
            if (sparkScanViewUISettings4 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zH = sparkScanViewUISettings4.h();
            if (zH) {
                i5 = 0;
            } else {
                if (zH) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 8;
            }
            imageButton4.setVisibility(i5);
        }
        f();
        g();
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.spark_scan_audio_enabled_button);
        if (imageButton5 != null) {
            imageButton5.setImageTintList(c());
            final int i15 = 5;
            imageButton5.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
            imageButton5.setSelected(stateManager.p());
        } else {
            imageButton5 = null;
        }
        this.o = imageButton5;
        if (imageButton5 != null) {
            SparkScanViewUISettings sparkScanViewUISettings5 = this.j;
            if (sparkScanViewUISettings5 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zM = sparkScanViewUISettings5.m();
            if (zM) {
                i4 = 0;
            } else {
                if (zM) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = 8;
            }
            imageButton5.setVisibility(i4);
        }
        f();
        g();
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.spark_scan_barcode_count_button);
        if (imageButton6 != null) {
            SparkScanViewUISettings sparkScanViewUISettings6 = this.j;
            if (sparkScanViewUISettings6 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            Integer numS = sparkScanViewUISettings6.s();
            if (numS != null) {
                iIntValue3 = numS.intValue();
            } else {
                NativeColor nativeColorDefaultToolbarIconInactiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconInactiveTintColor();
                Intrinsics.g(nativeColorDefaultToolbarIconInactiveTintColor, "defaultToolbarIconInactiveTintColor()");
                iIntValue3 = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconInactiveTintColor);
            }
            Pair pairS0 = ArraysKt.s0(new Pair[]{new Pair(new int[0], Integer.valueOf(iIntValue3))});
            imageButton6.setImageTintList(new ColorStateList((int[][]) ((List) pairS0.d).toArray(new int[0][]), CollectionsKt.F0((List) pairS0.e)));
            final int i16 = 6;
            imageButton6.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
        } else {
            imageButton6 = null;
        }
        this.r = imageButton6;
        if (imageButton6 != null) {
            SparkScanViewUISettings sparkScanViewUISettings7 = this.j;
            if (sparkScanViewUISettings7 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zA = sparkScanViewUISettings7.a();
            if (zA) {
                i3 = 0;
            } else {
                if (zA) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 8;
            }
            imageButton6.setVisibility(i3);
        }
        g();
        ImageButton imageButton7 = (ImageButton) findViewById(R.id.spark_scan_barcode_find_button);
        if (imageButton7 != null) {
            SparkScanViewUISettings sparkScanViewUISettings8 = this.j;
            if (sparkScanViewUISettings8 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            Integer numS2 = sparkScanViewUISettings8.s();
            if (numS2 != null) {
                iIntValue2 = numS2.intValue();
            } else {
                NativeColor nativeColorDefaultToolbarIconInactiveTintColor2 = NativeSparkScanViewDefaults.defaultToolbarIconInactiveTintColor();
                Intrinsics.g(nativeColorDefaultToolbarIconInactiveTintColor2, "defaultToolbarIconInactiveTintColor()");
                iIntValue2 = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconInactiveTintColor2);
            }
            Pair pairS02 = ArraysKt.s0(new Pair[]{new Pair(new int[0], Integer.valueOf(iIntValue2))});
            imageButton7.setImageTintList(new ColorStateList((int[][]) ((List) pairS02.d).toArray(new int[0][]), CollectionsKt.F0((List) pairS02.e)));
            final int i17 = 7;
            imageButton7.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
        } else {
            imageButton7 = null;
        }
        this.s = imageButton7;
        if (imageButton7 != null) {
            SparkScanViewUISettings sparkScanViewUISettings9 = this.j;
            if (sparkScanViewUISettings9 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zB = sparkScanViewUISettings9.b();
            if (zB) {
                i2 = 0;
            } else {
                if (zB) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 8;
            }
            imageButton7.setVisibility(i2);
        }
        g();
        SparkScanViewCameraSwitchButton sparkScanViewCameraSwitchButton = (SparkScanViewCameraSwitchButton) findViewById(R.id.spark_scan_camera_button);
        if (sparkScanViewCameraSwitchButton != null) {
            sparkScanViewCameraSwitchButton.setImageTintList(c());
            final int i18 = 8;
            sparkScanViewCameraSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            Kc.m275x22404b7d(zc, view);
                            break;
                        case 1:
                            Kc.m276x42d195be(zc, view);
                            break;
                        case 2:
                            Kc.m277x6362dfff(zc, view);
                            break;
                        case 3:
                            Kc.m278x83f42a40(zc, view);
                            break;
                        case 4:
                            Kc.m279xa4857481(zc, view);
                            break;
                        case 5:
                            Kc.m280xc516bec2(zc, view);
                            break;
                        case 6:
                            Kc.m281xe5a80903(zc, view);
                            break;
                        case 7:
                            Kc.m282x6395344(zc, view);
                            break;
                        default:
                            Kc.m283x26ca9d85(zc, view);
                            break;
                    }
                }
            });
            CameraPosition cameraPosition = stateManager.a();
            Intrinsics.h(cameraPosition, "cameraPosition");
            sparkScanViewCameraSwitchButton.setSelected(cameraPosition == CameraPosition.USER_FACING);
            sparkScanViewCameraSwitchButton.setImageResource(AbstractC0576cc.f17465a[cameraPosition.ordinal()] == 1 ? R.drawable.sc_ic_spark_scan_camera_secondary : R.drawable.sc_ic_spark_scan_camera_primary);
        } else {
            sparkScanViewCameraSwitchButton = null;
        }
        this.t = sparkScanViewCameraSwitchButton;
        if (sparkScanViewCameraSwitchButton != null) {
            SparkScanViewUISettings sparkScanViewUISettings10 = this.j;
            if (sparkScanViewUISettings10 == null) {
                Intrinsics.p("settings");
                throw null;
            }
            boolean zC = sparkScanViewUISettings10.c();
            if (zC) {
                i10 = 0;
            } else if (zC) {
                throw new NoWhenBranchMatchedException();
            }
            sparkScanViewCameraSwitchButton.setVisibility(i10);
        }
        f();
        g();
        this.w = findViewById(R.id.trigger_gradient_top);
        this.v = findViewById(R.id.trigger_gradient_bottom);
        this.u = findViewById(R.id.external_button_separator);
        Ic ic = new Ic(settings, this);
        this.i = ic;
        settings.l().add(ic);
        e();
        a(new Jc(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r5 = this;
            android.widget.ImageButton r0 = r5.p
            if (r0 != 0) goto L5
            goto L2f
        L5:
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r5.j
            r2 = 0
            if (r1 == 0) goto L3c
            boolean r1 = r1.g()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L24
            com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager r1 = r5.k
            if (r1 == 0) goto L1e
            boolean r1 = r1.v()
            if (r1 == 0) goto L24
            r1 = r4
            goto L25
        L1e:
            java.lang.String r0 = "stateManager"
            kotlin.jvm.internal.Intrinsics.p(r0)
            throw r2
        L24:
            r1 = r3
        L25:
            if (r1 != r4) goto L28
            goto L2c
        L28:
            if (r1 != 0) goto L36
            r3 = 8
        L2c:
            r0.setVisibility(r3)
        L2f:
            r5.f()
            r5.g()
            return
        L36:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L3c:
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.Intrinsics.p(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.Kc.d():void");
    }

    private final ColorStateList c() {
        int iIntValue;
        int iIntValue2;
        SparkScanViewUISettings sparkScanViewUISettings = this.j;
        if (sparkScanViewUISettings != null) {
            Integer numR = sparkScanViewUISettings.r();
            if (numR != null) {
                iIntValue = numR.intValue();
            } else {
                NativeColor nativeColorDefaultToolbarIconActiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconActiveTintColor();
                Intrinsics.g(nativeColorDefaultToolbarIconActiveTintColor, "defaultToolbarIconActiveTintColor()");
                iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconActiveTintColor);
            }
            SparkScanViewUISettings sparkScanViewUISettings2 = this.j;
            if (sparkScanViewUISettings2 != null) {
                Integer numS = sparkScanViewUISettings2.s();
                if (numS != null) {
                    iIntValue2 = numS.intValue();
                } else {
                    NativeColor nativeColorDefaultToolbarIconInactiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconInactiveTintColor();
                    Intrinsics.g(nativeColorDefaultToolbarIconInactiveTintColor, "defaultToolbarIconInactiveTintColor()");
                    iIntValue2 = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconInactiveTintColor);
                }
                Pair pairS0 = ArraysKt.s0(new Pair[]{new Pair(new int[]{android.R.attr.state_selected, android.R.attr.state_pressed}, Integer.valueOf(Color.argb(Math.max(0, Color.alpha(iIntValue) - 51), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)))), new Pair(new int[]{android.R.attr.state_pressed}, Integer.valueOf(Color.argb(Math.max(0, Color.alpha(iIntValue2) - 51), Color.red(iIntValue2), Color.green(iIntValue2), Color.blue(iIntValue2)))), new Pair(new int[]{android.R.attr.state_selected}, Integer.valueOf(iIntValue)), new Pair(new int[0], Integer.valueOf(iIntValue2))});
                return new ColorStateList((int[][]) ((List) pairS0.d).toArray(new int[0][]), CollectionsKt.F0((List) pairS0.e));
            }
            Intrinsics.p("settings");
            throw null;
        }
        Intrinsics.p("settings");
        throw null;
    }

    public final void b() {
        SparkScanViewUISettings sparkScanViewUISettings = this.j;
        if (sparkScanViewUISettings != null) {
            sparkScanViewUISettings.l().remove(this.i);
            this.i = null;
        } else {
            Intrinsics.p("settings");
            throw null;
        }
    }

    private final void e() {
        int i;
        int i2;
        SparkScanStateManager sparkScanStateManager = this.k;
        if (sparkScanStateManager != null) {
            SparkScanViewHandMode sparkScanViewHandModeC = sparkScanStateManager.c();
            View view = this.v;
            if (view != null) {
                if (sparkScanViewHandModeC == SparkScanViewHandMode.RIGHT) {
                    i2 = R.drawable.sc_spark_scan_view_button_triggers_gradient_right;
                } else if (sparkScanViewHandModeC == SparkScanViewHandMode.LEFT) {
                    i2 = R.drawable.sc_spark_scan_view_button_triggers_gradient_left;
                } else {
                    i2 = R.drawable.sc_spark_scan_view_button_triggers_gradient_left_top;
                }
                view.setBackgroundResource(i2);
            }
            View view2 = this.w;
            if (view2 != null) {
                if (sparkScanViewHandModeC == SparkScanViewHandMode.RIGHT) {
                    i = R.drawable.sc_spark_scan_view_button_triggers_gradient_right_top;
                } else {
                    i = R.drawable.sc_spark_scan_view_button_triggers_gradient_left_top;
                }
                view2.setBackgroundResource(i);
            }
            f();
            g();
            ScrollView scrollView = (ScrollView) findViewById(R.id.toolbar_scroll_view);
            if (scrollView != null) {
                scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.scandit.datacapture.barcode.gf
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view3, int i3, int i4, int i5, int i6) {
                        Kc.a(this.f17690a, view3, i3, i4, i5, i6);
                    }
                });
                return;
            }
            return;
        }
        Intrinsics.p("stateManager");
        throw null;
    }

    private final void f() {
        View view;
        SparkScanViewUISettings sparkScanViewUISettings = this.j;
        if (sparkScanViewUISettings == null) {
            Intrinsics.p("settings");
            throw null;
        }
        if (AbstractC0784pd.a(sparkScanViewUISettings) <= 3 || (view = this.v) == null) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            r4 = this;
            android.view.View r0 = r4.u
            if (r0 != 0) goto L5
            return
        L5:
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r4.j
            r2 = 0
            java.lang.String r3 = "settings"
            if (r1 == 0) goto L7e
            boolean r1 = r1.a()
            if (r1 != 0) goto L21
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r4.j
            if (r1 == 0) goto L1d
            boolean r1 = r1.b()
            if (r1 == 0) goto L5e
            goto L21
        L1d:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L21:
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r4.j
            if (r1 == 0) goto L7a
            boolean r1 = r1.p()
            if (r1 != 0) goto L75
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r4.j
            if (r1 == 0) goto L71
            boolean r1 = r1.j()
            if (r1 != 0) goto L75
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r4.j
            if (r1 == 0) goto L6d
            boolean r1 = r1.g()
            if (r1 != 0) goto L75
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r4.j
            if (r1 == 0) goto L69
            boolean r1 = r1.h()
            if (r1 != 0) goto L75
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r4.j
            if (r1 == 0) goto L65
            boolean r1 = r1.m()
            if (r1 != 0) goto L75
            com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r1 = r4.j
            if (r1 == 0) goto L61
            boolean r1 = r1.t()
            if (r1 == 0) goto L5e
            goto L75
        L5e:
            r1 = 8
            goto L76
        L61:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L65:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L69:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L6d:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L71:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L75:
            r1 = 0
        L76:
            r0.setVisibility(r1)
            return
        L7a:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L7e:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.Kc.g():void");
    }

    public final void h() {
        int i;
        int i2;
        int iIntValue;
        int i3;
        int i4;
        int i5;
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            SparkScanStateManager sparkScanStateManager = this.k;
            if (sparkScanStateManager == null) {
                Intrinsics.p("stateManager");
                throw null;
            }
            imageButton.setSelected(sparkScanStateManager.r() == TorchState.ON);
        }
        ImageButton imageButton2 = this.m;
        if (imageButton2 != null) {
            SparkScanStateManager sparkScanStateManager2 = this.k;
            if (sparkScanStateManager2 != null) {
                imageButton2.setSelected(SparkScanScanningModeKt.getScanningBehavior(sparkScanStateManager2.m()) == SparkScanScanningBehavior.CONTINUOUS);
            } else {
                Intrinsics.p("stateManager");
                throw null;
            }
        }
        SparkScanViewTargetModeButton sparkScanViewTargetModeButton = this.q;
        if (sparkScanViewTargetModeButton != null) {
            SparkScanStateManager sparkScanStateManager3 = this.k;
            if (sparkScanStateManager3 != null) {
                SparkScanScanningMode scanningMode = sparkScanStateManager3.m();
                Intrinsics.h(scanningMode, "scanningMode");
                sparkScanViewTargetModeButton.setSelected(scanningMode instanceof SparkScanScanningMode.Target);
            } else {
                Intrinsics.p("stateManager");
                throw null;
            }
        }
        ImageButton imageButton3 = this.n;
        if (imageButton3 != null) {
            SparkScanStateManager sparkScanStateManager4 = this.k;
            if (sparkScanStateManager4 == null) {
                Intrinsics.p("stateManager");
                throw null;
            }
            imageButton3.setSelected(sparkScanStateManager4.f());
        }
        ImageButton imageButton4 = this.o;
        if (imageButton4 != null) {
            SparkScanStateManager sparkScanStateManager5 = this.k;
            if (sparkScanStateManager5 == null) {
                Intrinsics.p("stateManager");
                throw null;
            }
            imageButton4.setSelected(sparkScanStateManager5.p());
        }
        ImageButton imageButton5 = this.p;
        if (imageButton5 != null) {
            SparkScanStateManager sparkScanStateManager6 = this.k;
            if (sparkScanStateManager6 == null) {
                Intrinsics.p("stateManager");
                throw null;
            }
            imageButton5.setSelected(sparkScanStateManager6.c() == SparkScanViewHandMode.LEFT);
        }
        SparkScanViewCameraSwitchButton sparkScanViewCameraSwitchButton = this.t;
        if (sparkScanViewCameraSwitchButton != null) {
            SparkScanStateManager sparkScanStateManager7 = this.k;
            if (sparkScanStateManager7 != null) {
                CameraPosition cameraPosition = sparkScanStateManager7.a();
                Intrinsics.h(cameraPosition, "cameraPosition");
                sparkScanViewCameraSwitchButton.setSelected(cameraPosition == CameraPosition.USER_FACING);
                if (AbstractC0576cc.f17465a[cameraPosition.ordinal()] == 1) {
                    i5 = R.drawable.sc_ic_spark_scan_camera_secondary;
                } else {
                    i5 = R.drawable.sc_ic_spark_scan_camera_primary;
                }
                sparkScanViewCameraSwitchButton.setImageResource(i5);
            } else {
                Intrinsics.p("stateManager");
                throw null;
            }
        }
        d();
        SparkScanStateManager sparkScanStateManager8 = this.k;
        if (sparkScanStateManager8 != null) {
            SparkScanViewHandMode sparkScanViewHandModeC = sparkScanStateManager8.c();
            int[] iArr = Hc.f17185a;
            int i6 = iArr[sparkScanViewHandModeC.ordinal()];
            if (i6 == 1) {
                i = R.drawable.sc_spark_scan_button_toolbar_background_right;
            } else if (i6 == 2) {
                i = R.drawable.sc_spark_scan_button_toolbar_background_left;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            setBackgroundResource(i);
            SparkScanStateManager sparkScanStateManager9 = this.k;
            if (sparkScanStateManager9 != null) {
                SparkScanViewHandMode sparkScanViewHandModeC2 = sparkScanStateManager9.c();
                View view = this.v;
                if (view != null) {
                    if (sparkScanViewHandModeC2 == SparkScanViewHandMode.RIGHT) {
                        i4 = R.drawable.sc_spark_scan_view_button_triggers_gradient_right;
                    } else if (sparkScanViewHandModeC2 == SparkScanViewHandMode.LEFT) {
                        i4 = R.drawable.sc_spark_scan_view_button_triggers_gradient_left;
                    } else {
                        i4 = R.drawable.sc_spark_scan_view_button_triggers_gradient_left_top;
                    }
                    view.setBackgroundResource(i4);
                }
                View view2 = this.w;
                if (view2 != null) {
                    if (sparkScanViewHandModeC2 == SparkScanViewHandMode.RIGHT) {
                        i3 = R.drawable.sc_spark_scan_view_button_triggers_gradient_right_top;
                    } else {
                        i3 = R.drawable.sc_spark_scan_view_button_triggers_gradient_left_top;
                    }
                    view2.setBackgroundResource(i3);
                }
                SparkScanStateManager sparkScanStateManager10 = this.k;
                if (sparkScanStateManager10 != null) {
                    int i7 = iArr[sparkScanStateManager10.c().ordinal()];
                    if (i7 == 1) {
                        i2 = R.drawable.sc_spark_scan_button_toolbar_background_right;
                    } else if (i7 == 2) {
                        i2 = R.drawable.sc_spark_scan_button_toolbar_background_left;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    setBackgroundResource(i2);
                    SparkScanViewUISettings sparkScanViewUISettings = this.j;
                    if (sparkScanViewUISettings != null) {
                        Integer numQ = sparkScanViewUISettings.q();
                        if (numQ != null) {
                            iIntValue = numQ.intValue();
                        } else {
                            NativeColor nativeColorDefaultToolbarBackgroundColor = NativeSparkScanViewDefaults.defaultToolbarBackgroundColor();
                            Intrinsics.g(nativeColorDefaultToolbarBackgroundColor, "defaultToolbarBackgroundColor()");
                            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarBackgroundColor);
                        }
                        Drawable background = getBackground();
                        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                        if (gradientDrawable == null) {
                            return;
                        }
                        gradientDrawable.setColor(ColorStateList.valueOf(iIntValue));
                        return;
                    }
                    Intrinsics.p("settings");
                    throw null;
                }
                Intrinsics.p("stateManager");
                throw null;
            }
            Intrinsics.p("stateManager");
            throw null;
        }
        Intrinsics.p("stateManager");
        throw null;
    }

    private static final void a(Zc zc, View view) {
        if (zc != null) {
            ((SparkScanViewPresenter) zc).O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Kc this$0, View view, int i, int i2, int i3, int i4) {
        Intrinsics.h(this$0, "this$0");
        View view2 = this$0.w;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 8);
        }
        View view3 = this$0.v;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(view.canScrollVertically(1) ? 0 : 8);
    }

    public final void a(int i) {
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            imageButton.setVisibility(i);
        }
        f();
    }
}
