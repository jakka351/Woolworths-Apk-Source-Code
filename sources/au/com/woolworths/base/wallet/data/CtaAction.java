package au.com.woolworths.base.wallet.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/wallet/data/CtaAction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "WEB_LINK", "DEEP_LINK", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CtaAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CtaAction> CREATOR;

    @SerializedName("DEEP_LINK")
    public static final CtaAction DEEP_LINK;

    @SerializedName("WEB_LINK")
    public static final CtaAction WEB_LINK;
    public static final /* synthetic */ CtaAction[] d;
    public static final /* synthetic */ EnumEntries e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CtaAction> {
        @Override // android.os.Parcelable.Creator
        public final CtaAction createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return CtaAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CtaAction[] newArray(int i) {
            return new CtaAction[i];
        }
    }

    static {
        CtaAction ctaAction = new CtaAction("WEB_LINK", 0);
        WEB_LINK = ctaAction;
        CtaAction ctaAction2 = new CtaAction("DEEP_LINK", 1);
        DEEP_LINK = ctaAction2;
        CtaAction[] ctaActionArr = {ctaAction, ctaAction2, new CtaAction("UNKNOWN", 2)};
        d = ctaActionArr;
        e = EnumEntriesKt.a(ctaActionArr);
        CREATOR = new Creator();
    }

    private CtaAction(String str, int i) {
    }

    public static CtaAction valueOf(String str) {
        return (CtaAction) Enum.valueOf(CtaAction.class, str);
    }

    public static CtaAction[] values() {
        return (CtaAction[]) d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
