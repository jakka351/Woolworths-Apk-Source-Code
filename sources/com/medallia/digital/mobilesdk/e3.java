package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* loaded from: classes6.dex */
class e3 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f16439a;
    private String b;
    private final boolean c;
    private boolean d;

    public enum a {
        swipeUp,
        swipeDown,
        swipeLeft,
        swipeRight,
        buttonClicked
    }

    public enum b {
        maybeLater,
        androidBackButton,
        timeoutPassed,
        refreshSession,
        disableIntercept,
        stopApi,
        showForm,
        handleNotification,
        closed
    }

    public enum c {
        No,
        StickyByConfiguration,
        StickyByGesture
    }

    public e3(c cVar, a aVar, boolean z) {
        this.b = aVar.toString();
        this.f16439a = cVar != null ? cVar.toString() : null;
        this.c = z;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f16439a;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvitationReason{stickyMode='");
        sb.append(this.f16439a);
        sb.append("', reason='");
        sb.append(this.b);
        sb.append("', actionButtonsEnabled='");
        sb.append(this.c);
        sb.append("', isDeferred='");
        return YU.a.k("'}", sb, this.d);
    }

    public e3(c cVar, b bVar, boolean z) {
        this.b = bVar.toString();
        this.f16439a = cVar != null ? cVar.toString() : null;
        this.c = z;
        this.d = true;
    }

    public e3(c cVar, boolean z) {
        this.f16439a = cVar != null ? cVar.toString() : null;
        this.c = z;
    }
}
