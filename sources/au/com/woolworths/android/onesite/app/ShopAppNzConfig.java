package au.com.woolworths.android.onesite.app;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumConfigData;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.braintree.MagnesEnvironment;
import au.com.woolworths.android.onesite.devicefingerprint.DeviceFingerprintConfigData;
import au.com.woolworths.android.onesite.mandy.MagicLinkConfigData;
import au.com.woolworths.android.onesite.notification.SwrveConfigData;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/app/ShopAppNzConfig;", "Lau/com/woolworths/android/onesite/appdata/AppConfig;", "", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ShopAppNzConfig implements AppConfig {
    public static final ShopAppNzConfig e;
    public static final ShopAppNzConfig f;
    public static final ShopAppNzConfig g;
    public static final ShopAppNzConfig h;
    public static final ShopAppNzConfig i;
    public static final /* synthetic */ ShopAppNzConfig[] j;
    public static final /* synthetic */ EnumEntries k;
    public final MagicLinkConfigData d = new MagicLinkConfigData(androidx.constraintlayout.core.state.a.s("olive-token", "b2xpdmVzdXBwb3J0QHdvb2x3b3J0aHMuY29tLmF1OjBsMXZlU3VwcDBydCgpIQ=="));

    static {
        ShopAppNzConfig shopAppNzConfig = new ShopAppNzConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppNzConfig.MOCK
            public final String l = "https://dev.mobile-api.woolworths.com.au/";
            public final String m = "https://dev2-cms.everyday.com.au/index.html#/redemption-settings";
            public final String n = "https://dev-apix.woolworths.com.au/phoenix/";
            public final String o = "launch-EN4baaee5f5d1849fca1b6d67dd819e476-development";
            public final SwrveConfigData p = new SwrveConfigData("general-EzrYVGklLL94WhmmHFks", 31944);
            public final String q = "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhcGlUb2tlblYyIiwiYXV0aFVybCI6Imh0dHBzOi8vbW9iaWxlc2RrLWF1LmthbXB5bGUuY29tL2FwaS92MS9hY2Nlc3NUb2tlbiIsImNyZWF0ZVRpbWUiOjE1ODE3MDEzMDk1NjgsImFwaVRva2VuVjJWZXJzaW9uIjoyLCJwcm9wZXJ0eUlkIjo2ODg4M30.TJRGuCklIC2XcyJIq9XmTpk7u2KMiq12jHVKPrLn9OsBcwjp5uZz-QjesYDkNSfLIRnq02dWh6tWuWOfz8UjZEPzVJd2ApAUl93z2fL3bLsSP-VsSal21DG3eg30CZwekDzFKnHexNcReHgAvruXTRpx9amc8K5Nbj59LWMANlYb554kzHnXDlpzVys5mqPF-oTm8BEufI0KQPoRgm1ntzwaYR1npE2as989HfdBgRPOePoagWFPwTnYKyGKTIVUO3_cH5P50TLxe3pzMTiRtJYeWJ1Y368NsDvOstkEUUFmVPGCLFsaeT5YXrtXvwnJB6d-vV5ClzwKveVWQZLvrA";
            public final String r = "";
            public final String s = "";
            public final String t = "ASHkLitCDE35BbkR5RSxe94Ezm6G8Sb9W1J1F5hzDppqVPo42BcCpnR4nOSbLe1a22fLsjYvgIsyf+NxeEak2YZ0u6hqIw0HNQB+VldxfwnYe0JRWjJCIAB8JSD+Ep4DiwLrV/4AbbwlGIUOU4Ubmhcg7e69spuyh5v8d64QZ7l+mCgqLnaQpWUCfCp+trsPltmSiYiX+NpC8+4jwMaYPXX7FgS3JCDrJ3Y6juf32zrzd6YzbVAEQnrqWxV1XzIxeWRH9REYkw5lKFcvgLaZkqd7SRRIJGd1kgb5LkCfL+0EGLzBepIyEvunW8UjXB1VMsChin5TlReN6cOQLlL2A6oqR/r4N1c3F0NeS2joqlzmk4v4RivRZ9/qrEpirqm+jSiXroDgcThew3PzDJ1JAKgwpM3HYtR/3xlBfnJpO4wWakHWL9TBEAdxMSq8OH8pMxgjkECu0thJjYvj8ZQ4loYmlFZCETJHemXHul8tE8SXLoPuWKa2Ah6zqah75GAvm4fztOssozvkL6CajQPRgxIKCVqJb1kygnrzlGwpUvf/jegEIxaXHU1YHi58MAfY0AW6UrD3FDy3TZbgSB0o9YqRqpwKO2Ma6sdrfBoaGJ0uX0mfDtOVVG8fGFfawuRYvHYCVLQ/7xL1AMqa2Ai1+bvwx0cN5O3BRLpbzVHwBOQQdL6ZiWgRGAq1s7ha9epTY5IF0/0ko9eVyC0r0alJIC7FVjebHrW8HmmsqqsHwNv0m4BqYuIAHGR3lw0TAWoO98h+BpcV25dHcbiIeNn490j7UzCIZZtzvLhgSJPYaGynvFMXWrr7syPK0hI=";
            public final DeviceFingerprintConfigData u = new DeviceFingerprintConfigData("1snn5n9w", "h.online-metrix.net");
            public final String v = "fbf18d79-ba8a-4853-ad38-989e0d4bbccc";
            public final MagnesEnvironment w = MagnesEnvironment.d;
            public final String x = "mockx/phoenix/mobile/";
            public final String y = "mockx/phoenix";

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: b, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: e, reason: from getter */
            public final SwrveConfigData getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: f, reason: from getter */
            public final String getV() {
                return this.v;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: l, reason: from getter */
            public final String getT() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: m, reason: from getter */
            public final DeviceFingerprintConfigData getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: o, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: p, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: q, reason: from getter */
            public final String getR() {
                return this.r;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: r, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: s, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: t, reason: from getter */
            public final MagnesEnvironment getW() {
                return this.w;
            }

            @Override // au.com.woolworths.android.onesite.app.ShopAppNzConfig, au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: u, reason: from getter */
            public final String getY() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.app.ShopAppNzConfig, au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: x, reason: from getter */
            public final String getX() {
                return this.x;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: y, reason: from getter */
            public final String getS() {
                return this.s;
            }
        };
        e = shopAppNzConfig;
        ShopAppNzConfig shopAppNzConfig2 = new ShopAppNzConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppNzConfig.TEST
            public final String l = "https://test-apix.woolworths.com.au/";
            public final String m = "https://dev2-cms.everyday.com.au/index.html#/redemption-settings";
            public final String n = "https://test-apix.woolworths.com.au/phoenix/";
            public final String o = "launch-EN4baaee5f5d1849fca1b6d67dd819e476-development";
            public final SwrveConfigData p = new SwrveConfigData("general-EzrYVGklLL94WhmmHFks", 31944);
            public final String q = "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhcGlUb2tlblYyIiwiYXV0aFVybCI6Imh0dHBzOi8vbW9iaWxlc2RrLWF1LmthbXB5bGUuY29tL2FwaS92MS9hY2Nlc3NUb2tlbiIsImNyZWF0ZVRpbWUiOjE1ODE3MDEzMDk1NjgsImFwaVRva2VuVjJWZXJzaW9uIjoyLCJwcm9wZXJ0eUlkIjo2ODg4M30.TJRGuCklIC2XcyJIq9XmTpk7u2KMiq12jHVKPrLn9OsBcwjp5uZz-QjesYDkNSfLIRnq02dWh6tWuWOfz8UjZEPzVJd2ApAUl93z2fL3bLsSP-VsSal21DG3eg30CZwekDzFKnHexNcReHgAvruXTRpx9amc8K5Nbj59LWMANlYb554kzHnXDlpzVys5mqPF-oTm8BEufI0KQPoRgm1ntzwaYR1npE2as989HfdBgRPOePoagWFPwTnYKyGKTIVUO3_cH5P50TLxe3pzMTiRtJYeWJ1Y368NsDvOstkEUUFmVPGCLFsaeT5YXrtXvwnJB6d-vV5ClzwKveVWQZLvrA";
            public final String r = "";
            public final String s = "";
            public final String t = "ASHkLitCDE35BbkR5RSxe94Ezm6G8Sb9W1J1F5hzDppqVPo42BcCpnR4nOSbLe1a22fLsjYvgIsyf+NxeEak2YZ0u6hqIw0HNQB+VldxfwnYe0JRWjJCIAB8JSD+Ep4DiwLrV/4AbbwlGIUOU4Ubmhcg7e69spuyh5v8d64QZ7l+mCgqLnaQpWUCfCp+trsPltmSiYiX+NpC8+4jwMaYPXX7FgS3JCDrJ3Y6juf32zrzd6YzbVAEQnrqWxV1XzIxeWRH9REYkw5lKFcvgLaZkqd7SRRIJGd1kgb5LkCfL+0EGLzBepIyEvunW8UjXB1VMsChin5TlReN6cOQLlL2A6oqR/r4N1c3F0NeS2joqlzmk4v4RivRZ9/qrEpirqm+jSiXroDgcThew3PzDJ1JAKgwpM3HYtR/3xlBfnJpO4wWakHWL9TBEAdxMSq8OH8pMxgjkECu0thJjYvj8ZQ4loYmlFZCETJHemXHul8tE8SXLoPuWKa2Ah6zqah75GAvm4fztOssozvkL6CajQPRgxIKCVqJb1kygnrzlGwpUvf/jegEIxaXHU1YHi58MAfY0AW6UrD3FDy3TZbgSB0o9YqRqpwKO2Ma6sdrfBoaGJ0uX0mfDtOVVG8fGFfawuRYvHYCVLQ/7xL1AMqa2Ai1+bvwx0cN5O3BRLpbzVHwBOQQdL6ZiWgRGAq1s7ha9epTY5IF0/0ko9eVyC0r0alJIC7FVjebHrW8HmmsqqsHwNv0m4BqYuIAHGR3lw0TAWoO98h+BpcV25dHcbiIeNn490j7UzCIZZtzvLhgSJPYaGynvFMXWrr7syPK0hI=";
            public final DeviceFingerprintConfigData u = new DeviceFingerprintConfigData("1snn5n9w", "h.online-metrix.net");
            public final String v = "fbf18d79-ba8a-4853-ad38-989e0d4bbccc";
            public final MagnesEnvironment w = MagnesEnvironment.d;

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: b, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: e, reason: from getter */
            public final SwrveConfigData getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: f, reason: from getter */
            public final String getV() {
                return this.v;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: l, reason: from getter */
            public final String getT() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: m, reason: from getter */
            public final DeviceFingerprintConfigData getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: o, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: p, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: q, reason: from getter */
            public final String getR() {
                return this.r;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: r, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: s, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: t, reason: from getter */
            public final MagnesEnvironment getW() {
                return this.w;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: y, reason: from getter */
            public final String getS() {
                return this.s;
            }
        };
        f = shopAppNzConfig2;
        ShopAppNzConfig shopAppNzConfig3 = new ShopAppNzConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppNzConfig.DEV
            public final String l = "https://dev-apix.woolworths.com.au/";
            public final String m = "https://dev2-cms.everyday.com.au/index.html#/redemption-settings";
            public final String n = "https://dev-apix.woolworths.com.au/phoenix/";
            public final String o = "launch-EN4baaee5f5d1849fca1b6d67dd819e476-development";
            public final SwrveConfigData p = new SwrveConfigData("general-EzrYVGklLL94WhmmHFks", 31944);
            public final String q = "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhcGlUb2tlblYyIiwiYXV0aFVybCI6Imh0dHBzOi8vbW9iaWxlc2RrLWF1LmthbXB5bGUuY29tL2FwaS92MS9hY2Nlc3NUb2tlbiIsImNyZWF0ZVRpbWUiOjE1ODE3MDEzMDk1NjgsImFwaVRva2VuVjJWZXJzaW9uIjoyLCJwcm9wZXJ0eUlkIjo2ODg4M30.TJRGuCklIC2XcyJIq9XmTpk7u2KMiq12jHVKPrLn9OsBcwjp5uZz-QjesYDkNSfLIRnq02dWh6tWuWOfz8UjZEPzVJd2ApAUl93z2fL3bLsSP-VsSal21DG3eg30CZwekDzFKnHexNcReHgAvruXTRpx9amc8K5Nbj59LWMANlYb554kzHnXDlpzVys5mqPF-oTm8BEufI0KQPoRgm1ntzwaYR1npE2as989HfdBgRPOePoagWFPwTnYKyGKTIVUO3_cH5P50TLxe3pzMTiRtJYeWJ1Y368NsDvOstkEUUFmVPGCLFsaeT5YXrtXvwnJB6d-vV5ClzwKveVWQZLvrA";
            public final String r = "";
            public final String s = "";
            public final String t = "ASHkLitCDE35BbkR5RSxe94Ezm6G8Sb9W1J1F5hzDppqVPo42BcCpnR4nOSbLe1a22fLsjYvgIsyf+NxeEak2YZ0u6hqIw0HNQB+VldxfwnYe0JRWjJCIAB8JSD+Ep4DiwLrV/4AbbwlGIUOU4Ubmhcg7e69spuyh5v8d64QZ7l+mCgqLnaQpWUCfCp+trsPltmSiYiX+NpC8+4jwMaYPXX7FgS3JCDrJ3Y6juf32zrzd6YzbVAEQnrqWxV1XzIxeWRH9REYkw5lKFcvgLaZkqd7SRRIJGd1kgb5LkCfL+0EGLzBepIyEvunW8UjXB1VMsChin5TlReN6cOQLlL2A6oqR/r4N1c3F0NeS2joqlzmk4v4RivRZ9/qrEpirqm+jSiXroDgcThew3PzDJ1JAKgwpM3HYtR/3xlBfnJpO4wWakHWL9TBEAdxMSq8OH8pMxgjkECu0thJjYvj8ZQ4loYmlFZCETJHemXHul8tE8SXLoPuWKa2Ah6zqah75GAvm4fztOssozvkL6CajQPRgxIKCVqJb1kygnrzlGwpUvf/jegEIxaXHU1YHi58MAfY0AW6UrD3FDy3TZbgSB0o9YqRqpwKO2Ma6sdrfBoaGJ0uX0mfDtOVVG8fGFfawuRYvHYCVLQ/7xL1AMqa2Ai1+bvwx0cN5O3BRLpbzVHwBOQQdL6ZiWgRGAq1s7ha9epTY5IF0/0ko9eVyC0r0alJIC7FVjebHrW8HmmsqqsHwNv0m4BqYuIAHGR3lw0TAWoO98h+BpcV25dHcbiIeNn490j7UzCIZZtzvLhgSJPYaGynvFMXWrr7syPK0hI=";
            public final DeviceFingerprintConfigData u = new DeviceFingerprintConfigData("1snn5n9w", "h.online-metrix.net");
            public final String v = "fbf18d79-ba8a-4853-ad38-989e0d4bbccc";
            public final MagnesEnvironment w = MagnesEnvironment.d;

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: b, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: e, reason: from getter */
            public final SwrveConfigData getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: f, reason: from getter */
            public final String getV() {
                return this.v;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: l, reason: from getter */
            public final String getT() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: m, reason: from getter */
            public final DeviceFingerprintConfigData getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: o, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: p, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: q, reason: from getter */
            public final String getR() {
                return this.r;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: r, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: s, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: t, reason: from getter */
            public final MagnesEnvironment getW() {
                return this.w;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: y, reason: from getter */
            public final String getS() {
                return this.s;
            }
        };
        g = shopAppNzConfig3;
        ShopAppNzConfig shopAppNzConfig4 = new ShopAppNzConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppNzConfig.UAT
            public final String l = "https://uat-apix.woolworths.com.au/";
            public final String m = "https://preprod-rewards.everyday.com.au/index.html#/redemption-settings";
            public final String n = "https://uat-apix.woolworths.com.au/phoenix/";
            public final String o = "launch-ENcde86197baba4c3f905d863117285f8c-staging";
            public final SwrveConfigData p = new SwrveConfigData("general-EzrYVGklLL94WhmmHFks", 31944);
            public final String q = "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhcGlUb2tlblYyIiwiYXV0aFVybCI6Imh0dHBzOi8vbW9iaWxlc2RrLWF1LmthbXB5bGUuY29tL2FwaS92MS9hY2Nlc3NUb2tlbiIsImNyZWF0ZVRpbWUiOjE1ODE3MDEzMDk1NjgsImFwaVRva2VuVjJWZXJzaW9uIjoyLCJwcm9wZXJ0eUlkIjo2ODg4M30.TJRGuCklIC2XcyJIq9XmTpk7u2KMiq12jHVKPrLn9OsBcwjp5uZz-QjesYDkNSfLIRnq02dWh6tWuWOfz8UjZEPzVJd2ApAUl93z2fL3bLsSP-VsSal21DG3eg30CZwekDzFKnHexNcReHgAvruXTRpx9amc8K5Nbj59LWMANlYb554kzHnXDlpzVys5mqPF-oTm8BEufI0KQPoRgm1ntzwaYR1npE2as989HfdBgRPOePoagWFPwTnYKyGKTIVUO3_cH5P50TLxe3pzMTiRtJYeWJ1Y368NsDvOstkEUUFmVPGCLFsaeT5YXrtXvwnJB6d-vV5ClzwKveVWQZLvrA";
            public final String r = "";
            public final String s = "";
            public final String t = "ASHkLitCDE35BbkR5RSxe94Ezm6G8Sb9W1J1F5hzDppqVPo42BcCpnR4nOSbLe1a22fLsjYvgIsyf+NxeEak2YZ0u6hqIw0HNQB+VldxfwnYe0JRWjJCIAB8JSD+Ep4DiwLrV/4AbbwlGIUOU4Ubmhcg7e69spuyh5v8d64QZ7l+mCgqLnaQpWUCfCp+trsPltmSiYiX+NpC8+4jwMaYPXX7FgS3JCDrJ3Y6juf32zrzd6YzbVAEQnrqWxV1XzIxeWRH9REYkw5lKFcvgLaZkqd7SRRIJGd1kgb5LkCfL+0EGLzBepIyEvunW8UjXB1VMsChin5TlReN6cOQLlL2A6oqR/r4N1c3F0NeS2joqlzmk4v4RivRZ9/qrEpirqm+jSiXroDgcThew3PzDJ1JAKgwpM3HYtR/3xlBfnJpO4wWakHWL9TBEAdxMSq8OH8pMxgjkECu0thJjYvj8ZQ4loYmlFZCETJHemXHul8tE8SXLoPuWKa2Ah6zqah75GAvm4fztOssozvkL6CajQPRgxIKCVqJb1kygnrzlGwpUvf/jegEIxaXHU1YHi58MAfY0AW6UrD3FDy3TZbgSB0o9YqRqpwKO2Ma6sdrfBoaGJ0uX0mfDtOVVG8fGFfawuRYvHYCVLQ/7xL1AMqa2Ai1+bvwx0cN5O3BRLpbzVHwBOQQdL6ZiWgRGAq1s7ha9epTY5IF0/0ko9eVyC0r0alJIC7FVjebHrW8HmmsqqsHwNv0m4BqYuIAHGR3lw0TAWoO98h+BpcV25dHcbiIeNn490j7UzCIZZtzvLhgSJPYaGynvFMXWrr7syPK0hI=";
            public final DeviceFingerprintConfigData u = new DeviceFingerprintConfigData("1snn5n9w", "h.online-metrix.net");
            public final String v = "fbf18d79-ba8a-4853-ad38-989e0d4bbccc";
            public final MagnesEnvironment w = MagnesEnvironment.d;

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: b, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: e, reason: from getter */
            public final SwrveConfigData getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: f, reason: from getter */
            public final String getV() {
                return this.v;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: l, reason: from getter */
            public final String getT() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: m, reason: from getter */
            public final DeviceFingerprintConfigData getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: o, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: p, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: q, reason: from getter */
            public final String getR() {
                return this.r;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: r, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: s, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: t, reason: from getter */
            public final MagnesEnvironment getW() {
                return this.w;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: y, reason: from getter */
            public final String getS() {
                return this.s;
            }
        };
        h = shopAppNzConfig4;
        ShopAppNzConfig shopAppNzConfig5 = new ShopAppNzConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppNzConfig.PRODUCTION
            public final String l = "https://prod-apix.woolworths.com.au/";
            public final String m = "https://www.everyday.com.au/index.html#/redemption-settings";
            public final String n = "https://prod-apix.woolworths.com.au/phoenix/";
            public final String o = "launch-EN9c6288cdbc464411a0693b36e92589d9";
            public final SwrveConfigData p = new SwrveConfigData("general-RUVEtzkx3a9ijV7uI5b", 31895);
            public final String q = "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhcGlUb2tlblYyIiwiYXV0aFVybCI6Imh0dHBzOi8vbW9iaWxlc2RrLWF1LmthbXB5bGUuY29tL2FwaS92MS9hY2Nlc3NUb2tlbiIsImNyZWF0ZVRpbWUiOjE1ODE3MDEzMDk1NjgsImFwaVRva2VuVjJWZXJzaW9uIjoyLCJwcm9wZXJ0eUlkIjo2ODg4M30.TJRGuCklIC2XcyJIq9XmTpk7u2KMiq12jHVKPrLn9OsBcwjp5uZz-QjesYDkNSfLIRnq02dWh6tWuWOfz8UjZEPzVJd2ApAUl93z2fL3bLsSP-VsSal21DG3eg30CZwekDzFKnHexNcReHgAvruXTRpx9amc8K5Nbj59LWMANlYb554kzHnXDlpzVys5mqPF-oTm8BEufI0KQPoRgm1ntzwaYR1npE2as989HfdBgRPOePoagWFPwTnYKyGKTIVUO3_cH5P50TLxe3pzMTiRtJYeWJ1Y368NsDvOstkEUUFmVPGCLFsaeT5YXrtXvwnJB6d-vV5ClzwKveVWQZLvrA";
            public final String r = "";
            public final String s = "";
            public final String t = "ASZOCJmBDYg4IEiCpCUmw8gjCMdi2QJ3nnrwfPBWtn9jQnNvaSPj96tpE4IOX7fUvVwFTTgfeO2RN5eK5wePc74KEPYSciUR9m29OUxONBKkY679TiJH5DYnZueyPpJyjjIRBgvipgwBCwWqvu+UdVdVcqHzmcm+DYUqFyes3PgiWYtTasp7in9sLt+ItvBdUt/iRTV756uXVzf1vd3NBPO14qubTCMjbpttY5w0V89tYzTDMzVRC1UcGrUPhgjQhcP5cSo+XaeTBgCCdMZuyqH1ocaBACXkcm9B6T05mfWegj8/eBRZ5Kju3bD97OAmxgLMokZo+HLwInZdEGJjnnfY3nb9LiEo7P5n6URQ2Pg54dy6tHHsPo0gdVQniKvs1GiqItxTr31vszD40hZ63nradoYGRPzkjM5bC+du5+P82cxIUvTncBmSa33wZdyUSjJy2jgflmtUaS1aCDQ465F7hIG6vq/g/QRwqWF5rutyDPMDjO25ltxYAYxNEsT6RgNngtD3LADEq/uvUzRofiX74MX56X4aK22gmEcuI0xhbo92jJP1go2YxiSkwQhpbZiWjM0jqyLolvOkIcUevI7IE/2VrscxA5fvXy8BHLy5nTUeGXZiSkbY6QozRUzyx6YpAzkIgVFnlCLOaSkRAJj3f8sda9IayHNscK3LMM3NOq+gaAf6wySvNXVHgGVO7PPGIV2d7b8u+039f/ME7f021eH9w0jTg9872g9MO3PgyQfgtjhNGOttWI7L7ZTQ6lWE+3N8B+SMzq0SjGyvj8QBqQ03DRHsKJtruuqmpEck";
            public final DeviceFingerprintConfigData u = new DeviceFingerprintConfigData("k8vif92e", "tm.cybersource.com");
            public final String v = "0005a7ac-f8ea-412c-92e1-22219cd5075e";
            public final MagnesEnvironment w = MagnesEnvironment.e;

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: b, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: e, reason: from getter */
            public final SwrveConfigData getP() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: f, reason: from getter */
            public final String getV() {
                return this.v;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: l, reason: from getter */
            public final String getT() {
                return this.t;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: m, reason: from getter */
            public final DeviceFingerprintConfigData getU() {
                return this.u;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: o, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: p, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: q, reason: from getter */
            public final String getR() {
                return this.r;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: r, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: s, reason: from getter */
            public final String getQ() {
                return this.q;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: t, reason: from getter */
            public final MagnesEnvironment getW() {
                return this.w;
            }

            @Override // au.com.woolworths.android.onesite.appdata.AppConfig
            /* renamed from: y, reason: from getter */
            public final String getS() {
                return this.s;
            }
        };
        i = shopAppNzConfig5;
        ShopAppNzConfig[] shopAppNzConfigArr = {shopAppNzConfig, shopAppNzConfig2, shopAppNzConfig3, shopAppNzConfig4, shopAppNzConfig5};
        j = shopAppNzConfigArr;
        k = EnumEntriesKt.a(shopAppNzConfigArr);
    }

    public ShopAppNzConfig(String str, int i2) {
    }

    public static ShopAppNzConfig valueOf(String str) {
        return (ShopAppNzConfig) Enum.valueOf(ShopAppNzConfig.class, str);
    }

    public static ShopAppNzConfig[] values() {
        return (ShopAppNzConfig[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    public final String a() {
        return "v1/";
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    public final TealiumConfigData c() {
        TrackableValue trackableValue = TrackableValue.e;
        return new TealiumConfigData("woolworths", "woolworths", "supermarkets-app", "7n58ym", "user.ShopperID", Integer.valueOf(com.woolworths.R.string.SHOP_BRANCH_API_KEY), Integer.valueOf(com.woolworths.R.string.SHOP_BRANCH_API_KEY_TEST));
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: n, reason: from getter */
    public final MagicLinkConfigData getD() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: u */
    public String getY() {
        return "phoenix";
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    public final String w() {
        return "/wow/v1/pay/instore";
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: x */
    public String getX() {
        return "phoenix/mobile/";
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    public final String z() {
        return d();
    }
}
