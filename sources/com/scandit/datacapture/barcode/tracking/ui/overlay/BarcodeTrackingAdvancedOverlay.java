package com.scandit.datacapture.barcode.tracking.ui.overlay;

import android.annotation.SuppressLint;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.B6;
import com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking;
import com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener;
import com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingSession;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.internal.sdk.utils.ArImagesLicenseFeature;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001/J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u000bJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014R$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010*\u001a\u00020$2\u0006\u0010%\u001a\u00020$8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAdvancedOverlay;", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "_impl", "", "jsonData", "", "updateFromJson", "trackedBarcode", "Landroid/view/View;", "view", "setViewForTrackedBarcode", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "setAnchorForTrackedBarcode", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "setOffsetForTrackedBarcode", "clearTrackedBarcodeViews", "trackedObject", "_viewForTrackedObject", "_anchorForTrackedObject", "_offsetForTrackedObject", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlayListener;", "c", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlayListener;", "getListener", "()Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlayListener;", "setListener", "(Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlayListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "<set-?>", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "getRequireArFeatureAvailabilityFromContext", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "requireArFeatureAvailabilityFromContext", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SuppressLint
/* loaded from: classes6.dex */
public final class BarcodeTrackingAdvancedOverlay extends TrackedObjectAdvancedOverlay<TrackedBarcode> implements DataCaptureOverlay, BarcodeTrackingAdvancedOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ BarcodeTrackingAdvancedOverlayProxyAdapter b;

    /* renamed from: c, reason: from kotlin metadata */
    private BarcodeTrackingAdvancedOverlayListener listener;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay$Companion;", "", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;", "newInstance", "deserializerInstance$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;Lcom/scandit/datacapture/core/ui/DataCaptureView;)Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;", "deserializerInstance", "", "jsonData", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BarcodeTrackingAdvancedOverlay deserializerInstance$scandit_barcode_capture(@NotNull BarcodeTracking mode, @Nullable DataCaptureView view) {
            Intrinsics.h(mode, "mode");
            BarcodeTrackingAdvancedOverlay barcodeTrackingAdvancedOverlay = new BarcodeTrackingAdvancedOverlay(mode, view, new B6(), ArImagesLicenseFeature.INSTANCE.allowed(), null);
            if (view != null) {
                view.addOverlay(barcodeTrackingAdvancedOverlay);
            }
            return barcodeTrackingAdvancedOverlay;
        }

        @JvmStatic
        @NotNull
        public final BarcodeTrackingAdvancedOverlay fromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeTrackingDeserializer().advancedOverlayFromJson(mode, jsonData);
        }

        @JvmStatic
        @NotNull
        public final BarcodeTrackingAdvancedOverlay newInstance(@NotNull BarcodeTracking mode, @Nullable DataCaptureView view) {
            Intrinsics.h(mode, "mode");
            BarcodeTrackingAdvancedOverlay barcodeTrackingAdvancedOverlay = new BarcodeTrackingAdvancedOverlay(mode, view, new B6(), ArImagesLicenseFeature.INSTANCE.forMode(mode), null);
            if (view != null) {
                view.addOverlay(barcodeTrackingAdvancedOverlay);
            }
            return barcodeTrackingAdvancedOverlay;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeTrackingAdvancedOverlay(BarcodeTracking barcodeTracking, DataCaptureView dataCaptureView, TrackedObjectAugmenter.Factory factory, ArImagesLicenseFeature arImagesLicenseFeature, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeTracking, dataCaptureView, factory, arImagesLicenseFeature);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeTrackingAdvancedOverlay fromJson(@NotNull BarcodeTracking barcodeTracking, @NotNull String str) {
        return INSTANCE.fromJson(barcodeTracking, str);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeTrackingAdvancedOverlay newInstance(@NotNull BarcodeTracking barcodeTracking, @Nullable DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeTracking, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getD() {
        return this.b.getD();
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlayProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeTrackingAdvancedOverlay getB() {
        return this.b.getB();
    }

    public final void clearTrackedBarcodeViews() {
        clearTrackedObjectViews();
    }

    @Nullable
    public final BarcodeTrackingAdvancedOverlayListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    @NotNull
    public NativeFeatureAvailability getRequireArFeatureAvailabilityFromContext() {
        NativeFeatureAvailability nativeFeatureAvailabilityRequireArFeatureAvailabilityFromContext = getB().requireArFeatureAvailabilityFromContext();
        Intrinsics.g(nativeFeatureAvailabilityRequireArFeatureAvailabilityFromContext, "_impl().requireArFeatureAvailabilityFromContext()");
        return nativeFeatureAvailabilityRequireArFeatureAvailabilityFromContext;
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    public final void setAnchorForTrackedBarcode(@NotNull TrackedBarcode trackedBarcode, @NotNull Anchor anchor) {
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        Intrinsics.h(anchor, "anchor");
        setAnchorForTrackedObject(trackedBarcode, anchor);
    }

    public final void setListener(@Nullable BarcodeTrackingAdvancedOverlayListener barcodeTrackingAdvancedOverlayListener) {
        this.listener = barcodeTrackingAdvancedOverlayListener;
    }

    public final void setOffsetForTrackedBarcode(@NotNull TrackedBarcode trackedBarcode, @NotNull PointWithUnit offset) {
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        Intrinsics.h(offset, "offset");
        setOffsetForTrackedObject(trackedBarcode, offset);
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    public final void setViewForTrackedBarcode(@NotNull TrackedBarcode trackedBarcode, @Nullable View view) {
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        setViewForTrackedObject(trackedBarcode, view);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    public void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeTrackingDeserializer().updateAdvancedOverlayFromJson(this, jsonData);
    }

    private BarcodeTrackingAdvancedOverlay(BarcodeTracking barcodeTracking, DataCaptureView dataCaptureView, TrackedObjectAugmenter.Factory factory, ArImagesLicenseFeature arImagesLicenseFeature) {
        super(barcodeTracking, dataCaptureView, factory, arImagesLicenseFeature);
        NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlayCreate = NativeBarcodeTrackingAdvancedOverlay.create(barcodeTracking.getF18153a());
        Intrinsics.g(nativeBarcodeTrackingAdvancedOverlayCreate, "create(mode._impl())");
        this.b = new BarcodeTrackingAdvancedOverlayProxyAdapter(nativeBarcodeTrackingAdvancedOverlayCreate, null, 2, null);
        barcodeTracking.getListeners$scandit_barcode_capture().add(0, new BarcodeTrackingListener() { // from class: com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay$barcodeTrackingListener$1
            @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener
            @ProxyFunction
            public void onObservationStarted(@NotNull BarcodeTracking barcodeTracking2) {
                BarcodeTrackingListener.DefaultImpls.onObservationStarted(this, barcodeTracking2);
            }

            @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener
            @ProxyFunction
            public void onObservationStopped(@NotNull BarcodeTracking barcodeTracking2) {
                BarcodeTrackingListener.DefaultImpls.onObservationStopped(this, barcodeTracking2);
            }

            @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingListener
            public void onSessionUpdated(@NotNull BarcodeTracking mode, @NotNull BarcodeTrackingSession session, @NotNull FrameData data) {
                Intrinsics.h(mode, "mode");
                Intrinsics.h(session, "session");
                Intrinsics.h(data, "data");
                BarcodeTrackingAdvancedOverlay barcodeTrackingAdvancedOverlay = this.f18204a;
                long frameSequenceId = session.getFrameSequenceId();
                List<TrackedBarcode> addedTrackedBarcodes = session.getAddedTrackedBarcodes();
                List<TrackedBarcode> updatedTrackedBarcodes = session.getUpdatedTrackedBarcodes();
                List<Integer> removedTrackedBarcodes = session.getRemovedTrackedBarcodes();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(removedTrackedBarcodes, 10));
                Iterator<T> it = removedTrackedBarcodes.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).intValue()));
                }
                barcodeTrackingAdvancedOverlay.updateTrackedObjects(frameSequenceId, addedTrackedBarcodes, updatedTrackedBarcodes, arrayList);
            }
        });
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    @Nullable
    public Anchor _anchorForTrackedObject(@NotNull TrackedBarcode trackedObject) {
        Intrinsics.h(trackedObject, "trackedObject");
        BarcodeTrackingAdvancedOverlayListener barcodeTrackingAdvancedOverlayListener = this.listener;
        if (barcodeTrackingAdvancedOverlayListener != null) {
            return barcodeTrackingAdvancedOverlayListener.anchorForTrackedBarcode(this, trackedObject);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    @Nullable
    public PointWithUnit _offsetForTrackedObject(@NotNull TrackedBarcode trackedObject, @NotNull View view) {
        Intrinsics.h(trackedObject, "trackedObject");
        Intrinsics.h(view, "view");
        BarcodeTrackingAdvancedOverlayListener barcodeTrackingAdvancedOverlayListener = this.listener;
        if (barcodeTrackingAdvancedOverlayListener != null) {
            return barcodeTrackingAdvancedOverlayListener.offsetForTrackedBarcode(this, trackedObject, view);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay
    @Nullable
    public View _viewForTrackedObject(@NotNull TrackedBarcode trackedObject) {
        Intrinsics.h(trackedObject, "trackedObject");
        BarcodeTrackingAdvancedOverlayListener barcodeTrackingAdvancedOverlayListener = this.listener;
        if (barcodeTrackingAdvancedOverlayListener != null) {
            return barcodeTrackingAdvancedOverlayListener.viewForTrackedBarcode(this, trackedObject);
        }
        return null;
    }
}
