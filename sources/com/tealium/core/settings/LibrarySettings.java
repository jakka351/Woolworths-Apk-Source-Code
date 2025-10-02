package com.tealium.core.settings;

import com.tealium.core.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/settings/LibrarySettings;", "", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final /* data */ class LibrarySettings {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19178a;
    public boolean b;
    public Batching c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public LogLevel h;
    public String i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/settings/LibrarySettings$a;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
    }

    public LibrarySettings() {
        Batching batching = new Batching();
        this.f19178a = true;
        this.b = true;
        this.c = batching;
        this.d = false;
        this.e = false;
        this.f = 900;
        this.g = false;
        this.h = LogLevel.PROD;
        this.i = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibrarySettings)) {
            return false;
        }
        LibrarySettings librarySettings = (LibrarySettings) obj;
        return this.f19178a == librarySettings.f19178a && this.b == librarySettings.b && Intrinsics.c(this.c, librarySettings.c) && this.d == librarySettings.d && this.e == librarySettings.e && this.f == librarySettings.f && this.g == librarySettings.g && this.h == librarySettings.h && Intrinsics.c(this.i, librarySettings.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public final int hashCode() {
        boolean z = this.f19178a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r3 = this.b;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        int iHashCode = (this.c.hashCode() + ((i + i2) * 31)) * 31;
        ?? r02 = this.d;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode + i3) * 31;
        ?? r03 = this.e;
        int i5 = r03;
        if (r03 != 0) {
            i5 = 1;
        }
        int iA = androidx.camera.core.impl.b.a(this.f, (i4 + i5) * 31, 31);
        boolean z2 = this.g;
        int iHashCode2 = (this.h.hashCode() + ((iA + (z2 ? 1 : z2 ? 1 : 0)) * 31)) * 31;
        String str = this.i;
        return iHashCode2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        boolean z = this.f19178a;
        boolean z2 = this.b;
        Batching batching = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        int i = this.f;
        boolean z5 = this.g;
        LogLevel logLevel = this.h;
        String str = this.i;
        StringBuilder sbV = androidx.camera.core.impl.b.v("LibrarySettings(collectDispatcherEnabled=", ", tagManagementDispatcherEnabled=", ", batching=", z, z2);
        sbV.append(batching);
        sbV.append(", batterySaver=");
        sbV.append(z3);
        sbV.append(", wifiOnly=");
        sbV.append(z4);
        sbV.append(", refreshInterval=");
        sbV.append(i);
        sbV.append(", disableLibrary=");
        sbV.append(z5);
        sbV.append(", logLevel=");
        sbV.append(logLevel);
        sbV.append(", etag=");
        return YU.a.o(sbV, str, ")");
    }
}
