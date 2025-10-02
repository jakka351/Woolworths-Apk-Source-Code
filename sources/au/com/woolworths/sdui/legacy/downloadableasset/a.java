package au.com.woolworths.sdui.legacy.downloadableasset;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.foundation.shop.cart.data.model.CartFooterData;
import au.com.woolworths.shop.cart.ui.shared.CartFooterKt;
import au.com.woolworths.shop.cart.ui.shared.FooterSource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ a(DownloadableAsset downloadableAsset, Modifier modifier, boolean z, boolean z2, boolean z3, Painter painter, List list, int i, int i2) {
        this.k = downloadableAsset;
        this.g = modifier;
        this.e = z;
        this.f = z2;
        this.h = z3;
        this.l = painter;
        this.m = list;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                DownloadableAssetUiKt.b((DownloadableAsset) this.k, this.g, this.e, this.f, this.h, (Painter) this.l, (List) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                CartFooterKt.a(this.e, this.f, (CartFooterData) this.k, this.g, (FooterSource) this.l, this.h, (Function0) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(boolean z, boolean z2, CartFooterData cartFooterData, Modifier modifier, FooterSource footerSource, boolean z3, Function0 function0, int i, int i2) {
        this.e = z;
        this.f = z2;
        this.k = cartFooterData;
        this.g = modifier;
        this.l = footerSource;
        this.h = z3;
        this.m = function0;
        this.i = i;
        this.j = i2;
    }
}
