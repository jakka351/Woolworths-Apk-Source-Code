package androidx.compose.animation.graphics.vector;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/graphics/vector/Animator;", "", "Landroidx/compose/animation/graphics/vector/AnimatorSet;", "Landroidx/compose/animation/graphics/vector/ObjectAnimator;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class Animator {
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d9, code lost:
    
        throw new java.lang.IllegalStateException("Unknown propertyName: ".concat(r9));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final androidx.compose.animation.core.Transition r23, final androidx.compose.animation.graphics.vector.StateVectorConfig r24, final int r25, androidx.compose.runtime.Composer r26, final int r27) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.graphics.vector.Animator.a(androidx.compose.animation.core.Transition, androidx.compose.animation.graphics.vector.StateVectorConfig, int, androidx.compose.runtime.Composer, int):void");
    }

    public abstract void b(MutableScatterMap mutableScatterMap, int i, int i2);

    /* renamed from: c */
    public abstract int getF();
}
