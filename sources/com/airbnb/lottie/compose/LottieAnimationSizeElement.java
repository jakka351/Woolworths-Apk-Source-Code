package com.airbnb.lottie.compose;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LottieAnimationSizeElement extends ModifierNodeElement<LottieAnimationSizeNode> {
    public final int d;
    public final int e;

    public LottieAnimationSizeElement(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        LottieAnimationSizeNode lottieAnimationSizeNode = new LottieAnimationSizeNode();
        lottieAnimationSizeNode.r = this.d;
        lottieAnimationSizeNode.s = this.e;
        return lottieAnimationSizeNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LottieAnimationSizeNode node2 = (LottieAnimationSizeNode) node;
        Intrinsics.h(node2, "node");
        node2.r = this.d;
        node2.s = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.d == lottieAnimationSizeElement.d && this.e == lottieAnimationSizeElement.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
    }

    public final String toString() {
        return b.j(this.d, this.e, "LottieAnimationSizeElement(width=", ", height=", ")");
    }
}
