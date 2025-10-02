package au.com.woolworths.shop.lists.data.model;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsNoResultSection;", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsSection;", TextBundle.TEXT_ENTRY, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsNoResultSection implements AlternativeProductsSection {

    @NotNull
    private final String text;

    public AlternativeProductsNoResultSection(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.text = text;
    }

    public static /* synthetic */ AlternativeProductsNoResultSection copy$default(AlternativeProductsNoResultSection alternativeProductsNoResultSection, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alternativeProductsNoResultSection.text;
        }
        return alternativeProductsNoResultSection.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final AlternativeProductsNoResultSection copy(@NotNull String text) {
        Intrinsics.h(text, "text");
        return new AlternativeProductsNoResultSection(text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AlternativeProductsNoResultSection) && Intrinsics.c(this.text, ((AlternativeProductsNoResultSection) other).text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("AlternativeProductsNoResultSection(text=", this.text, ")");
    }
}
