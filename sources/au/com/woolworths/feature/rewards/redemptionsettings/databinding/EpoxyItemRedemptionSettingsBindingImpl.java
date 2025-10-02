package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import au.com.woolworths.feature.rewards.redemptionsettings.generated.callback.OnClickListener;
import au.com.woolworths.views.CheckableConstraintLayout;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemRedemptionSettingsBindingImpl extends EpoxyItemRedemptionSettingsBinding implements OnClickListener.Listener {
    public static final SparseIntArray K;
    public final CheckableConstraintLayout F;
    public final ImageView G;
    public final ProgressBar H;
    public final OnClickListener I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.redemption_icon_image_view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemRedemptionSettingsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, K);
        super(dataBindingComponent, view, (TextView) objArrT[4], (FrameLayout) objArrT[5], (TextView) objArrT[3]);
        this.J = -1L;
        CheckableConstraintLayout checkableConstraintLayout = (CheckableConstraintLayout) objArrT[0];
        this.F = checkableConstraintLayout;
        checkableConstraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArrT[1];
        this.G = imageView;
        imageView.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArrT[2];
        this.H = progressBar;
        progressBar.setTag(null);
        this.y.setTag(null);
        this.A.setTag(null);
        E(view);
        this.I = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (215 == i) {
            this.B = (RewardsRedemptionSettingsItem) obj;
            synchronized (this) {
                this.J |= 1;
            }
            h(215);
            y();
            return true;
        }
        if (37 == i) {
            this.C = (RedemptionItemClickListener) obj;
            synchronized (this) {
                this.J |= 2;
            }
            h(37);
            y();
            return true;
        }
        if (121 == i) {
            this.E = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.J |= 4;
            }
            h(121);
            y();
            return true;
        }
        if (123 != i) {
            return false;
        }
        this.D = ((Boolean) obj).booleanValue();
        synchronized (this) {
            this.J |= 8;
        }
        h(123);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        RedemptionItemClickListener redemptionItemClickListener = this.C;
        RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = this.B;
        if (redemptionItemClickListener != null) {
            redemptionItemClickListener.e5(rewardsRedemptionSettingsItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = r1.J     // Catch: java.lang.Throwable -> L89
            r4 = 0
            r1.J = r4     // Catch: java.lang.Throwable -> L89
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L89
            au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem r0 = r1.B
            boolean r6 = r1.E
            boolean r7 = r1.D
            r8 = 25
            long r8 = r8 & r2
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r9 = 17
            r11 = 0
            r12 = 0
            if (r8 == 0) goto L3b
            if (r0 == 0) goto L22
            au.com.woolworths.base.rewards.account.data.RewardsRedemptionIcon r13 = r0.getIcon()
            goto L23
        L22:
            r13 = r12
        L23:
            int r13 = au.com.woolworths.base.rewards.account.data.RewardsRedemptionIconExtKt.getIconRes(r13, r7)
            long r14 = r2 & r9
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L38
            if (r0 == 0) goto L38
            java.lang.String r14 = r0.getTitle()
            java.lang.String r0 = r0.getBody()
            goto L3d
        L38:
            r0 = r12
            r14 = r0
            goto L3d
        L3b:
            r13 = r11
            goto L38
        L3d:
            r15 = 20
            long r15 = r15 & r2
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L46
            r11 = r6 ^ 1
        L46:
            r16 = 24
            long r16 = r2 & r16
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r16 == 0) goto L56
            r16 = r4
            au.com.woolworths.views.CheckableConstraintLayout r4 = r1.F
            r4.setChecked(r7)
            goto L58
        L56:
            r16 = r4
        L58:
            r4 = 16
            long r4 = r4 & r2
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L66
            au.com.woolworths.views.CheckableConstraintLayout r4 = r1.F
            au.com.woolworths.feature.rewards.redemptionsettings.generated.callback.OnClickListener r5 = r1.I
            r4.setOnClickListener(r5)
        L66:
            if (r15 == 0) goto L72
            android.widget.ImageView r4 = r1.G
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r4, r11)
            android.widget.ProgressBar r4 = r1.H
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r4, r6)
        L72:
            if (r8 == 0) goto L79
            android.widget.ImageView r4 = r1.G
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.m(r4, r13, r12)
        L79:
            long r2 = r2 & r9
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 == 0) goto L88
            android.widget.TextView r2 = r1.y
            androidx.databinding.adapters.TextViewBindingAdapter.b(r2, r0)
            android.widget.TextView r0 = r1.A
            androidx.databinding.adapters.TextViewBindingAdapter.b(r0, r14)
        L88:
            return
        L89:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L89
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.redemptionsettings.databinding.EpoxyItemRedemptionSettingsBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
