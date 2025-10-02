package au.com.woolworths.android.onesite.models.login;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lau/com/woolworths/android/onesite/models/login/SignUpData;", "", "firstName", "", "lastName", Scopes.EMAIL, "password", "mobilePhone", "dateOfBirth", "edrNumber", "notifyBySms", "", "notifyByEmail", "agreeTncs", "isBusiness", "businessDetails", "Lau/com/woolworths/android/onesite/models/login/BusinessDetails;", "store", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLau/com/woolworths/android/onesite/models/login/BusinessDetails;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getEmail", "getPassword", "getMobilePhone", "getDateOfBirth", "getEdrNumber", "getNotifyBySms", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotifyByEmail", "getAgreeTncs", "()Z", "getBusinessDetails", "()Lau/com/woolworths/android/onesite/models/login/BusinessDetails;", "getStore", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SignUpData {

    @SerializedName("agreetotsandcs")
    private final boolean agreeTncs;

    @SerializedName("businessdetails")
    @Nullable
    private final BusinessDetails businessDetails;

    @SerializedName("dateofbirth")
    @Nullable
    private final String dateOfBirth;

    @SerializedName("edrnumber")
    @Nullable
    private final String edrNumber;

    @SerializedName("emailaddress")
    @Nullable
    private final String email;

    @SerializedName("firstname")
    @Nullable
    private final String firstName;

    @SerializedName("isbusinessshopper")
    private final boolean isBusiness;

    @SerializedName("lastname")
    @Nullable
    private final String lastName;

    @SerializedName("mobilephone")
    @Nullable
    private final String mobilePhone;

    @SerializedName("emailproductsandservices")
    @Nullable
    private final Boolean notifyByEmail;

    @SerializedName("smsproductsservicesandpromotions")
    @Nullable
    private final Boolean notifyBySms;

    @SerializedName("password")
    @Nullable
    private final String password;

    @SerializedName("store")
    @Nullable
    private final String store;

    public SignUpData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z, boolean z2, @Nullable BusinessDetails businessDetails, @Nullable String str8) {
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.password = str4;
        this.mobilePhone = str5;
        this.dateOfBirth = str6;
        this.edrNumber = str7;
        this.notifyBySms = bool;
        this.notifyByEmail = bool2;
        this.agreeTncs = z;
        this.isBusiness = z2;
        this.businessDetails = businessDetails;
        this.store = str8;
    }

    public final boolean getAgreeTncs() {
        return this.agreeTncs;
    }

    @Nullable
    public final BusinessDetails getBusinessDetails() {
        return this.businessDetails;
    }

    @Nullable
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    public final String getEdrNumber() {
        return this.edrNumber;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    @Nullable
    public final Boolean getNotifyByEmail() {
        return this.notifyByEmail;
    }

    @Nullable
    public final Boolean getNotifyBySms() {
        return this.notifyBySms;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getStore() {
        return this.store;
    }

    /* renamed from: isBusiness, reason: from getter */
    public final boolean getIsBusiness() {
        return this.isBusiness;
    }

    public /* synthetic */ SignUpData(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, boolean z, boolean z2, BusinessDetails businessDetails, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : businessDetails, (i & 4096) != 0 ? null : str8);
    }
}
