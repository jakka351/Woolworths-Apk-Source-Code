package au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders;

import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.databinding.ItemExpiredCreditCardBinding;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.ExpiredCreditCardRecyclerViewAdapter;
import au.com.woolworths.pay.sdk.web.UpdateCreditCardView;
import java.lang.ref.WeakReference;
import java.net.URL;

/* loaded from: classes3.dex */
public class ExpiredCreditCardViewHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public ItemExpiredCreditCardBinding f4295a;
    public WeakReference b;
    public String c;
    public URL d;
    public androidx.camera.camera2.interop.e e;
    public ExpiredCreditCardRecyclerViewAdapter f;

    public interface ViewHolderListener {
    }

    public final void c() {
        ItemExpiredCreditCardBinding itemExpiredCreditCardBinding = this.f4295a;
        androidx.camera.camera2.interop.e eVar = this.e;
        if (eVar != null) {
            eVar.a(getAdapterPosition());
        }
        if (d() != null) {
            d().b();
        }
        itemExpiredCreditCardBinding.D.setVisibility(8);
        itemExpiredCreditCardBinding.E.setVisibility(0);
        e();
    }

    public final UpdateCreditCardView d() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (UpdateCreditCardView) weakReference.get();
        }
        return null;
    }

    public final void e() {
        ItemExpiredCreditCardBinding itemExpiredCreditCardBinding = this.f4295a;
        itemExpiredCreditCardBinding.z.y.setVisibility(8);
        itemExpiredCreditCardBinding.H.setVisibility(0);
    }

    public final void f(int i) {
        ItemExpiredCreditCardBinding itemExpiredCreditCardBinding = this.f4295a;
        itemExpiredCreditCardBinding.z.y.setVisibility(0);
        itemExpiredCreditCardBinding.H.setVisibility(8);
        itemExpiredCreditCardBinding.z.z.setText(i);
    }
}
