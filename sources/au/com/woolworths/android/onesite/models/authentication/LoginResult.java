package au.com.woolworths.android.onesite.models.authentication;

import YU.a;

/* loaded from: classes3.dex */
public class LoginResult {
    public String access_token;
    public String dateofbirth;
    public String deliveryaddressstreet1;
    public String deliveryaddressstreet2;
    public String deliveryaddresssuburb;
    public String deliveryinstructions;
    public String deliverymethod;
    public String deliverystoreaddresscity;
    public String deliverystoreaddresscountry;
    public String deliverystoreaddressid;
    public String email;
    public String expires_in;
    public String firstname;
    public String fulfilmenthref;
    public String fulfilmentstoreid;
    public boolean isservicable;
    public String lastname;
    public String middlename;
    public String otherphone;
    public String paymenthref;
    public String primaryphone;
    public String refresh_token;
    public String rewardscardNumber;
    public String secondaryphone;
    public String shopperid;
    public String teammember;
    public String title;
    public String trolleyhref;
    public String trolleymergestatus;

    public boolean hasDeliveryAddress() {
        return (this.deliverystoreaddressid == null || this.deliveryaddressstreet1 == null || this.deliveryaddresssuburb == null) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoginResult{access_token='");
        sb.append(this.access_token);
        sb.append("', refresh_token='");
        sb.append(this.refresh_token);
        sb.append("', expires_in='");
        sb.append(this.expires_in);
        sb.append("', trolleyhref='");
        sb.append(this.trolleyhref);
        sb.append("', fulfilmenthref='");
        sb.append(this.fulfilmenthref);
        sb.append("', paymenthref='");
        return a.o(sb, this.paymenthref, "'}");
    }
}
