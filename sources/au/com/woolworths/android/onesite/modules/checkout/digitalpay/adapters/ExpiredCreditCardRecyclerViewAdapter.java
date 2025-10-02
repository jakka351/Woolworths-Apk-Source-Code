package au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.e;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.ItemExpiredCreditCardBinding;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredCreditCards$1;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredCreditCards$2;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayUtils;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.ExpiredCreditCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.ExpiredCreditCardViewHolder;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.pay.sdk.web.FormView;
import au.com.woolworths.pay.sdk.web.UpdateCreditCardView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ExpiredCreditCardRecyclerViewAdapter extends RecyclerView.Adapter<ExpiredCreditCardViewHolder> implements ExpiredCreditCardViewHolder.ViewHolderListener {
    public ArrayList g;
    public DigitalPayForOrderFragment$showExpiredCreditCards$1 h;
    public DigitalPayForOrderFragment$showExpiredCreditCards$2 i;
    public e j;
    public DigitalPayForOrderPresenter k;
    public PayClient l;

    public final void G(final ExpiredCreditCardViewHolder expiredCreditCardViewHolder, URL url, final Context context) {
        PayClient payClient = this.l;
        ItemExpiredCreditCardBinding itemExpiredCreditCardBinding = expiredCreditCardViewHolder.f4295a;
        View view = itemExpiredCreditCardBinding.B;
        payClient.getClass();
        UpdateCreditCardView updateCreditCardView = new UpdateCreditCardView(context);
        FormView.a(updateCreditCardView, view, url, payClient.b, payClient.d);
        expiredCreditCardViewHolder.c = url.toString();
        expiredCreditCardViewHolder.d = url;
        WeakReference weakReference = new WeakReference(updateCreditCardView);
        expiredCreditCardViewHolder.b = weakReference;
        ((UpdateCreditCardView) weakReference.get()).setLayerType(1, null);
        expiredCreditCardViewHolder.d().setCallback(new FormView.FormViewCallback(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.ExpiredCreditCardRecyclerViewAdapter.1
            public final /* synthetic */ ExpiredCreditCardRecyclerViewAdapter c;

            {
                this.c = this;
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void a(FormFocusState formFocusState) {
                Boolean bool;
                if (formFocusState.f9191a.booleanValue()) {
                    return;
                }
                Boolean bool2 = formFocusState.f;
                int i = 0;
                int i2 = (bool2 == null || bool2.booleanValue()) ? 0 : 1;
                Boolean bool3 = formFocusState.e;
                int i3 = i2 + ((bool3 == null || bool3.booleanValue()) ? 0 : 1);
                Boolean bool4 = formFocusState.d;
                int i4 = i3 + ((bool4 == null || bool4.booleanValue()) ? 0 : 1);
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                if (i4 >= 3) {
                    expiredCreditCardViewHolder2.f(R.string.digipay_invalid_credit_card_details);
                    return;
                }
                Boolean bool5 = formFocusState.e;
                if (bool5 != null && !bool5.booleanValue() && (bool = formFocusState.f) != null && !bool.booleanValue()) {
                    expiredCreditCardViewHolder2.f(R.string.digipay_invalid_credit_card_expiry_date);
                    return;
                }
                Boolean bool6 = formFocusState.f;
                int i5 = (bool6 == null || bool6.booleanValue()) ? 0 : 1;
                Boolean bool7 = formFocusState.e;
                int i6 = i5 + ((bool7 == null || bool7.booleanValue()) ? 0 : 1);
                Boolean bool8 = formFocusState.d;
                if (bool8 != null && !bool8.booleanValue()) {
                    i = 1;
                }
                if (i6 + i == 2) {
                    expiredCreditCardViewHolder2.f(R.string.digipay_invalid_credit_card_details);
                    return;
                }
                Boolean bool9 = formFocusState.e;
                if (bool9 != null && !bool9.booleanValue()) {
                    expiredCreditCardViewHolder2.f(R.string.digipay_invalid_credit_card_expiry_month);
                    return;
                }
                Boolean bool10 = formFocusState.f;
                if (bool10 != null && !bool10.booleanValue()) {
                    expiredCreditCardViewHolder2.f(R.string.digipay_invalid_credit_card_expiry_year);
                    return;
                }
                Boolean bool11 = formFocusState.d;
                if (bool11 == null || bool11.booleanValue()) {
                    expiredCreditCardViewHolder2.e();
                } else {
                    expiredCreditCardViewHolder2.f(R.string.digipay_invalid_credit_card_cvv);
                }
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void b() {
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                this.c.j = new e(expiredCreditCardViewHolder2, 15);
                if (expiredCreditCardViewHolder2.d() != null) {
                    expiredCreditCardViewHolder2.d().loadUrl("javascript:queryFormStatus()");
                }
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void c(boolean z, boolean z2) {
                ExpiredCreditCardRecyclerViewAdapter expiredCreditCardRecyclerViewAdapter = this.c;
                e eVar = expiredCreditCardRecyclerViewAdapter.j;
                if (eVar != null) {
                    eVar.e(z2);
                    expiredCreditCardRecyclerViewAdapter.j = null;
                    return;
                }
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                expiredCreditCardViewHolder2.f4295a.P.setEnabled(z);
                if (z) {
                    expiredCreditCardViewHolder2.e();
                } else {
                    expiredCreditCardViewHolder2.f(R.string.digipay_invalid_credit_card_details);
                }
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void d(BaseError baseError) {
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.c.k;
                PayErrorCode payErrorCode = baseError.getPayErrorCode();
                PayErrorCode payErrorCode2 = PayErrorCode.NETWORK_ERROR;
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                if (payErrorCode == payErrorCode2 || baseError.getPayErrorCode() == PayErrorCode.TIMEOUT_ERROR || DigitalPayUtils.b(baseError)) {
                    expiredCreditCardViewHolder2.f4295a.I.setVisibility(0);
                    return;
                }
                expiredCreditCardViewHolder2.c();
                digitalPayForOrderPresenter.i0(-1);
                digitalPayForOrderPresenter.S();
                if (digitalPayForOrderPresenter.i()) {
                    Object obj = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj);
                    Object obj2 = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj2);
                    ((DigitalPayForOrderContract.View) obj).D1(((DigitalPayForOrderContract.View) obj2).F());
                }
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void e(String str, String str2, String str3) {
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.c.k;
                digitalPayForOrderPresenter.I = null;
                if (digitalPayForOrderPresenter.i()) {
                    digitalPayForOrderPresenter.D.clear();
                    Object obj = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj);
                    digitalPayForOrderPresenter.A(((DigitalPayForOrderContract.View) obj).d4());
                }
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                expiredCreditCardViewHolder2.e();
                expiredCreditCardViewHolder2.b = null;
                expiredCreditCardViewHolder2.c = null;
                expiredCreditCardViewHolder2.d = null;
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void f(String str, Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                if (!zBooleanValue || expiredCreditCardViewHolder2.d() == null) {
                    expiredCreditCardViewHolder2.f(R.string.digipay_invalid_credit_card_details);
                } else {
                    expiredCreditCardViewHolder2.e();
                }
                Views.a((AppCompatActivity) context);
            }
        });
        itemExpiredCreditCardBinding.G.removeAllViews();
        itemExpiredCreditCardBinding.G.addView(expiredCreditCardViewHolder.d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long j(int i) {
        ArrayList arrayList = this.g;
        if (arrayList == null || i >= arrayList.size()) {
            return 0L;
        }
        return Long.parseLong(((CreditCardInstrument) arrayList.get(i)).getInstrumentId());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(androidx.recyclerview.widget.RecyclerView.ViewHolder r18, int r19) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.ExpiredCreditCardRecyclerViewAdapter.v(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        ItemExpiredCreditCardBinding itemExpiredCreditCardBinding = (ItemExpiredCreditCardBinding) DataBindingUtil.c(LayoutInflater.from(context), R.layout.item_expired_credit_card, viewGroup, false, null);
        final DigitalPayForOrderFragment$showExpiredCreditCards$1 digitalPayForOrderFragment$showExpiredCreditCards$1 = this.h;
        final DigitalPayForOrderFragment$showExpiredCreditCards$2 digitalPayForOrderFragment$showExpiredCreditCards$2 = this.i;
        e eVar = new e(this, 14);
        androidx.camera.camera2.interop.e eVar2 = new androidx.camera.camera2.interop.e(14, this, context);
        final ExpiredCreditCardViewHolder expiredCreditCardViewHolder = new ExpiredCreditCardViewHolder(itemExpiredCreditCardBinding.h);
        expiredCreditCardViewHolder.f4295a = itemExpiredCreditCardBinding;
        expiredCreditCardViewHolder.e = eVar2;
        expiredCreditCardViewHolder.f = this;
        final int i2 = 0;
        itemExpiredCreditCardBinding.E.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                RecyclerViewListener.View view2 = digitalPayForOrderFragment$showExpiredCreditCards$2;
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                switch (i3) {
                    case 0:
                        int i4 = ExpiredCreditCardViewHolder.g;
                        Callback.g(view);
                        try {
                            if (view2 != null) {
                                view2.a(expiredCreditCardViewHolder2.getAdapterPosition());
                            } else {
                                expiredCreditCardViewHolder2.getClass();
                            }
                            return;
                        } finally {
                        }
                    default:
                        int i5 = ExpiredCreditCardViewHolder.g;
                        Callback.g(view);
                        try {
                            if (view2 != null) {
                                view2.a(expiredCreditCardViewHolder2.getAdapterPosition());
                            } else {
                                expiredCreditCardViewHolder2.getClass();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i3 = 1;
        itemExpiredCreditCardBinding.K.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                RecyclerViewListener.View view2 = digitalPayForOrderFragment$showExpiredCreditCards$1;
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                switch (i32) {
                    case 0:
                        int i4 = ExpiredCreditCardViewHolder.g;
                        Callback.g(view);
                        try {
                            if (view2 != null) {
                                view2.a(expiredCreditCardViewHolder2.getAdapterPosition());
                            } else {
                                expiredCreditCardViewHolder2.getClass();
                            }
                            return;
                        } finally {
                        }
                    default:
                        int i5 = ExpiredCreditCardViewHolder.g;
                        Callback.g(view);
                        try {
                            if (view2 != null) {
                                view2.a(expiredCreditCardViewHolder2.getAdapterPosition());
                            } else {
                                expiredCreditCardViewHolder2.getClass();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = itemExpiredCreditCardBinding.P;
        button.setOnClickListener(new androidx.navigation.ui.a(2, expiredCreditCardViewHolder, eVar));
        final int i4 = 0;
        itemExpiredCreditCardBinding.y.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                switch (i5) {
                    case 0:
                        int i6 = ExpiredCreditCardViewHolder.g;
                        Callback.g(view);
                        try {
                            expiredCreditCardViewHolder2.c();
                            return;
                        } finally {
                        }
                    default:
                        int i7 = ExpiredCreditCardViewHolder.g;
                        Callback.g(view);
                        try {
                            if (expiredCreditCardViewHolder2.d() != null) {
                                ExpiredCreditCardRecyclerViewAdapter expiredCreditCardRecyclerViewAdapter = expiredCreditCardViewHolder2.f;
                                if (expiredCreditCardRecyclerViewAdapter != null) {
                                    expiredCreditCardRecyclerViewAdapter.G(expiredCreditCardViewHolder2, expiredCreditCardViewHolder2.d, expiredCreditCardViewHolder2.itemView.getContext());
                                }
                                expiredCreditCardViewHolder2.f4295a.C.setVisibility(0);
                                expiredCreditCardViewHolder2.d().setVisibility(0);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i5 = 1;
        itemExpiredCreditCardBinding.J.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52 = i5;
                ExpiredCreditCardViewHolder expiredCreditCardViewHolder2 = expiredCreditCardViewHolder;
                switch (i52) {
                    case 0:
                        int i6 = ExpiredCreditCardViewHolder.g;
                        Callback.g(view);
                        try {
                            expiredCreditCardViewHolder2.c();
                            return;
                        } finally {
                        }
                    default:
                        int i7 = ExpiredCreditCardViewHolder.g;
                        Callback.g(view);
                        try {
                            if (expiredCreditCardViewHolder2.d() != null) {
                                ExpiredCreditCardRecyclerViewAdapter expiredCreditCardRecyclerViewAdapter = expiredCreditCardViewHolder2.f;
                                if (expiredCreditCardRecyclerViewAdapter != null) {
                                    expiredCreditCardRecyclerViewAdapter.G(expiredCreditCardViewHolder2, expiredCreditCardViewHolder2.d, expiredCreditCardViewHolder2.itemView.getContext());
                                }
                                expiredCreditCardViewHolder2.f4295a.C.setVisibility(0);
                                expiredCreditCardViewHolder2.d().setVisibility(0);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        button.setEnabled(false);
        return expiredCreditCardViewHolder;
    }
}
