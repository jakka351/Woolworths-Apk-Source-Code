package au.com.woolworths.feature.shop.recipes.freshmag.home.presentation;

import au.com.woolworths.feature.shop.recipes.databinding.EpoxyItemFreshMagHomeBinding;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ EpoxyItemFreshMagHomeBinding e;

    public /* synthetic */ a(EpoxyItemFreshMagHomeBinding epoxyItemFreshMagHomeBinding, int i) {
        this.d = i;
        this.e = epoxyItemFreshMagHomeBinding;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.L(FreshMagImageViewState.f);
                break;
            default:
                this.e.L(FreshMagImageViewState.e);
                break;
        }
    }
}
