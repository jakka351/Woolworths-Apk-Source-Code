package au.com.woolworths.shop.buyagain.ui.legacy.footer;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy;
import com.airbnb.epoxy.CallbackProp;
import com.airbnb.epoxy.ModelProp;
import com.airbnb.epoxy.ModelView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/footer/BuyAgainFooterView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$FooterState;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "get_footerState", "()Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$FooterState;", "set_footerState", "(Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$FooterState;)V", "_footerState", "Lau/com/woolworths/shop/buyagain/ui/legacy/footer/BuyAgainFooterListener;", "value", "m", "Lau/com/woolworths/shop/buyagain/ui/legacy/footer/BuyAgainFooterListener;", "getBuyAgainFooterListener", "()Lau/com/woolworths/shop/buyagain/ui/legacy/footer/BuyAgainFooterListener;", "setBuyAgainFooterListener", "(Lau/com/woolworths/shop/buyagain/ui/legacy/footer/BuyAgainFooterListener;)V", "buyAgainFooterListener", "getFooterState", "setFooterState", "footerState", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ModelView
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainFooterView extends AbstractComposeView {
    public static final /* synthetic */ int n = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableState _footerState;

    /* renamed from: m, reason: from kotlin metadata */
    public BuyAgainFooterListener buyAgainFooterListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BuyAgainFooterView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    private final BuyAgainContractLegacy.FooterState get_footerState() {
        return (BuyAgainContractLegacy.FooterState) ((SnapshotMutableStateImpl) this._footerState).getD();
    }

    private final void set_footerState(BuyAgainContractLegacy.FooterState footerState) {
        ((SnapshotMutableStateImpl) this._footerState).setValue(footerState);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1430752938);
        if ((((composerImplV.I(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final BuyAgainContractLegacy.FooterState footerState = getFooterState();
            if (footerState != null) {
                ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-150534159, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.footer.BuyAgainFooterView$Content$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            composer2.o(5004770);
                            final BuyAgainFooterView buyAgainFooterView = this;
                            boolean zI = composer2.I(buyAgainFooterView);
                            Object objG = composer2.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            if (zI || objG == composer$Companion$Empty$1) {
                                final int i2 = 0;
                                objG = new Function0() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.footer.b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i2) {
                                            case 0:
                                                BuyAgainFooterListener buyAgainFooterListener = buyAgainFooterView.getBuyAgainFooterListener();
                                                if (buyAgainFooterListener != null) {
                                                    buyAgainFooterListener.f2();
                                                }
                                                break;
                                            default:
                                                BuyAgainFooterListener buyAgainFooterListener2 = buyAgainFooterView.getBuyAgainFooterListener();
                                                if (buyAgainFooterListener2 != null) {
                                                    buyAgainFooterListener2.S5();
                                                }
                                                break;
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG);
                            }
                            Function0 function0 = (Function0) objG;
                            composer2.l();
                            composer2.o(5004770);
                            boolean zI2 = composer2.I(buyAgainFooterView);
                            Object objG2 = composer2.G();
                            if (zI2 || objG2 == composer$Companion$Empty$1) {
                                final int i3 = 1;
                                objG2 = new Function0() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.footer.b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i3) {
                                            case 0:
                                                BuyAgainFooterListener buyAgainFooterListener = buyAgainFooterView.getBuyAgainFooterListener();
                                                if (buyAgainFooterListener != null) {
                                                    buyAgainFooterListener.f2();
                                                }
                                                break;
                                            default:
                                                BuyAgainFooterListener buyAgainFooterListener2 = buyAgainFooterView.getBuyAgainFooterListener();
                                                if (buyAgainFooterListener2 != null) {
                                                    buyAgainFooterListener2.S5();
                                                }
                                                break;
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG2);
                            }
                            composer2.l();
                            BuyAgainFooterKt.a(footerState, function0, (Function0) objG2, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV));
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 23, this);
        }
    }

    @Nullable
    public final BuyAgainFooterListener getBuyAgainFooterListener() {
        return this.buyAgainFooterListener;
    }

    @Nullable
    public final BuyAgainContractLegacy.FooterState getFooterState() {
        return get_footerState();
    }

    @CallbackProp
    public final void setBuyAgainFooterListener(@Nullable BuyAgainFooterListener buyAgainFooterListener) {
        this.buyAgainFooterListener = buyAgainFooterListener;
    }

    @ModelProp
    public final void setFooterState(@Nullable BuyAgainContractLegacy.FooterState footerState) {
        set_footerState(footerState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BuyAgainFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ BuyAgainFooterView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BuyAgainFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this._footerState = SnapshotStateKt.f(null);
    }
}
