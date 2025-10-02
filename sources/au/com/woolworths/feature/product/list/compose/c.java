package au.com.woolworths.feature.product.list.compose;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductCard e;
    public final /* synthetic */ ProductCardConfig f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ c(ProductCard productCard, ProductCardConfig productCardConfig, Function2 function2, Function1 function1, Modifier modifier, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = productCard;
        this.f = productCardConfig;
        this.g = function2;
        this.h = function1;
        this.i = modifier;
        this.j = z;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                AlternativeProductCardGridKt.a(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1), this.l);
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductCardGridKt.a(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1), this.l);
                break;
        }
        return Unit.f24250a;
    }
}
