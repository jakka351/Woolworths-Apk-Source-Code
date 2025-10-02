package au.com.woolworths.shop.aem.components.model.title;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/title/TitleSectionData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "", "id", "Lau/com/woolworths/shop/aem/components/model/title/TitleSectionType;", "type", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/aem/components/model/title/TitleSectionType;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lau/com/woolworths/shop/aem/components/model/title/TitleSectionType;", "b", "()Lau/com/woolworths/shop/aem/components/model/title/TitleSectionType;", "a", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TitleSectionData implements GenericPageFeedItem {

    @SerializedName("titleSectionId")
    @MappedName
    @Nullable
    private final String id;

    @SerializedName("titleSectionText")
    @MappedName
    @NotNull
    private final String text;

    @SerializedName("titleSectionType")
    @MappedName
    @NotNull
    private final TitleSectionType type;

    public TitleSectionData(@Nullable String str, @NotNull TitleSectionType type, @NotNull String text) {
        Intrinsics.h(type, "type");
        Intrinsics.h(text, "text");
        this.id = str;
        this.type = type;
        this.text = text;
    }

    /* renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: b, reason: from getter */
    public final TitleSectionType getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleSectionData)) {
            return false;
        }
        TitleSectionData titleSectionData = (TitleSectionData) obj;
        return Intrinsics.c(this.id, titleSectionData.id) && this.type == titleSectionData.type && Intrinsics.c(this.text, titleSectionData.text);
    }

    public final int hashCode() {
        String str = this.id;
        return this.text.hashCode() + ((this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        String str = this.id;
        TitleSectionType titleSectionType = this.type;
        String str2 = this.text;
        StringBuilder sb = new StringBuilder("TitleSectionData(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(titleSectionType);
        sb.append(", text=");
        return a.o(sb, str2, ")");
    }

    public /* synthetic */ TitleSectionData(String str, TitleSectionType titleSectionType, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, titleSectionType, str2);
    }
}
