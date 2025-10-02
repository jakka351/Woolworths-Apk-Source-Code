package au.com.woolworths.feature.shop.myorders.generated.callback;

import au.com.woolworths.base.shopapp.modules.button.Button;

/* loaded from: classes3.dex */
public final class ButtonClickHandler implements au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler {
    public final Listener d;
    public final int e;

    public interface Listener {
        void g(int i);
    }

    public ButtonClickHandler(Listener listener, int i) {
        this.d = listener;
        this.e = i;
    }

    @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
    public final void O2(Button button) {
        this.d.g(this.e);
    }
}
