package com.woolworths.scanlibrary.ui.scanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle;
import au.com.woolworths.product.models.MemberPriceInfo;
import com.woolworths.shop.product.ui.ProductMemberPriceLabelKt;
import com.woolworths.shop.product.ui.boost.BoostingAnimationKt;
import com.woolworths.shop.product.ui.boost.BoostingState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ScannerScreenKt.b((Function0) this.f, (Function0) this.g, (ComposableLambdaImpl) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductMemberPriceLabelKt.a((MemberPriceInfo) this.f, (Modifier) this.g, (ProductMemberPriceLabelStyle) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                BoostingAnimationKt.c((BoostingState) this.f, (Modifier) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }
}
