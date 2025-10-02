package au.com.woolworths.base.shopapp.modules.iconwithtext;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/iconwithtext/IconListItemApiData;", "", "", "iconUrl", "title", lqlqqlq.mmm006Dm006Dm, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "a", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IconListItemApiData {

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("iconUrl")
    @NotNull
    private final String iconUrl;

    @SerializedName("title")
    @NotNull
    private final String title;

    public IconListItemApiData(@NotNull String iconUrl, @NotNull String title, @NotNull String description) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        this.iconUrl = iconUrl;
        this.title = title;
        this.description = description;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconListItemApiData)) {
            return false;
        }
        IconListItemApiData iconListItemApiData = (IconListItemApiData) obj;
        return Intrinsics.c(this.iconUrl, iconListItemApiData.iconUrl) && Intrinsics.c(this.title, iconListItemApiData.title) && Intrinsics.c(this.description, iconListItemApiData.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + b.c(this.iconUrl.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        return a.o(a.v("IconListItemApiData(iconUrl=", str, ", title=", str2, ", description="), this.description, ")");
    }
}
