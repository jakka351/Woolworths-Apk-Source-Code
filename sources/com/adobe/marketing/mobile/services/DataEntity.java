package com.adobe.marketing.mobile.services;

import java.util.Date;

/* loaded from: classes.dex */
public final class DataEntity {

    /* renamed from: a, reason: collision with root package name */
    public final String f13229a;
    public final Date b;
    public final String c;

    public DataEntity(String str, String str2, Date date) {
        this.f13229a = str;
        this.b = date;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataEntity{uniqueIdentifier='");
        sb.append(this.f13229a);
        sb.append("', timeStamp=");
        sb.append(this.b);
        sb.append(", data=");
        return androidx.camera.core.impl.b.r(sb, this.c, '}');
    }
}
