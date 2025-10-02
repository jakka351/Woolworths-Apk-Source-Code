package au.com.woolworths.feature.rewards.card.overlay.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.rewards.common.ui.buttons.SmallIconItemUiKt;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ItemPreviewKt;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewItemInfoKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;

    public /* synthetic */ a(String str, String str2, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = modifier;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                RewardsCardOverlayScreenKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 1:
                SmallIconItemUiKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 2:
                ItemPreviewKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                ReviewItemInfoKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }
}
