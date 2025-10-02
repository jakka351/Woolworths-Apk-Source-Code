package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.RequestConfiguration;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.internal.sdk.utils.ArImagesLicenseFeature;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001b\u0010\u0012\u001a\u00020\u0011*\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/AnimatedTrackedObjectAugmenter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "trackedObject", "Landroid/view/View;", "view", "", "setViewForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Augmentation;", "augmentation", "onAugmentationAdded", "onAugmentationUpdated", "onAugmentationRemoved", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "transformation", "correctViewPositions", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getViewLocation", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "host", "Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;", "imagesLicenseFeature", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class AnimatedTrackedObjectAugmenter<T> extends TrackedObjectAugmenter<T> {
    private final LinkedHashMap k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedTrackedObjectAugmenter(@NotNull TrackedObjectAugmenter.Host<T> host, @NotNull ArImagesLicenseFeature imagesLicenseFeature) {
        super(host, imagesLicenseFeature);
        Intrinsics.h(host, "host");
        Intrinsics.h(imagesLicenseFeature, "imagesLicenseFeature");
        this.k = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Augmentation augmentation, Transformation transformation) {
        ViewGroup containerView = augmentation.getContainerView();
        if (containerView == null) {
            return;
        }
        if (this.k.get(augmentation) == null) {
            this.k.put(augmentation, new AugmentationAnimation(containerView, getObjectOverlayUtils().getObjectOverlayPosition(getViewLocation(augmentation.getTrackedObject(), transformation), ObjectOverlayUtilsKt.getSize(augmentation.getContainerView()), augmentation.getAnchor(), augmentation.getOffset())));
        }
        AugmentationAnimation augmentationAnimation = (AugmentationAnimation) this.k.get(augmentation);
        if (augmentationAnimation != null) {
            augmentationAnimation.animateTo(getObjectOverlayUtils().getObjectOverlayPosition(getViewLocation(augmentation.getTrackedObject(), transformation), ObjectOverlayUtilsKt.getSize(augmentation.getContainerView()), augmentation.getAnchor(), augmentation.getOffset()));
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public void correctViewPositions(@NotNull Transformation transformation) {
        Intrinsics.h(transformation, "transformation");
        Iterator<Augmentation<T>> it = getAugmentations().values().iterator();
        while (it.hasNext()) {
            a(it.next(), transformation);
        }
    }

    @NotNull
    public abstract Quadrilateral getViewLocation(T t, @NotNull Transformation transformation);

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public void onAugmentationAdded(@NotNull Augmentation<T> augmentation) {
        Intrinsics.h(augmentation, "augmentation");
        getHost().post(new a(augmentation, this));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public void onAugmentationRemoved(@NotNull Augmentation<T> augmentation) {
        Intrinsics.h(augmentation, "augmentation");
        this.k.remove(augmentation);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public void onAugmentationUpdated(@NotNull Augmentation<T> augmentation) {
        Intrinsics.h(augmentation, "augmentation");
        a(augmentation, Transformation.INSTANCE.getID());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter
    public void setViewForTrackedObject(T trackedObject, @Nullable View view) {
        super.setViewForTrackedObject(trackedObject, view);
        Augmentation<T> augmentation = getAugmentations().get(getTrackingId(trackedObject));
        if (augmentation != null) {
        }
    }
}
