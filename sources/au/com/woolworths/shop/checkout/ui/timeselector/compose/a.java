package au.com.woolworths.shop.checkout.ui.timeselector.compose;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.ui.lists.compose.SuggestedListItemCardKt;
import au.com.woolworths.shop.productcard.data.ProductTile;
import au.com.woolworths.shop.productcard.ui.containers.ProductTileCardUiKt;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt;
import com.halilibo.richtext.markdown.MarkdownRichTextKt;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.BasicRichTextKt;
import com.halilibo.richtext.ui.RichTextScope;
import com.halilibo.richtext.ui.RichTextStyle;
import com.woolworths.shop.product.ui.ProductMultiBuyLabelKt;
import com.woolworths.shop.product.ui.boost.BoostingAnimationKt;
import com.woolworths.shop.product.ui.boost.BoostingState;
import com.woolworths.shop.product.ui.tags.promotional.ProductPromotionLabelKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a(int i, int i2, int i3, Modifier modifier, Object obj, Object obj2) {
        this.d = i3;
        this.i = obj;
        this.e = obj2;
        this.f = modifier;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                TimeSlotItemKt.a((FulfilmentSlot) this.i, (Modifier) this.f, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                SuggestedListItemCardKt.a((SuggestedListItem) this.i, (Function1) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ProductTileCardUiKt.a((ProductTile) this.i, (Modifier) this.f, (Function3) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 3:
                ((Integer) obj2).intValue();
                SubmitReviewScreenKt.c((SubmitReviewFormViewModel) this.i, (List) this.f, (PaddingValues) this.e, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                MarkdownRichTextKt.a((RichTextScope) this.i, (AstNode) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 5:
                ((Integer) obj2).getClass();
                BasicRichTextKt.a((Modifier) this.f, (RichTextStyle) this.i, (Function3) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ProductMultiBuyLabelKt.a((ProductCard) this.i, (Modifier) this.f, (ProductMultiBuyLabel) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            case 7:
                ((Integer) obj2).getClass();
                BoostingAnimationKt.a((BoostingState) this.i, (Modifier) this.f, (String) this.e, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                ProductPromotionLabelKt.a((String) this.i, (TagSpec.Style) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Modifier modifier, RichTextStyle richTextStyle, Function3 function3, int i, int i2) {
        this.d = 5;
        this.f = modifier;
        this.i = richTextStyle;
        this.e = function3;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.d = i3;
        this.i = obj;
        this.f = obj2;
        this.e = obj3;
        this.g = i;
        this.h = i2;
    }
}
