package au.com.woolworths.feature.rewards.offers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.SnapHelper;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.feature.rewards.offers.databinding.ItemRewardsOfferGroupTitleBinding;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.ModelView;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ProductOffersCarousel;", "Lcom/airbnb/epoxy/Carousel;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "", UrlHandler.ACTION, "setOnSwipeStarted", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "", "setOnSwipeEnded", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/airbnb/epoxy/Carousel$SnapHelperFactory;", "getSnapHelperFactory", "()Lcom/airbnb/epoxy/Carousel$SnapHelperFactory;", "RVAccessibilityDelegate", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ModelView
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductOffersCarousel extends Carousel {
    public final GridLayoutManager e1;
    public final ProductOfferStickyHeaderDecoration f1;
    public Function0 g1;
    public Function1 h1;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ProductOffersCarousel$Companion;", "", "", "COLUMNS_PER_SCREEN", "F", "SINGLE_COLUMN", "", "DIRECTION_RIGHT", "I", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ProductOffersCarousel$RVAccessibilityDelegate;", "Landroidx/recyclerview/widget/RecyclerViewAccessibilityDelegate;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SuppressLint
    public final class RVAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        public RVAccessibilityDelegate(ProductOffersCarousel productOffersCarousel) {
            super(productOffersCarousel);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup host, View child, AccessibilityEvent event) {
            Context context;
            Intrinsics.h(host, "host");
            Intrinsics.h(child, "child");
            Intrinsics.h(event, "event");
            if ((host instanceof RecyclerView) && (context = ProductOffersCarousel.this.getContext()) != null && ContextExtKt.d(context)) {
                RecyclerView recyclerView = (RecyclerView) host;
                Intrinsics.e(recyclerView.getLayoutManager());
                int iO = RecyclerView.LayoutManager.O(child);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.e(layoutManager);
                boolean zW = layoutManager.W(child, true);
                if (event.getEventType() == 32768 && !zW) {
                    recyclerView.s0(iO);
                }
            }
            return this.f2466a.onRequestSendAccessibilityEvent(host, child, event);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/rewards/offers/ProductOffersCarousel$getSnapHelperFactory$1", "Lcom/airbnb/epoxy/Carousel$SnapHelperFactory;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.rewards.offers.ProductOffersCarousel$getSnapHelperFactory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C04691 extends Carousel.SnapHelperFactory {
        @Override // com.airbnb.epoxy.Carousel.SnapHelperFactory
        public final SnapHelper a() {
            return new PagerSnapHelper();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductOffersCarousel(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2, 0);
        this.e1 = gridLayoutManager;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = ItemRewardsOfferGroupTitleBinding.z;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ItemRewardsOfferGroupTitleBinding itemRewardsOfferGroupTitleBinding = (ItemRewardsOfferGroupTitleBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.item_rewards_offer_group_title, null, false, null);
        Intrinsics.g(itemRewardsOfferGroupTitleBinding, "inflate(...)");
        ProductOfferStickyHeaderDecoration productOfferStickyHeaderDecoration = new ProductOfferStickyHeaderDecoration(itemRewardsOfferGroupTitleBinding);
        this.f1 = productOfferStickyHeaderDecoration;
        setTag("ProductOffersCarousel");
        setLayoutManager(gridLayoutManager);
        i(productOfferStickyHeaderDecoration);
        k(new RecyclerView.OnScrollListener() { // from class: au.com.woolworths.feature.rewards.offers.ProductOffersCarousel.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void a(int i2, RecyclerView recyclerView) {
                Function0 function0;
                ProductOffersCarousel productOffersCarousel = ProductOffersCarousel.this;
                if (i2 != 0) {
                    if (i2 == 1 && (function0 = productOffersCarousel.g1) != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                Function1 function1 = productOffersCarousel.h1;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(!recyclerView.canScrollHorizontally(1)));
                }
            }
        });
        setAccessibilityDelegateCompat(new RVAccessibilityDelegate(this));
    }

    @Override // com.airbnb.epoxy.Carousel
    @NotNull
    public Carousel.SnapHelperFactory getSnapHelperFactory() {
        return new C04691();
    }

    public final void setOnSwipeEnded(@NotNull Function1<? super Boolean, Unit> action) {
        Intrinsics.h(action, "action");
        this.h1 = action;
    }

    public final void setOnSwipeStarted(@NotNull Function0<Unit> action) {
        Intrinsics.h(action, "action");
        this.g1 = action;
    }
}
