package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r7 implements Serializable {
    private static final int t = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f16687a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean p;
    private long q;
    private String r;
    private String s;

    public r7() {
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.m;
    }

    public String c() {
        return this.k;
    }

    public String d() {
        return this.l;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r7 r7Var = (r7) obj;
            String str = this.f16687a;
            if (str == null ? r7Var.f16687a != null : !str.equals(r7Var.f16687a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? r7Var.b != null : !str2.equals(r7Var.b)) {
                return false;
            }
            String str3 = this.c;
            if (str3 == null ? r7Var.c != null : !str3.equals(r7Var.c)) {
                return false;
            }
            String str4 = this.d;
            if (str4 == null ? r7Var.d != null : !str4.equals(r7Var.d)) {
                return false;
            }
            String str5 = this.e;
            if (str5 == null ? r7Var.e != null : !str5.equals(r7Var.e)) {
                return false;
            }
            String str6 = this.g;
            if (str6 == null ? r7Var.g != null : !str6.equals(r7Var.g)) {
                return false;
            }
            String str7 = this.h;
            if (str7 == null ? r7Var.h != null : !str7.equals(r7Var.h)) {
                return false;
            }
            String str8 = this.i;
            if (str8 == null ? r7Var.i != null : !str8.equals(r7Var.i)) {
                return false;
            }
            if (this.j != r7Var.j) {
                return false;
            }
            String str9 = this.k;
            if (str9 == null ? r7Var.k != null : !str9.equals(r7Var.k)) {
                return false;
            }
            String str10 = this.l;
            if (str10 == null ? r7Var.l != null : !str10.equals(r7Var.l)) {
                return false;
            }
            String str11 = this.m;
            if (str11 == null ? r7Var.m != null : !str11.equals(r7Var.m)) {
                return false;
            }
            if (this.n != r7Var.n || this.o != r7Var.o || this.p != r7Var.p || this.q != r7Var.q) {
                return false;
            }
            String str12 = this.r;
            if (str12 == null ? r7Var.r != null : !str12.equals(r7Var.r)) {
                return false;
            }
            String str13 = this.f;
            if (str13 == null ? r7Var.f != null : !str13.equals(r7Var.f)) {
                return false;
            }
            String str14 = this.s;
            String str15 = r7Var.s;
            if (str14 == null ? str15 != null : !str14.equals(str15)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.h;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.s;
    }

    public int hashCode() {
        String str = this.f16687a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.g;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.h;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.i;
        int iHashCode8 = (Boolean.valueOf(this.j).hashCode() + ((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31)) * 31;
        String str9 = this.k;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.l;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.m;
        int iHashCode11 = (Long.valueOf(this.q).hashCode() + ((Boolean.valueOf(this.p).hashCode() + ((Boolean.valueOf(this.o).hashCode() + ((Boolean.valueOf(this.n).hashCode() + ((iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str12 = this.r;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.s;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    public String i() {
        return this.g;
    }

    public String j() {
        return this.i;
    }

    public long k() {
        return this.q;
    }

    public String l() {
        return this.b;
    }

    public String m() {
        return this.f;
    }

    public String n() {
        return this.f16687a;
    }

    public String o() {
        return this.r;
    }

    public boolean p() {
        return this.n;
    }

    public boolean q() {
        return this.j;
    }

    public boolean r() {
        return this.p;
    }

    public boolean s() {
        return this.o;
    }

    public String t() {
        try {
            return "{\"showThankYouPrompt\":" + this.p + ",\"promptDuration\":" + this.q + ",\"isStickyPrompt\":" + this.o + ",\"isImageDisplay\":" + this.j + ",\"selectedTheme\":" + l3.c(this.f) + ",\"mobileThankYouPromptImageDataContract\":{\"url\":" + l3.c(this.g) + "},\"mobileThankYouPromptDarkImageDataContract\":{\"url\":" + l3.c(this.h) + "},\"mobileThankYouPromptGeneralSettingsSectionContract\":{\"textContent\":" + l3.c(l3.a(this.f16687a)) + ",\"bodyContent\":" + l3.c(l3.a(this.b)) + ",\"promptContentFontColor\":" + l3.c(this.d) + ",\"promptContentFontType\":" + l3.c(this.e) + ",\"backgroundColor\":" + l3.c(this.c) + "},\"mobileThankYouPromptButtonSectionContract\":{\"buttonDisplayed\":" + this.n + ",\"buttonText\":" + l3.c(this.k) + ",\"buttonTextColor\":" + l3.c(this.l) + ",\"buttonColor\":" + l3.c(this.m) + "},\"mobileThankYouAccessibilitySectionContract\":{\"imageAltText\":" + l3.c(this.s) + ",\"closeButtonAltText\":" + l3.c(this.r) + "}}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public r7(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, long j, String str11, String str12, String str13) {
        this.f16687a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.g = str6;
        this.i = str7;
        this.j = z;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = j;
        this.r = str11;
        this.s = str12;
        this.f = str13;
    }

    public r7(JSONObject jSONObject) throws JSONException {
        try {
            if (jSONObject.has("showThankYouPrompt") && !jSONObject.isNull("showThankYouPrompt")) {
                this.p = jSONObject.getBoolean("showThankYouPrompt");
            }
            if (jSONObject.has("promptDuration") && !jSONObject.isNull("promptDuration")) {
                this.q = jSONObject.getLong("promptDuration");
            }
            if (jSONObject.has("isStickyPrompt") && !jSONObject.isNull("isStickyPrompt")) {
                this.o = jSONObject.getBoolean("isStickyPrompt");
            }
            if (jSONObject.has("isImageDisplay") && !jSONObject.isNull("isImageDisplay")) {
                this.j = jSONObject.getBoolean("isImageDisplay");
            }
            if (jSONObject.has("selectedTheme") && !jSONObject.isNull("selectedTheme")) {
                this.f = jSONObject.getString("selectedTheme");
            }
            if (jSONObject.has("mobileThankYouPromptImageDataContract") && !jSONObject.isNull("mobileThankYouPromptImageDataContract")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("mobileThankYouPromptImageDataContract");
                if (jSONObject2.has("url") && !jSONObject2.isNull("url")) {
                    this.g = jSONObject2.getString("url");
                }
            }
            if (jSONObject.has("mobileThankYouPromptDarkImageDataContract") && !jSONObject.isNull("mobileThankYouPromptDarkImageDataContract")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("mobileThankYouPromptDarkImageDataContract");
                if (jSONObject3.has("url") && !jSONObject3.isNull("url")) {
                    this.h = jSONObject3.getString("url");
                }
            }
            if (jSONObject.has("mobileThankYouPromptGeneralSettingsSectionContract") && !jSONObject.isNull("mobileThankYouPromptGeneralSettingsSectionContract")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("mobileThankYouPromptGeneralSettingsSectionContract");
                if (jSONObject4.has("textContent") && !jSONObject4.isNull("textContent")) {
                    this.f16687a = jSONObject4.getString("textContent");
                }
                if (jSONObject4.has("bodyContent") && !jSONObject4.isNull("bodyContent")) {
                    this.b = jSONObject4.getString("bodyContent");
                }
                if (jSONObject4.has("promptContentFontColor") && !jSONObject4.isNull("promptContentFontColor")) {
                    this.d = jSONObject4.getString("promptContentFontColor");
                }
                if (jSONObject4.has("promptContentFontType") && !jSONObject4.isNull("promptContentFontType")) {
                    this.e = jSONObject4.getString("promptContentFontType");
                }
                if (jSONObject4.has("backgroundColor") && !jSONObject4.isNull("backgroundColor")) {
                    this.c = jSONObject4.getString("backgroundColor");
                }
            }
            if (jSONObject.has("mobileThankYouPromptButtonSectionContract") && !jSONObject.isNull("mobileThankYouPromptButtonSectionContract")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("mobileThankYouPromptButtonSectionContract");
                if (jSONObject5.has("buttonDisplayed") && !jSONObject5.isNull("buttonDisplayed")) {
                    this.n = jSONObject5.getBoolean("buttonDisplayed");
                }
                if (jSONObject5.has("buttonText") && !jSONObject5.isNull("buttonText")) {
                    this.k = jSONObject5.getString("buttonText");
                }
                if (jSONObject5.has("buttonTextColor") && !jSONObject5.isNull("buttonTextColor")) {
                    this.l = jSONObject5.getString("buttonTextColor");
                }
                if (jSONObject5.has("buttonColor") && !jSONObject5.isNull("buttonColor")) {
                    this.m = jSONObject5.getString("buttonColor");
                }
            }
            if (!jSONObject.has("mobileThankYouAccessibilitySectionContract") || jSONObject.isNull("mobileThankYouAccessibilitySectionContract")) {
                return;
            }
            JSONObject jSONObject6 = jSONObject.getJSONObject("mobileThankYouAccessibilitySectionContract");
            if (jSONObject6.has("imageAltText") && !jSONObject6.isNull("imageAltText")) {
                this.s = jSONObject6.getString("imageAltText");
            }
            if (!jSONObject6.has("closeButtonAltText") || jSONObject6.isNull("closeButtonAltText")) {
                return;
            }
            this.r = jSONObject6.getString("closeButtonAltText");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
