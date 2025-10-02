package io.branch.referral;

import YU.a;

/* loaded from: classes7.dex */
public class BranchError {

    /* renamed from: a, reason: collision with root package name */
    public final String f23850a;
    public final int b;

    public BranchError(String str, int i) {
        String str2;
        this.f23850a = "";
        this.b = -122;
        StringBuilder sbS = a.s(str);
        if (i == -113) {
            this.b = -113;
            str2 = " Check network connectivity or DNS settings.";
        } else if (i == -114) {
            this.b = -114;
            str2 = " Branch API Error: Please enter your branch_key in your project's manifest file first.";
        } else if (i == -104) {
            this.b = -104;
            str2 = " Did you forget to call init? Make sure you init the session before making Branch calls.";
        } else if (i == -101) {
            this.b = -101;
            str2 = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
        } else if (i == -102) {
            this.b = -102;
            str2 = " Please add 'android.permission.INTERNET' in your applications manifest file.";
        } else if (i == -105) {
            this.b = -105;
            str2 = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
        } else if (i == -108) {
            this.b = -108;
            str2 = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
        } else if (i == -109) {
            this.b = -109;
            str2 = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
        } else if (i == -110) {
            this.b = -110;
            str2 = " Unable create share options. Couldn't find applications on device to share the link.";
        } else if (i == -111) {
            this.b = -111;
            str2 = " Request to Branch server timed out. Please check your internet connectivity";
        } else if (i == -117) {
            this.b = -117;
            str2 = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
        } else if (i == -118) {
            this.b = -118;
            str2 = " Session initialization already happened. To force a new session, set intent extra, \"branch_force_new_session\", to true.";
        } else if (i >= 500 || i == -112) {
            this.b = -112;
            str2 = " Unable to reach the Branch servers, please try again shortly.";
        } else if (i == 409 || i == -115) {
            this.b = -115;
            str2 = " A resource with this identifier already exists.";
        } else if (i >= 400 || i == -116) {
            this.b = -116;
            str2 = " The request was invalid.";
        } else if (i == -119) {
            this.b = -119;
            str2 = "Intra-app linking (i.e. session reinitialization) requires an intent flag, \"branch_force_new_session\".";
        } else if (i == -120) {
            this.b = -120;
            str2 = " Task exceeded timeout.";
        } else {
            this.b = -122;
            str2 = " See exception message or logs for more details. ";
        }
        sbS.append(str2);
        this.f23850a = sbS.toString();
    }

    public final String a() {
        return this.f23850a;
    }

    public final String toString() {
        return this.f23850a;
    }
}
