package au.com.woolworths.rewards.base.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.rewards.coachmark.RichCoachMarkSettings;
import com.google.android.material.color.MaterialColors;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class RewardsRichCoachMarkWithImageBindingImpl extends RewardsRichCoachMarkWithImageBinding {
    public static final ViewDataBinding.IncludedLayouts K;
    public static final SparseIntArray L;
    public final TextView H;
    public final TextView I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        K = includedLayouts;
        includedLayouts.a(1, new int[]{10}, new int[]{R.layout.include_downloadable_asset}, new String[]{"include_downloadable_asset"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.spacer_top, 11);
        sparseIntArray.put(R.id.spacer_bottom, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RewardsRichCoachMarkWithImageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 13, K, L);
        ImageButton imageButton = (ImageButton) objArrT[3];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[5];
        TextView textView = (TextView) objArrT[4];
        IncludeDownloadableAssetBinding includeDownloadableAssetBinding = (IncludeDownloadableAssetBinding) objArrT[10];
        Button button = (Button) objArrT[6];
        Button button2 = (Button) objArrT[9];
        super(dataBindingComponent, view, imageButton, constraintLayout, textView, includeDownloadableAssetBinding, button, button2, (TextView) objArrT[2]);
        this.J = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        IncludeDownloadableAssetBinding includeDownloadableAssetBinding2 = this.B;
        if (includeDownloadableAssetBinding2 != null) {
            includeDownloadableAssetBinding2.n = this;
        }
        this.C.setTag(null);
        ((CardView) objArrT[0]).setTag(null);
        ((ConstraintLayout) objArrT[1]).setTag(null);
        TextView textView2 = (TextView) objArrT[7];
        this.H = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArrT[8];
        this.I = textView3;
        textView3.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (38 == i) {
            this.F = (RichCoachMarkSettings) obj;
            synchronized (this) {
                this.J |= 2;
            }
            h(38);
            y();
            return true;
        }
        if (242 != i) {
            return false;
        }
        this.G = (Boolean) obj;
        synchronized (this) {
            this.J |= 4;
        }
        h(242);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int iC;
        boolean z;
        Drawable drawableB;
        Context context;
        int i;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        RichCoachMarkSettings richCoachMarkSettings = this.F;
        Boolean bool = this.G;
        long j2 = j & 10;
        if (j2 != 0) {
            Context context2 = this.h.getContext();
            Intrinsics.h(richCoachMarkSettings, "<this>");
            Intrinsics.h(context2, "context");
            iC = MaterialColors.c(context2, R.attr.colorSurface, -1);
            if (j2 != 0) {
                j |= 64;
            }
            z = true;
        } else {
            iC = 0;
            z = false;
        }
        boolean z2 = z;
        long j3 = j & 12;
        if (j3 != 0) {
            boolean zB = ViewDataBinding.B(bool);
            if (j3 != 0) {
                j |= zB ? 32L : 16L;
            }
            if (zB) {
                context = this.y.getContext();
                i = R.drawable.ic_close_dark;
            } else {
                context = this.y.getContext();
                i = R.drawable.ic_round_close;
            }
            drawableB = AppCompatResources.b(i, context);
        } else {
            drawableB = null;
        }
        long j4 = 10 & j;
        if ((j & 12) != 0) {
            ImageButton view = this.y;
            Intrinsics.h(view, "view");
            view.setImageDrawable(drawableB);
        }
        if (j4 != 0) {
            BindingAdaptersKt.o(this.z, false);
            TextViewBindingAdapter.b(this.A, null);
            this.B.L(null);
            this.B.O(Integer.valueOf(iC));
            TextViewBindingAdapter.b(this.C, null);
            BindingAdaptersKt.j(this.C, z2);
            TextViewBindingAdapter.b(this.H, null);
            BindingAdaptersKt.j(this.H, false);
            TextViewBindingAdapter.b(this.I, null);
            BindingAdaptersKt.j(this.I, z2);
            TextViewBindingAdapter.b(this.D, null);
            BindingAdaptersKt.j(this.D, z);
            TextViewBindingAdapter.b(this.E, null);
        }
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 8L;
        }
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }
}
