package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.discount.Discount;
import com.woolworths.scanlibrary.util.discount.DiscountComparator;
import com.woolworths.scanlibrary.util.discount.DiscountUtilKt;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/DiscountListView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "DiscountEntry", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiscountListView extends LinearLayout {
    public final LinearLayout d;
    public final LayoutInflater e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/DiscountListView$DiscountEntry;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DiscountEntry {

        /* renamed from: a, reason: collision with root package name */
        public final String f21378a;
        public final BigDecimal b;

        public DiscountEntry(String discountName, BigDecimal amount) {
            Intrinsics.h(discountName, "discountName");
            Intrinsics.h(amount, "amount");
            this.f21378a = discountName;
            this.b = amount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscountEntry)) {
                return false;
            }
            DiscountEntry discountEntry = (DiscountEntry) obj;
            return Intrinsics.c(this.f21378a, discountEntry.f21378a) && Intrinsics.c(this.b, discountEntry.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21378a.hashCode() * 31);
        }

        public final String toString() {
            return "DiscountEntry(discountName=" + this.f21378a + ", amount=" + this.b + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountListView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        this.e = layoutInflater;
        View viewFindViewById = layoutInflater.inflate(R.layout.view_tender_discount_list, (ViewGroup) this, true).findViewById(R.id.discountContainer);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.d = (LinearLayout) viewFindViewById;
    }

    public final void a(List totalDiscounts, BigDecimal bigDecimal) {
        Intrinsics.h(totalDiscounts, "totalDiscounts");
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            Intrinsics.p("discountContainer");
            throw null;
        }
        linearLayout.removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (Discount discount : CollectionsKt.u0(new DiscountComparator(), totalDiscounts)) {
            arrayList.add(new DiscountEntry(discount.getName(), discount.getAmount()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DiscountEntry discountEntry = (DiscountEntry) it.next();
            LayoutInflater layoutInflater = this.e;
            if (layoutInflater == null) {
                Intrinsics.p("inflater");
                throw null;
            }
            View viewInflate = layoutInflater.inflate(R.layout.view_tender_discount_row, (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.discountAmount);
            ((TextView) viewInflate.findViewById(R.id.discountName)).setText(DiscountUtilKt.a(discountEntry.f21378a));
            textView.setText(BigDecimalExtKt.a(discountEntry.b));
            LinearLayout linearLayout2 = this.d;
            if (linearLayout2 == null) {
                Intrinsics.p("discountContainer");
                throw null;
            }
            linearLayout2.addView(viewInflate);
        }
        LayoutInflater layoutInflater2 = this.e;
        if (layoutInflater2 == null) {
            Intrinsics.p("inflater");
            throw null;
        }
        View viewInflate2 = layoutInflater2.inflate(R.layout.view_tender_total_discount_row, (ViewGroup) null, false);
        ((TextView) viewInflate2.findViewById(R.id.totalDiscountAmount)).setText(BigDecimalExtKt.a(bigDecimal));
        LinearLayout linearLayout3 = this.d;
        if (linearLayout3 == null) {
            Intrinsics.p("discountContainer");
            throw null;
        }
        linearLayout3.addView(viewInflate2);
    }
}
