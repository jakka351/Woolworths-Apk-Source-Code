package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import au.com.woolworths.feature.shop.catalogue.productlist.OnMaxLinesToggleListener;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(TextView textView, int i, OnMaxLinesToggleListener onMaxLinesToggleListener) {
        this.d = 2;
        this.e = textView;
        this.g = i;
        this.f = onMaxLinesToggleListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                InstrumentListView$getInstrumentAdapter$1 instrumentListView$getInstrumentAdapter$1 = (InstrumentListView$getInstrumentAdapter$1) this.e;
                PaymentInstrument paymentInstrument = (PaymentInstrument) this.f;
                int i = this.g;
                Callback.g(view);
                try {
                    instrumentListView$getInstrumentAdapter$1.I(paymentInstrument, i);
                    return;
                } finally {
                }
            case 1:
                InstrumentListView$getInstrumentAdapter$1 instrumentListView$getInstrumentAdapter$12 = (InstrumentListView$getInstrumentAdapter$1) this.e;
                PaymentInstrument paymentInstrument2 = (PaymentInstrument) this.f;
                int i2 = this.g;
                Callback.g(view);
                try {
                    instrumentListView$getInstrumentAdapter$12.I(paymentInstrument2, i2);
                    return;
                } finally {
                }
            default:
                TextView textView = (TextView) this.e;
                OnMaxLinesToggleListener onMaxLinesToggleListener = (OnMaxLinesToggleListener) this.f;
                Callback.g(view);
                try {
                    int maxLines = textView.getMaxLines();
                    int i3 = this.g;
                    textView.setMaxLines(maxLines > i3 ? i3 : Integer.MAX_VALUE);
                    if (view instanceof TextView) {
                        if (textView.getMaxLines() > i3) {
                            TextView textView2 = (TextView) view;
                            Context context = textView2.getContext();
                            textView2.setText(context != null ? context.getString(R.string.product_detail_see_less) : null);
                            onMaxLinesToggleListener.a0();
                        } else {
                            TextView textView3 = (TextView) view;
                            Context context2 = textView3.getContext();
                            textView3.setText(context2 != null ? context2.getString(R.string.product_detail_see_more) : null);
                            onMaxLinesToggleListener.n4();
                        }
                    }
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ a(InstrumentListView$getInstrumentAdapter$1 instrumentListView$getInstrumentAdapter$1, PaymentInstrument paymentInstrument, int i, int i2) {
        this.d = i2;
        this.e = instrumentListView$getInstrumentAdapter$1;
        this.f = paymentInstrument;
        this.g = i;
    }
}
