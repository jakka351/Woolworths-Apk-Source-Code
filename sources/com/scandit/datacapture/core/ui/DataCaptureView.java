package com.scandit.datacapture.core.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.core.AbstractC1108r1;
import com.scandit.datacapture.core.C0993e3;
import com.scandit.datacapture.core.C1090p1;
import com.scandit.datacapture.core.C1126t1;
import com.scandit.datacapture.core.I1;
import com.scandit.datacapture.core.J1;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.V2;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextListener;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.internal.module.ui.DataCaptureTextureView;
import com.scandit.datacapture.core.internal.module.ui.ErrorOverlay;
import com.scandit.datacapture.core.internal.module.ui.GestureRecognizer;
import com.scandit.datacapture.core.internal.module.ui.NativeContextStatusListener;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.module.ui.ViewSizeAndRotation;
import com.scandit.datacapture.core.internal.module.ui.control.layout.ControlLayout;
import com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.core.internal.sdk.common.NativeError;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.RotationExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter;
import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintPresenterV2;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import com.scandit.datacapture.core.ui.gesture.FocusGesture;
import com.scandit.datacapture.core.ui.gesture.SwipeToZoom;
import com.scandit.datacapture.core.ui.gesture.TapToFocus;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u0002:\u0002¦\u0001BA\b\u0000\u0012\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001\u0012\b\u0010e\u001a\u0004\u0018\u00010^\u0012\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001\u0012\n\b\u0002\u0010¡\u0001\u001a\u00030 \u0001\u0012\n\b\u0002\u0010£\u0001\u001a\u00030¢\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\t\u001a\u00020\u0005H\u0097\u0001J\t\u0010\n\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0097\u0001J\t\u0010\u000f\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001J\u000f\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0014J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u001c\u001a\u00020\u0005H\u0014J\b\u0010\u001d\u001a\u00020\u0005H\u0014J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020!J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020!J(\u0010'\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0014J\u000e\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(J\u000e\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+J\u0016\u00102\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200J\u000e\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u000203J\u001e\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u0002032\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208J\u000e\u0010:\u001a\u00020\u00052\u0006\u00104\u001a\u000203J\u000f\u0010<\u001a\u00020\u0005H\u0000¢\u0006\u0004\b;\u0010\u0014R&\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030=8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010\u0014\u001a\u0004\b@\u0010AR \u0010J\u001a\u00020D8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010\u0014\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010SR1\u0010]\u001a\u00020T2\u0006\u0010U\u001a\u00020T8@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\bV\u0010W\u0012\u0004\b\\\u0010\u0014\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R.\u0010e\u001a\u0004\u0018\u00010^2\b\u00101\u001a\u0004\u0018\u00010^8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR.\u0010m\u001a\u0004\u0018\u00010f2\b\u00101\u001a\u0004\u0018\u00010f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR.\u0010u\u001a\u0004\u0018\u00010n2\b\u00101\u001a\u0004\u0018\u00010n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R'\u0010\u0082\u0001\u001a\u0002062\u0006\u0010U\u001a\u0002068W@WX\u0096\u000f¢\u0006\u000e\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0087\u0001\u001a\u0002082\u0006\u0010U\u001a\u0002088W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u008d\u0001\u001a\u00030\u0088\u00012\u0007\u0010U\u001a\u00030\u0088\u00018W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R)\u0010\u0090\u0001\u001a\u0002082\u0006\u0010U\u001a\u0002088W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u008e\u0001\u0010\u0084\u0001\"\u0006\b\u008f\u0001\u0010\u0086\u0001R+\u0010\u0096\u0001\u001a\u00030\u0091\u00012\u0007\u0010U\u001a\u00030\u0091\u00018W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R%\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0097\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u009a\u0001\u0010\u0014\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006§\u0001"}, d2 = {"Lcom/scandit/datacapture/core/ui/DataCaptureView;", "Landroid/widget/RelativeLayout;", "Lcom/scandit/datacapture/core/ui/DataCaptureViewProxy;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "overlay", "", "_addOverlay", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "_impl", "_performUiTriggeredZoomIn", "_performUiTriggeredZoomOut", "_removeOverlay", "Lcom/scandit/datacapture/core/internal/module/ui/GestureRecognizer;", "recognizer", "_setGestureRecognizer", "_setNeedsRedraw", "Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_setNeedsRedrawListener", "onSurfaceTextureAvailable$scandit_capture_core", "()V", "onSurfaceTextureAvailable", "onSurfaceTextureDestroyed$scandit_capture_core", "onSurfaceTextureDestroyed", "onSurfaceTextureUpdated$scandit_capture_core", "onSurfaceTextureUpdated", "addOverlay", "removeOverlay", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/scandit/datacapture/core/ui/DataCaptureViewListener;", "addListener", "removeListener", "Lcom/scandit/datacapture/core/ui/DataCaptureViewSizeListener;", "", "w", "h", "oldw", "oldh", "onSizeChanged", "Lcom/scandit/datacapture/core/common/geometry/Point;", "point", "mapFramePointToView", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "quadrilateral", "mapFrameQuadrilateralToView", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "setProperty", "Lcom/scandit/datacapture/core/ui/control/Control;", "control", "addControl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "removeControl", "removeAllControls$scandit_capture_core", "removeAllControls", "", "f", "Ljava/util/Set;", "get_overlays", "()Ljava/util/Set;", "get_overlays$annotations", "_overlays", "Lcom/scandit/datacapture/core/internal/module/ui/control/layout/ControlLayout;", "j", "Lcom/scandit/datacapture/core/internal/module/ui/control/layout/ControlLayout;", "getControlLayout$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/ui/control/layout/ControlLayout;", "getControlLayout$scandit_capture_core$annotations", "controlLayout", "Lcom/scandit/datacapture/core/V2;", "hintHolder", "Lcom/scandit/datacapture/core/V2;", "Lcom/scandit/datacapture/core/e3;", "hintPresenter", "Lcom/scandit/datacapture/core/e3;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintPresenterV2;", "hintPresenterV2", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintPresenterV2;", "Lcom/scandit/datacapture/core/internal/module/ui/ViewSizeAndRotation;", "<set-?>", "p", "Lkotlin/properties/ReadWriteProperty;", "getCurrentSize$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/ui/ViewSizeAndRotation;", "setCurrentSize$scandit_capture_core", "(Lcom/scandit/datacapture/core/internal/module/ui/ViewSizeAndRotation;)V", "getCurrentSize$scandit_capture_core$annotations", "currentSize", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "r", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "setDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "s", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "getFocusGesture", "()Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "setFocusGesture", "(Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;)V", "focusGesture", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "t", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "getZoomGesture", "()Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "setZoomGesture", "(Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;)V", "zoomGesture", "", "u", "Z", "get_optimizesRendering$scandit_capture_core", "()Z", "set_optimizesRendering$scandit_capture_core", "(Z)V", "_optimizesRendering", "getLogoAnchor", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setLogoAnchor", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "logoAnchor", "getLogoOffset", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setLogoOffset", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "logoOffset", "Lcom/scandit/datacapture/core/ui/LogoStyle;", "getLogoStyle", "()Lcom/scandit/datacapture/core/ui/LogoStyle;", "setLogoStyle", "(Lcom/scandit/datacapture/core/ui/LogoStyle;)V", "logoStyle", "getPointOfInterest", "setPointOfInterest", "pointOfInterest", "Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "getScanAreaMargins", "()Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "setScanAreaMargins", "(Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;)V", "scanAreaMargins", "", "getControls$scandit_capture_core", "()Ljava/util/Collection;", "getControls$scandit_capture_core$annotations", "controls", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/module/ui/video/NativeVideoPreview;", "videoPreview", "Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusPresenter;", "contextStatusPresenter", "", "pixelsPerDip", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/internal/module/ui/video/NativeVideoPreview;Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusPresenter;F)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SuppressLint
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DataCaptureView extends RelativeLayout implements DataCaptureViewProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    static final /* synthetic */ KProperty[] v;

    /* renamed from: a, reason: collision with root package name */
    private final ContextStatusPresenter f18877a;
    private final float b;
    private final /* synthetic */ DataCaptureViewProxyAdapter c;
    private final CopyOnWriteArraySet d;
    private final CopyOnWriteArraySet e;
    private final CopyOnWriteArraySet f;
    private final DataCaptureTextureView g;
    private final FrameLayout h;

    @Keep
    @NotNull
    private final V2 hintHolder;

    @Keep
    @NotNull
    private final C0993e3 hintPresenter;

    @Keep
    @NotNull
    private final HintPresenterV2 hintPresenterV2;
    private boolean i;

    /* renamed from: j, reason: from kotlin metadata */
    private final ControlLayout controlLayout;
    private final HintHolderV2 k;
    private final ErrorOverlay l;
    private final DataCaptureView$contextStatusView$1 m;
    private final DataCaptureView$orientationEventListener$1 n;
    private int o;
    private final DataCaptureView$special$$inlined$distinctObservable$1 p;
    private final DataCaptureView$dataCaptureContextListener$1 q;

    /* renamed from: r, reason: from kotlin metadata */
    private DataCaptureContext dataCaptureContext;

    /* renamed from: s, reason: from kotlin metadata */
    private FocusGesture focusGesture;

    /* renamed from: t, reason: from kotlin metadata */
    private ZoomGesture zoomGesture;

    /* renamed from: u, reason: from kotlin metadata */
    private boolean _optimizesRendering;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/ui/DataCaptureView$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "newInstance", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DataCaptureView newInstance(@NotNull Context context, @Nullable DataCaptureContext dataCaptureContext) {
            Intrinsics.h(context, "context");
            NativeVideoPreview nativeVideoPreviewCreate = NativeVideoPreview.create();
            Intrinsics.g(nativeVideoPreviewCreate, "create()");
            return new DataCaptureView(context, dataCaptureContext, nativeVideoPreviewCreate, null, BitmapDescriptorFactory.HUE_RED, 24, null);
        }

        private Companion() {
        }
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        v = new KProperty[]{reflectionFactory.e(new MutablePropertyReference1Impl(reflectionFactory.b(DataCaptureView.class), "currentSize", "getCurrentSize$scandit_capture_core()Lcom/scandit/datacapture/core/internal/module/ui/ViewSizeAndRotation;"))};
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ DataCaptureView(Context context, DataCaptureContext dataCaptureContext, NativeVideoPreview nativeVideoPreview, ContextStatusPresenter contextStatusPresenter, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dataCaptureContext, nativeVideoPreview, (i & 8) != 0 ? new C1090p1() : contextStatusPresenter, (i & 16) != 0 ? context.getResources().getDisplayMetrics().density : f);
    }

    public static final void access$updateFrameOfReferenceViewSizeAndOrientation(DataCaptureView dataCaptureView, int i, int i2, int i3) {
        dataCaptureView.getClass();
        int angle = RotationExtensionsKt.toAngle(i3);
        MeasureUnit measureUnit = MeasureUnit.PIXEL;
        SizeWithUnit sizeWithUnit = new SizeWithUnit(new FloatWithUnit(i, measureUnit), new FloatWithUnit(i2, measureUnit));
        dataCaptureView.getF18883a().setPreviewOrientation(angle);
        NativeDataCaptureContext dataCaptureContext = dataCaptureView.getF18883a().getDataCaptureContext();
        if (dataCaptureContext != null) {
            dataCaptureContext.setFrameOfReferenceViewSizeAndOrientation(sizeWithUnit, dataCaptureView.b, angle);
        }
        Iterator it = dataCaptureView.d.iterator();
        while (it.hasNext()) {
            ((DataCaptureViewListener) it.next()).onSizeChanged(i, i2, i3);
        }
        Iterator it2 = dataCaptureView.e.iterator();
        while (it2.hasNext()) {
            ((DataCaptureViewSizeListener) it2.next()).onSizeChanged(dataCaptureView, i, i2, i3);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getControlLayout$scandit_capture_core$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getControls$scandit_capture_core$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getCurrentSize$scandit_capture_core$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void get_overlays$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final DataCaptureView newInstance(@NotNull Context context, @Nullable DataCaptureContext dataCaptureContext) {
        return INSTANCE.newInstance(context, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "addOverlay")
    public void _addOverlay(@NotNull DataCaptureOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        this.c._addOverlay(overlay);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeDataCaptureView getF18883a() {
        return this.c.getF18883a();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "performUiTriggeredZoomIn")
    public void _performUiTriggeredZoomIn() {
        this.c._performUiTriggeredZoomIn();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "performUiTriggeredZoomOut")
    public void _performUiTriggeredZoomOut() {
        this.c._performUiTriggeredZoomOut();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "removeOverlay")
    public void _removeOverlay(@NotNull DataCaptureOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        this.c._removeOverlay(overlay);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "setGestureRecognizer")
    public void _setGestureRecognizer(@NotNull GestureRecognizer recognizer) {
        Intrinsics.h(recognizer, "recognizer");
        this.c._setGestureRecognizer(recognizer);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "setNeedsRedraw")
    public void _setNeedsRedraw() {
        this.c._setNeedsRedraw();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "setNeedsRedrawDelegate")
    public void _setNeedsRedrawListener(@NotNull NeedsRedrawListener listener) {
        Intrinsics.h(listener, "listener");
        this.c._setNeedsRedrawListener(listener);
    }

    public final void addControl(@NotNull Control control) {
        Intrinsics.h(control, "control");
        int i = ControlLayout.f;
        Anchor anchor = control instanceof TorchSwitchControl ? Anchor.TOP_LEFT : control instanceof CameraSwitchControl ? Anchor.TOP_RIGHT : ((control instanceof ZoomSwitchControl) || (control instanceof LinearControlGroup)) ? Anchor.BOTTOM_RIGHT : Anchor.TOP_LEFT;
        addControl(control, anchor, AbstractC1108r1.a(anchor));
    }

    public final void addListener(@NotNull DataCaptureViewListener listener) {
        Intrinsics.h(listener, "listener");
        this.d.add(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addOverlay(@NotNull DataCaptureOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        _addOverlay(overlay);
        if (this.f.add(overlay) && (overlay instanceof ViewBasedDataCaptureOverlay)) {
            View view = (View) overlay;
            if (this.h.indexOfChild(view) == -1) {
                this.h.addView(view, new RelativeLayout.LayoutParams(-1, -1));
                ((ViewBasedDataCaptureOverlay) overlay)._setDataCaptureView(this);
            }
        }
    }

    @NotNull
    /* renamed from: getControlLayout$scandit_capture_core, reason: from getter */
    public final ControlLayout getControlLayout() {
        return this.controlLayout;
    }

    @NotNull
    public final Collection<Control> getControls$scandit_capture_core() {
        return this.controlLayout.d();
    }

    @NotNull
    public final ViewSizeAndRotation getCurrentSize$scandit_capture_core() {
        return getValue(this, v[0]);
    }

    @Nullable
    public final DataCaptureContext getDataCaptureContext() {
        return this.dataCaptureContext;
    }

    @Nullable
    public final FocusGesture getFocusGesture() {
        return this.focusGesture;
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoAnchor")
    @NotNull
    public Anchor getLogoAnchor() {
        return this.c.getLogoAnchor();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoOffset")
    @NotNull
    public PointWithUnit getLogoOffset() {
        return this.c.getLogoOffset();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoStyle")
    @NotNull
    public LogoStyle getLogoStyle() {
        return this.c.getLogoStyle();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "pointOfInterest")
    @NotNull
    public PointWithUnit getPointOfInterest() {
        return this.c.getPointOfInterest();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "scanAreaMargins")
    @NotNull
    public MarginsWithUnit getScanAreaMargins() {
        return this.c.getScanAreaMargins();
    }

    @Nullable
    public final ZoomGesture getZoomGesture() {
        return this.zoomGesture;
    }

    /* renamed from: get_optimizesRendering$scandit_capture_core, reason: from getter */
    public final boolean get_optimizesRendering() {
        return this._optimizesRendering;
    }

    @NotNull
    public final Set<DataCaptureOverlay> get_overlays() {
        return this.f;
    }

    @NotNull
    public final Point mapFramePointToView(@NotNull Point point) {
        Intrinsics.h(point, "point");
        Point pointMapFramePointToView = getF18883a().mapFramePointToView(point);
        return new Point(pointMapFramePointToView.getX() * this.b, pointMapFramePointToView.getY() * this.b);
    }

    @NotNull
    public final Quadrilateral mapFrameQuadrilateralToView(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "quadrilateral");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.g(topLeft, "quadrilateral.topLeft");
        Point pointMapFramePointToView = mapFramePointToView(topLeft);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.g(topRight, "quadrilateral.topRight");
        Point pointMapFramePointToView2 = mapFramePointToView(topRight);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.g(bottomRight, "quadrilateral.bottomRight");
        Point pointMapFramePointToView3 = mapFramePointToView(bottomRight);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.g(bottomLeft, "quadrilateral.bottomLeft");
        return new Quadrilateral(pointMapFramePointToView, pointMapFramePointToView2, pointMapFramePointToView3, mapFramePointToView(bottomLeft));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        this.f18877a.setView(this.m);
        enable();
        getF18883a().setContextStatusListener(new NativeContextStatusListener() { // from class: com.scandit.datacapture.core.ui.DataCaptureView.onAttachedToWindow.1
            @Override // com.scandit.datacapture.core.internal.module.ui.NativeContextStatusListener
            public void onStatusChanged(@NotNull NativeContextStatus status) {
                Intrinsics.h(status, "status");
                DataCaptureView.this.f18877a.onStatusChanged(new ContextStatus(status));
            }

            @Override // com.scandit.datacapture.core.internal.module.ui.NativeContextStatusListener
            public void onWarningsChanged(@NotNull ArrayList<NativeError> warnings) {
                Intrinsics.h(warnings, "warnings");
                DataCaptureView.this.f18877a.onWarningsChanged(warnings);
            }
        });
        getF18883a().attachToWindow();
        if (isHardwareAccelerated()) {
            return;
        }
        String string = getResources().getString(R.string.sc_hardware_acceleration_required);
        Intrinsics.g(string, "resources.getString(R.st…re_acceleration_required)");
        Toast.makeText(getContext(), string, 1).show();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        disable();
        this.f18877a.setView(null);
        getF18883a().setContextStatusListener(null);
        getF18883a().detachFromWindow();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Context context = getContext();
        Intrinsics.g(context, "context");
        setCurrentSize$scandit_capture_core(new ViewSizeAndRotation(w, h, ContextExtensionsKt.getRotation(context)));
    }

    public final synchronized void onSurfaceTextureAvailable$scandit_capture_core() {
        try {
            DataCaptureContext dataCaptureContext = this.dataCaptureContext;
            if (dataCaptureContext != null) {
                if (!this.i) {
                    dataCaptureContext.addListener(this.q);
                }
                getF18883a().setDataCaptureContext(dataCaptureContext.getF18429a());
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Context context = getContext();
                Intrinsics.g(context, "context");
                setCurrentSize$scandit_capture_core(new ViewSizeAndRotation(measuredWidth, measuredHeight, ContextExtensionsKt.getRotation(context)));
            }
            this.i = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void onSurfaceTextureDestroyed$scandit_capture_core() {
        this.i = false;
        DataCaptureContext dataCaptureContext = this.dataCaptureContext;
        if (dataCaptureContext != null) {
            dataCaptureContext.removeListener(this.q);
        }
    }

    public final synchronized void onSurfaceTextureUpdated$scandit_capture_core() {
        try {
            if (getF18883a().isDisplayingViewfinder()) {
                this.k.setViewFinderRect(getF18883a().getViewfinderRect());
            } else {
                this.k.setViewFinderRect(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void removeAllControls$scandit_capture_core() {
        this.controlLayout.e();
    }

    public final void removeControl(@NotNull Control control) {
        Intrinsics.h(control, "control");
        this.controlLayout.a(control);
    }

    public final void removeListener(@NotNull DataCaptureViewListener listener) {
        Intrinsics.h(listener, "listener");
        this.d.remove(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void removeOverlay(@NotNull DataCaptureOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        _removeOverlay(overlay);
        this.f.remove(overlay);
        if (overlay instanceof ViewBasedDataCaptureOverlay) {
            this.h.removeView((View) overlay);
            ((ViewBasedDataCaptureOverlay) overlay)._cleanupViews();
        }
    }

    public final void setCurrentSize$scandit_capture_core(@NotNull ViewSizeAndRotation viewSizeAndRotation) {
        Intrinsics.h(viewSizeAndRotation, "<set-?>");
        setValue(this, v[0], viewSizeAndRotation);
    }

    public final void setDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext) {
        synchronized (this) {
            try {
                DataCaptureContext dataCaptureContext2 = this.dataCaptureContext;
                if (dataCaptureContext2 != null && this.i) {
                    dataCaptureContext2.removeListener(this.q);
                }
                this.dataCaptureContext = dataCaptureContext;
                if (dataCaptureContext != null) {
                    if (this.i) {
                        dataCaptureContext.addListener(this.q);
                        int measuredWidth = getMeasuredWidth();
                        int measuredHeight = getMeasuredHeight();
                        Context context = getContext();
                        Intrinsics.g(context, "context");
                        setCurrentSize$scandit_capture_core(new ViewSizeAndRotation(measuredWidth, measuredHeight, ContextExtensionsKt.getRotation(context)));
                    }
                    NativeDataCaptureView nativeDataCaptureView_impl = getF18883a();
                    DataCaptureContext dataCaptureContext3 = this.dataCaptureContext;
                    nativeDataCaptureView_impl.setDataCaptureContext(dataCaptureContext3 != null ? dataCaptureContext3.getF18429a() : null);
                }
                Iterator<T> it = getControls$scandit_capture_core().iterator();
                while (it.hasNext()) {
                    ((Control) it.next())._onDataCaptureContextChanged(this.dataCaptureContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setFocusGesture(@Nullable FocusGesture focusGesture) {
        this.focusGesture = focusGesture;
        getF18883a().setFocusGesture(focusGesture != null ? focusGesture.getC() : null);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoAnchor")
    public void setLogoAnchor(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        this.c.setLogoAnchor(anchor);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoOffset")
    public void setLogoOffset(@NotNull PointWithUnit pointWithUnit) {
        Intrinsics.h(pointWithUnit, "<set-?>");
        this.c.setLogoOffset(pointWithUnit);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoStyle")
    public void setLogoStyle(@NotNull LogoStyle logoStyle) {
        Intrinsics.h(logoStyle, "<set-?>");
        this.c.setLogoStyle(logoStyle);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "pointOfInterest")
    public void setPointOfInterest(@NotNull PointWithUnit pointWithUnit) {
        Intrinsics.h(pointWithUnit, "<set-?>");
        this.c.setPointOfInterest(pointWithUnit);
    }

    public final void setProperty(@NotNull String name, @NotNull Object value) {
        Boolean bool;
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        if (name.equals("logoHidden")) {
            bool = value instanceof Boolean ? (Boolean) value : null;
            if (bool != null) {
                getF18883a().setLogoHidden(bool.booleanValue());
                return;
            }
            return;
        }
        if (name.equals("optimizesRendering")) {
            bool = value instanceof Boolean ? (Boolean) value : null;
            if (bool != null) {
                this._optimizesRendering = bool.booleanValue();
            }
        }
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "scanAreaMargins")
    public void setScanAreaMargins(@NotNull MarginsWithUnit marginsWithUnit) {
        Intrinsics.h(marginsWithUnit, "<set-?>");
        this.c.setScanAreaMargins(marginsWithUnit);
    }

    public final void setZoomGesture(@Nullable ZoomGesture zoomGesture) {
        this.zoomGesture = zoomGesture;
        getF18883a().setZoomGesture(zoomGesture != null ? zoomGesture.getC() : null);
        Iterator<T> it = getControls$scandit_capture_core().iterator();
        while (it.hasNext()) {
            ((Control) it.next())._onZoomGestureChanged(this.zoomGesture);
        }
    }

    public final void set_optimizesRendering$scandit_capture_core(boolean z) {
        this._optimizesRendering = z;
    }

    public final void addListener(@NotNull DataCaptureViewSizeListener listener) {
        Intrinsics.h(listener, "listener");
        this.e.add(listener);
    }

    public final void removeListener(@NotNull DataCaptureViewSizeListener listener) {
        Intrinsics.h(listener, "listener");
        this.e.remove(listener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.scandit.datacapture.core.ui.DataCaptureView$orientationEventListener$1] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.scandit.datacapture.core.ui.DataCaptureView$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.scandit.datacapture.core.ui.DataCaptureView$dataCaptureContextListener$1] */
    public DataCaptureView(@NotNull final Context context, @Nullable DataCaptureContext dataCaptureContext, @NotNull NativeVideoPreview videoPreview, @NotNull ContextStatusPresenter contextStatusPresenter, float f) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(videoPreview, "videoPreview");
        Intrinsics.h(contextStatusPresenter, "contextStatusPresenter");
        this.f18877a = contextStatusPresenter;
        this.b = f;
        NativeDataCaptureView nativeDataCaptureViewCreate = NativeDataCaptureView.create(f, videoPreview.asVideoGeometryListener());
        Intrinsics.g(nativeDataCaptureViewCreate, "create(pixelsPerDip, vid…sVideoGeometryListener())");
        this.c = new DataCaptureViewProxyAdapter(nativeDataCaptureViewCreate, null, 2, 0 == true ? 1 : 0);
        this.d = new CopyOnWriteArraySet();
        this.e = new CopyOnWriteArraySet();
        this.f = new CopyOnWriteArraySet();
        DataCaptureTextureView dataCaptureTextureView = new DataCaptureTextureView(context, this, videoPreview);
        this.g = dataCaptureTextureView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.sc_overlay_container);
        this.h = frameLayout;
        ControlLayout controlLayout = new ControlLayout(context, new C1126t1());
        this.controlLayout = controlLayout;
        I1 i1 = new I1(this);
        this.hintHolder = i1;
        this.hintPresenter = new C0993e3(i1, new J1());
        HintHolderV2 hintHolderV2Implementation = HintHolderV2.INSTANCE.implementation(context);
        this.k = hintHolderV2Implementation;
        this.hintPresenterV2 = new HintPresenterV2(hintHolderV2Implementation);
        ErrorOverlay errorOverlay = new ErrorOverlay(context);
        errorOverlay.setVisibility(4);
        this.l = errorOverlay;
        this.m = new DataCaptureView$contextStatusView$1(this);
        this.n = new OrientationEventListener(context, this) { // from class: com.scandit.datacapture.core.ui.DataCaptureView$orientationEventListener$1

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f18882a;
            final /* synthetic */ DataCaptureView b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                this.f18882a = context;
                this.b = this;
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                int rotation = ContextExtensionsKt.getRotation(this.f18882a);
                if (rotation != this.b.o) {
                    DataCaptureView dataCaptureView = this.b;
                    dataCaptureView.setCurrentSize$scandit_capture_core(new ViewSizeAndRotation(dataCaptureView.getMeasuredWidth(), this.b.getMeasuredHeight(), rotation));
                    this.b.o = rotation;
                }
            }
        };
        this.o = ContextExtensionsKt.getRotation(context);
        final ViewSizeAndRotation viewSizeAndRotation = new ViewSizeAndRotation(getMeasuredWidth(), getMeasuredHeight(), ContextExtensionsKt.getRotation(context));
        this.p = new ObservableProperty<ViewSizeAndRotation>(viewSizeAndRotation) { // from class: com.scandit.datacapture.core.ui.DataCaptureView$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, ViewSizeAndRotation oldValue, ViewSizeAndRotation newValue) {
                Intrinsics.h(property, "property");
                if (Intrinsics.c(oldValue, newValue)) {
                    return;
                }
                ViewSizeAndRotation viewSizeAndRotation2 = newValue;
                DataCaptureView.access$updateFrameOfReferenceViewSizeAndOrientation(this, viewSizeAndRotation2.a(), viewSizeAndRotation2.b(), viewSizeAndRotation2.c());
            }
        };
        this.q = new DataCaptureContextListener() { // from class: com.scandit.datacapture.core.ui.DataCaptureView$dataCaptureContextListener$1
            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onFrameSourceChanged(@NotNull DataCaptureContext dataCaptureContext2, @Nullable FrameSource frameSource) {
                Intrinsics.h(dataCaptureContext2, "dataCaptureContext");
                this.f18880a.g.a(frameSource);
                Iterator<T> it = this.f18880a.getControls$scandit_capture_core().iterator();
                while (it.hasNext()) {
                    ((Control) it.next())._onFrameSourceChanged(frameSource);
                }
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onModeAdded(@NotNull DataCaptureContext dataCaptureContext2, @NotNull DataCaptureMode dataCaptureMode) {
                DataCaptureContextListener.DefaultImpls.onModeAdded(this, dataCaptureContext2, dataCaptureMode);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onModeRemoved(@NotNull DataCaptureContext dataCaptureContext2, @NotNull DataCaptureMode dataCaptureMode) {
                DataCaptureContextListener.DefaultImpls.onModeRemoved(this, dataCaptureContext2, dataCaptureMode);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onObservationStarted(@NotNull DataCaptureContext dataCaptureContext2) {
                Intrinsics.h(dataCaptureContext2, "dataCaptureContext");
                this.f18880a.g.a(dataCaptureContext2.get_frameSource());
                Iterator<T> it = this.f18880a.getControls$scandit_capture_core().iterator();
                while (it.hasNext()) {
                    ((Control) it.next())._onFrameSourceChanged(dataCaptureContext2.get_frameSource());
                }
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onObservationStopped(@NotNull DataCaptureContext dataCaptureContext2) {
                Intrinsics.h(dataCaptureContext2, "dataCaptureContext");
                this.f18880a.g.a((FrameSource) null);
                Iterator<T> it = this.f18880a.getControls$scandit_capture_core().iterator();
                while (it.hasNext()) {
                    ((Control) it.next())._onFrameSourceChanged(null);
                }
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onStatusChanged(@NotNull DataCaptureContext dataCaptureContext2, @NotNull ContextStatus contextStatus) {
                DataCaptureContextListener.DefaultImpls.onStatusChanged(this, dataCaptureContext2, contextStatus);
            }
        };
        this._optimizesRendering = true;
        setDataCaptureContext(dataCaptureContext);
        setBackgroundColor(-16777216);
        errorOverlay.setVisibility(4);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(dataCaptureTextureView, layoutParams);
        addView(errorOverlay, layoutParams);
        addView(frameLayout, layoutParams);
        addView(controlLayout, layoutParams);
        Intrinsics.f(hintHolderV2Implementation, "null cannot be cast to non-null type android.view.View");
        addView((View) hintHolderV2Implementation, layoutParams);
        for (Control control : getControls$scandit_capture_core()) {
            control._onDataCaptureContextChanged(dataCaptureContext);
            control._onFrameSourceChanged(dataCaptureContext != null ? dataCaptureContext.get_frameSource() : null);
            control._onDataCaptureViewChanged(this);
            control._onZoomGestureChanged(this.zoomGesture);
        }
        getF18883a().setHintPresenter(this.hintPresenter);
        getF18883a().setHintPresenterV2(this.hintPresenterV2.get_impl());
        setFocusGesture(new TapToFocus());
        setZoomGesture(new SwipeToZoom());
    }

    public final void addControl(@NotNull Control control, @NotNull Anchor anchor, @NotNull PointWithUnit offset) {
        Intrinsics.h(control, "control");
        Intrinsics.h(anchor, "anchor");
        Intrinsics.h(offset, "offset");
        this.controlLayout.a(control, anchor, offset);
        control._onDataCaptureContextChanged(this.dataCaptureContext);
        DataCaptureContext dataCaptureContext = this.dataCaptureContext;
        control._onFrameSourceChanged(dataCaptureContext != null ? dataCaptureContext.get_frameSource() : null);
        control._onDataCaptureViewChanged(this);
        control._onZoomGestureChanged(this.zoomGesture);
    }
}
