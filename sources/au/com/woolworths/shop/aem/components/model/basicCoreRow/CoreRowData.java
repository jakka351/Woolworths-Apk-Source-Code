package au.com.woolworths.shop.aem.components.model.basicCoreRow;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.sdui.common.IconAsset;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/basicCoreRow/CoreRowData;", "", "Lau/com/woolworths/sdui/common/IconAsset;", "leadingAsset", "", lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL, "<init>", "(Lau/com/woolworths/sdui/common/IconAsset;Ljava/lang/String;Ljava/lang/String;)V", "Lau/com/woolworths/sdui/common/IconAsset;", "c", "()Lau/com/woolworths/sdui/common/IconAsset;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreRowData {

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @MappedName
    @Nullable
    private final String description;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @MappedName
    @NotNull
    private final String label;

    @SerializedName("leadingAsset")
    @MappedName
    @Nullable
    private final IconAsset leadingAsset;

    public CoreRowData(@Nullable IconAsset iconAsset, @Nullable String str, @NotNull String label) {
        Intrinsics.h(label, "label");
        this.leadingAsset = iconAsset;
        this.description = str;
        this.label = label;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: c, reason: from getter */
    public final IconAsset getLeadingAsset() {
        return this.leadingAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreRowData)) {
            return false;
        }
        CoreRowData coreRowData = (CoreRowData) obj;
        return Intrinsics.c(this.leadingAsset, coreRowData.leadingAsset) && Intrinsics.c(this.description, coreRowData.description) && Intrinsics.c(this.label, coreRowData.label);
    }

    public final int hashCode() {
        IconAsset iconAsset = this.leadingAsset;
        int iHashCode = (iconAsset == null ? 0 : iconAsset.hashCode()) * 31;
        String str = this.description;
        return this.label.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        IconAsset iconAsset = this.leadingAsset;
        String str = this.description;
        String str2 = this.label;
        StringBuilder sb = new StringBuilder("CoreRowData(leadingAsset=");
        sb.append(iconAsset);
        sb.append(", description=");
        sb.append(str);
        sb.append(", label=");
        return a.o(sb, str2, ")");
    }
}
