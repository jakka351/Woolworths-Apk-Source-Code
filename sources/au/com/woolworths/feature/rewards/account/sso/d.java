package au.com.woolworths.feature.rewards.account.sso;

import android.webkit.ValueCallback;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5814a;

    public /* synthetic */ d(int i) {
        this.f5814a = i;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        switch (this.f5814a) {
            case 0:
                int i = RewardsMagicLinkActivity.F;
                break;
            case 1:
                int i2 = AskOliveActivity.I;
                break;
            default:
                AddCreditCardView.setCardInfoInput$lambda$3(str);
                break;
        }
    }
}
