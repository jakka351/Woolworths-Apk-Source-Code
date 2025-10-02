package com.medallia.digital.mobilesdk;

import android.content.Intent;

/* loaded from: classes6.dex */
final class Broadcasts {
    protected static final String PROPERTY_ID_CHANGE = "com.medallia.digital.mobilesdk.PROPERTY_ID_CHANGE";
    protected static final String PROPERTY_ID_VALUE = "com.medallia.digital.mobilesdk.PROPERTY_ID_VALUE";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16331a = "com.medallia.digital.mobilesdk.MedalliaFullFormActivity";
        protected static final String b = "com.medallia.digital.mobilesdk.MedalliaModalFormActivity";
        protected static final String c = "com.medallia.digital.mobilesdk.form_data";
        protected static final String d = "com.medallia.digital.mobilesdk.is_show_form";
        protected static final String e = "com.medallia.digital.mobilesdk.is_form_available";
        protected static final String f = "com.medallia.digital.mobilesdk.spinner_delay";
        protected static final String g = "com.medallia.digital.mobilesdk.vuln_enabled";
        protected static final String h = "com.medallia.digital.mobilesdk.FinishInvitationActivity";
        protected static final String i = "com.medallia.digital.mobilesdk.show_invitation_start_time";
        protected static final String j = "com.medallia.digital.mobilesdk.inherit_orientation";
        protected static final String k = "com.medallia.digital.mobilesdk.remove_task";
        protected static final String l = "com.medallia.digital.mobilesdk.form_preview_data";
        protected static final String m = "com.medallia.digital.mobilesdk.form_is_preview_app";
        protected static final String n = "com.medallia.digital.mobilesdk.form_header_palette";
        protected static final String o = "com.medallia.digital.mobilesdk.user_media_capture_conf";
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16332a = "com.medallia.digital.mobilesdk.custom_intercept_action";
        protected static final String b = "com.medallia.digital.mobilesdk.extra_form_preload_timestamp";
        protected static final String c = "com.medallia.digital.mobilesdk.extra_engagement_id";
        protected static final String d = "com.medallia.digital.mobilesdk.extra_target_evaluation_timestamp";
        protected static final String e = "com.medallia.digital.mobilesdk.extra_custom_intercept_command";
        protected static final String f = "com.medallia.digital.mobilesdk.extra_engagement_type";
        protected static final String g = "com.medallia.digital.mobilesdk.extra_payload";

        public enum a {
            TargetEvaluationSuccess
        }

        public static void a(a aVar, String str, long j, long j2, MDEngagementType mDEngagementType, MDCustomInterceptPayload mDCustomInterceptPayload) {
            Intent intent = new Intent(f16332a);
            intent.putExtra(e, aVar);
            intent.putExtra(c, str);
            intent.putExtra(b, j);
            intent.putExtra(d, j2);
            intent.putExtra(f, mDEngagementType);
            intent.putExtra(g, mDCustomInterceptPayload);
            q4.a(i4.c().b()).a(intent);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16334a = "com.medallia.digital.mobilesdk.file_action";
        protected static final String b = "com.medallia.digital.mobilesdk.extra_file_path";
        protected static final String c = "com.medallia.digital.mobilesdk.extra_IS_DELETED";
        protected static final String d = "com.medallia.digital.mobilesdk.extra_files_command";

        public enum a {
            fileDeleted
        }

        public static void a(a aVar, String str, boolean z) {
            Intent intent = new Intent(f16334a);
            intent.putExtra(d, aVar);
            intent.putExtra(b, str);
            intent.putExtra(c, z);
            q4.a(i4.c().b()).a(intent);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16336a = "com.medallia.digital.mobilesdk.form_action";
        protected static final String b = "com.medallia.digital.mobilesdk.feedback_action";
        protected static final String c = "com.medallia.digital.mobilesdk.invitation_action";
        protected static final String d = "com.medallia.digital.mobilesdk.feedback_preview_action";
        protected static final String e = "com.medallia.digital.mobilesdk.extra_option";
        protected static final String f = "com.medallia.digital.mobilesdk.extra_timestamp";
        protected static final String g = "com.medallia.digital.mobilesdk.extra_form_id";
        protected static final String h = "com.medallia.digital.mobilesdk.extra_form_view_type";
        protected static final String i = "com.medallia.digital.mobilesdk.extra_form_locale_set";
        protected static final String j = "com.medallia.digital.mobilesdk.extra_form_locale_display";
        protected static final String k = "com.medallia.digital.mobilesdk.extra_form_trigger_type";
        protected static final String l = "com.medallia.digital.mobilesdk.extra_reason";
        protected static final String m = "com.medallia.digital.mobilesdk.extra_form_url";
        protected static final String n = "com.medallia.digital.mobilesdk.extra_form_time_to_display";
        protected static final String o = "com.medallia.digital.mobilesdk.extra_feedback_payload";
        protected static final String p = "com.medallia.digital.mobilesdk.extra_feedback_id";
        protected static final String q = "com.medallia.digital.mobilesdk.extra_thank_you_prompt_button_display";
        protected static final String r = "com.medallia.digital.mobilesdk.extra_thank_you_prompt_image_display";
        protected static final String s = "com.medallia.digital.mobilesdk.extra_form_header_appearance_set";
        protected static final String t = "com.medallia.digital.mobilesdk.extra_form_header_appearance_display";

        public enum a {
            codeFormReady,
            formSubmitted,
            formDismissed,
            formClosed,
            formDisplayed,
            formLinkSelected,
            formBlockedUrl,
            feedbackPayload,
            formThankYouPrompt
        }

        /* loaded from: classes6.dex */
        public enum b {
            invitationDisplayed,
            invitationAccepted,
            invitationDeclined,
            invitationDeferred
        }

        public static void a(a aVar, String str) {
            Intent intent = new Intent(d);
            intent.putExtra(e, aVar);
            intent.putExtra(g, str);
            if (i4.c().b() != null && i4.c().b().getPackageName() != null) {
                intent.setPackage(i4.c().b().getPackageName());
            }
            i4.c().b().sendBroadcast(intent);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType) {
            a(aVar, str, formTriggerType, null, 0L, null, null, null, null);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType, long j2) {
            a(aVar, str, formTriggerType, null, j2, null, null, null, null);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType) {
            a(aVar, str, formTriggerType, formViewType, 0L, null, null, null, null);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j2, String str2, String str3, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            a(aVar, str, formTriggerType, formViewType, null, j2, str2, str3, null, null, mDAppearanceMode, mDAppearanceMode2);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, String str2, long j2, String str3, String str4, Boolean bool, Boolean bool2, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            Intent intent = new Intent(f16336a);
            intent.putExtra(e, aVar);
            intent.putExtra(g, str);
            intent.putExtra(k, formTriggerType);
            intent.putExtra(f, System.currentTimeMillis());
            intent.putExtra(n, j2);
            intent.putExtra(h, formViewType);
            intent.putExtra(i, str3);
            intent.putExtra(j, str4);
            if (str2 != null) {
                intent.putExtra(m, str2);
            }
            if (aVar == a.formThankYouPrompt) {
                intent.putExtra(q, bool);
                intent.putExtra(r, bool2);
                intent.putExtra(s, mDAppearanceMode);
                intent.putExtra(t, mDAppearanceMode2);
            }
            if (aVar == a.formDisplayed && mDAppearanceMode != null && mDAppearanceMode2 != null) {
                intent.putExtra(s, mDAppearanceMode);
                intent.putExtra(t, mDAppearanceMode2);
            }
            q4.a(i4.c().b()).a(intent);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, boolean z, boolean z2, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            a(aVar, str, formTriggerType, formViewType, null, 0L, null, null, Boolean.valueOf(z), Boolean.valueOf(z2), mDAppearanceMode, mDAppearanceMode2);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType, String str2) {
            a(aVar, str, formTriggerType, null, str2, 0L, null, null, null, null, null, null);
        }

        public static void a(a aVar, String str, FormTriggerType formTriggerType, String str2, String str3) {
            Intent intent = new Intent(b);
            intent.putExtra(e, aVar);
            intent.putExtra(g, str);
            intent.putExtra(k, formTriggerType);
            intent.putExtra(f, System.currentTimeMillis());
            intent.putExtra(p, str2);
            intent.putExtra(o, str3);
            q4.a(i4.c().b()).a(intent);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16339a = "com.medallia.digital.mobilesdk.intercept_action";
        protected static final String b = "com.medallia.digital.mobilesdk.extra_timestamp";
        protected static final String c = "com.medallia.digital.mobilesdk.extra_id";
        protected static final String d = "com.medallia.digital.mobilesdk.extra_reason";
        protected static final String e = "com.medallia.digital.mobilesdk.extra_intercept_command";
        protected static final String f = "com.medallia.digital.mobilesdk.extra_engagement_type";
        protected static final String g = "com.medallia.digital.mobilesdk.extra_invite_type";
        protected static final String h = "com.medallia.digital.mobilesdk.extra_intercept_appearance_set";
        protected static final String i = "com.medallia.digital.mobilesdk.extra_intercept_appearance_display";

        public enum a {
            interceptDisplayed,
            interceptAccepted,
            interceptDeclined,
            interceptDeferred,
            interceptClosed,
            interceptTriggered
        }

        public static void a(a aVar, String str) {
            a(aVar, str, null, null, null, null, null);
        }

        public static void a(a aVar, String str, String str2, MDEngagementType mDEngagementType, e3 e3Var) {
            a(aVar, str, str2, mDEngagementType, e3Var, null, null);
        }

        public static void a(a aVar, String str, String str2, MDEngagementType mDEngagementType, e3 e3Var, MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
            Intent intent = new Intent(f16339a);
            intent.putExtra(e, aVar);
            intent.putExtra(c, str);
            intent.putExtra(b, System.currentTimeMillis());
            intent.putExtra(f, mDEngagementType);
            intent.putExtra(g, str2);
            if (e3Var != null) {
                intent.putExtra(d, e3Var);
            }
            if (aVar == a.interceptDisplayed && mDAppearanceMode != null && mDAppearanceMode2 != null) {
                intent.putExtra(h, mDAppearanceMode);
                intent.putExtra(i, mDAppearanceMode2);
            }
            q4.a(i4.c().b()).a(intent);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16341a = "com.medallia.digital.mobilesdk.localization_action";
        protected static final String b = "com.medallia.digital.mobilesdk.extra_error";
        protected static final String c = "com.medallia.digital.mobilesdk.extra_success";

        public static void a() {
            Intent intent = new Intent(f16341a);
            intent.putExtra(c, "");
            q4.a(i4.c().b()).a(intent);
        }

        public static void a(MDExternalError mDExternalError) {
            Intent intent = new Intent(f16341a);
            intent.putExtra(b, mDExternalError);
            q4.a(i4.c().b()).a(intent);
        }

        public static void a(String str) {
            Intent intent = new Intent(f16341a);
            intent.putExtra(c, str);
            q4.a(i4.c().b()).a(intent);
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16342a = "com.medallia.digital.mobilesdk.SESSION_STARTED";
        protected static final String b = "com.medallia.digital.mobilesdk.SESSION_NUMBER_VALUE";
        protected static final String c = "com.medallia.digital.mobilesdk.SESSION_ID_VALUE";
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16343a = "com.medallia.digital.mobilesdk.sync_userjourney_action";
        protected static final String b = "com.medallia.digital.mobilesdk.extra_trigger";

        public enum a {
            submitFeedback,
            invitationDisplayed,
            promptDisplayed,
            promptAccepted,
            formDisplayed
        }

        public static void a(a aVar) {
            Intent intent = new Intent(f16343a);
            intent.putExtra(b, aVar.toString());
            q4.a(i4.c().b()).a(intent);
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16345a = "com.medallia.digital.mobilesdk.EvaluateReceiverFilter";
        protected static final String b = "com.medallia.digital.mobilesdk.EvaluateReceiverInitiator";
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        protected static final String f16346a = "com.medallia.digital.mobilesdk.extra_touch_event_command";
        protected static final String b = "com.medallia.digital.mobilesdk.extra_motion_event_action";
        protected static final String c = "com.medallia.digital.mobilesdk.touch_event_action";

        public enum a {
            TouchEvent
        }

        public static void a(a aVar, int i) {
            Intent intent = new Intent(c);
            intent.putExtra(f16346a, aVar);
            intent.putExtra(b, i);
            q4.a(i4.c().b()).a(intent);
        }
    }
}
