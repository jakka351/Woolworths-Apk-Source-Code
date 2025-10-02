package au.com.woolworths.feature.shop.catalogue.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/models/CataloguePage;", "", "pageImageLink", "", "pageImageWidth", "", "pageImageHeight", "pageItems", "", "Lau/com/woolworths/feature/shop/catalogue/models/CataloguePageItem;", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "getPageImageLink", "()Ljava/lang/String;", "getPageImageWidth", "()I", "getPageImageHeight", "getPageItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CataloguePage {
    public static final int $stable = 8;

    @SerializedName("height")
    private final int pageImageHeight;

    @SerializedName("pageLink")
    @NotNull
    private final String pageImageLink;

    @SerializedName("width")
    private final int pageImageWidth;

    @SerializedName("map")
    @Nullable
    private final List<CataloguePageItem> pageItems;

    public CataloguePage(@NotNull String pageImageLink, int i, int i2, @Nullable List<CataloguePageItem> list) {
        Intrinsics.h(pageImageLink, "pageImageLink");
        this.pageImageLink = pageImageLink;
        this.pageImageWidth = i;
        this.pageImageHeight = i2;
        this.pageItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CataloguePage copy$default(CataloguePage cataloguePage, String str, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cataloguePage.pageImageLink;
        }
        if ((i3 & 2) != 0) {
            i = cataloguePage.pageImageWidth;
        }
        if ((i3 & 4) != 0) {
            i2 = cataloguePage.pageImageHeight;
        }
        if ((i3 & 8) != 0) {
            list = cataloguePage.pageItems;
        }
        return cataloguePage.copy(str, i, i2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPageImageLink() {
        return this.pageImageLink;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPageImageWidth() {
        return this.pageImageWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPageImageHeight() {
        return this.pageImageHeight;
    }

    @Nullable
    public final List<CataloguePageItem> component4() {
        return this.pageItems;
    }

    @NotNull
    public final CataloguePage copy(@NotNull String pageImageLink, int pageImageWidth, int pageImageHeight, @Nullable List<CataloguePageItem> pageItems) {
        Intrinsics.h(pageImageLink, "pageImageLink");
        return new CataloguePage(pageImageLink, pageImageWidth, pageImageHeight, pageItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CataloguePage)) {
            return false;
        }
        CataloguePage cataloguePage = (CataloguePage) other;
        return Intrinsics.c(this.pageImageLink, cataloguePage.pageImageLink) && this.pageImageWidth == cataloguePage.pageImageWidth && this.pageImageHeight == cataloguePage.pageImageHeight && Intrinsics.c(this.pageItems, cataloguePage.pageItems);
    }

    public final int getPageImageHeight() {
        return this.pageImageHeight;
    }

    @NotNull
    public final String getPageImageLink() {
        return this.pageImageLink;
    }

    public final int getPageImageWidth() {
        return this.pageImageWidth;
    }

    @Nullable
    public final List<CataloguePageItem> getPageItems() {
        return this.pageItems;
    }

    public int hashCode() {
        int iA = b.a(this.pageImageHeight, b.a(this.pageImageWidth, this.pageImageLink.hashCode() * 31, 31), 31);
        List<CataloguePageItem> list = this.pageItems;
        return iA + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.pageImageLink;
        int i = this.pageImageWidth;
        int i2 = this.pageImageHeight;
        List<CataloguePageItem> list = this.pageItems;
        StringBuilder sbU = b.u("CataloguePage(pageImageLink=", i, str, ", pageImageWidth=", ", pageImageHeight=");
        sbU.append(i2);
        sbU.append(", pageItems=");
        sbU.append(list);
        sbU.append(")");
        return sbU.toString();
    }
}
