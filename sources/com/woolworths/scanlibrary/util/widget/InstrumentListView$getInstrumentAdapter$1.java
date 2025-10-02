package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.CustomPaymentInstrumentViewBinding;
import com.woolworths.scanlibrary.ui.payment.addcard.MerchantImage;
import com.woolworths.scanlibrary.ui.payment.instrumenttype.GooglePay;
import com.woolworths.scanlibrary.ui.payment.instrumenttype.PayAtCheckout;
import com.woolworths.scanlibrary.util.adapter.RecyclerAdapter;
import com.woolworths.scanlibrary.util.extensions.PaymentInstrumentExtKt;
import com.woolworths.scanlibrary.util.widget.InstrumentListView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/woolworths/scanlibrary/util/widget/InstrumentListView$getInstrumentAdapter$1", "Lcom/woolworths/scanlibrary/util/adapter/RecyclerAdapter;", "Lau/com/woolworths/pay/sdk/models/PaymentInstrument;", "Lcom/woolworths/scanlibrary/util/widget/InstrumentViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstrumentListView$getInstrumentAdapter$1 extends RecyclerAdapter<PaymentInstrument, InstrumentViewHolder> {
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ InstrumentListView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentListView$getInstrumentAdapter$1(boolean z, boolean z2, boolean z3, boolean z4, InstrumentListView instrumentListView, List list) {
        super(list, R.layout.custom_payment_instrument_view, InstrumentViewHolder.class);
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = instrumentListView;
    }

    @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter
    public final void G(RecyclerView.ViewHolder viewHolder, Object obj, int i) {
        ImageView imageView;
        boolean z;
        int i2;
        int i3;
        InstrumentViewHolder instrumentViewHolder = (InstrumentViewHolder) viewHolder;
        final PaymentInstrument model = (PaymentInstrument) obj;
        CustomPaymentInstrumentViewBinding customPaymentInstrumentViewBinding = instrumentViewHolder.f21379a;
        Intrinsics.h(model, "model");
        final InstrumentListView instrumentListView = this.n;
        boolean z2 = ((instrumentListView.i == i) || instrumentListView.g.get(i)) && instrumentListView.j;
        boolean z3 = instrumentViewHolder.c;
        View view = customPaymentInstrumentViewBinding.h;
        ImageView imageView2 = customPaymentInstrumentViewBinding.z;
        RadioButton radioButton = customPaymentInstrumentViewBinding.D;
        Context context = view.getContext();
        boolean z4 = model instanceof CreditCardInstrument;
        if (z4) {
            TextView textView = customPaymentInstrumentViewBinding.B;
            String string = context.getString(R.string.sng_card_suffix);
            Intrinsics.g(string, "getString(...)");
            CreditCardInstrument creditCardInstrument = (CreditCardInstrument) model;
            z = z4;
            imageView = imageView2;
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(new Object[]{creditCardInstrument.getCardSuffix()}, 1, string, textView);
            ImageView imageView3 = customPaymentInstrumentViewBinding.A;
            MerchantImage.Companion companion = MerchantImage.f;
            String scheme = creditCardInstrument.getScheme();
            Intrinsics.g(scheme, "getScheme(...)");
            companion.getClass();
            Drawable drawable = context.getDrawable(MerchantImage.Companion.a(scheme).e);
            Intrinsics.e(drawable);
            imageView3.setImageDrawable(drawable);
            TextView textView2 = customPaymentInstrumentViewBinding.y;
            Intrinsics.e(textView2);
            textView2.setVisibility(PaymentInstrumentExtKt.c(creditCardInstrument) ? 0 : 8);
            textView2.setText(PaymentInstrumentExtKt.b(creditCardInstrument, context));
            instrumentViewHolder.e(instrumentViewHolder.b);
            instrumentViewHolder.d(z3);
            if (instrumentViewHolder.d) {
                i2 = 8;
                radioButton.setVisibility((creditCardInstrument.isExpired() || z3) ? 8 : 0);
                radioButton.setChecked(z2);
                instrumentViewHolder.c(context);
            } else {
                if (PaymentInstrumentExtKt.c(creditCardInstrument) && z2) {
                    view.setBackground(context.getDrawable(R.drawable.sng_background_card_selected_expired));
                } else if (z2) {
                    view.setBackground(context.getDrawable(R.drawable.sng_background_card_selected));
                } else if (PaymentInstrumentExtKt.c(creditCardInstrument)) {
                    view.setBackground(context.getDrawable(R.drawable.sng_background_error_border));
                } else {
                    instrumentViewHolder.c(context);
                }
                i2 = 8;
                radioButton.setVisibility(8);
            }
            i3 = 0;
        } else {
            imageView = imageView2;
            z = z4;
            i2 = 8;
            if (model instanceof GooglePay) {
                Intrinsics.e(context);
                instrumentViewHolder.c(context);
                i3 = 0;
                instrumentViewHolder.e(false);
                instrumentViewHolder.d(false);
                instrumentViewHolder.f(null, context, 0, z2);
            } else {
                i3 = 0;
                if (model instanceof PayAtCheckout) {
                    Intrinsics.e(context);
                    instrumentViewHolder.c(context);
                    instrumentViewHolder.e(false);
                    instrumentViewHolder.d(false);
                    PayAtCheckout payAtCheckout = (PayAtCheckout) model;
                    instrumentViewHolder.f(payAtCheckout.d, context, payAtCheckout.e, z2);
                }
            }
        }
        instrumentViewHolder.itemView.setOnClickListener(new a(this, model, i, 0));
        radioButton.setOnClickListener(new a(this, model, i, 1));
        ImageView imageView4 = customPaymentInstrumentViewBinding.C;
        final int i4 = 0;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.woolworths.scanlibrary.util.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        InstrumentListView instrumentListView2 = instrumentListView;
                        PaymentInstrument paymentInstrument = model;
                        Callback.g(view2);
                        try {
                            InstrumentListView.InstrumentListViewInteraction instrumentListViewInteraction = instrumentListView2.h;
                            if (instrumentListViewInteraction != null) {
                                instrumentListViewInteraction.a(paymentInstrument);
                            }
                            return;
                        } finally {
                        }
                    default:
                        InstrumentListView instrumentListView3 = instrumentListView;
                        PaymentInstrument paymentInstrument2 = model;
                        Callback.g(view2);
                        try {
                            InstrumentListView.InstrumentListViewInteraction instrumentListViewInteraction2 = instrumentListView3.h;
                            if (instrumentListViewInteraction2 != null) {
                                instrumentListViewInteraction2.c(paymentInstrument2);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i5 = 1;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.woolworths.scanlibrary.util.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        InstrumentListView instrumentListView2 = instrumentListView;
                        PaymentInstrument paymentInstrument = model;
                        Callback.g(view2);
                        try {
                            InstrumentListView.InstrumentListViewInteraction instrumentListViewInteraction = instrumentListView2.h;
                            if (instrumentListViewInteraction != null) {
                                instrumentListViewInteraction.a(paymentInstrument);
                            }
                            return;
                        } finally {
                        }
                    default:
                        InstrumentListView instrumentListView3 = instrumentListView;
                        PaymentInstrument paymentInstrument2 = model;
                        Callback.g(view2);
                        try {
                            InstrumentListView.InstrumentListViewInteraction instrumentListViewInteraction2 = instrumentListView3.h;
                            if (instrumentListViewInteraction2 != null) {
                                instrumentListViewInteraction2.c(paymentInstrument2);
                            }
                            return;
                        } finally {
                        }
                }
            }
        };
        ImageView imageView5 = imageView;
        imageView5.setOnClickListener(onClickListener);
        if (instrumentListView.k) {
            if (z && ((CreditCardInstrument) model).isExpired()) {
                i2 = i3;
            }
            imageView5.setVisibility(i2);
        }
    }

    public final void I(PaymentInstrument paymentInstrument, int i) {
        InstrumentListView instrumentListView = this.n;
        SparseBooleanArray sparseBooleanArray = instrumentListView.g;
        PaymentInstrument paymentInstrument2 = (PaymentInstrument) instrumentListView.e.get(i);
        Intrinsics.h(paymentInstrument2, "<this>");
        if (!((paymentInstrument2 instanceof CreditCardInstrument) && ((CreditCardInstrument) paymentInstrument2).isExpired()) && instrumentListView.j) {
            instrumentListView.i = -1;
            sparseBooleanArray.clear();
            sparseBooleanArray.put(i, true);
            l();
            InstrumentListView.InstrumentListViewInteraction instrumentListViewInteraction = instrumentListView.h;
            if (instrumentListViewInteraction != null) {
                instrumentListViewInteraction.b(paymentInstrument);
            }
        }
    }

    @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int i2 = CustomPaymentInstrumentViewBinding.E;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        CustomPaymentInstrumentViewBinding customPaymentInstrumentViewBinding = (CustomPaymentInstrumentViewBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.custom_payment_instrument_view, viewGroup, false, null);
        Intrinsics.g(customPaymentInstrumentViewBinding, "inflate(...)");
        return new InstrumentViewHolder(customPaymentInstrumentViewBinding, this.j, this.k, this.l, this.m);
    }
}
