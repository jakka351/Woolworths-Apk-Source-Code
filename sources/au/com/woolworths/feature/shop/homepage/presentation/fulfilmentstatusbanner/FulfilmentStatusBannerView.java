package au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner;

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
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/fulfilmentstatusbanner/FulfilmentStatusBannerView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/feature/shop/homepage/presentation/fulfilmentstatusbanner/BannerClickListener;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "getClickListener", "()Lau/com/woolworths/feature/shop/homepage/presentation/fulfilmentstatusbanner/BannerClickListener;", "setClickListener", "(Lau/com/woolworths/feature/shop/homepage/presentation/fulfilmentstatusbanner/BannerClickListener;)V", "clickListener", "Lau/com/woolworths/feature/shop/homepage/data/FulfilmentStatusBannerData;", "m", "getBannerData", "()Lau/com/woolworths/feature/shop/homepage/data/FulfilmentStatusBannerData;", "setBannerData", "(Lau/com/woolworths/feature/shop/homepage/data/FulfilmentStatusBannerData;)V", "bannerData", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FulfilmentStatusBannerView extends AbstractComposeView {
    public static final /* synthetic */ int n = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableState clickListener;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableState bannerData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FulfilmentStatusBannerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1347955816);
        if ((((composerImplV.n(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final FulfilmentStatusBannerData bannerData = getBannerData();
            if (bannerData != null) {
                ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(327179907, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.FulfilmentStatusBannerView$Content$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            composer2.o(5004770);
                            FulfilmentStatusBannerView fulfilmentStatusBannerView = this;
                            boolean zI = composer2.I(fulfilmentStatusBannerView);
                            Object objG = composer2.G();
                            if (zI || objG == Composer.Companion.f1624a) {
                                objG = new f(fulfilmentStatusBannerView, 18);
                                composer2.A(objG);
                            }
                            composer2.l();
                            FulfilmentStatusBannerKt.a(bannerData, (Function0) objG, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV));
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 29, this);
        }
    }

    @Nullable
    public final FulfilmentStatusBannerData getBannerData() {
        return (FulfilmentStatusBannerData) ((SnapshotMutableStateImpl) this.bannerData).getD();
    }

    @Nullable
    public final BannerClickListener getClickListener() {
        return (BannerClickListener) ((SnapshotMutableStateImpl) this.clickListener).getD();
    }

    public final void setBannerData(@Nullable FulfilmentStatusBannerData fulfilmentStatusBannerData) {
        ((SnapshotMutableStateImpl) this.bannerData).setValue(fulfilmentStatusBannerData);
    }

    public final void setClickListener(@Nullable BannerClickListener bannerClickListener) {
        ((SnapshotMutableStateImpl) this.clickListener).setValue(bannerClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FulfilmentStatusBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ FulfilmentStatusBannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FulfilmentStatusBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.clickListener = SnapshotStateKt.f(null);
        this.bannerData = SnapshotStateKt.f(null);
    }
}
