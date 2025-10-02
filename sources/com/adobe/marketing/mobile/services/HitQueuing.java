package com.adobe.marketing.mobile.services;

import com.adobe.marketing.mobile.MobilePrivacyStatus;

/* loaded from: classes.dex */
public abstract class HitQueuing {

    /* renamed from: com.adobe.marketing.mobile.services.HitQueuing$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13231a;

        static {
            int[] iArr = new int[MobilePrivacyStatus.values().length];
            f13231a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13231a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract boolean d(DataEntity dataEntity);

    public abstract void e();
}
