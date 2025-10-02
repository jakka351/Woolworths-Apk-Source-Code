package au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding;
import au.com.woolworths.android.onesite.databinding.ItemAddedGiftCardBinding;
import au.com.woolworths.android.onesite.models.checkout.NewGiftCardData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showAddedGiftCards$1;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.AddedGiftCardViewHolder;
import au.com.woolworths.android.onesite.utils.ProductInfoFormatter;
import au.com.woolworths.android.onesite.utils.Strings;
import com.woolworths.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class AddedGiftCardRecyclerViewAdapter extends RecyclerView.Adapter<AddedGiftCardViewHolder> {
    public ArrayList g;
    public DigitalPayForOrderFragment$showAddedGiftCards$1 h;
    public boolean i;
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
        if (arrayList != null) {
            return ((NewGiftCardData) arrayList.get(i)).getId();
        }
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        String strB;
        String strB2;
        AddedGiftCardViewHolder addedGiftCardViewHolder = (AddedGiftCardViewHolder) viewHolder;
        ItemAddedGiftCardBinding itemAddedGiftCardBinding = addedGiftCardViewHolder.f4294a;
        ArrayList arrayList = this.g;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        NewGiftCardData newGiftCardData = (NewGiftCardData) arrayList.get(i);
        TextView textView = itemAddedGiftCardBinding.G;
        View view = itemAddedGiftCardBinding.h;
        textView.setText(Html.fromHtml(view.getContext().getString(R.string.remove_payment_instrument)));
        TextView textView2 = itemAddedGiftCardBinding.z;
        IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding = itemAddedGiftCardBinding.E;
        LinearLayout linearLayout = itemAddedGiftCardBinding.D;
        TextView textView3 = itemAddedGiftCardBinding.y;
        ConstraintLayout constraintLayout = itemAddedGiftCardBinding.A;
        EditText editText = itemAddedGiftCardBinding.F;
        textView2.setText(newGiftCardData.getMaskedCardNumber());
        itemAddedGiftCardBinding.H.setChecked(newGiftCardData.isSaveForLater());
        if (this.i) {
            constraintLayout.setBackgroundResource(R.drawable.background_added_giftcard_no_rounding_default);
        } else {
            constraintLayout.setBackgroundResource(R.drawable.background_added_giftcard_bottom_rounding_default);
        }
        if (newGiftCardData.getPaymentAmount() != null) {
            strB = ProductInfoFormatter.b(newGiftCardData.getPaymentAmount());
            editText.setText(strB);
            editText.setSelection(editText.getText().length());
        } else {
            editText.setText((CharSequence) null);
            strB = null;
        }
        if (newGiftCardData.getBalance() != null) {
            linearLayout.setVisibility(0);
            strB2 = ProductInfoFormatter.b(newGiftCardData.getBalance());
            itemAddedGiftCardBinding.B.setText(strB2);
            addedGiftCardViewHolder.b = view.getContext().getString(R.string.amount_exceed_gift_card_balance, ProductInfoFormatter.b(newGiftCardData.getBalance()));
        } else {
            linearLayout.setVisibility(4);
            strB2 = null;
        }
        if (newGiftCardData.getExpiry() != null) {
            textView3.setText(newGiftCardData.getExpiry());
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        if (!this.j.n()) {
            if (includeCheckoutErrorNoRoundedBinding.y.getVisibility() == 0) {
                addedGiftCardViewHolder.d = includeCheckoutErrorNoRoundedBinding.z.getText().toString();
            }
            itemAddedGiftCardBinding.E.y.setVisibility(8);
            editText.setVisibility(4);
            return;
        }
        if (!Strings.a(addedGiftCardViewHolder.d)) {
            String str = addedGiftCardViewHolder.d;
            itemAddedGiftCardBinding.E.y.setVisibility(0);
            itemAddedGiftCardBinding.E.z.setText(str);
            addedGiftCardViewHolder.d = null;
        }
        editText.setVisibility(0);
        Context context = addedGiftCardViewHolder.itemView.getContext();
        String strSubstring = newGiftCardData.getMaskedCardNumber().substring(2);
        if (Strings.b(strB2)) {
            constraintLayout.setContentDescription(context.getString(R.string.selected_unknown_balance_pay_with_gift_card_content_description, strSubstring, strB));
        } else {
            constraintLayout.setContentDescription(context.getString(R.string.selected_pay_with_gift_card_content_description, strSubstring, strB2, strB));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        return new AddedGiftCardViewHolder((ItemAddedGiftCardBinding) DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), R.layout.item_added_gift_card, viewGroup, false, null), this.h, new a(this), new a(this));
    }
}
