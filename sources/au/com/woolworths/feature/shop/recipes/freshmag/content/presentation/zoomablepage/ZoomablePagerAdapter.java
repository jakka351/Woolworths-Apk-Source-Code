package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.feature.shop.recipes.databinding.ItemZoomablePageBinding;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRectAdapter;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRectGroup;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/zoomablepage/ZoomablePagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/zoomablepage/SimpleListUpdateCallback;", "ZoomablePageViewHolder", "ZoomablePageItemCallback", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoomablePagerAdapter extends PagerAdapter implements SimpleListUpdateCallback {
    public final FreshMagContentActivity.AnonymousClass2 f;
    public final ArrayList g = new ArrayList();
    public final AsyncListDiffer h = new AsyncListDiffer(this, new AsyncDifferConfig.Builder(ZoomablePageItemCallback.f8047a).a());

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/zoomablepage/ZoomablePagerAdapter$ZoomablePageItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/zoomablepage/ZoomablePage;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZoomablePageItemCallback extends DiffUtil.ItemCallback<ZoomablePage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ZoomablePageItemCallback f8047a = new ZoomablePageItemCallback();

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final boolean a(Object obj, Object obj2) {
            ZoomablePage oldItem = (ZoomablePage) obj;
            ZoomablePage newItem = (ZoomablePage) obj2;
            Intrinsics.h(oldItem, "oldItem");
            Intrinsics.h(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final boolean b(Object obj, Object obj2) {
            ZoomablePage oldItem = (ZoomablePage) obj;
            ZoomablePage newItem = (ZoomablePage) obj2;
            Intrinsics.h(oldItem, "oldItem");
            Intrinsics.h(newItem, "newItem");
            return Intrinsics.c(oldItem.f8046a, newItem.f8046a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/zoomablepage/ZoomablePagerAdapter$ZoomablePageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ZoomablePageViewHolder extends RecyclerView.ViewHolder {
        public static final /* synthetic */ int c = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ItemZoomablePageBinding f8048a;

        public ZoomablePageViewHolder(ItemZoomablePageBinding itemZoomablePageBinding) {
            super(itemZoomablePageBinding.h);
            this.f8048a = itemZoomablePageBinding;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
        public final void c(ItemZoomablePageBinding itemZoomablePageBinding, ZoomablePage zoomablePage) {
            itemZoomablePageBinding.O(ZoomablePageViewState.d);
            itemZoomablePageBinding.L(new ZoomablePageLoaderListener(itemZoomablePageBinding));
            itemZoomablePageBinding.N(zoomablePage);
            itemZoomablePageBinding.A.setOnClickListener(new au.com.woolworths.feature.shared.web.file.uploader.a(2, this, itemZoomablePageBinding, zoomablePage));
            itemZoomablePageBinding.M(ZoomablePagerAdapter.this.f);
            ClickableRectAdapter clickableRectAdapter = new ClickableRectAdapter();
            itemZoomablePageBinding.y.setAdapter(clickableRectAdapter);
            ?? r5 = zoomablePage.d;
            ArrayList arrayList = clickableRectAdapter.f8044a;
            arrayList.clear();
            arrayList.addAll((Collection) r5);
            ClickableRectGroup clickableRectGroup = clickableRectAdapter.b;
            if (clickableRectGroup != 0) {
                clickableRectGroup.d(r5);
            }
            itemZoomablePageBinding.l();
        }
    }

    public ZoomablePagerAdapter(FreshMagContentActivity.AnonymousClass2 anonymousClass2) {
        this.f = anonymousClass2;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void d(int i, int i2) {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.e;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.notifyChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void e(ViewPager viewPager, Object object) {
        Intrinsics.h(object, "object");
        viewPager.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int g() {
        return this.g.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object h(ViewPager viewPager, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewPager.getContext());
        int i2 = ItemZoomablePageBinding.F;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ItemZoomablePageBinding itemZoomablePageBinding = (ItemZoomablePageBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_zoomable_page, viewPager, true, null);
        Intrinsics.g(itemZoomablePageBinding, "inflate(...)");
        ZoomablePageViewHolder zoomablePageViewHolder = new ZoomablePageViewHolder(itemZoomablePageBinding);
        ZoomablePage zoomablePage = (ZoomablePage) this.g.get(i);
        Intrinsics.h(zoomablePage, "zoomablePage");
        zoomablePageViewHolder.c(zoomablePageViewHolder.f8048a, zoomablePage);
        View view = itemZoomablePageBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean i(View view, Object object) {
        Intrinsics.h(view, "view");
        Intrinsics.h(object, "object");
        return view.equals(object);
    }
}
