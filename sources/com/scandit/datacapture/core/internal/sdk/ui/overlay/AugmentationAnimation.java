package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/AugmentationAnimation;", "", "Lcom/scandit/datacapture/core/common/geometry/Point;", "final", "", "animateTo", "Landroid/view/View;", "view", "start", "<init>", "(Landroid/view/View;Lcom/scandit/datacapture/core/common/geometry/Point;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class AugmentationAnimation {

    /* renamed from: a, reason: collision with root package name */
    private final SpringAnimation f18739a;
    private final SpringAnimation b;

    public AugmentationAnimation(@NotNull View view, @NotNull Point start) {
        Intrinsics.h(view, "view");
        Intrinsics.h(start, "start");
        SpringAnimation springAnimation = new SpringAnimation(view, DynamicAnimation.X);
        springAnimation.setStartValue(start.getX());
        this.f18739a = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(view, DynamicAnimation.Y);
        springAnimation2.setStartValue(start.getY());
        this.b = springAnimation2;
    }

    public final void animateTo(@NotNull Point point) {
        Intrinsics.h(point, "final");
        this.f18739a.animateToFinalPosition(point.getX());
        this.b.animateToFinalPosition(point.getY());
    }
}
