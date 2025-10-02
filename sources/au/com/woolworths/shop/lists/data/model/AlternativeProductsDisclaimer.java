package au.com.woolworths.shop.lists.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsDisclaimer;", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsSection;", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "dismissCtaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDismissCtaText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsDisclaimer implements AlternativeProductsSection {

    @NotNull
    private final String dismissCtaText;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public AlternativeProductsDisclaimer(@NotNull String title, @NotNull String subtitle, @NotNull String dismissCtaText) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(dismissCtaText, "dismissCtaText");
        this.title = title;
        this.subtitle = subtitle;
        this.dismissCtaText = dismissCtaText;
    }

    public static /* synthetic */ AlternativeProductsDisclaimer copy$default(AlternativeProductsDisclaimer alternativeProductsDisclaimer, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alternativeProductsDisclaimer.title;
        }
        if ((i & 2) != 0) {
            str2 = alternativeProductsDisclaimer.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = alternativeProductsDisclaimer.dismissCtaText;
        }
        return alternativeProductsDisclaimer.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDismissCtaText() {
        return this.dismissCtaText;
    }

    @NotNull
    public final AlternativeProductsDisclaimer copy(@NotNull String title, @NotNull String subtitle, @NotNull String dismissCtaText) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(dismissCtaText, "dismissCtaText");
        return new AlternativeProductsDisclaimer(title, subtitle, dismissCtaText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativeProductsDisclaimer)) {
            return false;
        }
        AlternativeProductsDisclaimer alternativeProductsDisclaimer = (AlternativeProductsDisclaimer) other;
        return Intrinsics.c(this.title, alternativeProductsDisclaimer.title) && Intrinsics.c(this.subtitle, alternativeProductsDisclaimer.subtitle) && Intrinsics.c(this.dismissCtaText, alternativeProductsDisclaimer.dismissCtaText);
    }

    @NotNull
    public final String getDismissCtaText() {
        return this.dismissCtaText;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.dismissCtaText.hashCode() + b.c(this.title.hashCode() * 31, 31, this.subtitle);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return a.o(a.v("AlternativeProductsDisclaimer(title=", str, ", subtitle=", str2, ", dismissCtaText="), this.dismissCtaText, ")");
    }
}
