package au.com.woolworths.feature.shop.homepage.presentation.carousel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.tile.ProductClickListener;
import com.airbnb.epoxy.CallbackProp;
import com.airbnb.epoxy.ModelProp;
import com.airbnb.epoxy.ModelView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R/\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010'\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R;\u0010/\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\r\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u00108\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001008\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u0010@\u001a\u0004\u0018\u0001092\b\u00101\u001a\u0004\u0018\u0001098\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010C\u001a\u0004\u0018\u00010\n2\b\u00101\u001a\u0004\u0018\u00010\n8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u000f\"\u0004\bB\u0010\u0011R(\u0010F\u001a\u0004\u0018\u00010\u00132\b\u00101\u001a\u0004\u0018\u00010\u00138F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0016\"\u0004\bE\u0010\u0018R(\u0010I\u001a\u0004\u0018\u00010\u001a2\b\u00101\u001a\u0004\u0018\u00010\u001a8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\u001d\"\u0004\bH\u0010\u001fR$\u0010L\u001a\u00020!2\u0006\u00101\u001a\u00020!8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R4\u0010O\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010,\"\u0004\bN\u0010.¨\u0006P"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/carousel/ProductCarouselView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/android/onesite/data/HorizontalListData;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "get_data", "()Lau/com/woolworths/android/onesite/data/HorizontalListData;", "set_data", "(Lau/com/woolworths/android/onesite/data/HorizontalListData;)V", "_data", "Lau/com/woolworths/product/models/ProductCardConfig;", "m", "get_productCardConfig", "()Lau/com/woolworths/product/models/ProductCardConfig;", "set_productCardConfig", "(Lau/com/woolworths/product/models/ProductCardConfig;)V", "_productCardConfig", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionState;", "n", "get_horizontalListActionState", "()Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionState;", "set_horizontalListActionState", "(Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionState;)V", "_horizontalListActionState", "", "o", "get_rewardsThemeAction", "()Z", "set_rewardsThemeAction", "(Z)V", "_rewardsThemeAction", "", "Lau/com/woolworths/product/models/ProductId;", "p", "get_watchlistedProductIds", "()Ljava/util/List;", "set_watchlistedProductIds", "(Ljava/util/List;)V", "_watchlistedProductIds", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;", "value", "r", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;", "getHorizontalListActionClickListener", "()Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;", "setHorizontalListActionClickListener", "(Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;)V", "horizontalListActionClickListener", "Lau/com/woolworths/product/tile/ProductClickListener;", "s", "Lau/com/woolworths/product/tile/ProductClickListener;", "getProductCardClickListener", "()Lau/com/woolworths/product/tile/ProductClickListener;", "setProductCardClickListener", "(Lau/com/woolworths/product/tile/ProductClickListener;)V", "productCardClickListener", "getData", "setData", "data", "getProductCardConfig", "setProductCardConfig", "productCardConfig", "getHorizontalListActionState", "setHorizontalListActionState", "horizontalListActionState", "getRewardsThemeAction", "setRewardsThemeAction", "rewardsThemeAction", "getWatchlistedProductIds", "setWatchlistedProductIds", "watchlistedProductIds", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ModelView
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductCarouselView extends AbstractComposeView {
    public static final /* synthetic */ int t = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableState _data;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableState _productCardConfig;

    /* renamed from: n, reason: from kotlin metadata */
    public final MutableState _horizontalListActionState;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableState _rewardsThemeAction;

    /* renamed from: p, reason: from kotlin metadata */
    public final MutableState _watchlistedProductIds;
    public final LazyListState q;

    /* renamed from: r, reason: from kotlin metadata */
    public HorizontalListActionClickListener horizontalListActionClickListener;

    /* renamed from: s, reason: from kotlin metadata */
    public ProductClickListener productCardClickListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductCarouselView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    private final HorizontalListData get_data() {
        return (HorizontalListData) ((SnapshotMutableStateImpl) this._data).getD();
    }

    private final HorizontalListActionState get_horizontalListActionState() {
        return (HorizontalListActionState) ((SnapshotMutableStateImpl) this._horizontalListActionState).getD();
    }

    private final ProductCardConfig get_productCardConfig() {
        return (ProductCardConfig) ((SnapshotMutableStateImpl) this._productCardConfig).getD();
    }

    private final boolean get_rewardsThemeAction() {
        return ((Boolean) ((SnapshotMutableStateImpl) this._rewardsThemeAction).getD()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProductId> get_watchlistedProductIds() {
        return (List) ((SnapshotMutableStateImpl) this._watchlistedProductIds).getD();
    }

    private final void set_data(HorizontalListData horizontalListData) {
        ((SnapshotMutableStateImpl) this._data).setValue(horizontalListData);
    }

    private final void set_horizontalListActionState(HorizontalListActionState horizontalListActionState) {
        ((SnapshotMutableStateImpl) this._horizontalListActionState).setValue(horizontalListActionState);
    }

    private final void set_productCardConfig(ProductCardConfig productCardConfig) {
        ((SnapshotMutableStateImpl) this._productCardConfig).setValue(productCardConfig);
    }

    private final void set_rewardsThemeAction(boolean z) {
        ((SnapshotMutableStateImpl) this._rewardsThemeAction).setValue(Boolean.valueOf(z));
    }

    private final void set_watchlistedProductIds(List<ProductId> list) {
        ((SnapshotMutableStateImpl) this._watchlistedProductIds).setValue(list);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-570182756);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerImplV.c()) {
            final HorizontalListActionState horizontalListActionState = get_horizontalListActionState();
            if (horizontalListActionState == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(this) { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.c
                        public final /* synthetic */ ProductCarouselView e;

                        {
                            this.e = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Unit unit = Unit.f24250a;
                            int i5 = i;
                            ProductCarouselView productCarouselView = this.e;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            int i6 = ProductCarouselView.t;
                            switch (i4) {
                                case 0:
                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                    break;
                                case 1:
                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                    break;
                                case 2:
                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                    break;
                                case 3:
                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                    break;
                                case 4:
                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                    break;
                                default:
                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                    break;
                            }
                            return unit;
                        }
                    };
                    return;
                }
            } else {
                final HorizontalListData horizontalListData = get_data();
                if (horizontalListData == null) {
                    RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
                    if (recomposeScopeImplX2 != null) {
                        final int i4 = 1;
                        recomposeScopeImplX2.d = new Function2(this) { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.c
                            public final /* synthetic */ ProductCarouselView e;

                            {
                                this.e = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i42 = i4;
                                Unit unit = Unit.f24250a;
                                int i5 = i;
                                ProductCarouselView productCarouselView = this.e;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).intValue();
                                int i6 = ProductCarouselView.t;
                                switch (i42) {
                                    case 0:
                                        productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                        break;
                                    case 1:
                                        productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                        break;
                                    case 2:
                                        productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                        break;
                                    case 3:
                                        productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                        break;
                                    case 4:
                                        productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                        break;
                                    default:
                                        productCarouselView.a(composer2, RecomposeScopeImplKt.a(i5 | 1));
                                        break;
                                }
                                return unit;
                            }
                        };
                        return;
                    }
                } else {
                    final ProductCardConfig productCardConfig = get_productCardConfig();
                    if (productCardConfig == null) {
                        RecomposeScopeImpl recomposeScopeImplX3 = composerImplV.X();
                        if (recomposeScopeImplX3 != null) {
                            final int i5 = 2;
                            recomposeScopeImplX3.d = new Function2(this) { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.c
                                public final /* synthetic */ ProductCarouselView e;

                                {
                                    this.e = this;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i42 = i5;
                                    Unit unit = Unit.f24250a;
                                    int i52 = i;
                                    ProductCarouselView productCarouselView = this.e;
                                    Composer composer2 = (Composer) obj;
                                    ((Integer) obj2).intValue();
                                    int i6 = ProductCarouselView.t;
                                    switch (i42) {
                                        case 0:
                                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                            break;
                                        case 1:
                                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                            break;
                                        case 2:
                                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                            break;
                                        case 3:
                                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                            break;
                                        case 4:
                                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                            break;
                                        default:
                                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                            break;
                                    }
                                    return unit;
                                }
                            };
                            return;
                        }
                    } else {
                        final HorizontalListActionClickListener horizontalListActionClickListener = this.horizontalListActionClickListener;
                        if (horizontalListActionClickListener == null) {
                            RecomposeScopeImpl recomposeScopeImplX4 = composerImplV.X();
                            if (recomposeScopeImplX4 != null) {
                                final int i6 = 3;
                                recomposeScopeImplX4.d = new Function2(this) { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.c
                                    public final /* synthetic */ ProductCarouselView e;

                                    {
                                        this.e = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i42 = i6;
                                        Unit unit = Unit.f24250a;
                                        int i52 = i;
                                        ProductCarouselView productCarouselView = this.e;
                                        Composer composer2 = (Composer) obj;
                                        ((Integer) obj2).intValue();
                                        int i62 = ProductCarouselView.t;
                                        switch (i42) {
                                            case 0:
                                                productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                break;
                                            case 1:
                                                productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                break;
                                            case 2:
                                                productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                break;
                                            case 3:
                                                productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                break;
                                            case 4:
                                                productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                break;
                                            default:
                                                productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                break;
                                        }
                                        return unit;
                                    }
                                };
                                return;
                            }
                        } else {
                            final ProductClickListener productClickListener = this.productCardClickListener;
                            if (productClickListener == null) {
                                RecomposeScopeImpl recomposeScopeImplX5 = composerImplV.X();
                                if (recomposeScopeImplX5 != null) {
                                    final int i7 = 4;
                                    recomposeScopeImplX5.d = new Function2(this) { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.c
                                        public final /* synthetic */ ProductCarouselView e;

                                        {
                                            this.e = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            int i42 = i7;
                                            Unit unit = Unit.f24250a;
                                            int i52 = i;
                                            ProductCarouselView productCarouselView = this.e;
                                            Composer composer2 = (Composer) obj;
                                            ((Integer) obj2).intValue();
                                            int i62 = ProductCarouselView.t;
                                            switch (i42) {
                                                case 0:
                                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                    break;
                                                case 1:
                                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                    break;
                                                case 2:
                                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                    break;
                                                case 3:
                                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                    break;
                                                case 4:
                                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                    break;
                                                default:
                                                    productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    return;
                                }
                            } else {
                                ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-429932060, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCarouselView$Content$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Composer composer2 = (Composer) obj;
                                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, 7);
                                            ProductCarouselView productCarouselView = this.d;
                                            LazyListState lazyListState = productCarouselView.q;
                                            boolean rewardsThemeAction = productCarouselView.getRewardsThemeAction();
                                            List list = productCarouselView.get_watchlistedProductIds();
                                            if (list == null) {
                                                list = EmptyList.d;
                                            }
                                            ProductCarouselUiKt.a(horizontalListData, lazyListState, horizontalListActionState, horizontalListActionClickListener, productClickListener, productCardConfig, rewardsThemeAction, list, modifierJ, composer2, (ProductCardConfig.$stable << 15) | 100663296);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composerImplV));
                            }
                        }
                    }
                }
            }
            return;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX6 = composerImplV.X();
        if (recomposeScopeImplX6 != null) {
            final int i8 = 5;
            recomposeScopeImplX6.d = new Function2(this) { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.c
                public final /* synthetic */ ProductCarouselView e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i8;
                    Unit unit = Unit.f24250a;
                    int i52 = i;
                    ProductCarouselView productCarouselView = this.e;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    int i62 = ProductCarouselView.t;
                    switch (i42) {
                        case 0:
                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                            break;
                        case 1:
                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                            break;
                        case 2:
                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                            break;
                        case 3:
                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                            break;
                        case 4:
                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                            break;
                        default:
                            productCarouselView.a(composer2, RecomposeScopeImplKt.a(i52 | 1));
                            break;
                    }
                    return unit;
                }
            };
        }
    }

    @Nullable
    public final HorizontalListData getData() {
        return get_data();
    }

    @Nullable
    public final HorizontalListActionClickListener getHorizontalListActionClickListener() {
        return this.horizontalListActionClickListener;
    }

    @Nullable
    public final HorizontalListActionState getHorizontalListActionState() {
        return get_horizontalListActionState();
    }

    @Nullable
    public final ProductClickListener getProductCardClickListener() {
        return this.productCardClickListener;
    }

    @Nullable
    public final ProductCardConfig getProductCardConfig() {
        return get_productCardConfig();
    }

    public final boolean getRewardsThemeAction() {
        return get_rewardsThemeAction();
    }

    @Nullable
    public final List<ProductId> getWatchlistedProductIds() {
        return get_watchlistedProductIds();
    }

    @ModelProp
    public final void setData(@Nullable HorizontalListData horizontalListData) {
        set_data(horizontalListData);
    }

    @CallbackProp
    public final void setHorizontalListActionClickListener(@Nullable HorizontalListActionClickListener horizontalListActionClickListener) {
        this.horizontalListActionClickListener = horizontalListActionClickListener;
    }

    @ModelProp
    public final void setHorizontalListActionState(@Nullable HorizontalListActionState horizontalListActionState) {
        set_horizontalListActionState(horizontalListActionState);
    }

    @CallbackProp
    public final void setProductCardClickListener(@Nullable ProductClickListener productClickListener) {
        this.productCardClickListener = productClickListener;
    }

    @ModelProp
    public final void setProductCardConfig(@Nullable ProductCardConfig productCardConfig) {
        set_productCardConfig(productCardConfig);
    }

    @ModelProp
    public final void setRewardsThemeAction(boolean z) {
        set_rewardsThemeAction(z);
    }

    @ModelProp
    public final void setWatchlistedProductIds(@Nullable List<ProductId> list) {
        set_watchlistedProductIds(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ProductCarouselView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this._data = SnapshotStateKt.f(null);
        this._productCardConfig = SnapshotStateKt.f(null);
        this._horizontalListActionState = SnapshotStateKt.f(null);
        this._rewardsThemeAction = SnapshotStateKt.f(Boolean.FALSE);
        this._watchlistedProductIds = SnapshotStateKt.f(null);
        this.q = new LazyListState(0, 0);
    }
}
