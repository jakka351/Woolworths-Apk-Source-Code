package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup.LinearControlGroupDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.FloatWithUnitExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u000234J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J \u0010\u0013\u001a\u00020\u0004\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0001H\u0016R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u00065"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/LinearControlGroup;", "Lcom/scandit/datacapture/core/ui/control/Control;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "_onDataCaptureContextChanged", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "_onDataCaptureViewChanged", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_onFrameSourceChanged", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "zoomGesture", "_onZoomGestureChanged", "_onRemoveControl", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "type", "_removeChildControl", "control", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "b", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "getOrientation", "()Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "orientation", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "c", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "getSpacing", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "spacing", "", "e", "Z", "get_isControlGroup", "()Z", "_isControlGroup", "Landroid/view/ViewGroup;", "f", "Lkotlin/Lazy;", "get_view", "()Landroid/view/ViewGroup;", "_view", "", "getControls", "()Ljava/util/List;", "controls", "get_childControls", "_childControls", "Companion", "Defaults", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LinearControlGroup implements Control {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f18899a;

    /* renamed from: b, reason: from kotlin metadata */
    private final LinearControlGroupOrientation orientation;

    /* renamed from: c, reason: from kotlin metadata */
    private final FloatWithUnit spacing;
    private final List d;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean _isControlGroup;

    /* renamed from: f, reason: from kotlin metadata */
    private final Lazy _view;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J,\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/LinearControlGroup$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupBuilder;", "builder", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "orientation", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "spacing", "", "Lcom/scandit/datacapture/core/ui/control/Control;", "controls", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroup;", "_fromBuilderProperties", "", "json", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LinearControlGroup _fromBuilderProperties(@NotNull Context context, @NotNull LinearControlGroupOrientation orientation, @NotNull FloatWithUnit spacing, @NotNull List<? extends Control> controls) {
            Intrinsics.h(context, "context");
            Intrinsics.h(orientation, "orientation");
            Intrinsics.h(spacing, "spacing");
            Intrinsics.h(controls, "controls");
            return new LinearControlGroup(context, orientation, spacing, controls, null);
        }

        @JvmStatic
        @NotNull
        public final LinearControlGroupBuilder builder(@NotNull Context context) {
            Intrinsics.h(context, "context");
            return new LinearControlGroupBuilder(context);
        }

        @JvmStatic
        @NotNull
        public final LinearControlGroup fromJson(@NotNull Context context, @NotNull String json) {
            Intrinsics.h(context, "context");
            Intrinsics.h(json, "json");
            return LinearControlGroupDeserializer.fromJson(context, new JsonValue(json));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/LinearControlGroup$Defaults;", "", "controls", "", "Lcom/scandit/datacapture/core/ui/control/Control;", "getControls", "()Ljava/util/List;", "orientation", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "getOrientation", "()Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "spacing", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "getSpacing", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Defaults {
        @NotNull
        List<Control> getControls();

        @NotNull
        LinearControlGroupOrientation getOrientation();

        @NotNull
        FloatWithUnit getSpacing();
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinearControlGroupOrientation.values().length];
            try {
                iArr[LinearControlGroupOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinearControlGroupOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LinearControlGroup(Context context, LinearControlGroupOrientation linearControlGroupOrientation, FloatWithUnit floatWithUnit, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, linearControlGroupOrientation, floatWithUnit, list);
    }

    public static final ViewGroup access$createView(LinearControlGroup linearControlGroup) {
        int i;
        int pixels;
        int pixels2;
        linearControlGroup.getClass();
        LinearLayout linearLayout = new LinearLayout(linearControlGroup.f18899a);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i2 = WhenMappings.$EnumSwitchMapping$0[linearControlGroup.orientation.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        linearLayout.setOrientation(i);
        int i3 = 0;
        for (Object obj : linearControlGroup.d) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            Control control = (Control) obj;
            View view = control.get_view();
            view.setTag(control.getClass().getSimpleName());
            if (i3 != CollectionsKt.I(linearControlGroup.d)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(view.getLayoutParams());
                int marginEnd = marginLayoutParams.getMarginEnd();
                LinearControlGroupOrientation linearControlGroupOrientation = linearControlGroup.orientation;
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i5 = iArr[linearControlGroupOrientation.ordinal()];
                if (i5 == 1) {
                    pixels = (int) FloatWithUnitExtensionsKt.toPixels(linearControlGroup.spacing, control.get_view().getLayoutParams().width, ContextExtensionsKt.getDisplayDensity(linearControlGroup.f18899a));
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pixels = 0;
                }
                marginLayoutParams.setMarginEnd(marginEnd + pixels);
                int i6 = marginLayoutParams.bottomMargin;
                int i7 = iArr[linearControlGroup.orientation.ordinal()];
                if (i7 == 1) {
                    pixels2 = 0;
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pixels2 = (int) FloatWithUnitExtensionsKt.toPixels(linearControlGroup.spacing, control.get_view().getLayoutParams().height, ContextExtensionsKt.getDisplayDensity(linearControlGroup.f18899a));
                }
                marginLayoutParams.bottomMargin = i6 + pixels2;
                view.setLayoutParams(marginLayoutParams);
            }
            ViewExtensionsKt.runOnMainThread(linearLayout, new g(linearLayout, view));
            i3 = i4;
        }
        return linearLayout;
    }

    @JvmStatic
    @NotNull
    public static final LinearControlGroupBuilder builder(@NotNull Context context) {
        return INSTANCE.builder(context);
    }

    @JvmStatic
    @NotNull
    public static final LinearControlGroup fromJson(@NotNull Context context, @NotNull String str) {
        return INSTANCE.fromJson(context, str);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureContextChanged(@Nullable DataCaptureContext dataCaptureContext) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Control) it.next())._onDataCaptureContextChanged(dataCaptureContext);
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureViewChanged(@Nullable DataCaptureView dataCaptureView) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Control) it.next())._onDataCaptureViewChanged(dataCaptureView);
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onFrameSourceChanged(@Nullable FrameSource frameSource) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Control) it.next())._onFrameSourceChanged(frameSource);
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onRemoveControl() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Control) it.next())._onRemoveControl();
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onZoomGestureChanged(@Nullable ZoomGesture zoomGesture) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Control) it.next())._onZoomGestureChanged(zoomGesture);
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public <T extends Control> void _removeChildControl(@NotNull Class<T> type) {
        Intrinsics.h(type, "type");
        Iterator it = CollectionsKt.A(this.d, type).iterator();
        while (it.hasNext()) {
            _removeChildControl((Control) it.next());
        }
    }

    @NotNull
    public final List<Control> getControls() {
        return this.d;
    }

    @NotNull
    public final LinearControlGroupOrientation getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final FloatWithUnit getSpacing() {
        return this.spacing;
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    @NotNull
    public List<Control> get_childControls() {
        return this.d;
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public boolean get_isControlGroup() {
        return this._isControlGroup;
    }

    private LinearControlGroup(Context context, LinearControlGroupOrientation linearControlGroupOrientation, FloatWithUnit floatWithUnit, List list) {
        this.f18899a = context;
        this.orientation = linearControlGroupOrientation;
        this.spacing = floatWithUnit;
        this.d = CollectionsKt.J0(list);
        this._isControlGroup = true;
        this._view = LazyKt.b(new f(this));
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    @NotNull
    public ViewGroup get_view() {
        return (ViewGroup) this._view.getD();
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _removeChildControl(@NotNull Control control) {
        Intrinsics.h(control, "control");
        if (this.d.remove(control)) {
            control._onRemoveControl();
            ViewExtensionsKt.runOnMainThread(get_view(), new e(this, control));
        }
    }
}
