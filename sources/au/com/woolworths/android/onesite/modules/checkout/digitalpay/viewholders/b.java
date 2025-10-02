package au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders;

import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.ItemAddedGiftCardBinding;
import au.com.woolworths.android.onesite.databinding.ItemSavedGiftCardBinding;
import au.com.woolworths.android.onesite.utils.ProductInfoFormatter;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextWatcher e;
    public final /* synthetic */ RecyclerView.ViewHolder f;

    public /* synthetic */ b(RecyclerView.ViewHolder viewHolder, TextWatcher textWatcher, int i) {
        this.d = i;
        this.f = viewHolder;
        this.e = textWatcher;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.d) {
            case 0:
                ItemAddedGiftCardBinding itemAddedGiftCardBinding = ((AddedGiftCardViewHolder) this.f).f4294a;
                if (!z) {
                    EditText editText = itemAddedGiftCardBinding.F;
                    if (editText.getText() != null) {
                        TextWatcher textWatcher = this.e;
                        editText.removeTextChangedListener(textWatcher);
                        editText.setText(ProductInfoFormatter.a(editText.getText().toString()));
                        editText.addTextChangedListener(textWatcher);
                        break;
                    }
                }
                break;
            default:
                ItemSavedGiftCardBinding itemSavedGiftCardBinding = ((SavedGiftCardViewHolder) this.f).f4298a;
                if (!z) {
                    EditText editText2 = itemSavedGiftCardBinding.J;
                    if (editText2.getText() != null) {
                        TextWatcher textWatcher2 = this.e;
                        editText2.removeTextChangedListener(textWatcher2);
                        editText2.setText(ProductInfoFormatter.a(editText2.getText().toString()));
                        editText2.addTextChangedListener(textWatcher2);
                        break;
                    }
                }
                break;
        }
    }
}
