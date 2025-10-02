package au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper;

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
import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.MapFeatureHighlightKt;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR;\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R;\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R4\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R4\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/featurehighlight/wrapper/MapFeatureHighlightView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "getOnAcceptListenerHolder", "()Lkotlin/jvm/functions/Function0;", "setOnAcceptListenerHolder", "(Lkotlin/jvm/functions/Function0;)V", "onAcceptListenerHolder", "m", "getOnCloseListenerHolder", "setOnCloseListenerHolder", "onCloseListenerHolder", "value", "getAcceptListener", "setAcceptListener", "acceptListener", "getCloseListener", "setCloseListener", "closeListener", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MapFeatureHighlightView extends AbstractComposeView {
    public static final /* synthetic */ int n = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableState onAcceptListenerHolder;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableState onCloseListenerHolder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapFeatureHighlightView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    private final Function0<Unit> getOnAcceptListenerHolder() {
        return (Function0) ((SnapshotMutableStateImpl) this.onAcceptListenerHolder).getD();
    }

    private final Function0<Unit> getOnCloseListenerHolder() {
        return (Function0) ((SnapshotMutableStateImpl) this.onCloseListenerHolder).getD();
    }

    private final void setOnAcceptListenerHolder(Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onAcceptListenerHolder).setValue(function0);
    }

    private final void setOnCloseListenerHolder(Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onCloseListenerHolder).setValue(function0);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1986738135);
        if ((((composerImplV.n(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1520408945, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper.MapFeatureHighlightView$Content$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(5004770);
                        final MapFeatureHighlightView mapFeatureHighlightView = this.d;
                        boolean zI = composer2.I(mapFeatureHighlightView);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI || objG == composer$Companion$Empty$1) {
                            final int i2 = 0;
                            objG = new Function0() { // from class: au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i2) {
                                        case 0:
                                            Function0<Unit> closeListener = mapFeatureHighlightView.getCloseListener();
                                            if (closeListener != null) {
                                                closeListener.invoke();
                                            }
                                            break;
                                        default:
                                            Function0<Unit> acceptListener = mapFeatureHighlightView.getAcceptListener();
                                            if (acceptListener != null) {
                                                acceptListener.invoke();
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
                        boolean zI2 = composer2.I(mapFeatureHighlightView);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                            final int i3 = 1;
                            objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            Function0<Unit> closeListener = mapFeatureHighlightView.getCloseListener();
                                            if (closeListener != null) {
                                                closeListener.invoke();
                                            }
                                            break;
                                        default:
                                            Function0<Unit> acceptListener = mapFeatureHighlightView.getAcceptListener();
                                            if (acceptListener != null) {
                                                acceptListener.invoke();
                                            }
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG2);
                        }
                        composer2.l();
                        MapFeatureHighlightKt.b(0, composer2, null, function0, (Function0) objG2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 2, this);
        }
    }

    @Nullable
    public final Function0<Unit> getAcceptListener() {
        return getOnAcceptListenerHolder();
    }

    @Nullable
    public final Function0<Unit> getCloseListener() {
        return getOnCloseListenerHolder();
    }

    public final void setAcceptListener(@Nullable Function0<Unit> function0) {
        setOnAcceptListenerHolder(function0);
    }

    public final void setCloseListener(@Nullable Function0<Unit> function0) {
        setOnCloseListenerHolder(function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapFeatureHighlightView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ MapFeatureHighlightView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapFeatureHighlightView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.onAcceptListenerHolder = SnapshotStateKt.f(null);
        this.onCloseListenerHolder = SnapshotStateKt.f(null);
    }
}
