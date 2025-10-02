package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\""}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsAccountProfileData;", "", "firstName", "", "lastName", "gender", "birthDate", "title", "preferredName", "isEmployee", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getGender", "getBirthDate", "getTitle", "getPreferredName", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsAccountProfileData {
    public static final int $stable = 0;

    @SerializedName("birthDate")
    @NotNull
    private final String birthDate;

    @SerializedName("firstName")
    @NotNull
    private final String firstName;

    @SerializedName("gender")
    @NotNull
    private final String gender;

    @SerializedName("isEmployee")
    private final boolean isEmployee;

    @SerializedName("lastName")
    @NotNull
    private final String lastName;

    @SerializedName("preferredName")
    @NotNull
    private final String preferredName;

    @SerializedName("title")
    @NotNull
    private final String title;

    public RewardsAccountProfileData(@NotNull String firstName, @NotNull String lastName, @NotNull String gender, @NotNull String birthDate, @NotNull String title, @NotNull String preferredName, boolean z) {
        Intrinsics.h(firstName, "firstName");
        Intrinsics.h(lastName, "lastName");
        Intrinsics.h(gender, "gender");
        Intrinsics.h(birthDate, "birthDate");
        Intrinsics.h(title, "title");
        Intrinsics.h(preferredName, "preferredName");
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.title = title;
        this.preferredName = preferredName;
        this.isEmployee = z;
    }

    public static /* synthetic */ RewardsAccountProfileData copy$default(RewardsAccountProfileData rewardsAccountProfileData, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsAccountProfileData.firstName;
        }
        if ((i & 2) != 0) {
            str2 = rewardsAccountProfileData.lastName;
        }
        if ((i & 4) != 0) {
            str3 = rewardsAccountProfileData.gender;
        }
        if ((i & 8) != 0) {
            str4 = rewardsAccountProfileData.birthDate;
        }
        if ((i & 16) != 0) {
            str5 = rewardsAccountProfileData.title;
        }
        if ((i & 32) != 0) {
            str6 = rewardsAccountProfileData.preferredName;
        }
        if ((i & 64) != 0) {
            z = rewardsAccountProfileData.isEmployee;
        }
        String str7 = str6;
        boolean z2 = z;
        String str8 = str5;
        String str9 = str3;
        return rewardsAccountProfileData.copy(str, str2, str9, str4, str8, str7, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPreferredName() {
        return this.preferredName;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsEmployee() {
        return this.isEmployee;
    }

    @NotNull
    public final RewardsAccountProfileData copy(@NotNull String firstName, @NotNull String lastName, @NotNull String gender, @NotNull String birthDate, @NotNull String title, @NotNull String preferredName, boolean isEmployee) {
        Intrinsics.h(firstName, "firstName");
        Intrinsics.h(lastName, "lastName");
        Intrinsics.h(gender, "gender");
        Intrinsics.h(birthDate, "birthDate");
        Intrinsics.h(title, "title");
        Intrinsics.h(preferredName, "preferredName");
        return new RewardsAccountProfileData(firstName, lastName, gender, birthDate, title, preferredName, isEmployee);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsAccountProfileData)) {
            return false;
        }
        RewardsAccountProfileData rewardsAccountProfileData = (RewardsAccountProfileData) other;
        return Intrinsics.c(this.firstName, rewardsAccountProfileData.firstName) && Intrinsics.c(this.lastName, rewardsAccountProfileData.lastName) && Intrinsics.c(this.gender, rewardsAccountProfileData.gender) && Intrinsics.c(this.birthDate, rewardsAccountProfileData.birthDate) && Intrinsics.c(this.title, rewardsAccountProfileData.title) && Intrinsics.c(this.preferredName, rewardsAccountProfileData.preferredName) && this.isEmployee == rewardsAccountProfileData.isEmployee;
    }

    @NotNull
    public final String getBirthDate() {
        return this.birthDate;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getPreferredName() {
        return this.preferredName;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEmployee) + b.c(b.c(b.c(b.c(b.c(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.gender), 31, this.birthDate), 31, this.title), 31, this.preferredName);
    }

    public final boolean isEmployee() {
        return this.isEmployee;
    }

    @NotNull
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.gender;
        String str4 = this.birthDate;
        String str5 = this.title;
        String str6 = this.preferredName;
        boolean z = this.isEmployee;
        StringBuilder sbV = a.v("RewardsAccountProfileData(firstName=", str, ", lastName=", str2, ", gender=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", birthDate=", str4, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", preferredName=", str6, ", isEmployee=");
        return a.k(")", sbV, z);
    }
}
