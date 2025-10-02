package au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders;

import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.ItemSavedCreditCardBinding;
import au.com.woolworths.pay.sdk.web.StepUpView;
import com.woolworths.R;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class SavedCreditCardViewHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public ItemSavedCreditCardBinding f4297a;
    public WeakReference b;
    public boolean c;
    public boolean d;
    public String e;
    public boolean f;
    public boolean g;

    public final StepUpView c() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (StepUpView) weakReference.get();
        }
        return null;
    }

    public final void d() {
        this.f4297a.y.y.setVisibility(8);
        f();
    }

    public final void e(int i) {
        ItemSavedCreditCardBinding itemSavedCreditCardBinding = this.f4297a;
        itemSavedCreditCardBinding.K.setBackgroundColor(itemSavedCreditCardBinding.h.getContext().getColor(i));
    }

    public final void f() {
        ItemSavedCreditCardBinding itemSavedCreditCardBinding = this.f4297a;
        if (this.g) {
            if (this.f) {
                itemSavedCreditCardBinding.I.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_error);
                itemSavedCreditCardBinding.y.y.setBackgroundResource(R.drawable.background_checkout_error_top_rounded_default);
                return;
            } else {
                itemSavedCreditCardBinding.I.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_error);
                itemSavedCreditCardBinding.y.y.setBackgroundResource(R.drawable.background_checkout_error_no_rounded_default);
                return;
            }
        }
        if (this.f) {
            itemSavedCreditCardBinding.I.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_selector);
            itemSavedCreditCardBinding.y.y.setBackgroundResource(R.drawable.background_checkout_error_top_rounded_default);
        } else {
            itemSavedCreditCardBinding.I.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_selector);
            itemSavedCreditCardBinding.y.y.setBackgroundResource(R.drawable.background_checkout_error_no_rounded_default);
        }
    }
}
