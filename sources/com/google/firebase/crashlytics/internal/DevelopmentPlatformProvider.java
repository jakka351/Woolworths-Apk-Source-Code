package com.google.firebase.crashlytics.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class DevelopmentPlatformProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15256a;
    public DevelopmentPlatform b = null;

    public class DevelopmentPlatform {

        /* renamed from: a, reason: collision with root package name */
        public final String f15257a;
        public final String b;

        public DevelopmentPlatform(DevelopmentPlatformProvider developmentPlatformProvider) throws Resources.NotFoundException, IOException {
            Context context = developmentPlatformProvider.f15256a;
            int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.unity_version", "string");
            Logger logger = Logger.f15258a;
            if (iD != 0) {
                this.f15257a = "Unity";
                String string = context.getResources().getString(iD);
                this.b = string;
                logger.e("Unity Editor version is: " + string);
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.f15257a = "Flutter";
                    this.b = null;
                    logger.e("Development platform is: Flutter");
                    return;
                } catch (IOException unused) {
                }
            }
            this.f15257a = null;
            this.b = null;
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f15256a = context;
    }

    public final String a() {
        if (this.b == null) {
            this.b = new DevelopmentPlatform(this);
        }
        return this.b.f15257a;
    }

    public final String b() {
        if (this.b == null) {
            this.b = new DevelopmentPlatform(this);
        }
        return this.b.b;
    }
}
