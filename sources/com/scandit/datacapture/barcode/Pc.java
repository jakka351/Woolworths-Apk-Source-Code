package com.scandit.datacapture.barcode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewStateHelper;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningModeKt;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Pc extends RelativeLayout {
    private Zc b;
    private Function1 c;
    private SparkScanViewSettings d;
    private SparkScanViewUISettings e;
    private SparkScanStateManager f;
    private Kc g;
    private RelativeLayout h;
    private TextView i;
    private Vc j;
    private ViewOnTouchListenerC0829sa k;
    private NativeSparkScanViewState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pc(Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    public static final void c(Pc pc) {
        Kc kc = pc.g;
        if (kc != null) {
            SparkScanViewUISettings sparkScanViewUISettings = pc.e;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("uiSettings");
                throw null;
            }
            kc.setVisibility(AbstractC0784pd.a(sparkScanViewUISettings) > 0 ? 0 : 8);
        }
        RelativeLayout relativeLayout = pc.h;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(pc.b());
        }
    }

    private final int b() {
        SparkScanViewUISettings sparkScanViewUISettings = this.e;
        if (sparkScanViewUISettings == null) {
            Intrinsics.p("uiSettings");
            throw null;
        }
        if (AbstractC0784pd.a(sparkScanViewUISettings) > 0) {
            return R.drawable.sc_spark_scan_view_button_background;
        }
        SparkScanStateManager sparkScanStateManager = this.f;
        if (sparkScanStateManager == null) {
            Intrinsics.p("stateManager");
            throw null;
        }
        int i = Lc.f17231a[sparkScanStateManager.c().ordinal()];
        if (i == 1) {
            return R.drawable.sc_spark_scan_view_button_background_right;
        }
        if (i == 2) {
            return R.drawable.sc_spark_scan_view_button_background_left;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(NativeSparkScanViewState viewState, Zc zc, SparkScanViewScanButtonTouchListener touchListener, SparkScanViewSettings settings, SparkScanViewUISettings uiSettings, SparkScanStateManager stateManager) {
        int iIntValue;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(touchListener, "touchListener");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(uiSettings, "uiSettings");
        Intrinsics.h(stateManager, "stateManager");
        this.d = settings;
        this.e = uiSettings;
        this.b = zc;
        this.f = stateManager;
        this.l = viewState;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setBackgroundResource(b());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.sc_spark_scan_view_button_expanded, (ViewGroup) null);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        TextView textView = (TextView) viewInflate.findViewById(R.id.spark_capture_scan_button_text);
        if (textView != null) {
            textView.setText(a(viewState));
            SparkScanViewUISettings sparkScanViewUISettings = this.e;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("uiSettings");
                throw null;
            }
            Integer numF = sparkScanViewUISettings.f();
            if (numF != null) {
                iIntValue = numF.intValue();
            } else {
                NativeColor nativeColorDefaultCaptureButtonTintColor = NativeSparkScanViewDefaults.defaultCaptureButtonTintColor();
                Intrinsics.g(nativeColorDefaultCaptureButtonTintColor, "defaultCaptureButtonTintColor()");
                iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultCaptureButtonTintColor);
            }
            textView.setTextColor(iIntValue);
            this.i = textView;
        }
        Context context = getContext();
        Intrinsics.g(context, "context");
        ViewOnTouchListenerC0829sa viewOnTouchListenerC0829sa = new ViewOnTouchListenerC0829sa(context);
        viewOnTouchListenerC0829sa.b(new Mc(this));
        this.k = viewOnTouchListenerC0829sa;
        viewInflate.setOnTouchListener(viewOnTouchListenerC0829sa);
        relativeLayout.addView(viewInflate);
        a(viewState, relativeLayout);
        this.h = relativeLayout;
        Context context2 = getContext();
        Intrinsics.g(context2, "context");
        SparkScanStateManager sparkScanStateManager = this.f;
        if (sparkScanStateManager == null) {
            Intrinsics.p("stateManager");
            throw null;
        }
        SparkScanViewHandMode sparkScanViewHandModeC = sparkScanStateManager.c();
        SparkScanViewUISettings sparkScanViewUISettings2 = this.e;
        if (sparkScanViewUISettings2 == null) {
            Intrinsics.p("uiSettings");
            throw null;
        }
        Vc vc = new Vc(context2, sparkScanViewHandModeC, sparkScanViewUISettings2);
        touchListener.a(this);
        touchListener.a(new Nc(this));
        vc.setOnTouchListener(touchListener);
        this.j = vc;
        Context context3 = getContext();
        Intrinsics.g(context3, "context");
        Kc kc = new Kc(context3);
        kc.a(uiSettings, zc, stateManager, settings);
        kc.setVisibility(!(AbstractC0784pd.a(uiSettings) > 0) ? 8 : 0);
        this.g = kc;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Gc.p(), Gc.m());
        SparkScanStateManager sparkScanStateManager2 = this.f;
        if (sparkScanStateManager2 == null) {
            Intrinsics.p("stateManager");
            throw null;
        }
        SparkScanViewHandMode sparkScanViewHandModeC2 = sparkScanStateManager2.c();
        int[] iArr = Lc.f17231a;
        int i = iArr[sparkScanViewHandModeC2.ordinal()];
        if (i == 1) {
            layoutParams.removeRule(11);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.removeRule(9);
            layoutParams.addRule(11);
        }
        addView(kc, layoutParams);
        View view = this.h;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, Gc.m());
        SparkScanStateManager sparkScanStateManager3 = this.f;
        if (sparkScanStateManager3 == null) {
            Intrinsics.p("stateManager");
            throw null;
        }
        int i2 = iArr[sparkScanStateManager3.c().ordinal()];
        if (i2 == 1) {
            layoutParams2.removeRule(0);
            layoutParams2.addRule(1, Gc.x());
        } else if (i2 == 2) {
            layoutParams2.removeRule(1);
            layoutParams2.addRule(0, Gc.x());
        }
        addView(view, layoutParams2);
        addView(this.j);
        Oc oc = new Oc(uiSettings, this);
        this.c = oc;
        uiSettings.l().add(oc);
    }

    public final void c() {
        ViewOnTouchListenerC0829sa viewOnTouchListenerC0829sa = this.k;
        if (viewOnTouchListenerC0829sa != null) {
            viewOnTouchListenerC0829sa.b();
        }
    }

    public final void b(NativeSparkScanViewState viewState) {
        Intrinsics.h(viewState, "viewState");
        this.l = viewState;
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(a(viewState));
            SparkScanViewUISettings sparkScanViewUISettings = this.e;
            if (sparkScanViewUISettings == null) {
                Intrinsics.p("uiSettings");
                throw null;
            }
            Integer numF = sparkScanViewUISettings.f();
            if (numF != null) {
                textView.setTextColor(numF.intValue());
            }
        }
        Kc kc = this.g;
        if (kc != null) {
            kc.h();
            ViewGroup.LayoutParams layoutParams = kc.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            SparkScanStateManager sparkScanStateManager = this.f;
            if (sparkScanStateManager == null) {
                Intrinsics.p("stateManager");
                throw null;
            }
            int i = Lc.f17231a[sparkScanStateManager.c().ordinal()];
            if (i == 1) {
                layoutParams2.removeRule(11);
                layoutParams2.addRule(9);
            } else if (i == 2) {
                layoutParams2.removeRule(9);
                layoutParams2.addRule(11);
            }
        }
        RelativeLayout relativeLayout = this.h;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            Intrinsics.f(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            SparkScanStateManager sparkScanStateManager2 = this.f;
            if (sparkScanStateManager2 != null) {
                int i2 = Lc.f17231a[sparkScanStateManager2.c().ordinal()];
                if (i2 == 1) {
                    layoutParams4.removeRule(0);
                    layoutParams4.addRule(1, Gc.x());
                } else if (i2 == 2) {
                    layoutParams4.removeRule(1);
                    layoutParams4.addRule(0, Gc.x());
                }
                a(viewState, relativeLayout);
            } else {
                Intrinsics.p("stateManager");
                throw null;
            }
        }
        Vc vc = this.j;
        if (vc != null) {
            SparkScanStateManager sparkScanStateManager3 = this.f;
            if (sparkScanStateManager3 != null) {
                vc.a(sparkScanStateManager3.c());
            } else {
                Intrinsics.p("stateManager");
                throw null;
            }
        }
    }

    private final void a(NativeSparkScanViewState nativeSparkScanViewState, RelativeLayout relativeLayout) {
        int iIntValue;
        int iIntValue2;
        Drawable background = relativeLayout.getBackground();
        SparkScanViewUISettings sparkScanViewUISettings = this.e;
        if (sparkScanViewUISettings != null) {
            Integer numE = sparkScanViewUISettings.e();
            if (numE != null) {
                iIntValue = numE.intValue();
            } else {
                NativeColor nativeColorDefaultCaptureButtonBackgroundColor = NativeSparkScanViewDefaults.defaultCaptureButtonBackgroundColor();
                Intrinsics.g(nativeColorDefaultCaptureButtonBackgroundColor, "defaultCaptureButtonBackgroundColor()");
                iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultCaptureButtonBackgroundColor);
            }
            SparkScanViewUISettings sparkScanViewUISettings2 = this.e;
            if (sparkScanViewUISettings2 != null) {
                Integer numD = sparkScanViewUISettings2.d();
                if (numD != null) {
                    iIntValue2 = numD.intValue();
                } else {
                    NativeColor nativeColorDefaultCaptureButtonActiveBackgroundColor = NativeSparkScanViewDefaults.defaultCaptureButtonActiveBackgroundColor();
                    Intrinsics.g(nativeColorDefaultCaptureButtonActiveBackgroundColor, "defaultCaptureButtonActiveBackgroundColor()");
                    iIntValue2 = NativeColorExtensionsKt.toInt(nativeColorDefaultCaptureButtonActiveBackgroundColor);
                }
                if (background instanceof GradientDrawable) {
                    if (NativeSparkScanViewStateHelper.isCaptureEnabledState(nativeSparkScanViewState)) {
                        ((GradientDrawable) background).setColor(ColorStateList.valueOf(iIntValue2));
                        return;
                    } else {
                        ((GradientDrawable) background).setColor(ColorStateList.valueOf(iIntValue));
                        return;
                    }
                }
                return;
            }
            Intrinsics.p("uiSettings");
            throw null;
        }
        Intrinsics.p("uiSettings");
        throw null;
    }

    private final String a(NativeSparkScanViewState nativeSparkScanViewState) {
        int i = Lc.b[nativeSparkScanViewState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                SparkScanViewUISettings sparkScanViewUISettings = this.e;
                if (sparkScanViewUISettings != null) {
                    String strI = sparkScanViewUISettings.i();
                    if (strI == null) {
                        strI = NativeSparkScanViewDefaults.defaultResumeCapturingText();
                    }
                    Intrinsics.g(strI, "uiSettings.resumeCapturi…aultResumeCapturingText()");
                    return strI;
                }
                Intrinsics.p("uiSettings");
                throw null;
            }
            if (i != 3) {
                return "";
            }
            SparkScanViewUISettings sparkScanViewUISettings2 = this.e;
            if (sparkScanViewUISettings2 != null) {
                String strN = sparkScanViewUISettings2.n();
                if (strN == null) {
                    SparkScanViewSettings sparkScanViewSettings = this.d;
                    if (sparkScanViewSettings == null) {
                        Intrinsics.p("settings");
                        throw null;
                    }
                    if (sparkScanViewSettings.getHoldToScanEnabled()) {
                        strN = NativeSparkScanViewDefaults.defaultStartCapturingByHoldingText();
                    } else {
                        strN = NativeSparkScanViewDefaults.defaultStartCapturingText();
                    }
                }
                Intrinsics.g(strN, "uiSettings.startCapturin…t()\n                    }");
                return strN;
            }
            Intrinsics.p("uiSettings");
            throw null;
        }
        SparkScanStateManager sparkScanStateManager = this.f;
        if (sparkScanStateManager != null) {
            int i2 = Lc.c[SparkScanScanningModeKt.getScanningBehavior(sparkScanStateManager.m()).ordinal()];
            if (i2 == 1) {
                SparkScanViewUISettings sparkScanViewUISettings3 = this.e;
                if (sparkScanViewUISettings3 == null) {
                    Intrinsics.p("uiSettings");
                    throw null;
                }
                String strK = sparkScanViewUISettings3.k();
                if (strK != null) {
                    return strK;
                }
                SparkScanViewSettings sparkScanViewSettings2 = this.d;
                if (sparkScanViewSettings2 == null) {
                    Intrinsics.p("settings");
                    throw null;
                }
                if (sparkScanViewSettings2.getHoldToScanEnabled()) {
                    String strDefaultScanningCapturingTextHoldToScanEnabled = NativeSparkScanViewDefaults.defaultScanningCapturingTextHoldToScanEnabled();
                    Intrinsics.g(strDefaultScanningCapturingTextHoldToScanEnabled, "defaultScanningCapturingTextHoldToScanEnabled()");
                    return strDefaultScanningCapturingTextHoldToScanEnabled;
                }
                String strDefaultScanningCapturingText = NativeSparkScanViewDefaults.defaultScanningCapturingText();
                Intrinsics.g(strDefaultScanningCapturingText, "defaultScanningCapturingText()");
                return strDefaultScanningCapturingText;
            }
            if (i2 == 2) {
                SparkScanViewUISettings sparkScanViewUISettings4 = this.e;
                if (sparkScanViewUISettings4 == null) {
                    Intrinsics.p("uiSettings");
                    throw null;
                }
                String strO = sparkScanViewUISettings4.o();
                if (strO != null) {
                    return strO;
                }
                SparkScanStateManager sparkScanStateManager2 = this.f;
                if (sparkScanStateManager2 == null) {
                    Intrinsics.p("stateManager");
                    throw null;
                }
                if (sparkScanStateManager2.j()) {
                    String strDefaultStopCapturingTextWhenHoldingToScan = NativeSparkScanViewDefaults.defaultStopCapturingTextWhenHoldingToScan();
                    Intrinsics.g(strDefaultStopCapturingTextWhenHoldingToScan, "defaultStopCapturingTextWhenHoldingToScan()");
                    return strDefaultStopCapturingTextWhenHoldingToScan;
                }
                String strDefaultStopCapturingText = NativeSparkScanViewDefaults.defaultStopCapturingText();
                Intrinsics.g(strDefaultStopCapturingText, "defaultStopCapturingText()");
                return strDefaultStopCapturingText;
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.p("stateManager");
        throw null;
    }

    public final void a(int i) {
        Kc kc = this.g;
        if (kc != null) {
            kc.a(i);
        }
    }

    public final void a() {
        Kc kc = this.g;
        if (kc != null) {
            kc.b();
        }
        Vc vc = this.j;
        if (vc != null) {
            vc.a();
        }
        SparkScanViewUISettings sparkScanViewUISettings = this.e;
        if (sparkScanViewUISettings != null) {
            sparkScanViewUISettings.l().remove(this.c);
            this.c = null;
        } else {
            Intrinsics.p("uiSettings");
            throw null;
        }
    }
}
