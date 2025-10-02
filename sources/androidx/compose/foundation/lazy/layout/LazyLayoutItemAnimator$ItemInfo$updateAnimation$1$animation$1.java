package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ LazyLayoutItemAnimator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        super(0);
        this.h = lazyLayoutItemAnimator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DrawModifierNode drawModifierNode = this.h.j;
        if (drawModifierNode != null) {
            DrawModifierNodeKt.a(drawModifierNode);
        }
        return Unit.f24250a;
    }
}
