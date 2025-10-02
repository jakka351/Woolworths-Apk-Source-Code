package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.salesforce.marketingcloud.UrlHandler;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.internal.sdk.utils.ArImagesLicenseFeature;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.DataCaptureViewListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 @*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002@AB/\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J:\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0004J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\fH&J!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0005J\b\u0010\u001e\u001a\u00020\u0005H\u0014J\b\u0010\u001f\u001a\u00020\u0005H\u0014J\u0019\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00028\u0000H$¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00028\u0000H$¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0012H$¢\u0006\u0004\b$\u0010%R*\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00028\u00000.8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006B"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAdvancedOverlay;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ViewBasedDataCaptureOverlay;", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "", "_setDataCaptureView", "", "frameSequenceId", "", "addedTrackedObjects", "updatedTrackedObjects", "", "removedTrackedObjects", "updateTrackedObjects", "jsonData", "updateFromJson", "trackedObject", "Landroid/view/View;", "setViewForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)V", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "setAnchorForTrackedObject", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "setOffsetForTrackedObject", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "clearTrackedObjectViews", "onAttachedToWindow", "onDetachedFromWindow", "_viewForTrackedObject", "(Ljava/lang/Object;)Landroid/view/View;", "_anchorForTrackedObject", "(Ljava/lang/Object;)Lcom/scandit/datacapture/core/common/geometry/Anchor;", "_offsetForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "getDataCaptureView", "()Ljava/lang/ref/WeakReference;", "setDataCaptureView", "(Ljava/lang/ref/WeakReference;)V", "dataCaptureView", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "h", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "getAugmenter", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "augmenter", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "getRequireArFeatureAvailabilityFromContext", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "requireArFeatureAvailabilityFromContext", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Factory;", "augmenterFactory", "Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;", "imagesLicenseFeature", "<init>", "(Lcom/scandit/datacapture/core/capture/DataCaptureMode;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Factory;Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;)V", "Companion", "TrackedObjectAugmenterHost", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class TrackedObjectAdvancedOverlay<T> extends ViewBasedDataCaptureOverlay {
    public static final long CORRECT_VIEW_POSITIONS_DELAY_MILLIS = 100;

    /* renamed from: a, reason: collision with root package name */
    private long f18747a;

    /* renamed from: b, reason: from kotlin metadata */
    private WeakReference dataCaptureView;
    private DataCaptureViewSize c;
    private DataCaptureViewSize d;
    private final Runnable e;
    private final TrackedObjectAdvancedOverlay$dataCaptureViewSizeChangedListener$1 f;
    private NativeFeatureAvailability g;

    /* renamed from: h, reason: from kotlin metadata */
    private final TrackedObjectAugmenter augmenter;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAdvancedOverlay$TrackedObjectAugmenterHost;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "Landroid/view/View;", "view", "", "addAugmentedView", "removeAugmentedView", "Lkotlin/Function0;", UrlHandler.ACTION, "post", "", "delayMillis", "postDelayed", "trackedObject", "viewForTrackedObject", "(Ljava/lang/Object;)Landroid/view/View;", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchorForTrackedObject", "(Ljava/lang/Object;)Lcom/scandit/datacapture/core/common/geometry/Anchor;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offsetForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "quadrilateral", "mapFrameQuadrilateralToView", "Lcom/scandit/datacapture/core/common/geometry/Point;", "point", "mapFramePointToView", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAdvancedOverlay;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public final class TrackedObjectAugmenterHost implements TrackedObjectAugmenter.Host<T> {
        public TrackedObjectAugmenterHost() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Function0 tmp0) {
            Intrinsics.h(tmp0, "$tmp0");
            tmp0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Function0 tmp0) {
            Intrinsics.h(tmp0, "$tmp0");
            tmp0.invoke();
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public void addAugmentedView(@NotNull View view) {
            Intrinsics.h(view, "view");
            TrackedObjectAdvancedOverlay.this.addView(view);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        @Nullable
        public Anchor anchorForTrackedObject(T trackedObject) {
            return TrackedObjectAdvancedOverlay.this._anchorForTrackedObject(trackedObject);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        @NotNull
        public Point mapFramePointToView(@NotNull Point point) {
            Point pointMapFramePointToView;
            Intrinsics.h(point, "point");
            DataCaptureView dataCaptureView = TrackedObjectAdvancedOverlay.this.getDataCaptureView().get();
            return (dataCaptureView == null || (pointMapFramePointToView = dataCaptureView.mapFramePointToView(point)) == null) ? point : pointMapFramePointToView;
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        @NotNull
        public Quadrilateral mapFrameQuadrilateralToView(@NotNull Quadrilateral quadrilateral) {
            Quadrilateral quadrilateralMapFrameQuadrilateralToView;
            Intrinsics.h(quadrilateral, "quadrilateral");
            DataCaptureView dataCaptureView = TrackedObjectAdvancedOverlay.this.getDataCaptureView().get();
            return (dataCaptureView == null || (quadrilateralMapFrameQuadrilateralToView = dataCaptureView.mapFrameQuadrilateralToView(quadrilateral)) == null) ? quadrilateral : quadrilateralMapFrameQuadrilateralToView;
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        @Nullable
        public PointWithUnit offsetForTrackedObject(T trackedObject, @NotNull View view) {
            Intrinsics.h(view, "view");
            return TrackedObjectAdvancedOverlay.this._offsetForTrackedObject(trackedObject, view);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public void post(@NotNull Function0<Unit> action) {
            Intrinsics.h(action, "action");
            TrackedObjectAdvancedOverlay.this.post(new androidx.compose.ui.viewinterop.a(9, action));
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public void postDelayed(long delayMillis, @NotNull Function0<Unit> action) {
            Intrinsics.h(action, "action");
            TrackedObjectAdvancedOverlay.this.postDelayed(new androidx.compose.ui.viewinterop.a(10, action), delayMillis);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        public void removeAugmentedView(@NotNull View view) {
            Intrinsics.h(view, "view");
            TrackedObjectAdvancedOverlay.this.removeView(view);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Host
        @Nullable
        public View viewForTrackedObject(T trackedObject) {
            return TrackedObjectAdvancedOverlay.this._viewForTrackedObject(trackedObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay$dataCaptureViewSizeChangedListener$1] */
    public TrackedObjectAdvancedOverlay(@NotNull DataCaptureMode mode, @Nullable DataCaptureView dataCaptureView, @NotNull TrackedObjectAugmenter.Factory<T> augmenterFactory, @NotNull ArImagesLicenseFeature imagesLicenseFeature) {
        super(AppAndroidEnvironment.INSTANCE.getApplicationContext());
        Intrinsics.h(mode, "mode");
        Intrinsics.h(augmenterFactory, "augmenterFactory");
        Intrinsics.h(imagesLicenseFeature, "imagesLicenseFeature");
        OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, dataCaptureView, b.f18753a);
        this.dataCaptureView = new WeakReference(dataCaptureView);
        this.e = new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f(this, 7);
        this.f = new DataCaptureViewListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay$dataCaptureViewSizeChangedListener$1
            @Override // com.scandit.datacapture.core.ui.DataCaptureViewListener
            public void onSizeChanged(int width, int height, int screenRotation) {
                TrackedObjectAdvancedOverlay.access$onDataCaptureViewSizeChanged(this.f18749a, width, height, screenRotation);
            }
        };
        this.g = NativeFeatureAvailability.UNKNOWN;
        this.augmenter = augmenterFactory.forHost(new TrackedObjectAugmenterHost(), imagesLicenseFeature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TrackedObjectAdvancedOverlay this$0, long j, Iterable addedTrackedObjects, Iterable updatedTrackedObjects, Iterable removedTrackedObjects) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(addedTrackedObjects, "$addedTrackedObjects");
        Intrinsics.h(updatedTrackedObjects, "$updatedTrackedObjects");
        Intrinsics.h(removedTrackedObjects, "$removedTrackedObjects");
        if (this$0.f18747a != j) {
            this$0.f18747a = j;
            this$0.augmenter.clearAugmentations();
        }
        this$0.augmenter.setAugmentations(addedTrackedObjects, updatedTrackedObjects, removedTrackedObjects);
    }

    public static final void access$onDataCaptureViewSizeChanged(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, int i, int i2, int i3) {
        trackedObjectAdvancedOverlay.getClass();
        trackedObjectAdvancedOverlay.c = new DataCaptureViewSize(new Size2(i, i2), i3);
        trackedObjectAdvancedOverlay.removeCallbacks(trackedObjectAdvancedOverlay.e);
        trackedObjectAdvancedOverlay.postDelayed(trackedObjectAdvancedOverlay.e, 100L);
    }

    @Nullable
    public abstract Anchor _anchorForTrackedObject(T trackedObject);

    @Nullable
    public abstract PointWithUnit _offsetForTrackedObject(T trackedObject, @NotNull View view);

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public void _setDataCaptureView(@NotNull DataCaptureView view) {
        Intrinsics.h(view, "view");
        this.dataCaptureView = new WeakReference(view);
        if (isAttachedToWindow()) {
            view.addListener(this.f);
        }
    }

    @Nullable
    public abstract View _viewForTrackedObject(T trackedObject);

    public final void clearTrackedObjectViews() {
        ViewExtensionsKt.runOnMainThread(this, new c(this));
    }

    @NotNull
    public final TrackedObjectAugmenter<T> getAugmenter() {
        return this.augmenter;
    }

    @NotNull
    public final WeakReference<DataCaptureView> getDataCaptureView() {
        return this.dataCaptureView;
    }

    @NotNull
    public abstract NativeFeatureAvailability getRequireArFeatureAvailabilityFromContext();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.augmenter.onHostAttachedToWindow();
        DataCaptureView dataCaptureView = (DataCaptureView) this.dataCaptureView.get();
        if (dataCaptureView != null) {
            dataCaptureView.addListener(this.f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataCaptureView dataCaptureView = (DataCaptureView) this.dataCaptureView.get();
        if (dataCaptureView != null) {
            dataCaptureView.removeListener(this.f);
        }
        this.augmenter.onHostDetachedFromWindow();
    }

    public final void setAnchorForTrackedObject(T trackedObject, @NotNull Anchor anchor) {
        Intrinsics.h(anchor, "anchor");
        ViewExtensionsKt.runOnMainThread(this, new d(this, trackedObject, anchor));
    }

    public final void setDataCaptureView(@NotNull WeakReference<DataCaptureView> weakReference) {
        Intrinsics.h(weakReference, "<set-?>");
        this.dataCaptureView = weakReference;
    }

    public final void setOffsetForTrackedObject(T trackedObject, @NotNull PointWithUnit offset) {
        Intrinsics.h(offset, "offset");
        ViewExtensionsKt.runOnMainThread(this, new e(this, trackedObject, offset));
    }

    public final void setViewForTrackedObject(T trackedObject, @Nullable View view) {
        if (this.g == NativeFeatureAvailability.UNKNOWN) {
            this.g = getRequireArFeatureAvailabilityFromContext();
        }
        if (this.g == NativeFeatureAvailability.SUPPORTED) {
            ViewExtensionsKt.runOnMainThread(this, new f(this, trackedObject, view));
        }
    }

    public abstract void updateFromJson(@NotNull String jsonData);

    public final void updateTrackedObjects(final long frameSequenceId, @NotNull final Iterable<? extends T> addedTrackedObjects, @NotNull final Iterable<? extends T> updatedTrackedObjects, @NotNull final Iterable<String> removedTrackedObjects) {
        Intrinsics.h(addedTrackedObjects, "addedTrackedObjects");
        Intrinsics.h(updatedTrackedObjects, "updatedTrackedObjects");
        Intrinsics.h(removedTrackedObjects, "removedTrackedObjects");
        if (this.g == NativeFeatureAvailability.UNKNOWN) {
            this.g = getRequireArFeatureAvailabilityFromContext();
        }
        if (this.g == NativeFeatureAvailability.SUPPORTED) {
            post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.ui.overlay.g
                @Override // java.lang.Runnable
                public final void run() {
                    TrackedObjectAdvancedOverlay.a(this.d, frameSequenceId, addedTrackedObjects, updatedTrackedObjects, removedTrackedObjects);
                }
            });
            if (!Intrinsics.c(this.d, this.c)) {
                this.d = this.c;
            }
            removeCallbacks(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TrackedObjectAdvancedOverlay this$0) {
        DataCaptureViewSize dataCaptureViewSize;
        Intrinsics.h(this$0, "this$0");
        DataCaptureViewSize dataCaptureViewSize2 = this$0.d;
        if (dataCaptureViewSize2 == null || (dataCaptureViewSize = this$0.c) == null) {
            return;
        }
        this$0.augmenter.correctViewPositions(Transformation.INSTANCE.between(dataCaptureViewSize2, dataCaptureViewSize));
    }
}
