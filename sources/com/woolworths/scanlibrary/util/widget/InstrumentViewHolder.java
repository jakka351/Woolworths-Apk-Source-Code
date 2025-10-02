package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.widget.RadioButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.CustomPaymentInstrumentViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/InstrumentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InstrumentViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final CustomPaymentInstrumentViewBinding f21379a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public InstrumentViewHolder(CustomPaymentInstrumentViewBinding customPaymentInstrumentViewBinding, boolean z, boolean z2, boolean z3, boolean z4) {
        super(customPaymentInstrumentViewBinding.h);
        this.f21379a = customPaymentInstrumentViewBinding;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final void c(Context context) {
        CustomPaymentInstrumentViewBinding customPaymentInstrumentViewBinding = this.f21379a;
        customPaymentInstrumentViewBinding.h.setBackground(null);
        customPaymentInstrumentViewBinding.h.setBackgroundColor(context.getColor(R.color.white_color));
    }

    public final void d(boolean z) {
        CustomPaymentInstrumentViewBinding customPaymentInstrumentViewBinding = this.f21379a;
        customPaymentInstrumentViewBinding.C.setVisibility(z ? 0 : 4);
        if (this.d) {
            customPaymentInstrumentViewBinding.C.setColorFilter(customPaymentInstrumentViewBinding.h.getContext().getColor(R.color.sng_alerts));
        }
    }

    public final void e(boolean z) {
        this.f21379a.z.setVisibility(z ? 0 : 4);
    }

    public final void f(String str, Context context, int i, boolean z) {
        CustomPaymentInstrumentViewBinding customPaymentInstrumentViewBinding = this.f21379a;
        customPaymentInstrumentViewBinding.B.setText(str);
        customPaymentInstrumentViewBinding.A.setImageDrawable(context.getDrawable(i));
        e(false);
        RadioButton radioButton = customPaymentInstrumentViewBinding.D;
        radioButton.setVisibility(this.e ? 8 : 0);
        radioButton.setChecked(z);
        c(context);
    }
}
