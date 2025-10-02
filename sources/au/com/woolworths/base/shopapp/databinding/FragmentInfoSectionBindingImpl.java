package au.com.woolworths.base.shopapp.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.generated.callback.OnClickListener;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragmentListener;
import au.com.woolworths.views.BottomSheetWithHandle;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentInfoSectionBindingImpl extends FragmentInfoSectionBinding implements OnClickListener.Listener {
    public static final SparseIntArray E;
    public final ImageView B;
    public final OnClickListener C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.recycler_view, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentInfoSectionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, E);
        super(dataBindingComponent, view, (EpoxyRecyclerView) objArrT[2]);
        this.D = -1L;
        ((BottomSheetWithHandle) objArrT[0]).setTag(null);
        ImageView imageView = (ImageView) objArrT[1];
        this.B = imageView;
        imageView.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 != i) {
            return false;
        }
        L((InfoSectionFragmentListener) obj);
        return true;
    }

    @Override // au.com.woolworths.base.shopapp.databinding.FragmentInfoSectionBinding
    public final void L(InfoSectionFragmentListener infoSectionFragmentListener) throws Throwable {
        this.z = infoSectionFragmentListener;
        synchronized (this) {
            this.D |= 1;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.base.shopapp.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        InfoSectionFragmentListener infoSectionFragmentListener = this.z;
        if (infoSectionFragmentListener != null) {
            infoSectionFragmentListener.z0();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        if ((j & 2) != 0) {
            this.B.setOnClickListener(this.C);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
