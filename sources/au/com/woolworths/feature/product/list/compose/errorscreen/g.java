package au.com.woolworths.feature.product.list.compose.errorscreen;

import androidx.compose.runtime.DisposableEffectScope;
import au.com.woolworths.feature.product.list.v2.ProductListUiEvent;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ HorizontalListData f;

    public /* synthetic */ g(Function1 function1, HorizontalListData horizontalListData, int i) {
        this.d = i;
        this.e = function1;
        this.f = horizontalListData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                this.e.invoke(this.f);
                return new ZeroResultContentViewKt$ZeroResultContentView$2$1$5$6$invoke$lambda$2$lambda$1$$inlined$onDispose$1();
            case 1:
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                this.e.invoke(this.f);
                return new au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ZeroResultContentViewKt$ZeroResultContentView$2$1$5$6$invoke$lambda$2$lambda$1$$inlined$onDispose$1();
            default:
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                this.e.invoke(new ProductListUiEvent.OnZeroResultHorizontalListVisible(this.f));
                return new au.com.woolworths.feature.product.list.v2.ui.ZeroResultContentViewKt$ZeroResultContentView$2$1$5$6$invoke$lambda$2$lambda$1$$inlined$onDispose$1();
        }
    }
}
