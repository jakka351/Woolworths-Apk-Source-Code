package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import com.airbnb.epoxy.CallbackProp;
import com.airbnb.epoxy.ModelProp;
import com.airbnb.epoxy.ModelView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@ModelView
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@GX\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R:\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/HowItWorksCardView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "l", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "Lkotlin/Function0;", "", "m", "Lkotlin/jvm/functions/Function0;", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "onClickListener", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HowItWorksCardView extends AbstractComposeView {
    public static final /* synthetic */ int n = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public String title;

    /* renamed from: m, reason: from kotlin metadata */
    public Function0 onClickListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HowItWorksCardView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(132722252);
        if ((((composerImplV.I(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-574663932, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.HowItWorksCardView$Content$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        HowItWorksCardView howItWorksCardView = this.d;
                        String title = howItWorksCardView.getTitle();
                        composer2.o(5004770);
                        boolean zI = composer2.I(howItWorksCardView);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new f(howItWorksCardView, 24);
                            composer2.A(objG);
                        }
                        composer2.l();
                        HowItWorksCardKt.a(title, (Function0) objG, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 5, this);
        }
    }

    @Nullable
    public final Function0<Unit> getOnClickListener() {
        return this.onClickListener;
    }

    @NotNull
    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        Intrinsics.p("title");
        throw null;
    }

    @CallbackProp
    public final void setOnClickListener(@Nullable Function0<Unit> function0) {
        this.onClickListener = function0;
    }

    @ModelProp
    public final void setTitle(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.title = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HowItWorksCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ HowItWorksCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HowItWorksCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
    }
}
