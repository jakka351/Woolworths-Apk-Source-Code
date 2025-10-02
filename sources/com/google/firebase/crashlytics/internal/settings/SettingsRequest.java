package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.IdManager;

/* loaded from: classes.dex */
class SettingsRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f15400a;
    public final String b;
    public final String c;
    public final String d;
    public final IdManager e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;

    public SettingsRequest(String str, String str2, String str3, String str4, IdManager idManager, String str5, String str6, String str7, int i) {
        this.f15400a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = idManager;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = i;
    }
}
