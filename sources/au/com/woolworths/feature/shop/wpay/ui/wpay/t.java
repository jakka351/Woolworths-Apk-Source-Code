package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ t(boolean z, int i) {
        this.d = i;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.d) {
            case 0:
                GiftCardEdit.Linked value = (GiftCardEdit.Linked) obj2;
                Intrinsics.h(str, "<unused var>");
                Intrinsics.h(value, "value");
                boolean z = this.e;
                return GiftCardEdit.Linked.a(value, z, z ? value.c : "", 9);
            default:
                GiftCardEdit.Unlinked value2 = (GiftCardEdit.Unlinked) obj2;
                Intrinsics.h(str, "<unused var>");
                Intrinsics.h(value2, "value");
                boolean z2 = this.e;
                return GiftCardEdit.Unlinked.a(value2, z2, z2 ? value2.d : "", 19);
        }
    }
}
