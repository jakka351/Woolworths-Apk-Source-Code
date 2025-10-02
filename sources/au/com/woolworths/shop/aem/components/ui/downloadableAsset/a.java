package au.com.woolworths.shop.aem.components.ui.downloadableAsset;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.DownloadableAssetData;
import au.com.woolworths.shop.checkout.ui.components.compose.PreferenceToggleUiKt;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsProductSection;
import au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a(DownloadableAssetData downloadableAssetData, Modifier modifier, boolean z, boolean z2, Painter painter, List list, int i, int i2) {
        this.h = downloadableAssetData;
        this.i = modifier;
        this.e = z;
        this.f = z2;
        this.j = painter;
        this.k = list;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                DownloadableAssetKt.b((DownloadableAssetData) this.h, (Modifier) this.i, this.e, this.f, (Painter) this.j, (List) this.k, (Composer) obj, iA, this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                PreferenceToggleUiKt.a((String) this.h, (String) this.i, (String) this.j, this.e, this.f, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SimilarProductsScreenKt.n((AlternativeProductsProductSection) this.h, this.e, this.f, (Function1) this.i, (Function1) this.j, (ProductClickListener) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(AlternativeProductsProductSection alternativeProductsProductSection, boolean z, boolean z2, Function1 function1, Function1 function12, ProductClickListener productClickListener, int i) {
        this.h = alternativeProductsProductSection;
        this.e = z;
        this.f = z2;
        this.i = function1;
        this.j = function12;
        this.k = productClickListener;
        this.g = i;
    }

    public /* synthetic */ a(String str, String str2, String str3, boolean z, boolean z2, Function1 function1, int i) {
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.e = z;
        this.f = z2;
        this.k = function1;
        this.g = i;
    }
}
