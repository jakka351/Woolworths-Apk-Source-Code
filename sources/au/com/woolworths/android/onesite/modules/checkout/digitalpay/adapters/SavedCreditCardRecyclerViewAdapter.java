package au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.interop.d;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding;
import au.com.woolworths.android.onesite.databinding.ItemSavedCreditCardBinding;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$1;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$2;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.SavedCreditCardViewHolder;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class SavedCreditCardRecyclerViewAdapter extends RecyclerView.Adapter<SavedCreditCardViewHolder> {
    public ArrayList g;
    public DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$1 h;
    public DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$2 i;
    public AppCompatActivity j;
    public DigitalPayForOrderPresenter k;
    public PayClient l;

    public static void G(SavedCreditCardRecyclerViewAdapter savedCreditCardRecyclerViewAdapter, boolean z, SavedCreditCardViewHolder savedCreditCardViewHolder, AppCompatActivity appCompatActivity) {
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = savedCreditCardRecyclerViewAdapter.k;
        if (z) {
            savedCreditCardViewHolder.d();
            Views.a(appCompatActivity);
            digitalPayForOrderPresenter.e0 = new d(savedCreditCardViewHolder, 15);
            if (digitalPayForOrderPresenter.i()) {
                digitalPayForOrderPresenter.v0();
                return;
            }
            return;
        }
        ItemSavedCreditCardBinding itemSavedCreditCardBinding = savedCreditCardViewHolder.f4297a;
        itemSavedCreditCardBinding.I.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_selector);
        IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding = itemSavedCreditCardBinding.y;
        includeCheckoutErrorNoRoundedBinding.z.setText(R.string.cvv_validation_error);
        includeCheckoutErrorNoRoundedBinding.y.setVisibility(0);
        digitalPayForOrderPresenter.e0 = null;
        if (digitalPayForOrderPresenter.i()) {
            digitalPayForOrderPresenter.v0();
        }
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

    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(androidx.recyclerview.widget.RecyclerView.ViewHolder r19, int r20) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.SavedCreditCardRecyclerViewAdapter.v(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        ItemSavedCreditCardBinding itemSavedCreditCardBinding = (ItemSavedCreditCardBinding) DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), R.layout.item_saved_credit_card, viewGroup, false, null);
        final DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$1 digitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$1 = this.h;
        final DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$2 digitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$2 = this.i;
        final SavedCreditCardViewHolder savedCreditCardViewHolder = new SavedCreditCardViewHolder(itemSavedCreditCardBinding.h);
        savedCreditCardViewHolder.c = false;
        savedCreditCardViewHolder.f4297a = itemSavedCreditCardBinding;
        final int i2 = 0;
        itemSavedCreditCardBinding.I.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                RecyclerViewListener.View view2 = digitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$1;
                SavedCreditCardViewHolder savedCreditCardViewHolder2 = savedCreditCardViewHolder;
                switch (i3) {
                    case 0:
                        int i4 = SavedCreditCardViewHolder.h;
                        Callback.g(view);
                        try {
                            if (view2 == null) {
                                savedCreditCardViewHolder2.getClass();
                            } else if (savedCreditCardViewHolder2.c) {
                                view2.a(savedCreditCardViewHolder2.getAdapterPosition());
                            }
                            return;
                        } finally {
                        }
                    default:
                        int i5 = SavedCreditCardViewHolder.h;
                        Callback.g(view);
                        try {
                            if (view2 != null) {
                                view2.a(savedCreditCardViewHolder2.getAdapterPosition());
                            } else {
                                savedCreditCardViewHolder2.getClass();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i3 = 1;
        itemSavedCreditCardBinding.E.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                RecyclerViewListener.View view2 = digitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$2;
                SavedCreditCardViewHolder savedCreditCardViewHolder2 = savedCreditCardViewHolder;
                switch (i32) {
                    case 0:
                        int i4 = SavedCreditCardViewHolder.h;
                        Callback.g(view);
                        try {
                            if (view2 == null) {
                                savedCreditCardViewHolder2.getClass();
                            } else if (savedCreditCardViewHolder2.c) {
                                view2.a(savedCreditCardViewHolder2.getAdapterPosition());
                            }
                            return;
                        } finally {
                        }
                    default:
                        int i5 = SavedCreditCardViewHolder.h;
                        Callback.g(view);
                        try {
                            if (view2 != null) {
                                view2.a(savedCreditCardViewHolder2.getAdapterPosition());
                            } else {
                                savedCreditCardViewHolder2.getClass();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        return savedCreditCardViewHolder;
    }
}
