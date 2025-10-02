package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ DigitalPayForOrderFragment e;

    public /* synthetic */ e(DigitalPayForOrderFragment digitalPayForOrderFragment, int i) {
        this.d = i;
        this.e = digitalPayForOrderFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.d) {
            case 0:
                ((DigitalPayForOrderPresenter) this.e.b2().get()).f.d(true);
                break;
            case 1:
                this.e.requireActivity().finish();
                break;
            default:
                this.e.requireActivity().finish();
                break;
        }
    }
}
