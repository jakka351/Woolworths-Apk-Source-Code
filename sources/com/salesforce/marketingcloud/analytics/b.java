package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16840a = "~!AnalyticItem";
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 10;
    public static final int j = 11;
    public static final int k = 12;
    public static final int l = 13;
    public static final int m = 14;
    public static final int n = 15;
    public static final int o = 16;
    public static final int p = 17;
    public static final int q = 88888;
    public static final int r = 888;
    public static final int s = 8888;
    public static final List<Integer> t = Collections.unmodifiableList(Arrays.asList(3, 14));
    public static final int u = 0;
    public static final int v = 1;
    private String A;
    private int B;
    private int C;
    private boolean D;
    private String E;
    private String F;
    private final String G;
    private final Date w;
    private final int x;
    private final int y;
    private final List<String> z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @SuppressLint
    /* renamed from: com.salesforce.marketingcloud.analytics.b$b, reason: collision with other inner class name */
    public @interface InterfaceC0349b {
    }

    private b(Date date, int i2, int i3, List<String> list, String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        this.z = arrayList;
        this.w = (Date) com.salesforce.marketingcloud.util.j.a(date, "The Date is null.");
        com.salesforce.marketingcloud.util.j.a(i2 == 0 || i2 == 1, "The Product Type must be one of AnalyticProductType");
        this.x = i2;
        com.salesforce.marketingcloud.util.j.a(i3 > 0, "AnalyticType must be a valid int > 0.");
        this.y = i3;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        this.G = str;
        this.F = a(str2);
        this.D = z;
    }

    public int a() {
        return this.y;
    }

    public Date b() {
        return this.w;
    }

    public String c() {
        return this.F;
    }

    public int d() {
        return this.B;
    }

    public String e() {
        return this.E;
    }

    @Nullable
    public String f() {
        return this.A;
    }

    public int g() {
        return this.C;
    }

    public boolean h() {
        return this.D;
    }

    public List<String> i() {
        List<String> list;
        synchronized (this.z) {
            list = this.z;
        }
        return list;
    }

    public int j() {
        return this.x;
    }

    public String k() {
        return this.G;
    }

    private String a(@Nullable String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = this.G;
            if (str2 != null) {
                jSONObject.put("requestId", str2);
            }
        } catch (JSONException e2) {
            com.salesforce.marketingcloud.g.e(f16840a, e2, "unable to build et json payload", new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            return jSONObject.toString();
        }
        jSONObject.put("propertyBag", new JSONObject(str));
        return jSONObject.toString();
    }

    public void b(String str) {
        this.F = str;
    }

    public void c(String str) {
        this.E = str;
    }

    public void d(@Nullable @Size String str) {
        this.A = str;
    }

    @RestrictTo
    public static b a(@NonNull Date date, int i2, int i3) {
        return a(date, i2, i3, Collections.EMPTY_LIST, null, false);
    }

    public void b(int i2) {
        this.C = i2;
    }

    @RestrictTo
    public static b a(@NonNull Date date, int i2, int i3, @NonNull NotificationMessage notificationMessage, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(notificationMessage.id());
        Region region = notificationMessage.region();
        if (region != null) {
            arrayList.add(region.id());
        }
        return new b(date, i2, i3, arrayList, notificationMessage.requestId(), z, notificationMessage.propertyBag());
    }

    @RestrictTo
    public static b a(@NonNull Date date, int i2, int i3, List<String> list, String str, boolean z) {
        return new b(date, i2, i3, list, str, z, null);
    }

    @RestrictTo
    public static b a(@NonNull Date date, int i2, int i3, List<String> list, boolean z) {
        return a(date, i2, i3, list, null, z);
    }

    public void a(int i2) {
        this.B = i2;
    }

    public void a(boolean z) {
        this.D = z;
    }
}
