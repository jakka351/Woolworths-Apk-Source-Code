package com.swrve.sdk;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface ISwrveCommon {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SupportedUIMode {
        public static final SupportedUIMode d;
        public static final SupportedUIMode e;
        public static final /* synthetic */ SupportedUIMode[] f;

        static {
            SupportedUIMode supportedUIMode = new SupportedUIMode("MOBILE", 0);
            d = supportedUIMode;
            SupportedUIMode supportedUIMode2 = new SupportedUIMode("TV", 1);
            e = supportedUIMode2;
            f = new SupportedUIMode[]{supportedUIMode, supportedUIMode2};
        }

        public static SupportedUIMode valueOf(String str) {
            return (SupportedUIMode) Enum.valueOf(SupportedUIMode.class, str);
        }

        public static SupportedUIMode[] values() {
            return (SupportedUIMode[]) f.clone();
        }
    }

    String A();

    void C();

    void D(String str);

    void G(int i);

    void a();

    int b();

    File c(Context context);

    String d(String str);

    void e();

    void f(Context context, String str, ArrayList arrayList);

    String getApiKey();

    int getAppId();

    String getAppVersion();

    String getDeviceId();

    String getUserId();

    String h();

    String i();

    int p();

    void v(String str);

    void w();

    boolean x();

    SwrveNotificationConfig y();
}
