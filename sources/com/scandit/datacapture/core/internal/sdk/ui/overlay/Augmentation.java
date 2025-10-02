package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.ViewGroup;
import com.google.android.gms.ads.RequestConfiguration;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\u0006\u0010!\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Augmentation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "a", "Ljava/lang/Object;", "getTrackedObject", "()Ljava/lang/Object;", "setTrackedObject", "(Ljava/lang/Object;)V", "trackedObject", "Landroid/view/ViewGroup;", "b", "Landroid/view/ViewGroup;", "getContainerView", "()Landroid/view/ViewGroup;", "setContainerView", "(Landroid/view/ViewGroup;)V", "containerView", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "c", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getOffset", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setOffset", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "offset", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "d", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getAnchor", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setAnchor", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "anchor", "<init>", "(Ljava/lang/Object;Landroid/view/ViewGroup;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Augmentation<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object trackedObject;

    /* renamed from: b, reason: from kotlin metadata */
    private ViewGroup containerView;

    /* renamed from: c, reason: from kotlin metadata */
    private PointWithUnit offset;

    /* renamed from: d, reason: from kotlin metadata */
    private Anchor anchor;

    public Augmentation(T t, @Nullable ViewGroup viewGroup, @NotNull PointWithUnit offset, @NotNull Anchor anchor) {
        Intrinsics.h(offset, "offset");
        Intrinsics.h(anchor, "anchor");
        this.trackedObject = t;
        this.containerView = viewGroup;
        this.offset = offset;
        this.anchor = anchor;
    }

    @NotNull
    public final Anchor getAnchor() {
        return this.anchor;
    }

    @Nullable
    public final ViewGroup getContainerView() {
        return this.containerView;
    }

    @NotNull
    public final PointWithUnit getOffset() {
        return this.offset;
    }

    public final T getTrackedObject() {
        return (T) this.trackedObject;
    }

    public final void setAnchor(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        this.anchor = anchor;
    }

    public final void setContainerView(@Nullable ViewGroup viewGroup) {
        this.containerView = viewGroup;
    }

    public final void setOffset(@NotNull PointWithUnit pointWithUnit) {
        Intrinsics.h(pointWithUnit, "<set-?>");
        this.offset = pointWithUnit;
    }

    public final void setTrackedObject(T t) {
        this.trackedObject = t;
    }
}
