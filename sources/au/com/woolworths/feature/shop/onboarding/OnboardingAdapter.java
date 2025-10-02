package au.com.woolworths.feature.shop.onboarding;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData;
import au.com.woolworths.feature.shop.onboarding.databinding.ItemOnboardingContentBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingAdapter$BaseViewHolder;", "BaseViewHolder", "BasePageState", "PageStateType", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public List g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingAdapter$BasePageState;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BasePageState {
        PageStateType a();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class BaseViewHolder extends RecyclerView.ViewHolder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingAdapter$PageStateType;", "", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageStateType {
        public static final PageStateType d;
        public static final /* synthetic */ PageStateType[] e;
        public static final /* synthetic */ EnumEntries f;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/onboarding/OnboardingAdapter.PageStateType.ONBOARDING_PAGE", "Lau/com/woolworths/feature/shop/onboarding/OnboardingAdapter$PageStateType;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ONBOARDING_PAGE extends PageStateType {
            public ONBOARDING_PAGE() {
                super("ONBOARDING_PAGE", 0);
            }

            @Override // au.com.woolworths.feature.shop.onboarding.OnboardingAdapter.PageStateType
            public final OnboardingContentViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i = ItemOnboardingContentBinding.C;
                androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                ItemOnboardingContentBinding itemOnboardingContentBinding = (ItemOnboardingContentBinding) ViewDataBinding.q(layoutInflater, com.woolworths.R.layout.item_onboarding_content, viewGroup, false, null);
                Intrinsics.g(itemOnboardingContentBinding, "inflate(...)");
                return new OnboardingContentViewHolder(itemOnboardingContentBinding);
            }
        }

        static {
            ONBOARDING_PAGE onboarding_page = new ONBOARDING_PAGE();
            d = onboarding_page;
            PageStateType[] pageStateTypeArr = {onboarding_page};
            e = pageStateTypeArr;
            f = EnumEntriesKt.a(pageStateTypeArr);
        }

        public static PageStateType valueOf(String str) {
            return (PageStateType) Enum.valueOf(PageStateType.class, str);
        }

        public static PageStateType[] values() {
            return (PageStateType[]) e.clone();
        }

        public abstract OnboardingContentViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        return ((BasePageState) this.g.get(i)).a().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (baseViewHolder instanceof OnboardingContentViewHolder) {
            Object obj = this.g.get(i);
            Intrinsics.f(obj, "null cannot be cast to non-null type au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData");
            ((OnboardingContentViewHolder) baseViewHolder).f7952a.L((OnboardingCarouselData) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        PageStateType pageStateType = (PageStateType) PageStateType.f.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.g(layoutInflaterFrom, "from(...)");
        return pageStateType.a(layoutInflaterFrom, viewGroup);
    }
}
