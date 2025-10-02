package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit;
import java.text.DecimalFormat;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ WPayForOrderViewModel e;

    public /* synthetic */ q(WPayForOrderViewModel wPayForOrderViewModel, int i) {
        this.d = i;
        this.e = wPayForOrderViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.d) {
            case 0:
                GiftCardEdit.Linked value = (GiftCardEdit.Linked) obj2;
                Intrinsics.h(str, "<unused var>");
                Intrinsics.h(value, "value");
                CurrencyFormatter currencyFormatter = this.e.l;
                String str2 = value.c;
                currencyFormatter.getClass();
                if (CurrencyFormatter.a(str2) == 0) {
                    str2 = "";
                }
                return GiftCardEdit.Linked.a(value, false, str2, 11);
            case 1:
                GiftCardEdit.Linked value2 = (GiftCardEdit.Linked) obj2;
                Intrinsics.h(str, "<unused var>");
                Intrinsics.h(value2, "value");
                CurrencyFormatter currencyFormatter2 = this.e.l;
                String str3 = value2.c;
                DecimalFormat decimalFormat = currencyFormatter2.f8358a;
                Double dH0 = StringsKt.h0(str3);
                String str4 = decimalFormat.format(dH0 != null ? dH0.doubleValue() : 0.0d);
                Intrinsics.g(str4, "format(...)");
                if (!value2.b) {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = "";
                }
                return GiftCardEdit.Linked.a(value2, false, str4, 11);
            case 2:
                GiftCardEdit.Unlinked value3 = (GiftCardEdit.Unlinked) obj2;
                Intrinsics.h(str, "<unused var>");
                Intrinsics.h(value3, "value");
                CurrencyFormatter currencyFormatter3 = this.e.l;
                String str5 = value3.d;
                DecimalFormat decimalFormat2 = currencyFormatter3.f8358a;
                Double dH02 = StringsKt.h0(str5);
                String str6 = decimalFormat2.format(dH02 != null ? dH02.doubleValue() : 0.0d);
                Intrinsics.g(str6, "format(...)");
                if (!value3.c) {
                    str6 = null;
                }
                if (str6 == null) {
                    str6 = "";
                }
                return GiftCardEdit.Unlinked.a(value3, false, str6, 23);
            default:
                GiftCardEdit.Unlinked value4 = (GiftCardEdit.Unlinked) obj2;
                Intrinsics.h(str, "<unused var>");
                Intrinsics.h(value4, "value");
                CurrencyFormatter currencyFormatter4 = this.e.l;
                String str7 = value4.d;
                currencyFormatter4.getClass();
                if (CurrencyFormatter.a(str7) == 0) {
                    str7 = "";
                }
                return GiftCardEdit.Unlinked.a(value4, false, str7, 23);
        }
    }
}
