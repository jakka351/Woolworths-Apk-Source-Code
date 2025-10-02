package au.com.woolworths.feature.product.list.compose;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AbstractComposeView;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.c0;
import au.com.woolworths.feature.product.list.data.FullScreenMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RC\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/feature/product/list/compose/FullScreenMessageView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/feature/product/list/data/FullScreenMessage;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "getFullScreenMessage", "()Lau/com/woolworths/feature/product/list/data/FullScreenMessage;", "setFullScreenMessage", "(Lau/com/woolworths/feature/product/list/data/FullScreenMessage;)V", "fullScreenMessage", "Lkotlin/Function1;", "Lau/com/woolworths/base/shopapp/modules/button/Button;", "", "m", "getOnButtonClick", "()Lkotlin/jvm/functions/Function1;", "setOnButtonClick", "(Lkotlin/jvm/functions/Function1;)V", "onButtonClick", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FullScreenMessageView extends AbstractComposeView {
    public static final /* synthetic */ int n = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableState fullScreenMessage;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableState onButtonClick;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FullScreenMessageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-884873567);
        if ((((composerImplV.n(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1293945511, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.FullScreenMessageView$Content$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        FullScreenMessageView fullScreenMessageView = this.d;
                        FullScreenMessage fullScreenMessage = fullScreenMessageView.getFullScreenMessage();
                        composer2.o(667967489);
                        if (fullScreenMessage != null) {
                            FullScreenMessageContentKt.b(fullScreenMessage, null, fullScreenMessageView.getOnButtonClick(), composer2, 0);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.e(i, 4, this);
        }
    }

    @Nullable
    public final FullScreenMessage getFullScreenMessage() {
        return (FullScreenMessage) ((SnapshotMutableStateImpl) this.fullScreenMessage).getD();
    }

    @NotNull
    public final Function1<Button, Unit> getOnButtonClick() {
        return (Function1) ((SnapshotMutableStateImpl) this.onButtonClick).getD();
    }

    public final void setFullScreenMessage(@Nullable FullScreenMessage fullScreenMessage) {
        ((SnapshotMutableStateImpl) this.fullScreenMessage).setValue(fullScreenMessage);
    }

    public final void setOnButtonClick(@NotNull Function1<? super Button, Unit> function1) {
        Intrinsics.h(function1, "<set-?>");
        ((SnapshotMutableStateImpl) this.onButtonClick).setValue(function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FullScreenMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ FullScreenMessageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FullScreenMessageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.fullScreenMessage = SnapshotStateKt.f(null);
        this.onButtonClick = SnapshotStateKt.f(new c0(7));
    }
}
