package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ DigitalPayForOrderFragment e;

    public /* synthetic */ b(DigitalPayForOrderFragment digitalPayForOrderFragment, int i) {
        this.d = i;
        this.e = digitalPayForOrderFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.e.m;
                if (fragmentPayForOrderDigitalBinding != null) {
                    fragmentPayForOrderDigitalBinding.n0.scrollTo(0, 0);
                    return;
                } else {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
            default:
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.e.m;
                if (fragmentPayForOrderDigitalBinding2 != null) {
                    fragmentPayForOrderDigitalBinding2.n0.e(130);
                    return;
                } else {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
        }
    }
}
