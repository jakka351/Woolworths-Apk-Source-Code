package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AppData {

    /* renamed from: a, reason: collision with root package name */
    public final String f15261a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final DevelopmentPlatformProvider h;

    public AppData(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.f15261a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = developmentPlatformProvider;
    }
}
