package au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding;
import au.com.woolworths.android.onesite.databinding.ItemSavedGiftCardBinding;
import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$updateSavedGiftCards$1;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$updateSavedGiftCards$2;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.GiftCardUtils;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.SavedGiftCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.utils.Strings;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.util.ArrayList;
import kotlin.Pair;

/* loaded from: classes3.dex */
public class SavedGiftCardViewHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ItemSavedGiftCardBinding f4298a;
    public boolean b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;

    public SavedGiftCardViewHolder(ItemSavedGiftCardBinding itemSavedGiftCardBinding, final DigitalPayForOrderFragment$updateSavedGiftCards$1 digitalPayForOrderFragment$updateSavedGiftCards$1, final DigitalPayForOrderFragment$updateSavedGiftCards$2 digitalPayForOrderFragment$updateSavedGiftCards$2, final androidx.camera.core.impl.e eVar) {
        super(itemSavedGiftCardBinding.h);
        this.b = false;
        this.f4298a = itemSavedGiftCardBinding;
        final int i = 0;
        itemSavedGiftCardBinding.H.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.f
            public final /* synthetic */ SavedGiftCardViewHolder e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                RecyclerViewListener.View view2 = digitalPayForOrderFragment$updateSavedGiftCards$1;
                SavedGiftCardViewHolder savedGiftCardViewHolder = this.e;
                switch (i2) {
                    case 0:
                        int i3 = SavedGiftCardViewHolder.h;
                        Callback.g(view);
                        try {
                            if (view2 == null) {
                                savedGiftCardViewHolder.getClass();
                            } else if (savedGiftCardViewHolder.b) {
                                view2.a(savedGiftCardViewHolder.getAdapterPosition());
                            }
                            return;
                        } finally {
                        }
                    default:
                        int i4 = SavedGiftCardViewHolder.h;
                        Callback.g(view);
                        try {
                            if (view2 != null) {
                                view2.a(savedGiftCardViewHolder.getAdapterPosition());
                            } else {
                                savedGiftCardViewHolder.getClass();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i2 = 1;
        itemSavedGiftCardBinding.E.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.f
            public final /* synthetic */ SavedGiftCardViewHolder e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                RecyclerViewListener.View view2 = digitalPayForOrderFragment$updateSavedGiftCards$2;
                SavedGiftCardViewHolder savedGiftCardViewHolder = this.e;
                switch (i22) {
                    case 0:
                        int i3 = SavedGiftCardViewHolder.h;
                        Callback.g(view);
                        try {
                            if (view2 == null) {
                                savedGiftCardViewHolder.getClass();
                            } else if (savedGiftCardViewHolder.b) {
                                view2.a(savedGiftCardViewHolder.getAdapterPosition());
                            }
                            return;
                        } finally {
                        }
                    default:
                        int i4 = SavedGiftCardViewHolder.h;
                        Callback.g(view);
                        try {
                            if (view2 != null) {
                                view2.a(savedGiftCardViewHolder.getAdapterPosition());
                            } else {
                                savedGiftCardViewHolder.getClass();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextWatcher textWatcher = new TextWatcher(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.SavedGiftCardViewHolder.1
            public final /* synthetic */ SavedGiftCardViewHolder e;

            {
                this.e = this;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                Pair pair;
                String string = charSequence.toString();
                SavedGiftCardViewHolder savedGiftCardViewHolder = this.e;
                ItemSavedGiftCardBinding itemSavedGiftCardBinding2 = savedGiftCardViewHolder.f4298a;
                if (string.equals(savedGiftCardViewHolder.d)) {
                    return;
                }
                itemSavedGiftCardBinding2.J.removeTextChangedListener(this);
                String strA = GiftCardUtils.a(charSequence.toString());
                itemSavedGiftCardBinding2.J.setText(strA);
                itemSavedGiftCardBinding2.J.setSelection(strA.length());
                savedGiftCardViewHolder.d = strA;
                int adapterPosition = savedGiftCardViewHolder.getAdapterPosition();
                SavedGiftCardRecyclerViewAdapter savedGiftCardRecyclerViewAdapter = (SavedGiftCardRecyclerViewAdapter) eVar.e;
                ArrayList arrayList = savedGiftCardRecyclerViewAdapter.g;
                if (adapterPosition < 0 || adapterPosition >= arrayList.size()) {
                    pair = null;
                } else {
                    SavedGiftCardData savedGiftCardData = (SavedGiftCardData) arrayList.get(adapterPosition);
                    savedGiftCardData.setPaymentAmount(strA);
                    savedGiftCardRecyclerViewAdapter.j.C0();
                    pair = new Pair(Boolean.valueOf(savedGiftCardData.shouldShowPaymentAmountValid()), Boolean.FALSE);
                }
                if (pair != null) {
                    if (((Boolean) pair.d).booleanValue()) {
                        itemSavedGiftCardBinding2.C.y.setVisibility(8);
                        savedGiftCardViewHolder.c();
                    } else if (!Strings.b(savedGiftCardViewHolder.c)) {
                        String str = savedGiftCardViewHolder.c;
                        LinearLayout linearLayout = itemSavedGiftCardBinding2.H;
                        IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding = itemSavedGiftCardBinding2.C;
                        linearLayout.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_selector);
                        includeCheckoutErrorNoRoundedBinding.y.setVisibility(0);
                        includeCheckoutErrorNoRoundedBinding.z.setText(str);
                    }
                }
                boolean zIsSelected = itemSavedGiftCardBinding2.h.isSelected();
                String strSubstring = itemSavedGiftCardBinding2.I.getText().toString().substring(2);
                String string2 = itemSavedGiftCardBinding2.A.getText().toString();
                Context context = savedGiftCardViewHolder.itemView.getContext();
                if (zIsSelected) {
                    String string3 = Strings.b(savedGiftCardViewHolder.d) ? context.getString(R.string.zero_dollar_amount) : savedGiftCardViewHolder.d;
                    if (Strings.b(string2)) {
                        itemSavedGiftCardBinding2.H.setContentDescription(context.getString(R.string.selected_unknown_balance_pay_with_gift_card_content_description, strSubstring, string3));
                    } else {
                        itemSavedGiftCardBinding2.H.setContentDescription(context.getString(R.string.selected_pay_with_gift_card_content_description, strSubstring, string2, string3));
                    }
                } else if (Strings.b(string2)) {
                    itemSavedGiftCardBinding2.H.setContentDescription(context.getString(R.string.not_selected_unknown_balance_pay_with_gift_card_content_description, strSubstring));
                } else {
                    itemSavedGiftCardBinding2.H.setContentDescription(context.getString(R.string.not_selected_pay_with_gift_card_content_description, strSubstring, string2));
                }
                itemSavedGiftCardBinding2.J.addTextChangedListener(this);
            }
        };
        EditText editText = itemSavedGiftCardBinding.J;
        editText.addTextChangedListener(textWatcher);
        editText.setOnFocusChangeListener(new b(this, textWatcher, 1));
    }

    public final void c() {
        boolean z = this.g;
        ItemSavedGiftCardBinding itemSavedGiftCardBinding = this.f4298a;
        if (z) {
            if (this.e) {
                itemSavedGiftCardBinding.H.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_error);
                itemSavedGiftCardBinding.C.y.setBackgroundResource(R.drawable.background_checkout_error_top_rounded_default);
                return;
            } else {
                itemSavedGiftCardBinding.H.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_error);
                itemSavedGiftCardBinding.C.y.setBackgroundResource(R.drawable.background_checkout_error_no_rounded_default);
                return;
            }
        }
        if (this.e) {
            itemSavedGiftCardBinding.H.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_selector);
            itemSavedGiftCardBinding.C.y.setBackgroundResource(R.drawable.background_checkout_error_top_rounded_default);
        } else {
            itemSavedGiftCardBinding.H.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_selector);
            itemSavedGiftCardBinding.C.y.setBackgroundResource(R.drawable.background_checkout_error_no_rounded_default);
        }
    }
}
