package au.com.woolworths.checkout.common.responsemodels;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutData;", "", "id", "", TextBundle.TEXT_ENTRY, "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getText", "()Ljava/lang/String;", "isAllDataSet", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutData {

    @SerializedName("Id")
    private final int id;

    @SerializedName("Text")
    @NotNull
    private final String text;

    public CheckoutData(int i, @NotNull String text) {
        Intrinsics.h(text, "text");
        this.id = i;
        this.text = text;
    }

    public static /* synthetic */ CheckoutData copy$default(CheckoutData checkoutData, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = checkoutData.id;
        }
        if ((i2 & 2) != 0) {
            str = checkoutData.text;
        }
        return checkoutData.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final CheckoutData copy(int id, @NotNull String text) {
        Intrinsics.h(text, "text");
        return new CheckoutData(id, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutData)) {
            return false;
        }
        CheckoutData checkoutData = (CheckoutData) other;
        return this.id == checkoutData.id && Intrinsics.c(this.text, checkoutData.text);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final boolean isAllDataSet() {
        return (this.id == 0 || StringsKt.D(this.text)) ? false : true;
    }

    @NotNull
    public String toString() {
        return "CheckoutData(id=" + this.id + ", text=" + this.text + ")";
    }
}
