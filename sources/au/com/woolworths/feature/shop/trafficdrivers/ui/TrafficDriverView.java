package au.com.woolworths.feature.shop.trafficdrivers.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.trafficdrivers.data.TrafficDriverItem;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R7\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/feature/shop/trafficdrivers/ui/TrafficDriverView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/feature/shop/trafficdrivers/data/TrafficDriverItem;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "getTrafficDriverItem", "()Lau/com/woolworths/feature/shop/trafficdrivers/data/TrafficDriverItem;", "setTrafficDriverItem", "(Lau/com/woolworths/feature/shop/trafficdrivers/data/TrafficDriverItem;)V", "trafficDriverItem", "Lkotlin/Function0;", "", "m", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "onClick", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TrafficDriverView extends AbstractComposeView {
    public static final /* synthetic */ int n = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableState trafficDriverItem;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableState onClick;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrafficDriverView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1945991146);
        if ((((composerImplV.n(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1273302878, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.trafficdrivers.ui.TrafficDriverView$Content$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TrafficDriverView trafficDriverView = this.d;
                        TrafficDriverItem trafficDriverItem = trafficDriverView.getTrafficDriverItem();
                        if (trafficDriverItem != null) {
                            TrafficDriverUiKt.a(trafficDriverItem, null, trafficDriverView.getOnClick(), composer2, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 12, this);
        }
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return (Function0) ((SnapshotMutableStateImpl) this.onClick).getD();
    }

    @Nullable
    public final TrafficDriverItem getTrafficDriverItem() {
        return (TrafficDriverItem) ((SnapshotMutableStateImpl) this.trafficDriverItem).getD();
    }

    public final void setOnClick(@NotNull Function0<Unit> function0) {
        Intrinsics.h(function0, "<set-?>");
        ((SnapshotMutableStateImpl) this.onClick).setValue(function0);
    }

    public final void setTrafficDriverItem(@Nullable TrafficDriverItem trafficDriverItem) {
        ((SnapshotMutableStateImpl) this.trafficDriverItem).setValue(trafficDriverItem);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrafficDriverView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ TrafficDriverView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrafficDriverView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.trafficDriverItem = SnapshotStateKt.f(null);
        this.onClick = SnapshotStateKt.f(new au.com.woolworths.feature.shop.bundles.ui.a(6));
    }
}
