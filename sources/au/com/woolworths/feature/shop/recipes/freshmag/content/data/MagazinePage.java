package au.com.woolworths.feature.shop.recipes.freshmag.content.data;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/MagazinePage;", "", "link", "", "width", "", "height", "map", "", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/MagazineMapItem;", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "getLink", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "getMap", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MagazinePage {
    public static final int $stable = 8;

    @SerializedName("height")
    private final int height;

    @SerializedName("pageLink")
    @NotNull
    private final String link;

    @SerializedName("map")
    @Nullable
    private final List<MagazineMapItem> map;

    @SerializedName("width")
    private final int width;

    public MagazinePage(@NotNull String link, int i, int i2, @Nullable List<MagazineMapItem> list) {
        Intrinsics.h(link, "link");
        this.link = link;
        this.width = i;
        this.height = i2;
        this.map = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MagazinePage copy$default(MagazinePage magazinePage, String str, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = magazinePage.link;
        }
        if ((i3 & 2) != 0) {
            i = magazinePage.width;
        }
        if ((i3 & 4) != 0) {
            i2 = magazinePage.height;
        }
        if ((i3 & 8) != 0) {
            list = magazinePage.map;
        }
        return magazinePage.copy(str, i, i2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final List<MagazineMapItem> component4() {
        return this.map;
    }

    @NotNull
    public final MagazinePage copy(@NotNull String link, int width, int height, @Nullable List<MagazineMapItem> map) {
        Intrinsics.h(link, "link");
        return new MagazinePage(link, width, height, map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagazinePage)) {
            return false;
        }
        MagazinePage magazinePage = (MagazinePage) other;
        return Intrinsics.c(this.link, magazinePage.link) && this.width == magazinePage.width && this.height == magazinePage.height && Intrinsics.c(this.map, magazinePage.map);
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final List<MagazineMapItem> getMap() {
        return this.map;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iA = b.a(this.height, b.a(this.width, this.link.hashCode() * 31, 31), 31);
        List<MagazineMapItem> list = this.map;
        return iA + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.link;
        int i = this.width;
        int i2 = this.height;
        List<MagazineMapItem> list = this.map;
        StringBuilder sbU = b.u("MagazinePage(link=", i, str, ", width=", ", height=");
        sbU.append(i2);
        sbU.append(", map=");
        sbU.append(list);
        sbU.append(")");
        return sbU.toString();
    }
}
