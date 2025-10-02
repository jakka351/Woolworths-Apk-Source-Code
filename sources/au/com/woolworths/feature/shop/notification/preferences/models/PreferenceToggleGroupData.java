package au.com.woolworths.feature.shop.notification.preferences.models;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceToggleGroupData;", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceItem;", "", "groupTitle", lqlqqlq.mmm006Dm006Dm, "", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceToggleData;", "toggles", "footer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceToggleGroupData implements PreferenceItem {

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @Nullable
    private final String description;

    @SerializedName("footer")
    @Nullable
    private final String footer;

    @SerializedName("groupTitle")
    @Nullable
    private final String groupTitle;

    @SerializedName("toggles")
    @NotNull
    private final List<PreferenceToggleData> toggles;

    public PreferenceToggleGroupData(@Nullable String str, @Nullable String str2, @NotNull List<PreferenceToggleData> toggles, @Nullable String str3) {
        Intrinsics.h(toggles, "toggles");
        this.groupTitle = str;
        this.description = str2;
        this.toggles = toggles;
        this.footer = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* renamed from: c, reason: from getter */
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    /* renamed from: d, reason: from getter */
    public final List getToggles() {
        return this.toggles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceToggleGroupData)) {
            return false;
        }
        PreferenceToggleGroupData preferenceToggleGroupData = (PreferenceToggleGroupData) obj;
        return Intrinsics.c(this.groupTitle, preferenceToggleGroupData.groupTitle) && Intrinsics.c(this.description, preferenceToggleGroupData.description) && Intrinsics.c(this.toggles, preferenceToggleGroupData.toggles) && Intrinsics.c(this.footer, preferenceToggleGroupData.footer);
    }

    public final int hashCode() {
        String str = this.groupTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iD = b.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.toggles);
        String str3 = this.footer;
        return iD + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.groupTitle;
        String str2 = this.description;
        List<PreferenceToggleData> list = this.toggles;
        String str3 = this.footer;
        StringBuilder sbV = a.v("PreferenceToggleGroupData(groupTitle=", str, ", description=", str2, ", toggles=");
        sbV.append(list);
        sbV.append(", footer=");
        sbV.append(str3);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ PreferenceToggleGroupData(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : str3);
    }
}
