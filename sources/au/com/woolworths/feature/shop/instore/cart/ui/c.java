package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartContract;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import com.halilibo.richtext.ui.FormattedListKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Function e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c(int i, float f, PaddingValuesImpl paddingValuesImpl, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i2) {
        this.g = i;
        this.f = f;
        this.h = paddingValuesImpl;
        this.i = composableLambdaImpl;
        this.e = composableLambdaImpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).intValue();
                InstoreCartScreenKt.a((InstoreCartContract.ViewState.InstoreCartContent) this.h, (Function0) this.i, (Function1) this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                DynamicSizeCardKt.c((DynamicSizeCardData) this.h, (Function1) this.e, (ContentScale) this.i, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(27649);
                FormattedListKt.b(this.g, this.f, (PaddingValuesImpl) this.h, (ComposableLambdaImpl) this.i, (ComposableLambdaImpl) this.e, (Composer) obj, iA);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(InstoreCartContract.ViewState.InstoreCartContent instoreCartContent, Function0 function0, Function1 function1, float f, int i) {
        this.h = instoreCartContent;
        this.i = function0;
        this.e = function1;
        this.f = f;
        this.g = i;
    }

    public /* synthetic */ c(DynamicSizeCardData dynamicSizeCardData, Function1 function1, ContentScale contentScale, float f, int i) {
        this.h = dynamicSizeCardData;
        this.e = function1;
        this.i = contentScale;
        this.f = f;
        this.g = i;
    }
}
