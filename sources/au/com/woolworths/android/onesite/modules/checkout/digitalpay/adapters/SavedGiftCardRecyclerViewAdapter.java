package au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.e;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding;
import au.com.woolworths.android.onesite.databinding.ItemSavedGiftCardBinding;
import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$updateSavedGiftCards$1;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$updateSavedGiftCards$2;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.SavedGiftCardViewHolder;
import au.com.woolworths.android.onesite.utils.ProductInfoFormatter;
import au.com.woolworths.android.onesite.utils.Strings;
import com.woolworths.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class SavedGiftCardRecyclerViewAdapter extends RecyclerView.Adapter<SavedGiftCardViewHolder> {
    public ArrayList g;
    public DigitalPayForOrderFragment$updateSavedGiftCards$1 h;
    public DigitalPayForOrderFragment$updateSavedGiftCards$2 i;
    public DigitalPayForOrderPresenter j;

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
        return Long.parseLong(((SavedGiftCardData) arrayList.get(i)).getPaymentInstrumentId());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        String strB;
        SavedGiftCardViewHolder savedGiftCardViewHolder = (SavedGiftCardViewHolder) viewHolder;
        ItemSavedGiftCardBinding itemSavedGiftCardBinding = savedGiftCardViewHolder.f4298a;
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.j;
        ArrayList arrayList = this.g;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        SavedGiftCardData savedGiftCardData = (SavedGiftCardData) arrayList.get(i);
        boolean zIsAllowed = savedGiftCardData.isAllowed();
        savedGiftCardViewHolder.e = i == 0 && (digitalPayForOrderPresenter.J <= 0 || !digitalPayForOrderPresenter.n());
        savedGiftCardViewHolder.c();
        savedGiftCardViewHolder.g = digitalPayForOrderPresenter.N(savedGiftCardData.getPaymentInstrumentId());
        savedGiftCardViewHolder.c();
        String strSubstring = savedGiftCardData.getMaskedCardNumber().substring(2);
        if (savedGiftCardData.getBalance() != null) {
            itemSavedGiftCardBinding.F.setVisibility(0);
            itemSavedGiftCardBinding.F.setText(savedGiftCardData.getExpiry());
            itemSavedGiftCardBinding.z.setVisibility(0);
            strB = ProductInfoFormatter.b(savedGiftCardData.getBalance());
            itemSavedGiftCardBinding.A.setText(strB);
            savedGiftCardViewHolder.c = itemSavedGiftCardBinding.h.getContext().getString(R.string.amount_exceed_gift_card_balance, ProductInfoFormatter.b(savedGiftCardData.getBalance()));
        } else {
            itemSavedGiftCardBinding.F.setVisibility(8);
            itemSavedGiftCardBinding.z.setVisibility(4);
            strB = null;
        }
        TextView textView = itemSavedGiftCardBinding.E;
        IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding = itemSavedGiftCardBinding.C;
        ImageView imageView = itemSavedGiftCardBinding.G;
        TextView textView2 = itemSavedGiftCardBinding.I;
        View view = itemSavedGiftCardBinding.h;
        ImageView imageView2 = itemSavedGiftCardBinding.D;
        EditText editText = itemSavedGiftCardBinding.J;
        LinearLayout linearLayout = itemSavedGiftCardBinding.H;
        textView.setText(Html.fromHtml(view.getContext().getString(R.string.remove_payment_instrument)));
        textView2.setText(savedGiftCardData.getMaskedCardNumber());
        boolean z = zIsAllowed && digitalPayForOrderPresenter.n();
        savedGiftCardViewHolder.b = z;
        view.setClickable(z);
        linearLayout.setClickable(z);
        textView2.setEnabled(zIsAllowed);
        itemSavedGiftCardBinding.F.setEnabled(zIsAllowed);
        itemSavedGiftCardBinding.A.setEnabled(zIsAllowed);
        itemSavedGiftCardBinding.y.setEnabled(zIsAllowed);
        Context context = savedGiftCardViewHolder.itemView.getContext();
        if (!zIsAllowed) {
            if (Strings.b(strB)) {
                linearLayout.setContentDescription(context.getString(R.string.not_supported_unknown_balance_gift_card_content_description, strSubstring));
            } else {
                linearLayout.setContentDescription(context.getString(R.string.not_supported_gift_card_content_description, strSubstring, strB));
            }
            imageView.setImageResource(2131231508);
            itemSavedGiftCardBinding.B.setVisibility(0);
            editText.setVisibility(8);
            textView.setVisibility(8);
            imageView2.setVisibility(8);
            return;
        }
        if (!digitalPayForOrderPresenter.n()) {
            if (Strings.b(strB)) {
                linearLayout.setContentDescription(context.getString(R.string.manage_unknown_balance_gift_card_content_description, strSubstring));
            } else {
                linearLayout.setContentDescription(context.getString(R.string.manage_gift_card_content_description, strSubstring, strB));
            }
            textView.setVisibility(0);
            editText.setVisibility(8);
            itemSavedGiftCardBinding.C.y.setVisibility(8);
            savedGiftCardViewHolder.c();
            itemSavedGiftCardBinding.h.setSelected(false);
            imageView2.setVisibility(8);
            itemSavedGiftCardBinding.K.setBackgroundColor(itemSavedGiftCardBinding.h.getContext().getColor(R.color.payment_instrument_border));
            if (includeCheckoutErrorNoRoundedBinding.y.getVisibility() == 0) {
                savedGiftCardViewHolder.f = includeCheckoutErrorNoRoundedBinding.z.getText().toString();
            }
            itemSavedGiftCardBinding.C.y.setVisibility(8);
            savedGiftCardViewHolder.c();
            return;
        }
        imageView.setImageResource(2131231507);
        if (savedGiftCardData.isSelectedForPayment()) {
            textView.setVisibility(8);
            editText.setVisibility(0);
            String string = context.getString(R.string.zero_dollar_amount);
            if (savedGiftCardData.getPaymentAmount() != null) {
                string = ProductInfoFormatter.b(savedGiftCardData.getPaymentAmount());
                editText.setText(string);
                editText.setSelection(editText.getText().length());
            } else {
                editText.setText((CharSequence) null);
            }
            if (Strings.b(strB)) {
                linearLayout.setContentDescription(context.getString(R.string.selected_unknown_balance_pay_with_gift_card_content_description, strSubstring, string));
            } else {
                linearLayout.setContentDescription(context.getString(R.string.selected_pay_with_gift_card_content_description, strSubstring, strB, string));
            }
            itemSavedGiftCardBinding.h.setSelected(true);
            imageView2.setVisibility(0);
            itemSavedGiftCardBinding.K.setBackgroundColor(itemSavedGiftCardBinding.h.getContext().getColor(R.color.selected_instrument_border));
        } else {
            if (Strings.b(strB)) {
                linearLayout.setContentDescription(context.getString(R.string.not_selected_unknown_balance_pay_with_gift_card_content_description, strSubstring));
            } else {
                linearLayout.setContentDescription(context.getString(R.string.not_selected_pay_with_gift_card_content_description, strSubstring, strB));
            }
            textView.setVisibility(8);
            editText.setVisibility(4);
            itemSavedGiftCardBinding.C.y.setVisibility(8);
            savedGiftCardViewHolder.c();
            itemSavedGiftCardBinding.h.setSelected(false);
            imageView2.setVisibility(8);
            itemSavedGiftCardBinding.K.setBackgroundColor(itemSavedGiftCardBinding.h.getContext().getColor(R.color.payment_instrument_border));
        }
        if (Strings.a(savedGiftCardViewHolder.f)) {
            return;
        }
        String str = savedGiftCardViewHolder.f;
        LinearLayout linearLayout2 = itemSavedGiftCardBinding.H;
        IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding2 = itemSavedGiftCardBinding.C;
        linearLayout2.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_selector);
        includeCheckoutErrorNoRoundedBinding2.y.setVisibility(0);
        includeCheckoutErrorNoRoundedBinding2.z.setText(str);
        savedGiftCardViewHolder.f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        return new SavedGiftCardViewHolder((ItemSavedGiftCardBinding) DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), R.layout.item_saved_gift_card, viewGroup, false, null), this.h, this.i, new e(this, 16));
    }
}
