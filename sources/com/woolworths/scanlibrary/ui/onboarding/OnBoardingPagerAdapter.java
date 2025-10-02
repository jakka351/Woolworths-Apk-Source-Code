package com.woolworths.scanlibrary.ui.onboarding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ItemOnboardingBinding;
import com.woolworths.scanlibrary.databinding.ItemOnboardingRefreshBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter$BaseViewHolder;", "BaseViewHolder", "BasePageState", "PageStateType", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnBoardingPagerAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public final OnBoardingClickListener g;
    public List h = EmptyList.d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter$BasePageState;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BasePageState {
        /* renamed from: a */
        PageStateType getI();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class BaseViewHolder extends RecyclerView.ViewHolder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter$PageStateType;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageStateType {
        public static final PageStateType d;
        public static final /* synthetic */ PageStateType[] e;
        public static final /* synthetic */ EnumEntries f;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter.PageStateType.ONBOARDING_PAGE", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter$PageStateType;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ONBOARDING_PAGE extends PageStateType {
            public ONBOARDING_PAGE() {
                super("ONBOARDING_PAGE", 0);
            }

            @Override // com.woolworths.scanlibrary.ui.onboarding.OnBoardingPagerAdapter.PageStateType
            public final BaseViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i = ItemOnboardingBinding.E;
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                ItemOnboardingBinding itemOnboardingBinding = (ItemOnboardingBinding) ViewDataBinding.q(layoutInflater, R.layout.item_onboarding, viewGroup, false, null);
                Intrinsics.g(itemOnboardingBinding, "inflate(...)");
                return new OnBoardingContentViewHolder(itemOnboardingBinding);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter.PageStateType.ONBOARDING_PAGE_REFRESH", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter$PageStateType;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ONBOARDING_PAGE_REFRESH extends PageStateType {
            public ONBOARDING_PAGE_REFRESH() {
                super("ONBOARDING_PAGE_REFRESH", 1);
            }

            @Override // com.woolworths.scanlibrary.ui.onboarding.OnBoardingPagerAdapter.PageStateType
            public final BaseViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i = ItemOnboardingRefreshBinding.F;
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                ItemOnboardingRefreshBinding itemOnboardingRefreshBinding = (ItemOnboardingRefreshBinding) ViewDataBinding.q(layoutInflater, R.layout.item_onboarding_refresh, viewGroup, false, null);
                Intrinsics.g(itemOnboardingRefreshBinding, "inflate(...)");
                return new OnBoardingContentRefreshViewHolder(itemOnboardingRefreshBinding);
            }
        }

        static {
            ONBOARDING_PAGE onboarding_page = new ONBOARDING_PAGE();
            ONBOARDING_PAGE_REFRESH onboarding_page_refresh = new ONBOARDING_PAGE_REFRESH();
            d = onboarding_page_refresh;
            PageStateType[] pageStateTypeArr = {onboarding_page, onboarding_page_refresh};
            e = pageStateTypeArr;
            f = EnumEntriesKt.a(pageStateTypeArr);
        }

        public static PageStateType valueOf(String str) {
            return (PageStateType) Enum.valueOf(PageStateType.class, str);
        }

        public static PageStateType[] values() {
            return (PageStateType[]) e.clone();
        }

        public abstract BaseViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup);
    }

    public OnBoardingPagerAdapter(OnBoardingClickListener onBoardingClickListener) {
        this.g = onBoardingClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        return ((BasePageState) this.h.get(i)).getI().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        boolean z = baseViewHolder instanceof OnBoardingContentViewHolder;
        final OnBoardingClickListener clickListener = this.g;
        if (z) {
            Object obj = this.h.get(i);
            Intrinsics.f(obj, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.onboarding.OnBoardingPageTemplateData");
            Intrinsics.h(clickListener, "clickListener");
            ItemOnboardingBinding itemOnboardingBinding = ((OnBoardingContentViewHolder) baseViewHolder).f21282a;
            itemOnboardingBinding.L((OnBoardingPageTemplateData) obj);
            itemOnboardingBinding.B.setAutoSizeTextTypeUniformWithConfiguration(14, 18, 2, 2);
            final int i2 = 1;
            itemOnboardingBinding.y.setOnClickListener(new View.OnClickListener() { // from class: com.woolworths.scanlibrary.ui.onboarding.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    OnBoardingClickListener onBoardingClickListener = clickListener;
                    switch (i3) {
                        case 0:
                            int i4 = OnBoardingContentRefreshViewHolder.b;
                            Callback.g(view);
                            try {
                                onBoardingClickListener.j4();
                                return;
                            } finally {
                            }
                        default:
                            int i5 = OnBoardingContentViewHolder.b;
                            Callback.g(view);
                            try {
                                onBoardingClickListener.j4();
                                return;
                            } finally {
                            }
                    }
                }
            });
            return;
        }
        if (baseViewHolder instanceof OnBoardingContentRefreshViewHolder) {
            Object obj2 = this.h.get(i);
            Intrinsics.f(obj2, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.onboarding.OnBoardingPageTemplateData");
            Intrinsics.h(clickListener, "clickListener");
            ItemOnboardingRefreshBinding itemOnboardingRefreshBinding = ((OnBoardingContentRefreshViewHolder) baseViewHolder).f21281a;
            itemOnboardingRefreshBinding.L((OnBoardingPageTemplateData) obj2);
            final int i3 = 0;
            itemOnboardingRefreshBinding.y.setOnClickListener(new View.OnClickListener() { // from class: com.woolworths.scanlibrary.ui.onboarding.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i3;
                    OnBoardingClickListener onBoardingClickListener = clickListener;
                    switch (i32) {
                        case 0:
                            int i4 = OnBoardingContentRefreshViewHolder.b;
                            Callback.g(view);
                            try {
                                onBoardingClickListener.j4();
                                return;
                            } finally {
                            }
                        default:
                            int i5 = OnBoardingContentViewHolder.b;
                            Callback.g(view);
                            try {
                                onBoardingClickListener.j4();
                                return;
                            } finally {
                            }
                    }
                }
            });
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
