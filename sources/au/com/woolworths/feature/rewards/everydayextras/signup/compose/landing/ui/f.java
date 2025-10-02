package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ScrollState e;

    public /* synthetic */ f(ScrollState scrollState, int i) {
        this.d = i;
        this.e = scrollState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ScrollState scrollState = this.e;
        GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
        switch (i) {
            case 0:
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.c(((SnapshotMutableIntStateImpl) scrollState.f848a).d() * 0.5f);
                break;
            default:
                float f = LandingScreenHeaderItemKt.f6108a;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.c(((SnapshotMutableIntStateImpl) scrollState.f848a).d() * 0.5f);
                break;
        }
        return unit;
    }
}
