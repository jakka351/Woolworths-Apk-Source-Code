package au.com.woolworths.feature.shop.recipes.freshmag.content.ui;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(FreshMagContentContract.FreshMagContent freshMagContent, PagerState pagerState, Modifier modifier, int i) {
        this.d = 1;
        this.f = freshMagContent;
        this.g = pagerState;
        this.e = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                FreshMagAsyncImageKt.a((String) this.f, (Modifier) this.e, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                FreshMagContentScreenKt.c((FreshMagContentContract.FreshMagContent) this.f, (PagerState) this.g, (Modifier) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                FreshMagContentScreenKt.b((String) this.f, (FreshMagContentViewModel) this.e, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, Object obj, Function function, int i, int i2) {
        this.d = i2;
        this.f = str;
        this.e = obj;
        this.g = function;
    }
}
