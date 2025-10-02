package au.com.woolworths.feature.shop.more.databinding;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.MoreChatToUs;
import au.com.woolworths.feature.shop.more.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemMoreChatToUsBindingImpl extends EpoxyItemMoreChatToUsBinding implements OnClickListener.Listener {
    public final ConstraintLayout D;
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemMoreChatToUsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (ImageView) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.F = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (96 == i) {
            this.C = (Boolean) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(96);
            y();
            return true;
        }
        if (147 == i) {
            this.A = (MoreChatToUs) obj;
            synchronized (this) {
                this.F |= 2;
            }
            h(147);
            y();
            return true;
        }
        if (273 != i) {
            return false;
        }
        this.B = (MoreViewModel) obj;
        synchronized (this) {
            this.F |= 4;
        }
        h(273);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.more.generated.callback.OnClickListener.Listener
    public final void a(int i) throws Resources.NotFoundException {
        MoreChatToUs moreChatToUs = this.A;
        MoreViewModel moreViewModel = this.B;
        if (moreViewModel != null) {
            if (!moreViewModel.p.d()) {
                if (moreChatToUs != null) {
                    moreViewModel.t6(moreChatToUs.getTitle(), moreChatToUs.getUrl());
                }
            } else {
                String string = this.D.getResources().getString(R.string.title_olive_chatbot);
                if (moreChatToUs != null) {
                    moreViewModel.t6(string, moreChatToUs.getUrl());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[PHI: r0
  0x002a: PHI (r0v2 long) = (r0v1 long), (r0v7 long) binds: [B:6:0x0013, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.F     // Catch: java.lang.Throwable -> L50
            r2 = 0
            r12.F = r2     // Catch: java.lang.Throwable -> L50
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L50
            java.lang.Boolean r4 = r12.C
            au.com.woolworths.feature.shop.more.data.MoreChatToUs r5 = r12.A
            r6 = 9
            long r8 = r0 & r6
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r9 = 0
            if (r8 == 0) goto L2a
            boolean r4 = androidx.databinding.ViewDataBinding.B(r4)
            if (r8 == 0) goto L24
            if (r4 == 0) goto L21
            r10 = 32
        L1f:
            long r0 = r0 | r10
            goto L24
        L21:
            r10 = 16
            goto L1f
        L24:
            if (r4 == 0) goto L27
            goto L2a
        L27:
            r4 = 8
            goto L2b
        L2a:
            r4 = r9
        L2b:
            r10 = 10
            long r10 = r10 & r0
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 == 0) goto L37
            android.widget.TextView r8 = r12.y
            au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt.c(r8, r5, r9)
        L37:
            r8 = 8
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L45
            androidx.constraintlayout.widget.ConstraintLayout r5 = r12.D
            au.com.woolworths.feature.shop.more.generated.callback.OnClickListener r8 = r12.E
            r5.setOnClickListener(r8)
        L45:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4f
            android.widget.ImageView r0 = r12.z
            r0.setVisibility(r4)
        L4f:
            return
        L50:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.databinding.EpoxyItemMoreChatToUsBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
