package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class j2 extends b0 implements Serializable {
    private static final int B = 31;
    private MDAppearanceMode A;

    /* renamed from: a, reason: collision with root package name */
    private final String f16536a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private List<ResourceContract> f;
    private String g;
    private String h;
    private String i;
    private FormTriggerType j;
    private a k;
    private c8 l;
    private InviteData m;
    private FormViewType n;
    private boolean o;
    private String p;
    private boolean q;
    private r7 r;
    private boolean s;
    private boolean t;
    private ArrayList<String> u;
    private String v;
    private String w;
    private boolean x;
    private String y;
    private boolean z;

    public enum a {
        NOT_EXISTS(0),
        NOT_STARTED(1),
        IN_PROGRESS(2),
        AVAILABLE(3),
        FAILED(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f16537a;

        a(int i) {
            this.f16537a = i;
        }

        public int a() {
            return this.f16537a;
        }

        public static a a(int i) {
            for (a aVar : values()) {
                if (aVar.a() == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j2(SDKConfigurationFormContract sDKConfigurationFormContract) {
        this.u = new ArrayList<>();
        this.f16536a = sDKConfigurationFormContract.getFormId();
        this.b = sDKConfigurationFormContract.getName();
        this.c = sDKConfigurationFormContract.getFormJson().toString();
        this.d = sDKConfigurationFormContract.getTemplateLocalUrl();
        this.e = sDKConfigurationFormContract.getTemplateRemoteUrl();
        this.g = sDKConfigurationFormContract.getTitle();
        this.h = sDKConfigurationFormContract.getTitleTextColor();
        this.i = sDKConfigurationFormContract.getTitleBackgroundColor();
        this.j = sDKConfigurationFormContract.getFormType();
        this.k = a.NOT_STARTED;
        this.l = ModelFactory.getInstance().createTransitionType(this.c);
        this.m = sDKConfigurationFormContract.getInviteData();
        this.n = sDKConfigurationFormContract.getFormViewType() != null ? sDKConfigurationFormContract.getFormViewType() : FormViewType.none;
        this.o = sDKConfigurationFormContract.isPreloaded();
        this.p = sDKConfigurationFormContract.getFormLanguage();
        this.q = sDKConfigurationFormContract.isRtl();
        a(sDKConfigurationFormContract.getResources());
        this.s = sDKConfigurationFormContract.isPoweredByVisible();
        this.r = ModelFactory.getInstance().createThankYouDataObject(this.c);
        m();
        this.v = sDKConfigurationFormContract.getTemplateDebugRemoteUrl();
        this.w = sDKConfigurationFormContract.getUrlVersion();
        this.y = sDKConfigurationFormContract.getHeaderThemeName();
        this.z = sDKConfigurationFormContract.isDarkModeEnabled();
    }

    private void m() {
        if (this.k != null) {
            a4.b("FormId: " + this.f16536a + ", FormStatus : " + this.k.name());
        }
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public a c() {
        if (this.k == null) {
            this.k = a.NOT_STARTED;
        }
        return this.k;
    }

    public MDAppearanceMode d() {
        return this.A;
    }

    public ArrayList<String> e() {
        return this.u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j2 j2Var = (j2) obj;
            String str = this.f16536a;
            if (str == null ? j2Var.f16536a != null : !str.equals(j2Var.f16536a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? j2Var.b != null : !str2.equals(j2Var.b)) {
                return false;
            }
            String str3 = this.c;
            if (str3 == null ? j2Var.c != null : !str3.equals(j2Var.c)) {
                return false;
            }
            String str4 = this.d;
            if (str4 == null ? j2Var.d != null : !str4.equals(j2Var.d)) {
                return false;
            }
            String str5 = this.e;
            if (str5 == null ? j2Var.e != null : !str5.equals(j2Var.e)) {
                return false;
            }
            List<ResourceContract> list = this.f;
            if (list == null ? j2Var.f != null : !list.equals(j2Var.f)) {
                return false;
            }
            String str6 = this.g;
            if (str6 == null ? j2Var.g != null : !str6.equals(j2Var.g)) {
                return false;
            }
            String str7 = this.h;
            if (str7 == null ? j2Var.h != null : !str7.equals(j2Var.h)) {
                return false;
            }
            String str8 = this.i;
            if (str8 == null ? j2Var.i != null : !str8.equals(j2Var.i)) {
                return false;
            }
            FormTriggerType formTriggerType = this.j;
            if (formTriggerType == null ? j2Var.j != null : !formTriggerType.equals(j2Var.j)) {
                return false;
            }
            if (this.o != j2Var.o || this.s != j2Var.s) {
                return false;
            }
            r7 r7Var = this.r;
            if (r7Var == null ? j2Var.r != null : !r7Var.equals(j2Var.r)) {
                return false;
            }
            String str9 = this.v;
            if (str9 == null ? j2Var.v != null : !str9.equals(j2Var.v)) {
                return false;
            }
            String str10 = this.w;
            if (str10 == null ? j2Var.w != null : !str10.equals(j2Var.w)) {
                return false;
            }
            String str11 = this.y;
            if (str11 == null ? j2Var.y != null : !str11.equals(j2Var.y)) {
                return false;
            }
            if (this.z == j2Var.z && this.q == j2Var.q && this.l == j2Var.l && this.k == j2Var.k) {
                return true;
            }
        }
        return false;
    }

    public List<ResourceContract> f() {
        return this.f;
    }

    public String g() {
        if (this.d == null) {
            this.d = "";
        }
        return this.d;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.FormData;
    }

    public String getFormId() {
        return this.f16536a;
    }

    public String getFormLanguage() {
        return this.p;
    }

    public FormTriggerType getFormType() {
        return this.j;
    }

    public FormViewType getFormViewType() {
        return this.n;
    }

    public String getHeaderThemeName() {
        return this.y;
    }

    public InviteData getInviteData() {
        return this.m;
    }

    public String getTemplateDebugRemoteUrl() {
        if (this.v == null) {
            this.v = "";
        }
        return this.v;
    }

    public String getTitle() {
        return this.g;
    }

    public String getTitleBackgroundColor() {
        return this.i;
    }

    public String getTitleTextColor() {
        return this.h;
    }

    public String getUrlVersion() {
        return this.w;
    }

    public String h() {
        if (this.e == null) {
            this.e = "";
        }
        return this.e;
    }

    public int hashCode() {
        String str = this.f16536a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<ResourceContract> list = this.f;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        FormTriggerType formTriggerType = this.j;
        int iHashCode10 = (iHashCode9 + (formTriggerType != null ? formTriggerType.hashCode() : 0)) * 31;
        a aVar = this.k;
        int iHashCode11 = (iHashCode10 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        c8 c8Var = this.l;
        int iHashCode12 = (iHashCode11 + (c8Var != null ? c8Var.hashCode() : 0)) * 31;
        FormViewType formViewType = this.n;
        int iHashCode13 = (Boolean.valueOf(this.s).hashCode() + ((Boolean.valueOf(this.o).hashCode() + ((iHashCode12 + (formViewType != null ? formViewType.hashCode() : 0)) * 31)) * 31)) * 31;
        r7 r7Var = this.r;
        int iHashCode14 = (iHashCode13 + (r7Var != null ? r7Var.hashCode() : 0)) * 31;
        String str9 = this.y;
        int iHashCode15 = (Boolean.valueOf(this.q).hashCode() + ((Boolean.valueOf(this.z).hashCode() + ((iHashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31)) * 31)) * 31;
        String str10 = this.v;
        int iHashCode16 = (iHashCode15 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.w;
        return iHashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    public r7 i() {
        return this.r;
    }

    public boolean isDarkModeEnabled() {
        return this.z;
    }

    public boolean isPoweredByVisible() {
        return this.s;
    }

    public boolean isRtl() {
        return this.q;
    }

    public c8 j() {
        c8 c8Var = this.l;
        return c8Var == null ? c8.Fade : c8Var;
    }

    public boolean k() {
        return this.t;
    }

    public boolean l() {
        return this.o;
    }

    public boolean n() {
        return this.x;
    }

    public j2(String str, String str2, String str3, String str4, String str5, List<ResourceContract> list, String str6, String str7, String str8, FormTriggerType formTriggerType, a aVar, c8 c8Var, InviteData inviteData, FormViewType formViewType, boolean z, String str9, boolean z2, boolean z3, r7 r7Var, boolean z4, ArrayList<String> arrayList, String str10, String str11, boolean z5, String str12, boolean z6) {
        this.u = new ArrayList<>();
        this.f16536a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = formTriggerType;
        this.k = aVar;
        this.l = c8Var;
        this.m = inviteData;
        this.n = formViewType == null ? FormViewType.none : formViewType;
        this.o = z;
        this.p = str9;
        this.q = z2;
        this.r = r7Var;
        this.s = z3;
        this.u = arrayList;
        this.t = z4;
        this.v = str10;
        this.w = str11;
        this.x = z5;
        this.y = str12;
        this.z = z6;
        a(list);
        m();
    }

    public void a(InviteData inviteData) {
        this.m = inviteData;
    }

    public void b(String str) {
        this.p = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.e = str;
    }

    public void e(String str) {
        this.g = str;
    }

    public void a(MDAppearanceMode mDAppearanceMode) {
        this.A = mDAppearanceMode;
    }

    public void b(boolean z) {
        this.s = z;
    }

    public void c(boolean z) {
        this.q = z;
    }

    public void d(boolean z) {
        this.x = z;
    }

    public void a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (sDKConfigurationFormContract == null) {
            return;
        }
        this.g = sDKConfigurationFormContract.getTitle();
        this.i = sDKConfigurationFormContract.getTitleBackgroundColor();
        this.h = sDKConfigurationFormContract.getTitleTextColor();
        this.c = sDKConfigurationFormContract.getFormJson().toString();
        this.j = sDKConfigurationFormContract.getFormType();
        this.n = sDKConfigurationFormContract.getFormViewType() != null ? sDKConfigurationFormContract.getFormViewType() : FormViewType.none;
        this.l = ModelFactory.getInstance().createTransitionType(this.c);
        this.m = sDKConfigurationFormContract.getInviteData();
        this.o = sDKConfigurationFormContract.isPreloaded();
        this.p = sDKConfigurationFormContract.getFormLanguage();
        this.q = sDKConfigurationFormContract.isRtl();
        this.r = ModelFactory.getInstance().createThankYouDataObject(this.c);
        this.s = sDKConfigurationFormContract.isPoweredByVisible();
        this.v = sDKConfigurationFormContract.getTemplateDebugRemoteUrl();
        this.w = sDKConfigurationFormContract.getUrlVersion();
        this.z = sDKConfigurationFormContract.isDarkModeEnabled();
        this.y = sDKConfigurationFormContract.getHeaderThemeName();
    }

    public void a(a aVar) {
        this.k = aVar;
        m();
    }

    public void a(r7 r7Var) {
        this.r = r7Var;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(ArrayList<String> arrayList) {
        this.u = arrayList;
    }

    public void a(List<ResourceContract> list) {
        this.f = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ResourceContract resourceContract : list) {
            resourceContract.setFormId(this.f16536a);
            this.f.add(resourceContract);
        }
    }

    public void a(boolean z) {
        this.t = z;
    }
}
