package androidx.core.content.res;

import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import me.oriient.ipssdk.realtime.ofs.L4;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, int i2, Object obj) {
        this.d = i2;
        this.f = obj;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((ResourcesCompat.FontCallback) this.f).d(this.e);
                break;
            case 1:
                ((DigitalPayForOrderPresenter) this.f).j0(this.e, true);
                break;
            case 2:
                ((RecyclerView) this.f).o0(this.e);
                break;
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                View view = (View) sideSheetBehavior.s.get();
                if (view != null) {
                    sideSheetBehavior.A(view, this.e, false);
                    break;
                }
                break;
            case 4:
                BarcodeCountView.a((BarcodeCountView) this.f, this.e);
                break;
            default:
                ((L4) this.f).a(this.e);
                break;
        }
    }
}
