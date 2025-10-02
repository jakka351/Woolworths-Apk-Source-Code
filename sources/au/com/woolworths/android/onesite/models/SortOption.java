package au.com.woolworths.android.onesite.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\tR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\t¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/android/onesite/models/SortOption;", "Landroid/os/Parcelable;", "<init>", "()V", "input", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "sorturl", "", "(Ljava/lang/String;)V", "params", "Lau/com/woolworths/android/onesite/models/SortOption$Params;", "getParams", "()Lau/com/woolworths/android/onesite/models/SortOption$Params;", "setParams", "(Lau/com/woolworths/android/onesite/models/SortOption$Params;)V", lqlqqlq.mmm006Dm006Dm, "getDescription", "()Ljava/lang/String;", "setDescription", "getSorturl", "setSorturl", "describeContents", "", "writeToParcel", "", "parcel", "i", "Params", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SortOption implements Parcelable {

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @Nullable
    private String description;

    @SerializedName("params")
    @Nullable
    private Params params;

    @SerializedName("sorturl")
    @Nullable
    private String sorturl;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<SortOption> CREATOR = new Parcelable.Creator<SortOption>() { // from class: au.com.woolworths.android.onesite.models.SortOption$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SortOption createFromParcel(Parcel in) {
            Intrinsics.h(in, "in");
            return new SortOption(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SortOption[] newArray(int size) {
            return new SortOption[size];
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/android/onesite/models/SortOption$Params;", "", "<init>", "()V", "sort", "", "getSort", "()Ljava/lang/String;", "setSort", "(Ljava/lang/String;)V", "isReversed", "", "()Z", "setReversed", "(Z)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Params {

        @SerializedName("reversed")
        private boolean isReversed;

        @SerializedName("sort")
        @Nullable
        private String sort;

        @Nullable
        public final String getSort() {
            return this.sort;
        }

        /* renamed from: isReversed, reason: from getter */
        public final boolean getIsReversed() {
            return this.isReversed;
        }

        public final void setReversed(boolean z) {
            this.isReversed = z;
        }

        public final void setSort(@Nullable String str) {
            this.sort = str;
        }
    }

    public SortOption() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Params getParams() {
        return this.params;
    }

    @Nullable
    public final String getSorturl() {
        return this.sorturl;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setParams(@Nullable Params params) {
        this.params = params;
    }

    public final void setSorturl(@Nullable String str) {
        this.sorturl = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.h(parcel, "parcel");
        parcel.writeString(this.description);
        parcel.writeString(this.sorturl);
    }

    public SortOption(@NotNull Parcel input) {
        Intrinsics.h(input, "input");
        this.description = input.readString();
        this.sorturl = input.readString();
    }

    public SortOption(@Nullable String str) {
        this.sorturl = str;
    }
}
