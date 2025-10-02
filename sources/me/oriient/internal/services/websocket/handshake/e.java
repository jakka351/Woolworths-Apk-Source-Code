package me.oriient.internal.services.websocket.handshake;

import java.util.TreeMap;

/* loaded from: classes7.dex */
public abstract class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f25676a = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    public final String a(String str) {
        String str2 = (String) this.f25676a.get(str);
        return str2 == null ? "" : str2;
    }
}
