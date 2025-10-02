package com.salesforce.marketingcloud.analytics.stats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.g;
import java.util.Date;
import org.json.JSONException;

@RestrictTo
/* loaded from: classes6.dex */
public class b {
    public static final int f = 100;
    public static final int g = 101;
    public static final int h = 102;
    public static final int i = 103;
    public static final int j = 104;
    public static final int k = 105;
    public static final int l = 106;
    public static final int m = 107;

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    d f16851a;
    private Integer b;
    private int c;
    private Date d;
    private boolean e;

    private b(Integer num, int i2, Date date, d dVar, boolean z) {
        this.b = num;
        this.c = i2;
        this.d = date;
        this.f16851a = dVar;
        this.e = z;
    }

    @NonNull
    public static b a(int i2, @NonNull Date date, @NonNull d dVar, boolean z) {
        return new b(null, i2, date, dVar, z);
    }

    @Nullable
    public Integer b() {
        return this.b;
    }

    @NonNull
    public d c() {
        return this.f16851a;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public void a(@NonNull Date date) {
        int time = (int) ((date.getTime() - this.d.getTime()) / 1000.0d);
        if (time <= 0) {
            time = 1;
        }
        try {
            this.f16851a.b(time);
            this.e = true;
        } catch (JSONException e) {
            g.b(c.k, e, "Unable to finalize event [%d]", Integer.valueOf(this.c));
        }
    }

    @NonNull
    public static b a(int i2, int i3, @NonNull Date date, @NonNull d dVar, boolean z) {
        return new b(Integer.valueOf(i2), i3, date, dVar, z);
    }

    @NonNull
    public Date a() {
        return this.d;
    }

    @RestrictTo
    public void a(boolean z) {
        this.e = z;
    }
}
