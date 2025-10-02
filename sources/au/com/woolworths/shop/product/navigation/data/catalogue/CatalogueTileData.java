package au.com.woolworths.shop.product.navigation.data.catalogue;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/product/navigation/data/catalogue/CatalogueTileData;", "", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageBackground", "imageLeft", "imageRight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImageBackground", "getImageLeft", "getImageRight", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CatalogueTileData {

    @SerializedName("imageBackground")
    @Nullable
    private final String imageBackground;

    @SerializedName("imageLeft")
    @Nullable
    private final String imageLeft;

    @SerializedName("imageRight")
    @Nullable
    private final String imageRight;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @NotNull
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    public CatalogueTileData(@NotNull String title, @NotNull String subtitle, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.imageBackground = str;
        this.imageLeft = str2;
        this.imageRight = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueTileData)) {
            return false;
        }
        CatalogueTileData catalogueTileData = (CatalogueTileData) obj;
        return Intrinsics.c(this.title, catalogueTileData.title) && Intrinsics.c(this.subtitle, catalogueTileData.subtitle) && Intrinsics.c(this.imageBackground, catalogueTileData.imageBackground) && Intrinsics.c(this.imageLeft, catalogueTileData.imageLeft) && Intrinsics.c(this.imageRight, catalogueTileData.imageRight);
    }

    public final int hashCode() {
        int iC = b.c(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.imageBackground;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageLeft;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageRight;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.imageBackground;
        String str4 = this.imageLeft;
        String str5 = this.imageRight;
        StringBuilder sbV = a.v("CatalogueTileData(title=", str, ", subtitle=", str2, ", imageBackground=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", imageLeft=", str4, ", imageRight=");
        return a.o(sbV, str5, ")");
    }

    public /* synthetic */ CatalogueTileData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
