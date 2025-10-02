package com.woolworths.scanlibrary.util.payment;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/payment/InfoBarError;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InfoBarError {
    public static final InfoBarError f;
    public static final InfoBarError g;
    public static final InfoBarError h;
    public static final /* synthetic */ InfoBarError[] i;
    public static final /* synthetic */ EnumEntries j;
    public final int d;
    public final int e;

    static {
        InfoBarError infoBarError = new InfoBarError(0, R.drawable.sng_background_checkout_error_no_rounded_default_sng, R.drawable.sng_ic_infobar_error, "ERROR");
        f = infoBarError;
        InfoBarError infoBarError2 = new InfoBarError(1, R.drawable.sng_background_checkout_warning_no_rounded_default_sng, R.drawable.sng_ic_infobar_warning, "WARNING");
        g = infoBarError2;
        InfoBarError infoBarError3 = new InfoBarError(2, R.drawable.sng_background_checkout_info_no_rounded_default, R.drawable.sng_ic_infobar_info, "INFO");
        h = infoBarError3;
        InfoBarError[] infoBarErrorArr = {infoBarError, infoBarError2, infoBarError3};
        i = infoBarErrorArr;
        j = EnumEntriesKt.a(infoBarErrorArr);
    }

    public InfoBarError(int i2, int i3, int i4, String str) {
        this.d = i3;
        this.e = i4;
    }

    public static InfoBarError valueOf(String str) {
        return (InfoBarError) Enum.valueOf(InfoBarError.class, str);
    }

    public static InfoBarError[] values() {
        return (InfoBarError[]) i.clone();
    }
}
