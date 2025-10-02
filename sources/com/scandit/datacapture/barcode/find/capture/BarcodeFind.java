package com.scandit.datacapture.barcode.find.capture;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.R7;
import com.scandit.datacapture.barcode.find.feedback.BarcodeFindFeedback;
import com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindTransformer;
import com.scandit.datacapture.barcode.internal.module.find.ui.listener.SearchedItemsUpdateListener;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.extensions.FeedbackExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0004<=>?B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\t\u001a\u00020\u0007H\u0097\u0001J\t\u0010\n\u001a\u00020\u0007H\u0097\u0001J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b$\u0010\"J\u000e\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&R*\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0002022\u0006\u00103\u001a\u0002028W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006@"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindProxy;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/NativeBarcodeFind;", "_impl", "", "pause", "start", "stop", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_setDataCaptureContext", "", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItem;", "items", "setItemList", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "settings", "applySettings", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/InternalBarcodeFindListener;", "addOverlayListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/find/capture/InternalBarcodeFindListener;)V", "addOverlayListener", "removeOverlayListener$scandit_barcode_capture", "removeOverlayListener", "Lcom/scandit/datacapture/barcode/internal/module/find/ui/listener/SearchedItemsUpdateListener;", "searchedItemsUpdateListener", "addSearchedItemsUpdateListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/find/ui/listener/SearchedItemsUpdateListener;)V", "addSearchedItemsUpdateListener", "removeSearchedItemsUpdateListener$scandit_barcode_capture", "removeSearchedItemsUpdateListener", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindTransformer;", "transformer", "setTransformer", "Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "value", "b", "Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "getFeedback", "()Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "setFeedback", "(Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;)V", "feedback", "", "<set-?>", "isEnabled", "()Z", "setEnabled", "(Z)V", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "<init>", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;)V", "Companion", "com/scandit/datacapture/barcode/find/capture/a", "com/scandit/datacapture/barcode/find/capture/b", "InternalTransformer", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeFind implements DataCaptureMode, BarcodeFindProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeFindProxy f17654a;

    /* renamed from: b, reason: from kotlin metadata */
    private BarcodeFindFeedback feedback;
    private DataCaptureContext c;
    private Map d;
    private final Object e;
    private final CopyOnWriteArraySet f;
    private final CopyOnWriteArraySet g;
    private final CopyOnWriteArraySet h;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind$Companion;", "", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindProxy;", "proxy", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "withProxy$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindProxy;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "withProxy", "Lcom/scandit/datacapture/core/source/CameraSettings;", "getRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/source/CameraSettings;", "getRecommendedCameraSettings$annotations", "()V", "recommendedCameraSettings", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getRecommendedCameraSettings$annotations() {
        }

        @NotNull
        public final CameraSettings getRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.MANUAL_UNTIL_CAPTURE);
            cameraSettings.setZoomGestureZoomFactor(1.0f);
            cameraSettings.setProperty("focusStrategy", "continuousUntilNoScan");
            cameraSettings.setProperty("scanPhaseNoSreTimeout", Float.valueOf(3.0f));
            cameraSettings.setProperty("exposureTargetBias", Float.valueOf(-1.0f));
            return cameraSettings;
        }

        @VisibleForTesting
        @NotNull
        public final BarcodeFind withProxy$scandit_barcode_capture(@NotNull BarcodeFindProxy proxy) {
            Intrinsics.h(proxy, "proxy");
            return new BarcodeFind(proxy, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind$InternalTransformer;", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/NativeBarcodeFindTransformer;", "", "transformBarcodeData", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindTransformer;", "transformer", "<init>", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindTransformer;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    @VisibleForTesting
    public static final class InternalTransformer extends NativeBarcodeFindTransformer {

        /* renamed from: a, reason: collision with root package name */
        private final BarcodeFindTransformer f17655a;

        public InternalTransformer(@NotNull BarcodeFindTransformer transformer) {
            Intrinsics.h(transformer, "transformer");
            this.f17655a = transformer;
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindTransformer
        @Nullable
        public String transformBarcodeData(@Nullable String transformBarcodeData) {
            return this.f17655a.transformBarcodeData(transformBarcodeData);
        }
    }

    public /* synthetic */ BarcodeFind(BarcodeFindProxy barcodeFindProxy, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeFindProxy);
    }

    private final void a(LinkedHashMap linkedHashMap) {
        synchronized (this.e) {
            this.d = linkedHashMap;
        }
    }

    public static final Map access$getSearchedItems(BarcodeFind barcodeFind) {
        Map map;
        synchronized (barcodeFind.e) {
            map = barcodeFind.d;
        }
        return map;
    }

    @NotNull
    public static final CameraSettings getRecommendedCameraSettings() {
        return INSTANCE.getRecommendedCameraSettings();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NativeImpl
    @NotNull
    public NativeDataCaptureMode _dataCaptureModeImpl() {
        return this.f17654a.getC();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeFind getF17661a() {
        return this.f17654a.getF17661a();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public void _setDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext) {
        this.c = dataCaptureContext;
    }

    public final void addListener(@NotNull BarcodeFindListener listener) {
        Intrinsics.h(listener, "listener");
        this.f.add(listener);
    }

    public final void addOverlayListener$scandit_barcode_capture(@NotNull InternalBarcodeFindListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.g.add(listener)) {
            listener.a(this);
        }
    }

    public final void addSearchedItemsUpdateListener$scandit_barcode_capture(@NotNull SearchedItemsUpdateListener searchedItemsUpdateListener) {
        Map map;
        Intrinsics.h(searchedItemsUpdateListener, "searchedItemsUpdateListener");
        if (this.h.add(searchedItemsUpdateListener)) {
            synchronized (this.e) {
                map = this.d;
            }
            searchedItemsUpdateListener.a(map);
        }
    }

    public final void applySettings(@NotNull BarcodeFindSettings settings) {
        Intrinsics.h(settings, "settings");
        getF17661a().applySettingsWrapped(settings._impl());
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    @Nullable
    /* renamed from: getDataCaptureContext, reason: from getter */
    public DataCaptureContext getC() {
        return this.c;
    }

    @NotNull
    public final BarcodeFindFeedback getFeedback() {
        return this.feedback;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.f17654a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    @ProxyFunction(nativeName = "pauseAsync")
    public void pause() {
        this.f17654a.pause();
    }

    public final void removeListener(@NotNull BarcodeFindListener listener) {
        Intrinsics.h(listener, "listener");
        this.f.remove(listener);
    }

    public final void removeOverlayListener$scandit_barcode_capture(@NotNull InternalBarcodeFindListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.g.remove(listener)) {
            listener.b(this);
        }
    }

    public final void removeSearchedItemsUpdateListener$scandit_barcode_capture(@NotNull SearchedItemsUpdateListener searchedItemsUpdateListener) {
        Intrinsics.h(searchedItemsUpdateListener, "searchedItemsUpdateListener");
        this.h.remove(searchedItemsUpdateListener);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z) {
        this.f17654a.setEnabled(z);
    }

    public final void setFeedback(@NotNull BarcodeFindFeedback value) {
        Intrinsics.h(value, "value");
        this.feedback = value;
        a(value);
    }

    public final void setItemList(@NotNull Set<BarcodeFindItem> items) {
        Intrinsics.h(items, "items");
        synchronized (this.e) {
            try {
                NativeBarcodeFind nativeBarcodeFind_impl = getF17661a();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(NativeBarcodeFindItem.create(((BarcodeFindItem) it.next()).getSearchOptions().getBarcodeData()));
                }
                nativeBarcodeFind_impl.setItemListAsync(CollectionsKt.E0(arrayList));
                int iH = MapsKt.h(CollectionsKt.s(items, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                for (Object obj : items) {
                    linkedHashMap.put(((BarcodeFindItem) obj).getSearchOptions().getBarcodeData(), obj);
                }
                Iterator it2 = this.h.iterator();
                while (it2.hasNext()) {
                    ((SearchedItemsUpdateListener) it2.next()).a(linkedHashMap);
                }
                a(linkedHashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setTransformer(@NotNull BarcodeFindTransformer transformer) {
        Intrinsics.h(transformer, "transformer");
        getF17661a().setBarcodeFindTransformerAsync(new InternalTransformer(transformer));
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    @ProxyFunction(nativeName = "startAsync")
    public void start() {
        this.f17654a.start();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    @ProxyFunction(nativeName = "stopAsync")
    public void stop() {
        this.f17654a.stop();
    }

    private BarcodeFind(BarcodeFindProxy barcodeFindProxy) {
        this.f17654a = barcodeFindProxy;
        BarcodeFindFeedback barcodeFindFeedbackDefaultFeedback = BarcodeFindFeedback.INSTANCE.defaultFeedback();
        a(barcodeFindFeedbackDefaultFeedback);
        this.feedback = barcodeFindFeedbackDefaultFeedback;
        this.d = EmptyMap.d;
        this.e = new Object();
        this.f = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        getF17661a().addListenerAsync(new R7(new b(this), this), NativeDataCaptureContext.getListenerPriorityUser());
        getF17661a().addListenerAsync(new R7(new a(this), this), NativeDataCaptureContext.getListenerPriorityOverlay());
    }

    private final void a(final BarcodeFindFeedback barcodeFindFeedback) {
        getF17661a().setFeedback(new NativeFeedback() { // from class: com.scandit.datacapture.barcode.find.capture.BarcodeFind$setNativeFeedback$1
            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void emit() {
                barcodeFindFeedback.getFound().emit();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onFreeResources() {
                barcodeFindFeedback.getFound().release();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onLoadResources() {
                FeedbackExtensionsKt.loadSoundResource(barcodeFindFeedback.getFound());
            }
        });
        getF17661a().setItemListUpdatedFeedback(new NativeFeedback() { // from class: com.scandit.datacapture.barcode.find.capture.BarcodeFind$setNativeFeedback$2
            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void emit() {
                barcodeFindFeedback.getItemListUpdated().emit();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onFreeResources() {
                barcodeFindFeedback.getItemListUpdated().release();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onLoadResources() {
                FeedbackExtensionsKt.loadSoundResource(barcodeFindFeedback.getItemListUpdated());
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeFind(@NotNull BarcodeFindSettings settings) {
        Intrinsics.h(settings, "settings");
        NativeBarcodeFind nativeBarcodeFindCreate = NativeBarcodeFind.create(null, settings._impl());
        Intrinsics.g(nativeBarcodeFindCreate, "create(\n                …ngs._impl()\n            )");
        this(new BarcodeFindProxyAdapter(nativeBarcodeFindCreate, null, 2, 0 == true ? 1 : 0));
    }
}
