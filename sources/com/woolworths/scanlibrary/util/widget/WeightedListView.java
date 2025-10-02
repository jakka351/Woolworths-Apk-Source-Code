package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.scanlibrary.R;
import com.woolworths.scanlibrary.databinding.CustomViewImageListBinding;
import com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment;
import com.woolworths.scanlibrary.util.adapter.RecyclerAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/WeightedListView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/woolworths/scanlibrary/util/adapter/RecyclerAdapter;", "Lcom/woolworths/scanlibrary/util/widget/ImageItem;", "Lcom/woolworths/scanlibrary/util/widget/ImageItemViewHolder;", "getItemRecyclerView", "()Lcom/woolworths/scanlibrary/util/adapter/RecyclerAdapter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeightedListView extends RelativeLayout {
    public static final /* synthetic */ int h = 0;
    public final CustomViewImageListBinding d;
    public final ArrayList e;
    public final RecyclerAdapter f;
    public WeightedListListener g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightedListView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        this.e = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.f, 0, 0);
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(0);
        Intrinsics.e(string);
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.t1(0);
        this.f = getItemRecyclerView();
        int i = CustomViewImageListBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        CustomViewImageListBinding customViewImageListBinding = (CustomViewImageListBinding) ViewDataBinding.q((LayoutInflater) systemService, com.woolworths.R.layout.custom_view_image_list, this, true, null);
        this.d = customViewImageListBinding;
        if (customViewImageListBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        customViewImageListBinding.y.setLayoutManager(linearLayoutManager);
        CustomViewImageListBinding customViewImageListBinding2 = this.d;
        if (customViewImageListBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        RecyclerView recyclerView = customViewImageListBinding2.y;
        RecyclerAdapter recyclerAdapter = this.f;
        if (recyclerAdapter == null) {
            Intrinsics.p("adapter");
            throw null;
        }
        recyclerView.setAdapter(recyclerAdapter);
        CustomViewImageListBinding customViewImageListBinding3 = this.d;
        if (customViewImageListBinding3 != null) {
            customViewImageListBinding3.z.setText(string);
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    private final RecyclerAdapter<ImageItem, ImageItemViewHolder> getItemRecyclerView() {
        return new RecyclerAdapter<ImageItem, ImageItemViewHolder>(this.e) { // from class: com.woolworths.scanlibrary.util.widget.WeightedListView.getItemRecyclerView.1
            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter
            public final void G(RecyclerView.ViewHolder viewHolder, Object obj, int i) {
                ImageItemViewHolder imageItemViewHolder = (ImageItemViewHolder) viewHolder;
                ImageItem model = (ImageItem) obj;
                Intrinsics.h(model, "model");
                imageItemViewHolder.bind(model);
                imageItemViewHolder.itemView.setOnClickListener(new androidx.navigation.ui.a(28, WeightedListView.this, model));
            }
        };
    }

    public final void a(List list, String str, ItemViewFragment itemViewFragment) {
        this.g = itemViewFragment;
        RecyclerAdapter recyclerAdapter = this.f;
        if (recyclerAdapter == null) {
            Intrinsics.p("adapter");
            throw null;
        }
        recyclerAdapter.H(list);
        CustomViewImageListBinding customViewImageListBinding = this.d;
        if (customViewImageListBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        customViewImageListBinding.z.setText(str);
        requestLayout();
    }
}
