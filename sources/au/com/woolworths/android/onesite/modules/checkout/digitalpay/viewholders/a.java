package au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders;

import android.widget.CompoundButton;
import au.com.woolworths.android.onesite.models.checkout.NewGiftCardData;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaign;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4299a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f4299a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f4299a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = AddedGiftCardViewHolder.e;
                int adapterPosition = ((AddedGiftCardViewHolder) obj2).getAdapterPosition();
                ArrayList arrayList = ((au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.a) obj).d.g;
                if (arrayList != null) {
                    ((NewGiftCardData) arrayList.get(adapterPosition)).setSaveForLater(z);
                    break;
                }
                break;
            default:
                CheckoutProductEpoxyController.buildCheckoutProductCampaigns$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13((CheckoutProductEpoxyController) obj2, (CheckoutProductCampaign) obj, compoundButton, z);
                break;
        }
    }
}
