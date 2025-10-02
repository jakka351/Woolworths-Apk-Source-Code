package au.com.woolworths.product.composeui.wrapper;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AbstractComposeView;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.a;
import au.com.woolworths.product.composeui.ProductLocationInfoKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R;\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010%\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R;\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R(\u0010-\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R4\u00100\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R$\u00103\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R$\u00106\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010\u0018R4\u00109\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 ¨\u0006:"}, d2 = {"Lau/com/woolworths/product/composeui/wrapper/ProductLocationInfoView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/product/models/ProductCard;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "getProductCardHolder", "()Lau/com/woolworths/product/models/ProductCard;", "setProductCardHolder", "(Lau/com/woolworths/product/models/ProductCard;)V", "productCardHolder", "", "m", "getActionableHolder", "()Z", "setActionableHolder", "(Z)V", "actionableHolder", "Lkotlin/Function0;", "", "n", "getListenerHolder", "()Lkotlin/jvm/functions/Function0;", "setListenerHolder", "(Lkotlin/jvm/functions/Function0;)V", "listenerHolder", "o", "getApplyPlaceholderHolder", "setApplyPlaceholderHolder", "applyPlaceholderHolder", "p", "getOnVisibleListenerHolder", "setOnVisibleListenerHolder", "onVisibleListenerHolder", "value", "getProductCard", "setProductCard", "productCard", "getActionListener", "setActionListener", "actionListener", "getActionable", "setActionable", "actionable", "getApplyPlaceholder", "setApplyPlaceholder", "applyPlaceholder", "getOnVisibleListener", "setOnVisibleListener", "onVisibleListener", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductLocationInfoView extends AbstractComposeView {
    public static final /* synthetic */ int q = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableState productCardHolder;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableState actionableHolder;

    /* renamed from: n, reason: from kotlin metadata */
    public final MutableState listenerHolder;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableState applyPlaceholderHolder;

    /* renamed from: p, reason: from kotlin metadata */
    public final MutableState onVisibleListenerHolder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductLocationInfoView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    private final boolean getActionableHolder() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.actionableHolder).getD()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getApplyPlaceholderHolder() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.applyPlaceholderHolder).getD()).booleanValue();
    }

    private final Function0<Unit> getListenerHolder() {
        return (Function0) ((SnapshotMutableStateImpl) this.listenerHolder).getD();
    }

    private final Function0<Unit> getOnVisibleListenerHolder() {
        return (Function0) ((SnapshotMutableStateImpl) this.onVisibleListenerHolder).getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductCard getProductCardHolder() {
        return (ProductCard) ((SnapshotMutableStateImpl) this.productCardHolder).getD();
    }

    public static final void i(ProductLocationInfoView productLocationInfoView) {
        Function0<Unit> listenerHolder;
        if (productLocationInfoView.getProductCard() == null || (listenerHolder = productLocationInfoView.getListenerHolder()) == null) {
            return;
        }
        listenerHolder.invoke();
    }

    private final void setActionableHolder(boolean z) {
        ((SnapshotMutableStateImpl) this.actionableHolder).setValue(Boolean.valueOf(z));
    }

    private final void setApplyPlaceholderHolder(boolean z) {
        ((SnapshotMutableStateImpl) this.applyPlaceholderHolder).setValue(Boolean.valueOf(z));
    }

    private final void setListenerHolder(Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.listenerHolder).setValue(function0);
    }

    private final void setOnVisibleListenerHolder(Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onVisibleListenerHolder).setValue(function0);
    }

    private final void setProductCardHolder(ProductCard productCard) {
        ((SnapshotMutableStateImpl) this.productCardHolder).setValue(productCard);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1753316524);
        int i2 = (composerImplV.n(this) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-2047364744, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView$Content$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    KFunction kFunction;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProductLocationInfoView productLocationInfoView = this.d;
                        ProductCard productCardHolder = productLocationInfoView.getProductCardHolder();
                        if (productCardHolder != null) {
                            composer2.o(-422491999);
                            boolean actionable = productLocationInfoView.getActionable();
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            if (actionable) {
                                composer2.o(5004770);
                                boolean zI = composer2.I(productLocationInfoView);
                                Object objG = composer2.G();
                                if (zI || objG == composer$Companion$Empty$1) {
                                    ProductLocationInfoView$Content$1$1$1$1 productLocationInfoView$Content$1$1$1$1 = new ProductLocationInfoView$Content$1$1$1$1(0, productLocationInfoView, ProductLocationInfoView.class, "clickListener", "clickListener()V", 0);
                                    composer2.A(productLocationInfoView$Content$1$1$1$1);
                                    objG = productLocationInfoView$Content$1$1$1$1;
                                }
                                kFunction = (KFunction) objG;
                                composer2.l();
                            } else {
                                kFunction = null;
                            }
                            composer2.l();
                            KFunction kFunction2 = kFunction;
                            boolean applyPlaceholderHolder = productLocationInfoView.getApplyPlaceholderHolder();
                            Function0<Unit> onVisibleListener = productLocationInfoView.getOnVisibleListener();
                            composer2.o(5004770);
                            boolean zI2 = composer2.I(productLocationInfoView);
                            Object objG2 = composer2.G();
                            if (zI2 || objG2 == composer$Companion$Empty$1) {
                                objG2 = new a(productLocationInfoView, 27);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            ProductLocationInfoKt.a(productCardHolder, OnGloballyPositionedModifierKt.a(Modifier.Companion.d, (Function1) objG2), applyPlaceholderHolder, (Function0) kFunction2, onVisibleListener, composer2, 0, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            ProductCard productCardHolder = getProductCardHolder();
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new ProductLocationInfoView$Content$2$1(this, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, productCardHolder, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 20, this);
        }
    }

    @Nullable
    public final Function0<Unit> getActionListener() {
        return getListenerHolder();
    }

    public final boolean getActionable() {
        return getActionableHolder();
    }

    public final boolean getApplyPlaceholder() {
        return getApplyPlaceholderHolder();
    }

    @Nullable
    public final Function0<Unit> getOnVisibleListener() {
        return getOnVisibleListenerHolder();
    }

    @Nullable
    public final ProductCard getProductCard() {
        return getProductCardHolder();
    }

    public final void setActionListener(@Nullable Function0<Unit> function0) {
        setListenerHolder(function0);
    }

    public final void setActionable(boolean z) {
        setActionableHolder(z);
    }

    public final void setApplyPlaceholder(boolean z) {
        setApplyPlaceholderHolder(z);
    }

    public final void setOnVisibleListener(@Nullable Function0<Unit> function0) {
        setOnVisibleListenerHolder(function0);
    }

    public final void setProductCard(@Nullable ProductCard productCard) {
        setProductCardHolder(productCard);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductLocationInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ProductLocationInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductLocationInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.productCardHolder = SnapshotStateKt.f(null);
        this.actionableHolder = SnapshotStateKt.f(Boolean.FALSE);
        this.listenerHolder = SnapshotStateKt.f(null);
        this.applyPlaceholderHolder = SnapshotStateKt.f(Boolean.TRUE);
        this.onVisibleListenerHolder = SnapshotStateKt.f(null);
    }
}
