package au.com.woolworths.feature.shop.recipes.freshmag.content.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/MagazineDetail;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "items", "", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/MagazinePageWrapper;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MagazineDetail {
    public static final int $stable = 8;

    @SerializedName("items")
    @NotNull
    private final List<MagazinePageWrapper> items;

    @SerializedName("saleName")
    @NotNull
    private final String name;

    public MagazineDetail(@NotNull String name, @NotNull List<MagazinePageWrapper> items) {
        Intrinsics.h(name, "name");
        Intrinsics.h(items, "items");
        this.name = name;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MagazineDetail copy$default(MagazineDetail magazineDetail, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = magazineDetail.name;
        }
        if ((i & 2) != 0) {
            list = magazineDetail.items;
        }
        return magazineDetail.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<MagazinePageWrapper> component2() {
        return this.items;
    }

    @NotNull
    public final MagazineDetail copy(@NotNull String name, @NotNull List<MagazinePageWrapper> items) {
        Intrinsics.h(name, "name");
        Intrinsics.h(items, "items");
        return new MagazineDetail(name, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagazineDetail)) {
            return false;
        }
        MagazineDetail magazineDetail = (MagazineDetail) other;
        return Intrinsics.c(this.name, magazineDetail.name) && Intrinsics.c(this.items, magazineDetail.items);
    }

    @NotNull
    public final List<MagazinePageWrapper> getItems() {
        return this.items;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.i("MagazineDetail(name=", this.name, ", items=", ")", this.items);
    }
}
