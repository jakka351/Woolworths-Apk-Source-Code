package au.com.woolworths.checkout.common.responsemodels;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutLink;", "", "rel", "", "url", "alt", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRel", "()Ljava/lang/String;", "getUrl", "getAlt", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutLink {

    @SerializedName("alt")
    @NotNull
    private final String alt;

    @SerializedName("rel")
    @NotNull
    private final String rel;

    @SerializedName(TextBundle.TEXT_ENTRY)
    @NotNull
    private final String text;

    @SerializedName("href")
    @NotNull
    private final String url;

    public CheckoutLink(@NotNull String rel, @NotNull String url, @NotNull String alt, @NotNull String text) {
        Intrinsics.h(rel, "rel");
        Intrinsics.h(url, "url");
        Intrinsics.h(alt, "alt");
        Intrinsics.h(text, "text");
        this.rel = rel;
        this.url = url;
        this.alt = alt;
        this.text = text;
    }

    public static /* synthetic */ CheckoutLink copy$default(CheckoutLink checkoutLink, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLink.rel;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLink.url;
        }
        if ((i & 4) != 0) {
            str3 = checkoutLink.alt;
        }
        if ((i & 8) != 0) {
            str4 = checkoutLink.text;
        }
        return checkoutLink.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRel() {
        return this.rel;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAlt() {
        return this.alt;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final CheckoutLink copy(@NotNull String rel, @NotNull String url, @NotNull String alt, @NotNull String text) {
        Intrinsics.h(rel, "rel");
        Intrinsics.h(url, "url");
        Intrinsics.h(alt, "alt");
        Intrinsics.h(text, "text");
        return new CheckoutLink(rel, url, alt, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutLink)) {
            return false;
        }
        CheckoutLink checkoutLink = (CheckoutLink) other;
        return Intrinsics.c(this.rel, checkoutLink.rel) && Intrinsics.c(this.url, checkoutLink.url) && Intrinsics.c(this.alt, checkoutLink.alt) && Intrinsics.c(this.text, checkoutLink.text);
    }

    @NotNull
    public final String getAlt() {
        return this.alt;
    }

    @NotNull
    public final String getRel() {
        return this.rel;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.text.hashCode() + b.c(b.c(this.rel.hashCode() * 31, 31, this.url), 31, this.alt);
    }

    @NotNull
    public String toString() {
        String str = this.rel;
        String str2 = this.url;
        return a.l(YU.a.v("CheckoutLink(rel=", str, ", url=", str2, ", alt="), this.alt, ", text=", this.text, ")");
    }
}
