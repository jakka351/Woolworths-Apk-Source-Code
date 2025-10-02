package au.com.woolworths.sdui.common.alert.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/sdui/common/alert/model/CoreInsetAlertModel;", "", "", "title", lqlqqlq.mmm006Dm006Dm, "Lau/com/woolworths/sdui/common/alert/model/CoreAlertStyle;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/sdui/common/alert/model/CoreAlertStyle;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "Lau/com/woolworths/sdui/common/alert/model/CoreAlertStyle;", "b", "()Lau/com/woolworths/sdui/common/alert/model/CoreAlertStyle;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreInsetAlertModel {

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @Nullable
    private final String description;

    @SerializedName("style")
    @NotNull
    private final CoreAlertStyle style;

    @SerializedName("title")
    @Nullable
    private final String title;

    public CoreInsetAlertModel(@Nullable String str, @Nullable String str2, @NotNull CoreAlertStyle style) {
        Intrinsics.h(style, "style");
        this.title = str;
        this.description = str2;
        this.style = style;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final CoreAlertStyle getStyle() {
        return this.style;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreInsetAlertModel)) {
            return false;
        }
        CoreInsetAlertModel coreInsetAlertModel = (CoreInsetAlertModel) obj;
        return Intrinsics.c(this.title, coreInsetAlertModel.title) && Intrinsics.c(this.description, coreInsetAlertModel.description) && this.style == coreInsetAlertModel.style;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return this.style.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        CoreAlertStyle coreAlertStyle = this.style;
        StringBuilder sbV = a.v("CoreInsetAlertModel(title=", str, ", description=", str2, ", style=");
        sbV.append(coreAlertStyle);
        sbV.append(")");
        return sbV.toString();
    }
}
