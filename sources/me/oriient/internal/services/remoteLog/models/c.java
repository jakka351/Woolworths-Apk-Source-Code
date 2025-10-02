package me.oriient.internal.services.remoteLog.models;

import androidx.compose.ui.platform.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25541a;

    public static String a(String str) {
        return i.a(')', "BatchId(value=", str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && Intrinsics.c(this.f25541a, ((c) obj).f25541a);
    }

    public final int hashCode() {
        return this.f25541a.hashCode();
    }

    public final String toString() {
        return a(this.f25541a);
    }
}
