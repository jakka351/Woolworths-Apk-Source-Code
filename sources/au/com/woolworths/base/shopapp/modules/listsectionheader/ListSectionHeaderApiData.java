package au.com.woolworths.base.shopapp.modules.listsectionheader;

import androidx.camera.core.impl.b;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/listsectionheader/ListSectionHeaderApiData;", "", "Lau/com/woolworths/base/shopapp/modules/listsectionheader/ListSectionHeaderTypeApiData;", "type", "", TextBundle.TEXT_ENTRY, "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "button", "<init>", "(Lau/com/woolworths/base/shopapp/modules/listsectionheader/ListSectionHeaderTypeApiData;Ljava/lang/String;Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;)V", "Lau/com/woolworths/base/shopapp/modules/listsectionheader/ListSectionHeaderTypeApiData;", "b", "()Lau/com/woolworths/base/shopapp/modules/listsectionheader/ListSectionHeaderTypeApiData;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "getButton", "()Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ListSectionHeaderApiData {

    @SerializedName("listSectionHeaderButton")
    @MappedName
    @Nullable
    private final ButtonApiData button;

    @SerializedName("listSectionHeaderText")
    @MappedName
    @NotNull
    private final String text;

    @SerializedName("listSectionHeaderType")
    @MappedName
    @NotNull
    private final ListSectionHeaderTypeApiData type;

    public ListSectionHeaderApiData(@NotNull ListSectionHeaderTypeApiData type, @NotNull String text, @Nullable ButtonApiData buttonApiData) {
        Intrinsics.h(type, "type");
        Intrinsics.h(text, "text");
        this.type = type;
        this.text = text;
        this.button = buttonApiData;
    }

    /* renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: b, reason: from getter */
    public final ListSectionHeaderTypeApiData getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListSectionHeaderApiData)) {
            return false;
        }
        ListSectionHeaderApiData listSectionHeaderApiData = (ListSectionHeaderApiData) obj;
        return this.type == listSectionHeaderApiData.type && Intrinsics.c(this.text, listSectionHeaderApiData.text) && Intrinsics.c(this.button, listSectionHeaderApiData.button);
    }

    public final int hashCode() {
        int iC = b.c(this.type.hashCode() * 31, 31, this.text);
        ButtonApiData buttonApiData = this.button;
        return iC + (buttonApiData == null ? 0 : buttonApiData.hashCode());
    }

    public final String toString() {
        return "ListSectionHeaderApiData(type=" + this.type + ", text=" + this.text + ", button=" + this.button + ")";
    }
}
