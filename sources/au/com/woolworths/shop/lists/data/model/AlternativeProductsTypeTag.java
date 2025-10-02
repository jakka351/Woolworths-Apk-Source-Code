package au.com.woolworths.shop.lists.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsTypeTag;", "", "swapType", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsType;", TextBundle.TEXT_ENTRY, "", "<init>", "(Lau/com/woolworths/shop/lists/data/model/AlternativeProductsType;Ljava/lang/String;)V", "getSwapType", "()Lau/com/woolworths/shop/lists/data/model/AlternativeProductsType;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsTypeTag {

    @NotNull
    private final AlternativeProductsType swapType;

    @NotNull
    private final String text;

    public AlternativeProductsTypeTag(@NotNull AlternativeProductsType swapType, @NotNull String text) {
        Intrinsics.h(swapType, "swapType");
        Intrinsics.h(text, "text");
        this.swapType = swapType;
        this.text = text;
    }

    public static /* synthetic */ AlternativeProductsTypeTag copy$default(AlternativeProductsTypeTag alternativeProductsTypeTag, AlternativeProductsType alternativeProductsType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            alternativeProductsType = alternativeProductsTypeTag.swapType;
        }
        if ((i & 2) != 0) {
            str = alternativeProductsTypeTag.text;
        }
        return alternativeProductsTypeTag.copy(alternativeProductsType, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AlternativeProductsType getSwapType() {
        return this.swapType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final AlternativeProductsTypeTag copy(@NotNull AlternativeProductsType swapType, @NotNull String text) {
        Intrinsics.h(swapType, "swapType");
        Intrinsics.h(text, "text");
        return new AlternativeProductsTypeTag(swapType, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativeProductsTypeTag)) {
            return false;
        }
        AlternativeProductsTypeTag alternativeProductsTypeTag = (AlternativeProductsTypeTag) other;
        return this.swapType == alternativeProductsTypeTag.swapType && Intrinsics.c(this.text, alternativeProductsTypeTag.text);
    }

    @NotNull
    public final AlternativeProductsType getSwapType() {
        return this.swapType;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.swapType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AlternativeProductsTypeTag(swapType=" + this.swapType + ", text=" + this.text + ")";
    }
}
