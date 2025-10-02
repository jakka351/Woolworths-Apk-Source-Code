package androidx.media3.exoplayer.drm;

import android.view.View;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.recyclerview.widget.GridLayoutManager;
import au.com.woolworths.feature.rewards.offers.ProductOfferStickyHeaderDecoration;
import au.com.woolworths.feature.rewards.offers.ProductOffersCarousel;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f = eventDispatcher;
        this.g = drmSessionEventListener;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) this.f;
                ((DrmSessionEventListener) this.g).b0(eventDispatcher.f3079a, eventDispatcher.b, this.e);
                break;
            default:
                ProductOffersCarousel productOffersCarousel = (ProductOffersCarousel) this.f;
                List list = (List) this.g;
                GridLayoutManager gridLayoutManager = productOffersCarousel.e1;
                int i = this.e;
                gridLayoutManager.J1(i);
                ProductOfferStickyHeaderDecoration productOfferStickyHeaderDecoration = productOffersCarousel.f1;
                productOfferStickyHeaderDecoration.getClass();
                Intrinsics.h(list, "<set-?>");
                productOfferStickyHeaderDecoration.b = list;
                productOffersCarousel.T();
                boolean z = list.size() <= i;
                if (z) {
                    productOffersCarousel.setClipToPadding(true);
                    productOffersCarousel.setPadding(productOffersCarousel.getPaddingLeft(), productOffersCarousel.getPaddingTop(), productOffersCarousel.B0(R.dimen.half_default_padding), productOffersCarousel.getPaddingBottom());
                } else {
                    productOffersCarousel.setClipToPadding(false);
                    productOffersCarousel.setPadding(productOffersCarousel.getPaddingLeft(), productOffersCarousel.getPaddingTop(), productOffersCarousel.B0(R.dimen.default_padding), productOffersCarousel.getPaddingBottom());
                }
                float f = z ? 1.0f : 1.1f;
                if (productOffersCarousel.getNumViewsToShowOnScreen() != f) {
                    productOffersCarousel.setNumViewsToShowOnScreen(f);
                    Iterator it = new ViewGroupKt$children$1(productOffersCarousel).getF24664a();
                    while (true) {
                        ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
                        if (!viewGroupKt$iterator$1.hasNext()) {
                            break;
                        } else {
                            productOffersCarousel.Y((View) viewGroupKt$iterator$1.next());
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ b(ProductOffersCarousel productOffersCarousel, int i, List list) {
        this.f = productOffersCarousel;
        this.e = i;
        this.g = list;
    }
}
