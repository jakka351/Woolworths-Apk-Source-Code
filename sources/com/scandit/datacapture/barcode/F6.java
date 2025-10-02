package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.Augmentation;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.Transformation;
import com.scandit.datacapture.core.internal.sdk.utils.ArImagesLicenseFeature;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F6 extends TrackedObjectAugmenter {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17159a;
    private final Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6(TrackedObjectAugmenter.Host host, ArImagesLicenseFeature imagesLicenseFeature) {
        super(host, imagesLicenseFeature);
        Intrinsics.h(host, "host");
        Intrinsics.h(imagesLicenseFeature, "imagesLicenseFeature");
        this.f17159a = true;
        Transformation.INSTANCE.getID();
        this.b = new E6(this);
    }

    public static final void a(F6 f6, Augmentation augmentation) {
        f6.getClass();
        ViewGroup containerView = augmentation.getContainerView();
        if (containerView == null) {
            return;
        }
        Point frameAnchorPoint = ((TrackedBarcode) augmentation.getTrackedObject()).getF18191a().getAnchorPositionIgnoringLicense(augmentation.getAnchor());
        TrackedObjectAugmenter.Host host = f6.getHost();
        Intrinsics.g(frameAnchorPoint, "frameAnchorPoint");
        Point pointCalculateViewTopLeft = f6.getObjectOverlayUtils().calculateViewTopLeft(host.mapFramePointToView(frameAnchorPoint), augmentation.getOffset(), ObjectOverlayUtilsKt.getSize(containerView));
        containerView.setX(pointCalculateViewTopLeft.getX());
        containerView.setY(pointCalculateViewTopLeft.getY());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void correctViewPositions(Transformation transformation) {
        Intrinsics.h(transformation, "transformation");
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final String getTrackingId(Object obj) {
        TrackedBarcode trackedBarcode = (TrackedBarcode) obj;
        Intrinsics.h(trackedBarcode, "<this>");
        return String.valueOf(trackedBarcode.getIdentifier());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onAugmentationAdded(Augmentation augmentation) {
        Intrinsics.h(augmentation, "augmentation");
        Transformation.INSTANCE.getID();
        ViewGroup containerView = augmentation.getContainerView();
        if (containerView != null) {
            containerView.addOnLayoutChangeListener(new D6(new C6(this, augmentation)));
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onAugmentationRemoved(Augmentation augmentation) {
        Intrinsics.h(augmentation, "augmentation");
        Transformation.INSTANCE.getID();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onAugmentationUpdated(Augmentation augmentation) {
        Intrinsics.h(augmentation, "augmentation");
        Transformation.INSTANCE.getID();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onHostAttachedToWindow() {
        this.f17159a = false;
        getHost().postDelayed(30L, this.b);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public final void onHostDetachedFromWindow() {
        this.f17159a = true;
    }

    public static void a(F6 f6) {
        if (f6.f17159a) {
            return;
        }
        for (Augmentation augmentation : f6.getAugmentations().values()) {
            ViewGroup containerView = augmentation.getContainerView();
            if (containerView != null) {
                Point frameAnchorPoint = ((TrackedBarcode) augmentation.getTrackedObject()).getF18191a().getAnchorPositionIgnoringLicense(augmentation.getAnchor());
                TrackedObjectAugmenter.Host host = f6.getHost();
                Intrinsics.g(frameAnchorPoint, "frameAnchorPoint");
                Point pointCalculateViewTopLeft = f6.getObjectOverlayUtils().calculateViewTopLeft(host.mapFramePointToView(frameAnchorPoint), augmentation.getOffset(), ObjectOverlayUtilsKt.getSize(containerView));
                containerView.setX(pointCalculateViewTopLeft.getX());
                containerView.setY(pointCalculateViewTopLeft.getY());
            }
        }
        f6.getHost().postDelayed(30L, f6.b);
    }
}
