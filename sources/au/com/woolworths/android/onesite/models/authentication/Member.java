package au.com.woolworths.android.onesite.models.authentication;

import au.com.woolworths.android.onesite.utils.Strings;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Member implements Serializable {
    public static final String GUEST_USER = "guest";

    @SerializedName("mAccessToken")
    private String mAccessToken;

    @SerializedName("mDateOfBirth")
    private String mDateOfBirth;

    @SerializedName("mExpirySinceEpoch")
    private long mExpirySinceEpoch;

    @SerializedName("mFulfilmentHref")
    private String mFulfilmentHref;

    @SerializedName("mFulfilmentStoreId")
    private String mFulfilmentStoreId;

    @SerializedName("mGuestUser")
    private boolean mGuestUser;

    @SerializedName("mMarketOrderCount")
    private int mMarketOrderCount;

    @SerializedName("mOrderCount")
    private int mOrderCount;

    @SerializedName("mPaymentHref")
    private String mPaymentHref;

    @SerializedName("mRefreshToken")
    private String mRefreshToken;

    @SerializedName("mShopperId")
    private String mShopperId;

    @SerializedName("mTrolleyHref")
    private String mTrolleyHref;

    @SerializedName("mUserName")
    private String mUserName;

    public static synchronized Member getMemberFromLoginResult(LoginResult loginResult) {
        Member member;
        try {
            member = new Member();
            if (Strings.b(loginResult.firstname) && Strings.b(loginResult.lastname)) {
                member.setGuestUser(true);
                member.setUserName(GUEST_USER);
            } else {
                member.setGuestUser(false);
                member.setUserName(loginResult.firstname);
            }
            member.setDateOfBirth(loginResult.dateofbirth);
            member.setAccessToken(loginResult.access_token);
            member.setRefreshToken(loginResult.refresh_token);
            member.setExpirySinceEpoch(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(Long.parseLong(loginResult.expires_in)));
            member.setTrolleyHref(loginResult.trolleyhref);
            member.setFulfilmentHref(loginResult.fulfilmenthref);
            member.setPaymentHref(loginResult.paymenthref);
            member.setShopperId(loginResult.shopperid);
            member.setFulfilmentStoreId(loginResult.fulfilmentstoreid);
        } catch (Throwable th) {
            throw th;
        }
        return member;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public String getDateOfBirth() {
        return this.mDateOfBirth;
    }

    public long getExpirySinceEpoch() {
        return this.mExpirySinceEpoch;
    }

    public String getFulfilmentStoreId() {
        return this.mFulfilmentStoreId;
    }

    public String getFulfilmentUrl() {
        return this.mFulfilmentHref;
    }

    public int getMarketOrderCount() {
        return this.mMarketOrderCount;
    }

    public int getOrderCount() {
        return this.mOrderCount;
    }

    public String getPaymentUrl() {
        return this.mPaymentHref;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getShopperId() {
        return this.mShopperId;
    }

    public String getTrolleyUrl() {
        return this.mTrolleyHref;
    }

    public String getUserName() {
        return this.mUserName;
    }

    public boolean hasAccessToken() {
        String str = this.mAccessToken;
        return str != null && str.length() > 0;
    }

    public boolean isGuestUser() {
        return this.mGuestUser;
    }

    public void setAccessToken(String str) {
        this.mAccessToken = str;
    }

    public void setDateOfBirth(String str) {
        this.mDateOfBirth = str;
    }

    public void setExpirySinceEpoch(long j) {
        this.mExpirySinceEpoch = j;
    }

    public void setFulfilmentHref(String str) {
        this.mFulfilmentHref = str;
    }

    public void setFulfilmentStoreId(String str) {
        this.mFulfilmentStoreId = str;
    }

    public void setGuestUser(boolean z) {
        this.mGuestUser = z;
    }

    public void setMarketOrderCount(int i) {
        this.mMarketOrderCount = i;
    }

    public void setOrderCount(int i) {
        this.mOrderCount = i;
    }

    public void setPaymentHref(String str) {
        this.mPaymentHref = str;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public void setShopperId(String str) {
        this.mShopperId = str;
    }

    public void setTrolleyHref(String str) {
        this.mTrolleyHref = str;
    }

    public void setUserName(String str) {
        this.mUserName = str;
    }

    public boolean shouldRefresh() {
        return System.currentTimeMillis() > this.mExpirySinceEpoch;
    }
}
