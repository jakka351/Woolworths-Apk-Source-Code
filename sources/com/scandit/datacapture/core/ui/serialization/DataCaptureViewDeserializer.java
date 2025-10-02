package com.scandit.datacapture.core.ui.serialization;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer;
import com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup.ControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.gesture.SwipeToZoom;
import com.scandit.datacapture.core.ui.gesture.TapToFocus;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u000234B'\b\u0000\u0012\u0006\u0010.\u001a\u00020-\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u00101B\u001f\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b0\u00102J\t\u0010\u0002\u001a\u00020\u0000H\u0097\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0097\u0001J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0097\u0001J\u0013\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0097\u0001J\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001J\u0019\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016J\u0016\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00065"}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerProxy;", "_deserializer", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;", "_impl", "deserializer", "", "_setDeserializer", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;", "helper", "_setHelper", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_setListener", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "_updateViewFromJson", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_viewFromJson", "", "jsonData", "viewFromJson", "updateViewFromJson", "", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "modeDeserializers", "Ljava/util/List;", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer$Helper;", "b", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer$Helper;", "get_helper", "()Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer$Helper;", "_helper", "c", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;)V", "getWarnings", "()Ljava/util/List;", "warnings", "Landroid/content/Context;", "context", "impl", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;)V", "(Landroid/content/Context;Ljava/util/List;)V", "com/scandit/datacapture/core/ui/serialization/a", "Helper", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DataCaptureViewDeserializer implements DataCaptureViewDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ DataCaptureViewDeserializerProxyAdapter f18937a;

    /* renamed from: b, reason: from kotlin metadata */
    private final Helper _helper;

    /* renamed from: c, reason: from kotlin metadata */
    private DataCaptureViewDeserializerListener listener;

    @Keep
    @NotNull
    private final List<DataCaptureModeDeserializer> modeDeserializers;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer$Helper;", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "", "clear", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "createView", "createdNullFocusGesture", "", "showUIIndicator", "Lcom/scandit/datacapture/core/ui/gesture/TapToFocus;", "createTapToFocus", "createdNullZoomGesture", "Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoom;", "createSwipeToZoom", "view", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "updateViewFromJson", "b", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "getDeserializedView$scandit_capture_core", "()Lcom/scandit/datacapture/core/ui/DataCaptureView;", "setDeserializedView$scandit_capture_core", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "deserializedView", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class Helper implements DataCaptureViewDeserializerHelper, DataCaptureDeserializerHelper {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f18938a;

        /* renamed from: b, reason: from kotlin metadata */
        private DataCaptureView deserializedView;
        private boolean c;
        private TapToFocus d;
        private boolean e;
        private SwipeToZoom f;
        private final ControlDeserializer g;

        public Helper(@NotNull Context context) {
            Intrinsics.h(context, "context");
            this.f18938a = new WeakReference(context);
            this.g = new ControlDeserializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void a(DataCaptureView dataCaptureView, JsonValue jsonValue) {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayListJ0 = CollectionsKt.J0(dataCaptureView.getControls$scandit_capture_core());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                JsonValue byKeyAsArray = jsonValue.getByKeyAsArray("controls", null);
                if (byKeyAsArray != null) {
                    int size = (int) byKeyAsArray.getSize();
                    for (int i = 0; i < size; i++) {
                        JsonValue jsonValueRequireByIndex = byKeyAsArray.requireByIndex(i);
                        ControlDeserializer controlDeserializer = this.g;
                        Context context = dataCaptureView.getContext();
                        Intrinsics.g(context, "view.context");
                        controlDeserializer.deserializeControl(context, jsonValueRequireByIndex, arrayListJ0, new c(arrayList, arrayListJ0, arrayList2, linkedHashMap, linkedHashMap2));
                    }
                }
                Iterator it = arrayListJ0.iterator();
                while (it.hasNext()) {
                    dataCaptureView.removeControl((Control) it.next());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Control control = (Control) it2.next();
                    dataCaptureView.removeControl(control);
                    Anchor anchor = (Anchor) linkedHashMap.get(control);
                    PointWithUnit pointWithUnit = (PointWithUnit) linkedHashMap2.get(control);
                    if (anchor == null || pointWithUnit == null) {
                        dataCaptureView.addControl(control);
                    } else {
                        dataCaptureView.addControl(control, anchor, pointWithUnit);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Control control2 = (Control) it3.next();
                    Anchor anchor2 = (Anchor) linkedHashMap.get(control2);
                    PointWithUnit pointWithUnit2 = (PointWithUnit) linkedHashMap2.get(control2);
                    if (anchor2 == null || pointWithUnit2 == null) {
                        dataCaptureView.addControl(control2);
                    } else {
                        dataCaptureView.addControl(control2, anchor2, pointWithUnit2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
        public void clear() {
            this.deserializedView = null;
            this.c = false;
            this.d = null;
            this.e = false;
            this.f = null;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        @NotNull
        public SwipeToZoom createSwipeToZoom() {
            SwipeToZoom swipeToZoom = new SwipeToZoom();
            this.f = swipeToZoom;
            this.e = true;
            return swipeToZoom;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        @NotNull
        public TapToFocus createTapToFocus(boolean showUIIndicator) {
            TapToFocus tapToFocus = new TapToFocus();
            tapToFocus.setShowUIIndicator(showUIIndicator);
            this.d = tapToFocus;
            this.c = true;
            return tapToFocus;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        @NotNull
        public DataCaptureView createView(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Context applicationContext = (Context) this.f18938a.get();
            if (applicationContext == null) {
                applicationContext = AppAndroidEnvironment.INSTANCE.getApplicationContext();
            }
            Context context = applicationContext;
            Intrinsics.g(context, "context.get() ?: AppAndr…onment.applicationContext");
            NativeVideoPreview nativeVideoPreviewCreate = NativeVideoPreview.create();
            Intrinsics.g(nativeVideoPreviewCreate, "create()");
            DataCaptureView dataCaptureView = new DataCaptureView(context, dataCaptureContext, nativeVideoPreviewCreate, null, BitmapDescriptorFactory.HUE_RED, 24, null);
            this.deserializedView = dataCaptureView;
            return dataCaptureView;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public void createdNullFocusGesture() {
            this.c = true;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public void createdNullZoomGesture() {
            this.e = true;
        }

        @Nullable
        /* renamed from: getDeserializedView$scandit_capture_core, reason: from getter */
        public final DataCaptureView getDeserializedView() {
            return this.deserializedView;
        }

        public final void setDeserializedView$scandit_capture_core(@Nullable DataCaptureView dataCaptureView) {
            this.deserializedView = dataCaptureView;
        }

        @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerHelper
        public void updateViewFromJson(@NotNull DataCaptureView view, @NotNull JsonValue json) {
            Intrinsics.h(view, "view");
            Intrinsics.h(json, "json");
            if (this.c) {
                view.setFocusGesture(this.d);
            }
            if (this.e) {
                view.setZoomGesture(this.f);
            }
            view.set_optimizesRendering$scandit_capture_core(json.getByKeyAsBoolean("optimizesRendering", view.get_optimizesRendering()));
            if (view.getParent() == null) {
                a(view, json);
            } else {
                ViewExtensionsKt.runOnMainThread(view, new b(this, view, json));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataCaptureViewDeserializer(@NotNull Context context, @NotNull List<? extends DataCaptureModeDeserializer> modeDeserializers, @NotNull NativeDataCaptureViewDeserializer impl) {
        Intrinsics.h(context, "context");
        Intrinsics.h(modeDeserializers, "modeDeserializers");
        Intrinsics.h(impl, "impl");
        this.modeDeserializers = modeDeserializers;
        this.f18937a = new DataCaptureViewDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Helper helper = new Helper(context);
        this._helper = helper;
        _setDeserializer(this);
        _setHelper(helper);
        impl.setListener(new DataCaptureViewDeserializerListenerReversedAdapter(new a(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public DataCaptureViewDeserializer _deserializer() {
        return this.f18937a._deserializer();
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeDataCaptureViewDeserializer getF18941a() {
        return this.f18937a.getF18941a();
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxySetter
    public void _setDeserializer(@NotNull DataCaptureViewDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.f18937a._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(@Nullable DataCaptureViewDeserializerHelper helper) {
        this.f18937a._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(nativeName = "setListener")
    public void _setListener(@Nullable DataCaptureViewDeserializerListener listener) {
        this.f18937a._setListener(listener);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(nativeName = "updateViewFromJson")
    @NotNull
    public DataCaptureView _updateViewFromJson(@NotNull DataCaptureView view, @NotNull JsonValue json) {
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        return this.f18937a._updateViewFromJson(view, json);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(nativeName = "viewFromJson")
    @NotNull
    public DataCaptureView _viewFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull JsonValue json) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(json, "json");
        return this.f18937a._viewFromJson(dataCaptureContext, json);
    }

    @Nullable
    public final DataCaptureViewDeserializerListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.f18937a.getWarnings();
    }

    @NotNull
    public final Helper get_helper() {
        return this._helper;
    }

    public final void setListener(@Nullable DataCaptureViewDeserializerListener dataCaptureViewDeserializerListener) {
        this.listener = dataCaptureViewDeserializerListener;
    }

    @NotNull
    public final DataCaptureView updateViewFromJson(@NotNull DataCaptureView view, @NotNull String jsonData) {
        Intrinsics.h(view, "view");
        Intrinsics.h(jsonData, "jsonData");
        return _updateViewFromJson(view, new JsonValue(jsonData));
    }

    @NotNull
    public final DataCaptureView viewFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        DataCaptureView dataCaptureView_viewFromJson = _viewFromJson(dataCaptureContext, new JsonValue(jsonData));
        this._helper.clear();
        return dataCaptureView_viewFromJson;
    }

    public DataCaptureViewDeserializer(@NotNull Context context, @NotNull List<? extends DataCaptureModeDeserializer> modeDeserializers) {
        Intrinsics.h(context, "context");
        Intrinsics.h(modeDeserializers, "modeDeserializers");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(modeDeserializers, 10));
        Iterator<T> it = modeDeserializers.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataCaptureModeDeserializer) it.next()).getC());
        }
        NativeDataCaptureViewDeserializer nativeDataCaptureViewDeserializerCreate = NativeDataCaptureViewDeserializer.create(new ArrayList(arrayList));
        Intrinsics.g(nativeDataCaptureViewDeserializerCreate, "create(\n            Arra…alizerImpl() })\n        )");
        this(context, modeDeserializers, nativeDataCaptureViewDeserializerCreate);
    }
}
