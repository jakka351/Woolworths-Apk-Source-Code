package au.com.woolworths.feature.shop.catalogue.browse.page.promotion;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.AbstractComposeView;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.epoxy.CallbackProp;
import com.airbnb.epoxy.ModelProp;
import com.airbnb.epoxy.ModelView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@GX\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0006@GX\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RF\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#RF\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#¨\u0006)"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/promotion/PromotionPageEpoxyModel;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Promotion;", "value", "l", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Promotion;", "getPage", "()Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Promotion;", "setPage", "(Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Promotion;)V", "page", "Lkotlinx/coroutines/flow/StateFlow;", "m", "Lkotlinx/coroutines/flow/StateFlow;", "getPagingFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "setPagingFlow", "(Lkotlinx/coroutines/flow/StateFlow;)V", "pagingFlow", "Lkotlin/Function1;", "Lau/com/woolworths/product/models/ProductCard;", "", "n", "Lkotlin/jvm/functions/Function1;", "getOnPromotionCardClick", "()Lkotlin/jvm/functions/Function1;", "setOnPromotionCardClick", "(Lkotlin/jvm/functions/Function1;)V", "onPromotionCardClick", "o", "getOnPromotionPageButtonClick", "setOnPromotionPageButtonClick", "onPromotionPageButtonClick", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ModelView
@SourceDebugExtension
/* loaded from: classes3.dex */
public class PromotionPageEpoxyModel extends AbstractComposeView {

    /* renamed from: l, reason: from kotlin metadata */
    public BrowsePage.Promotion page;

    /* renamed from: m, reason: from kotlin metadata */
    public StateFlow pagingFlow;

    /* renamed from: n, reason: from kotlin metadata */
    public Function1 onPromotionCardClick;

    /* renamed from: o, reason: from kotlin metadata */
    public Function1 onPromotionPageButtonClick;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PromotionPageEpoxyModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        composer.o(-855768863);
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new FocusRequester();
            composer.A(objG);
        }
        final FocusRequester focusRequester = (FocusRequester) objG;
        composer.l();
        ThemeKt.b(6, composer, ComposableLambdaKt.c(620331929, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    PromotionPageEpoxyModel promotionPageEpoxyModel = this.d;
                    BrowsePage.Promotion page = promotionPageEpoxyModel.getPage();
                    composer2.o(5004770);
                    boolean zI = composer2.I(promotionPageEpoxyModel);
                    Object objG2 = composer2.G();
                    Object obj3 = Composer.Companion.f1624a;
                    if (zI || objG2 == obj3) {
                        objG2 = new l(promotionPageEpoxyModel, 15);
                        composer2.A(objG2);
                    }
                    Function1 function1 = (Function1) objG2;
                    composer2.l();
                    composer2.o(5004770);
                    boolean zI2 = composer2.I(promotionPageEpoxyModel);
                    Object objG3 = composer2.G();
                    if (zI2 || objG3 == obj3) {
                        objG3 = new f(promotionPageEpoxyModel, 10);
                        composer2.A(objG3);
                    }
                    composer2.l();
                    PromotionPageKt.d(page, function1, (Function0) objG3, focusRequester, null, composer2, 3072);
                }
                return Unit.f24250a;
            }
        }, composer));
        BrowsePage.Promotion page = getPage();
        composer.o(-1633490746);
        boolean zI = composer.I(this);
        Object objG2 = composer.G();
        if (zI || objG2 == composer$Companion$Empty$1) {
            objG2 = new PromotionPageEpoxyModel$Content$2$1(this, focusRequester, null);
            composer.A(objG2);
        }
        composer.l();
        EffectsKt.e(composer, page, (Function2) objG2);
        composer.l();
    }

    @Nullable
    public final Function1<ProductCard, Unit> getOnPromotionCardClick() {
        return this.onPromotionCardClick;
    }

    @Nullable
    public final Function1<BrowsePage.Promotion, Unit> getOnPromotionPageButtonClick() {
        return this.onPromotionPageButtonClick;
    }

    @NotNull
    public final BrowsePage.Promotion getPage() {
        BrowsePage.Promotion promotion = this.page;
        if (promotion != null) {
            return promotion;
        }
        Intrinsics.p("page");
        throw null;
    }

    @NotNull
    public final StateFlow<Integer> getPagingFlow() {
        StateFlow<Integer> stateFlow = this.pagingFlow;
        if (stateFlow != null) {
            return stateFlow;
        }
        Intrinsics.p("pagingFlow");
        throw null;
    }

    @CallbackProp
    public final void setOnPromotionCardClick(@Nullable Function1<? super ProductCard, Unit> function1) {
        this.onPromotionCardClick = function1;
    }

    @CallbackProp
    public final void setOnPromotionPageButtonClick(@Nullable Function1<? super BrowsePage.Promotion, Unit> function1) {
        this.onPromotionPageButtonClick = function1;
    }

    @ModelProp
    public final void setPage(@NotNull BrowsePage.Promotion promotion) {
        Intrinsics.h(promotion, "<set-?>");
        this.page = promotion;
    }

    @ModelProp
    public final void setPagingFlow(@NotNull StateFlow<Integer> stateFlow) {
        Intrinsics.h(stateFlow, "<set-?>");
        this.pagingFlow = stateFlow;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PromotionPageEpoxyModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ PromotionPageEpoxyModel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PromotionPageEpoxyModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
    }
}
