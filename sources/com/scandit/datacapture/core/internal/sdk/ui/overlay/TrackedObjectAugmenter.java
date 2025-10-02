package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.UrlHandler;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.ArImagesLicenseFeature;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 A*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003ABCB\u001d\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\"\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0005\u001a\u00020\u0003H\u0017J!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0018\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0014J\u0016\u0010\u001c\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0014J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0003H\u0007J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0017R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R,\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190.8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010<\u001a\u00020\u0016*\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006D"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "onHostAttachedToWindow", "onHostDetachedFromWindow", "trackedObject", "Landroid/view/View;", "view", "setViewForTrackedObject", "(Ljava/lang/Object;Landroid/view/View;)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "setOffsetForTrackedObject", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "setAnchorForTrackedObject", "(Ljava/lang/Object;Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "", "addedTrackedObjects", "updatedTrackedObjects", "", "removedTrackedObjects", "setAugmentations", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Augmentation;", "augmentation", "onAugmentationAdded", "onAugmentationUpdated", "onAugmentationRemoved", "clearAugmentations", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "transformation", "correctViewPositions", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "getHost", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "host", "", "c", "Ljava/util/Set;", "getActiveIdentifiers", "()Ljava/util/Set;", "activeIdentifiers", "", "d", "Ljava/util/Map;", "getAugmentations", "()Ljava/util/Map;", "augmentations", "Lcom/scandit/datacapture/core/internal/sdk/utils/ObjectOverlayUtils;", "h", "Lcom/scandit/datacapture/core/internal/sdk/utils/ObjectOverlayUtils;", "getObjectOverlayUtils", "()Lcom/scandit/datacapture/core/internal/sdk/utils/ObjectOverlayUtils;", "objectOverlayUtils", "getTrackingId", "(Ljava/lang/Object;)Ljava/lang/String;", "trackingId", "Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;", "imagesLicenseFeature", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;)V", "Companion", "Factory", "Host", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class TrackedObjectAugmenter<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Anchor i = Anchor.CENTER;
    private static final PointWithUnit j = PointWithUnitUtilsKt.PointWithUnit(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, MeasureUnit.FRACTION);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Host host;
    private final ArImagesLicenseFeature b;

    /* renamed from: c, reason: from kotlin metadata */
    private final Set activeIdentifiers;
    private final LinkedHashMap d;
    private final LinkedHashMap e;
    private final LinkedHashMap f;
    private final LinkedHashMap g;

    /* renamed from: h, reason: from kotlin metadata */
    private final ObjectOverlayUtils objectOverlayUtils;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Companion;", "", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "DEFAULT_ANCHOR", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getDEFAULT_ANCHOR", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "DEFAULT_OFFSET", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getDEFAULT_OFFSET", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Anchor getDEFAULT_ANCHOR() {
            return TrackedObjectAugmenter.i;
        }

        @NotNull
        public final PointWithUnit getDEFAULT_OFFSET() {
            return TrackedObjectAugmenter.j;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "forHost", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter;", "host", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", "imagesLicenseFeature", "Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory<T> {
        @NotNull
        TrackedObjectAugmenter<T> forHost(@NotNull Host<T> host, @NotNull ArImagesLicenseFeature imagesLicenseFeature);
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H&J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/TrackedObjectAugmenter$Host;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "addAugmentedView", "", "view", "Landroid/view/View;", "anchorForTrackedObject", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "trackedObject", "(Ljava/lang/Object;)Lcom/scandit/datacapture/core/common/geometry/Anchor;", "mapFramePointToView", "Lcom/scandit/datacapture/core/common/geometry/Point;", "point", "mapFrameQuadrilateralToView", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "quadrilateral", "offsetForTrackedObject", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "(Ljava/lang/Object;Landroid/view/View;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "post", UrlHandler.ACTION, "Lkotlin/Function0;", "postDelayed", "delayMillis", "", "removeAugmentedView", "viewForTrackedObject", "(Ljava/lang/Object;)Landroid/view/View;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Host<T> {
        void addAugmentedView(@NotNull View view);

        @Nullable
        Anchor anchorForTrackedObject(T trackedObject);

        @NotNull
        Point mapFramePointToView(@NotNull Point point);

        @NotNull
        Quadrilateral mapFrameQuadrilateralToView(@NotNull Quadrilateral quadrilateral);

        @Nullable
        PointWithUnit offsetForTrackedObject(T trackedObject, @NotNull View view);

        void post(@NotNull Function0<Unit> action);

        void postDelayed(long delayMillis, @NotNull Function0<Unit> action);

        void removeAugmentedView(@NotNull View view);

        @Nullable
        View viewForTrackedObject(T trackedObject);
    }

    public TrackedObjectAugmenter(@NotNull Host<T> host, @NotNull ArImagesLicenseFeature imagesLicenseFeature) {
        Intrinsics.h(host, "host");
        Intrinsics.h(imagesLicenseFeature, "imagesLicenseFeature");
        this.host = host;
        this.b = imagesLicenseFeature;
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.g(setSynchronizedSet, "synchronizedSet(mutableSetOf())");
        this.activeIdentifiers = setSynchronizedSet;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.objectOverlayUtils = new ObjectOverlayUtils();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(Object obj) {
        LinkedHashMap linkedHashMap = this.e;
        String trackingId = getTrackingId(obj);
        Object objViewForTrackedObject = linkedHashMap.get(trackingId);
        if (objViewForTrackedObject == null) {
            objViewForTrackedObject = this.host.viewForTrackedObject(obj);
            linkedHashMap.put(trackingId, objViewForTrackedObject);
        }
        View view = (View) objViewForTrackedObject;
        if (view == null) {
            return;
        }
        if (this.b.getShouldStripImages()) {
            ViewExtensionsKt.hideImages(view);
        }
        Anchor anchorAnchorForTrackedObject = (Anchor) this.f.get(getTrackingId(obj));
        if (anchorAnchorForTrackedObject == null) {
            anchorAnchorForTrackedObject = this.host.anchorForTrackedObject(obj);
            if (anchorAnchorForTrackedObject != null) {
                this.f.put(getTrackingId(obj), anchorAnchorForTrackedObject);
            } else {
                anchorAnchorForTrackedObject = null;
            }
            if (anchorAnchorForTrackedObject == null) {
                anchorAnchorForTrackedObject = i;
            }
        }
        PointWithUnit pointWithUnitOffsetForTrackedObject = (PointWithUnit) this.g.get(getTrackingId(obj));
        if (pointWithUnitOffsetForTrackedObject == null) {
            pointWithUnitOffsetForTrackedObject = this.host.offsetForTrackedObject(obj, view);
            if (pointWithUnitOffsetForTrackedObject != null) {
                this.g.put(getTrackingId(obj), pointWithUnitOffsetForTrackedObject);
            } else {
                pointWithUnitOffsetForTrackedObject = null;
            }
            if (pointWithUnitOffsetForTrackedObject == null) {
                pointWithUnitOffsetForTrackedObject = j;
            }
        }
        Augmentation<T> augmentation = (Augmentation) this.d.get(getTrackingId(obj));
        if (augmentation != null) {
            ViewGroup containerView = augmentation.getContainerView();
            if (containerView != null) {
                containerView.removeAllViews();
                this.host.removeAugmentedView(containerView);
            }
            augmentation.setContainerView(null);
            onAugmentationRemoved(augmentation);
        }
        Context context = view.getContext();
        Intrinsics.g(context, "view.context");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.setVisibility(4);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        frameLayout.addView(view);
        this.host.addAugmentedView(frameLayout);
        Augmentation<T> augmentation2 = new Augmentation<>(obj, frameLayout, pointWithUnitOffsetForTrackedObject, anchorAnchorForTrackedObject);
        this.d.put(getTrackingId(obj), augmentation2);
        onAugmentationAdded(augmentation2);
    }

    @UiThread
    public final void clearAugmentations() {
        for (Augmentation<T> augmentation : this.d.values()) {
            ViewGroup containerView = augmentation.getContainerView();
            if (containerView != null) {
                containerView.removeAllViews();
                this.host.removeAugmentedView(containerView);
            }
            augmentation.setContainerView(null);
            onAugmentationRemoved(augmentation);
        }
        this.d.clear();
        this.f.clear();
        this.g.clear();
        this.e.clear();
    }

    @UiThread
    public void correctViewPositions(@NotNull Transformation transformation) {
        Intrinsics.h(transformation, "transformation");
    }

    @NotNull
    public final Set<String> getActiveIdentifiers() {
        return this.activeIdentifiers;
    }

    @NotNull
    public final Map<String, Augmentation<T>> getAugmentations() {
        return this.d;
    }

    @NotNull
    public final Host<T> getHost() {
        return this.host;
    }

    @NotNull
    public final ObjectOverlayUtils getObjectOverlayUtils() {
        return this.objectOverlayUtils;
    }

    @NotNull
    public abstract String getTrackingId(T t);

    public void onAugmentationAdded(@NotNull Augmentation<T> augmentation) {
        Intrinsics.h(augmentation, "augmentation");
    }

    public void onAugmentationRemoved(@NotNull Augmentation<T> augmentation) {
        Intrinsics.h(augmentation, "augmentation");
    }

    public void onAugmentationUpdated(@NotNull Augmentation<T> augmentation) {
        Intrinsics.h(augmentation, "augmentation");
    }

    @UiThread
    public void onHostAttachedToWindow() {
    }

    @UiThread
    public void onHostDetachedFromWindow() {
    }

    @UiThread
    public final void setAnchorForTrackedObject(T trackedObject, @NotNull Anchor anchor) {
        Intrinsics.h(anchor, "anchor");
        this.f.put(getTrackingId(trackedObject), anchor);
        Augmentation augmentation = (Augmentation) this.d.get(getTrackingId(trackedObject));
        if (augmentation == null) {
            return;
        }
        augmentation.setAnchor(anchor);
    }

    @UiThread
    public final void setAugmentations(@NotNull Iterable<? extends T> addedTrackedObjects, @NotNull Iterable<? extends T> updatedTrackedObjects, @NotNull Iterable<String> removedTrackedObjects) {
        Intrinsics.h(addedTrackedObjects, "addedTrackedObjects");
        Intrinsics.h(updatedTrackedObjects, "updatedTrackedObjects");
        Intrinsics.h(removedTrackedObjects, "removedTrackedObjects");
        this.activeIdentifiers.clear();
        for (String str : removedTrackedObjects) {
            Augmentation<T> augmentation = (Augmentation) this.d.remove(str);
            if (augmentation != null) {
                ViewGroup containerView = augmentation.getContainerView();
                if (containerView != null) {
                    containerView.removeAllViews();
                    this.host.removeAugmentedView(containerView);
                }
                augmentation.setContainerView(null);
                onAugmentationRemoved(augmentation);
            }
            this.f.remove(str);
            this.g.remove(str);
            this.e.remove(str);
        }
        for (T t : addedTrackedObjects) {
            a(t);
            this.activeIdentifiers.add(getTrackingId(t));
        }
        for (T t2 : updatedTrackedObjects) {
            Augmentation<T> augmentation2 = (Augmentation) this.d.get(getTrackingId(t2));
            if (augmentation2 == null) {
                a(t2);
            } else {
                augmentation2.setTrackedObject(t2);
                LinkedHashMap linkedHashMap = this.e;
                String trackingId = getTrackingId(t2);
                Object objViewForTrackedObject = linkedHashMap.get(trackingId);
                if (objViewForTrackedObject == null) {
                    objViewForTrackedObject = this.host.viewForTrackedObject(t2);
                    linkedHashMap.put(trackingId, objViewForTrackedObject);
                }
                View view = (View) objViewForTrackedObject;
                if (view != null && this.b.getShouldStripImages()) {
                    ViewExtensionsKt.hideImages(view);
                }
                onAugmentationUpdated(augmentation2);
            }
            this.activeIdentifiers.add(getTrackingId(t2));
        }
    }

    @UiThread
    public final void setOffsetForTrackedObject(T trackedObject, @NotNull PointWithUnit offset) {
        Intrinsics.h(offset, "offset");
        this.g.put(getTrackingId(trackedObject), offset);
        Augmentation augmentation = (Augmentation) this.d.get(getTrackingId(trackedObject));
        if (augmentation == null) {
            return;
        }
        augmentation.setOffset(offset);
    }

    @UiThread
    public void setViewForTrackedObject(T trackedObject, @Nullable View view) {
        synchronized (this.activeIdentifiers) {
            if (this.activeIdentifiers.contains(getTrackingId(trackedObject))) {
                this.e.put(getTrackingId(trackedObject), view);
                a(trackedObject);
            }
        }
    }
}
