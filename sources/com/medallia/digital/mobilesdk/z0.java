package com.medallia.digital.mobilesdk;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16788a = new a(null);

    @NotNull
    private static final String b = "medallia_df_session_id";

    @NotNull
    private static final String c = "com.google.firebase.crashlytics.FirebaseCrashlytics";

    public static final class a {
        private a() {
        }

        @JvmStatic
        public final void a(@NotNull String sessionId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            String strF;
            String strConcat;
            Intrinsics.h(sessionId, "sessionId");
            try {
                Object objInvoke = FirebaseCrashlytics.class.getMethod("getInstance", null).invoke(null, null);
                if (objInvoke != null) {
                    a4.b("Trying to inject custom key: medallia_df_session_id with value: ".concat(sessionId));
                    FirebaseCrashlytics.class.getMethod("setCustomKey", String.class, String.class).invoke(objInvoke, z0.b, sessionId);
                    strConcat = "Successfully injected custom key: medallia_df_session_id with value: ".concat(sessionId);
                } else {
                    strConcat = "Crashlytics instance was null. Skipping medallia_df_session_id custom key injection";
                }
                a4.b(strConcat);
            } catch (ClassNotFoundException unused) {
                strF = "Crashlytics was not detected. Skipping medallia_df_session_id custom key injection";
                a4.b(strF);
            } catch (Exception e) {
                strF = YU.a.f(e, new StringBuilder("medallia_df_session_id custom key injection failed. Error message: "));
                a4.b(strF);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f16788a.a(str);
    }
}
