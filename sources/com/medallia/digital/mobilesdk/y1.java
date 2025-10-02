package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class y1 {
    private x1 A;
    private x1 B;
    private x1 C;
    private x1 D;
    private x1 E;
    private x1 F;
    private x1 G;
    private x1 H;
    private x1 I;
    private x1 J;
    private x1 K;
    private x1 L;
    private x1 M;
    private x1 N;
    private x1 O;
    private x1 P;
    private x1 Q;
    private x1 R;
    private x1 S;
    private x1 T;
    private x1 U;
    private x1 V;
    private x1 W;
    private x1 X;
    private x1 Y;
    private x1 Z;

    /* renamed from: a, reason: collision with root package name */
    private x1 f16780a;
    private x1 a0;
    private x1 b;
    private x1 b0;
    private x1 c;
    private x1 c0;
    private x1 d;
    private x1 d0;
    private x1 e;
    private x1 e0;
    private x1 f;
    private x1 f0;
    private x1 g;
    private x1 g0;
    private x1 h;
    private x1 h0;
    private x1 i;
    private x1 i0;
    private x1 j;
    private x1 j0;
    private x1 k;
    private x1 k0;
    private x1 l;
    private x1 l0;
    private x1 m;
    private x1 m0;
    private x1 n;
    private x1 n0;
    private x1 o;
    private x1 o0;
    private x1 p;
    private x1 p0;
    private x1 q;
    private x1 q0;
    private x1 r;
    private x1 r0;
    private x1 s;
    private x1 s0;
    private x1 t;
    private x1 t0;
    private x1 u;
    private x1 u0;
    private x1 v;
    private x1 v0;
    private x1 w;
    private x1 x;
    private x1 y;
    private x1 z;

    public y1(JSONObject jSONObject) {
        String str;
        try {
            if (a(jSONObject, "Init")) {
                str = "InvitationDeclined";
                this.f16780a = new x1(jSONObject.getJSONObject("Init"));
            } else {
                str = "InvitationDeclined";
            }
            if (a(jSONObject, "ShowForm")) {
                this.b = new x1(jSONObject.getJSONObject("ShowForm"));
            }
            if (a(jSONObject, "SetCustomParameter")) {
                this.c = new x1(jSONObject.getJSONObject("SetCustomParameter"));
            }
            if (a(jSONObject, "SetCustomParameters")) {
                this.d = new x1(jSONObject.getJSONObject("SetCustomParameters"));
            }
            if (a(jSONObject, "EnableIntercept")) {
                this.e = new x1(jSONObject.getJSONObject("EnableIntercept"));
            }
            if (a(jSONObject, "DisableIntercept")) {
                this.f = new x1(jSONObject.getJSONObject("DisableIntercept"));
            }
            if (a(jSONObject, "HandleNotification")) {
                this.g = new x1(jSONObject.getJSONObject("HandleNotification"));
            }
            if (a(jSONObject, "StopSDK")) {
                this.h = new x1(jSONObject.getJSONObject("StopSDK"));
            }
            if (a(jSONObject, "RevertStopSDK")) {
                this.i = new x1(jSONObject.getJSONObject("RevertStopSDK"));
            }
            if (a(jSONObject, "FeedbackRetryMechanism")) {
                this.j = new x1(jSONObject.getJSONObject("FeedbackRetryMechanism"));
            }
            if (a(jSONObject, "MediaFeedbackRetryMechanism")) {
                this.k = new x1(jSONObject.getJSONObject("MediaFeedbackRetryMechanism"));
            }
            if (a(jSONObject, "InvitationDisplayed")) {
                this.l = new x1(jSONObject.getJSONObject("InvitationDisplayed"));
            }
            if (a(jSONObject, "InvitationAccepted")) {
                this.m = new x1(jSONObject.getJSONObject("InvitationAccepted"));
            }
            String str2 = str;
            if (a(jSONObject, str2)) {
                this.n = new x1(jSONObject.getJSONObject(str2));
            }
            if (a(jSONObject, "InvitationDeferred")) {
                this.o = new x1(jSONObject.getJSONObject("InvitationDeferred"));
            }
            if (a(jSONObject, "CustomInterceptAccepted")) {
                this.q = new x1(jSONObject.getJSONObject("CustomInterceptAccepted"));
            }
            if (a(jSONObject, "CustomInterceptDeclined")) {
                this.r = new x1(jSONObject.getJSONObject("CustomInterceptDeclined"));
            }
            if (a(jSONObject, "CustomInterceptDeferred")) {
                this.s = new x1(jSONObject.getJSONObject("CustomInterceptDeferred"));
            }
            if (a(jSONObject, "CustomInterceptSkipped")) {
                this.t = new x1(jSONObject.getJSONObject("CustomInterceptSkipped"));
            }
            if (a(jSONObject, "InitCallback")) {
                this.x = new x1(jSONObject.getJSONObject("InitCallback"));
            }
            if (a(jSONObject, "ShowFormCallback")) {
                this.y = new x1(jSONObject.getJSONObject("ShowFormCallback"));
            }
            if (a(jSONObject, "CodeFormReady")) {
                this.z = new x1(jSONObject.getJSONObject("CodeFormReady"));
            }
            if (a(jSONObject, "FormDisplayed")) {
                this.A = new x1(jSONObject.getJSONObject("FormDisplayed"));
            }
            if (a(jSONObject, "FormLoaded")) {
                this.B = new x1(jSONObject.getJSONObject("FormLoaded"));
            }
            if (a(jSONObject, "FormSubmitted")) {
                this.C = new x1(jSONObject.getJSONObject("FormSubmitted"));
            }
            if (a(jSONObject, "FormDismissed")) {
                this.D = new x1(jSONObject.getJSONObject("FormDismissed"));
            }
            if (a(jSONObject, "FormClosed")) {
                this.E = new x1(jSONObject.getJSONObject("FormClosed"));
            }
            if (a(jSONObject, "ThankYouPromptDisplayed")) {
                this.F = new x1(jSONObject.getJSONObject("ThankYouPromptDisplayed"));
            }
            if (a(jSONObject, "PromptDisplayed")) {
                this.G = new x1(jSONObject.getJSONObject("PromptDisplayed"));
            }
            if (a(jSONObject, "PromptAccepted")) {
                this.H = new x1(jSONObject.getJSONObject("PromptAccepted"));
            }
            if (a(jSONObject, "PromptDeclined")) {
                this.I = new x1(jSONObject.getJSONObject("PromptDeclined"));
            }
            if (a(jSONObject, "PromptDeferred")) {
                this.J = new x1(jSONObject.getJSONObject("PromptDeferred"));
            }
            if (a(jSONObject, "PromptTriggered")) {
                this.K = new x1(jSONObject.getJSONObject("PromptTriggered"));
            }
            if (a(jSONObject, "RefreshSession")) {
                this.L = new x1(jSONObject.getJSONObject("RefreshSession"));
            }
            if (a(jSONObject, "FormLoadSpinner")) {
                this.M = new x1(jSONObject.getJSONObject("FormLoadSpinner"));
            }
            if (a(jSONObject, "SubmitFeedback")) {
                this.N = new x1(jSONObject.getJSONObject("SubmitFeedback"));
            }
            if (a(jSONObject, "SubmitFeedbackPending")) {
                this.O = new x1(jSONObject.getJSONObject("SubmitFeedbackPending"));
            }
            if (a(jSONObject, "SubmitFeedbackFailure")) {
                this.P = new x1(jSONObject.getJSONObject("SubmitFeedbackFailure"));
            }
            if (a(jSONObject, "MediaCaptureSubmit")) {
                this.Q = new x1(jSONObject.getJSONObject("MediaCaptureSubmit"));
            }
            if (a(jSONObject, "MediaCaptureCollected")) {
                this.R = new x1(jSONObject.getJSONObject("MediaCaptureCollected"));
            }
            if (a(jSONObject, "SetInvitationListener")) {
                this.S = new x1(jSONObject.getJSONObject("SetInvitationListener"));
            }
            if (a(jSONObject, "SetInterceptListener")) {
                this.T = new x1(jSONObject.getJSONObject("SetInterceptListener"));
            }
            if (a(jSONObject, "SetCustomInterceptListener")) {
                this.U = new x1(jSONObject.getJSONObject("SetCustomInterceptListener"));
            }
            if (a(jSONObject, "SetFormListener")) {
                this.V = new x1(jSONObject.getJSONObject("SetFormListener"));
            }
            if (a(jSONObject, "SetFeedbackListener")) {
                this.W = new x1(jSONObject.getJSONObject("SetFeedbackListener"));
            }
            if (a(jSONObject, "Logger")) {
                this.Y = new x1(jSONObject.getJSONObject("Logger"));
            }
            if (a(jSONObject, "SetInterceptCallback")) {
                this.Z = new x1(jSONObject.getJSONObject("SetInterceptCallback"));
            }
            if (a(jSONObject, "SetCustomInterceptCallback")) {
                this.a0 = new x1(jSONObject.getJSONObject("SetCustomInterceptCallback"));
            }
            if (a(jSONObject, "CustomInterceptTriggerCallback")) {
                this.b0 = new x1(jSONObject.getJSONObject("CustomInterceptTriggerCallback"));
            }
            if (a(jSONObject, "SetFormCallback")) {
                this.c0 = new x1(jSONObject.getJSONObject("SetFormCallback"));
            }
            if (a(jSONObject, "SetCustomAppearance")) {
                this.u = new x1(jSONObject.getJSONObject("SetCustomAppearance"));
            }
            if (a(jSONObject, "CloseEngagement")) {
                this.v = new x1(jSONObject.getJSONObject("CloseEngagement"));
            }
            if (a(jSONObject, "SetUserId")) {
                this.w = new x1(jSONObject.getJSONObject("SetUserId"));
            }
            if (a(jSONObject, "SetFeedbackCallback")) {
                this.d0 = new x1(jSONObject.getJSONObject("SetFeedbackCallback"));
            }
            if (a(jSONObject, "PreLoadMechanism")) {
                this.f0 = new x1(jSONObject.getJSONObject("PreLoadMechanism"));
            }
            if (a(jSONObject, "TargetEvaluator")) {
                this.g0 = new x1(jSONObject.getJSONObject("TargetEvaluator"));
            }
            if (a(jSONObject, "NativeTargetEvaluator")) {
                this.h0 = new x1(jSONObject.getJSONObject("NativeTargetEvaluator"));
            }
            if (a(jSONObject, "InterceptMechanism")) {
                this.i0 = new x1(jSONObject.getJSONObject("InterceptMechanism"));
            }
            if (a(jSONObject, "RestClient")) {
                this.j0 = new x1(jSONObject.getJSONObject("RestClient"));
            }
            if (a(jSONObject, "InternalError")) {
                this.k0 = new x1(jSONObject.getJSONObject("InternalError"));
            }
            if (a(jSONObject, "SetActivity")) {
                this.l0 = new x1(jSONObject.getJSONObject("SetActivity"));
            }
            if (a(jSONObject, "MedalliaCrash")) {
                this.m0 = new x1(jSONObject.getJSONObject("MedalliaCrash"));
            }
            if (a(jSONObject, "InitOfflineMechanism")) {
                this.n0 = new x1(jSONObject.getJSONObject("InitOfflineMechanism"));
            }
            if (a(jSONObject, "ResourcesSize")) {
                this.o0 = new x1(jSONObject.getJSONObject("ResourcesSize"));
            }
            if (a(jSONObject, "RestoreFromKillSDK")) {
                this.v0 = new x1(jSONObject.getJSONObject("RestoreFromKillSDK"));
            }
            if (a(jSONObject, "DeleteStorage")) {
                this.p0 = new x1(jSONObject.getJSONObject("DeleteStorage"));
            }
            if (a(jSONObject, "UpdateCustomLocale")) {
                this.p = new x1(jSONObject.getJSONObject("UpdateCustomLocale"));
            }
            if (a(jSONObject, "SetTouchEventListener")) {
                this.X = new x1(jSONObject.getJSONObject("SetTouchEventListener"));
            }
            if (a(jSONObject, "TouchEventCallback")) {
                this.e0 = new x1(jSONObject.getJSONObject("TouchEventCallback"));
            }
            if (a(jSONObject, "LoadingIndicatorShown")) {
                this.q0 = new x1(jSONObject.getJSONObject("LoadingIndicatorShown"));
            }
            if (a(jSONObject, "LoadingIndicatorClosed")) {
                this.r0 = new x1(jSONObject.getJSONObject("LoadingIndicatorClosed"));
            }
            if (a(jSONObject, "LoadingIndicatorCompleted")) {
                this.s0 = new x1(jSONObject.getJSONObject("LoadingIndicatorCompleted"));
            }
            if (a(jSONObject, "LoadingIndicatorTimeout")) {
                this.t0 = new x1(jSONObject.getJSONObject("LoadingIndicatorTimeout"));
            }
            if (a(jSONObject, "AnalyticsSubmissionBlocked")) {
                this.u0 = new x1(jSONObject.getJSONObject("AnalyticsSubmissionBlocked"));
            }
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public x1 A() {
        return this.n;
    }

    public x1 B() {
        return this.o;
    }

    public x1 C() {
        return this.l;
    }

    public x1 D() {
        return this.r0;
    }

    public x1 E() {
        return this.s0;
    }

    public x1 F() {
        return this.q0;
    }

    public x1 G() {
        return this.t0;
    }

    public x1 H() {
        return this.Y;
    }

    public x1 I() {
        return this.m0;
    }

    public x1 J() {
        return this.R;
    }

    public x1 K() {
        return this.Q;
    }

    public x1 L() {
        return this.k;
    }

    public x1 M() {
        return this.h0;
    }

    public x1 N() {
        return this.f0;
    }

    public x1 O() {
        return this.H;
    }

    public x1 P() {
        return this.I;
    }

    public x1 Q() {
        return this.J;
    }

    public x1 R() {
        return this.G;
    }

    public x1 S() {
        return this.K;
    }

    public x1 T() {
        return this.L;
    }

    public x1 U() {
        return this.o0;
    }

    public x1 V() {
        return this.j0;
    }

    public x1 W() {
        return this.v0;
    }

    public x1 X() {
        return this.i;
    }

    public x1 Y() {
        return this.l0;
    }

    public x1 Z() {
        return this.u;
    }

    public x1 a() {
        return this.u0;
    }

    public x1 a0() {
        return this.a0;
    }

    public x1 b() {
        return this.v;
    }

    public x1 b0() {
        return this.U;
    }

    public x1 c() {
        return this.z;
    }

    public x1 c0() {
        return this.c;
    }

    public x1 d() {
        return this.q;
    }

    public x1 d0() {
        return this.d;
    }

    public x1 e() {
        return this.r;
    }

    public x1 e0() {
        return this.d0;
    }

    public x1 f() {
        return this.s;
    }

    public x1 f0() {
        return this.W;
    }

    public x1 g() {
        return this.t;
    }

    public x1 g0() {
        return this.c0;
    }

    public x1 h() {
        return this.b0;
    }

    public x1 h0() {
        return this.V;
    }

    public x1 i() {
        return this.p0;
    }

    public x1 i0() {
        return this.Z;
    }

    public x1 j() {
        return this.f;
    }

    public x1 j0() {
        return this.T;
    }

    public x1 k() {
        return this.e;
    }

    public x1 k0() {
        return this.S;
    }

    public x1 l() {
        return this.j;
    }

    public x1 l0() {
        return this.X;
    }

    public x1 m() {
        return this.E;
    }

    public x1 m0() {
        return this.w;
    }

    public x1 n() {
        return this.D;
    }

    public x1 n0() {
        return this.b;
    }

    public x1 o() {
        return this.A;
    }

    public x1 o0() {
        return this.y;
    }

    public x1 p() {
        return this.M;
    }

    public x1 p0() {
        return this.h;
    }

    public x1 q() {
        return this.B;
    }

    public x1 q0() {
        return this.N;
    }

    public x1 r() {
        return this.C;
    }

    public x1 r0() {
        return this.P;
    }

    public x1 s() {
        return this.F;
    }

    public x1 s0() {
        return this.O;
    }

    public x1 t() {
        return this.g;
    }

    public x1 t0() {
        return this.g0;
    }

    public x1 u() {
        return this.f16780a;
    }

    public x1 u0() {
        return this.e0;
    }

    public x1 v() {
        return this.x;
    }

    public x1 v0() {
        return this.p;
    }

    public x1 w() {
        return this.n0;
    }

    public String w0() {
        try {
            StringBuilder sb = new StringBuilder("{\"Init\":");
            x1 x1Var = this.f16780a;
            String strE = "null";
            sb.append(x1Var == null ? "null" : x1Var.e());
            sb.append(",\"ShowForm\":");
            x1 x1Var2 = this.b;
            sb.append(x1Var2 == null ? "null" : x1Var2.e());
            sb.append(",\"SetCustomParameter\":");
            x1 x1Var3 = this.c;
            sb.append(x1Var3 == null ? "null" : x1Var3.e());
            sb.append(",\"SetCustomParameters\":");
            x1 x1Var4 = this.d;
            sb.append(x1Var4 == null ? "null" : x1Var4.e());
            sb.append(",\"EnableIntercept\":");
            x1 x1Var5 = this.e;
            sb.append(x1Var5 == null ? "null" : x1Var5.e());
            sb.append(",\"DisableIntercept\":");
            x1 x1Var6 = this.f;
            sb.append(x1Var6 == null ? "null" : x1Var6.e());
            sb.append(",\"HandleNotification\":");
            x1 x1Var7 = this.g;
            sb.append(x1Var7 == null ? "null" : x1Var7.e());
            sb.append(",\"StopSDK\":");
            x1 x1Var8 = this.h;
            sb.append(x1Var8 == null ? "null" : x1Var8.e());
            sb.append(",\"RevertStopSDK\":");
            x1 x1Var9 = this.i;
            sb.append(x1Var9 == null ? "null" : x1Var9.e());
            sb.append(",\"FeedbackRetryMechanism\":");
            x1 x1Var10 = this.j;
            sb.append(x1Var10 == null ? "null" : x1Var10.e());
            sb.append(",\"MediaFeedbackRetryMechanism\":");
            x1 x1Var11 = this.k;
            sb.append(x1Var11 == null ? "null" : x1Var11.e());
            sb.append(",\"InvitationDisplayed\":");
            x1 x1Var12 = this.l;
            sb.append(x1Var12 == null ? "null" : x1Var12.e());
            sb.append(",\"InvitationAccepted\":");
            x1 x1Var13 = this.m;
            sb.append(x1Var13 == null ? "null" : x1Var13.e());
            sb.append(",\"InvitationDeclined\":");
            x1 x1Var14 = this.n;
            sb.append(x1Var14 == null ? "null" : x1Var14.e());
            sb.append(",\"InvitationDeferred\":");
            x1 x1Var15 = this.o;
            sb.append(x1Var15 == null ? "null" : x1Var15.e());
            sb.append(",\"CustomInterceptAccepted\":");
            x1 x1Var16 = this.q;
            sb.append(x1Var16 == null ? "null" : x1Var16.e());
            sb.append(",\"CustomInterceptDeclined\":");
            x1 x1Var17 = this.r;
            sb.append(x1Var17 == null ? "null" : x1Var17.e());
            sb.append(",\"CustomInterceptSkipped\":");
            x1 x1Var18 = this.t;
            sb.append(x1Var18 == null ? "null" : x1Var18.e());
            sb.append(",\"CustomInterceptDeferred\":");
            x1 x1Var19 = this.s;
            sb.append(x1Var19 == null ? "null" : x1Var19.e());
            sb.append(",\"InitCallback\":");
            x1 x1Var20 = this.x;
            sb.append(x1Var20 == null ? "null" : x1Var20.e());
            sb.append(",\"ShowFormCallback\":");
            x1 x1Var21 = this.y;
            sb.append(x1Var21 == null ? "null" : x1Var21.e());
            sb.append(",\"CodeFormReady\":");
            x1 x1Var22 = this.z;
            sb.append(x1Var22 == null ? "null" : x1Var22.e());
            sb.append(",\"FormDisplayed\":");
            x1 x1Var23 = this.A;
            sb.append(x1Var23 == null ? "null" : x1Var23.e());
            sb.append(",\"FormLoaded\":");
            x1 x1Var24 = this.B;
            sb.append(x1Var24 == null ? "null" : x1Var24.e());
            sb.append(",\"FormSubmitted\":");
            x1 x1Var25 = this.C;
            sb.append(x1Var25 == null ? "null" : x1Var25.e());
            sb.append(",\"FormDismissed\":");
            x1 x1Var26 = this.D;
            sb.append(x1Var26 == null ? "null" : x1Var26.e());
            sb.append(",\"FormClosed\":");
            x1 x1Var27 = this.E;
            sb.append(x1Var27 == null ? "null" : x1Var27.e());
            sb.append(",\"ThankYouPromptDisplayed\":");
            x1 x1Var28 = this.F;
            sb.append(x1Var28 == null ? "null" : x1Var28.e());
            sb.append(",\"PromptDisplayed\":");
            x1 x1Var29 = this.G;
            sb.append(x1Var29 == null ? "null" : x1Var29.e());
            sb.append(",\"PromptAccepted\":");
            x1 x1Var30 = this.H;
            sb.append(x1Var30 == null ? "null" : x1Var30.e());
            sb.append(",\"PromptDeclined\":");
            x1 x1Var31 = this.I;
            sb.append(x1Var31 == null ? "null" : x1Var31.e());
            sb.append(",\"PromptDeferred\":");
            x1 x1Var32 = this.J;
            sb.append(x1Var32 == null ? "null" : x1Var32.e());
            sb.append(",\"PromptTriggered\":");
            x1 x1Var33 = this.K;
            sb.append(x1Var33 == null ? "null" : x1Var33.e());
            sb.append(",\"RefreshSession\":");
            x1 x1Var34 = this.L;
            sb.append(x1Var34 == null ? "null" : x1Var34.e());
            sb.append(",\"FormLoadSpinner\":");
            x1 x1Var35 = this.M;
            sb.append(x1Var35 == null ? "null" : x1Var35.e());
            sb.append(",\"SubmitFeedback\":");
            x1 x1Var36 = this.N;
            sb.append(x1Var36 == null ? "null" : x1Var36.e());
            sb.append(",\"SubmitFeedbackPending\":");
            x1 x1Var37 = this.O;
            sb.append(x1Var37 == null ? "null" : x1Var37.e());
            sb.append(",\"SubmitFeedbackFailure\":");
            x1 x1Var38 = this.P;
            sb.append(x1Var38 == null ? "null" : x1Var38.e());
            sb.append(",\"MediaCaptureSubmit\":");
            x1 x1Var39 = this.Q;
            sb.append(x1Var39 == null ? "null" : x1Var39.e());
            sb.append(",\"MediaCaptureCollected\":");
            x1 x1Var40 = this.R;
            sb.append(x1Var40 == null ? "null" : x1Var40.e());
            sb.append(",\"SetInvitationListener\":");
            x1 x1Var41 = this.S;
            sb.append(x1Var41 == null ? "null" : x1Var41.e());
            sb.append(",\"SetInterceptListener\":");
            x1 x1Var42 = this.T;
            sb.append(x1Var42 == null ? "null" : x1Var42.e());
            sb.append(",\"SetCustomInterceptListener\":");
            x1 x1Var43 = this.U;
            sb.append(x1Var43 == null ? "null" : x1Var43.e());
            sb.append(",\"SetFormListener\":");
            x1 x1Var44 = this.V;
            sb.append(x1Var44 == null ? "null" : x1Var44.e());
            sb.append(",\"SetCustomAppearance\":");
            x1 x1Var45 = this.u;
            sb.append(x1Var45 == null ? "null" : x1Var45.e());
            sb.append(",\"CloseEngagement\":");
            x1 x1Var46 = this.v;
            sb.append(x1Var46 == null ? "null" : x1Var46.e());
            sb.append(",\"SetUserId\":");
            x1 x1Var47 = this.w;
            sb.append(x1Var47 == null ? "null" : x1Var47.e());
            sb.append(",\"SetFeedbackListener\":");
            x1 x1Var48 = this.W;
            sb.append(x1Var48 == null ? "null" : x1Var48.e());
            sb.append(",\"Logger\":");
            x1 x1Var49 = this.Y;
            sb.append(x1Var49 == null ? "null" : x1Var49.e());
            sb.append(",\"SetInterceptCallback\":");
            x1 x1Var50 = this.Z;
            sb.append(x1Var50 == null ? "null" : x1Var50.e());
            sb.append(",\"SetCustomInterceptCallback\":");
            sb.append(this.Z == null ? "null" : this.a0.e());
            sb.append(",\"CustomInterceptTriggerCallback\":");
            x1 x1Var51 = this.b0;
            sb.append(x1Var51 == null ? "null" : x1Var51.e());
            sb.append(",\"SetFormCallback\":");
            x1 x1Var52 = this.c0;
            sb.append(x1Var52 == null ? "null" : x1Var52.e());
            sb.append(",\"SetFeedbackCallback\":");
            x1 x1Var53 = this.d0;
            sb.append(x1Var53 == null ? "null" : x1Var53.e());
            sb.append(",\"PreLoadMechanism\":");
            x1 x1Var54 = this.f0;
            sb.append(x1Var54 == null ? "null" : x1Var54.e());
            sb.append(",\"TargetEvaluator\":");
            x1 x1Var55 = this.g0;
            sb.append(x1Var55 == null ? "null" : x1Var55.e());
            sb.append(",\"NativeTargetEvaluator\":");
            x1 x1Var56 = this.h0;
            sb.append(x1Var56 == null ? "null" : x1Var56.e());
            sb.append(",\"InterceptMechanism\":");
            x1 x1Var57 = this.i0;
            sb.append(x1Var57 == null ? "null" : x1Var57.e());
            sb.append(",\"RestClient\":");
            x1 x1Var58 = this.j0;
            sb.append(x1Var58 == null ? "null" : x1Var58.e());
            sb.append(",\"InternalError\":");
            x1 x1Var59 = this.k0;
            sb.append(x1Var59 == null ? "null" : x1Var59.e());
            sb.append(",\"SetActivity\":");
            x1 x1Var60 = this.l0;
            sb.append(x1Var60 == null ? "null" : x1Var60.e());
            sb.append(",\"MedalliaCrash\":");
            x1 x1Var61 = this.m0;
            sb.append(x1Var61 == null ? "null" : x1Var61.e());
            sb.append(",\"InitOfflineMechanism\":");
            x1 x1Var62 = this.n0;
            sb.append(x1Var62 == null ? "null" : x1Var62.e());
            sb.append(",\"ResourcesSize\":");
            x1 x1Var63 = this.o0;
            sb.append(x1Var63 == null ? "null" : x1Var63.e());
            sb.append(",\"RestoreFromKillSDK\":");
            x1 x1Var64 = this.v0;
            sb.append(x1Var64 == null ? "null" : x1Var64.e());
            sb.append(",\"DeleteStorage\":");
            x1 x1Var65 = this.p0;
            sb.append(x1Var65 == null ? "null" : x1Var65.e());
            sb.append(",\"UpdateCustomLocale\":");
            x1 x1Var66 = this.p;
            sb.append(x1Var66 == null ? "null" : x1Var66.e());
            sb.append(",\"SetTouchEventListener\":");
            x1 x1Var67 = this.X;
            sb.append(x1Var67 == null ? "null" : x1Var67.e());
            sb.append(",\"TouchEventCallback\":");
            x1 x1Var68 = this.e0;
            sb.append(x1Var68 == null ? "null" : x1Var68.e());
            sb.append(",\"LoadingIndicatorShown\":");
            x1 x1Var69 = this.q0;
            sb.append(x1Var69 == null ? "null" : x1Var69.e());
            sb.append(",\"LoadingIndicatorClosed\":");
            x1 x1Var70 = this.r0;
            sb.append(x1Var70 == null ? "null" : x1Var70.e());
            sb.append(",\"LoadingIndicatorCompleted\":");
            x1 x1Var71 = this.s0;
            sb.append(x1Var71 == null ? "null" : x1Var71.e());
            sb.append(",\"LoadingIndicatorTimeout\":");
            x1 x1Var72 = this.t0;
            sb.append(x1Var72 == null ? "null" : x1Var72.e());
            sb.append(",\"AnalyticsSubmissionBlocked\":");
            x1 x1Var73 = this.u0;
            if (x1Var73 != null) {
                strE = x1Var73.e();
            }
            sb.append(strE);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public x1 x() {
        return this.i0;
    }

    public x1 y() {
        return this.k0;
    }

    public x1 z() {
        return this.m;
    }

    private boolean a(JSONObject jSONObject, String str) {
        return (jSONObject == null || !jSONObject.has(str) || jSONObject.isNull(str)) ? false : true;
    }
}
