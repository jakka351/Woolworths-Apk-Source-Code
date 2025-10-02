package au.com.woolworths.product.composeui;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.ProductCard;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductCard e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ b(ProductCard productCard, Modifier modifier, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = productCard;
        this.f = modifier;
        this.g = z;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductAisleInfoKt.a(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductPricingFootnoteLabelKt.a(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                ProductWasPriceLabelKt.a(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }
}
