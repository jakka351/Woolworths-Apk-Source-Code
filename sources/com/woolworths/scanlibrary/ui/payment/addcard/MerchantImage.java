package com.woolworths.scanlibrary.ui.payment.addcard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/addcard/MerchantImage;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MerchantImage {
    public static final Companion f;
    public static final MerchantImage g;
    public static final /* synthetic */ MerchantImage[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;
    public final int e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/addcard/MerchantImage$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static MerchantImage a(String str) {
            for (MerchantImage merchantImage : MerchantImage.values()) {
                if (merchantImage.d.equals(str)) {
                    return merchantImage;
                }
            }
            return MerchantImage.g;
        }
    }

    static {
        MerchantImage merchantImage = new MerchantImage("AMEX", 0, "AMEX", 2131232153);
        MerchantImage merchantImage2 = new MerchantImage("DINERS", 1, "DINERS", 2131232154);
        MerchantImage merchantImage3 = new MerchantImage("JCB", 2, "JCB", 2131232155);
        MerchantImage merchantImage4 = new MerchantImage("MASTER_CARD", 3, "MASTERCARD", 2131232156);
        g = merchantImage4;
        MerchantImage[] merchantImageArr = {merchantImage, merchantImage2, merchantImage3, merchantImage4, new MerchantImage("VISA", 4, "VISA", 2131232157)};
        h = merchantImageArr;
        i = EnumEntriesKt.a(merchantImageArr);
        f = new Companion();
    }

    public MerchantImage(String str, int i2, String str2, int i3) {
        this.d = str2;
        this.e = i3;
    }

    public static MerchantImage valueOf(String str) {
        return (MerchantImage) Enum.valueOf(MerchantImage.class, str);
    }

    public static MerchantImage[] values() {
        return (MerchantImage[]) h.clone();
    }
}
