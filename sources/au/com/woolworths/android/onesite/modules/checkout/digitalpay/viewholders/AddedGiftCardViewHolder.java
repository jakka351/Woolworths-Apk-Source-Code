package au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.ItemAddedGiftCardBinding;
import au.com.woolworths.android.onesite.models.checkout.NewGiftCardData;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showAddedGiftCards$1;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.GiftCardUtils;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.AddedGiftCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.utils.Strings;
import com.woolworths.R;
import java.util.ArrayList;
import kotlin.Pair;

/* loaded from: classes3.dex */
public class AddedGiftCardViewHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ItemAddedGiftCardBinding f4294a;
    public String b;
    public String c;
    public String d;

    public AddedGiftCardViewHolder(ItemAddedGiftCardBinding itemAddedGiftCardBinding, DigitalPayForOrderFragment$showAddedGiftCards$1 digitalPayForOrderFragment$showAddedGiftCards$1, au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.a aVar, final au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.a aVar2) {
        super(itemAddedGiftCardBinding.h);
        this.f4294a = itemAddedGiftCardBinding;
        itemAddedGiftCardBinding.G.setOnClickListener(new androidx.navigation.ui.a(1, this, digitalPayForOrderFragment$showAddedGiftCards$1));
        itemAddedGiftCardBinding.H.setOnCheckedChangeListener(new a(0, this, aVar));
        TextWatcher textWatcher = new TextWatcher(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.AddedGiftCardViewHolder.1
            public final /* synthetic */ AddedGiftCardViewHolder e;

            {
                this.e = this;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Pair pair;
                String string = charSequence.toString();
                AddedGiftCardViewHolder addedGiftCardViewHolder = this.e;
                ItemAddedGiftCardBinding itemAddedGiftCardBinding2 = addedGiftCardViewHolder.f4294a;
                if (string.equals(addedGiftCardViewHolder.c)) {
                    return;
                }
                itemAddedGiftCardBinding2.F.removeTextChangedListener(this);
                String strA = GiftCardUtils.a(charSequence.toString());
                itemAddedGiftCardBinding2.F.setText(strA);
                itemAddedGiftCardBinding2.F.setSelection(strA.length());
                addedGiftCardViewHolder.c = strA;
                int adapterPosition = addedGiftCardViewHolder.getAdapterPosition();
                AddedGiftCardRecyclerViewAdapter addedGiftCardRecyclerViewAdapter = aVar2.d;
                ArrayList arrayList = addedGiftCardRecyclerViewAdapter.g;
                if (adapterPosition < 0 || adapterPosition >= arrayList.size()) {
                    pair = null;
                } else {
                    NewGiftCardData newGiftCardData = (NewGiftCardData) arrayList.get(adapterPosition);
                    newGiftCardData.setPaymentAmount(strA);
                    addedGiftCardRecyclerViewAdapter.j.C0();
                    pair = new Pair(Boolean.valueOf(newGiftCardData.shouldShowPaymentAmountValid()), Boolean.valueOf(newGiftCardData.isPaymentAmountEqualsToBalance()));
                }
                if (pair != null) {
                    boolean zBooleanValue = ((Boolean) pair.d).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) pair.e).booleanValue();
                    if (zBooleanValue) {
                        itemAddedGiftCardBinding2.E.y.setVisibility(8);
                        if (zBooleanValue2) {
                            itemAddedGiftCardBinding2.H.setEnabled(false);
                            itemAddedGiftCardBinding2.H.setChecked(false);
                        } else {
                            itemAddedGiftCardBinding2.H.setEnabled(true);
                        }
                    } else if (!Strings.b(addedGiftCardViewHolder.b)) {
                        String str = addedGiftCardViewHolder.b;
                        itemAddedGiftCardBinding2.E.y.setVisibility(0);
                        itemAddedGiftCardBinding2.E.z.setText(str);
                        itemAddedGiftCardBinding2.H.setEnabled(false);
                        itemAddedGiftCardBinding2.H.setChecked(false);
                    }
                }
                String strSubstring = itemAddedGiftCardBinding2.z.getText().toString().substring(2);
                String string2 = itemAddedGiftCardBinding2.B.getText().toString();
                Context context = addedGiftCardViewHolder.itemView.getContext();
                String string3 = Strings.b(addedGiftCardViewHolder.c) ? context.getString(R.string.zero_dollar_amount) : addedGiftCardViewHolder.c;
                if (Strings.b(string2)) {
                    itemAddedGiftCardBinding2.A.setContentDescription(context.getString(R.string.selected_unknown_balance_pay_with_gift_card_content_description, strSubstring, string3));
                } else {
                    itemAddedGiftCardBinding2.A.setContentDescription(context.getString(R.string.selected_pay_with_gift_card_content_description, strSubstring, string2, string3));
                }
                itemAddedGiftCardBinding2.F.addTextChangedListener(this);
            }
        };
        EditText editText = itemAddedGiftCardBinding.F;
        editText.addTextChangedListener(textWatcher);
        editText.setOnFocusChangeListener(new b(this, textWatcher, 0));
    }
}
