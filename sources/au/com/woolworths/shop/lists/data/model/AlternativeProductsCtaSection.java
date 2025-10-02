package au.com.woolworths.shop.lists.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsCtaSection;", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsSection;", TextBundle.TEXT_ENTRY, "", UrlHandler.ACTION, "actionTerm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "getActionTerm", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsCtaSection implements AlternativeProductsSection {

    @NotNull
    private final String action;

    @Nullable
    private final String actionTerm;

    @NotNull
    private final String text;

    public AlternativeProductsCtaSection(@NotNull String text, @NotNull String action, @Nullable String str) {
        Intrinsics.h(text, "text");
        Intrinsics.h(action, "action");
        this.text = text;
        this.action = action;
        this.actionTerm = str;
    }

    public static /* synthetic */ AlternativeProductsCtaSection copy$default(AlternativeProductsCtaSection alternativeProductsCtaSection, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alternativeProductsCtaSection.text;
        }
        if ((i & 2) != 0) {
            str2 = alternativeProductsCtaSection.action;
        }
        if ((i & 4) != 0) {
            str3 = alternativeProductsCtaSection.actionTerm;
        }
        return alternativeProductsCtaSection.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getActionTerm() {
        return this.actionTerm;
    }

    @NotNull
    public final AlternativeProductsCtaSection copy(@NotNull String text, @NotNull String action, @Nullable String actionTerm) {
        Intrinsics.h(text, "text");
        Intrinsics.h(action, "action");
        return new AlternativeProductsCtaSection(text, action, actionTerm);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativeProductsCtaSection)) {
            return false;
        }
        AlternativeProductsCtaSection alternativeProductsCtaSection = (AlternativeProductsCtaSection) other;
        return Intrinsics.c(this.text, alternativeProductsCtaSection.text) && Intrinsics.c(this.action, alternativeProductsCtaSection.action) && Intrinsics.c(this.actionTerm, alternativeProductsCtaSection.actionTerm);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getActionTerm() {
        return this.actionTerm;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iC = b.c(this.text.hashCode() * 31, 31, this.action);
        String str = this.actionTerm;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.action;
        return a.o(a.v("AlternativeProductsCtaSection(text=", str, ", action=", str2, ", actionTerm="), this.actionTerm, ")");
    }
}
