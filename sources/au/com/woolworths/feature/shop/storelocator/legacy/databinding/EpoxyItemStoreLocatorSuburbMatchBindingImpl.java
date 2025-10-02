package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.android.onesite.utils.FontSpan;
import au.com.woolworths.feature.shop.storelocator.legacy.BindingAdaptersKt;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemStoreLocatorSuburbMatchBindingImpl extends EpoxyItemStoreLocatorSuburbMatchBinding {
    public final ConstraintLayout C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemStoreLocatorSuburbMatchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[2], (TextView) objArrT[1]);
        this.D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (258 == i) {
            M((PickUpSuburb) obj);
            return true;
        }
        if (212 != i) {
            return false;
        }
        L((String) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyItemStoreLocatorSuburbMatchBinding
    public final void L(String str) throws Throwable {
        this.B = str;
        synchronized (this) {
            this.D |= 2;
        }
        h(212);
        y();
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyItemStoreLocatorSuburbMatchBinding
    public final void M(PickUpSuburb pickUpSuburb) throws Throwable {
        this.A = pickUpSuburb;
        synchronized (this) {
            this.D |= 1;
        }
        h(258);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        String str;
        long j2;
        long j3;
        String str2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        PickUpSuburb suburb = this.A;
        String searchText = this.B;
        long j4 = 7 & j;
        String string = null;
        if (j4 == 0 || (j & 5) == 0) {
            str = null;
        } else {
            if (suburb != null) {
                string = suburb.e;
                str = suburb.d;
                str2 = suburb.f;
            } else {
                str = null;
                str2 = null;
            }
            string = this.y.getResources().getString(R.string.pickup_locator_suburb_display, string, str2);
        }
        if (j4 != 0) {
            ConstraintLayout containerView = this.C;
            TextView stateAndPostCodeTextView = this.y;
            TextView suburbNameTextView = this.z;
            Intrinsics.h(containerView, "containerView");
            Intrinsics.h(suburb, "suburb");
            Intrinsics.h(searchText, "searchText");
            Intrinsics.h(stateAndPostCodeTextView, "stateAndPostCodeTextView");
            Intrinsics.h(suburbNameTextView, "suburbNameTextView");
            j2 = 0;
            Context context = containerView.getContext();
            Intrinsics.g(context, "getContext(...)");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Extensions.a(R.attr.colorPrimary, context));
            FontSpan fontSpan = new FontSpan(Typeface.create(ResourcesCompat.e(R.font.roboto_medium, containerView.getContext()), 0));
            j3 = 5;
            String string2 = stateAndPostCodeTextView.getContext().getString(R.string.pickup_locator_suburb_display, suburb.e, suburb.f);
            Intrinsics.g(string2, "getString(...)");
            String str3 = suburb.d;
            SpannableStringBuilder spannableStringBuilderA = BindingAdaptersKt.a(searchText, str3, foregroundColorSpan, fontSpan);
            if (spannableStringBuilderA == null) {
                suburbNameTextView.setText(str3);
                SpannableStringBuilder spannableStringBuilderA2 = BindingAdaptersKt.a(searchText, string2, foregroundColorSpan, fontSpan);
                if (spannableStringBuilderA2 != null) {
                    stateAndPostCodeTextView.setText(spannableStringBuilderA2);
                } else {
                    stateAndPostCodeTextView.setText(string2);
                }
            } else {
                suburbNameTextView.setText(spannableStringBuilderA);
                stateAndPostCodeTextView.setText(string2);
            }
        } else {
            j2 = 0;
            j3 = 5;
        }
        if ((j & j3) != j2) {
            TextViewBindingAdapter.b(this.y, string);
            TextViewBindingAdapter.b(this.z, str);
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
            this.D = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
