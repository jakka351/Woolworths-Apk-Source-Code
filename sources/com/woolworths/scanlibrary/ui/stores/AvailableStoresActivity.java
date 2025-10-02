package com.woolworths.scanlibrary.ui.stores;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.databinding.ActivityAvailableStoresBinding;
import com.woolworths.scanlibrary.databinding.ViewStateItemBinding;
import com.woolworths.scanlibrary.ui.stores.dto.StateDTO;
import com.woolworths.scanlibrary.ui.stores.viewholders.AvailableStateItemViewHolder;
import com.woolworths.scanlibrary.util.adapter.RecyclerAdapter;
import com.woolworths.scanlibrary.util.widget.AnimationGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoresActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AvailableStoresActivity extends DaggerBaseMvvmActivity {
    public static final /* synthetic */ int L = 0;
    public ActivityAvailableStoresBinding E;
    public final ViewModelLazy F = new ViewModelLazy(Reflection.f24268a.b(AvailableStoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.stores.AvailableStoresActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new c(this, 0), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.stores.AvailableStoresActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public List G = new ArrayList();
    public AvailableStoresActivity$getAvailableStoreLocationListView$1 H;
    public List I;
    public AnimationGroup J;
    public Slide K;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoresActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public static void W4(int i, RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        Intrinsics.g(context, "getContext(...)");
        LayoutAnimationController layoutAnimationControllerLoadLayoutAnimation = AnimationUtils.loadLayoutAnimation(context, i);
        Intrinsics.g(layoutAnimationControllerLoadLayoutAnimation, "loadLayoutAnimation(...)");
        recyclerView.setLayoutAnimation(layoutAnimationControllerLoadLayoutAnimation);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.e(adapter);
        adapter.l();
        recyclerView.scheduleLayoutAnimation();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final int O4() {
        return R.layout.activity_available_stores;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final void R4() throws Resources.NotFoundException {
        this.E = (ActivityAvailableStoresBinding) DataBindingUtil.d(this, R.layout.activity_available_stores);
        String[] stringArray = getResources().getStringArray(R.array.sng_state_list);
        Intrinsics.g(stringArray, "getStringArray(...)");
        this.I = ArraysKt.l0(stringArray);
        ActivityAvailableStoresBinding activityAvailableStoresBinding = this.E;
        if (activityAvailableStoresBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        this.J = new AnimationGroup(activityAvailableStoresBinding.A, activityAvailableStoresBinding.D);
        Slide slide = new Slide();
        slide.setSlideEdge(80);
        slide.setMode(1);
        AnimationGroup animationGroup = this.J;
        if (animationGroup == null) {
            Intrinsics.p("emptyGroup");
            throw null;
        }
        for (View view : animationGroup.f21376a) {
            slide.addTarget(view);
        }
        this.K = slide;
        ActivityAvailableStoresBinding activityAvailableStoresBinding2 = this.E;
        if (activityAvailableStoresBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityAvailableStoresBinding2.B.y);
        ActivityAvailableStoresBinding activityAvailableStoresBinding3 = this.E;
        if (activityAvailableStoresBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityAvailableStoresBinding3.B.z.setText(getResources().getString(R.string.sng_label_scan_and_go_available_stores));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
            supportActionBar.s(true);
        }
        ActivityAvailableStoresBinding activityAvailableStoresBinding4 = this.E;
        if (activityAvailableStoresBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        RecyclerView recyclerView = activityAvailableStoresBinding4.y;
        List list = this.I;
        if (list == null) {
            Intrinsics.p("sateStringList");
            throw null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            arrayList.add(new StateDTO((String) obj, i == 0));
            i = i2;
        }
        final List listG0 = CollectionsKt.G0(arrayList);
        final AvailableStoresActivity$getAvailableStateListView$onItemClickListener$1 availableStoresActivity$getAvailableStateListView$onItemClickListener$1 = new AvailableStoresActivity$getAvailableStateListView$onItemClickListener$1(this, listG0);
        recyclerView.setAdapter(new RecyclerAdapter<StateDTO, RecyclerView.ViewHolder>(listG0) { // from class: com.woolworths.scanlibrary.ui.stores.AvailableStoresActivity$getAvailableStateListView$1
            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter
            public final void G(RecyclerView.ViewHolder viewHolder, Object obj2, int i3) {
                StateDTO model = (StateDTO) obj2;
                Intrinsics.h(model, "model");
                if (viewHolder instanceof AvailableStateItemViewHolder) {
                    AvailableStateItemViewHolder availableStateItemViewHolder = (AvailableStateItemViewHolder) viewHolder;
                    ViewStateItemBinding viewStateItemBinding = availableStateItemViewHolder.f21344a;
                    viewStateItemBinding.G(252, model);
                    TextView textView = viewStateItemBinding.z;
                    ConstraintLayout constraintLayout = viewStateItemBinding.y;
                    viewStateItemBinding.l();
                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                    Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    Context context = constraintLayout.getContext();
                    Intrinsics.g(context, "getContext(...)");
                    layoutParams2.setMargins((int) TypedValue.applyDimension(1, availableStateItemViewHolder.getAdapterPosition() == 0 ? 16.0f : 2.0f, context.getResources().getDisplayMetrics()), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                    Drawable background = textView.getBackground();
                    Intrinsics.f(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    Context context2 = constraintLayout.getContext();
                    boolean z = model.b;
                    int i4 = R.color.sng_gray7;
                    gradientDrawable.setStroke(3, context2.getColor(z ? R.color.sng_color_primary : R.color.sng_gray7));
                    Context context3 = constraintLayout.getContext();
                    if (model.b) {
                        i4 = R.color.sng_color_primary;
                    }
                    textView.setTextColor(context3.getColor(i4));
                    textView.setOnClickListener(new androidx.navigation.ui.a(24, availableStateItemViewHolder, model));
                }
            }

            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i3) {
                if (i3 != R.layout.view_state_item) {
                    throw new IllegalArgumentException(YU.a.d(i3, "unknown view type "));
                }
                int i4 = AvailableStateItemViewHolder.c;
                ViewDataBinding viewDataBindingC = DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), R.layout.view_state_item, viewGroup, false, null);
                Intrinsics.g(viewDataBindingC, "inflate(...)");
                return new AvailableStateItemViewHolder((ViewStateItemBinding) viewDataBindingC, availableStoresActivity$getAvailableStateListView$onItemClickListener$1);
            }
        });
        ActivityAvailableStoresBinding activityAvailableStoresBinding5 = this.E;
        if (activityAvailableStoresBinding5 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        RecyclerView availableStates = activityAvailableStoresBinding5.y;
        Intrinsics.g(availableStates, "availableStates");
        W4(R.anim.layout_animation_from_right, availableStates);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final boolean S4() {
        return false;
    }

    public final AvailableStoreViewModel V4() {
        return (AvailableStoreViewModel) this.F.getD();
    }

    public final void X4(List list) {
        if (!list.isEmpty()) {
            ActivityAvailableStoresBinding activityAvailableStoresBinding = this.E;
            if (activityAvailableStoresBinding == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            activityAvailableStoresBinding.z.setVisibility(0);
            AnimationGroup animationGroup = this.J;
            if (animationGroup != null) {
                animationGroup.a(8);
                return;
            } else {
                Intrinsics.p("emptyGroup");
                throw null;
            }
        }
        ActivityAvailableStoresBinding activityAvailableStoresBinding2 = this.E;
        if (activityAvailableStoresBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        TextView storeEmptyMsg = activityAvailableStoresBinding2.D;
        Intrinsics.g(storeEmptyMsg, "storeEmptyMsg");
        String string = getString(R.string.sng_no_stores);
        Intrinsics.g(string, "getString(...)");
        String string2 = getString(R.string.sng_title_scan_n_go);
        Intrinsics.g(string2, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        int iC = StringsKt.C(string, string2, 0, false, 6);
        int length = string2.length() + iC;
        storeEmptyMsg.setTextColor(getColor(R.color.sng_color_primary));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        spannableStringBuilder.setSpan(new StyleSpan(1), iC, length, 33);
        storeEmptyMsg.setText(spannableStringBuilder);
        ActivityAvailableStoresBinding activityAvailableStoresBinding3 = this.E;
        if (activityAvailableStoresBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityAvailableStoresBinding3.z.setVisibility(8);
        ActivityAvailableStoresBinding activityAvailableStoresBinding4 = this.E;
        if (activityAvailableStoresBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        View view = activityAvailableStoresBinding4.h;
        Intrinsics.f(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        Slide slide = this.K;
        if (slide == null) {
            Intrinsics.p("slideInEmptyViewAnim");
            throw null;
        }
        TransitionManager.beginDelayedTransition(viewGroup, slide);
        AnimationGroup animationGroup2 = this.J;
        if (animationGroup2 != null) {
            animationGroup2.a(0);
        } else {
            Intrinsics.p("emptyGroup");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityAvailableStoresBinding activityAvailableStoresBinding = this.E;
        if (activityAvailableStoresBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityAvailableStoresBinding.L(activityAvailableStoresBinding.E);
        activityAvailableStoresBinding.D(this);
        V4().k.f21341a.f(this, new AvailableStoresActivity$sam$androidx_lifecycle_Observer$0(new i(this, 20)));
        U4(V4().f, V4().g);
        this.H = new AvailableStoresActivity$getAvailableStoreLocationListView$1(this.G, R.layout.view_available_store_item, RecyclerView.ViewHolder.class);
        ActivityAvailableStoresBinding activityAvailableStoresBinding2 = this.E;
        if (activityAvailableStoresBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        RecyclerView recyclerView = activityAvailableStoresBinding2.z;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AvailableStoresActivity$getAvailableStoreLocationListView$1 availableStoresActivity$getAvailableStoreLocationListView$1 = this.H;
        if (availableStoresActivity$getAvailableStoreLocationListView$1 == null) {
            Intrinsics.p("availableStoreListAdapter");
            throw null;
        }
        recyclerView.setAdapter(availableStoresActivity$getAvailableStoreLocationListView$1);
        V4().r6();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        V4().i.a(Screens.p);
    }
}
