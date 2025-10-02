package au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.ItemExpiredGiftCardBinding;
import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredZeroBalanceGiftCards$1;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.ExpiredGiftCardViewHolder;
import au.com.woolworths.android.onesite.utils.ProductInfoFormatter;
import com.woolworths.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ExpiredZeroBalanceGiftCardRecyclerViewAdapter extends RecyclerView.Adapter<ExpiredGiftCardViewHolder> {
    public ArrayList g;
    public DigitalPayForOrderFragment$showExpiredZeroBalanceGiftCards$1 h;
    public DigitalPayForOrderPresenter i;

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
        ExpiredGiftCardViewHolder expiredGiftCardViewHolder = (ExpiredGiftCardViewHolder) viewHolder;
        ItemExpiredGiftCardBinding itemExpiredGiftCardBinding = expiredGiftCardViewHolder.f4296a;
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.i;
        ArrayList arrayList = this.g;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        SavedGiftCardData savedGiftCardData = (SavedGiftCardData) arrayList.get(i);
        boolean zIsAllowed = savedGiftCardData.isAllowed();
        boolean zIsExpired = savedGiftCardData.isExpired();
        if (i == i() - 1) {
            itemExpiredGiftCardBinding.D.setBackgroundResource(R.drawable.background_expired_payment_instrument_bottom_rounded_default);
        } else {
            itemExpiredGiftCardBinding.D.setBackgroundResource(R.drawable.background_expired_payment_instrument_no_rounded_default);
        }
        TextView textView = itemExpiredGiftCardBinding.E;
        TextView textView2 = itemExpiredGiftCardBinding.z;
        TextView textView3 = itemExpiredGiftCardBinding.y;
        textView.setText(savedGiftCardData.getMaskedCardNumber());
        String strB = ProductInfoFormatter.b(savedGiftCardData.getBalance());
        String strSubstring = savedGiftCardData.getMaskedCardNumber().substring(2);
        if (savedGiftCardData.getBalance() != null) {
            textView3.setVisibility(0);
            textView2.setVisibility(0);
            textView2.setText(strB);
        } else {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        }
        TextView textView4 = itemExpiredGiftCardBinding.B;
        View view = itemExpiredGiftCardBinding.h;
        TextView textView5 = itemExpiredGiftCardBinding.A;
        LinearLayout linearLayout = itemExpiredGiftCardBinding.D;
        TextView textView6 = itemExpiredGiftCardBinding.C;
        textView4.setText(Html.fromHtml(view.getContext().getString(R.string.remove_payment_instrument)));
        view.setClickable(zIsAllowed && digitalPayForOrderPresenter.n());
        itemExpiredGiftCardBinding.E.setEnabled(false);
        textView2.setEnabled(false);
        textView3.setEnabled(false);
        Context context = expiredGiftCardViewHolder.itemView.getContext();
        if (!zIsAllowed) {
            linearLayout.setContentDescription(context.getString(R.string.not_supported_gift_card_content_description, strSubstring, strB));
            textView5.setVisibility(0);
            textView6.setVisibility(0);
            textView6.setText(savedGiftCardData.getMaskedCardNumber());
            textView6.setTypeface(ResourcesCompat.e(R.font.fresh_sans_regular, context), 0);
            textView6.setTextSize(2, 14.0f);
            textView6.setTextColor(context.getColor(R.color.light_text));
            textView6.setEnabled(false);
            return;
        }
        if (zIsExpired) {
            if (digitalPayForOrderPresenter.n()) {
                linearLayout.setContentDescription(context.getString(R.string.expired_gift_card_content_description, strSubstring, strB));
            } else {
                linearLayout.setContentDescription(context.getString(R.string.manage_expired_gift_card_content_description, strSubstring, strB));
            }
            textView5.setVisibility(8);
            textView6.setVisibility(0);
            textView6.setText(R.string.cardExpiredText);
            textView6.setTextSize(2, 13.0f);
            textView6.setTypeface(ResourcesCompat.e(R.font.fresh_sans_medium, context), 1);
            textView6.setTextColor(context.getColor(R.color.checkoutErrorBorder));
            textView6.setEnabled(true);
            return;
        }
        if (digitalPayForOrderPresenter.n()) {
            linearLayout.setContentDescription(context.getString(R.string.zero_balance_gift_card_content_description, strSubstring));
        } else {
            linearLayout.setContentDescription(context.getString(R.string.manage_zero_balance_gift_card_content_description, strSubstring));
        }
        textView5.setVisibility(8);
        textView6.setVisibility(0);
        textView6.setTextSize(2, 14.0f);
        textView6.setText(savedGiftCardData.getExpiry());
        textView6.setTypeface(ResourcesCompat.e(R.font.fresh_sans_regular, context), 0);
        textView6.setTextColor(ResourcesCompat.b(R.color.payment_instrument_text_selector, context.getTheme(), context.getResources()));
        textView6.setEnabled(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        ItemExpiredGiftCardBinding itemExpiredGiftCardBinding = (ItemExpiredGiftCardBinding) DataBindingUtil.c(LayoutInflater.from(viewGroup.getContext()), R.layout.item_expired_gift_card, viewGroup, false, null);
        DigitalPayForOrderFragment$showExpiredZeroBalanceGiftCards$1 digitalPayForOrderFragment$showExpiredZeroBalanceGiftCards$1 = this.h;
        ExpiredGiftCardViewHolder expiredGiftCardViewHolder = new ExpiredGiftCardViewHolder(itemExpiredGiftCardBinding.h);
        expiredGiftCardViewHolder.f4296a = itemExpiredGiftCardBinding;
        itemExpiredGiftCardBinding.B.setOnClickListener(new androidx.navigation.ui.a(3, expiredGiftCardViewHolder, digitalPayForOrderFragment$showExpiredZeroBalanceGiftCards$1));
        return expiredGiftCardViewHolder;
    }
}
