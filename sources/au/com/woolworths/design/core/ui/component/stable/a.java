package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionCommonUIKt;
import au.com.woolworths.feature.shop.account.model.delete.DeleteAccountTnCData;
import au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountTnCContentKt;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.feature.shop.bundles.ui.BundlesItemsUiKt;
import au.com.woolworths.markdown.RichTextMarkdownKt;
import au.com.woolworths.product.composeui.ProductMultiBuyLabelKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.shared.ui.compose.rewards.ContentCtaButtonKt;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFooterUiKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a(Object obj, Modifier modifier, boolean z, Object obj2, int i, int i2, int i3) {
        this.d = i3;
        this.i = obj;
        this.e = modifier;
        this.f = z;
        this.j = obj2;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CheckboxKt.b((CheckBoxState) this.i, (Function1) this.j, (Modifier) this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                IconButtonKt.a((Function0) this.i, (Modifier) this.e, this.f, (ComposableLambdaImpl) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 2:
                ((Integer) obj2).getClass();
                RedemptionCommonUIKt.b((String) this.i, (String) this.j, (Modifier) this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 3:
                ((Integer) obj2).getClass();
                RedemptionCommonUIKt.a(this.f, (Modifier) this.e, (PaddingValues) this.i, (ComposableLambdaImpl) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 4:
                ((Integer) obj2).getClass();
                DeleteAccountTnCContentKt.a((DeleteAccountTnCData) this.i, (Function1) this.j, (Function0) this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 5:
                ((Integer) obj2).getClass();
                BundlesItemsUiKt.a((List) this.i, (Function1) this.j, (BundlesProductCardConfig) this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 6:
                ((Integer) obj2).getClass();
                RichTextMarkdownKt.b((String) this.i, (Modifier) this.e, (TextStyle) this.j, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ProductMultiBuyLabelKt.a((ProductCard) this.i, (Modifier) this.e, this.f, (ProductMultiBuyLabel) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 8:
                ((Integer) obj2).getClass();
                InsetBannerUiKt.b((InsetBanner) this.i, (Modifier) this.e, this.f, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ContentCtaButtonKt.c((ContentCta) this.i, (Function1) this.j, (Modifier) this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                FulfilmentWindowsFooterUiKt.b((FooterData) this.i, (Modifier) this.e, this.f, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.i = obj;
        this.j = obj2;
        this.e = obj3;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ a(String str, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2) {
        this.d = 6;
        this.i = str;
        this.e = modifier;
        this.j = textStyle;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ a(boolean z, Modifier modifier, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.d = 3;
        this.f = z;
        this.e = modifier;
        this.i = paddingValues;
        this.j = composableLambdaImpl;
        this.g = i;
        this.h = i2;
    }
}
