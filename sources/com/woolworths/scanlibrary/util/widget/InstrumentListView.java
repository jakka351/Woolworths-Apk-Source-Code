package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.CustomInstrumentListsViewBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/InstrumentListView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "allow", "", "setAllowSelection", "(Z)V", "setAllowEdit", "setAllowRemove", "InstrumentListViewInteraction", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstrumentListView extends FrameLayout {
    public static final /* synthetic */ int m = 0;
    public InstrumentListView$getInstrumentAdapter$1 d;
    public List e;
    public CustomInstrumentListsViewBinding f;
    public final SparseBooleanArray g;
    public InstrumentListViewInteraction h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/InstrumentListView$Companion;", "", "", "NO_SELECTION", "I", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/InstrumentListView$InstrumentListViewInteraction;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface InstrumentListViewInteraction {
        void a(PaymentInstrument paymentInstrument);

        void b(PaymentInstrument paymentInstrument);

        void c(PaymentInstrument paymentInstrument);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentListView(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.e = new ArrayList();
        this.g = new SparseBooleanArray();
        this.i = -1;
        this.j = true;
        this.k = true;
        this.l = true;
        a(context);
    }

    public final void a(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.d = new InstrumentListView$getInstrumentAdapter$1(this.k, this.l, false, false, this, this.e);
        int i = CustomInstrumentListsViewBinding.z;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        CustomInstrumentListsViewBinding customInstrumentListsViewBinding = (CustomInstrumentListsViewBinding) ViewDataBinding.q((LayoutInflater) systemService, R.layout.custom_instrument_lists_view, this, true, null);
        this.f = customInstrumentListsViewBinding;
        if (customInstrumentListsViewBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        RecyclerView recyclerView = customInstrumentListsViewBinding.y;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        InstrumentListView$getInstrumentAdapter$1 instrumentListView$getInstrumentAdapter$1 = this.d;
        if (instrumentListView$getInstrumentAdapter$1 != null) {
            recyclerView.setAdapter(instrumentListView$getInstrumentAdapter$1);
        } else {
            Intrinsics.p("instrumentListAdapter");
            throw null;
        }
    }

    public final void b(List paymentInstruments, InstrumentListViewInteraction instrumentListViewInteraction, int i) {
        Intrinsics.h(paymentInstruments, "paymentInstruments");
        this.h = instrumentListViewInteraction;
        this.i = i;
        this.e = paymentInstruments;
        InstrumentListView$getInstrumentAdapter$1 instrumentListView$getInstrumentAdapter$1 = this.d;
        if (instrumentListView$getInstrumentAdapter$1 == null) {
            Intrinsics.p("instrumentListAdapter");
            throw null;
        }
        instrumentListView$getInstrumentAdapter$1.H(paymentInstruments);
        this.g.clear();
    }

    public final void setAllowEdit(boolean allow) {
        this.k = allow;
    }

    public final void setAllowRemove(boolean allow) {
        this.l = allow;
    }

    public final void setAllowSelection(boolean allow) {
        this.j = allow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentListView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        this.e = new ArrayList();
        this.g = new SparseBooleanArray();
        this.i = -1;
        this.j = true;
        this.k = true;
        this.l = true;
        a(context);
    }
}
