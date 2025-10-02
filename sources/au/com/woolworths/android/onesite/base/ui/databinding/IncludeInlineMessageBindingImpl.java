package au.com.woolworths.android.onesite.base.ui.databinding;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class IncludeInlineMessageBindingImpl extends IncludeInlineMessageBinding {
    public final ConstraintLayout B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeInlineMessageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[2], dataBindingComponent);
        this.C = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (117 != i) {
            return false;
        }
        L((InlineMessage) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeInlineMessageBinding
    public final void L(InlineMessage inlineMessage) throws Throwable {
        this.A = inlineMessage;
        synchronized (this) {
            this.C |= 1;
        }
        h(117);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        int iB;
        CharSequence text;
        Text text2;
        InlineErrorType inlineErrorType;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        InlineMessage inlineMessage = this.A;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            if (inlineMessage != null) {
                text2 = inlineMessage.b;
                inlineErrorType = inlineMessage.f4338a;
            } else {
                text2 = null;
                inlineErrorType = null;
            }
            text = text2 != null ? text2.getText(this.h.getContext()) : null;
            if (inlineErrorType != null) {
                Context context = this.h.getContext();
                Intrinsics.h(context, "context");
                iB = inlineErrorType.b(4, context);
            } else {
                iB = 0;
            }
        } else {
            iB = 0;
            text = null;
        }
        if (j2 != 0) {
            BindingAdaptersKt.m(this.y, iB, null);
            TextViewBindingAdapter.b(this.z, text);
            TextView textView = this.z;
            Intrinsics.h(textView, "textView");
            if (inlineMessage != null) {
                InlineErrorType inlineErrorType2 = inlineMessage.f4338a;
                Context context2 = textView.getContext();
                Intrinsics.g(context2, "getContext(...)");
                textView.setTextAppearance(inlineErrorType2.b(6, context2));
            }
            ConstraintLayout view = this.B;
            Intrinsics.h(view, "view");
            if (inlineMessage != null) {
                InlineErrorType inlineErrorType3 = inlineMessage.f4338a;
                Context context3 = view.getContext();
                Intrinsics.g(context3, "getContext(...)");
                inlineErrorType3.getClass();
                view.setBackgroundColor(inlineErrorType3.a(0, context3));
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
